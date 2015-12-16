package net.youmi.android;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Hashtable;

class k
{
  static Hashtable a;
  static eo b;
  
  static bw a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    PackageInfo localPackageInfo1;
    bw localbw;
    PackageInfo localPackageInfo2;
    label163:
    try
    {
      localPackageInfo1 = paramContext.getPackageManager().getPackageArchiveInfo(paramString1, 1);
      if (localPackageInfo1 != null)
      {
        localbw = new bw();
        localbw.a = paramString5;
        localbw.b = paramString2;
        localbw.d = paramString4;
        localbw.c = paramString3;
        ct localct1 = new ct();
        localct1.a = localPackageInfo1.packageName;
        localct1.c = localPackageInfo1.versionCode;
        localct1.b = localPackageInfo1.versionName;
        localbw.f = localct1;
      }
    }
    catch (Exception localException1) {}
    try
    {
      localPackageInfo2 = paramContext.getPackageManager().getPackageInfo(localPackageInfo1.packageName, 0);
      if (localPackageInfo2 != null)
      {
        ct localct2 = new ct();
        localct2.a = localPackageInfo2.packageName;
        localct2.c = localPackageInfo2.versionCode;
        localct2.b = localPackageInfo2.versionName;
        localbw.e = localct2;
      }
    }
    catch (Exception localException2)
    {
      break label163;
    }
    if (a == null) {
      a = new Hashtable(20);
    }
    if (!a.containsKey(localPackageInfo1.packageName)) {
      a.put(localPackageInfo1.packageName, localbw);
    }
    return localbw;
    return null;
  }
  
  static void a(Context paramContext)
  {
    try
    {
      IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
      localIntentFilter.addAction("android.intent.action.PACKAGE_INSTALL");
      localIntentFilter.addDataScheme("package");
      if (b == null) {
        b = new eo();
      }
      paramContext.registerReceiver(b, localIntentFilter);
      return;
    }
    catch (Exception localException) {}
  }
  
  static void a(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {}
    for (;;)
    {
      try
      {
        Hashtable localHashtable = a;
        if (localHashtable != null) {
          continue;
        }
      }
      catch (Exception localException1)
      {
        try
        {
          bw localbw;
          f.a(localException1);
        }
        catch (Exception localException2)
        {
          f.a(localException2);
        }
        continue;
      }
      finally {}
      return;
      if (a.containsKey(paramString1))
      {
        localbw = (bw)a.get(paramString1);
        if (localbw != null) {
          try
          {
            boolean bool = paramString2.equals("android.intent.action.PACKAGE_ADDED");
            if (bool)
            {
              try
              {
                PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramString1, 0);
                if (localPackageInfo != null)
                {
                  ct localct = new ct();
                  localct.a = localPackageInfo.packageName;
                  localct.c = localPackageInfo.versionCode;
                  localct.b = localPackageInfo.versionName;
                  localbw.g = localct;
                  a(paramContext, localbw, 4);
                }
              }
              catch (Exception localException5)
              {
                f.a(localException5);
                continue;
              }
              try
              {
                paramContext.startActivity(paramContext.getPackageManager().getLaunchIntentForPackage(paramString1));
              }
              catch (Exception localException6) {}
            }
          }
          catch (Exception localException4) {}
        } else {
          try
          {
            a.remove(paramString1);
          }
          catch (Exception localException3) {}
        }
      }
    }
  }
  
  static void a(Context paramContext, bw parambw, int paramInt)
  {
    try
    {
      new Thread(new es(paramContext, parambw, paramInt)).start();
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  static void b(Context paramContext, bw parambw, int paramInt)
  {
    int i = 2;
    if (parambw == null) {
      return;
    }
    String str1;
    int j;
    String str2;
    int k;
    String str3;
    int m;
    String str5;
    String str4;
    if (parambw.f != null)
    {
      if (parambw.e != null) {
        i = 1;
      }
    }
    else
    {
      ct localct1 = parambw.e;
      str1 = null;
      j = 0;
      str2 = null;
      if (localct1 != null)
      {
        j = parambw.e.c;
        str2 = parambw.e.b;
        str1 = parambw.e.a;
      }
      ct localct2 = parambw.f;
      k = 0;
      str3 = null;
      if (localct2 != null)
      {
        k = parambw.f.c;
        str3 = parambw.f.b;
        str1 = parambw.f.a;
      }
      if (parambw.g == null) {
        break label190;
      }
      m = parambw.g.c;
      str5 = parambw.g.b;
      str4 = parambw.g.a;
    }
    for (;;)
    {
      av.a(paramContext, paramInt, i, j, k, m, parambw.a, str4, str2, str3, str5, parambw.c, parambw.d, parambw.b);
      return;
      i = 0;
      break;
      label190:
      str4 = str1;
      m = 0;
      str5 = null;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.k
 * JD-Core Version:    0.7.0.1
 */