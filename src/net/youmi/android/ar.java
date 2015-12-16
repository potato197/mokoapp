package net.youmi.android;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

class ar
  extends RelativeLayout
{
  Button a;
  ai b;
  ca c;
  
  public ar(Activity paramActivity, ai paramai, ca paramca)
  {
    super(paramActivity);
    this.b = paramai;
    this.c = paramca;
    this.a = new Button(paramActivity);
    Drawable localDrawable = by.a(this.c, EMPTY_STATE_SET, PRESSED_ENABLED_STATE_SET);
    if (localDrawable != null) {
      this.a.setBackgroundDrawable(localDrawable);
    }
    for (;;)
    {
      this.a.setOnClickListener(new cp(this));
      RelativeLayout.LayoutParams localLayoutParams = h.a(this.c.b().a(), this.c.b().a());
      localLayoutParams.addRule(15);
      localLayoutParams.addRule(11);
      addView(this.a, localLayoutParams);
      setBackgroundDrawable(by.a(this.c));
      return;
      this.a.setText("返回");
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ar
 * JD-Core Version:    0.7.0.1
 */