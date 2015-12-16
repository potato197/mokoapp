package net.youmi.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

class dc
  implements DialogInterface.OnClickListener
{
  dc(c paramc, dm paramdm) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      Toast.makeText(this.a.a, "开始下载更新.", 0).show();
      try
      {
        label16:
        fd.a(this.a.a, this.b);
        return;
      }
      catch (Exception localException2) {}
    }
    catch (Exception localException1)
    {
      break label16;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dc
 * JD-Core Version:    0.7.0.1
 */