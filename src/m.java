import android.webkit.WebView;
import com.google.ads.AdActivity;
import java.util.HashMap;

public final class m
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("js");
    if (str == null) {
      com.google.ads.util.a.b("Could not get the JS to evaluate.");
    }
    AdActivity localAdActivity;
    if ((paramWebView instanceof g))
    {
      localAdActivity = ((g)paramWebView).b();
      if (localAdActivity == null) {
        com.google.ads.util.a.b("Could not get the AdActivity from the AdWebView.");
      }
    }
    else
    {
      com.google.ads.util.a.b("Trying to evaluate JS in a WebView that isn't an AdWebView");
      return;
    }
    g localg = localAdActivity.getOpeningAdWebView();
    if (localg == null)
    {
      com.google.ads.util.a.b("Could not get the opening WebView.");
      return;
    }
    a.a(localg, str);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     m
 * JD-Core Version:    0.7.0.1
 */