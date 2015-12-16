import android.content.Context;
import android.webkit.WebView;
import com.google.ads.util.a;
import java.util.HashMap;

public final class n
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("u");
    if (str == null)
    {
      a.e("Could not get URL from click gmsg.");
      return;
    }
    new Thread(new w(str, paramWebView.getContext().getApplicationContext())).start();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     n
 * JD-Core Version:    0.7.0.1
 */