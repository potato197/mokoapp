package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import d;
import e;
import g;
import h;
import java.util.HashMap;

public class AdActivity
  extends Activity
  implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, View.OnClickListener
{
  public static final String BASE_URL_PARAM = "baseurl";
  public static final String HTML_PARAM = "html";
  public static final String INTENT_ACTION_PARAM = "i";
  public static final String ORIENTATION_PARAM = "o";
  public static final String TYPE_PARAM = "m";
  public static final String URL_PARAM = "u";
  private static final Object a = new Object();
  private static AdActivity b = null;
  private static d c = null;
  private static AdActivity d = null;
  private static AdActivity e = null;
  private g f;
  private long g;
  private RelativeLayout h;
  private AdActivity i = null;
  private boolean j;
  private VideoView k;
  
  private void a(g paramg, boolean paramBoolean, int paramInt)
  {
    requestWindowFeature(1);
    getWindow().setFlags(1024, 1024);
    if (paramg.getParent() != null) {
      a("Interstitial created with an AdWebView that has a parent.");
    }
    do
    {
      return;
      if (paramg.b() != null)
      {
        a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
        return;
      }
      setRequestedOrientation(paramInt);
      paramg.a(this);
      ImageButton localImageButton = new ImageButton(getApplicationContext());
      localImageButton.setImageResource(17301527);
      localImageButton.setBackgroundDrawable(null);
      int m = (int)TypedValue.applyDimension(1, 1.0F, getResources().getDisplayMetrics());
      localImageButton.setPadding(m, m, 0, 0);
      localImageButton.setOnClickListener(this);
      ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
      this.h.addView(paramg, localLayoutParams);
      this.h.addView(localImageButton);
      setContentView(this.h);
    } while (!paramBoolean);
    a.a(paramg);
  }
  
  private void a(String paramString)
  {
    com.google.ads.util.a.b(paramString);
    finish();
  }
  
  public static void launchAdActivity(d paramd, e parame)
  {
    Activity localActivity;
    synchronized (a)
    {
      if (c == null) {
        c = paramd;
      }
      while (c == paramd)
      {
        localActivity = paramd.e();
        if (localActivity != null) {
          break;
        }
        com.google.ads.util.a.e("activity was null while launching an AdActivity.");
        return;
      }
      com.google.ads.util.a.b("Tried to launch a new AdActivity with a different AdManager.");
      return;
    }
    Intent localIntent = new Intent(localActivity.getApplicationContext(), AdActivity.class);
    localIntent.putExtra("com.google.ads.AdOpener", parame.a());
    try
    {
      com.google.ads.util.a.a("Launching AdActivity.");
      localActivity.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      com.google.ads.util.a.a(localActivityNotFoundException.getMessage(), localActivityNotFoundException);
    }
  }
  
  public g getOpeningAdWebView()
  {
    if (this.i != null) {
      return this.i.f;
    }
    synchronized (a)
    {
      if (c == null)
      {
        com.google.ads.util.a.e("currentAdManager was null while trying to get the opening AdWebView.");
        return null;
      }
    }
    g localg = c.i();
    if (localg != this.f) {
      return localg;
    }
    return null;
  }
  
  public VideoView getVideoView()
  {
    return this.k;
  }
  
