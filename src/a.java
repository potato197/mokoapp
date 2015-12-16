import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.util.AdUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a
{
  public static final Map<String, i> a;
  public static final Map<String, i> b;
  
  static
  {
    HashMap localHashMap1 = new HashMap();
    localHashMap1.put("/invalidRequest", new o());
    localHashMap1.put("/loadAdURL", new p());
    a = Collections.unmodifiableMap(localHashMap1);
    HashMap localHashMap2 = new HashMap();
    localHashMap2.put("/open", new r());
    localHashMap2.put("/canOpenURLs", new j());
    localHashMap2.put("/close", new l());
    localHashMap2.put("/evalInOpener", new m());
    localHashMap2.put("/log", new q());
    localHashMap2.put("/click", new k());
    localHashMap2.put("/httpTrack", new n());
    localHashMap2.put("/reloadRequest", new s());
    localHashMap2.put("/settings", new t());
    localHashMap2.put("/touch", new u());
    localHashMap2.put("/video", new v());
    b = Collections.unmodifiableMap(localHashMap2);
  }
  
  public static void a(WebView paramWebView)
  {
    com.google.ads.util.a.d("Calling onshow.");
    a(paramWebView, "onshow", "{'version': 'afma-sdk-a-v4.1.0'}");
  }
  
  public static void a(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl("javascript:" + paramString);
  }
  
  private static void a(WebView paramWebView, String paramString1, String paramString2)
  {
    if (paramString2 != null)
    {
      a(paramWebView, "AFMA_ReceiveMessage" + "('" + paramString1 + "', " + paramString2 + ");");
      return;
    }
    a(paramWebView, "AFMA_ReceiveMessage" + "('" + paramString1 + "');");
  }
  
  public static void a(WebView paramWebView, Map<String, Boolean> paramMap)
  {
    a(paramWebView, "openableURLs", new JSONObject(paramMap).toString());
  }
  
  static void a(d paramd, Map<String, i> paramMap, Uri paramUri, WebView paramWebView)
  {
    HashMap localHashMap = AdUtil.b(paramUri);
    if (localHashMap == null)
    {
      com.google.ads.util.a.e("An error occurred while parsing the message parameters.");
      return;
    }
    String str2;
    String str1;
    if (c(paramUri))
    {
      str2 = paramUri.getHost();
      if (str2 == null)
      {
        com.google.ads.util.a.e("An error occurred while parsing the AMSG parameters.");
        str1 = null;
      }
    }
    while (str1 == null)
    {
      com.google.ads.util.a.e("An error occurred while parsing the message.");
      return;
      if (str2.equals("launch"))
      {
        localHashMap.put("a", "intent");
        localHashMap.put("u", localHashMap.get("url"));
        localHashMap.remove("url");
        str1 = "/open";
      }
      else if (str2.equals("closecanvas"))
      {
        str1 = "/close";
      }
      else if (str2.equals("log"))
      {
        str1 = "/log";
      }
      else
      {
        com.google.ads.util.a.e("An error occurred while parsing the AMSG: " + paramUri.toString());
        str1 = null;
        continue;
        if (b(paramUri))
        {
          str1 = paramUri.getPath();
        }
        else
        {
          com.google.ads.util.a.e("Message was neither a GMSG nor an AMSG.");
          str1 = null;
        }
      }
    }
    i locali = (i)paramMap.get(str1);
    if (locali == null)
    {
      com.google.ads.util.a.e("No AdResponse found, <message: " + str1 + ">");
      return;
    }
    locali.a(paramd, localHashMap, paramWebView);
  }
  
  public static boolean a(Uri paramUri)
  {
    if ((paramUri == null) || (!paramUri.isHierarchical())) {}
    while ((!b(paramUri)) && (!c(paramUri))) {
      return false;
    }
    return true;
  }
  
  public static void b(WebView paramWebView)
  {
    com.google.ads.util.a.d("Calling onhide.");
    a(paramWebView, "onhide", null);
  }
  
  private static boolean b(Uri paramUri)
  {
    String str1 = paramUri.getScheme();
    if ((str1 == null) || (!str1.equals("gmsg"))) {}
    String str2;
    do
    {
      return false;
      str2 = paramUri.getAuthority();
    } while ((str2 == null) || (!str2.equals("mobileads.google.com")));
    return true;
  }
  
  private static boolean c(Uri paramUri)
  {
    String str = paramUri.getScheme();
    return (str != null) && (str.equals("admob"));
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     a
 * JD-Core Version:    0.7.0.1
 */