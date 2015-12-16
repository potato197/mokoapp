package com.baidu;

 enum bj
{
  static
  {
    bj[] arrayOfbj = new bj[4];
    arrayOfbj[0] = a;
    arrayOfbj[1] = b;
    arrayOfbj[2] = c;
    arrayOfbj[3] = d;
    e = arrayOfbj;
  }
  
  private bj() {}
  
  public static bj[] a()
  {
    return (bj[])e.clone();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.bj
 * JD-Core Version:    0.7.0.1
 */