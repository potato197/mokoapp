package net.youmi.android;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

class ex
  extends RelativeLayout
  implements bp, ff, o
{
  private aw a;
  private cd b;
  private AdActivity c;
  private ca d;
  
  public ex(AdActivity paramAdActivity, ca paramca)
  {
    super(paramAdActivity);
    this.c = paramAdActivity;
    this.d = paramca;
    f();
    g();
  }
  
  public void a()
  {
    this.a.b();
  }
  
  public void a(d paramd)
  {
    try
    {
      this.b.a(paramd);
      return;
    }
    catch (Exception localException) {}
  }
  
  void a(em paramem)
  {
    try
    {
      this.a.a(paramem);
      return;
    }
    catch (Exception localException) {}
  }
  
  public void a_()
  {
    this.a.d();
  }
  
  public View b()
  {
    return this;
  }
  
  public void b_()
  {
    if (this.a.c())
    {
      this.a.b();
      return;
    }
    d();
  }
  
  public void c()
  {
    this.a.a();
  }
  
  public void d()
  {
    try
    {
      new Thread(new dz(this)).start();
      label18:
      this.c.a();
      return;
    }
    catch (Exception localException)
    {
      break label18;
    }
  }
  
  public void e()
  {
    be.a(this.c);
  }
  
  void f()
  {
    this.a = new aw(this.c, this.c.a, this);
    this.a.setId(1005);
    this.b = new cd(this.c, this.d, this);
    this.b.setId(1006);
  }
  
  void g()
  {
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams1.addRule(2, this.b.getId());
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, this.d.b().a());
    localLayoutParams2.addRule(12);
    addView(this.b, localLayoutParams2);
    addView(this.a, localLayoutParams1);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ex
 * JD-Core Version:    0.7.0.1
 */