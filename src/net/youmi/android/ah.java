package net.youmi.android;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageSwitcher;

class ah
  implements AdapterView.OnItemClickListener
{
  ah(cf paramcf) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    try
    {
      as localas = cf.a(this.a).a(paramInt);
      if ((localas != null) && (cf.b(this.a) != localas))
      {
        cf.c(this.a);
        cf.d(this.a).setImageURI(localas.b);
        cf.a(this.a, localas);
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ah
 * JD-Core Version:    0.7.0.1
 */