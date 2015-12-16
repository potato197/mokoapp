package net.youmi.android;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class db
  implements DialogInterface.OnClickListener
{
  db(c paramc) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface.cancel();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.db
 * JD-Core Version:    0.7.0.1
 */