package cn.domob.android.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.util.GregorianCalendar;

public class DomobAdManager
{
  public static final String ACTION_AUDIO = "audio";
  public static final String ACTION_CALL = "call";
  public static final String ACTION_IN_APP = "inapp";
  public static final String ACTION_MAIL = "mail";
  public static final String ACTION_MAP = "map";
  public static final String ACTION_MARKET = "market";
  public static final String ACTION_SMS = "sms";
  public static final String ACTION_URL = "url";
  public static final String ACTION_VIDEO = "video";
  public static final String GENDER_FEMALE = "f";
  public static final String GENDER_MALE = "m";
  public static final String TEST_EMULATOR = "emulator";
  public static final String VAL_SDK_VER = "20110820";
  private static String a;
  private static int b;
  private static String c;
  private static String d;
  private static Boolean e = null;
  private static boolean f = true;
  private static String g;
  private static String h;
  private static String i;
  private static Location j;
  private static boolean k = true;
  private static boolean l = false;
  private static long m = 0L;
  private static String n;
  private static String o;
  private static GregorianCalendar p;
  private static boolean q = false;
  
  protected static long a(long paramLong)
  {
    m = paramLong;
    return paramLong;
  }
  
  protected static Location a(Location paramLocation)
  {
    j = paramLocation;
    return paramLocation;
  }
  
  protected static String a()
  {
    return String.valueOf(m);
  }
  
