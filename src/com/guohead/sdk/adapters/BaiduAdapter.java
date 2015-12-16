package com.guohead.sdk.adapters;

import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.baidu.AdType;
import com.baidu.AdView;
import com.baidu.AdViewListener;
import com.baidu.FailReason;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;

public class BaiduAdapter
  extends GuoheAdAdapter
  implements AdViewListener
{
  static AdView adView;
  
  public BaiduAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish() {}
  
  public void handle()
  {
    this.guoheAdLayout.removeAllViews();
    int i = 1;
    try
    {
      int j = Integer.valueOf(this.ration.key).intValue();
      i = j;
    }
    catch (Exception localException1)
    {
      try
      {
        for (;;)
        {
          ((ViewGroup)adView.getParent()).removeView(adView);
          this.guoheAdLayout.addView(adView, new ViewGroup.LayoutParams(-2, -2));
          onSuc();
          return;
          localException1 = localException1;
          Logger.i(localException1.getMessage());
          localException1.printStackTrace();
          continue;
          adView = new AdView(this.guoheAdLayout.activity, AdType.IMAGE);
        }
        adView = new AdView(this.guoheAdLayout.activity, AdType.TEXT);
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localException2.printStackTrace();
        }
      }
    }
    if (adView == null) {
      Logger.i("baidu is null ,creating");
    }
    switch (i)
    {
    default: 
      Logger.i("Your Baidu adView type is wrong,create a image type .");
      adView = new AdView(this.guoheAdLayout.activity, AdType.IMAGE);
      adView.setListener(this);
    }
  }
  
  public void onAdSwitch() {}
  
  public void onReceiveFail(FailReason paramFailReason)
  {
    Logger.i("baidu failed");
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        BaiduAdapter.this.guoheAdLayout.removeView(BaiduAdapter.adView);
        BaiduAdapter.this.guoheAdLayout.rollover();
      }
    });
  }
  
  public void onReceiveSuccess() {}
  
  void onSuc()
  {
    Logger.d("========> baidu success");
    adView.refresh();
    clearAdStateListener();
    this.guoheAdLayout.activity.runOnUiThread(new Runnable()
    {
      public void run()
      {
        BaiduAdapter.this.guoheAdLayout.removeView(BaiduAdapter.adView);
        BaiduAdapter.adView.setVisibility(0);
        BaiduAdapter.this.guoheAdLayout.guoheAdManager.resetRollover();
        BaiduAdapter.this.guoheAdLayout.nextView = BaiduAdapter.adView;
        BaiduAdapter.this.guoheAdLayout.handler.post(BaiduAdapter.this.guoheAdLayout.viewRunnable);
        BaiduAdapter.this.guoheAdLayout.rotateThreadedDelayed();
      }
    });
    Logger.addStatus("baidu receive ad suc++++");
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.adRunnable);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.BaiduAdapter
 * JD-Core Version:    0.7.0.1
 */