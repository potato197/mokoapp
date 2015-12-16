package com.guohead.sdk.adapters;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;
import com.millennialmedia.android.MMAdView;
import com.millennialmedia.android.MMAdView.MMAdListener;
import java.util.Hashtable;

public class MillennialAdapter
  extends GuoheAdAdapter
  implements MMAdView.MMAdListener
{
  public MMAdView adView;
  public GuoheAdManager guoheAdManager;
  
  public MillennialAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void MMAdClickedToNewBrowser(MMAdView paramMMAdView)
  {
    Logger.d("Millennial Ad clicked, new browser launched");
  }
  
  public void MMAdClickedToOverlay(MMAdView paramMMAdView)
  {
    Logger.d("Millennial Ad Clicked to overlay");
  }
  
  public void MMAdFailed(MMAdView paramMMAdView)
  {
    Logger.d("Millennial failure");
    paramMMAdView.setListener(null);
    this.guoheAdLayout.rollover();
    Logger.addStatus("Millennial receive ad failed----");
  }
  
  public void MMAdOverlayLaunched(MMAdView paramMMAdView)
  {
    Logger.d("Millennial Ad Overlay Launched");
  }
  
  public void MMAdRequestIsCaching(MMAdView paramMMAdView) {}
  
  public void MMAdReturned(final MMAdView paramMMAdView)
  {
    Logger.addStatus("Millennial receive ad suc++++");
    Logger.d("Millennial success");
    paramMMAdView.setListener(null);
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        MillennialAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        MillennialAdapter.this.guoheAdLayout.nextView = paramMMAdView;
        MillennialAdapter.this.guoheAdLayout.activeRation = MillennialAdapter.this.ration;
        MillennialAdapter.this.guoheAdLayout.handler.post(MillennialAdapter.this.guoheAdLayout.viewRunnable);
        MillennialAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
  }
  
  public void finish()
  {
    this.adView.halt();
    Logger.addStatus("Millennial finish");
    this.adView = null;
  }
  
  public void handle()
  {
    Hashtable localHashtable = new Hashtable();
    if (!TextUtils.isEmpty(this.ration.key2))
    {
      localHashtable.put("height", "53");
      localHashtable.put("width", "320");
      localHashtable.put("keywords", this.ration.key2);
    }
    this.adView = new MMAdView(this.guoheAdLayout.activity, this.ration.key, "MMBannerAdTop", 900, localHashtable);
    this.adView.setListener(this);
    this.adView.setId(1897808289);
    this.adView.callForAd();
    this.adView.setHorizontalScrollBarEnabled(false);
    this.adView.setVerticalScrollBarEnabled(false);
    this.guoheAdLayout.addView(this.adView, new ViewGroup.LayoutParams(-2, -2));
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.viewRunnable);
    Logger.addStatus("Millennial refresh");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.MillennialAdapter
 * JD-Core Version:    0.7.0.1
 */