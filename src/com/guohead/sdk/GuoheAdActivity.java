package com.guohead.sdk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ScrollView;

public class GuoheAdActivity
  extends Activity
{
  private Handler mHandler = new Handler();
  
  public void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    String str = getIntent().getExtras().getString("link");
    ScrollView localScrollView = new ScrollView(this);
    localScrollView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
    RelativeLayout localRelativeLayout = new RelativeLayout(this);
    localRelativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
    ProgressBar localProgressBar = new ProgressBar(this);
    WebView localWebView = new WebView(this);
    localWebView.getSettings().setJavaScriptEnabled(true);
    localWebView.addJavascriptInterface(new Object()
    {
      public void closeWindow()
      {
        GuoheAdActivity.this.mHandler.post(new Runnable()
        {
          public void run()
          {
            GuoheAdActivity.this.finish();
          }
        });
      }
    }, "guohead");
    localWebView.loadUrl(str);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams2.addRule(14);
    localLayoutParams2.addRule(13);
    localRelativeLayout.addView(localProgressBar, localLayoutParams2);
    localRelativeLayout.addView(localWebView, localLayoutParams1);
    localScrollView.addView(localRelativeLayout, localLayoutParams1);
    setContentView(localScrollView);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.GuoheAdActivity
 * JD-Core Version:    0.7.0.1
 */