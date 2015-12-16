package com.baidu;

 enum k
{
  static
  {
    k[] arrayOfk = new k[8];
    arrayOfk[0] = a;
    arrayOfk[1] = b;
    arrayOfk[2] = c;
    arrayOfk[3] = d;
    arrayOfk[4] = e;
    arrayOfk[5] = f;
    arrayOfk[6] = g;
    arrayOfk[7] = h;
    i = arrayOfk;
  }
  
  private k() {}
  
  public static k[] a()
  {
    return (k[])i.clone();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.k
 * JD-Core Version:    0.7.0.1
 */