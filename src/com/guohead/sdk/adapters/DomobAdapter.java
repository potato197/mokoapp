package com.guohead.sdk.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import cn.domob.android.ads.DomobAdListener;
import cn.domob.android.ads.DomobAdManager;
import cn.domob.android.ads.DomobAdView;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Extra;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;

public class DomobAdapter
  extends GuoheAdAdapter
  implements DomobAdListener
{
  static int counter = 0;
  private DomobAdView adView;
  
  public DomobAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish()
  {
    this.adView = null;
    Logger.i(getClass().getSimpleName() + "==> finish ");
    Logger.addStatus("Domob finish");
  }
  
  public void handle()
  {
    Logger.i("domob adapter begin");
    try
    {
      DomobAdManager.setPublisherId(this.ration.key);
      if (this.adView == null)
      {
        this.adView = new DomobAdView(this.guoheAdLayout.activity);
        this.adView.setAdListener(this);
      }
      Extra localExtra = this.guoheAdLayout.extra;
      int i = Color.rgb(localExtra.bgRed, localExtra.bgGreen, localExtra.bgBlue);
      int j = Color.rgb(localExtra.fgRed, localExtra.fgGreen, localExtra.fgBlue);
      this.adView.setRequestInterval(600);
      this.adView.setBackgroundColor(i);
      this.adView.setPrimaryTextColor(j);
      this.adView.setKeywords(this.ration.key2);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      boolean bool2;
      label146:
      this.guoheAdLayout.rollover();
      return;
    }
    try
    {
      bool2 = Boolean.parseBoolean(this.ration.key2);
      bool1 = bool2;
    }
    catch (Exception localException)
    {
      bool1 = false;
      break label146;
    }
    DomobAdManager.setIsTestMode(bool1);
    this.adView.requestFreshAd();
    Logger.i("domob adapter end");
  }
  
  public void onFailedToReceiveFreshAd(DomobAdView paramDomobAdView)
  {
    Logger.d("==========> onFailedToReceiveAd");
    notifyOnFail();
    this.adView.setAdListener(null);
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        DomobAdapter.this.guoheAdLayout.removeView(DomobAdapter.this.adView);
        Logger.i("domob adapter onfailedtoreceivefreshad runonuithread before rollover");
        DomobAdapter.this.guoheAdLayout.rollover();
      }
    });
    Logger.addStatus("Domob receive ad failed----");
  }
  
  public void onLandingPageClose() {}
  
  public void onLandingPageOpening() {}
  
  public void onReceivedFreshAd(DomobAdView paramDomobAdView)
  {
    Logger.d("========> Domob success");
    this.adView.setAdListener(null);
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        DomobAdapter.this.guoheAdLayout.removeView(DomobAdapter.this.adView);
        DomobAdapter.this.adView.setVisibility(0);
        DomobAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        DomobAdapter.this.guoheAdLayout.nextView = DomobAdapter.this.adView;
        DomobAdapter.this.guoheAdLayout.handler.post(DomobAdapter.this.guoheAdLayout.viewRunnable);
        DomobAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
    Logger.addStatus("Domob receive ad suc++++");
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
    Logger.addStatus("Domob refresh");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.DomobAdapter
 * JD-Core Version:    0.7.0.1
 */