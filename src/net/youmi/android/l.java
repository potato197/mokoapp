package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

class l
  extends RelativeLayout
  implements bb
{
  cr a;
  bx b;
  
  public l(cx paramcx, Activity paramActivity, int paramInt)
  {
    super(paramActivity);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(cx.a(paramcx), cx.b(paramcx));
    this.b = new bx(paramActivity, cx.a(paramcx), cx.b(paramcx), paramInt);
    addView(this.b, localLayoutParams);
  }
  
  public void a()
  {
    this.b.a();
    setVisibility(8);
  }
  
  public void a(Animation paramAnimation) {}
  
  public boolean a(cu paramcu)
  {
    if (paramcu == null) {}
    for (;;)
    {
      return false;
      try
      {
        this.a = null;
        if (paramcu.m() != null)
        {
          this.a = paramcu.m();
          return true;
        }
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  public void b()
  {
    try
    {
      this.b.a(this.a);
      return;
    }
    catch (Exception localException) {}
  }
  
  public void c()
  {
    setVisibility(0);
  }
  
  public void d()
  {
    try
    {
      this.b.a(this.a);
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.l
 * JD-Core Version:    0.7.0.1
 */