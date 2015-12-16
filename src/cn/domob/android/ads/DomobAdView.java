package cn.domob.android.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import cn.domob.android.ads.a.a.1;

public class DomobAdView
  extends RelativeLayout
{
  public static final int ANIMATION_ALPHA = 3;
  public static final int ANIMATION_ROTATE = 1;
  public static final int ANIMATION_SCALE_FROM_MIDDLE = 5;
  public static final int ANIMATION_TRANSLATE = 7;
  static final Handler b = new Handler();
  private static int m = 0;
  protected int a;
  protected boolean c = false;
  private h d;
  private v e;
  private boolean f;
  private DomobAdListener g;
  private f h = new f(paramContext, paramAttributeSet, this, false);
  private boolean i = true;
  private int j;
  private boolean k;
  private Context l;
  private cn.domob.android.ads.c.a n = new cn.domob.android.ads.c.a();
  private c o;
  private ProgressBar p;
  private boolean q = false;
  private long r = 0L;
  private long s = 0L;
  
  public DomobAdView(Activity paramActivity)
  {
    this(paramActivity, null, 0);
  }
  
  public DomobAdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DomobAdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    try
    {
      this.p = a(paramContext);
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "DomobAdView!");
      }
      int i1 = m;
      m = i1 + 1;
      this.a = i1;
      setDescendantFocusability(262144);
      setClickable(true);
      setLongClickable(false);
      setGravity(17);
      if (paramAttributeSet != null)
      {
        String str = "http://schemas.android.com/apk/res/" + paramContext.getPackageName();
        int i2 = paramAttributeSet.getAttributeUnsignedIntValue(str, "backgroundColor", -1);
        if (i2 != -1) {
          setBackgroundColor(i2);
        }
        int i3 = paramAttributeSet.getAttributeUnsignedIntValue(str, "primaryTextColor", -1);
        if (i3 != -1) {
          setPrimaryTextColor(i3);
        }
      }
      this.l = paramContext;
      this.d = null;
      this.e = null;
      this.k = true;
      this.j = 0;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.c = true;
        localException.printStackTrace();
      }
    }
  }
  
  protected static int a(f paramf)
  {
    return paramf.a();
  }
  
  private ProgressBar a(Context paramContext)
  {
    this.p = new ProgressBar(paramContext, null, 16842872);
    this.p.setVisibility(8);
    LayerDrawable localLayerDrawable1 = (LayerDrawable)this.p.getProgressDrawable();
    Drawable[] arrayOfDrawable = new Drawable[localLayerDrawable1.getNumberOfLayers()];
    int i1 = 0;
    if (i1 < localLayerDrawable1.getNumberOfLayers())
    {
      switch (localLayerDrawable1.getId(i1))
      {
      }
      for (;;)
      {
        i1++;
        break;
        arrayOfDrawable[i1] = localLayerDrawable1.getDrawable(i1);
        continue;
        arrayOfDrawable[i1] = localLayerDrawable1.getDrawable(i1);
        continue;
        GradientDrawable.Orientation localOrientation = GradientDrawable.Orientation.LEFT_RIGHT;
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = Color.argb(255, 197, 250, 249);
        arrayOfInt[1] = -1;
        GradientDrawable localGradientDrawable = new GradientDrawable(localOrientation, arrayOfInt);
        localGradientDrawable.setGradientCenter(0.0F, 0.5F);
        localGradientDrawable.setGradientRadius((float)(60.0D * Math.sqrt(5.0D)));
        localGradientDrawable.setGradientType(0);
        localGradientDrawable.setCornerRadii(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
        ClipDrawable localClipDrawable1 = (ClipDrawable)localLayerDrawable1.getDrawable(i1);
        ClipDrawable localClipDrawable2 = new ClipDrawable(localGradientDrawable, 3, 1);
        localClipDrawable2.setLevel(localClipDrawable1.getLevel());
        arrayOfDrawable[i1] = localClipDrawable2;
      }
    }
    LayerDrawable localLayerDrawable2 = new LayerDrawable(arrayOfDrawable);
    this.p.setProgressDrawable(localLayerDrawable2);
    this.p.setProgress(0);
    return this.p;
  }
  
  protected static v a(DomobAdView paramDomobAdView)
  {
    if (paramDomobAdView == null) {
      return null;
    }
    if (paramDomobAdView.e == null) {
      paramDomobAdView.e = new v(paramDomobAdView);
    }
    return paramDomobAdView.e;
  }
  
  protected static void a(DomobAdView paramDomobAdView, h paramh)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "startAlphaAnimation");
    }
    h localh = paramDomobAdView.d;
    paramh.setVisibility(0);
    setBuilder(paramDomobAdView, paramh);
    if (localh != null)
    {
      paramDomobAdView.removeView(localh);
      localh.j();
    }
    if (paramDomobAdView.f)
    {
      AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
      localAlphaAnimation.setDuration(233L);
      localAlphaAnimation.startNow();
      localAlphaAnimation.setFillAfter(true);
      localAlphaAnimation.setInterpolator(new AccelerateInterpolator());
      paramDomobAdView.startAnimation(localAlphaAnimation);
    }
  }
  
  protected static void a(DomobAdView paramDomobAdView, h paramh, int paramInt)
  {
    if (paramDomobAdView.q)
    {
      t.a("current is preloading,stop startAnimation");
      return;
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "start ad switch Animation");
    }
    if (paramInt == 9)
    {
      paramh.setVisibility(4);
      new cn.domob.android.ads.a.a().a(paramDomobAdView, paramh, paramDomobAdView.d);
      paramDomobAdView.d.setVisibility(8);
      return;
    }
    Animation localAnimation = a.1.a(paramInt, paramDomobAdView);
    paramDomobAdView.getClass();
    localAnimation.setAnimationListener(new a(paramDomobAdView, paramh, paramInt));
    if ((paramInt == 5) || (paramInt == 7))
    {
      paramh.setVisibility(0);
      paramh.startAnimation(localAnimation);
      return;
    }
    paramDomobAdView.startAnimation(localAnimation);
  }
  
  protected static void a(DomobAdView paramDomobAdView, boolean paramBoolean)
  {
    if (paramDomobAdView != null) {
      paramDomobAdView.c(paramBoolean);
    }
  }
  
  protected static void b(DomobAdView paramDomobAdView)
  {
    if (paramDomobAdView == null) {}
    while ((paramDomobAdView.g == null) || (b == null)) {
      return;
    }
    Handler localHandler = b;
    paramDomobAdView.getClass();
    localHandler.post(new b());
  }
  
  private void c(boolean paramBoolean)
  {
    long l1 = 2000L;
    for (;;)
    {
      long l3;
      try
      {
        if (Log.isLoggable("DomobSDK", 3))
        {
          Log.d("DomobSDK", "schedule for a fresh ad?" + paramBoolean);
          Log.d("DomobSDK", "check WindowsVisibility:" + this.j);
          Log.d("DomobSDK", "check WindowsFocus:" + this.k);
          Log.d("DomobSDK", "getVisibility:" + getVisibility());
          Log.d("DomobSDK", "mInterval:" + this.h.a());
        }
        if (!paramBoolean)
        {
          this.s += SystemClock.uptimeMillis() - this.r;
          t.a("adView is show " + this.s + " ms");
          if (this.h.a() > 0) {
            break label498;
          }
          int i2 = this.h.a();
          i1 = 0;
          if (i2 == 0)
          {
            boolean bool = this.i;
            i1 = 0;
            if (bool) {
              break label498;
            }
          }
          if ((!paramBoolean) || (i1 == 0) || (getVisibility() != 0) || (this.j != 0) || (this.k != true)) {
            break label447;
          }
          b();
          this.o = new c();
          if (this.h.a() == 0)
          {
            l3 = 20000L - this.s;
            if (l3 > l1) {
              break label492;
            }
            b.postDelayed(this.o, l1);
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "Ad refresh scheduled for " + this.h.a() + " from now.");
            }
          }
        }
        else
        {
          label390:
          this.r = SystemClock.uptimeMillis();
          continue;
        }
        l2 = this.h.a() - this.s;
      }
      finally {}
      long l2;
      if (l2 <= l1) {}
      for (;;)
      {
        b.postDelayed(this.o, l1);
        break;
        label447:
        if ((paramBoolean) && (this.h.a() != 0)) {
          break label390;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "just cancel the previous request!");
        }
        b();
        break label390;
        l1 = l2;
      }
      label492:
      l1 = l3;
      continue;
      label498:
      int i1 = 1;
    }
  }
  
  public static h setBuilder(DomobAdView paramDomobAdView, h paramh)
  {
    paramDomobAdView.d = paramh;
    return paramh;
  }
  
  protected final void a(g paramg, h paramh)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "construct ad view");
    }
    if ((paramg == null) || (paramh == null))
    {
      Log.w("DomobSDK", "failed to construct view!");
      return;
    }
    boolean bool = this.i;
    this.i = false;
    paramh.a(paramg);
    int i1 = getVisibility();
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "this.getVisibility():" + i1);
    }
    paramh.setVisibility(i1);
    paramh.setGravity(17);
    paramg.a(paramh);
    paramh.setLayoutParams(new RelativeLayout.LayoutParams(paramh.a(paramh.h()), paramh.a(paramh.i())));
    b.post(new d(paramh, i1, bool));
  }
  
  protected final void a(boolean paramBoolean)
  {
    this.i = true;
  }
  
  protected final boolean a()
  {
    return this.i;
  }
  
  protected final void b()
  {
    if (b != null)
    {
      if (this.o != null)
      {
        this.o.a = true;
        b.removeCallbacks(this.o);
        this.o = null;
      }
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "Cancelled an ad refresh scheduled.");
      }
    }
  }
  
  protected final void b(boolean paramBoolean)
  {
    if (this.o != null) {
      this.o.a = paramBoolean;
    }
    this.q = paramBoolean;
  }
  
  protected final void c()
  {
    this.r = SystemClock.uptimeMillis();
    this.s = 0L;
    if (this.g != null) {}
    try
    {
      this.g.onReceivedFreshAd(this);
      return;
    }
    catch (Exception localException)
    {
      Log.e("DomobSDK", "Unhandled exception raised in onReceivedFreshAd.");
      localException.printStackTrace();
    }
  }
  
  public void cleanup()
  {
    if (this.d != null)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "clear the ad.");
      }
      this.d.j();
      this.d = null;
    }
  }
  
  protected final e d()
  {
    return new e();
  }
  
  protected final ProgressBar e()
  {
    return this.p;
  }
  
  protected final boolean f()
  {
    return this.q;
  }
  
  public DomobAdListener getAdListener()
  {
    return this.g;
  }
  
  public cn.domob.android.ads.c.a getDataItem()
  {
    return this.n;
  }
  
  public String getKeywords()
  {
    return this.h.f();
  }
  
  public int getRequestInterval()
  {
    return this.h.i();
  }
  
  public String getSpots()
  {
    return this.h.g();
  }
  
  public boolean hasAd()
  {
    return (this.d != null) && (this.d.c() != null);
  }
  
  protected void onAttachedToWindow()
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "onAttachedToWindow");
    }
    this.f = true;
    c(true);
    super.onAttachedToWindow();
  }
  
  protected void onDetachedFromWindow()
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "onDetachedFromWindow");
    }
    this.f = false;
    this.i = true;
    this.h.h();
    c(false);
    if (this.d != null) {
      this.d.j();
    }
    r.b();
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "DomobAdView onMeasure");
    }
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i3 = View.MeasureSpec.getSize(paramInt2);
    int i4 = View.MeasureSpec.getMode(paramInt2);
    int i5;
    if (i2 == 1073741824)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "heightMeasureSpec is android.view.View.MeasureSpec.EXACTLY!");
      }
      i5 = i1;
    }
    for (;;)
    {
      if (i4 == 1073741824) {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "heightMeasureSpec is android.view.View.MeasureSpec.EXACTLY!");
        }
      }
      for (;;)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "DomobAdView height is :" + i3);
        }
        t.a("onMeasure:" + i5 + "  " + i3);
        setMeasuredDimension(i5, i3);
        if ((this.i) && (!Boolean.valueOf(f.a(this.l)).booleanValue()))
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "request the first ad!");
          }
          this.h.d();
        }
        return;
        if (this.d == null) {
          break label451;
        }
        g localg2 = this.d.c();
        if (localg2 == null) {
          break label451;
        }
        i5 = localg2.b().a(localg2.b().h());
        if ((i2 != -2147483648) || (i1 >= i5)) {
          break;
        }
        Log.e("DomobSDK", "Cannot display ad because its container is too small.  The ad is " + i5 + " pixels wide but is only given " + i3 + " at most to draw into.  Please make your view containing DomobAdView wider.");
        i5 = 0;
        break;
        if (this.d != null)
        {
          g localg1 = this.d.c();
          if (localg1 != null)
          {
            int i6 = localg1.b().a(localg1.b().i());
            if ((i4 == -2147483648) && (i3 < i6))
            {
              Log.e("DomobSDK", "Cannot display ad because its container is too small.  The ad is " + i6 + " pixels tall but is only given " + i3 + " at most to draw into.  Please make your view containing DomobAdView taller.");
              i3 = 0;
              continue;
            }
            i3 = i6;
            continue;
          }
        }
        i3 = 0;
      }
      label451:
      i5 = 0;
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "onWindowFocusChanged:" + paramBoolean);
    }
    this.k = paramBoolean;
    c(paramBoolean);
    super.onWindowFocusChanged(paramBoolean);
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "onWindowVisibilityChanged:" + paramInt);
    }
    this.j = paramInt;
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      c(bool);
      super.onWindowVisibilityChanged(paramInt);
      return;
    }
  }
  
  public void requestFreshAd()
  {
    this.h.c();
  }
  
  public void setAdListener(DomobAdListener paramDomobAdListener)
  {
    try
    {
      this.g = paramDomobAdListener;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void setAnimList(int[] paramArrayOfInt)
  {
    this.n.a(paramArrayOfInt);
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.n.b(paramInt);
    invalidate();
  }
  
  public void setKeywords(String paramString)
  {
    this.h.a(paramString);
  }
  
  public void setPrimaryTextColor(int paramInt)
  {
    this.n.a(paramInt);
  }
  
  public void setRequestInterval(int paramInt)
  {
    this.h.a(paramInt);
  }
  
  public void setSpots(String paramString)
  {
    this.h.b(paramString);
  }
  
  public void setVisibility(int paramInt)
  {
    if (super.getVisibility() != paramInt) {}
    try
    {
      int i1 = getChildCount();
      for (int i2 = 0; i2 < i1; i2++) {
        getChildAt(i2).setVisibility(paramInt);
      }
      super.setVisibility(paramInt);
      invalidate();
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "setVisibility:" + paramInt);
      }
      boolean bool = false;
      if (paramInt == 0) {
        bool = true;
      }
      c(bool);
      return;
    }
    finally {}
  }
  
  final class a
    implements Animation.AnimationListener
  {
    private h a;
    private DomobAdView b;
    private int c;
    
    a(DomobAdView paramDomobAdView, h paramh, int paramInt)
    {
      this.b = paramDomobAdView;
      this.a = paramh;
      this.c = paramInt;
    }
    
    public final void onAnimationEnd(Animation paramAnimation)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "DomobAdView onAnimationEnd.");
      }
      if (this.a != null)
      {
        h localh = DomobAdView.g(this.b);
        this.a.setClickable(true);
        this.a.setVisibility(0);
        DomobAdView.setBuilder(this.b, this.a);
        if (localh != null)
        {
          this.b.removeView(localh);
          localh.j();
        }
        if ((this.c != 5) && (this.c != 7))
        {
          Animation localAnimation = a.1.a(1 + this.c, this.b);
          this.b.startAnimation(localAnimation);
        }
      }
    }
    
    public final void onAnimationRepeat(Animation paramAnimation) {}
    
    public final void onAnimationStart(Animation paramAnimation)
    {
      if (this.a != null) {
        this.a.setClickable(false);
      }
      if ((this.b != null) && (DomobAdView.g(this.b) != null)) {
        DomobAdView.g(this.b).setClickable(false);
      }
    }
  }
  
  final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      if (DomobAdView.this != null) {}
      try
      {
        DomobAdView.this.getAdListener().onFailedToReceiveFreshAd(DomobAdView.this);
        return;
      }
      catch (Exception localException)
      {
        Log.e("DomobSDK", "Unhandled exception raised in onFailedToReceiveRefreshedAd.");
        localException.printStackTrace();
      }
    }
  }
  
  final class c
    implements Runnable
  {
    boolean a;
    
    private c(byte paramByte) {}
    
    public final void run()
    {
      try
      {
        DomobAdView localDomobAdView = DomobAdView.this;
        if ((!this.a) && (localDomobAdView != null))
        {
          int i = DomobAdView.a(DomobAdView.c(DomobAdView.this)) / 1000;
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "Requesting a fresh ad because a request interval passed (" + i + " seconds).");
          }
          DomobAdView.a(DomobAdView.this, 0L);
          DomobAdView.c(DomobAdView.this).e();
        }
        return;
      }
      catch (Exception localException)
      {
        Log.e("DomobSDK", "exception caught in RefreshThread.run()!");
        localException.printStackTrace();
      }
    }
  }
  
  final class d
    implements Runnable
  {
    private DomobAdView a = DomobAdView.this;
    private h b;
    private int c;
    private boolean d;
    
    public d(h paramh, int paramInt, boolean paramBoolean)
    {
      this.b = paramh;
      this.c = paramInt;
      this.d = paramBoolean;
    }
    
    public final void run()
    {
      try
      {
        if ((this.a != null) && (this.b != null))
        {
          if (Log.isLoggable("DomobSDK", 3))
          {
            Log.d("DomobSDK", "show ad!");
            Log.d("DomobSDK", "WindowVisibility:" + DomobAdView.e(DomobAdView.this));
            Log.d("DomobSDK", "WindowFocus:" + DomobAdView.f(DomobAdView.this));
          }
          if ((DomobAdView.e(DomobAdView.this) == 0) && (DomobAdView.f(DomobAdView.this) == true))
          {
            this.b.setVisibility(4);
            this.a.addView(this.b);
            this.a.c();
            if (this.d)
            {
              DomobAdView.a(this.a, this.b);
              return;
            }
            if ((this.c != 0) || (!this.a.hasWindowFocus())) {
              return;
            }
            String str = this.b.b();
            if ((str != null) && (!str.equals("fr2l"))) {
              return;
            }
            DomobAdView.a(this.a, this.b, a.1.a(this.a));
            return;
          }
        }
      }
      catch (Exception localException)
      {
        Log.e("DomobSDK", "Unhandled exception in showAdThread.run() " + localException.getMessage());
        localException.printStackTrace();
        if (this.b != null)
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "error or view is invisible, clear resources!");
          }
          this.a.removeView(this.b);
          this.b.j();
          this.b = null;
          if (this.d)
          {
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "reset mNoAd");
            }
            DomobAdView.b(DomobAdView.this, true);
          }
        }
      }
    }
  }
  
  public final class e
    implements Runnable
  {
    protected e() {}
    
    public final void run()
    {
      if (DomobAdView.this != null)
      {
        if (!DomobAdView.c(DomobAdView.this).b()) {
          break label56;
        }
        if ((!DomobAdManager.isTestMode(DomobAdView.d(DomobAdView.this))) || (!DomobAdManager.isTestAllowed(DomobAdView.d(DomobAdView.this)))) {
          DomobAdView.this.setVisibility(8);
        }
      }
      return;
      label56:
      DomobAdView.this.setVisibility(0);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.DomobAdView
 * JD-Core Version:    0.7.0.1
 */