package net.youmi.android;

import android.content.Context;

class dy
{
  boolean a = false;
  Context b;
  private long c = 0L;
  private String d;
  private String e;
  private long f = 0L;
  private long g = 0L;
  private long h = 0L;
  private long i = 0L;
  
  dy(Context paramContext, cu paramcu, long paramLong1, long paramLong2)
  {
    if (paramcu == null)
    {
      this.a = true;
      return;
    }
    if (paramcu.s()) {
      this.a = true;
    }
    this.b = paramContext;
    this.d = paramcu.o();
    this.e = paramcu.k();
    this.c = paramcu.B();
    this.f = paramLong1;
    this.g = paramLong2;
    this.i = System.currentTimeMillis();
  }
  
  void a()
  {
    if (this.a) {
      return;
    }
    this.a = true;
    this.h = (System.currentTimeMillis() - this.i);
    try
    {
      new Thread(new bu(this)).start();
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dy
 * JD-Core Version:    0.7.0.1
 */