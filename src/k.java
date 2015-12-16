import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.util.a;
import java.util.HashMap;

public final class k
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("u");
    if (str1 == null)
    {
      a.e("Could not get URL from click gmsg.");
      return;
    }
    String str2 = (String)paramHashMap.get("ai");
    paramd.l().a(str2);
    f localf = paramd.l();
    if (localf != null)
    {
      Uri localUri = Uri.parse(str1);
      String str3 = localUri.getHost();
      if ((str3 != null) && (str3.toLowerCase().endsWith(".admob.com")))
      {
        String str4 = localUri.getPath();
        String str5 = null;
        if (str4 != null)
        {
          String[] arrayOfString = str4.split("/");
          int i = arrayOfString.length;
          str5 = null;
          if (i >= 4) {
            str5 = arrayOfString[2] + "/" + arrayOfString[3];
          }
        }
        localf.b(str5);
      }
    }
    new Thread(new w(str1, paramWebView.getContext().getApplicationContext())).start();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     k
 * JD-Core Version:    0.7.0.1
 */