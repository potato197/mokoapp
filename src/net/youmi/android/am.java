package net.youmi.android;

import java.net.URI;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.RedirectHandler;
import org.apache.http.protocol.HttpContext;

class am
  implements RedirectHandler
{
  am(ee paramee) {}
  
  public URI getLocationURI(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    Header localHeader;
    if (paramHttpResponse.containsHeader("location")) {
      localHeader = paramHttpResponse.getFirstHeader("location");
    }
    for (;;)
    {
      if (localHeader == null) {}
      String str;
      do
      {
        return null;
        if (paramHttpResponse.containsHeader("Location"))
        {
          localHeader = paramHttpResponse.getFirstHeader("Location");
          break;
        }
        if (!paramHttpResponse.containsHeader("LOCATION")) {
          break label109;
        }
        localHeader = paramHttpResponse.getFirstHeader("LOCATION");
        break;
        str = localHeader.getValue();
      } while (str == null);
      if (this.a != null) {
        this.a.a(str);
      }
      return URI.create(str);
      label109:
      localHeader = null;
    }
  }
  
  public boolean isRedirectRequested(HttpResponse paramHttpResponse, HttpContext paramHttpContext)
  {
    int i = paramHttpResponse.getStatusLine().getStatusCode();
    return (i == 301) || (i == 302) || (i == 303) || (i == 307);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.am
 * JD-Core Version:    0.7.0.1
 */