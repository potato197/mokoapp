package net.youmi.android;

import android.app.Activity;
import android.widget.FrameLayout;

class dt
  extends FrameLayout
{
  static int e = -1;
  Activity a;
  ca b;
  g c;
  cb d;
  protected int f;
  private int g;
  private int h = -1;
  
  public dt(Activity paramActivity, co paramco, ca paramca)
  {
    super(paramActivity);
    int i = 1 + e;
    e = i;
    this.f = i;
    this.a = paramActivity;
    this.b = paramca;
    this.c = new g(this.a, paramco, this.b);
    addView(this.c);
    this.d = new cb(this.a);
    addView(this.d);
  }
  
  void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  void a(ci paramci)
  {
    this.g = 0;
    if (this.d != null) {
      this.d.setVisibility(8);
    }
    this.c.a(paramci);
  }
  
  void a(m paramm)
  {
    this.g = 1;
    if (this.c != null) {
      this.c.setVisibility(8);
    }
    this.d.a(paramm);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dt
 * JD-Core Version:    0.7.0.1
 */