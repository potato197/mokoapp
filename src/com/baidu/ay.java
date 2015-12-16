package com.baidu;

 enum ay
{
  static
  {
    ay[] arrayOfay = new ay[3];
    arrayOfay[0] = a;
    arrayOfay[1] = b;
    arrayOfay[2] = c;
    d = arrayOfay;
  }
  
  private ay() {}
  
  public static ay[] a()
  {
    return (ay[])d.clone();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.ay
 * JD-Core Version:    0.7.0.1
 */