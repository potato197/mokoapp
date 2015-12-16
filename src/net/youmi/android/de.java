package net.youmi.android;

import android.content.Context;

class de
{
  private static long a = 0L;
  private static long b = 1800000L;
  
  static void a(Context paramContext)
  {
    try
    {
      if (System.currentTimeMillis() - a < b) {
        return;
      }
      new Thread(new fc(paramContext)).start();
      return;
    }
    catch (Exception localException) {}
  }
  
  static boolean a(String paramString1, String paramString2)
  {
    try
    {
      String str1 = ap.a(paramString1, paramString2);
      if (str1 != null)
      {
        String str2 = str1.trim();
        if (str2.length() > 0)
        {
          Class localClass = Class.forName(str2);
          if (localClass != null) {
            return true;
          }
        }
      }
    }
    catch (Exception localException) {}
    return false;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.de
 * JD-Core Version:    0.7.0.1
 */