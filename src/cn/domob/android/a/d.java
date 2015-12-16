package cn.domob.android.a;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

final class d
  extends Thread
{
  private int a = 0;
  private int b;
  private int c;
  private int d = 1;
  private int e = 0;
  private a.a f = null;
  private boolean g;
  private long h = 0L;
  private String i;
  private String j;
  private a k = new a();
  private Context l = null;
  
  public d(String paramString1, String paramString2, long paramLong, a.a parama, Context paramContext)
  {
    this.i = paramString1;
    this.j = paramString2;
    this.h = paramLong;
    this.f = parama;
    this.l = paramContext;
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "build DownloadTask url=" + paramString1 + ",fileName=" + paramString2);
    }
  }
  
  protected final void a()
  {
    this.k.a = true;
  }
  
  public final void run()
  {
    e[] arrayOfe = new e[this.d];
    URL localURL;
    try
    {
      localURL = new URL(this.i);
      Proxy localProxy = a.a.a(this.l);
      if (localProxy != null) {}
      for (HttpURLConnection localHttpURLConnection = (HttpURLConnection)localURL.openConnection(localProxy);; localHttpURLConnection = (HttpURLConnection)localURL.openConnection())
      {
        int m = localHttpURLConnection.getResponseCode();
        if ((m >= 200) && (m < 300)) {
          break;
        }
        this.f.a("下载连接过程中出现错误");
        return;
      }
      this.a = localHttpURLConnection.getContentLength();
      if (this.a <= 0)
      {
        this.f.a("下载连接过程中出现错误");
        return;
      }
    }
    catch (Exception localException)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "download error by download task");
      }
      this.f.a("下载过程中出现错误");
      return;
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "fileSize:" + this.a + " downloadSizeMore:" + this.c);
    }
    this.b = (this.a / this.d);
    this.c = (this.a % this.d);
    File localFile = new File(this.j);
    for (int n = 0; n < this.d; n++)
    {
      if (n != -1 + this.d) {}
      for (e locale = new e(localURL, localFile, n * this.b + this.h, -1 + (n + 1) * this.b, this.k, this.f, this.l); locale.a(); locale = new e(localURL, localFile, n * this.b + this.h, -1 + (n + 1) * this.b + this.c, this.k, this.f, this.l))
      {
        this.f.a(100);
        return;
      }
      locale.setName("Thread" + n);
      locale.start();
      arrayOfe[n] = locale;
    }
    this.g = false;
    if ((!this.g) && (!this.k.a))
    {
      this.e = this.c;
      this.g = true;
    }
    for (int i1 = 0;; i1++) {
      if (i1 < arrayOfe.length)
      {
        this.e += arrayOfe[i1].b();
        if (!arrayOfe[i1].a()) {
          this.g = false;
        }
      }
      else
      {
        if ((this.f != null) && (!this.k.a))
        {
          int i2 = Double.valueOf(100.0D * ((this.e + this.h) / this.a)).intValue();
          this.f.a(i2);
        }
        sleep(1000L);
        break;
        return;
      }
    }
  }
  
  public final class a
  {
    protected boolean a = false;
    
    protected a() {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.a.d
 * JD-Core Version:    0.7.0.1
 */