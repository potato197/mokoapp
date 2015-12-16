package net.youmi.android;

import android.app.Activity;
import android.os.Handler;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

class cx
  extends FrameLayout
{
  private cu a;
  private ag b;
  private ea c;
  private at d;
  private l e;
  private bm f;
  private bb g;
  private AdView h;
  private fe i;
  private ca j;
  private Activity k;
  private int l;
  private int m;
  private int n;
  private FrameLayout.LayoutParams o;
  
  public cx(Activity paramActivity, AdView paramAdView, fe paramfe, ca paramca, int paramInt1, int paramInt2)
  {
    super(paramActivity);
    this.j = paramca;
    this.k = paramActivity;
    this.h = paramAdView;
    this.h = paramAdView;
    this.l = this.h.getAdWidth();
    this.m = this.h.getAdHeight();
    this.i = paramfe;
    a(paramInt1, paramInt2, paramAdView.d());
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.o = new FrameLayout.LayoutParams(this.l, this.m);
    this.n = paramInt2;
  }
  
  ag a()
  {
    if (this.b == null)
    {
      this.b = new ag(this, this.k, this.j, this.h.e(), this.n);
      this.b.setVisibility(8);
      addView(this.b, this.o);
    }
    return this.b;
  }
  
  void a(cu paramcu)
  {
    try
    {
      this.a = paramcu;
      Handler localHandler = getHandler();
      if (localHandler != null) {
        localHandler.post(new e(this));
      }
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  ea b()
  {
    if (this.c == null)
    {
      this.c = new ea(this, this.k, this.j, false);
      this.c.setBackgroundColor(this.h.d());
      this.c.setVisibility(8);
      addView(this.c, this.o);
    }
    return this.c;
  }
  
  at c()
  {
    if (this.d == null)
    {
      this.d = new at(this, this.k, this.j, this.h.e(), this.n);
      this.d.setVisibility(8);
      addView(this.d, this.o);
    }
    return this.d;
  }
  
  l d()
  {
    if (this.e == null)
    {
      this.e = new l(this, this.k, this.h.d());
      this.e.setVisibility(8);
      addView(this.e, this.o);
    }
    return this.e;
  }
  
  bm e()
  {
    if (this.f == null)
    {
      this.f = new bm(this, this.k, this.h);
      this.f.setVisibility(8);
      addView(this.f, this.o);
    }
    return this.f;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cx
 * JD-Core Version:    0.7.0.1
 */