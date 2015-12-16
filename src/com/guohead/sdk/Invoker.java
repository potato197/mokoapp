package com.guohead.sdk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;

public class Invoker
  extends Activity
{
  LinearLayout layout;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903042);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(2131034114);
    GuoheAdLayout localGuoheAdLayout = new GuoheAdLayout(this);
    localGuoheAdLayout.setListener(new GuoheAdStateListener()
    {
      public void onClick() {}
      
      public void onFail() {}
      
      public void onReceiveAd() {}
      
      public void onRefreshAd() {}
    });
    localLinearLayout.addView(localGuoheAdLayout, localLayoutParams);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    GuoheAdManager.finish(this);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.Invoker
 * JD-Core Version:    0.7.0.1
 */