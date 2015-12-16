package net.youmi.android;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.util.ArrayList;

final class fg
  extends RelativeLayout
  implements ai, ff
{
  AdActivity a;
  private co b;
  private ar c;
  private ca d;
  
  public fg(AdActivity paramAdActivity, ca paramca)
  {
    super(paramAdActivity);
    this.a = paramAdActivity;
    this.d = paramca;
    this.b = new co(this.a, paramca);
    this.c = new ar(this.a, this, paramca);
    this.b.setId(1010);
    this.c.setId(1009);
    RelativeLayout.LayoutParams localLayoutParams1 = h.a(paramca.b().a());
    localLayoutParams1.addRule(12);
    addView(this.c, localLayoutParams1);
    RelativeLayout.LayoutParams localLayoutParams2 = h.b();
    localLayoutParams2.addRule(2, this.c.getId());
    addView(this.b, localLayoutParams2);
  }
  
  private void c()
  {
    try
    {
      ArrayList localArrayList = r.a();
      if ((localArrayList != null) && (localArrayList.size() > 0)) {
        r.b(this.a);
      }
    }
    catch (Exception localException)
    {
      label22:
      break label22;
    }
    this.a.a();
  }
  
  public void a()
  {
    c();
  }
  
  public View b()
  {
    return this;
  }
  
  public void b_()
  {
    c();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.fg
 * JD-Core Version:    0.7.0.1
 */