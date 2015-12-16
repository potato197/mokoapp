import android.webkit.WebView;
import com.google.ads.util.a;
import java.util.HashMap;

public final class t
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str = (String)paramHashMap.get("applicationTimeout");
    if (str != null) {}
    try
    {
      paramd.a((1000.0F * Float.parseFloat(str)));
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      a.c("Trying to set applicationTimeout to invalid value: " + str, localNumberFormatException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     t
 * JD-Core Version:    0.7.0.1
 */