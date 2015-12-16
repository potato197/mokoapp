package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

class at
  extends RelativeLayout
  implements bb
{
  ca a;
  int b = -1;
  Activity c;
  int d;
  dg e;
  
  public at(cx paramcx, Activity paramActivity, ca paramca, int paramInt1, int paramInt2)
  {
    super(paramActivity);
    this.a = paramca;
    this.b = paramInt1;
    this.c = paramActivity;
    this.d = paramInt2;
    e();
  }
  
  private void e()
  {
    if (this.e == null)
    {
      this.e = new dg(this.f, this.c, this.b, this.a, this.d);
      this.e.setVisibility(0);
    }
    this.e.setId(1003);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    this.a.a().c().b();
    localLayoutParams.addRule(9);
    localLayoutParams.addRule(15);
    addView(this.e, localLayoutParams);
  }
  
  public void a()
  {
    setVisibility(8);
  }
  
  public void a(Animation paramAnimation)
  {
    try
    {
      startAnimation(paramAnimation);
      return;
    }
    catch (Exception localException) {}
  }
  
  public boolean a(cu paramcu)
  {
    if (paramcu == null) {}
    for (;;)
    {
      return false;
      try
      {
        boolean bool = this.e.a(paramcu);
        if (bool) {
          return true;
        }
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  public void b()
  {
    this.e.b();
  }
  
  public void c()
  {
    setVisibility(0);
  }
  
  public void d()
  {
    this.e.d();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.at
 * JD-Core Version:    0.7.0.1
 */