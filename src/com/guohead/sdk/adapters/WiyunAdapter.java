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
import com.wiyun.ad.AdView;
import com.wiyun.ad.AdView.AdListener;

public class WiyunAdapter
  extends GuoheAdAdapter
  implements AdView.AdListener
{
  private AdView adView;
  
  public WiyunAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish()
  {
    Logger.i(getClass().getSimpleName() + "==> finish ");
    Logger.addStatus("wiyun finish()");
    this.adView = null;
  }
  
  public void handle()
  {
    this.adView = new AdView(this.guoheAdLayout.activity);
    try
    {
      this.adView.setResId(this.ration.key);
      this.adView.setListener(this);
      this.adView.setTestAdType(2);
      this.adView.setTestMode(false);
      Extra localExtra = this.guoheAdLayout.extra;
      int i = Color.rgb(localExtra.bgRed, localExtra.bgGreen, localExtra.bgBlue);
      int j = Color.rgb(localExtra.fgRed, localExtra.fgGreen, localExtra.fgBlue);
      this.adView.setBackgroundColor(i);
      this.adView.setTextColor(j);
      this.guoheAdLayout.addView(this.adView, new ViewGroup.LayoutParams(-2, -2));
      this.adView.requestAd();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.guoheAdLayout.rollover();
    }
  }
  
  public void onAdClicked() {}
  
  public void onAdLoadFailed()
  {
    Logger.d("==========> onFailedToReceiveAd");
    notifyOnFail();
    this.adView.setListener(null);
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        WiyunAdapter.this.guoheAdLayout.removeView(WiyunAdapter.this.adView);
        WiyunAdapter.this.guoheAdLayout.rollover();
      }
    });
    Logger.addStatus("wiyun receive ad failed----");
  }
  
  public void onAdLoaded()
  {
    Logger.d("========> Wiyun success");
    this.adView.setListener(null);
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        WiyunAdapter.this.guoheAdLayout.removeView(WiyunAdapter.this.adView);
        WiyunAdapter.this.adView.setVisibility(0);
        WiyunAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        WiyunAdapter.this.guoheAdLayout.nextView = WiyunAdapter.this.adView;
        WiyunAdapter.this.guoheAdLayout.handler.post(WiyunAdapter.this.guoheAdLayout.viewRunnable);
        WiyunAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
    Logger.addStatus("wiyun receive ad suc++++");
  }
  
  public void onExitButtonClicked() {}
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
    Logger.addStatus("wiyun refresh");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.WiyunAdapter
 * JD-Core Version:    0.7.0.1
 */