import android.content.Context;
import android.os.AsyncTask;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.util.AdUtil;
import com.google.ads.util.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.StringTokenizer;

public final class b
  extends AsyncTask<String, Void, Void>
{
  private c a;
  private d b;
  private Context c;
  
  b(c paramc, d paramd, Context paramContext)
  {
    this.a = paramc;
    this.b = paramd;
    this.c = paramContext;
  }
  
  private Void a(String... paramVarArgs)
  {
    String str1 = paramVarArgs[0];
    int i;
    try
    {
      HttpURLConnection localHttpURLConnection;
      for (;;)
      {
        localHttpURLConnection = (HttpURLConnection)new URL(str1).openConnection();
        AdUtil.a(localHttpURLConnection, this.c);
        localHttpURLConnection.setInstanceFollowRedirects(false);
        localHttpURLConnection.connect();
        i = localHttpURLConnection.getResponseCode();
        if ((300 > i) || (i >= 400)) {
          break;
        }
        str1 = localHttpURLConnection.getHeaderField("Location");
        if (str1 == null)
        {
          a.c("Could not get redirect location from a " + i + " redirect.");
          this.a.a(AdRequest.ErrorCode.INTERNAL_ERROR);
          return null;
        }
        a(localHttpURLConnection);
      }
      BufferedReader localBufferedReader;
      StringBuilder localStringBuilder;
      String str2;
      str3 = localStringBuilder.toString();
    }
    catch (MalformedURLException localMalformedURLException)
    {
      a.a("Received malformed ad url from javascript.", localMalformedURLException);
      this.a.a(AdRequest.ErrorCode.INTERNAL_ERROR);
      return null;
      if (i != 200) {
        break label335;
      }
      a(localHttpURLConnection);
      localBufferedReader = new BufferedReader(new InputStreamReader(localHttpURLConnection.getInputStream()), 4096);
      localStringBuilder = new StringBuilder();
      for (;;)
      {
        str2 = localBufferedReader.readLine();
        if (str2 == null) {
          break;
        }
        localStringBuilder.append(str2);
        localStringBuilder.append("\n");
      }
    }
    catch (IOException localIOException)
    {
      a.c("IOException connecting to ad url.", localIOException);
      this.a.a(AdRequest.ErrorCode.NETWORK_ERROR);
      return null;
    }
    String str3;
    a.a("Response content is: " + str3);
    if ((str3 == null) || (str3.trim().length() <= 0))
    {
      a.a("Response message is null or zero length: " + str3);
      this.a.a(AdRequest.ErrorCode.NO_FILL);
      return null;
    }
    this.a.a(str3, str1);
    return null;
    label335:
    if (i == 400)
    {
      a.c("Bad request");
      this.a.a(AdRequest.ErrorCode.INVALID_REQUEST);
      return null;
    }
    a.c("Invalid response code: " + i);
    this.a.a(AdRequest.ErrorCode.INTERNAL_ERROR);
    return null;
  }
  
  private void a(HttpURLConnection paramHttpURLConnection)
  {
    String str1 = paramHttpURLConnection.getHeaderField("X-Afma-Tracking-Urls");
    if (str1 != null)
    {
      StringTokenizer localStringTokenizer = new StringTokenizer(str1);
      while (localStringTokenizer.hasMoreTokens())
      {
        String str5 = localStringTokenizer.nextToken();
        this.b.a(str5);
      }
    }
    b(paramHttpURLConnection);
    String str2 = paramHttpURLConnection.getHeaderField("X-Afma-Refresh-Rate");
    if (str2 != null) {}
    try
    {
      float f2 = Float.parseFloat(str2);
      this.b.a(f2);
      if (!this.b.p()) {
        this.b.d();
      }
      str3 = paramHttpURLConnection.getHeaderField("X-Afma-Interstitial-Timeout");
      if (str3 == null) {}
    }
    catch (NumberFormatException localNumberFormatException2)
    {
      try
      {
        float f1 = Float.parseFloat(str3);
        this.b.a((f1 * 1000.0F));
        str4 = paramHttpURLConnection.getHeaderField("X-Afma-Orientation");
        if (str4 != null)
        {
          if (str4.equals("portrait")) {
            this.b.a(1);
          }
        }
        else
        {
          return;
          localNumberFormatException2 = localNumberFormatException2;
          a.c("Could not get refresh value: " + str2, localNumberFormatException2);
        }
      }
      catch (NumberFormatException localNumberFormatException1)
      {
        String str4;
        do
        {
          for (;;)
          {
            String str3;
            a.c("Could not get timeout value: " + str3, localNumberFormatException1);
          }
        } while (!str4.equals("landscape"));
        this.b.a(0);
      }
    }
  }
  
  private void b(HttpURLConnection paramHttpURLConnection)
  {
    String str1 = paramHttpURLConnection.getHeaderField("X-Afma-Click-Tracking-Urls");
    if (str1 != null)
    {
      StringTokenizer localStringTokenizer = new StringTokenizer(str1);
      while (localStringTokenizer.hasMoreTokens())
      {
        String str2 = localStringTokenizer.nextToken();
        this.b.b(str2);
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     b
 * JD-Core Version:    0.7.0.1
 */