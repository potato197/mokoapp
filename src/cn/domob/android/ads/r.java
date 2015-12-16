package cn.domob.android.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import org.json.JSONObject;
import org.json.JSONTokener;

final class r
{
  private static String a = "http://r.domob.cn/a/";
  private static int b = 0;
  private static String c = null;
  private static long d = 0L;
  private static long e = 0L;
  private static boolean f = false;
  private i g;
  private g h = null;
  private f i;
  private Context j;
  
  protected r()
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "AD Url:" + a + " | Req Count:" + b);
    }
    this.g = null;
  }
  
  protected static String a(Context paramContext)
  {
    StringBuffer localStringBuffer;
    if (c == null)
    {
      localStringBuffer = new StringBuffer();
      localStringBuffer.append("android");
      localStringBuffer.append(",");
      localStringBuffer.append(",");
      if (Build.VERSION.RELEASE.length() <= 0) {
        break label208;
      }
      localStringBuffer.append(Build.VERSION.RELEASE.replaceAll(",", "_"));
    }
    for (;;)
    {
      localStringBuffer.append(",");
      localStringBuffer.append(",");
      String str1 = Build.MODEL;
      if (str1.length() > 0) {
        localStringBuffer.append(str1.replaceAll(",", "_"));
      }
      localStringBuffer.append(",");
      String str2 = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
      if (str2 != null) {
        localStringBuffer.append(str2.replaceAll(",", "_"));
      }
      localStringBuffer.append(",");
      localStringBuffer.append(",");
      localStringBuffer.append(",");
      c = localStringBuffer.toString();
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "getUserAgent:" + c);
      }
      return c;
      label208:
      localStringBuffer.append("1.5");
    }
  }
  
  protected static String a(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("jstr").append("=").append(paramString);
    String str1 = a(paramContext);
    if (str1 != null) {
      a(localStringBuilder, "ua", str1);
    }
    for (;;)
    {
      String str2 = DomobAdManager.j(paramContext);
      if (str2 != null)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "CID:" + str2);
        }
        a(localStringBuilder, "cid", str2);
      }
      a(localStringBuilder, "idv", DomobAdManager.b(paramContext));
      return localStringBuilder.toString();
      a(localStringBuilder, "ua", "unknown");
    }
  }
  
  private static void a(Context paramContext, StringBuilder paramStringBuilder, String paramString, boolean paramBoolean, j paramj)
  {
    paramStringBuilder.append("rt").append("=").append(paramString);
    String str1 = DomobAdManager.getPublisherId(paramContext);
    if (str1 == null) {
      throw new IllegalStateException("Publisher ID is not set!");
    }
    a(paramStringBuilder, "ipb", str1);
    String str2 = a(paramContext);
    String str5;
    if (str2 != null)
    {
      a(paramStringBuilder, "ua", str2);
      String str3 = Locale.getDefault().getLanguage();
      if (str3 == null) {
        break label333;
      }
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append(str3.toLowerCase());
      String str4 = Locale.getDefault().getCountry();
      if (str4 != null)
      {
        localStringBuffer.append("-");
        localStringBuffer.append(str4.toLowerCase());
      }
      str5 = localStringBuffer.toString();
      label136:
      a(paramStringBuilder, "l", str5);
      if (!paramBoolean) {
        break label340;
      }
      a(paramStringBuilder, "f", "json_data");
    }
    for (;;)
    {
      if ((paramBoolean) && (paramj != null)) {
        a(paramStringBuilder, "num", String.valueOf(paramj.a()));
      }
      a(paramStringBuilder, "e", "UTF-8");
      a(paramStringBuilder, "sdk", "1");
      a(paramStringBuilder, "v", "20110820-android-20110806");
      a(paramStringBuilder, "idv", DomobAdManager.b(paramContext));
      String str6 = DomobAdManager.c(paramContext);
      if (str6 != null)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "current network type:" + str6);
        }
        a(paramStringBuilder, "network", str6);
      }
      String str7 = DomobAdManager.j(paramContext);
      if (str7 != null)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "CID:" + str7);
        }
        a(paramStringBuilder, "cid", str7);
      }
      return;
      a(paramStringBuilder, "ua", "unknown");
      break;
      label333:
      str5 = "zh-cn";
      break label136;
      label340:
      a(paramStringBuilder, "f", "jsonp");
    }
  }
  
  static void a(String paramString)
  {
    if (paramString != null)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "set ad url:" + paramString);
      }
      a = paramString;
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if ((paramString2 != null) && (paramString2.length() != 0)) {}
    try
    {
      paramStringBuilder.append("&").append(URLEncoder.encode(paramString1, "UTF-8")).append("=").append(URLEncoder.encode(paramString2, "UTF-8"));
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private static String b(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    ApplicationInfo localApplicationInfo;
    try
    {
      localApplicationInfo = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 128);
      if (localApplicationInfo == null) {
        return "SDKGetAppNameError";
      }
    }
    catch (Exception localException)
    {
      return "SDKGetAppNameError";
    }
    int k = localApplicationInfo.labelRes;
    if (k != 0) {}
    for (Object localObject = paramContext.getResources().getString(k); localObject != null; localObject = localApplicationInfo.nonLocalizedLabel) {
      return localObject.toString();
    }
    return null;
  }
  
  protected static void b()
  {
    a = "http://r.domob.cn/a/";
    b = 0;
    d = 0L;
    e = 0L;
    f = false;
  }
  
  protected static long c()
  {
    long l = -1L;
    if (b > 0) {
      l = e / b;
    }
    return l;
  }
  
  private static String c(Context paramContext)
  {
    Cursor localCursor = null;
    DomobAdManager.a(paramContext);
    StringBuilder localStringBuilder = new StringBuilder();
    a(paramContext, localStringBuilder, "4", false, null);
    a(localStringBuilder, "ts", String.valueOf(System.currentTimeMillis()));
    for (;;)
    {
      try
      {
        localCursor = c.a(paramContext).b();
        if ((localCursor != null) && (localCursor.getCount() != 0)) {
          continue;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "conf db is empty!");
        }
      }
      catch (Exception localException)
      {
        long l;
        localException.printStackTrace();
        continue;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      return localStringBuilder.toString();
      localCursor.moveToFirst();
      a(localStringBuilder, "lm[config]", localCursor.getString(localCursor.getColumnIndexOrThrow("_conf_ver")));
      a(localStringBuilder, "lm[res]", localCursor.getString(localCursor.getColumnIndexOrThrow("_res_ver")));
      l = c();
      if (l == -1L) {
        l = localCursor.getLong(localCursor.getColumnIndexOrThrow("_avg_time"));
      }
      a(localStringBuilder, "avg", String.valueOf(l));
    }
  }
  
  static String d()
  {
    return a;
  }
  
  protected final g a(f paramf, int paramInt1, int paramInt2)
  {
    this.i = paramf;
    this.j = this.i.k();
    Context localContext = this.j;
    f localf = this.i;
    DomobAdManager.a(localContext);
    StringBuilder localStringBuilder = new StringBuilder();
    a(localContext, localStringBuilder, "1", localf.j(), localf.l());
    long l1 = System.currentTimeMillis();
    a(localStringBuilder, "ts", String.valueOf(l1));
    a(localStringBuilder, "so", DomobAdManager.d(localContext));
    if (paramInt1 > 0)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "handset screen width is " + paramInt1);
      }
      a(localStringBuilder, "sw", String.valueOf(paramInt1));
    }
    if (paramInt2 > 0)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "handset screen height is " + paramInt2);
      }
      a(localStringBuilder, "sh", String.valueOf(paramInt2));
    }
    a(localStringBuilder, "sd", String.valueOf(h.d()));
    if ((DomobAdManager.isTestAllowed(localContext)) && (DomobAdManager.isTestMode(localContext)))
    {
      a(localStringBuilder, "m", "test");
      a(localStringBuilder, "test_action", DomobAdManager.getTestAction());
    }
    a(localStringBuilder, "k", localf.f());
    a(localStringBuilder, "spot", localf.g());
    a(localStringBuilder, "dim", "320x48");
    String str1 = DomobAdManager.i(localContext);
    if (str1 != null)
    {
      a(localStringBuilder, "d[coord]", str1);
      a(localStringBuilder, "d[coord_timestamp]", DomobAdManager.a());
    }
    a(localStringBuilder, "d[pc]", DomobAdManager.getPostalCode());
    a(localStringBuilder, "d[dob]", DomobAdManager.b());
    a(localStringBuilder, "d[gender]", DomobAdManager.getGender());
    a(localStringBuilder, "pb[identifier]", DomobAdManager.k(localContext));
    a(localStringBuilder, "pb[version]", String.valueOf(DomobAdManager.l(localContext)));
    int k = 1 + b;
    b = k;
    if (k == 1) {
      d = l1;
    }
    a(localStringBuilder, "stat[reqs]", String.valueOf(b));
    a(localStringBuilder, "stat[time]", String.valueOf(l1 - d));
    d = l1;
    a(localStringBuilder, "c", "gif,fsi,ltx,iad");
    a(localStringBuilder, "pb[name]", b(localContext));
    String str2;
    if (g.b == null) {
      str2 = "";
    }
    for (;;)
    {
      a(localStringBuilder, "lpkg", str2);
      a(localStringBuilder, "sv", "010300");
      String str3 = localStringBuilder.toString();
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "ad url:" + a + "\nad req:" + str3);
      }
      long l2 = System.currentTimeMillis();
      this.g = a.a(a, null, a(this.j), DomobAdManager.b(this.j), null, 30000, str3);
      this.g.a(this.j);
      byte[] arrayOfByte;
      if (this.g.a()) {
        arrayOfByte = this.g.d();
      }
      try
      {
        str4 = new String(arrayOfByte, "utf-8");
        if (!str4.equals(""))
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "ad resp:" + str4);
          }
          localJSONTokener = new JSONTokener(str4);
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          try
          {
            JSONTokener localJSONTokener;
            JSONObject localJSONObject = new JSONObject(localJSONTokener);
            this.h = g.a(this.i, localJSONObject);
            long l3 = System.currentTimeMillis() - l2;
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "ad response time is:" + l3);
            }
            e = l3 + e;
            return this.h;
            str2 = g.b;
            break;
            localUnsupportedEncodingException = localUnsupportedEncodingException;
            localUnsupportedEncodingException.printStackTrace();
            String str4 = "";
          }
          catch (Exception localException)
          {
            Log.e("DomobSDK", "failed to init ad engine!");
            localException.printStackTrace();
            continue;
          }
          Log.i("DomobSDK", "ad resp is empty!");
        }
      }
    }
  }
  
  protected final i a()
  {
    return this.g;
  }
  
  protected final k a(Context paramContext, f paramf)
  {
    this.i = paramf;
    if (f)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "ignore, it is detecting now");
      }
      return null;
    }
    f = true;
    String str1 = c(paramContext);
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "detector req:" + str1);
    }
    this.g = a.a(a, null, a(paramContext), DomobAdManager.b(paramContext), null, 30000, str1);
    this.g.a(paramContext);
    boolean bool = this.g.a();
    Object localObject = null;
    JSONTokener localJSONTokener;
    if (bool)
    {
      String str2 = new String(this.g.d());
      if (str2.equals("")) {
        break label241;
      }
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "detector resp:" + str2);
      }
      localJSONTokener = new JSONTokener(str2);
    }
    for (;;)
    {
      try
      {
        k localk = k.a(paramContext, new JSONObject(localJSONTokener));
        localObject = localk;
      }
      catch (Exception localException)
      {
        Log.e("DomobSDK", "failed to init detector!");
        localObject = null;
        continue;
      }
      f = false;
      return localObject;
      label241:
      Log.i("DomobSDK", "detector resp is empty!");
      localObject = null;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.r
 * JD-Core Version:    0.7.0.1
 */