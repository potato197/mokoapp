import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import java.util.HashMap;

public final class j
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("urls");
    if (str1 == null)
    {
      com.google.ads.util.a.e("Could not get the urls param from canOpenURLs gmsg.");
      return;
    }
    String[] arrayOfString1 = str1.split(",");
    HashMap localHashMap = new HashMap();
    PackageManager localPackageManager = paramWebView.getContext().getPackageManager();
    int i = arrayOfString1.length;
    int j = 0;
    if (j < i)
    {
      String str2 = arrayOfString1[j];
      String[] arrayOfString2 = str2.split(";", 2);
      String str3 = arrayOfString2[0];
      String str4;
      if (arrayOfString2.length >= 2)
      {
        str4 = arrayOfString2[1];
        label100:
        if (localPackageManager.resolveActivity(new Intent(str4, Uri.parse(str3)), 65536) == null) {
          break label153;
        }
      }
      label153:
      for (boolean bool = true;; bool = false)
      {
        localHashMap.put(str2, Boolean.valueOf(bool));
        j++;
        break;
        str4 = "android.intent.action.VIEW";
        break label100;
      }
    }
    a.a(paramWebView, localHashMap);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     j
 * JD-Core Version:    0.7.0.1
 */