package net.youmi.android;

import android.util.Log;

class f
{
  static void a(String paramString)
  {
    a("YoumiSdk", paramString);
  }
  
  private static void a(String paramString1, String paramString2)
  {
    try
    {
      if (Log.isLoggable(paramString1, 4)) {
        Log.i(paramString1, paramString2);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  static void a(Throwable paramThrowable) {}
  
  static void b(String paramString)
  {
    b("YoumiSdk", paramString);
  }
  
  private static void b(String paramString1, String paramString2)
  {
    try
    {
      if (Log.isLoggable(paramString1, 6)) {
        Log.e(paramString1, paramString2);
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.f
 * JD-Core Version:    0.7.0.1
 */