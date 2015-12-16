package com.guohead.sdk.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.view.ViewGroup.LayoutParams;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Extra;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;
import com.madhouse.android.ads.AdListener;
import com.madhouse.android.ads.AdManager;
import com.madhouse.android.ads.AdView;

public class MadHouseAdapter
  extends GuoheAdAdapter
  implements AdListener
{
  private AdView adView;
  
  public MadHouseAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish()
  {
    Logger.addStatus("MadHouse finish");
    this.adView = null;
  }
  
  public void handle()
  {
    Extra localExtra = this.guoheAdLayout.extra;
    int i = Color.rgb(localExtra.bgRed, localExtra.bgGreen, localExtra.bgBlue);
    AdManager.setApplicationId(this.guoheAdLayout.getContext(), this.ration.key);
    this.adView = new AdView(this.guoheAdLayout.activity, null, 0, this.ration.key2, 900, Boolean.parseBoolean(this.ration.key3));
    this.adView.setBackgroundColor(i);
    this.adView.setListener(this);
    this.guoheAdLayout.addView(this.adView, new ViewGroup.LayoutParams(-2, -2));
  }
  
  public void onAdEvent(AdView paramAdView, int paramInt) {}
  
  public void onAdStatus(int paramInt)
  {
    Logger.d("====> onAdStatus: " + paramInt);
    this.adView.setListener(null);
    if (paramInt != 200)
    {
      notifyOnFail();
      clearAdStateListener();
      this.guoheAdLayout.activity.runOnUiThread(new Runnable()
      {
        public void run()
        {
          MadHouseAdapter.this.guoheAdLayout.removeView(MadHouseAdapter.this.adView);
          MadHouseAdapter.this.guoheAdLayout.rollover();
        }
      });
      Logger.addStatus("MadHouse receive ad failed----");
      return;
    }
    Logger.addStatus("MadHouse receive ad suc++++");
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        Logger.i("-----> run thread");
        MadHouseAdapter.this.guoheAdLayout.removeView(MadHouseAdapter.this.adView);
        MadHouseAdapter.this.adView.setVisibility(0);
        MadHouseAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        MadHouseAdapter.this.guoheAdLayout.nextView = MadHouseAdapter.this.adView;
        MadHouseAdapter.this.guoheAdLayout.handler.post(MadHouseAdapter.this.guoheAdLayout.viewRunnable);
        MadHouseAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.MadHouseAdapter
 * JD-Core Version:    0.7.0.1
 */