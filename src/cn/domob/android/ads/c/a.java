package cn.domob.android.ads.c;

import java.util.ArrayList;

public final class a
{
  private long a = -16777216L;
  private long b = -1L;
  private boolean c = false;
  private boolean d = false;
  private ArrayList<Integer> e = new ArrayList();
  
  public final long a()
  {
    return this.b;
  }
  
  public final void a(int paramInt)
  {
    this.b = (0xFF000000 | paramInt);
    this.d = true;
  }
  
  public final void a(int[] paramArrayOfInt)
  {
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      this.e.add(Integer.valueOf(paramArrayOfInt[i]));
    }
  }
  
  public final long b()
  {
    return this.a;
  }
  
  public final void b(int paramInt)
  {
    this.a = paramInt;
    this.c = true;
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public final boolean d()
  {
    return this.d;
  }
  
  public final ArrayList<Integer> e()
  {
    return this.e;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.c.a
 * JD-Core Version:    0.7.0.1
 */