package net.youmi.android;

class fa
{
  private static int g = -1;
  Thread a;
  aa b;
  dx c;
  final int d;
  int e;
  int f;
  
  fa(aa paramaa, int paramInt)
  {
    int i = 1 + g;
    g = i;
    this.d = i;
    this.e = 0;
    this.f = 0;
    try
    {
      this.b = paramaa;
      this.c = new dx(this, this.b, paramInt);
      this.a = new Thread(this.c);
      d();
      return;
    }
    catch (Exception localException)
    {
      while (this.b == null) {}
      this.b.c(this);
    }
  }
  
  private void d()
  {
    this.c.c();
    this.a.start();
  }
  
  void a()
  {
    this.c.a();
  }
  
  void b()
  {
    this.c.d();
  }
  
  void c()
  {
    this.c.b();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.fa
 * JD-Core Version:    0.7.0.1
 */