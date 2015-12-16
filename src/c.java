import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.InterstitialAd;
import com.google.ads.util.AdUtil;
import com.google.ads.util.AdUtil.a;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class c
  extends AsyncTask<AdRequest, String, AdRequest.ErrorCode>
{
  String a;
  public String b;
  public AdRequest.ErrorCode c;
  private String d;
  private b e;
  private d f;
  private WebView g;
  private boolean h;
  private boolean i;
  
  public c(d paramd)
  {
    this.f = paramd;
    this.b = null;
    this.a = null;
    this.c = null;
    this.h = false;
    this.i = false;
    Activity localActivity = paramd.e();
    if (localActivity != null)
    {
      this.g = new WebView(localActivity.getApplicationContext());
      this.g.getSettings().setJavaScriptEnabled(true);
      this.g.setWebViewClient(new h(paramd, a.a, false, false));
      AdUtil.a(this.g);
      this.g.setVisibility(8);
      this.g.setWillNotDraw(true);
      this.e = new b(this, paramd, localActivity.getApplicationContext());
      return;
    }
    this.g = null;
    this.e = null;
    com.google.ads.util.a.e("activity was null while trying to create an AdLoader.");
  }
  
  private AdRequest.ErrorCode a(AdRequest... paramVarArgs)
  {
    AdRequest localAdRequest;
    Activity localActivity;
    try
    {
      if ((this.g == null) || (this.e == null))
      {
        com.google.ads.util.a.e("adRequestWebView was null while trying to load an ad.");
        AdRequest.ErrorCode localErrorCode1 = AdRequest.ErrorCode.INTERNAL_ERROR;
        return localErrorCode1;
      }
      localAdRequest = paramVarArgs[0];
      localActivity = this.f.e();
      if (localActivity == null)
      {
        com.google.ads.util.a.e("activity was null while forming an ad request.");
        AdRequest.ErrorCode localErrorCode2 = AdRequest.ErrorCode.INTERNAL_ERROR;
        return localErrorCode2;
      }
    }
    finally {}
    long l1;
    long l2;
    try
    {
      String str = a(localAdRequest, localActivity);
      this.g.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
      l1 = this.f.n();
      l2 = SystemClock.elapsedRealtime();
      AdRequest.ErrorCode localErrorCode11;
      AdRequest.ErrorCode localErrorCode4;
      AdRequest.ErrorCode localErrorCode3;
      AdRequest.ErrorCode localErrorCode12;
      if ((l1 > 0L) && (this.b != null)) {
        break label256;
      }
      com.google.ads.util.a.c("AdLoader timed out after " + l1 + "ms while getting the URL.");
    }
    catch (c.b localb)
    {
      try
      {
        wait(l1);
        if (this.c == null) {
          break label211;
        }
        localErrorCode11 = this.c;
        return localErrorCode11;
      }
      catch (InterruptedException localInterruptedException3)
      {
        com.google.ads.util.a.e("AdLoader InterruptedException while getting the URL: " + localInterruptedException3);
        localErrorCode12 = AdRequest.ErrorCode.INTERNAL_ERROR;
        return localErrorCode12;
      }
      localb = localb;
      com.google.ads.util.a.b("Unable to connect to network.", localb);
      localErrorCode4 = AdRequest.ErrorCode.NETWORK_ERROR;
      return localErrorCode4;
    }
    catch (c.a locala)
    {
      com.google.ads.util.a.b("Caught internal exception.", locala);
      localErrorCode3 = AdRequest.ErrorCode.INTERNAL_ERROR;
      return localErrorCode3;
    }
    label211:
    AdRequest.ErrorCode localErrorCode10 = AdRequest.ErrorCode.NETWORK_ERROR;
    return localErrorCode10;
    label256:
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.b;
    publishProgress(arrayOfString);
    long l3 = SystemClock.elapsedRealtime();
    long l4 = l1 - (l3 - l2);
    if (l4 > 0L) {}
    try
    {
      wait(l4);
      if (this.c != null)
      {
        AdRequest.ErrorCode localErrorCode8 = this.c;
        return localErrorCode8;
      }
    }
    catch (InterruptedException localInterruptedException2)
    {
      com.google.ads.util.a.e("AdLoader InterruptedException while getting the HTML: " + localInterruptedException2);
      AdRequest.ErrorCode localErrorCode9 = AdRequest.ErrorCode.INTERNAL_ERROR;
      return localErrorCode9;
    }
    if (this.a == null)
    {
      com.google.ads.util.a.c("AdLoader timed out after " + l1 + "ms while getting the HTML.");
      AdRequest.ErrorCode localErrorCode7 = AdRequest.ErrorCode.NETWORK_ERROR;
      return localErrorCode7;
    }
    g localg = this.f.i();
    this.f.j().a();
    localg.loadDataWithBaseURL(this.d, this.a, "text/html", "utf-8", null);
    long l5 = SystemClock.elapsedRealtime();
    long l6 = l1 - (l5 - l2);
    if (l6 > 0L) {}
    try
    {
      wait(l6);
      if (this.i) {
        return null;
      }
    }
    catch (InterruptedException localInterruptedException1)
    {
      com.google.ads.util.a.e("AdLoader InterruptedException while loading the HTML: " + localInterruptedException1);
      localg.stopLoading();
      AdRequest.ErrorCode localErrorCode6 = AdRequest.ErrorCode.INTERNAL_ERROR;
      return localErrorCode6;
    }
    localg.stopLoading();
    this.h = true;
    com.google.ads.util.a.c("AdLoader timed out after " + l1 + "ms while loading the HTML.");
    AdRequest.ErrorCode localErrorCode5 = AdRequest.ErrorCode.NETWORK_ERROR;
    return localErrorCode5;
  }
  
  private String a(AdRequest paramAdRequest, Activity paramActivity)
    throws c.a, c.b
  {
    Context localContext = paramActivity.getApplicationContext();
    Map localMap = paramAdRequest.getRequestMap(localContext);
    f localf = this.f.l();
    long l1 = localf.h();
    if (l1 > 0L) {
      localMap.put("prl", Long.valueOf(l1));
    }
    String str1 = localf.g();
    if (str1 != null) {
      localMap.put("ppcl", str1);
    }
    String str2 = localf.f();
    if (str2 != null) {
      localMap.put("pcl", str2);
    }
    long l2 = localf.e();
    if (l2 > 0L) {
      localMap.put("pcc", Long.valueOf(l2));
    }
    localMap.put("preqs", Long.valueOf(f.i()));
    String str3 = localf.j();
    if (str3 != null) {
      localMap.put("pai", str3);
    }
    if (localf.k()) {
      localMap.put("aoi_timeout", "true");
    }
    if (localf.m()) {
      localMap.put("aoi_nofill", "true");
    }
    String str4 = localf.p();
    if (str4 != null) {
      localMap.put("pit", str4);
    }
    localf.a();
    localf.d();
    if ((this.f.f() instanceof InterstitialAd)) {
      localMap.put("format", "interstitial_mb");
    }
    String str7;
    for (;;)
    {
      localMap.put("slotname", this.f.h());
      localMap.put("js", "afma-sdk-a-v4.1.0");
      String str6 = localContext.getPackageName();
      try
      {
        PackageInfo localPackageInfo = localContext.getPackageManager().getPackageInfo(str6, 0);
        int j = localPackageInfo.versionCode;
        localMap.put("msid", localContext.getPackageName());
        localMap.put("app_name", j + ".android." + localContext.getPackageName());
        localMap.put("isu", AdUtil.a(localContext));
        str7 = AdUtil.d(localContext);
        if (str7 != null) {
          break;
        }
        throw new c.b("NETWORK_ERROR");
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        AdSize localAdSize;
        String str5;
        HashMap localHashMap;
        throw new c.a("NameNotFound!");
      }
      localAdSize = this.f.k();
      str5 = localAdSize.toString();
      if (str5 != null)
      {
        localMap.put("format", str5);
      }
      else
      {
        localHashMap = new HashMap();
        localHashMap.put("w", Integer.valueOf(localAdSize.getWidth()));
        localHashMap.put("h", Integer.valueOf(localAdSize.getHeight()));
        localMap.put("ad_frame", localHashMap);
      }
    }
    localMap.put("net", str7);
    String str8 = AdUtil.e(localContext);
    if ((str8 != null) && (str8.length() != 0)) {
      localMap.put("cap", str8);
    }
    localMap.put("u_audio", Integer.valueOf(AdUtil.f(localContext).ordinal()));
    localMap.put("u_so", AdUtil.g(localContext));
    DisplayMetrics localDisplayMetrics = AdUtil.a(paramActivity);
    localMap.put("u_sd", Float.valueOf(localDisplayMetrics.density));
    localMap.put("u_h", Integer.valueOf((int)(localDisplayMetrics.heightPixels / localDisplayMetrics.density)));
    localMap.put("u_w", Integer.valueOf((int)(localDisplayMetrics.widthPixels / localDisplayMetrics.density)));
    localMap.put("hl", Locale.getDefault().getLanguage());
    if (AdUtil.a()) {
      localMap.put("simulator", Integer.valueOf(1));
    }
    String str9 = AdUtil.a(localMap);
    String str10 = "<html><head><script src=\"http://www.gstatic.com/afma/sdk-core-v40.js\"></script><script>AFMA_buildAdURL(" + str9 + ");" + "</script></head><body></body></html>";
    com.google.ads.util.a.c("adRequestUrlHtml: " + str10);
    return str10;
  }
  
  final void a()
  {
    try
    {
      this.i = true;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(AdRequest.ErrorCode paramErrorCode)
  {
    try
    {
      this.c = paramErrorCode;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(String paramString)
  {
    try
    {
      this.b = paramString;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void a(String paramString1, String paramString2)
  {
    try
    {
      this.d = paramString2;
      this.a = paramString1;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  protected final void onCancelled()
  {
    com.google.ads.util.a.a("AdLoader cancelled.");
    this.g.stopLoading();
    this.g.destroy();
    this.e.cancel(false);
  }
  
  private final class a
    extends Exception
  {
    public a(String paramString)
    {
      super();
    }
  }
  
  private final class b
    extends Exception
  {
    public b(String paramString)
    {
      super();
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     c
 * JD-Core Version:    0.7.0.1
 */