  public void onClick(View paramView)
  {
    finish();
  }
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    com.google.ads.util.a.d("Video finished playing.");
    if (this.k != null) {
      this.k.setVisibility(8);
    }
    this.f.loadUrl("javascript:AFMA_ReceiveMessage('onVideoEvent', {'event': 'finish'});");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    d locald;
    Bundle localBundle;
    synchronized (a)
    {
      if (c != null)
      {
        locald = c;
        if (d == null) {
          d = this;
        }
        if ((this.i == null) && (e != null)) {
          this.i = e;
        }
        e = this;
        this.h = null;
        this.j = false;
        this.k = null;
        localBundle = getIntent().getBundleExtra("com.google.ads.AdOpener");
        if (localBundle == null) {
          a("Could not get the Bundle used to create AdActivity.");
        }
      }
      else
      {
        a("Could not get currentAdManager.");
        return;
      }
    }
    e locale = new e(localBundle);
    String str1 = locale.b();
    HashMap localHashMap = locale.c();
    if (this == d) {
      locald.s();
    }
    if (str1.equals("intent"))
    {
      this.f = null;
      this.g = SystemClock.elapsedRealtime();
      this.j = true;
      if (localHashMap == null)
      {
        a("Could not get the paramMap in launchIntent()");
        return;
      }
      String str6 = (String)localHashMap.get("u");
      if (str6 == null)
      {
        a("Could not get the URL parameter in launchIntent().");
        return;
      }
      String str7 = (String)localHashMap.get("i");
      String str8 = (String)localHashMap.get("m");
      Uri localUri = Uri.parse(str6);
      Intent localIntent;
      if (str7 == null) {
        localIntent = new Intent("android.intent.action.VIEW", localUri);
      }
      synchronized (a)
      {
        for (;;)
        {
          if (b == null)
          {
            b = this;
            if (c == null) {
              break;
            }
            c.t();
          }
          try
          {
            com.google.ads.util.a.a("Launching an intent from AdActivity.");
            startActivity(localIntent);
            return;
          }
          catch (ActivityNotFoundException localActivityNotFoundException)
          {
            com.google.ads.util.a.a(localActivityNotFoundException.getMessage(), localActivityNotFoundException);
            finish();
            return;
          }
          localIntent = new Intent(str7);
          if (str8 != null) {
            localIntent.setDataAndType(localUri, str8);
          } else {
            localIntent.setData(localUri);
          }
        }
        com.google.ads.util.a.e("currentAdManager is null while trying to call onLeaveApplication().");
      }
    }
    this.h = new RelativeLayout(getApplicationContext());
    if (str1.equals("webapp"))
    {
      this.f = new g(getApplicationContext(), null);
      h localh = new h(locald, a.b, true, true);
      localh.b();
      this.f.setWebViewClient(localh);
      String str2 = (String)localHashMap.get("u");
      String str3 = (String)localHashMap.get("baseurl");
      String str4 = (String)localHashMap.get("html");
      String str5 = (String)localHashMap.get("o");
      int n;
      if (str2 != null)
      {
        this.f.loadUrl(str2);
        if (!"p".equals(str5)) {
          break label579;
        }
        n = 1;
      }
      for (;;)
      {
        a(this.f, false, n);
        return;
        if (str4 != null)
        {
          this.f.loadDataWithBaseURL(str3, str4, "text/html", "utf-8", null);
          break;
        }
        a("Could not get the URL or HTML parameter to show a web app.");
        return;
        label579:
        if ("l".equals(str5)) {
          n = 0;
        } else {
          n = locald.m();
        }
      }
    }
    if (str1.equals("interstitial"))
    {
      this.f = locald.i();
      int m = locald.m();
      a(this.f, true, m);
      return;
    }
    a("Unknown AdOpener, <action: " + str1 + ">");
  }
  
  public void onDestroy()
  {
    if (this.h != null) {
      this.h.removeAllViews();
    }
    if (this.f != null)
    {
      a.b(this.f);
      this.f.a(null);
    }
    if (isFinishing()) {
      if (this.k != null)
      {
        this.k.stopPlayback();
        this.k = null;
      }
    }
    synchronized (a)
    {
      if ((c != null) && (this.f != null))
      {
        if (this.f == c.i()) {
          c.a();
        }
        this.f.stopLoading();
        this.f.destroy();
      }
      if (this == d)
      {
        if (c != null)
        {
          c.r();
          c = null;
          d = null;
        }
      }
      else
      {
        if (this == b) {
          b = null;
        }
        e = this.i;
        com.google.ads.util.a.a("AdActivity is closing.");
        super.onDestroy();
        return;
      }
      com.google.ads.util.a.e("currentAdManager is null while trying to destroy AdActivity.");
    }
  }
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    com.google.ads.util.a.e("Video threw error! <what:" + paramInt1 + ", extra:" + paramInt2 + ">");
    finish();
    return true;
  }
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    com.google.ads.util.a.d("Video is ready to play.");
    this.f.loadUrl("javascript:AFMA_ReceiveMessage('onVideoEvent', {'event': 'load'});");
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if ((this.j) && (paramBoolean) && (SystemClock.elapsedRealtime() - this.g > 250L))
    {
      com.google.ads.util.a.d("Launcher AdActivity got focus and is closing.");
      finish();
    }
    super.onWindowFocusChanged(paramBoolean);
  }
  
  public void showVideo(VideoView paramVideoView)
  {
    this.k = paramVideoView;
    if (this.f == null)
    {
      a("Couldn't get adWebView to show the video.");
      return;
    }
    this.f.setBackgroundColor(0);
    paramVideoView.setOnCompletionListener(this);
    paramVideoView.setOnPreparedListener(this);
    paramVideoView.setOnErrorListener(this);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    LinearLayout localLinearLayout = new LinearLayout(getApplicationContext());
    localLinearLayout.setGravity(17);
    localLinearLayout.addView(paramVideoView, localLayoutParams);
    this.h.addView(localLinearLayout, 0, localLayoutParams);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.AdActivity
 * JD-Core Version:    0.7.0.1
 */