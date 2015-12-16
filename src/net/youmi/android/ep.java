package net.youmi.android;

import android.location.LocationManager;

class ep
  implements Runnable
{
  ep(LocationManager paramLocationManager) {}
  
  public void run()
  {
    try
    {
      this.a.requestLocationUpdates("network", 3000L, 0.0F, ei.a());
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ep
 * JD-Core Version:    0.7.0.1
 */