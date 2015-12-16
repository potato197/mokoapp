package com.google.ads.util;

import android.util.Log;

public final class a
{
  public static void a(String paramString)
  {
    if (a("Ads", 3)) {
      Log.d("Ads", paramString);
    }
  }
  
  public static void a(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 6)) {
      Log.e("Ads", paramString, paramThrowable);
    }
  }
  
  private static boolean a(String paramString, int paramInt)
  {
    if (paramInt >= 5) {}
    for (int i = 1;; i = 0)
    {
      boolean bool1;
      if (i == 0)
      {
        boolean bool2 = Log.isLoggable(paramString, paramInt);
        bool1 = false;
        if (!bool2) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
  }
  
  public static void b(String paramString)
  {
    if (a("Ads", 6)) {
      Log.e("Ads", paramString);
    }
  }
  
  public static void b(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 4)) {
      Log.i("Ads", paramString, paramThrowable);
    }
  }
  
  public static void c(String paramString)
  {
    if (a("Ads", 4)) {
      Log.i("Ads", paramString);
    }
  }
  
  public static void c(String paramString, Throwable paramThrowable)
  {
    if (a("Ads", 5)) {
      Log.w("Ads", paramString, paramThrowable);
    }
  }
  
  public static void d(String paramString)
  {
    if (a("Ads", 2)) {
      Log.v("Ads", paramString);
    }
  }
  
  public static void e(String paramString)
  {
    if (a("Ads", 5)) {
      Log.w("Ads", paramString);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.a
 * JD-Core Version:    0.7.0.1
 */