package com.baidu;

import java.util.Comparator;

class g
  implements Comparator<Ad>
{
  g(c paramc) {}
  
  public int a(Ad paramAd1, Ad paramAd2)
  {
    return (int)(Long.parseLong(paramAd1.m()) - Long.parseLong(paramAd2.m()));
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.g
 * JD-Core Version:    0.7.0.1
 */