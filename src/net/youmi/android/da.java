package net.youmi.android;

import android.app.Activity;
import android.text.TextUtils.TruncateAt;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

class da
  extends RelativeLayout
{
  TextView a;
  TextView b;
  
  public da(cx paramcx, Activity paramActivity, int paramInt1, ca paramca, int paramInt2)
  {
    super(paramActivity);
    this.a = new TextView(paramActivity);
    this.a.setEllipsize(TextUtils.TruncateAt.MARQUEE);
    this.a.setFocusable(true);
    this.a.setFocusableInTouchMode(true);
    this.a.setMarqueeRepeatLimit(-1);
    this.a.setTextColor(paramInt1);
    this.a.setId(1018);
    this.a.setTextSize(paramca.i().b());
    this.a.setSingleLine(true);
    this.a.setWidth(paramInt2);
    this.b = new TextView(paramActivity);
    this.b.setSingleLine(true);
    this.b.setTextColor(paramInt1);
    this.b.setTextSize(paramca.i().c());
    this.b.setId(1019);
    RelativeLayout.LayoutParams localLayoutParams1 = h.b(paramInt2);
    RelativeLayout.LayoutParams localLayoutParams2 = h.b(paramInt2);
    localLayoutParams1.addRule(10);
    localLayoutParams1.addRule(9);
    localLayoutParams2.addRule(3, this.a.getId());
    localLayoutParams2.addRule(9);
    addView(this.a, localLayoutParams1);
    addView(this.b, localLayoutParams2);
  }
  
  boolean a(cu paramcu)
  {
    if (paramcu == null) {}
    Object localObject1;
    String str;
    Object localObject2;
    for (;;)
    {
      return false;
      try
      {
        if ((paramcu.b() == 1) || (paramcu.b() == 0))
        {
          localObject1 = paramcu.c();
          str = paramcu.d();
          if (localObject1 != null) {
            localObject1 = ((String)localObject1).trim();
          }
          if (((String)localObject1).length() == 0) {
            localObject1 = null;
          }
          if (str != null) {
            str = str.trim();
          }
          if (str.length() != 0) {
            break;
          }
          localObject2 = null;
        }
      }
      catch (Exception localException)
      {
        label76:
        return false;
      }
    }
    if ((localObject1 != null) && (localObject2 != null))
    {
      this.a.setSingleLine(true);
      this.b.setLines(1);
      this.b.setVisibility(0);
      this.a.setText((CharSequence)localObject1);
      this.b.setText((CharSequence)localObject2);
      return true;
    }
    for (;;)
    {
      label128:
      this.a.setMaxLines(2);
      this.a.setSingleLine(false);
      this.a.setGravity(17);
      this.a.setText((CharSequence)localObject1);
      this.b.setVisibility(8);
      return true;
      do
      {
        localObject1 = localObject2;
        break label128;
        localObject2 = str;
        if (localObject1 != null) {
          break label76;
        }
        if (localObject2 == null) {
          break;
        }
        break label76;
      } while (localObject1 == null);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.da
 * JD-Core Version:    0.7.0.1
 */