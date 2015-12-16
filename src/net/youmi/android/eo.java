package net.youmi.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class eo
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      new Thread(new p(this, paramIntent, paramContext)).start();
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.eo
 * JD-Core Version:    0.7.0.1
 */