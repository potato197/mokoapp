package com.github.droidfu.http;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.util.EntityUtils;

public class BetterHttpResponse
{
  private HttpResponse response;
  private InputStream responseBody;
  
  public BetterHttpResponse(HttpResponse paramHttpResponse)
    throws IOException
  {
    this.response = paramHttpResponse;
    HttpEntity localHttpEntity = paramHttpResponse.getEntity();
    if (localHttpEntity != null) {
      this.responseBody = new BufferedHttpEntity(localHttpEntity).getContent();
    }
  }
  
  public String getHeader(String paramString)
  {
    if (!this.response.containsHeader(paramString)) {
      return null;
    }
    return this.response.getFirstHeader(paramString).getValue();
  }
  
  public InputStream getResponseBody()
    throws IOException
  {
    return this.responseBody;
  }
  
  public String getResponseBodyAsString()
    throws IOException
  {
    return EntityUtils.toString(this.response.getEntity());
  }
  
  public int getStatusCode()
  {
    return this.response.getStatusLine().getStatusCode();
  }
  
  public HttpResponse unwrap()
  {
    return this.response;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.http.BetterHttpResponse
 * JD-Core Version:    0.7.0.1
 */