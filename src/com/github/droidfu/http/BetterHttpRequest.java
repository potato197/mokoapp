package com.github.droidfu.http;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.util.Log;
import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

public abstract class BetterHttpRequest
{
  private static final int CONNECTION_TIMEOUT = 10000;
  protected static final String HTTP_CONTENT_TYPE_HEADER = "Content-Type";
  protected static final String HTTP_USER_AGENT = "Android/DroidFu";
  private static final String LOG_TAG = BetterHttpRequest.class.getSimpleName();
  private static final int MAX_CONNECTIONS = 6;
  private static final int MAX_RETRIES = 5;
  private static final String REQUEST_URI_BACKUP = "request_uri_backup";
  private static final int RETRY_SLEEP_TIME_MILLIS = 3000;
  private static Context appContext;
  private static HashMap<String, String> defaultHeaders = new HashMap();
  private static AbstractHttpClient httpClient;
  private List<Integer> expectedStatusCodes = new ArrayList();
  private OAuthConsumer oauthConsumer;
  protected HttpUriRequest request;
  private ResponseHandler<BetterHttpResponse> responseHandler = new ResponseHandler()
  {
    public BetterHttpResponse handleResponse(HttpResponse paramAnonymousHttpResponse)
      throws ClientProtocolException, IOException
    {
      int i = paramAnonymousHttpResponse.getStatusLine().getStatusCode();
      if ((BetterHttpRequest.this.expectedStatusCodes != null) && (!BetterHttpRequest.this.expectedStatusCodes.contains(Integer.valueOf(i)))) {
        throw new HttpResponseException(i, "Unexpected status code: " + i);
      }
      return new BetterHttpResponse(paramAnonymousHttpResponse);
    }
  };
  private HttpRequestRetryHandler retryHandler = new HttpRequestRetryHandler()
  {
    public boolean retryRequest(IOException paramAnonymousIOException, int paramAnonymousInt, HttpContext paramAnonymousHttpContext)
    {
      if (paramAnonymousInt > 5) {
        return false;
      }
      paramAnonymousIOException.printStackTrace();
      Log.d(BetterHttpRequest.class.getSimpleName(), "Retrying " + BetterHttpRequest.this.request.getRequestLine().getUri() + " (tried: " + paramAnonymousInt + " times)");
      RequestWrapper localRequestWrapper = (RequestWrapper)paramAnonymousHttpContext.getAttribute("http.request");
      URI localURI = localRequestWrapper.getURI();
      localRequestWrapper.setURI((URI)paramAnonymousHttpContext.getAttribute("request_uri_backup"));
      if (BetterHttpRequest.this.oauthConsumer != null) {}
      try
      {
        BetterHttpRequest.this.oauthConsumer.sign(localRequestWrapper);
        localRequestWrapper.setURI(localURI);
        return true;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
      return false;
    }
  };
  
  static
  {
    setupHttpClient();
  }
  
  public static BetterHttpRequest get(String paramString)
  {
    return new HttpGet(paramString, defaultHeaders);
  }
  
  public static BetterHttpRequest post(String paramString, HttpEntity paramHttpEntity)
  {
    return new HttpPost(paramString, paramHttpEntity, defaultHeaders);
  }
  
  public static void setContext(Context paramContext)
  {
    if (appContext != null) {
      return;
    }
    appContext = paramContext.getApplicationContext();
    paramContext.registerReceiver(new ConnectionChangedBroadcastReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }
  
  public static void setDefaultHeader(String paramString1, String paramString2)
  {
    defaultHeaders.put(paramString1, paramString2);
  }
  
  public static void setPortForScheme(String paramString, int paramInt)
  {
    Scheme localScheme = new Scheme(paramString, PlainSocketFactory.getSocketFactory(), paramInt);
    httpClient.getConnectionManager().getSchemeRegistry().register(localScheme);
  }
  
  private static void setupHttpClient()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    ConnManagerParams.setTimeout(localBasicHttpParams, 10000L);
    ConnManagerParams.setMaxConnectionsPerRoute(localBasicHttpParams, new ConnPerRouteBean(6));
    ConnManagerParams.setMaxTotalConnections(localBasicHttpParams, 6);
    HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
    HttpProtocolParams.setUserAgent(localBasicHttpParams, "Android/DroidFu");
    SchemeRegistry localSchemeRegistry = new SchemeRegistry();
    localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
    localSchemeRegistry.register(new Scheme("https", PlainSocketFactory.getSocketFactory(), 443));
    httpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
  }
  
  public static void updateProxySettings(Context paramContext)
  {
    HttpParams localHttpParams = httpClient.getParams();
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo == null) {}
    String str;
    int i;
    do
    {
      return;
      if (localNetworkInfo.getType() != 0) {
        break;
      }
      str = Proxy.getDefaultHost();
      i = Proxy.getDefaultPort();
    } while ((str == null) || (i <= -1));
    Log.d(LOG_TAG, "Detected carrier proxy " + str + ":" + i);
    localHttpParams.setParameter("http.route.default-proxy", new HttpHost(str, i));
    return;
    localHttpParams.setParameter("http.route.default-proxy", null);
  }
  
  private void waitAndContinue(Exception paramException, int paramInt1, int paramInt2)
    throws ConnectException
  {
    if (paramInt1 == paramInt2)
    {
      Log.e(LOG_TAG, "request failed after " + paramInt1 + " attempts");
      ConnectException localConnectException = new ConnectException();
      localConnectException.initCause(paramException);
      throw localConnectException;
    }
    paramException.printStackTrace();
    Log.e(LOG_TAG, "request failed, will retry after 3 secs...");
    try
    {
      Thread.sleep(3000L);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  public BetterHttpRequest expecting(Integer... paramVarArgs)
  {
    this.expectedStatusCodes = Arrays.asList(paramVarArgs);
    return this;
  }
  
  public BetterHttpResponse send()
    throws ConnectException
  {
    if (appContext != null) {
      updateProxySettings(appContext);
    }
    BasicHttpContext localBasicHttpContext = new BasicHttpContext();
    localBasicHttpContext.setAttribute("request_uri_backup", this.request.getURI());
    httpClient.setHttpRequestRetryHandler(this.retryHandler);
    int i = 0;
    while (i < 5)
    {
      i++;
      try
      {
        if (this.oauthConsumer != null) {
          this.oauthConsumer.sign(this.request);
        }
        BetterHttpResponse localBetterHttpResponse = (BetterHttpResponse)httpClient.execute(this.request, this.responseHandler, localBasicHttpContext);
        return localBetterHttpResponse;
      }
      catch (Exception localException)
      {
        waitAndContinue(localException, i, 5);
      }
    }
    return null;
  }
  
  public BetterHttpRequest signed(OAuthConsumer paramOAuthConsumer)
    throws OAuthMessageSignerException, OAuthExpectationFailedException
  {
    this.oauthConsumer = paramOAuthConsumer;
    paramOAuthConsumer.sign(unwrap());
    return this;
  }
  
  public HttpUriRequest unwrap()
  {
    return this.request;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.http.BetterHttpRequest
 * JD-Core Version:    0.7.0.1
 */