package com.guohead.sdk;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import com.guohead.sdk.util.Logger;

public class LocationProvider
{
  public String locationString = ",";
  
  public LocationProvider(Context paramContext)
  {
    try
    {
      LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
      Criteria localCriteria = new Criteria();
      localCriteria.setAccuracy(1);
      localCriteria.setAltitudeRequired(false);
      localCriteria.setBearingRequired(false);
      localCriteria.setCostAllowed(true);
      localCriteria.setPowerRequirement(1);
      updateWithNewLocation(localLocationManager.getLastKnownLocation(localLocationManager.getBestProvider(localCriteria, true)));
      return;
    }
    catch (Exception localException)
    {
      Logger.e(localException.toString());
    }
  }
  
  private void updateWithNewLocation(Location paramLocation)
  {
    if (paramLocation != null)
    {
      double d1 = paramLocation.getLatitude();
      double d2 = paramLocation.getLongitude();
      this.locationString = (d1 + "," + d2);
      return;
    }
    this.locationString = ",";
  }
  
  public String getLocation()
  {
    return this.locationString;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.LocationProvider
 * JD-Core Version:    0.7.0.1
 */