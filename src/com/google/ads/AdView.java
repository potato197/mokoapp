package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.ads.util.AdUtil;
import com.google.ads.util.a;
import d;

public class AdView
  extends RelativeLayout
  implements Ad
{
  private d a;
  
  public AdView(Activity paramActivity, AdSize paramAdSize, String paramString)
  {
    super(paramActivity.getApplicationContext());
    if (!a(paramActivity, paramAdSize)) {
      return;
    }
    a(paramActivity, paramAdSize, paramString);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    String str1;
    if (paramAttributeSet != null)
    {
      str1 = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", "adSize");
      if (str1 == null) {
        a(paramContext, "AdView missing required XML attribute \"adSize\".", AdSize.BANNER);
      }
    }
    else
    {
      return;
    }
    AdSize localAdSize;
    if ("BANNER".equals(str1)) {
      localAdSize = AdSize.BANNER;
    }
    String str2;
    for (;;)
    {
      str2 = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", "adUnitId");
      if (str2 != null) {
        break label161;
      }
      a(paramContext, "AdView missing required XML attribute \"adUnitId\".", localAdSize);
      return;
      if ("IAB_MRECT".equals(str1))
      {
        localAdSize = AdSize.IAB_MRECT;
      }
      else if ("IAB_BANNER".equals(str1))
      {
        localAdSize = AdSize.IAB_BANNER;
      }
      else
      {
        if (!"IAB_LEADERBOARD".equals(str1)) {
          break;
        }
        localAdSize = AdSize.IAB_LEADERBOARD;
      }
    }
    a(paramContext, "Invalid \"adSize\" value in XML layout: " + str1 + ".", AdSize.BANNER);
    return;
    label161:
    if (isInEditMode())
    {
      a(paramContext, "Ads by Google", -1, localAdSize);
      return;
    }
    String str4;
    String str5;
    TypedValue localTypedValue;
    if (str2.startsWith("@string/"))
    {
      str4 = str2.substring("@string/".length());
      str5 = paramContext.getPackageName();
      localTypedValue = new TypedValue();
    }
    for (;;)
    {
      try
      {
        getResources().getValue(str5 + ":string/" + str4, localTypedValue, true);
        if (localTypedValue.string != null)
        {
          str3 = localTypedValue.string.toString();
          boolean bool = paramAttributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/lib/com.google.ads", "loadAdOnCreate", false);
          if (!(paramContext instanceof Activity)) {
            break label406;
          }
          Activity localActivity = (Activity)paramContext;
          if (!a(paramContext, localAdSize)) {
            break;
          }
          a(localActivity, localAdSize, str3);
          if (!bool) {
            break;
          }
          loadAd(new AdRequest());
          return;
        }
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        a(paramContext, "Could not find resource for \"adUnitId\": \"" + str2 + "\".", localAdSize);
        return;
      }
      a(paramContext, "\"adUnitId\" was not a string: \"" + str2 + "\".", localAdSize);
      String str3 = str2;
    }
    label406:
    a.b("AdView was initialized with a Context that wasn't an Activity.");
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
  }
  
  private void a(Activity paramActivity, AdSize paramAdSize, String paramString)
  {
    this.a = new d(paramActivity, this, paramAdSize, paramString);
    setGravity(17);
    setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
    int i = (int)TypedValue.applyDimension(1, paramAdSize.getWidth(), paramActivity.getResources().getDisplayMetrics());
    int j = (int)TypedValue.applyDimension(1, paramAdSize.getHeight(), paramActivity.getResources().getDisplayMetrics());
    addView(this.a.i(), i, j);
  }
  
  private void a(Context paramContext, String paramString, int paramInt, AdSize paramAdSize)
  {
    if (getChildCount() == 0)
    {
      TextView localTextView = new TextView(paramContext);
      localTextView.setGravity(17);
      localTextView.setText(paramString);
      localTextView.setTextColor(paramInt);
      localTextView.setBackgroundColor(-16777216);
      LinearLayout localLinearLayout1 = new LinearLayout(paramContext);
      localLinearLayout1.setGravity(17);
      LinearLayout localLinearLayout2 = new LinearLayout(paramContext);
      localLinearLayout2.setGravity(17);
      localLinearLayout2.setBackgroundColor(paramInt);
      int i = (int)TypedValue.applyDimension(1, paramAdSize.getWidth(), paramContext.getResources().getDisplayMetrics());
      int j = (int)TypedValue.applyDimension(1, paramAdSize.getHeight(), paramContext.getResources().getDisplayMetrics());
      localLinearLayout1.addView(localTextView, i - 2, j - 2);
      localLinearLayout2.addView(localLinearLayout1);
      addView(localLinearLayout2, i, j);
    }
  }
  
  private void a(Context paramContext, String paramString, AdSize paramAdSize)
  {
    a.b(paramString);
    a(paramContext, paramString, -65536, paramAdSize);
    if (!isInEditMode())
    {
      if ((paramContext instanceof Activity)) {
        a((Activity)paramContext, paramAdSize, "");
      }
    }
    else {
      return;
    }
    a.b("AdView was initialized with a Context that wasn't an Activity.");
  }
  
  private boolean a(Context paramContext, AdSize paramAdSize)
  {
    if (!AdUtil.b(paramContext))
    {
      a(paramContext, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", paramAdSize);
      return false;
    }
    return true;
  }
  
  public void destroy()
  {
    this.a.b();
  }
  
  public boolean isReady()
  {
    if (this.a == null) {
      return false;
    }
    return this.a.o();
  }
  
  public boolean isRefreshing()
  {
    return this.a.p();
  }
  
  public void loadAd(AdRequest paramAdRequest)
  {
    if (this.a.e() == null)
    {
      a.e("activity was null while checking permissions.");
      return;
    }
    if (isRefreshing()) {
      this.a.c();
    }
    this.a.a(paramAdRequest);
  }
  
  public void setAdListener(AdListener paramAdListener)
  {
    this.a.a(paramAdListener);
  }
  
  public void stopLoading()
  {
    this.a.y();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.AdView
 * JD-Core Version:    0.7.0.1
 */