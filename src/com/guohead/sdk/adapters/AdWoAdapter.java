package com.guohead.sdk.adapters;

import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup.LayoutParams;
import com.adwo.adsdk.AdListener;
import com.adwo.adsdk.AdwoAdView;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;

public class AdWoAdapter
  extends GuoheAdAdapter
  implements AdListener
{
  private AdwoAdView adView;
  public GuoheAdManager guoheAdManager;
  
  public AdWoAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish()
  {
    if (this.adView != null) {
      this.adView.finalize();
    }
    this.adView = null;
    Logger.i(getClass().getSimpleName() + "==> finish ");
    Logger.addStatus("adwo finish");
  }
  
  public void handle()
  {
    this.adView = new AdwoAdView(this.guoheAdLayout.activity, this.ration.key, 4194432, 16711680, Boolean.parseBoolean(this.ration.key2), 300);
    this.adView.setListener(this);
    this.guoheAdLayout.addView(this.adView, new ViewGroup.LayoutParams(-2, -2));
  }
  
  public void onFailedToReceiveAd(AdwoAdView paramAdwoAdView)
  {
    Logger.d("==========> onFailedToReceiveAd");
    notifyOnFail();
    this.adView.setListener(null);
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        AdWoAdapter.this.guoheAdLayout.removeView(AdWoAdapter.this.adView);
        AdWoAdapter.this.guoheAdLayout.rollover();
      }
    });
    Logger.addStatus("adwo receive ad failed----");
  }
  
  public void onFailedToReceiveRefreshedAd(AdwoAdView paramAdwoAdView) {}
  
  public void onReceiveAd(AdwoAdView paramAdwoAdView)
  {
    Logger.d("========> Adwo success");
    this.adView.setListener(null);
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        AdWoAdapter.this.guoheAdLayout.removeView(AdWoAdapter.this.adView);
        AdWoAdapter.this.adView.setVisibility(0);
        AdWoAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        AdWoAdapter.this.guoheAdLayout.nextView = AdWoAdapter.this.adView;
        AdWoAdapter.this.guoheAdLayout.handler.post(AdWoAdapter.this.guoheAdLayout.viewRunnable);
        AdWoAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
    Logger.addStatus("adwo receive ad suc++++");
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.viewRunnable);
    Logger.addStatus("adwo refresh");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.AdWoAdapter
 * JD-Core Version:    0.7.0.1
 */