import android.webkit.WebView;
import com.google.ads.AdActivity;
import com.google.ads.util.a;
import java.util.HashMap;

public final class r
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("a");
    if (str == null)
    {
      a.a("Could not get the action parameter for open GMSG.");
      return;
    }
    if (str.equals("webapp"))
    {
      AdActivity.launchAdActivity(paramd, new e("webapp", paramHashMap));
      return;
    }
    AdActivity.launchAdActivity(paramd, new e("intent", paramHashMap));
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     r
 * JD-Core Version:    0.7.0.1
 */