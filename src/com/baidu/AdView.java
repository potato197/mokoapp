package com.baidu;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public final class AdView
  extends RelativeLayout
{
  private static List<WeakReference<Context>> a = new ArrayList();
  private Handler b = new Handler();
  private l c;
  private boolean d;
  private Timer e;
  private String f;
  private t g;
  private int h = -11184811;
  private int i = 255;
  private int j = -1;
  private final int k = 30;
  private final s l = new x(this);
  private AdViewListener m = new y(this);
  private int n;
  private int o;
  private boolean p = true;
  private boolean q;
  
  public AdView(Context paramContext)
  {
    this(paramContext, AdType.TEXT);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0, AdType.TEXT);
  }
  
  AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt, AdType paramAdType)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFocusable(false);
    setClickable(false);
    a(paramContext);
    c.a(paramContext);
    if (paramAttributeSet != null)
    {
      String str = "http://schemas.android.com/apk/res/" + paramContext.getPackageName();
      setTextColor(Color.parseColor(paramAttributeSet.getAttributeValue(str, "textColor")));
      setBackgroundColor(Color.parseColor(paramAttributeSet.getAttributeValue(str, "backgroundColor")));
      setBackgroundTransparent(paramAttributeSet.getAttributeIntValue(str, "backgroundTransparent", this.i));
      paramAdType = AdType.parse(paramAttributeSet.getAttributeUnsignedIntValue(str, "adType", AdType.TEXT.getValue()));
    }
    a(paramAdType.a());
    b();
  }
  
  public AdView(Context paramContext, AdType paramAdType)
  {
    this(paramContext, null, 0, paramAdType);
  }
  
  private ag a(int paramInt1, int paramInt2, Ad paramAd)
  {
    int i1 = r.i(getContext());
    int i2 = r.h(getContext());
    if ((d() == t.a) || (d() == t.c))
    {
      if ((paramInt1 == 0) || (paramInt1 == -2)) {
        paramInt1 = i1;
      }
      if ((paramInt1 < 200) && (paramInt1 != -1)) {
        paramInt1 = 200;
      }
      if ((paramInt2 == 0) || (paramInt2 == -2)) {
        paramInt2 = (int)(0.15F * Math.min(i1, i2));
      }
      if ((paramInt2 < 30) && (paramInt2 != -1)) {
        paramInt2 = 30;
      }
    }
    for (;;)
    {
      return new ag(paramInt1, paramInt2);
      if (d() == t.b)
      {
        paramInt2 = (int)(paramAd.c().getHeight() / paramAd.c().getWidth() * Math.min(i1, i2));
        if (paramInt2 == i1)
        {
          paramInt2 = (int)(0.15F * i1);
          paramInt1 = i1;
        }
        else
        {
          paramInt1 = i1;
        }
      }
    }
  }
  
  private void a(Context paramContext)
  {
    r.m(paramContext);
    for (int i1 = 0;; i1++)
    {
      int i2 = a.size();
      int i3 = 0;
      if (i1 < i2)
      {
        if (((WeakReference)a.get(i1)).get() == paramContext) {
          i3 = 1;
        }
      }
      else
      {
        if (i3 == 0) {
          break;
        }
        throw new SecurityException("More than one AdView instance in an activity!");
      }
    }
    a.add(new WeakReference(paramContext));
  }
  
  private void a(t paramt)
  {
    this.g = paramt;
  }
  
  private void a(String paramString)
  {
    this.f = paramString;
  }
  
  private void a(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
  
  private void b()
  {
    new z(this, this).start();
  }
  
  private void b(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  private AdViewListener c()
  {
    return this.m;
  }
  
  private void c(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      bk.b("Timer Start");
      if (this.e != null) {
        this.e.cancel();
      }
      this.e = new Timer();
      this.e.schedule(new ac(this), 30000L, 30000L);
    }
    while (this.e == null) {
      return;
    }
    bk.b("Timer Cancel");
    this.e.cancel();
    this.e = null;
  }
  
  private t d()
  {
    return this.g;
  }
  
  private void d(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  private int e()
  {
    return 30;
  }
  
  private void f()
  {
    if ((!p()) || (getVisibility() != 0)) {
      return;
    }
    bk.b("AdView.refresh");
    g();
    h();
  }
  
  private void g()
  {
    if (!p()) {
      return;
    }
    c(false);
    d(false);
  }
  
  private void h()
  {
    if ((!p()) || (getVisibility() != 0)) {
      return;
    }
    bk.b("AdView.start", "AdSrc:" + d());
    k();
    c(true);
  }
  
  private boolean i()
  {
    bk.b("AdView.hasSpam =>");
    if (c.a().f())
    {
      bk.c("AdView", "没有可展示的推广 (No ad to show)");
      return true;
    }
    if (c.a().e())
    {
      bk.c("AdView", "App已被搁置 (App is hanged up)");
      return true;
    }
    for (ViewParent localViewParent = getParent(); localViewParent != null; localViewParent = localViewParent.getParent()) {
      if (((localViewParent instanceof View)) && (((View)localViewParent).getVisibility() != 0))
      {
        bk.c("AdView", "AdView的一个祖先控件不为 View.VISIBLE (One of AdView's ancestor is not View.VISIBLE)");
        return true;
      }
    }
    int[] arrayOfInt = new int[2];
    getLocationOnScreen(arrayOfInt);
    Rect localRect1 = new Rect(arrayOfInt[0], arrayOfInt[1], arrayOfInt[0] + getWidth(), arrayOfInt[1] + getHeight());
    bk.b("AdView thisBox", localRect1.toShortString());
    if ((getContext() instanceof Activity))
    {
      Rect localRect2 = new Rect(0, ((Activity)getContext()).getWindow().findViewById(16908290).getTop(), r.i(getContext()), r.h(getContext()));
      bk.b("AdView availBox", localRect2.toShortString());
      if (!localRect2.contains(localRect1))
      {
        bk.c("AdView", "推广边界不完全在窗口内 (Ad is not in window)");
        a(false);
        int i1 = this.o;
        this.o = (i1 + 1);
        if (i1 < 2) {}
        return true;
      }
      a(true);
    }
    if ((getContext() instanceof Activity)) {}
    return false;
  }
  
  private void j()
  {
    setBackgroundTransparent(this.i);
    if (l() != null)
    {
      if (a())
      {
        l().setClickable(false);
        l().setFocusable(false);
      }
    }
    else {
      return;
    }
    l().setClickable(true);
    l().setFocusable(true);
  }
  
  private void k()
  {
    bk.b("requestFreshAd");
    try
    {
      b(i());
      if (this.d)
      {
        bk.b("Ignoring requestFreshAd() because we are already getting a fresh ad.");
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bk.a("requestFreshAd", localException);
      }
      if (getVisibility() != 0)
      {
        g();
        return;
      }
      d(true);
      this.b.post(new ab(this, this));
    }
  }
  
  private l l()
  {
    return this.c;
  }
  
  private void m()
  {
    if ((l() != null) && (l().d())) {
      new ae(this, l().h(), l().c()).start();
    }
  }
  
  private String n()
  {
    return this.f;
  }
  
  private s o()
  {
    return this.l;
  }
  
  private boolean p()
  {
    return l() != null;
  }
  
  boolean a()
  {
    return this.q;
  }
  
  public AdType getAdType()
  {
    return this.g.c();
  }
  
  public int getBackgroundColor()
  {
    return this.h;
  }
  
  public int getBackgroundTransparent()
  {
    return this.i;
  }
  
  public int getTextColor()
  {
    return this.j;
  }
  
  public int getVisibility()
  {
    return this.n;
  }
  
  public boolean isInWindow()
  {
    return this.p;
  }
  
  protected void onDetachedFromWindow()
  {
    bk.b("AdView.onDetachedFromWindow");
    if (!p()) {
      return;
    }
    m();
    c.a().a(d(), e());
    super.onDetachedFromWindow();
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    this.n = paramInt;
    super.onWindowVisibilityChanged(paramInt);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    arrayOfObject[1] = Integer.valueOf(getWidth());
    arrayOfObject[2] = Integer.valueOf(getHeight());
    bk.b("AdView.onWindowVisibilityChanged", String.format("visibility: %s dim(%d, %d)", arrayOfObject));
    if (!p()) {}
    do
    {
      return;
      if (paramInt != 0) {
        break;
      }
    } while ((getWidth() == 0) || (getHeight() == 0));
    c(true);
    return;
    g();
    c.a().a(d(), e());
  }
  
  public void refresh()
  {
    if ((!p()) || (!r.c(getContext())))
    {
      bk.b("AdView.refresh", "Not in TestMode or not inited");
      return;
    }
    f();
  }
  
  public void setAlpha(float paramFloat)
  {
    bk.b("AdView.setAlpha", "override, do nothing");
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.h = paramInt;
    if (l() != null) {
      l().setBackgroundColor(paramInt);
    }
  }
  
  public void setBackgroundTransparent(int paramInt)
  {
    if (paramInt > 255) {
      paramInt = 255;
    }
    for (;;)
    {
      this.i = paramInt;
      if (l() != null)
      {
        l locall = l();
        if (a()) {
          paramInt = 0;
        }
        locall.b(paramInt);
      }
      return;
      if (paramInt < 127) {
        paramInt = 127;
      }
    }
  }
  
  public void setListener(AdViewListener paramAdViewListener)
  {
    this.m = paramAdViewListener;
  }
  
  public void setTextColor(int paramInt)
  {
    this.j = paramInt;
    if (l() != null) {
      l().a(paramInt);
    }
  }
  
  public void setVisibility(int paramInt)
  {
    if (getVisibility() == paramInt) {}
    do
    {
      return;
      this.n = paramInt;
      super.setVisibility(paramInt);
      bk.b("AdView.setVisibility", "visibility:" + paramInt);
    } while (!p());
    try
    {
      int i1 = getChildCount();
      for (int i2 = 0; i2 < i1; i2++) {
        getChildAt(i2).setVisibility(paramInt);
      }
      if (paramInt != 0) {
        m();
      }
      onWindowVisibilityChanged(paramInt);
      return;
    }
    finally {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.AdView
 * JD-Core Version:    0.7.0.1
 */