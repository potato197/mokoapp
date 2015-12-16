package net.youmi.android;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Gallery;

class u
  implements View.OnClickListener
{
  u(cf paramcf) {}
  
  public void onClick(View paramView)
  {
    try
    {
      if (cf.e(this.a) != null)
      {
        if (cf.e(this.a).getVisibility() == 0)
        {
          cf.e(this.a).setVisibility(4);
          return;
        }
        cf.e(this.a).setVisibility(0);
        return;
      }
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.u
 * JD-Core Version:    0.7.0.1
 */