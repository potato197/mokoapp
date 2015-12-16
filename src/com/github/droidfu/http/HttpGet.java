package com.github.droidfu.http;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.client.methods.HttpUriRequest;

class HttpGet
  extends BetterHttpRequest
{
  HttpGet(String paramString, HashMap<String, String> paramHashMap)
  {
    this.request = new org.apache.http.client.methods.HttpGet(paramString);
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.request.setHeader(str, (String)paramHashMap.get(str));
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.http.HttpGet
 * JD-Core Version:    0.7.0.1
 */