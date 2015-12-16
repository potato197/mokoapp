package cn.domob.android.ads;

import android.content.Context;
import android.util.Log;

final class m
  extends Thread
{
  private f a;
  
  public m(f paramf)
  {
    this.a = paramf;
  }
  
  public final void run()
  {
    i = 1;
    j = 0;
    if (this.a == null)
    {
      Log.e("DomobSDK", "DomobGetDcThread exit because adview is null.");
      return;
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "DomobGetDcThread start");
    }
    localContext = this.a.k();
    try
    {
      r localr = new r();
      localk = localr.a(localContext, this.a);
      if (localk != null) {
        break label257;
      }
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "detector is null.");
      }
      i locali = localr.a();
      if (locali == null) {
        break label397;
      }
      k = locali.e();
      if ((k < 200) || (k >= 300)) {
        break label214;
      }
      this.a.b(false);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        k localk;
        int k;
        label154:
        int m;
        if (DomobAdManager.getPublisherId(localContext) == null)
        {
          Log.e("DomobSDK", "Please set your publisher ID first!");
          localException.printStackTrace();
          return;
          if (!Log.isLoggable("DomobSDK", 3)) {
            break label392;
          }
          Log.d("DomobSDK", "connection return error:" + k + ", try again!");
          break label392;
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "success to get detector.");
          }
          m = localk.a();
          if (m != 0) {
            break label386;
          }
        }
        for (int n = 0;; n = i)
        {
          if (m != i) {
            this.a.a(m);
          }
          this.a.a(localk.b(), localk.c(), localk.d());
          this.a.b(false);
          i = n;
          break;
          this.a.c(true);
          return;
          Log.e("DomobSDK", "Unkown exception happened!" + localException.getMessage());
          break label208;
          j = i;
          break label154;
        }
        i = 0;
        continue;
        i = 0;
      }
    }
    if (DomobAdManager.j(localContext) == null)
    {
      Log.w("DomobSDK", "CID is null, continue detecting!");
      this.a.b(true);
      this.a.a(false);
      if (j != 0)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "request ad without delay.");
        }
        this.a.e();
        return;
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.m
 * JD-Core Version:    0.7.0.1
 */