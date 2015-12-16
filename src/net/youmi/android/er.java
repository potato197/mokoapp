package net.youmi.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

class er
{
  private static boolean a = false;
  private static String b = "";
  private static String c = "";
  private static String d = "";
  private static int e = -1;
  private static long f = 30000L;
  private static int g = 30;
  private static int h = 0;
  private static boolean i = true;
  private static boolean j = true;
  
  static int a(Context paramContext)
  {
    if (e < 0) {}
    try
    {
      e = 100 * paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      label27:
      return e;
    }
    catch (Exception localException)
    {
      break label27;
    }
  }
  
  static void a(int paramInt)
  {
    int k = Math.abs(paramInt);
    g = k;
    f = k * 1000;
  }
  
  static void a(String paramString)
  {
    if (paramString != null)
    {
      String str = paramString.trim();
      if (str.length() > 0)
      {
        c = str;
        b = str.substring(0, 1) + cq.c(str.substring(1));
      }
    }
  }
  
  static void a(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  static boolean a()
  {
    return a;
  }
  
  static String b()
  {
    return b;
  }
  
  static void b(String paramString)
  {
    if (paramString != null)
    {
      String str = paramString.trim();
      if (str.length() > 0) {
        d = str;
      }
    }
  }
  
  static String c()
  {
    return c;
  }
  
  static boolean d()
  {
    try
    {
      if ((b != null) && (b.length() > 0) && (d != null))
      {
        int k = d.length();
        if (k > 0) {
          return true;
        }
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  static String e()
  {
    return d;
  }
  
  static int f()
  {
    return g;
  }
  
  static long g()
  {
    return f;
  }
  
  static int h()
  {
    return h;
  }
  
  static boolean i()
  {
    return i;
  }
  
  static void j()
  {
    i = false;
  }
  
  static void k()
  {
    j = false;
  }
  
  static boolean l()
  {
    return j;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.er
 * JD-Core Version:    0.7.0.1
 */