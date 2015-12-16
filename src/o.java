import android.webkit.WebView;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.util.a;
import java.util.HashMap;

public final class o
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("type");
    String str2 = (String)paramHashMap.get("errors");
    a.e("Invalid " + str1 + " request error: " + str2);
    c localc = paramd.g();
    if (localc != null) {
      localc.a(AdRequest.ErrorCode.INVALID_REQUEST);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     o
 * JD-Core Version:    0.7.0.1
 */