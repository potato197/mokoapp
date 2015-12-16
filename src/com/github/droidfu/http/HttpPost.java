package com.github.droidfu.http;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.HttpUriRequest;

class HttpPost
  extends BetterHttpRequest
{
  HttpPost(String paramString, HttpEntity paramHttpEntity, HashMap<String, String> paramHashMap)
  {
    this.request = new org.apache.http.client.methods.HttpPost(paramString);
    ((HttpEntityEnclosingRequest)this.request).setEntity(paramHttpEntity);
    this.request.setHeader("Content-Type", paramHttpEntity.getContentType().getValue());
    Iterator localIterator = paramHashMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      this.request.setHeader(str, (String)paramHashMap.get(str));
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.http.HttpPost
 * JD-Core Version:    0.7.0.1
 */