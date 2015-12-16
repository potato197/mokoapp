package com.mchenxin.moko.api.util;

import java.util.Hashtable;
import java.util.LinkedList;

public class RequestCache
{
  private static int CACHE_LIMIT = 40;
  private Hashtable<String, String> cache = new Hashtable();
  private LinkedList<String> history = new LinkedList();
  
  public String get(String paramString)
  {
    return (String)this.cache.get(paramString);
  }
  
  public void put(String paramString1, String paramString2)
  {
    this.history.add(paramString1);
    if (this.history.size() > CACHE_LIMIT)
    {
      String str = (String)this.history.poll();
      this.cache.remove(str);
    }
    this.cache.put(paramString1, paramString2);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mchenxin.moko.api.util.RequestCache
 * JD-Core Version:    0.7.0.1
 */