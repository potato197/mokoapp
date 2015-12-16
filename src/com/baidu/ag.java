package com.baidu;

class ag
{
  public int a;
  public int b;
  
  public ag(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.a);
    arrayOfObject[1] = Integer.valueOf(this.b);
    return String.format("Size(%s, %s)", arrayOfObject);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.ag
 * JD-Core Version:    0.7.0.1
 */