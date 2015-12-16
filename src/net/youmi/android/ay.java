package net.youmi.android;

import android.content.Context;
import android.widget.Toast;

class ay
{
  static void a(Context paramContext, String paramString)
  {
    a(paramContext, paramString, 0);
  }
  
  static void a(Context paramContext, String paramString, int paramInt)
  {
    try
    {
      Toast.makeText(paramContext, paramString, paramInt).show();
      return;
    }
    catch (Exception localException) {}
  }
  
  static void b(Context paramContext, String paramString)
  {
    a(paramContext, paramString, 1);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ay
 * JD-Core Version:    0.7.0.1
 */