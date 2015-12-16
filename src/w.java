import android.content.Context;
import com.google.ads.util.AdUtil;
import com.google.ads.util.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class w
  implements Runnable
{
  private Context a;
  private String b;
  
  public w(String paramString, Context paramContext)
  {
    this.b = paramString;
    this.a = paramContext;
  }
  
  public final void run()
  {
    try
    {
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(this.b).openConnection();
      AdUtil.a(localHttpURLConnection, this.a);
      localHttpURLConnection.setInstanceFollowRedirects(true);
      localHttpURLConnection.connect();
      if (localHttpURLConnection.getResponseCode() != 200) {
        a.e("Did not receive HTTP_OK from URL: " + this.b);
      }
      return;
    }
    catch (IOException localIOException)
    {
      a.c("Unable to ping the URL: " + this.b, localIOException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     w
 * JD-Core Version:    0.7.0.1
 */