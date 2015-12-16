package net.youmi.android;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import org.apache.http.HttpResponse;

class aq
  extends bj
{
  protected String a;
  protected ByteArrayOutputStream b;
  
  public aq(Context paramContext, String paramString)
  {
    super(paramContext, paramString);
  }
  
  protected boolean a()
  {
    this.b = new ByteArrayOutputStream(4096);
    this.k = this.b;
    return true;
  }
  
  protected boolean a(HttpResponse paramHttpResponse)
  {
    return true;
  }
  
  protected boolean b()
  {
    try
    {
      if (this.b != null) {
        if (this.f == null)
        {
          byte[] arrayOfByte = this.b.toByteArray();
          this.a = new String(arrayOfByte, "utf-8");
          if (this.a != null) {
            this.f = cv.c(this.a);
          }
          if (this.f != null)
          {
            this.f = this.f.trim().toLowerCase();
            if (!this.f.equals("utf-8")) {
              this.a = new String(arrayOfByte, this.f);
            }
          }
        }
        else
        {
          this.a = new String(this.b.toByteArray(), this.f);
        }
      }
    }
    catch (Exception localException)
    {
      this.m = 2;
    }
    for (;;)
    {
      return false;
      this.m = 2;
    }
    return true;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.aq
 * JD-Core Version:    0.7.0.1
 */