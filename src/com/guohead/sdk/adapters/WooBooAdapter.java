package com.guohead.sdk.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.widget.RelativeLayout.LayoutParams;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Extra;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;
import com.wooboo.adlib_android.AdListener;
import com.wooboo.adlib_android.WoobooAdView;

public class WooBooAdapter
  extends GuoheAdAdapter
  implements AdListener
{
  WoobooAdView ad;
  
  public WooBooAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish()
  {
    Logger.i(getClass().getSimpleName() + "==> finish ");
    Logger.addStatus("wooboo finish");
    this.ad = null;
  }
  
  public void handle()
  {
    Extra localExtra = this.guoheAdLayout.extra;
    int i = Color.rgb(localExtra.bgRed, localExtra.bgGreen, localExtra.bgBlue);
    int j = Color.rgb(localExtra.fgRed, localExtra.fgGreen, localExtra.fgBlue);
    this.ad = new WoobooAdView(this.guoheAdLayout.activity, this.ration.key, i, j, Boolean.parseBoolean(this.ration.key2), 600);
    this.ad.setListener(this);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    this.ad.setLayoutParams(localLayoutParams);
    this.guoheAdLayout.addView(this.ad);
  }
  
  public void onFailedToReceiveAd(final WoobooAdView paramWoobooAdView)
  {
    Logger.d("==========> WoobooAdView failure");
    paramWoobooAdView.setListener(null);
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        WooBooAdapter.this.guoheAdLayout.removeView(paramWoobooAdView);
        WooBooAdapter.this.guoheAdLayout.rollover();
      }
    });
    Logger.addStatus("wooboo receive ad failed----");
  }
  
  public void onNewAd() {}
  
  public void onReceiveAd(final WoobooAdView paramWoobooAdView)
  {
    Logger.d("========> WoobooAdView success");
    paramWoobooAdView.setListener(null);
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        WooBooAdapter.this.guoheAdLayout.removeView(paramWoobooAdView);
        paramWoobooAdView.setVisibility(0);
        WooBooAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        WooBooAdapter.this.guoheAdLayout.nextView = paramWoobooAdView;
        WooBooAdapter.this.guoheAdLayout.handler.post(WooBooAdapter.this.guoheAdLayout.viewRunnable);
        WooBooAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
    Logger.addStatus("wooboo receive ad suc++++");
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
    Logger.addStatus("wooboo refresh ad suc++++");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.WooBooAdapter
 * JD-Core Version:    0.7.0.1
 */