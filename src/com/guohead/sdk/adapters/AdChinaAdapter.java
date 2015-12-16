package com.guohead.sdk.adapters;

import android.app.Activity;
import android.graphics.Color;
import android.os.Handler;
import android.view.Display;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import com.adchina.android.ads.AdEngine;
import com.adchina.android.ads.AdListener;
import com.adchina.android.ads.AdManager;
import com.adchina.android.ads.views.AdView;
import com.adchina.android.ads.views.FullScreenAdView;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Extra;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;

public class AdChinaAdapter
  extends GuoheAdAdapter
  implements AdListener
{
  private AdView adView;
  
  public AdChinaAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public boolean OnRecvSms(AdView paramAdView, String paramString)
  {
    return false;
  }
  
  public void finish()
  {
    Logger.i(getClass().getSimpleName() + "==> finish ");
    this.adView = null;
  }
  
  public void handle()
  {
    Display localDisplay = this.guoheAdLayout.activity.getWindowManager().getDefaultDisplay();
    int i = localDisplay.getWidth();
    int j = localDisplay.getHeight();
    AdManager.setResolution(i + "x" + j);
    AdManager.setAdspaceId(this.ration.key);
    boolean bool1 = true;
    try
    {
      boolean bool2 = Boolean.parseBoolean(this.ration.key2);
      bool1 = bool2;
    }
    catch (Exception localException)
    {
      label81:
      AdEngine localAdEngine;
      Extra localExtra;
      int k;
      break label81;
    }
    localAdEngine = AdEngine.initAdEngine(this.guoheAdLayout.activity);
    localAdEngine.setAdListener(this);
    AdManager.setDebugMode(bool1);
    AdManager.setLogMode(false);
    this.adView = new AdView(this.guoheAdLayout.activity);
    localExtra = this.guoheAdLayout.extra;
    k = Color.argb(localExtra.bgAlpha, localExtra.bgRed, localExtra.bgGreen, localExtra.bgBlue);
    this.adView.setBackgroundColor(k);
    localAdEngine.addBannerAdView(this.adView);
    localAdEngine.startBannerAd();
    this.guoheAdLayout.addView(this.adView, new ViewGroup.LayoutParams(-2, -2));
  }
  
  public void onFailedToPlayVideoAd() {}
  
  public void onFailedToReceiveAd(final AdView paramAdView)
  {
    Logger.d("==========> onFailedToReceiveAd");
    notifyOnFail();
    AdEngine.getAdEngine().setAdListener(null);
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        AdChinaAdapter.this.guoheAdLayout.removeView(paramAdView);
        AdChinaAdapter.this.guoheAdLayout.rollover();
      }
    });
    Logger.addStatus("adchina receive ad fail----");
  }
  
  public void onFailedToReceiveFullScreenAd(FullScreenAdView paramFullScreenAdView) {}
  
  public void onFailedToReceiveVideoAd() {}
  
  public void onFailedToRefreshAd(AdView paramAdView)
  {
    Logger.d("==========> onFailedToRefreshAd");
    Logger.addStatus("adchina failed refresh ad----");
  }
  
  public void onPlayVideoAd() {}
  
  public void onReceiveAd(final AdView paramAdView)
  {
    AdEngine.getAdEngine().setAdListener(null);
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        AdChinaAdapter.this.guoheAdLayout.removeView(paramAdView);
        paramAdView.setVisibility(0);
        AdChinaAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        AdChinaAdapter.this.guoheAdLayout.nextView = paramAdView;
        AdChinaAdapter.this.guoheAdLayout.handler.post(AdChinaAdapter.this.guoheAdLayout.viewRunnable);
        AdChinaAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
    Logger.addStatus("adchina receive ad suc++++");
  }
  
  public void onReceiveFullScreenAd(FullScreenAdView paramFullScreenAdView) {}
  
  public void onRefreshAd(AdView paramAdView)
  {
    Logger.d("========> onRefreshAd");
    Logger.addStatus("adchina receive ad suc++++");
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
    Logger.addStatus("adchina refresh");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.AdChinaAdapter
 * JD-Core Version:    0.7.0.1
 */