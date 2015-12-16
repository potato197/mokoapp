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
import net.youmi.android.AdManager;
import net.youmi.android.AdView;
import net.youmi.android.AdViewListener;

public class YouMiAdapter
  extends GuoheAdAdapter
  implements AdViewListener
{
  static int counter = 0;
  private AdView adView;
  
  public YouMiAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish()
  {
    Logger.i(getClass().getSimpleName() + "==> finish ");
    Logger.addStatus("youmi finish");
  }
  
  public void handle()
  {
    counter = 1 + counter;
    Extra localExtra = this.guoheAdLayout.extra;
    int i = Color.rgb(localExtra.bgRed, localExtra.bgGreen, localExtra.bgBlue);
    int j = Color.rgb(localExtra.fgRed, localExtra.fgGreen, localExtra.fgBlue);
    Logger.i(i + ", " + j);
    AdManager.init(this.ration.key, this.ration.key2, 200, false);
    this.adView = new AdView(this.guoheAdLayout.activity, i, j, localExtra.bgAlpha);
    this.adView.setAdViewListener(this);
    this.guoheAdLayout.addView(this.adView, new ViewGroup.LayoutParams(-2, -2));
  }
  
  public void onAdViewSwitchedAd(AdView paramAdView)
  {
    Logger.d("========> YouMi success");
    this.adView.setAdViewListener(null);
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        YouMiAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        YouMiAdapter.this.guoheAdLayout.nextView = YouMiAdapter.this.adView;
        YouMiAdapter.this.guoheAdLayout.activeRation = YouMiAdapter.this.ration;
        YouMiAdapter.this.guoheAdLayout.countImpressionThreaded();
        YouMiAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
    Logger.addStatus("youmi receive ad suc++++");
  }
  
  public void onConnectFailed(AdView paramAdView)
  {
    Logger.d("==========> YouMi failure");
    this.adView.setAdViewListener(null);
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        YouMiAdapter.this.guoheAdLayout.removeView(YouMiAdapter.this.adView);
        YouMiAdapter.this.guoheAdLayout.rollover();
      }
    });
    Logger.addStatus("youmi receive ad failed----");
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
    Logger.addStatus("youmi refresh ");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.YouMiAdapter
 * JD-Core Version:    0.7.0.1
 */