package net.youmi.android;

import android.app.Activity;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import java.io.File;

class g
  extends RelativeLayout
{
  Activity a;
  ca b;
  co c;
  TextView d;
  TextView e;
  dk f;
  
  public g(Activity paramActivity, co paramco, ca paramca)
  {
    super(paramActivity);
    this.a = paramActivity;
    this.c = paramco;
    this.b = paramca;
    a();
  }
  
  void a()
  {
    this.d = new TextView(this.a);
    this.d.setId(1013);
    this.e = new TextView(this.a);
    this.e.setId(1014);
    this.f = new dk(this.a, this.b);
    this.f.setId(1016);
    RelativeLayout.LayoutParams localLayoutParams1 = h.a();
    localLayoutParams1.addRule(9);
    localLayoutParams1.addRule(10);
    RelativeLayout.LayoutParams localLayoutParams2 = h.a();
    localLayoutParams2.addRule(9);
    localLayoutParams2.addRule(3, this.d.getId());
    RelativeLayout.LayoutParams localLayoutParams3 = h.b(80 * this.b.d() / 100);
    localLayoutParams3.addRule(12);
    localLayoutParams3.addRule(3, this.e.getId());
    localLayoutParams3.setMargins(0, 10, 0, 10);
    addView(this.f, localLayoutParams3);
    addView(this.d, localLayoutParams1);
    addView(this.e, localLayoutParams2);
  }
  
  void a(ci paramci)
  {
    long l1;
    if (paramci != null)
    {
      if (!paramci.c.exists()) {
        break label139;
      }
      this.d.setText(paramci.a);
      l1 = paramci.c.length();
      if (paramci.d <= 0L) {
        break label107;
      }
      this.e.setText(l1 + "/" + paramci.d);
      long l2 = paramci.d;
      int i = (int)(l1 * 100L / l2);
      this.f.a(i);
    }
    for (;;)
    {
      setVisibility(0);
      return;
      label107:
      this.e.setText(l1);
      this.f.setVisibility(4);
      continue;
      label139:
      this.c.a();
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.g
 * JD-Core Version:    0.7.0.1
 */