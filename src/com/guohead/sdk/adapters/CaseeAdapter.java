package com.guohead.sdk.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.view.ViewGroup.LayoutParams;
import com.casee.adsdk.CaseeAdView;
import com.casee.adsdk.CaseeAdView.AdListener;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Extra;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;

public class CaseeAdapter
  extends GuoheAdAdapter
  implements CaseeAdView.AdListener
{
  public CaseeAdView cav;
  public int refreshTime;
  
  public CaseeAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish()
  {
    Logger.i(getClass().getSimpleName() + "==> finish ");
    if (this.cav != null) {
      this.cav.onUnshown();
    }
    this.cav = null;
    Logger.addStatus("casee finish");
  }
  
  public void handle()
  {
    Extra localExtra = this.guoheAdLayout.extra;
    int i = Color.rgb(localExtra.bgRed, localExtra.bgGreen, localExtra.bgBlue);
    int j = Color.rgb(localExtra.fgRed, localExtra.fgGreen, localExtra.fgBlue);
    this.cav = new CaseeAdView(this.guoheAdLayout.activity, this.ration.key, false, 800000, i, j, false);
    this.cav.setListener(this);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
    this.cav.setListener(this);
    this.guoheAdLayout.addView(this.cav, localLayoutParams);
  }
  
  public void onFailedToReceiveAd(final CaseeAdView paramCaseeAdView)
  {
    Logger.d("=======> CaseeAd failure");
    paramCaseeAdView.setListener(null);
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        CaseeAdapter.this.guoheAdLayout.removeView(paramCaseeAdView);
        CaseeAdapter.this.guoheAdLayout.rollover();
      }
    });
    Logger.addStatus("casee receive ad failed----");
  }
  
  public void onFailedToReceiveRefreshAd(CaseeAdView paramCaseeAdView) {}
  
  public void onReceiveAd(final CaseeAdView paramCaseeAdView)
  {
    Logger.out("CASEE onReceiveAd");
    Logger.d("======> CaseeAd success");
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        CaseeAdapter.this.guoheAdLayout.removeView(paramCaseeAdView);
        paramCaseeAdView.setVisibility(0);
        CaseeAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        CaseeAdapter.this.guoheAdLayout.nextView = paramCaseeAdView;
        CaseeAdapter.this.guoheAdLayout.handler.post(CaseeAdapter.this.guoheAdLayout.viewRunnable);
        CaseeAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
    Logger.addStatus("casee receive ad suc++++");
  }
  
  public void onReceiveRefreshAd(CaseeAdView paramCaseeAdView)
  {
    Logger.out("CASEE onReceiveRefreshAd!");
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
    Logger.addStatus("casee refresh");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.CaseeAdapter
 * JD-Core Version:    0.7.0.1
 */