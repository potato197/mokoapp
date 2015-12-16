package net.youmi.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

class ef
{
  static PackageInfo a(Context paramContext, String paramString)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageArchiveInfo(paramString, 1);
      return localPackageInfo;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ef
 * JD-Core Version:    0.7.0.1
 */