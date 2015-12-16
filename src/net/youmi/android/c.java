package net.youmi.android;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.AsyncTask;

class c
  extends AsyncTask
{
  Context a;
  
  c(Context paramContext)
  {
    this.a = paramContext;
  }
  
  protected dm a(String... paramVarArgs)
  {
    try
    {
      dm localdm = av.a(this.a);
      return localdm;
    }
    catch (Exception localException) {}
    return null;
  }
  
  protected void a(dm paramdm)
  {
    super.onPostExecute(paramdm);
    if (paramdm == null) {
      return;
    }
    try
    {
      if (paramdm.e == null) {
        if (paramdm.b != null) {
          break label91;
        }
      }
      label91:
      for (paramdm.e = "是否更新到最新版本?";; paramdm.e = ("是否将版本更新到最新的" + paramdm.b + "?"))
      {
        new AlertDialog.Builder(this.a).setTitle("应用程序有新版本更新").setMessage(paramdm.e).setCancelable(false).setNegativeButton("以后再说", new db(this)).setPositiveButton("立即更新", new dc(this, paramdm)).create().show();
        return;
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.c
 * JD-Core Version:    0.7.0.1
 */