package net.youmi.android;

import android.content.Context;
import android.os.Environment;

class az
{
  static boolean a()
  {
    String str = Environment.getExternalStorageState();
    return (str.equals("mounted")) || (str.equals("mounted_ro"));
  }
  
  static boolean a(Context paramContext)
  {
    try
    {
      if (Environment.getExternalStorageState().equals("mounted"))
      {
        boolean bool = dq.b(paramContext);
        if (bool) {
          return true;
        }
      }
    }
    catch (Exception localException) {}
    return false;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.az
 * JD-Core Version:    0.7.0.1
 */