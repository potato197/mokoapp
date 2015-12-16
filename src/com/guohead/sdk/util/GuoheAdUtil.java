package com.guohead.sdk.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.guohead.sdk.LocationProvider;
import com.guohead.sdk.obj.Extra;
import java.io.File;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public class GuoheAdUtil
{
  public static final int CUSTOM_TYPE_BANNER = 1;
  public static final int CUSTOM_TYPE_BANNER_INAPP = 3;
  public static final int CUSTOM_TYPE_CHOICE = 5;
  public static final int CUSTOM_TYPE_ICON = 2;
  public static final int CUSTOM_TYPE_ICON_INAPP = 4;
  public static final String GUOHEAD = "Guohead SDK";
  public static String Gender = "UnknowGender";
  public static final int NETWORK_TYPE_4THSCREEN = 13;
  public static final int NETWORK_TYPE_ADCHINA = 97;
  public static final int NETWORK_TYPE_ADMOB = 1;
  public static final int NETWORK_TYPE_ADSENSE = 14;
  public static final int NETWORK_TYPE_ADTOUCH = 91;
  public static final int NETWORK_TYPE_ADWO = 100;
  public static final int NETWORK_TYPE_BAIDU = 19;
  public static final int NETWORK_TYPE_CASEE = 98;
  public static final int NETWORK_TYPE_CUSTOM = 9;
  public static final int NETWORK_TYPE_DOMOB = 92;
  public static final int NETWORK_TYPE_DOUBLECLICK = 15;
  public static final int NETWORK_TYPE_EVENT = 17;
  public static final int NETWORK_TYPE_GENERIC = 16;
  public static final int NETWORK_TYPE_GREYSTRIP = 7;
  public static final int NETWORK_TYPE_GUOHEAD = 10;
  public static final int NETWORK_TYPE_JUMPTAP = 2;
  public static final int NETWORK_TYPE_LIVERAIL = 5;
  public static final int NETWORK_TYPE_LMMOB = 101;
  public static final int NETWORK_TYPE_MADHOUSE = 94;
  public static final int NETWORK_TYPE_MDOTM = 12;
  public static final int NETWORK_TYPE_MEDIALETS = 4;
  public static final int NETWORK_TYPE_MILLENNIAL = 6;
  public static final int NETWORK_TYPE_MOBCLIX = 11;
  public static final int NETWORK_TYPE_QUATTRO = 8;
  public static final int NETWORK_TYPE_VIDEOEGG = 3;
  public static final int NETWORK_TYPE_VPON = 90;
  public static final int NETWORK_TYPE_WIYUN = 93;
  public static final int NETWORK_TYPE_WOOBOO = 96;
  public static final int NETWORK_TYPE_YOUMI = 95;
  public static String SDK;
  public static final int URL_TYPE_CLICK = 3;
  public static final int URL_TYPE_CONFIG = 1;
  public static final int URL_TYPE_CUSTOM = 5;
  public static final int URL_TYPE_CUSTOM_CHOICE_NO = 7;
  public static final int URL_TYPE_CUSTOM_CHOICE_YES = 6;
  public static final int URL_TYPE_FAIL = 4;
  public static final int URL_TYPE_IMPRESSION = 2;
  public static String appKey;
  public static String deviceIDHash;
  public static Extra extra;
  public static String filePath = "/sdcard/.GuoheAd";
  public static final String ghVersion = "v1.6.5";
  public static String locale;
  public static String locationString = ",";
  public static String model;
  public static String network;
  
  static
  {
    deviceIDHash = "00000000000000000000000000000000";
    model = "Unknow Device";
    SDK = "Unknow SDK";
    locale = "zh_CN";
    appKey = "00000000000000000000000000000000";
    network = "UnknowModel";
  }
  
  public static String convertToHex(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    int j;
    if (i < paramArrayOfByte.length) {
      j = 0xF & paramArrayOfByte[i] >>> 4;
    }
    int m;
    label94:
    for (int k = 0;; k = m)
    {
      if ((j >= 0) && (j <= 9)) {
        localStringBuffer.append((char)(j + 48));
      }
      for (;;)
      {
        j = 0xF & paramArrayOfByte[i];
        m = k + 1;
        if (k < 1) {
          break label94;
        }
        i++;
        break;
        localStringBuffer.append((char)(97 + (j - 10)));
      }
      return localStringBuffer.toString();
    }
  }
  
  public static String getAppKey(Context paramContext)
  {
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if (!localApplicationInfo.metaData.containsKey("GH_APPKEY")) {
        break label70;
      }
      appKey = localApplicationInfo.metaData.getString("GH_APPKEY");
      if ((appKey == null) || (appKey.length() != 32))
      {
        appKey = "00000000000000000000000000000000";
        Logger.e("Guohead Key's length does not equals 32 characters");
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label70:
        Logger.v(localException.toString());
      }
    }
    return appKey;
    throw new RuntimeException("GH_APPKEY not found,please set the meta-data GH_APPKEY in AndroidManifest.xml");
  }
  
  public static String getAppVersion(Context paramContext)
  {
    try
    {
      String str = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return str;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localNameNotFoundException.printStackTrace();
    }
    return "1.0";
  }
  
  private static String getDeviceIDHash(Context paramContext)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    String str1 = localTelephonyManager.getDeviceId();
    if ((str1 != null) && (str1.length() > 0)) {
      localStringBuffer.append(str1);
    }
    String str2 = localTelephonyManager.getSubscriberId();
    if ((str2 != null) && (str2.length() > 0)) {
      localStringBuffer.append(str2);
    }
    String str3 = getSerialNum();
    if ((str3 != null) && (str3.length() > 0)) {
      localStringBuffer.append(str3);
    }
    localStringBuffer.append("gh");
    return localStringBuffer.toString();
  }
  
  public static String getLocation(Context paramContext)
  {
    LocationProvider localLocationProvider = new LocationProvider(paramContext);
    return new BASE64Encoder().encode(("GHLocationString:" + localLocationProvider.getLocation()).getBytes());
  }
  
  public static String getNetworkAccessMode(Context paramContext)
  {
    Object localObject;
    try
    {
      if (paramContext.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", paramContext.getPackageName()) != 0) {
        return "Unknown";
      }
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localConnectivityManager == null) {
        return "Unknown";
      }
      NetworkInfo localNetworkInfo = localConnectivityManager.getActiveNetworkInfo();
      localObject = localNetworkInfo.getTypeName().toLowerCase();
      if (!((String)localObject).equals("wifi"))
      {
        String str = localNetworkInfo.getExtraInfo().toLowerCase();
        localObject = str;
      }
    }
    catch (Exception localException)
    {
      Logger.v("getNetworkAccessMode Error");
      localObject = "Unknown";
    }
    while (localObject != null) {
      return localObject;
    }
    return "Unknown";
  }
  
  private static String getSerialNum()
  {
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      String str = (String)localClass.getMethod("get", new Class[] { String.class, String.class }).invoke(localClass, new Object[] { "ro.serialno", "unknown" });
      boolean bool = str.equals("unknown");
      if (bool) {
        str = null;
      }
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static void init(Context paramContext)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      new StringBuffer("android_id").append("GuoheAd");
      deviceIDHash = convertToHex(localMessageDigest.digest(getDeviceIDHash(paramContext).getBytes()));
      model = Build.MODEL;
      SDK = Build.VERSION.RELEASE;
      appKey = getAppKey(paramContext);
      locale = Locale.getDefault().toString();
      network = getNetworkAccessMode(paramContext);
      locationString = getLocation(paramContext);
      mkGHDir();
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      Logger.e(localNoSuchAlgorithmException.toString());
    }
  }
  
  private static void mkGHDir()
  {
    File localFile = new File(filePath);
    try
    {
      if (!new File("/sdcard/").exists())
      {
        Logger.e("SD card doesn't exist");
        return;
      }
      if (!localFile.isDirectory())
      {
        localFile.mkdir();
        return;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public static void setAppKey(String paramString)
  {
    appKey = paramString;
    Logger.addStatus("GHKEY:" + paramString);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.util.GuoheAdUtil
 * JD-Core Version:    0.7.0.1
 */