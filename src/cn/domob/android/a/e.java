package cn.domob.android.a;

import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;

public final class e
  extends Thread
{
  private URL a;
  private File b;
  private long c;
  private long d;
  private long e;
  private boolean f = false;
  private int g = 0;
  private d.a h;
  private a.a i;
  private Context j = null;
  
  e(URL paramURL, File paramFile, long paramLong1, long paramLong2, d.a parama, a.a parama1, Context paramContext)
  {
    this.a = paramURL;
    this.b = paramFile;
    this.c = paramLong1;
    this.e = paramLong1;
    this.d = paramLong2;
    this.h = parama;
    this.i = parama1;
    this.j = paramContext;
    if ((paramLong1 > paramLong2) && (paramLong2 > 0L)) {
      this.f = true;
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "download st:" + paramLong1 + " ed:" + paramLong2);
    }
  }
  
  public final boolean a()
  {
    return this.f;
  }
  
  public final int b()
  {
    return this.g;
  }
  
  public final void run()
  {
    byte[] arrayOfByte = new byte[10240];
    for (;;)
    {
      try
      {
        Proxy localProxy = a.a.a(this.j);
        HttpURLConnection localHttpURLConnection;
        if (localProxy != null)
        {
          localHttpURLConnection = (HttpURLConnection)this.a.openConnection(localProxy);
          localHttpURLConnection.setConnectTimeout(40000);
          localHttpURLConnection.setReadTimeout(60000);
          localHttpURLConnection.setAllowUserInteraction(true);
          localHttpURLConnection.setRequestProperty("Range", "bytes=" + this.c + "-" + this.d);
          localRandomAccessFile = new RandomAccessFile(this.b, "rw");
          if (this.b.getAbsoluteFile().toString().startsWith("/data/data/"))
          {
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "download in rom change chmod " + this.b.getAbsolutePath());
            }
            String str = "chmod 777 " + this.b.getAbsolutePath();
            Runtime.getRuntime().exec(str);
          }
          localRandomAccessFile.seek(this.c);
          localBufferedInputStream = new BufferedInputStream(localHttpURLConnection.getInputStream());
          if (this.e >= this.d) {
            continue;
          }
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDKdwnloadmessage", "downloading");
          }
          if (!this.h.a) {}
        }
        else
        {
          localHttpURLConnection = (HttpURLConnection)this.a.openConnection();
          continue;
        }
        k = localBufferedInputStream.read(arrayOfByte, 0, 10240);
        if (k == -1) {
          continue;
        }
        localRandomAccessFile.write(arrayOfByte, 0, k);
        this.e += k;
        if (this.e <= this.d) {
          continue;
        }
        this.g = ((int)(this.g + (1L + (k - (this.e - this.d)))));
      }
      catch (SocketTimeoutException localSocketTimeoutException)
      {
        int k;
        Log.e("DomobSDK", "download SocketTimeoutException ");
        this.i.a("下载过程中网络出现异常");
        return;
        this.g = (k + this.g);
        continue;
      }
      catch (IOException localIOException)
      {
        RandomAccessFile localRandomAccessFile;
        BufferedInputStream localBufferedInputStream;
        Log.e("DomobSDK", "download IOException " + localIOException.getMessage());
        this.i.a("下载过程中出现异常");
        return;
        this.f = true;
        localBufferedInputStream.close();
        localRandomAccessFile.close();
        return;
      }
      catch (Exception localException)
      {
        Log.e("DomobSDK", "download error " + localException.getMessage());
        this.i.a("下载过程中出现异常");
        localException.printStackTrace();
      }
      try
      {
        Thread.sleep(30L);
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
        Log.e("DomobSDK", "download Interrupt error:" + localInterruptedException.getMessage());
        this.i.a("下载过程中出现异常");
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.a.e
 * JD-Core Version:    0.7.0.1
 */