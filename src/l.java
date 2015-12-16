import android.webkit.WebView;
import com.google.ads.util.a;
import java.util.HashMap;

public final class l
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    if ((paramWebView instanceof g))
    {
      ((g)paramWebView).a();
      return;
    }
    a.b("Trying to close WebView that isn't an AdWebView");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     l
 * JD-Core Version:    0.7.0.1
 */