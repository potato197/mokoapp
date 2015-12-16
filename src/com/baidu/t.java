package com.baidu;

 enum t
{
  private int d;
  
  static
  {
    t[] arrayOft = new t[3];
    arrayOft[0] = a;
    arrayOft[1] = b;
    arrayOft[2] = c;
    e = arrayOft;
  }
  
  private t(int paramInt)
  {
    this.d = paramInt;
  }
  
  public static t a(String paramString)
  {
    if (a.toString().equals(paramString.toLowerCase())) {
      return a;
    }
    if (b.toString().equals(paramString.toLowerCase())) {
      return b;
    }
    if (c.toString().equals(paramString.toLowerCase())) {
      return c;
    }
    return a;
  }
  
  public static t[] a()
  {
    return (t[])e.clone();
  }
  
  public int b()
  {
    return this.d;
  }
  
  public AdType c()
  {
    AdType localAdType = AdType.TEXT;
    switch (u.a[ordinal()])
    {
    default: 
      return localAdType;
    case 1: 
    case 2: 
      return AdType.TEXT;
    }
    return AdType.IMAGE;
  }
  
  public String toString()
  {
    return super.toString().toLowerCase();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.t
 * JD-Core Version:    0.7.0.1
 */