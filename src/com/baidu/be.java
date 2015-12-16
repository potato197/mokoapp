package com.baidu;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

class be
  extends Thread
{
  private be(GifAnimView paramGifAnimView) {}
  
  public void run()
  {
    if (GifAnimView.b(this.a) == null) {}
    label109:
    for (;;)
    {
      return;
      for (;;)
      {
        if (!GifAnimView.c(this.a)) {
          break label109;
        }
        if (!GifAnimView.d(this.a))
        {
          bb localbb = GifAnimView.b(this.a).d();
          GifAnimView.a(this.a, localbb.a);
          long l = localbb.b;
          if (GifAnimView.e(this.a) == null) {
            break;
          }
          Message localMessage = GifAnimView.e(this.a).obtainMessage();
          GifAnimView.e(this.a).sendMessage(localMessage);
          SystemClock.sleep(l);
          continue;
        }
        SystemClock.sleep(500L);
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.be
 * JD-Core Version:    0.7.0.1
 */