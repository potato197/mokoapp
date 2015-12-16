package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;

class fd
{
  static void a(Context paramContext, dm paramdm)
  {
    try
    {
      bs localbs = new bs(paramContext, paramdm);
      String[] arrayOfString = new String[1];
      arrayOfString[0] = paramdm.d;
      localbs.execute(arrayOfString);
      return;
    }
    catch (Exception localException) {}
  }
  
  static boolean a(Activity paramActivity, AdView paramAdView)
  {
    try
    {
      if ((er.i()) && (az.a(paramActivity))) {
        paramAdView.post(new eq(paramActivity));
      }
      label26:
      return false;
    }
    catch (Exception localException)
    {
      break label26;
    }
  }
  
  static boolean a(Context paramContext, File paramFile, dm paramdm)
  {
    try
    {
      paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
      PackageInfo localPackageInfo = ef.a(paramContext, paramFile.getPath());
      if (localPackageInfo != null)
      {
        if (localPackageInfo.packageName.equals(paramContext.getPackageName()))
        {
          be.b(paramContext, paramFile.getPath());
          return true;
        }
      }
      else
      {
        ay.b(paramContext, "安装过程出现错误,请稍后重试");
        return false;
      }
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
    return false;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.fd
 * JD-Core Version:    0.7.0.1
 */