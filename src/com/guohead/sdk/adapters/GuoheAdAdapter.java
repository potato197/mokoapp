package com.guohead.sdk.adapters;

import android.content.Context;
import android.util.Log;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdStateListener;
import com.guohead.sdk.obj.Ration;
import java.lang.reflect.Constructor;

public abstract class GuoheAdAdapter
{
  static GuoheAdAdapter adapter;
  protected final GuoheAdLayout guoheAdLayout;
  private GuoheAdStateListener guoheAdStateListener;
  protected Ration ration;
  
  public GuoheAdAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    this.guoheAdLayout = paramGuoheAdLayout;
    this.guoheAdStateListener = paramGuoheAdLayout;
    this.ration = paramRation;
  }
  
  public static void finish(Context paramContext)
  {
    Log.i("Guohead SDK", "================> finish execute.");
    if (adapter != null) {
      adapter.guoheAdStateListener = null;
    }
    adapter.finish();
  }
  
  private static GuoheAdAdapter getAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    for (;;)
    {
      try
      {
        switch (paramRation.type)
        {
        default: 
          GuoheAdAdapter localGuoheAdAdapter15 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
          return localGuoheAdAdapter15;
        }
      }
      catch (VerifyError localVerifyError)
      {
        AdMobAdapter localAdMobAdapter;
        GuoheAdAdapter localGuoheAdAdapter14;
        GuoheAdAdapter localGuoheAdAdapter13;
        GuoheAdAdapter localGuoheAdAdapter12;
        CaseeAdapter localCaseeAdapter;
        GuoheAdAdapter localGuoheAdAdapter11;
        WooBooAdapter localWooBooAdapter;
        GuoheAdAdapter localGuoheAdAdapter10;
        AdChinaAdapter localAdChinaAdapter;
        GuoheAdAdapter localGuoheAdAdapter9;
        MillennialAdapter localMillennialAdapter;
        GuoheAdAdapter localGuoheAdAdapter8;
        AdTouchAdapter localAdTouchAdapter;
        GuoheAdAdapter localGuoheAdAdapter7;
        DomobAdapter localDomobAdapter;
        GuoheAdAdapter localGuoheAdAdapter6;
        YouMiAdapter localYouMiAdapter;
        GuoheAdAdapter localGuoheAdAdapter5;
        MadHouseAdapter localMadHouseAdapter;
        GuoheAdAdapter localGuoheAdAdapter4;
        WiyunAdapter localWiyunAdapter;
        GuoheAdAdapter localGuoheAdAdapter3;
        VponAdapter localVponAdapter;
        GuoheAdAdapter localGuoheAdAdapter2;
        AdWoAdapter localAdWoAdapter;
        CustomAdapter localCustomAdapter;
        Log.e("GuoheAd", "YYY - Caught VerifyError", localVerifyError);
        return unknownAdNetwork(paramGuoheAdLayout, paramRation);
      }
      try
      {
        localAdMobAdapter = new AdMobAdapter(paramGuoheAdLayout, paramRation);
        return localAdMobAdapter;
      }
      catch (Exception localException14)
      {
        localGuoheAdAdapter14 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
        return localGuoheAdAdapter14;
      }
    }
    try
    {
      localGuoheAdAdapter13 = getNetworkAdapter("com.guohead.sdk.adapters.QuattroAdapter", paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter13;
    }
    catch (Exception localException13)
    {
      localGuoheAdAdapter12 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter12;
    }
    try
    {
      localCaseeAdapter = new CaseeAdapter(paramGuoheAdLayout, paramRation);
      return localCaseeAdapter;
    }
    catch (Exception localException12)
    {
      localGuoheAdAdapter11 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter11;
    }
    try
    {
      localWooBooAdapter = new WooBooAdapter(paramGuoheAdLayout, paramRation);
      return localWooBooAdapter;
    }
    catch (Exception localException11)
    {
      localGuoheAdAdapter10 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter10;
    }
    try
    {
      localAdChinaAdapter = new AdChinaAdapter(paramGuoheAdLayout, paramRation);
      return localAdChinaAdapter;
    }
    catch (Exception localException10)
    {
      localGuoheAdAdapter9 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter9;
    }
    try
    {
      localMillennialAdapter = new MillennialAdapter(paramGuoheAdLayout, paramRation);
      return localMillennialAdapter;
    }
    catch (Exception localException9)
    {
      localGuoheAdAdapter8 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter8;
    }
    try
    {
      localAdTouchAdapter = new AdTouchAdapter(paramGuoheAdLayout, paramRation);
      return localAdTouchAdapter;
    }
    catch (Exception localException8)
    {
      localGuoheAdAdapter7 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter7;
    }
    try
    {
      localDomobAdapter = new DomobAdapter(paramGuoheAdLayout, paramRation);
      return localDomobAdapter;
    }
    catch (Exception localException7)
    {
      localGuoheAdAdapter6 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter6;
    }
    try
    {
      localYouMiAdapter = new YouMiAdapter(paramGuoheAdLayout, paramRation);
      return localYouMiAdapter;
    }
    catch (Exception localException6)
    {
      localGuoheAdAdapter5 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter5;
    }
    try
    {
      localMadHouseAdapter = new MadHouseAdapter(paramGuoheAdLayout, paramRation);
      return localMadHouseAdapter;
    }
    catch (Exception localException5)
    {
      localGuoheAdAdapter4 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter4;
    }
    try
    {
      localWiyunAdapter = new WiyunAdapter(paramGuoheAdLayout, paramRation);
      return localWiyunAdapter;
    }
    catch (Exception localException4)
    {
      localGuoheAdAdapter3 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter3;
    }
    try
    {
      localVponAdapter = new VponAdapter(paramGuoheAdLayout, paramRation);
      return localVponAdapter;
    }
    catch (Exception localException3)
    {
      localGuoheAdAdapter2 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter2;
    }
    try
    {
      localAdWoAdapter = new AdWoAdapter(paramGuoheAdLayout, paramRation);
      return localAdWoAdapter;
    }
    catch (Exception localException2)
    {
      return unknownAdNetwork(paramGuoheAdLayout, paramRation);
    }
    localCustomAdapter = new CustomAdapter(paramGuoheAdLayout, paramRation);
    return localCustomAdapter;
    try
    {
      BaiduAdapter localBaiduAdapter = new BaiduAdapter(paramGuoheAdLayout, paramRation);
      return localBaiduAdapter;
    }
    catch (Exception localException1)
    {
      GuoheAdAdapter localGuoheAdAdapter1 = unknownAdNetwork(paramGuoheAdLayout, paramRation);
      return localGuoheAdAdapter1;
    }
  }
  
  private static GuoheAdAdapter getNetworkAdapter(String paramString, GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    try
    {
      GuoheAdAdapter localGuoheAdAdapter = (GuoheAdAdapter)Class.forName(paramString).getConstructor(new Class[] { GuoheAdLayout.class, Ration.class }).newInstance(new Object[] { paramGuoheAdLayout, paramRation });
      return localGuoheAdAdapter;
    }
    catch (Exception localException)
    {
      Log.e("GuoheAdAdapter", "ERROR: " + localException.getMessage());
    }
    return null;
  }
  
  public static void handle(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
    throws Throwable
  {
    if (adapter != null) {
      adapter.finish();
    }
    adapter = getAdapter(paramGuoheAdLayout, paramRation);
    if (adapter != null)
    {
      Log.d("Guohead SDK", "Valid adapter, calling handle()");
      adapter.handle();
      return;
    }
    throw new Exception("Invalid adapter");
  }
  
  public static void refreshAd(Context paramContext)
  {
    Log.i("Guohead SDK", "Manual Refresh AD");
    adapter.refreshAd();
  }
  
  private static GuoheAdAdapter unknownAdNetwork(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    Log.w("Guohead SDK", "Unsupported ration type: " + paramRation.type);
    return null;
  }
  
  protected void clearAdStateListener()
  {
    this.guoheAdStateListener = null;
  }
  
  public abstract void finish();
  
  public abstract void handle();
  
  protected void notifyOnClick()
  {
    if (this.guoheAdStateListener != null) {
      this.guoheAdStateListener.onClick();
    }
  }
  
  protected void notifyOnFail()
  {
    if (this.guoheAdStateListener != null) {
      this.guoheAdStateListener.onFail();
    }
  }
  
  public abstract void refreshAd();
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.GuoheAdAdapter
 * JD-Core Version:    0.7.0.1
 */