package com.guohead.sdk.adapters;

import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup.LayoutParams;
import com.energysource.szj.embeded.AdListener;
import com.energysource.szj.embeded.AdManager;
import com.energysource.szj.embeded.AdView;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;

public class AdTouchAdapter
  extends GuoheAdAdapter
  implements AdListener
{
  private AdView adView;
  
  public AdTouchAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void failedReceiveAd(AdView paramAdView)
  {
    Logger.d("==========> onFailedToReceiveAd");
    notifyOnFail();
    AdManager.setAdListener(null);
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        AdTouchAdapter.this.guoheAdLayout.removeView(AdTouchAdapter.this.adView);
        AdTouchAdapter.this.guoheAdLayout.rollover();
      }
    });
    Logger.addStatus("adtouch receive ad failed----");
  }
  
  public void finish()
  {
    Logger.i(getClass().getSimpleName() + "==> finish ");
    AdManager.destoryAd();
    Logger.addStatus("adtouch finish");
  }
  
  public void handle()
  {
    try
    {
      AdManager.initAd(this.guoheAdLayout.activity, "");
      this.adView = new AdView(this.guoheAdLayout.activity, 0);
      AdManager.openPermissionJudge();
      AdManager.addAd(102, 1000, 81, 0, 0);
      AdManager.setAdListener(this);
      AdManager.openAllAdView();
      this.guoheAdLayout.addView(this.adView, new ViewGroup.LayoutParams(-1, -2));
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.guoheAdLayout.rollover();
    }
  }
  
  public void receiveAd(final AdView paramAdView)
  {
    Logger.d("========> AdTouch success");
    AdManager.setAdListener(null);
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        AdTouchAdapter.this.guoheAdLayout.removeView(paramAdView);
        paramAdView.setVisibility(0);
        AdTouchAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        AdTouchAdapter.this.guoheAdLayout.nextView = paramAdView;
        AdTouchAdapter.this.guoheAdLayout.handler.post(AdTouchAdapter.this.guoheAdLayout.viewRunnable);
      }
    });
    Logger.addStatus("adtouch receive ad suc++++");
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
    Logger.addStatus("adtouch refresh");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.AdTouchAdapter
 * JD-Core Version:    0.7.0.1
 */