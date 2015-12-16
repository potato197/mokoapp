package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

class eu
{
  static long a = 0L;
  
  static void a(Activity paramActivity, AdView paramAdView)
  {
    try
    {
      int i = paramActivity.getTaskId();
      if (eh.a(i))
      {
        ao.b(paramActivity);
        return;
      }
      long l = System.currentTimeMillis();
      if (l - a < 60000L)
      {
        ao.b(paramActivity);
        return;
      }
      a = l;
      eh.b(i);
      try
      {
        ao.a(paramActivity);
        a(paramActivity);
      }
      catch (Exception localException3)
      {
        try
        {
          fd.a(paramActivity, paramAdView);
        }
        catch (Exception localException3)
        {
          try
          {
            for (;;)
            {
              k.a(paramActivity.getApplicationContext());
              try
              {
                label70:
                ei.a(paramActivity, paramAdView);
                try
                {
                  label75:
                  de.a(paramActivity);
                  return;
                }
                catch (Exception localException6)
                {
                  return;
                }
                localException2 = localException2;
                continue;
                localException3 = localException3;
              }
              catch (Exception localException5)
              {
                break label75;
              }
            }
          }
          catch (Exception localException4)
          {
            break label70;
          }
        }
      }
      return;
    }
    catch (Exception localException1) {}
  }
  
  static void a(Context paramContext)
  {
    int i = 0;
    try
    {
      if (bq.h() == 0)
      {
        f.a("*****");
        f.a("Current sdk version is youmi android sdk " + bq.f());
        f.a("App ID is set to " + er.c());
        f.a("App Sec is set to " + er.e());
      }
      for (;;)
      {
        try
        {
          f.a("App PackageName is set to " + paramContext.getPackageName());
          PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
          if (localPackageInfo != null)
          {
            f.a("App Version code is set to " + localPackageInfo.versionCode);
            f.a("App Version name is set to " + localPackageInfo.versionName);
          }
        }
        catch (Exception localException2)
        {
          Object localObject;
          StringBuilder localStringBuilder;
          String str;
          continue;
        }
        try
        {
          if (!er.a()) {
            continue;
          }
          localObject = "TestMode is set to " + "TRUE";
          f.a((String)localObject);
        }
        catch (Exception localException3)
        {
          continue;
        }
        f.a("Requesting interval is set to " + er.f() + " seconds");
        return;
        if (bq.h() < 0)
        {
          f.a("*");
          break;
        }
        localStringBuilder = new StringBuilder();
        if (i >= bq.h())
        {
          f.a(localStringBuilder.toString());
          break;
        }
        localStringBuilder.append("-");
        i++;
        continue;
        if (eh.e(paramContext))
        {
          localObject = "TestMode is set to " + "FALSE.";
        }
        else
        {
          str = "TestMode is set to " + "FALSE";
          localObject = str;
        }
      }
      return;
    }
    catch (Exception localException1) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.eu
 * JD-Core Version:    0.7.0.1
 */