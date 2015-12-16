package net.youmi.android;

import android.app.Activity;
import android.webkit.DownloadListener;

class cj
  implements DownloadListener
{
  cj(aw paramaw) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Activity localActivity = this.a.b;
      aw localaw = this.a;
      if (this.a.c != null) {}
      for (String str = this.a.c.f();; str = null)
      {
        new i(localActivity, localaw, str).execute(new String[] { paramString1 });
        return;
      }
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cj
 * JD-Core Version:    0.7.0.1
 */