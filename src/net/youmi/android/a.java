package net.youmi.android;

class a
{
  boolean a = false;
  boolean b = false;
  boolean c = false;
  private boolean d = false;
  private long e = 0L;
  
  boolean a()
  {
    return this.d;
  }
  
  boolean a(AdView paramAdView)
  {
    if ((this.d) && (System.currentTimeMillis() - this.e > 5000L)) {
      c();
    }
    try
    {
      paramAdView.postInvalidate();
      label30:
      return (!this.a) && (!this.b) && (!this.c) && (!this.d);
    }
    catch (Exception localException)
    {
      break label30;
    }
  }
  
  void b()
  {
    this.e = System.currentTimeMillis();
    this.d = true;
  }
  
  void c()
  {
    this.d = false;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.a
 * JD-Core Version:    0.7.0.1
 */