  protected static void a(Context paramContext)
  {
    try
    {
      boolean bool = q;
      if (bool) {}
      for (;;)
      {
        return;
        q = true;
        try
        {
          localPackageManager = paramContext.getPackageManager();
          if (localPackageManager != null)
          {
            localApplicationInfo = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 128);
            if (localApplicationInfo != null)
            {
              Bundle localBundle = localApplicationInfo.metaData;
              if (localBundle == null) {}
            }
          }
        }
        catch (Exception localException1)
        {
          try
          {
            PackageManager localPackageManager;
            ApplicationInfo localApplicationInfo;
            String str = localApplicationInfo.metaData.getString("DOMOB_PID");
            if ((c == null) && (str != null))
            {
              Log.i("DomobSDK", "Publisher ID read from AndroidManifest.xml is " + str);
              setPublisherId(str);
            }
            if ((e == null) && (localApplicationInfo.metaData.containsKey("DOMOB_TEST_MODE")))
            {
              Boolean localBoolean = Boolean.valueOf(localApplicationInfo.metaData.getBoolean("DOMOB_TEST_MODE", true));
              Log.i("DomobSDK", "Test Mode read from AndroidManifest.xml is " + localBoolean);
              setIsTestMode(localBoolean.booleanValue());
            }
            if (!l) {
              k = localApplicationInfo.metaData.getBoolean("DOMOB_ALLOW_LOCATION", true);
            }
            a = localApplicationInfo.packageName;
            Log.d("DomobSDK", "Application's package name is " + a);
            if (localPackageManager == null) {
              continue;
            }
            PackageInfo localPackageInfo = localPackageManager.getPackageInfo(paramContext.getPackageName(), 0);
            if (localPackageInfo == null) {
              continue;
            }
            b = localPackageInfo.versionCode;
            Log.d("DomobSDK", "Application's version number is " + b);
          }
          catch (Exception localException2)
          {
            Log.e("DomobSDK", "Failed to initialize DomobAdManager! ");
            Log.e("DomobSDK", "DOMOB_PID is missed in AndroidManifest.xml!");
          }
          localException1 = localException1;
          Log.e("DomobSDK", "failed to init DomobAdManager!");
          localException1.printStackTrace();
        }
      }
    }
    finally {}
  }
  
  protected static String b()
  {
    GregorianCalendar localGregorianCalendar = getBirthday();
    String str = null;
    if (localGregorianCalendar != null)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(localGregorianCalendar.get(1));
      arrayOfObject[1] = Integer.valueOf(1 + localGregorianCalendar.get(2));
      arrayOfObject[2] = Integer.valueOf(localGregorianCalendar.get(5));
      str = String.format("%04d%02d%02d", arrayOfObject);
    }
    return str;
  }
  
  protected static String b(Context paramContext)
  {
    if (h == null) {
      if (!n(paramContext)) {
        break label22;
      }
    }
    label22:
    for (h = "-1,-1,emulator";; h = p(paramContext)) {
      return h;
    }
  }
  
  protected static String c(Context paramContext)
  {
    String str;
    if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == -1)
    {
      Log.e("DomobSDK", "Cannot access user's network type.  Permissions are not set.");
      str = "unknown";
    }
    int i1;
    do
    {
      return str;
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo == null) {
        break label73;
      }
      i1 = localNetworkInfo.getType();
      if (i1 != 0) {
        break;
      }
      str = localNetworkInfo.getSubtypeName();
    } while (str != null);
    return "gprs";
    if (i1 == 1) {
      return "wifi";
    }
    label73:
    return "unknown";
  }
  
  protected static boolean c()
  {
    return (t.c(Build.VERSION.SDK)) && (Integer.parseInt(Build.VERSION.SDK) == 3);
  }
  
  protected static String d(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    if ((localDisplay.getOrientation() == 1) || (localDisplay.getOrientation() == 3)) {
      return "h";
    }
    return "v";
  }
  
  protected static float e(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    localDisplay.getMetrics(localDisplayMetrics);
    return localDisplayMetrics.density;
  }
  
  protected static float f(Context paramContext)
  {
    return paramContext.getResources().getDisplayMetrics().density;
  }
  
  protected static int g(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i1 = 0;
    if (localDisplay != null) {
      i1 = localDisplay.getWidth();
    }
    return Math.round(i1 * (e(paramContext) / f(paramContext)));
  }
  
  public static GregorianCalendar getBirthday()
  {
    return p;
  }
  
  public static String getEndpoint()
  {
    return r.d();
  }
  
  public static String getGender()
  {
    return n;
  }
  
  public static String getPostalCode()
  {
    return o;
  }
  
  public static String getPublisherId(Context paramContext)
  {
    if (c == null) {
      a(paramContext);
    }
    return c;
  }
  
  public static String getTestAction()
  {
    return d;
  }
  
  protected static int h(Context paramContext)
  {
    Display localDisplay = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int i1 = 0;
    if (localDisplay != null) {
      i1 = localDisplay.getHeight();
    }
    return Math.round(i1 * (e(paramContext) / f(paramContext)));
  }
  
  protected static String i(Context paramContext)
  {
    Location localLocation = q(paramContext);
    String str = null;
    if (localLocation != null)
    {
      str = localLocation.getLatitude() + "," + localLocation.getLongitude();
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "User coordinates are " + str);
      }
    }
    return str;
  }
  
  public static boolean isTestAllowed(Context paramContext)
  {
    Cursor localCursor = null;
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
        int i1;
        localException.printStackTrace();
        continue;
        f = true;
        continue;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      return f;
      localCursor.moveToFirst();
      i1 = localCursor.getInt(localCursor.getColumnIndexOrThrow("_test_flag"));
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "get test flag from conf db:" + i1);
      }
      if (i1 != 0) {
        continue;
      }
      Log.i("DomobSDK", "test mode is disabled by server!");
      f = false;
    }
  }
  
  public static boolean isTestMode(Context paramContext)
  {
    boolean bool = true;
    if (e == null) {
      a(paramContext);
    }
    if (e != null) {
      bool = e.booleanValue();
    }
    return bool;
  }
  
  protected static String j(Context paramContext)
  {
    Cursor localCursor = null;
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
        String str;
        localException.printStackTrace();
        continue;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      return g;
      localCursor.moveToFirst();
      str = localCursor.getString(localCursor.getColumnIndexOrThrow("_cid"));
      g = str;
      if ((str != null) && (Log.isLoggable("DomobSDK", 3))) {
        Log.d("DomobSDK", "get cid from conf db:" + g);
      }
    }
  }
  
  protected static String k(Context paramContext)
  {
    if (a == null) {
      a(paramContext);
    }
    return a;
  }
  
  protected static int l(Context paramContext)
  {
    if (a == null) {
      a(paramContext);
    }
    return b;
  }
  
  protected static Cursor m(Context paramContext)
  {
    String str = c(paramContext);
    if ((str != null) && (str.equals("wifi")))
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "network is wifi, don't read apn.");
      }
      return null;
    }
    Uri localUri = Uri.parse("content://telephony/carriers/preferapn");
    return paramContext.getContentResolver().query(localUri, null, null, null, null);
  }
  
  private static boolean n(Context paramContext)
  {
    if ((i == null) && (i == null)) {
      i = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
    }
    String str = o(paramContext);
    if (str == null) {}
    for (boolean bool = true; (i == null) && (bool) && ("sdk".equalsIgnoreCase(Build.MODEL)); bool = str.replaceAll("0", "").equals("")) {
      return true;
    }
    return false;
  }
  
  private static String o(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
  }
  
  /* Error */
  private static String p(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 502	java/lang/StringBuffer
    //   5: dup
    //   6: invokespecial 503	java/lang/StringBuffer:<init>	()V
    //   9: astore_2
    //   10: aload_0
    //   11: invokestatic 473	cn/domob/android/ads/DomobAdManager:o	(Landroid/content/Context;)Ljava/lang/String;
    //   14: astore 10
    //   16: aload 10
    //   18: ifnull +126 -> 144
    //   21: aload_2
    //   22: aload 10
    //   24: invokevirtual 506	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   27: pop
    //   28: aload_2
    //   29: ldc_w 382
    //   32: invokevirtual 506	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   35: pop
    //   36: aload_0
    //   37: ldc_w 493
    //   40: invokevirtual 263	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   43: checkcast 495	android/telephony/TelephonyManager
    //   46: invokevirtual 509	android/telephony/TelephonyManager:getSubscriberId	()Ljava/lang/String;
    //   49: astore 13
    //   51: aload 13
    //   53: ifnull +123 -> 176
    //   56: aload_2
    //   57: aload 13
    //   59: invokevirtual 506	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   62: pop
    //   63: aload_2
    //   64: ldc_w 382
    //   67: invokevirtual 506	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   70: pop
    //   71: aload_0
    //   72: invokestatic 397	cn/domob/android/ads/c:a	(Landroid/content/Context;)Lcn/domob/android/ads/c;
    //   75: invokevirtual 400	cn/domob/android/ads/c:b	()Landroid/database/Cursor;
    //   78: astore 16
    //   80: aload 16
    //   82: astore 4
    //   84: aload 4
    //   86: ifnull +13 -> 99
    //   89: aload 4
    //   91: invokeinterface 405 1 0
    //   96: ifne +102 -> 198
    //   99: ldc 129
    //   101: iconst_3
    //   102: invokestatic 389	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   105: ifeq +217 -> 322
    //   108: ldc 129
    //   110: ldc_w 407
    //   113: invokestatic 189	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   116: pop
    //   117: aload 4
    //   119: ifnull +10 -> 129
    //   122: aload 4
    //   124: invokeinterface 410 1 0
    //   129: aload_1
    //   130: ifnull +141 -> 271
    //   133: aload_2
    //   134: aload_1
    //   135: invokevirtual 506	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   138: pop
    //   139: aload_2
    //   140: invokevirtual 510	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   143: areturn
    //   144: aload_2
    //   145: ldc_w 512
    //   148: invokevirtual 506	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   151: pop
    //   152: goto -124 -> 28
    //   155: astore 7
    //   157: aconst_null
    //   158: astore 8
    //   160: ldc 129
    //   162: ldc_w 514
    //   165: invokestatic 209	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   168: pop
    //   169: aload 8
    //   171: astore 4
    //   173: goto -56 -> 117
    //   176: aload_2
    //   177: ldc_w 512
    //   180: invokevirtual 506	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   183: pop
    //   184: goto -121 -> 63
    //   187: astore_3
    //   188: aconst_null
    //   189: astore 4
    //   191: aload_3
    //   192: invokevirtual 212	java/lang/Exception:printStackTrace	()V
    //   195: goto -78 -> 117
    //   198: aload 4
    //   200: invokeinterface 413 1 0
    //   205: pop
    //   206: aload 4
    //   208: aload 4
    //   210: ldc_w 516
    //   213: invokeinterface 418 2 0
    //   218: invokeinterface 433 2 0
    //   223: astore 21
    //   225: aload 21
    //   227: astore 18
    //   229: ldc 129
    //   231: iconst_3
    //   232: invokestatic 389	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   235: ifeq +30 -> 265
    //   238: ldc 129
    //   240: new 131	java/lang/StringBuilder
    //   243: dup
    //   244: invokespecial 132	java/lang/StringBuilder:<init>	()V
    //   247: ldc_w 518
    //   250: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: aload 18
    //   255: invokevirtual 138	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokestatic 189	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   264: pop
    //   265: aload 18
    //   267: astore_1
    //   268: goto -151 -> 117
    //   271: aload_2
    //   272: ldc_w 512
    //   275: invokevirtual 506	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   278: pop
    //   279: goto -140 -> 139
    //   282: astore_3
    //   283: aconst_null
    //   284: astore_1
    //   285: goto -94 -> 191
    //   288: astore 23
    //   290: aload 18
    //   292: astore_1
    //   293: aload 23
    //   295: astore_3
    //   296: goto -105 -> 191
    //   299: astore 17
    //   301: aload 4
    //   303: astore 8
    //   305: aconst_null
    //   306: astore_1
    //   307: goto -147 -> 160
    //   310: astore 22
    //   312: aload 18
    //   314: astore_1
    //   315: aload 4
    //   317: astore 8
    //   319: goto -159 -> 160
    //   322: aconst_null
    //   323: astore 18
    //   325: goto -60 -> 265
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	328	0	paramContext	Context
    //   1	314	1	localObject1	Object
    //   9	263	2	localStringBuffer	java.lang.StringBuffer
    //   187	5	3	localException1	Exception
    //   282	1	3	localException2	Exception
    //   295	1	3	localObject2	Object
    //   82	234	4	localObject3	Object
    //   155	1	7	localSecurityException1	java.lang.SecurityException
    //   158	160	8	localObject4	Object
    //   14	9	10	str1	String
    //   49	9	13	str2	String
    //   78	3	16	localCursor	Cursor
    //   299	1	17	localSecurityException2	java.lang.SecurityException
    //   227	97	18	str3	String
    //   223	3	21	str4	String
    //   310	1	22	localSecurityException3	java.lang.SecurityException
    //   288	6	23	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   10	16	155	java/lang/SecurityException
    //   21	28	155	java/lang/SecurityException
    //   28	51	155	java/lang/SecurityException
    //   56	63	155	java/lang/SecurityException
    //   63	80	155	java/lang/SecurityException
    //   144	152	155	java/lang/SecurityException
    //   176	184	155	java/lang/SecurityException
    //   10	16	187	java/lang/Exception
    //   21	28	187	java/lang/Exception
    //   28	51	187	java/lang/Exception
    //   56	63	187	java/lang/Exception
    //   63	80	187	java/lang/Exception
    //   144	152	187	java/lang/Exception
    //   176	184	187	java/lang/Exception
    //   89	99	282	java/lang/Exception
    //   99	117	282	java/lang/Exception
    //   198	225	282	java/lang/Exception
    //   229	265	288	java/lang/Exception
    //   89	99	299	java/lang/SecurityException
    //   99	117	299	java/lang/SecurityException
    //   198	225	299	java/lang/SecurityException
    //   229	265	310	java/lang/SecurityException
  }
  
  private static Location q(Context paramContext)
  {
    int i1 = 1;
    if ((n(paramContext)) || (!k))
    {
      Log.i("DomobSDK", "Location information is not being used for ad requests.");
      return null;
    }
    if ((k) && (paramContext != null) && ((j == null) || (System.currentTimeMillis() > 9000000L + m))) {}
    for (;;)
    {
      try
      {
        m = System.currentTimeMillis();
        if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
          break label352;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "Trying to get locations from the network.");
        }
        localLocationManager = (LocationManager)paramContext.getSystemService("location");
        if (localLocationManager == null) {
          break label343;
        }
        Criteria localCriteria2 = new Criteria();
        localCriteria2.setAccuracy(2);
        localCriteria2.setCostAllowed(false);
        str1 = localLocationManager.getBestProvider(localCriteria2, true);
        i2 = i1;
        if ((str1 != null) || (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0)) {
          break label333;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "Trying to get locations from GPS.");
        }
        localLocationManager = (LocationManager)paramContext.getSystemService("location");
        if (localLocationManager == null) {
          break label326;
        }
        Criteria localCriteria1 = new Criteria();
        localCriteria1.setAccuracy(1);
        localCriteria1.setCostAllowed(false);
        str2 = localLocationManager.getBestProvider(localCriteria1, true);
        if (i1 == 0)
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "Cannot access user's location.  Permissions are not set.");
          }
          return j;
        }
        if (str2 == null)
        {
          if (!Log.isLoggable("DomobSDK", 3)) {
            continue;
          }
          Log.d("DomobSDK", "No location providers are available.  Ads will not be geotargeted.");
          continue;
        }
        if (!Log.isLoggable("DomobSDK", 3)) {
          break label301;
        }
      }
      finally {}
      Log.d("DomobSDK", "Location provider setup successfully.");
      label301:
      localLocationManager.requestLocationUpdates(str2, 0L, 0.0F, new a(localLocationManager), paramContext.getMainLooper());
      continue;
      label326:
      String str2 = str1;
      continue;
      label333:
      i1 = i2;
      str2 = str1;
      continue;
      label343:
      int i2 = i1;
      String str1 = null;
      continue;
      label352:
      LocationManager localLocationManager = null;
      i2 = 0;
      str1 = null;
    }
  }
  
  public static void setAllowUseOfLocation(boolean paramBoolean)
  {
    l = true;
    k = paramBoolean;
  }
  
  public static void setBirthday(int paramInt1, int paramInt2, int paramInt3)
  {
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    localGregorianCalendar.set(paramInt1, paramInt2 - 1, paramInt3);
    setBirthday(localGregorianCalendar);
  }
  
  public static void setBirthday(GregorianCalendar paramGregorianCalendar)
  {
    p = paramGregorianCalendar;
  }
  
  public static void setEndpoint(String paramString)
  {
    r.a(paramString);
  }
  
  public static void setGender(String paramString)
  {
    n = paramString;
  }
  
  public static void setIsTestMode(boolean paramBoolean)
  {
    e = Boolean.valueOf(paramBoolean);
  }
  
  public static void setPostalCode(String paramString)
  {
    o = paramString;
  }
  
  public static void setPublisherId(String paramString)
  {
    if ((paramString == null) || ((paramString != null) && (paramString.length() == 0)))
    {
      Log.e("DomobSDK", "Incorrect Domob publisher ID.");
      return;
    }
    c = paramString;
  }
  
  public static void setTestAction(String paramString)
  {
    if (paramString != null) {
      d = paramString;
    }
  }
  
  public static final class a
    implements LocationListener
  {
    private LocationManager a;
    
    a(LocationManager paramLocationManager)
    {
      this.a = paramLocationManager;
    }
    
    public final void onLocationChanged(Location paramLocation)
    {
      DomobAdManager.a(paramLocation);
      DomobAdManager.a(System.currentTimeMillis());
      this.a.removeUpdates(this);
    }
    
    public final void onProviderDisabled(String paramString) {}
    
    public final void onProviderEnabled(String paramString) {}
    
    public final void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.DomobAdManager
 * JD-Core Version:    0.7.0.1
 */