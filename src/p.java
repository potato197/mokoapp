import android.webkit.WebView;
import com.google.ads.util.a;
import java.util.HashMap;

public final class p
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("url");
    String str2 = (String)paramHashMap.get("afma_notify_dt");
    a.c("Received ad url: <\"url\": \"" + str1 + "\", \"afmaNotifyDt\": \"" + str2 + "\">");
    c localc = paramd.g();
    if (localc != null) {
      localc.a(str1);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     p
 * JD-Core Version:    0.7.0.1
 */