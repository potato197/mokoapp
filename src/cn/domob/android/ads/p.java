package cn.domob.android.ads;

import android.os.Handler;
import android.os.Message;

final class p
  extends Handler
{
  p(o paramo) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      o.i(this.a);
      return;
    }
    o.i(this.a);
    o.a(this.a, 11);
    try
    {
      o.j(this.a).postDelayed(new o.b(this.a), 600L);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.p
 * JD-Core Version:    0.7.0.1
 */