package net.youmi.android;

class dx
  implements Runnable
{
  private boolean a = false;
  private boolean b = false;
  private int c = -1;
  private int d = -1;
  private int e = 0;
  private int f = 0;
  private aa g;
  private fa h;
  
  dx(fa paramfa, aa paramaa, int paramInt)
  {
    this.h = paramfa;
    this.g = paramaa;
    this.c = paramInt;
  }
  
  void a()
  {
    this.b = true;
    this.d = -1;
  }
  
  void b()
  {
    this.a = false;
  }
  
  void c()
  {
    this.a = true;
  }
  
  void d()
  {
    this.b = false;
  }
  
  public void run()
  {
    for (;;)
    {
      try
      {
        if (!this.a) {
          return;
        }
        if (this.b)
        {
          this.e = (1 + this.e);
          if ((this.d <= 0) || (this.e < this.d)) {
            continue;
          }
          if (this.g == null) {
            return;
          }
          this.g.c(this.h);
          return;
        }
      }
      catch (Exception localException1)
      {
        return;
      }
      try
      {
        aa localaa2 = this.g;
        if (localaa2 == null) {}
      }
      catch (Exception localException2)
      {
        try
        {
          this.g.a(this.h);
          for (;;)
          {
            label90:
            long l1 = 1000L;
            try
            {
              aa localaa1 = this.g;
              if (localaa1 == null) {}
            }
            catch (Exception localException3)
            {
              long l2;
              label123:
              break label127;
            }
            try
            {
              l2 = this.g.b(this.h);
              l1 = l2;
            }
            catch (Exception localException4)
            {
              break label123;
            }
            Thread.sleep(l1);
            label127:
            this.f = (1 + this.f);
            if ((this.c <= 0) || (this.f < this.c)) {
              break;
            }
            if (this.g == null) {
              return;
            }
            this.g.c(this.h);
            return;
            localException2 = localException2;
          }
        }
        catch (Exception localException5)
        {
          break label90;
        }
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dx
 * JD-Core Version:    0.7.0.1
 */