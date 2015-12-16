package cn.domob.android.ads;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import cn.domob.android.ads.c.a;

final class f
{
  private static Boolean a = null;
  private int b;
  private int c;
  private long d;
  private String e;
  private boolean f;
  private boolean g;
  private boolean h = true;
  private String i;
  private Context j;
  private DomobAdView k = null;
  private boolean l;
  private long m;
  private long n;
  private boolean o = true;
  private boolean p = false;
  
  public f(Context paramContext, AttributeSet paramAttributeSet, DomobAdView paramDomobAdView, boolean paramBoolean)
  {
    this.k = paramDomobAdView;
    this.o = false;
    this.j = paramContext;
    Log.i("DomobSDK", "current version is 20110820");
    if ((-1 == paramContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE")) && (!DomobAdManager.c()))
    {
      Log.e("DomobSDK", "you must have android.permission.WRITE_EXTERNAL_STORAGE permission !");
      t.a(this.j, "DomobSDK缺少权限", "you must have android.permission.WRITE_EXTERNAL_STORAGE permission");
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "DomobAdController!");
    }
    this.b = 20000;
    if (paramAttributeSet != null)
    {
      String str = "http://schemas.android.com/apk/res/" + paramContext.getPackageName();
      this.i = paramAttributeSet.getAttributeValue(str, "keywords");
      this.e = paramAttributeSet.getAttributeValue(str, "spots");
      this.b = (1000 * d(paramAttributeSet.getAttributeIntValue(str, "refreshInterval", 20)));
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "setDefaultInterval:" + this.b);
      }
    }
    if (a == null) {
      a = Boolean.valueOf(a(paramContext));
    }
    if (!b(paramContext))
    {
      this.l = false;
      this.m = 0L;
      this.n = 0L;
      a(1);
    }
    this.f = false;
    this.g = true;
    this.d = 0L;
    if (this.l)
    {
      long l1 = SystemClock.uptimeMillis();
      if (Log.isLoggable("DomobSDK", 3))
      {
        Log.d("DomobSDK", "mDisabled = " + this.l + " | mDisabledTime = " + this.m + " | mDisabledTimestamp = " + this.n);
        Log.d("DomobSDK", "curr timestamp = " + l1);
      }
      if (l1 - this.n >= 1000L * this.m)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "send detector because ad is disabled.");
        }
        x();
      }
    }
    PackageManager localPackageManager = this.j.getPackageManager();
    Intent localIntent = new Intent();
    localIntent.setClass(this.j, DomobActivity.class);
    if (localPackageManager.resolveActivity(localIntent, -1) == null)
    {
      Log.e("DomobSDK", "please declare DomobActivity in AndroidManifest !");
      t.a(this.j, "DomobSDK缺少必要Activity", "please declare DomobActivity in AndroidManifest !");
    }
  }
  
  protected static boolean a(Context paramContext)
  {
    try
    {
      Class localClass = Class.forName("org.json.JSONException");
      if (localClass == null) {
        break label17;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      label17:
      do
      {
        localClassNotFoundException.printStackTrace();
      } while (DomobAdManager.b(paramContext) != null);
    }
    return false;
    return true;
  }
  
  private boolean b(Context paramContext)
  {
    bool = true;
    Cursor localCursor = null;
    for (;;)
    {
      try
      {
        c localc = c.a(paramContext);
        localCursor = localc.b();
        if ((localCursor != null) && (localCursor.getCount() != 0)) {
          continue;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "no data in conf db, initialize now.");
        }
        localc.c();
        bool = false;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        bool = false;
        continue;
        this.l = true;
        continue;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      return bool;
      localCursor.moveToFirst();
      if (localCursor.getInt(localCursor.getColumnIndexOrThrow("_dis_flag")) != 0) {
        continue;
      }
      this.l = false;
      this.m = localCursor.getLong(localCursor.getColumnIndexOrThrow("_dis_time"));
      this.n = localCursor.getLong(localCursor.getColumnIndexOrThrow("_dis_timestamp"));
      a(localCursor.getInt(localCursor.getColumnIndexOrThrow("_interval")));
    }
  }
  
  private static int d(int paramInt)
  {
    if (paramInt < 20) {
      paramInt = 20;
    }
    while (paramInt <= 600) {
      return paramInt;
    }
    return 600;
  }
  
  private void w()
  {
    if ((this.l) && ((!DomobAdManager.isTestMode(this.j)) || (!DomobAdManager.isTestAllowed(this.j))))
    {
      Log.w("DomobSDK", "AD has been disabled on web server, ignore doRefresh()");
      return;
    }
    if ((!this.o) && (this.k != null) && (!this.k.a()) && ((this.k.getVisibility() != 0) || (!this.k.hasWindowFocus())))
    {
      Log.w("DomobSDK", "Cannot doRefresh() when the DomobAdView is not visible or not have focus.");
      return;
    }
    if (this.f)
    {
      Log.w("DomobSDK", "Ignoring doRefresh() because we are requesting an ad right now already.");
      return;
    }
    this.f = true;
    this.d = SystemClock.uptimeMillis();
    if (this.g)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "send detector!");
      }
      x();
      return;
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "doRefresh now!");
    }
    if (this.k != null) {
      Log.v("DomobSDK", "GetAd by view:" + String.valueOf(this.k.a));
    }
    new l(this).start();
  }
  
  private void x()
  {
    new m(this).start();
  }
  
  protected final int a()
  {
    return this.c;
  }
  
  protected final void a(int paramInt)
  {
    if (paramInt == 1)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "use the default interval(from xml).");
      }
      this.c = this.b;
    }
    for (;;)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "setRequestInterval:" + this.c);
      }
      return;
      if (paramInt == 0)
      {
        Log.w("DomobSDK", "refreshInterval is 0, AD will not be refreshed any more.");
        this.c = (paramInt * 1000);
        if (this.k != null) {
          this.k.b();
        }
      }
      else
      {
        this.c = (1000 * d(paramInt));
      }
    }
  }
  
  protected final void a(View paramView)
  {
    this.k.addView(paramView, new RelativeLayout.LayoutParams(1, 1));
  }
  
  protected final void a(RelativeLayout.LayoutParams paramLayoutParams)
  {
    this.k.addView(this.k.e(), paramLayoutParams);
  }
  
  public final void a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 200))
    {
      Log.e("DomobSDK", "The length of keywords cannot exceed 200!");
      return;
    }
    this.i = paramString;
  }
  
  protected final void a(boolean paramBoolean)
  {
    this.f = false;
  }
  
  protected final void a(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    if (this.l == paramBoolean) {}
    for (;;)
    {
      return;
      this.l = paramBoolean;
      if (this.l)
      {
        Log.w("DomobSDK", "AD is disabled on web server.");
        this.m = paramLong1;
      }
      for (this.n = paramLong2; (this.k != null) && (DomobAdView.b != null); this.n = 0L)
      {
        DomobAdView.b.post(this.k.d());
        return;
        this.m = 0L;
      }
    }
  }
  
  protected final void b(int paramInt)
  {
    this.k.e().setProgress(paramInt);
  }
  
  protected final void b(View paramView)
  {
    this.k.removeView(paramView);
  }
  
  public final void b(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 200))
    {
      Log.e("DomobSDK", "The length of spots cannot exceed 200!");
      return;
    }
    this.e = paramString;
  }
  
  protected final void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  protected final boolean b()
  {
    return this.l;
  }
  
  public final void c()
  {
    this.h = true;
    if (this.k != null) {
      this.k.a(true);
    }
    this.p = true;
    d();
  }
  
  protected final void c(int paramInt)
  {
    this.k.e().setVisibility(paramInt);
  }
  
  protected final void c(boolean paramBoolean)
  {
    if ((this.k != null) && (!this.o)) {
      DomobAdView.a(this.k, true);
    }
  }
  
  protected final void d(boolean paramBoolean)
  {
    this.k.b(paramBoolean);
  }
  
  protected final boolean d()
  {
    long l1 = (SystemClock.uptimeMillis() - this.d) / 1000L;
    if (l1 < 20L)
    {
      Log.w("DomobSDK", "Ignoring requestFreshAd.  Called " + l1 + " seconds since last refresh.  " + "Refreshes must be at least " + 20 + " apart.");
      return false;
    }
    if (this.f)
    {
      Log.w("DomobSDK", "Ignoring doRefresh() because we are requesting an ad right now already.");
      return false;
    }
    w();
    return true;
  }
  
  protected final void e()
  {
    if ((this.k == null) && (!this.o)) {}
    while ((this.p) && (!this.g) && (!this.h)) {
      return;
    }
    w();
  }
  
  public final String f()
  {
    return this.i;
  }
  
  public final String g()
  {
    return this.e;
  }
  
  protected final void h()
  {
    if (this.j != null)
    {
      long l1 = r.c();
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "The avg req time is:" + l1);
      }
      if (l1 != -1L)
      {
        c localc = c.a(this.j);
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("_avg_time", Long.valueOf(l1));
        localc.a(localContentValues);
      }
    }
  }
  
  protected final int i()
  {
    return this.c / 1000;
  }
  
  protected final boolean j()
  {
    return this.o;
  }
  
  protected final Context k()
  {
    return this.j;
  }
  
  protected final j l()
  {
    return null;
  }
  
  protected final v m()
  {
    return DomobAdView.a(this.k);
  }
  
  protected final void n()
  {
    DomobAdView.b(this.k);
  }
  
  protected final a o()
  {
    return this.k.getDataItem();
  }
  
  public final int p()
  {
    return this.k.getHeight();
  }
  
  public final int q()
  {
    return this.k.getWidth();
  }
  
  protected final void r()
  {
    this.k.removeView(this.k.e());
  }
  
  protected final DomobAdListener s()
  {
    return this.k.getAdListener();
  }
  
  protected final boolean t()
  {
    int[] arrayOfInt = new int[2];
    this.k.getLocationOnScreen(arrayOfInt);
    int i1 = DomobAdManager.h(this.j);
    float f1 = DomobAdManager.f(this.j);
    float f2 = DomobAdManager.e(this.j);
    int i2 = (int)(i1 / (f2 / f1) - f1 * 48.0F);
    t.a("location on screen:" + arrayOfInt[0] + " " + arrayOfInt[1] + "bottom location:" + i2);
    return arrayOfInt[1] == i2;
  }
  
  protected final boolean u()
  {
    return this.k.c;
  }
  
  protected final boolean v()
  {
    return this.k.f();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.f
 * JD-Core Version:    0.7.0.1
 */