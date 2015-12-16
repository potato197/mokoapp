package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import java.util.Properties;

class ao
{
  static du a = null;
  static String b = "E2FDAA28C7344D2F9FAA4A0FEC1296AA";
  static String c = "DCDAE4873D1F4c64BB121FDE4131DDFF";
  static String d = "E91A62B2CF0744bd9CA37BA14615050F";
  
  static Properties a(Context paramContext)
  {
    return ax.a(paramContext, b);
  }
  
  static void a(Activity paramActivity)
  {
    try
    {
      a = c(paramActivity);
      d(paramActivity);
      return;
    }
    catch (Exception localException) {}
  }
  
  static void b(Activity paramActivity)
  {
    try
    {
      e(paramActivity);
      return;
    }
    catch (Exception localException) {}
  }
  
  private static du c(Activity paramActivity)
  {
    try
    {
      Properties localProperties = a(paramActivity);
      if (localProperties != null)
      {
        du localdu = new du();
        localdu.a = ax.a(localProperties, c, 0);
        localdu.b = ax.a(localProperties, d, 0);
        return localdu;
      }
    }
    catch (Exception localException) {}
    return new du();
  }
  
  private static boolean d(Activity paramActivity)
  {
    try
    {
      int i = (int)(System.currentTimeMillis() / 1000L);
      Properties localProperties = new Properties();
      localProperties.setProperty(c, i);
      localProperties.setProperty(d, i);
      boolean bool = ax.a(paramActivity, localProperties, b);
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  private static boolean e(Activity paramActivity)
  {
    try
    {
      du localdu = c(paramActivity);
      Properties localProperties = new Properties();
      long l = System.currentTimeMillis() / 1000L;
      if (localdu.c() != 0)
      {
        localProperties.setProperty(c, localdu.c());
        localProperties.setProperty(d, l);
      }
      for (;;)
      {
        return ax.a(paramActivity, localProperties, b);
        localProperties.setProperty(c, l);
        localProperties.setProperty(d, l);
      }
      return false;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ao
 * JD-Core Version:    0.7.0.1
 */