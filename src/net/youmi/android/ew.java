package net.youmi.android;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

class ew
  implements LocationListener
{
  private Context a;
  
  public ew(Context paramContext)
  {
    if (paramContext == null) {
      throw new NullPointerException();
    }
    this.a = paramContext;
  }
  
  private void a()
  {
    try
    {
      LocationManager localLocationManager = (LocationManager)this.a.getSystemService("location");
      if (localLocationManager != null) {
        localLocationManager.removeUpdates(this);
      }
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  public void onLocationChanged(Location paramLocation)
  {
    if (paramLocation != null) {}
    try
    {
      if ((paramLocation.getLatitude() != 0.0D) || (paramLocation.getLongitude() != 0.0D))
      {
        ei.a(paramLocation);
        a();
      }
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  public void onProviderDisabled(String paramString) {}
  
  public void onProviderEnabled(String paramString) {}
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ew
 * JD-Core Version:    0.7.0.1
 */