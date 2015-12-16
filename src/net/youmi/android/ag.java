package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

class ag
  extends RelativeLayout
  implements bb
{
  ca a;
  Activity b;
  int c;
  dg d;
  ea e;
  
  public ag(cx paramcx, Activity paramActivity, ca paramca, int paramInt1, int paramInt2)
  {
    super(paramActivity);
    this.a = paramca;
    this.b = paramActivity;
    this.c = paramInt2;
    a(paramActivity, paramInt1);
  }
  
  private void a(Activity paramActivity, int paramInt)
  {
    if (this.d == null)
    {
      this.d = new dg(this.f, paramActivity, paramInt, this.a, this.c);
      this.d.setVisibility(0);
    }
    if (this.e == null)
    {
      this.e = new ea(this.f, paramActivity, this.a, true);
      this.e.setVisibility(0);
    }
    this.e.setId(1000);
    this.d.setId(1001);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(this.a.a().c().b(), this.a.a().c().b());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, this.c);
    int i = this.a.a().c().a();
    localLayoutParams1.addRule(9);
    localLayoutParams1.addRule(15);
    localLayoutParams1.setMargins(i, i, 0, i);
    localLayoutParams2.addRule(1, this.e.getId());
    localLayoutParams2.addRule(15);
    addView(this.e, localLayoutParams1);
    addView(this.d, localLayoutParams2);
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
        if ((paramcu.e() != null) && (this.e.a(paramcu)))
        {
          boolean bool = this.d.a(paramcu);
          if (bool) {
            return true;
          }
        }
      }
      catch (Exception localException)
      {
        f.a(localException);
      }
    }
    return false;
  }
  
  public void b()
  {
    this.e.b();
    this.d.b();
  }
  
  public void c()
  {
    setVisibility(0);
  }
  
  public void d()
  {
    this.e.d();
    this.d.d();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ag
 * JD-Core Version:    0.7.0.1
 */