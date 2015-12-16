package net.youmi.android;

import android.app.Activity;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

class cb
  extends RelativeLayout
{
  TextView a;
  Activity b;
  String c;
  
  public cb(Activity paramActivity)
  {
    super(paramActivity);
    this.b = paramActivity;
    this.a = new TextView(paramActivity);
    this.a.setId(1011);
    Button localButton = new Button(paramActivity);
    localButton.setText("打开");
    localButton.setId(1017);
    localButton.setOnClickListener(new eg(this));
    RelativeLayout.LayoutParams localLayoutParams1 = h.a();
    localLayoutParams1.addRule(11);
    localLayoutParams1.addRule(15);
    RelativeLayout.LayoutParams localLayoutParams2 = h.c();
    localLayoutParams2.addRule(9);
    localLayoutParams2.addRule(0, localButton.getId());
    addView(localButton, localLayoutParams1);
    addView(this.a, localLayoutParams2);
  }
  
  void a(m paramm)
  {
    this.a.setText(paramm.d);
    this.c = paramm.e;
    setVisibility(0);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cb
 * JD-Core Version:    0.7.0.1
 */