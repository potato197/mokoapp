package cn.domob.android.ads;

import android.content.Context;
import android.util.Log;

final class l
  extends Thread
{
  private f a;
  
  public l(f paramf)
  {
    this.a = paramf;
  }
  
  public final void run()
  {
    if (this.a == null)
    {
      Log.e("DomobSDK", "GetAdThread exit because adview is null!");
      return;
    }
    Context localContext = this.a.k();
    int i;
    try
    {
      r localr = new r();
      if (localr.a(this.a, DomobAdManager.g(localContext), DomobAdManager.h(localContext)) == null)
      {
        this.a.n();
        i locali = localr.a();
        if (locali != null)
        {
          i = locali.e();
          if ((i < 200) || (i >= 300)) {
            break label147;
          }
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "connection is OK, continue ad request next time.");
          }
        }
      }
      this.a.a(false);
      this.a.c(true);
      return;
    }
    catch (Exception localException)
    {
      if (DomobAdManager.getPublisherId(localContext) != null) {
        break label198;
      }
    }
    Log.e("DomobSDK", "Please set your publisher ID first!");
    for (;;)
    {
      localException.printStackTrace();
      return;
      label147:
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "connection return error:" + i + ", try detector next time.");
      }
      this.a.b(true);
      break;
      label198:
      Log.e("DomobSDK", "Unkown exception happened!" + localException.getMessage());
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.l
 * JD-Core Version:    0.7.0.1
 */