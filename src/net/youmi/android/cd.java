package net.youmi.android;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;
import android.widget.TableRow.LayoutParams;

final class cd
  extends TableLayout
{
  Activity a;
  View b;
  View c;
  View d;
  View e;
  View f;
  bp g;
  ca h;
  dr i = new dr(this);
  
  public cd(Activity paramActivity, ca paramca, bp parambp)
  {
    super(paramActivity);
    this.a = paramActivity;
    this.g = parambp;
    this.h = paramca;
    e();
    d();
    setBackgroundDrawable(by.a(this.h));
  }
  
  private View a(View.OnClickListener paramOnClickListener)
  {
    View localView = new View(this.a);
    localView.setOnClickListener(paramOnClickListener);
    return localView;
  }
  
  private void d()
  {
    TableRow localTableRow = new TableRow(this.a);
    int j = this.h.b().a();
    int k = this.h.b().a();
    TableRow.LayoutParams localLayoutParams1 = new TableRow.LayoutParams(-2, -2);
    localLayoutParams1.column = 0;
    TableRow.LayoutParams localLayoutParams2 = new TableRow.LayoutParams(-2, -2);
    localLayoutParams2.column = 0;
    TableRow.LayoutParams localLayoutParams3 = new TableRow.LayoutParams(-2, -2);
    localLayoutParams3.column = 0;
    TableRow.LayoutParams localLayoutParams4 = new TableRow.LayoutParams(-2, -2);
    localLayoutParams4.column = 0;
    TableRow.LayoutParams localLayoutParams5 = new TableRow.LayoutParams(-2, -2);
    localLayoutParams5.column = 0;
    setStretchAllColumns(true);
    RelativeLayout localRelativeLayout1 = new RelativeLayout(this.a);
    RelativeLayout.LayoutParams localLayoutParams6 = h.a(j, k);
    localLayoutParams6.addRule(13);
    localRelativeLayout1.addView(this.c, localLayoutParams6);
    localTableRow.addView(localRelativeLayout1, localLayoutParams1);
    RelativeLayout localRelativeLayout2 = new RelativeLayout(this.a);
    RelativeLayout.LayoutParams localLayoutParams7 = h.a(j, k);
    localLayoutParams7.addRule(13);
    localRelativeLayout2.addView(this.d, localLayoutParams7);
    localTableRow.addView(localRelativeLayout2, localLayoutParams2);
    RelativeLayout localRelativeLayout3 = new RelativeLayout(this.a);
    RelativeLayout.LayoutParams localLayoutParams8 = h.a(j, k);
    localLayoutParams8.addRule(13);
    localRelativeLayout3.addView(this.e, localLayoutParams8);
    localTableRow.addView(localRelativeLayout3, localLayoutParams3);
    RelativeLayout localRelativeLayout4 = new RelativeLayout(this.a);
    RelativeLayout.LayoutParams localLayoutParams9 = h.a(j, k);
    localLayoutParams9.addRule(13);
    localRelativeLayout4.addView(this.b, localLayoutParams9);
    localTableRow.addView(localRelativeLayout4, localLayoutParams4);
    RelativeLayout localRelativeLayout5 = new RelativeLayout(this.a);
    RelativeLayout.LayoutParams localLayoutParams10 = h.a(j, k);
    localLayoutParams10.addRule(13);
    localRelativeLayout5.addView(this.f, localLayoutParams10);
    localTableRow.addView(localRelativeLayout5, localLayoutParams5);
    TableLayout.LayoutParams localLayoutParams = new TableLayout.LayoutParams(-1, -2);
    localLayoutParams.gravity = 17;
    addView(localTableRow, localLayoutParams);
  }
  
  private void e()
  {
    this.c = a(new bd(this));
    Drawable localDrawable1 = by.a(this.h, EMPTY_STATE_SET, ENABLED_STATE_SET, PRESSED_ENABLED_STATE_SET);
    Drawable localDrawable2;
    if (localDrawable1 == null)
    {
      this.c.setBackgroundDrawable(this.i.a());
      this.c.setClickable(true);
      this.d = a(new bg(this));
      localDrawable2 = by.b(this.h, EMPTY_STATE_SET, ENABLED_STATE_SET, PRESSED_ENABLED_STATE_SET);
      if (localDrawable2 != null) {
        break label257;
      }
      this.d.setBackgroundDrawable(this.i.b());
      label110:
      this.e = a(new bf(this));
      Drawable localDrawable3 = by.c(this.h, EMPTY_STATE_SET, ENABLED_STATE_SET, PRESSED_ENABLED_STATE_SET);
      if (localDrawable3 == null) {
        break label268;
      }
      this.e.setBackgroundDrawable(localDrawable3);
      label155:
      this.b = a(new bi(this));
      Drawable localDrawable4 = by.b(this.h, EMPTY_STATE_SET, PRESSED_ENABLED_STATE_SET);
      if (localDrawable4 == null) {
        break label285;
      }
      this.b.setBackgroundDrawable(localDrawable4);
    }
    for (;;)
    {
      this.f = a(new bh(this));
      Drawable localDrawable5 = by.a(this.h, EMPTY_STATE_SET, PRESSED_ENABLED_STATE_SET);
      if (localDrawable5 == null) {
        break label302;
      }
      this.f.setBackgroundDrawable(localDrawable5);
      return;
      this.c.setBackgroundDrawable(localDrawable1);
      break;
      label257:
      this.d.setBackgroundDrawable(localDrawable2);
      break label110;
      label268:
      this.e.setBackgroundDrawable(this.i.e());
      break label155;
      label285:
      this.b.setBackgroundDrawable(this.i.c());
    }
    label302:
    this.f.setBackgroundDrawable(this.i.d());
  }
  
  void a(d paramd)
  {
    this.c.setEnabled(paramd.f());
    this.d.setEnabled(paramd.e());
    this.e.setEnabled(paramd.d());
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cd
 * JD-Core Version:    0.7.0.1
 */