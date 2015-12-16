package net.youmi.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import org.apache.http.HttpHost;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

class s
{
  private static String a;
  
  static String a()
  {
    if (a == null) {}
    try
    {
      StringBuilder localStringBuilder = new StringBuilder(256);
      localStringBuilder.append("Mozilla/5.0 (Linux; U; Android ");
      localStringBuilder.append(Build.VERSION.RELEASE);
      localStringBuilder.append("; ");
      localStringBuilder.append(eh.a().toLowerCase());
      localStringBuilder.append("; ");
      localStringBuilder.append(eh.b());
      localStringBuilder.append(" Build/");
      localStringBuilder.append(Build.ID);
      localStringBuilder.append(") AppleWebkit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1");
      a = localStringBuilder.toString();
      return a;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
    return "";
  }
  
  static String a(Context paramContext)
  {
    try
    {
      if (dq.e(paramContext))
      {
        NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if ((localNetworkInfo != null) && (localNetworkInfo.isAvailable()))
        {
          if (localNetworkInfo.getType() == 0)
          {
            String str1 = localNetworkInfo.getExtraInfo();
            if (str1 != null)
            {
              Object localObject = str1.trim().toLowerCase();
              if (((String)localObject).length() > 10)
              {
                String str2 = ((String)localObject).substring(0, 10);
                localObject = str2;
              }
              return localObject;
            }
            return "";
          }
          return "wifi";
        }
      }
    }
    catch (Exception localException) {}
    return "";
  }
  
  static DefaultHttpClient a(Context paramContext, ee paramee)
  {
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient(c(paramContext));
    localDefaultHttpClient.setRedirectHandler(new am(paramee));
    return localDefaultHttpClient;
  }
  
  static boolean b(Context paramContext)
  {
    if (!dq.e(paramContext)) {
      return true;
    }
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        boolean bool = localNetworkInfo.isAvailable();
        if (bool) {
          return true;
        }
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  static HttpParams c(Context paramContext)
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpClientParams.setRedirecting(localBasicHttpParams, true);
    HttpProtocolParams.setUserAgent(localBasicHttpParams, a());
    HttpProtocolParams.setContentCharset(localBasicHttpParams, "utf-8");
    HttpProtocolParams.setHttpElementCharset(localBasicHttpParams, "utf-8");
    if (a(paramContext).equals("cmwap")) {
      localBasicHttpParams.setParameter("http.route.default-proxy", new HttpHost("10.0.0.172", 80, null));
    }
    return localBasicHttpParams;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.s
 * JD-Core Version:    0.7.0.1
 */