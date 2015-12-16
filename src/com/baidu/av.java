package com.baidu;

import android.content.Context;
import java.io.IOException;
import java.lang.ref.WeakReference;

class av
  extends Thread
{
  av(at paramat, bl parambl) {}
  
  public void run()
  {
    try
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.a.b();
      arrayOfObject[1] = ax.a("3_1");
      String str = String.format("%s&extra=%s", arrayOfObject);
      bk.b("install log: " + str + "||" + this.a);
      w.d((Context)as.c(this.b.a).get(), str);
      return;
    }
    catch (IOException localIOException)
    {
      bk.a(localIOException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.av
 * JD-Core Version:    0.7.0.1
 */