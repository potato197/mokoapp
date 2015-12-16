package com.baidu;

import android.os.Handler;
import java.net.URL;

class ao
  extends Thread
{
  ao(an paraman) {}
  
  public void run()
  {
    if (this.a.a.getFullBmp() == null) {
      AppActivity.a(this.a.b.b, true);
    }
    try
    {
      this.a.a.setFullBmp(w.a(this.a.b.a, new URL(this.a.a.getFullUrl())));
      AppActivity.a(this.a.b.b, false);
      AppActivity.d(this.a.b.b).post(new ap(this));
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        AppActivity.a(this.a.b.b, false);
        bk.a(localException);
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.ao
 * JD-Core Version:    0.7.0.1
 */