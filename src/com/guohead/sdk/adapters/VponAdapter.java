package com.guohead.sdk.adapters;

import android.os.Handler;
import android.util.Log;
import android.widget.RelativeLayout.LayoutParams;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;
import com.vpon.adon.android.AdListener;
import com.vpon.adon.android.AdOnPlatform;
import com.vpon.adon.android.AdView;

public class VponAdapter
  extends GuoheAdAdapter
  implements AdListener
{
  private AdView adView;
  
  public VponAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish()
  {
    Logger.addStatus("vpon finish");
    this.adView = null;
  }
  
  public void handle()
  {
    try
    {
      this.adView = new AdView(this.guoheAdLayout.activity);
      this.adView.setLicenseKey(this.ration.key, AdOnPlatform.CN, true);
      this.adView.setAdListener(this);
      this.guoheAdLayout.addView(this.adView, new RelativeLayout.LayoutParams(-2, -2));
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.guoheAdLayout.rollover();
    }
  }
  
  public void onFailedToRecevieAd(AdView paramAdView)
  {
    Log.i("Guohead SDK", "Vpon: Failed to receive ad");
    paramAdView.setAdListener(null);
    this.guoheAdLayout.removeView(paramAdView);
    this.guoheAdLayout.rolloverThreaded();
    Logger.addStatus("vpon receive ad failed----");
  }
  
  public void onRecevieAd(AdView paramAdView)
  {
    Log.i("Guohead SDK", "Vpon successful++++++++++++++");
    paramAdView.setAdListener(null);
    this.guoheAdLayout.removeView(paramAdView);
    paramAdView.setVisibility(0);
    this.guoheAdLayout.guoheAdManager.resetRollover();
    this.guoheAdLayout.nextView = paramAdView;
    this.guoheAdLayout.handler.post(this.guoheAdLayout.viewRunnable);
    this.guoheAdLayout.rotateThreadedDelayed();
    Logger.addStatus("vpon receive ad suc++++");
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
    Logger.addStatus("refresh");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.VponAdapter
 * JD-Core Version:    0.7.0.1
 */