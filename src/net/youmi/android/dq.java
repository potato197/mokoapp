package net.youmi.android;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import java.lang.reflect.Field;

class dq
{
  static int a(Context paramContext)
  {
    int i = 1;
    try
    {
      if (Integer.parseInt(Build.VERSION.SDK) >= 4)
      {
        ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).applicationInfo;
        Field localField = ApplicationInfo.class.getField("targetSdkVersion");
        if ((localApplicationInfo != null) && (localField != null))
        {
          int j = localField.getInt(localApplicationInfo);
          i = j;
        }
      }
      return i;
    }
    catch (Exception localException) {}
    return i;
  }
  
  static boolean a(Context paramContext, String paramString)
  {
    try
    {
      int i = paramContext.checkCallingOrSelfPermission(paramString);
      if (i == -1) {
        return false;
      }
    }
    catch (Exception localException) {}
    return true;
  }
  
  static boolean b(Context paramContext)
  {
    try
    {
      if (a(paramContext) >= 4)
      {
        boolean bool = a(paramContext, "android.permission.WRITE_EXTERNAL_STORAGE");
        return bool;
      }
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  static boolean c(Context paramContext)
  {
    return a(paramContext, "android.permission.INTERNET");
  }
  
  static boolean d(Context paramContext)
  {
    return a(paramContext, "android.permission.READ_PHONE_STATE");
  }
  
  static boolean e(Context paramContext)
  {
    return a(paramContext, "android.permission.ACCESS_NETWORK_STATE");
  }
  
  static boolean f(Context paramContext)
  {
    return a(paramContext, "android.permission.ACCESS_FINE_LOCATION");
  }
  
  static boolean g(Context paramContext)
  {
    return a(paramContext, "android.permission.ACCESS_COARSE_LOCATION");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dq
 * JD-Core Version:    0.7.0.1
 */