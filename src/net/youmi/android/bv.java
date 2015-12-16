package net.youmi.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

class bv
{
  static boolean a(Context paramContext)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo("com.android.phone", 0);
      boolean bool = false;
      if (localPackageInfo != null) {
        bool = true;
      }
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.bv
 * JD-Core Version:    0.7.0.1
 */