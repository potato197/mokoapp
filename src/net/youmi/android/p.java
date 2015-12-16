package net.youmi.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

class p
  implements Runnable
{
  p(eo parameo, Intent paramIntent, Context paramContext) {}
  
  public void run()
  {
    try
    {
      String str1 = this.b.getData().getSchemeSpecificPart();
      if (str1 != null)
      {
        String str2 = this.b.getAction();
        k.a(this.c, str1, str2);
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.p
 * JD-Core Version:    0.7.0.1
 */