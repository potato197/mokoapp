package com.baidu;

import android.os.Handler;
import android.os.Message;

class bc
  extends Handler
{
  bc(GifAnimView paramGifAnimView) {}
  
  public void handleMessage(Message paramMessage)
  {
    this.a.invalidate();
    bk.b("redrawHandler.handleMessage");
    if (GifAnimView.a(this.a) != null) {
      GifAnimView.a(this.a).a();
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.bc
 * JD-Core Version:    0.7.0.1
 */