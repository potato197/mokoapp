package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

class dg
  extends FrameLayout
  implements bb
{
  da a;
  da b;
  da c;
  Animation d;
  Animation e;
  int f;
  
  public dg(cx paramcx, Activity paramActivity, int paramInt1, ca paramca, int paramInt2)
  {
    super(paramActivity);
    this.f = paramInt2;
    this.a = new da(paramcx, paramActivity, paramInt1, paramca, paramInt2);
    this.a.setGravity(17);
    this.b = new da(paramcx, paramActivity, paramInt1, paramca, paramInt2);
    this.b.setGravity(17);
    this.a.setVisibility(8);
    this.b.setVisibility(8);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt2, -2);
    localLayoutParams.gravity = 16;
    localLayoutParams.leftMargin = paramca.a(10);
    addView(this.a, localLayoutParams);
    addView(this.b, localLayoutParams);
    this.d = aj.a(paramca);
    this.e = aj.b(paramca);
  }
  
  public void a()
  {
    setVisibility(8);
  }
  
  public void a(Animation paramAnimation)
  {
    try
    {
      a(paramAnimation);
      return;
    }
    catch (Exception localException) {}
  }
  
  public boolean a(cu paramcu)
  {
    try
    {
      da localda = e();
      boolean bool1 = false;
      if (localda != null)
      {
        boolean bool2 = localda.a(paramcu);
        bool1 = bool2;
      }
      return bool1;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public void b()
  {
    try
    {
      da localda = e();
      if (localda == null) {
        return;
      }
      if (this.c != null) {
        this.c.setVisibility(8);
      }
      localda.setVisibility(0);
      this.c = localda;
      c();
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  public void c()
  {
    setVisibility(0);
  }
  
  public void d()
  {
    da localda = e();
    if (localda == null) {
      return;
    }
    if (this.c != null)
    {
      this.c.startAnimation(this.e);
      this.c.setVisibility(8);
    }
    localda.setVisibility(0);
    localda.startAnimation(this.d);
    this.c = localda;
  }
  
  da e()
  {
    if (this.a == this.c) {
      return this.b;
    }
    return this.a;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dg
 * JD-Core Version:    0.7.0.1
 */