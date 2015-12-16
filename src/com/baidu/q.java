package com.baidu;

import android.content.Context;
import java.util.TimerTask;

class q
  extends TimerTask
{
  private Context b;
  private s c;
  private String d;
  
  public q(o paramo) {}
  
  public void a(Context paramContext, String paramString, s params)
  {
    this.b = paramContext;
    this.d = paramString;
    this.c = params;
  }
  
  public void run()
  {
    if ((this.b == null) || (this.c == null) || (this.d == null))
    {
      bk.b("context == " + this.b + " action == " + this.c + " indexer== " + this.d);
      return;
    }
    bk.b("AdRequestWrapper.run", o.a(this.a).toString());
    new p(this.a, this.b, this.d, this.c).start();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.q
 * JD-Core Version:    0.7.0.1
 */