package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

class bm
  extends RelativeLayout
  implements bb
{
  private aw b;
  private Activity c;
  private AdView d;
  private em e;
  
  public bm(cx paramcx, Activity paramActivity, AdView paramAdView)
  {
    super(paramActivity);
    this.c = paramActivity;
    this.d = paramAdView;
  }
  
  private void e()
  {
    if (this.b == null)
    {
      this.b = new aw(this.c, null);
      RelativeLayout.LayoutParams localLayoutParams = h.a(this.d.getAdWidth(), this.d.getAdHeight());
      this.b.setClickable(false);
      this.b.setScrollContainer(false);
      addView(this.b, localLayoutParams);
    }
  }
  
  public void a()
  {
    setVisibility(8);
  }
  
  public void a(Animation paramAnimation) {}
  
  public boolean a(cu paramcu)
  {
    try
    {
      e();
      if (paramcu != null)
      {
        em localem = paramcu.j();
        if (localem != null)
        {
          this.e = localem;
          return true;
        }
      }
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
    return false;
  }
  
  public void b()
  {
    e();
    try
    {
      this.b.a(this.e);
      setVisibility(0);
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
    e();
    try
    {
      this.b.a(this.e);
      setVisibility(0);
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.bm
 * JD-Core Version:    0.7.0.1
 */