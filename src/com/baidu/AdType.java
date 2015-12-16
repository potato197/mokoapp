package com.baidu;

import java.io.PrintStream;

public enum AdType
{
  private int a;
  
  static
  {
    IMAGE = new AdType("IMAGE", 1, 2);
    AdType[] arrayOfAdType = new AdType[2];
    arrayOfAdType[0] = TEXT;
    arrayOfAdType[1] = IMAGE;
    b = arrayOfAdType;
  }
  
  private AdType(int paramInt)
  {
    this.a = paramInt;
  }
  
  public static void main(String[] paramArrayOfString)
  {
    for (AdType localAdType : ) {
      System.out.println(localAdType.toString());
    }
  }
  
  public static AdType parse(int paramInt)
  {
    if (TEXT.getValue() == paramInt) {
      return TEXT;
    }
    if (IMAGE.getValue() == paramInt) {
      return IMAGE;
    }
    return TEXT;
  }
  
  t a()
  {
    t localt = t.a;
    switch (v.a[ordinal()])
    {
    default: 
      return localt;
    case 1: 
      return t.a;
    }
    return t.b;
  }
  
  public int getValue()
  {
    return this.a;
  }
  
  public String toString()
  {
    return super.toString().toLowerCase();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.AdType
 * JD-Core Version:    0.7.0.1
 */