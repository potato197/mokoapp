package net.youmi.android;

import android.app.Activity;
import android.view.ViewGroup.LayoutParams;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import java.util.ArrayList;

class co
  extends LinearLayout
{
  Activity a;
  ca b;
  boolean c = false;
  boolean d = false;
  fa e;
  do f;
  ArrayList g;
  ArrayList h;
  ExpandableListView i;
  Runnable j = new ac(this);
  
  public co(Activity paramActivity, ca paramca)
  {
    super(paramActivity);
    this.a = paramActivity;
    this.b = paramca;
    this.h = r.b();
    this.g = r.a();
    b();
  }
  
  void a()
  {
    this.h = r.b();
    this.g = r.a();
    if (this.g == null) {
      r.e(this.a);
    }
    while (this.g.size() != 0) {
      return;
    }
    r.e(this.a);
  }
  
  protected void b()
  {
    this.i = new ExpandableListView(this.a);
    this.f = new do(this, this.a, this, this.b, this.i, this.h, this.g);
    this.i.setAdapter(this.f);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    addView(this.i, localLayoutParams);
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.e = new fa(new ad(this), -1);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    try
    {
      this.e.c();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean) {}
    try
    {
      this.e.b();
      return;
    }
    catch (Exception localException) {}
    this.e.a();
    return;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.co
 * JD-Core Version:    0.7.0.1
 */