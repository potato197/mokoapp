package net.youmi.android;

import android.content.Context;
import org.apache.http.HttpHost;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

abstract class dh
  implements dn
{
  private static String h;
  protected String a;
  protected String b;
  protected long c;
  protected long d = 0L;
  protected Context e;
  protected int f = -1;
  protected cc g;
  
  static String d()
  {
    if (h == null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Mozilla/5.0(Linux;U;");
      localStringBuilder.append(eh.c());
      localStringBuilder.append(";");
      localStringBuilder.append(eh.a());
      localStringBuilder.append(";");
      localStringBuilder.append(eh.b());
      localStringBuilder.append(") AppleWebkit/533.1(KHTML,like Gecko) Version/4.0 Mobile Safari/533.1");
      h = localStringBuilder.toString();
    }
    return h;
  }
  
  protected abstract int a();
  
  public int a(Context paramContext, String paramString)
  {
    try
    {
      this.e = paramContext;
      this.a = paramString;
      this.b = paramString;
      int i = a();
      if (i != 0) {
        return i;
      }
      int j = b();
      return j;
    }
    catch (Exception localException) {}
    return 4;
  }
  
  protected void a(long paramLong)
  {
    this.d = paramLong;
    this.f = 5;
    i();
  }
  
  protected abstract int b();
  
  protected HttpParams e()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpClientParams.setRedirecting(localBasicHttpParams, true);
    HttpProtocolParams.setUserAgent(localBasicHttpParams, d());
    HttpProtocolParams.setContentCharset(localBasicHttpParams, "utf-8");
    HttpProtocolParams.setHttpElementCharset(localBasicHttpParams, "utf-8");
    if (s.a(this.e).equals("cmwap")) {
      localBasicHttpParams.setParameter("http.route.default-proxy", new HttpHost("10.0.0.172", 80, "http"));
    }
    return localBasicHttpParams;
  }
  
  protected DefaultHttpClient f()
  {
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient(e());
    localDefaultHttpClient.setRedirectHandler(new cw(this));
    return localDefaultHttpClient;
  }
  
  public int g()
  {
    return this.f;
  }
  
  public String h()
  {
    return this.b;
  }
  
  protected void i()
  {
    if (this.g != null) {
      this.g.a(this);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dh
 * JD-Core Version:    0.7.0.1
 */