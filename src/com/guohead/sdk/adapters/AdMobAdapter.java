package com.guohead.sdk.adapters;

import android.os.Handler;
import android.view.ViewGroup.LayoutParams;
import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;
import java.util.HashSet;
import java.util.Set;

public class AdMobAdapter
  extends GuoheAdAdapter
  implements AdListener
{
  private AdRequest adRequest;
  private AdView adView;
  private Set<String> keywords;
  
  public AdMobAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish()
  {
    this.adView = null;
  }
  
  public void handle()
  {
    try
    {
      if (this.ration.key2 != null)
      {
        this.keywords = new HashSet();
        String[] arrayOfString = this.ration.key2.split(",");
        for (int i = 0; i < arrayOfString.length; i++) {
          this.keywords.add(arrayOfString[i]);
        }
      }
      this.adRequest = new AdRequest();
      this.adRequest.setKeywords(this.keywords);
      this.adView = new AdView(this.guoheAdLayout.activity, AdSize.BANNER, this.ration.key);
      this.adView.setAdListener(this);
      this.adView.loadAd(this.adRequest);
      this.guoheAdLayout.addView(this.adView, new ViewGroup.LayoutParams(-2, -2));
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      this.guoheAdLayout.rollover();
    }
  }
  
  public void onDismissScreen(Ad paramAd) {}
  
  public void onFailedToReceiveAd(Ad paramAd, AdRequest.ErrorCode paramErrorCode)
  {
    Logger.d("=======> AdMob failure: +  errorCode + ");
    AdView localAdView = (AdView)paramAd;
    localAdView.setAdListener(null);
    this.guoheAdLayout.removeView(localAdView);
    this.guoheAdLayout.rolloverThreaded();
    Logger.addStatus("admob receive ad failed----");
  }
  
  public void onFailedToReceiveRefreshedAd(AdView paramAdView) {}
  
  public void onLeaveApplication(Ad paramAd) {}
  
  public void onPresentScreen(Ad paramAd) {}
  
  public void onReceiveAd(Ad paramAd)
  {
    Logger.d("========> AdMob success");
    AdView localAdView = (AdView)paramAd;
    localAdView.setAdListener(null);
    this.guoheAdLayout.removeView(localAdView);
    localAdView.setVisibility(0);
    this.guoheAdLayout.guoheAdManager.resetRollover();
    this.guoheAdLayout.nextView = localAdView;
    this.guoheAdLayout.handler.post(this.guoheAdLayout.viewRunnable);
    this.guoheAdLayout.rotateThreadedDelayed();
    Logger.addStatus("admob receive ad suc++++");
  }
  
  public void onReceiveRefreshedAd(AdView paramAdView) {}
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
    Logger.addStatus("admob refresh++++");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.AdMobAdapter
 * JD-Core Version:    0.7.0.1
 */