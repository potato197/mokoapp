package com.google.ads.util;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.Location;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.ads.AdActivity;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AdUtil
{
  private static Boolean a = null;
  private static String b = null;
  private static String c;
  private static AudioManager d;
  private static DisplayMetrics e;
  private static boolean f = true;
  private static boolean g = false;
  private static String h = null;
  
  public static DisplayMetrics a(Activity paramActivity)
  {
    if (e == null)
    {
      e = new DisplayMetrics();
      paramActivity.getWindowManager().getDefaultDisplay().getMetrics(e);
    }
    return e;
  }
  
  public static String a(Context paramContext)
  {
    if (b == null)
    {
      String str1 = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      if ((str1 == null) || (a())) {}
      for (String str2 = a("emulator"); str2 == null; str2 = a(str1)) {
        return null;
      }
      b = str2.toUpperCase();
    }
    return b;
  }
  
  public static String a(Location paramLocation)
  {
    if (paramLocation == null) {
      return null;
    }
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Long.valueOf(1000L * paramLocation.getTime());
    arrayOfObject[1] = Long.valueOf((10000000.0D * paramLocation.getLatitude()));
    arrayOfObject[2] = Long.valueOf((10000000.0D * paramLocation.getLongitude()));
    arrayOfObject[3] = Long.valueOf((1000.0F * paramLocation.getAccuracy()));
    String str = b(String.format("role: 6 producer: 24 historical_role: 1 historical_producer: 12 timestamp: %d latlng < latitude_e7: %d longitude_e7: %d> radius: %d", arrayOfObject));
    return "e1+" + str;
  }
  
  public static String a(String paramString)
  {
    Object localObject = null;
    if (paramString != null)
    {
      int i = paramString.length();
      localObject = null;
      if (i <= 0) {}
    }
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes(), 0, paramString.length());
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = new BigInteger(1, localMessageDigest.digest());
      String str = String.format("%032X", arrayOfObject);
      localObject = str;
      return localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return paramString.substring(0, 32);
  }
  
  public static String a(Map<String, Object> paramMap)
  {
    try
    {
      String str = b(paramMap).toString();
      return str;
    }
    catch (JSONException localJSONException)
    {
      a.c("JsonException in serialization: ", localJSONException);
    }
    return null;
  }
  
  private static JSONArray a(Set<Object> paramSet)
    throws JSONException
  {
    JSONArray localJSONArray = new JSONArray();
    if ((paramSet == null) || (paramSet.isEmpty())) {
      return localJSONArray;
    }
    Iterator localIterator = paramSet.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if (((localObject instanceof String)) || ((localObject instanceof Integer)) || ((localObject instanceof Double)) || ((localObject instanceof Long)) || ((localObject instanceof Float))) {
        localJSONArray.put(localObject);
      } else if ((localObject instanceof Map)) {
        try
        {
          localJSONArray.put(b((Map)localObject));
        }
        catch (ClassCastException localClassCastException2)
        {
          a.c("Unknown map type in json serialization: ", localClassCastException2);
        }
      } else if ((localObject instanceof Set)) {
        try
        {
          localJSONArray.put(a((Set)localObject));
        }
        catch (ClassCastException localClassCastException1)
        {
          a.c("Unknown map type in json serialization: ", localClassCastException1);
        }
      } else {
        a.e("Unknown value in json serialization: " + localObject.toString() + " : " + localObject.getClass().getCanonicalName().toString());
      }
    }
    return localJSONArray;
  }
  
  public static void a(WebView paramWebView)
  {
    String str = i(paramWebView.getContext().getApplicationContext());
    paramWebView.getSettings().setUserAgentString(str);
  }
  
  public static void a(HttpURLConnection paramHttpURLConnection, Context paramContext)
  {
    paramHttpURLConnection.setRequestProperty("User-Agent", i(paramContext));
  }
  
  public static void a(boolean paramBoolean)
  {
    f = paramBoolean;
  }
  
  public static boolean a()
  {
    return ("unknown".equals(Build.BOARD)) && ("generic".equals(Build.DEVICE)) && ("generic".equals(Build.BRAND));
  }
  
  public static boolean a(Uri paramUri)
  {
    String str = paramUri.getScheme();
    return ("http".equalsIgnoreCase(str)) || ("https".equalsIgnoreCase(str));
  }
  
  private static String b(String paramString)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      localCipher.init(1, new SecretKeySpec(new byte[] { 10, 55, -112, -47, -6, 7, 11, 75, -7, -121, 121, 69, 80, -61, 15, 5 }, "AES"));
      byte[] arrayOfByte1 = localCipher.getIV();
      byte[] arrayOfByte2 = localCipher.doFinal(paramString.getBytes());
      byte[] arrayOfByte3 = new byte[arrayOfByte1.length + arrayOfByte2.length];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, arrayOfByte1.length);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte3, arrayOfByte1.length, arrayOfByte2.length);
      String str = b.a(arrayOfByte3);
      return str;
    }
    catch (GeneralSecurityException localGeneralSecurityException) {}
    return null;
  }
  
  public static HashMap<String, String> b(Uri paramUri)
  {
    if (paramUri == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    String str1 = paramUri.getEncodedQuery();
    if (str1 == null) {
      return localHashMap;
    }
    String[] arrayOfString = str1.split("&");
    int i = arrayOfString.length;
    for (int j = 0;; j++)
    {
      if (j >= i) {
        return localHashMap;
      }
      String str2 = arrayOfString[j];
      int k = str2.indexOf('=');
      if (k == -1) {
        break;
      }
      String str3 = str2.substring(0, k);
      String str4 = str2.substring(k + 1);
      localHashMap.put(URLDecoder.decode(str3), URLDecoder.decode(str4));
    }
    return localHashMap;
  }
  
  private static JSONObject b(Map<String, Object> paramMap)
    throws JSONException
  {
    JSONObject localJSONObject = new JSONObject();
    if ((paramMap == null) || (paramMap.isEmpty())) {
      return localJSONObject;
    }
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap.get(str);
      if (((localObject instanceof String)) || ((localObject instanceof Integer)) || ((localObject instanceof Double)) || ((localObject instanceof Long)) || ((localObject instanceof Float))) {
        localJSONObject.put(str, localObject);
      } else if ((localObject instanceof Map)) {
        try
        {
          localJSONObject.put(str, b((Map)localObject));
        }
        catch (ClassCastException localClassCastException2)
        {
          a.c("Unknown map type in json serialization: ", localClassCastException2);
        }
      } else if ((localObject instanceof Set)) {
        try
        {
          localJSONObject.put(str, a((Set)localObject));
        }
        catch (ClassCastException localClassCastException1)
        {
          a.c("Unknown map type in json serialization: ", localClassCastException1);
        }
      } else {
        a.e("Unknown value in json serialization: " + localObject.toString() + " : " + localObject.getClass().getCanonicalName().toString());
      }
    }
    return localJSONObject;
  }
  
  public static boolean b()
  {
    return f;
  }
  
  public static boolean b(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    String str = paramContext.getPackageName();
    if (localPackageManager.checkPermission("android.permission.INTERNET", str) == -1)
    {
      a.b("INTERNET permissions must be enabled in AndroidManifest.xml.");
      return false;
    }
    if (localPackageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", str) == -1)
    {
      a.b("ACCESS_NETWORK_STATE permissions must be enabled in AndroidManifest.xml.");
      return false;
    }
    return true;
  }
  
  public static boolean c(Context paramContext)
  {
    boolean bool1 = false;
    if (a != null) {
      return a.booleanValue();
    }
    ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(new Intent(paramContext, AdActivity.class), 65536);
    boolean bool2 = true;
    if ((localResolveInfo == null) || (localResolveInfo.activityInfo == null)) {
      a.b("Could not find com.google.ads.AdActivity, please make sure it is registered in AndroidManifest.xml.");
    }
    for (;;)
    {
      a = Boolean.valueOf(bool1);
      return bool1;
      if ((0x10 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        a.b("The android:configChanges value of the com.google.ads.AdActivity must include keyboard.");
        bool2 = false;
      }
      if ((0x20 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        a.b("The android:configChanges value of the com.google.ads.AdActivity must include keyboardHidden.");
        bool2 = false;
      }
      if ((0x80 & localResolveInfo.activityInfo.configChanges) == 0)
      {
        a.b("The android:configChanges value of the com.google.ads.AdActivity must include orientation.");
        bool1 = false;
      }
      else
      {
        bool1 = bool2;
      }
    }
  }
  
  public static String d(Context paramContext)
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo == null) {
      return null;
    }
    switch (localNetworkInfo.getType())
    {
    default: 
      return "unknown";
    case 0: 
      return "ed";
    }
    return "wi";
  }
  
  public static String e(Context paramContext)
  {
    if (c == null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      PackageManager localPackageManager = paramContext.getPackageManager();
      List localList1 = localPackageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 65536);
      if ((localList1 == null) || (localList1.size() == 0)) {
        localStringBuilder.append("m");
      }
      List localList2 = localPackageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:com.google")), 65536);
      if ((localList2 == null) || (localList2.size() == 0))
      {
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append("a");
      }
      List localList3 = localPackageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("tel://6509313940")), 65536);
      if ((localList3 == null) || (localList3.size() == 0))
      {
        if (localStringBuilder.length() > 0) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append("t");
      }
      c = localStringBuilder.toString();
    }
    return c;
  }
  
  public static a f(Context paramContext)
  {
    if (d == null) {
      d = (AudioManager)paramContext.getSystemService("audio");
    }
    int i = d.getMode();
    if (a()) {
      return a.e;
    }
    if ((d.isMusicActive()) || (d.isSpeakerphoneOn()) || (i == 2) || (i == 1)) {
      return a.d;
    }
    int j = d.getRingerMode();
    if ((j == 0) || (j == 1)) {
      return a.d;
    }
    return a.b;
  }
  
  public static String g(Context paramContext)
  {
    if (((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getOrientation() == 1) {
      return "l";
    }
    return "p";
  }
  
  public static void h(Context paramContext)
  {
    if (g) {
      return;
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.USER_PRESENT");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    paramContext.registerReceiver(new UserActivityReceiver(), localIntentFilter);
    g = true;
  }
  
  private static String i(Context paramContext)
  {
    if (h == null)
    {
      String str1 = new WebView(paramContext).getSettings().getUserAgentString();
      if ((str1 == null) || (str1.length() == 0) || (str1.equals("Java0")))
      {
        String str2 = System.getProperty("os.name", "Linux");
        String str3 = "Android " + Build.VERSION.RELEASE;
        Locale localLocale = Locale.getDefault();
        String str4 = localLocale.getLanguage().toLowerCase();
        if (str4.length() == 0) {
          str4 = "en";
        }
        String str5 = localLocale.getCountry().toLowerCase();
        if (str5.length() > 0) {
          str4 = str4 + "-" + str5;
        }
        String str6 = Build.MODEL + " Build/" + Build.ID;
        str1 = "Mozilla/5.0 (" + str2 + "; U; " + str3 + "; " + str4 + "; " + str6 + ") AppleWebKit/0.0 (KHTML, like " + "Gecko) Version/0.0 Mobile Safari/0.0";
      }
      h = str1 + " (Mobile; " + "afma-sdk-a-v" + "4.1.0" + ")";
    }
    return h;
  }
  
  public static class UserActivityReceiver
    extends BroadcastReceiver
  {
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if (paramIntent.getAction().equals("android.intent.action.USER_PRESENT")) {
        AdUtil.a(true);
      }
      while (!paramIntent.getAction().equals("android.intent.action.SCREEN_OFF")) {
        return;
      }
      AdUtil.a(false);
    }
  }
  
  public static enum a
  {
    static
    {
      a[] arrayOfa = new a[6];
      arrayOfa[0] = a;
      arrayOfa[1] = b;
      arrayOfa[2] = c;
      arrayOfa[3] = d;
      arrayOfa[4] = e;
      arrayOfa[5] = f;
      g = arrayOfa;
    }
    
    private a() {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.AdUtil
 * JD-Core Version:    0.7.0.1
 */