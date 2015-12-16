package cn.domob.android.a;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

final class f
  extends Thread
{
  private a.b a = null;
  private Context b = null;
  private long c = 0L;
  private String d = "";
  private String e = "";
  private boolean f = false;
  private String g = "";
  
  protected f(Context paramContext, String paramString1, String paramString2, a.b paramb)
  {
    this.a = paramb;
    this.b = paramContext;
    this.g = paramString2;
    this.d = (paramString1 + ".apk");
  }
  
  private boolean a(String paramString)
  {
    File localFile1 = new File(paramString);
    File localFile2 = new File(paramString + ".temp");
    if (localFile1.exists()) {
      if (this.a != null) {
        this.a.a(paramString);
      }
    }
    do
    {
      return true;
      if (!localFile2.exists()) {
        break;
      }
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", paramString + "download size=" + localFile2.length() + " " + "softSize:" + this.c);
      }
      this.f = true;
    } while (this.a == null);
    this.a.c(paramString + ".temp");
    return true;
    return false;
  }
  
  private boolean b()
  {
    long l1 = 0L;
    for (;;)
    {
      try
      {
        URL localURL = new URL(this.g);
        Proxy localProxy = a.a.a(this.b);
        HttpURLConnection localHttpURLConnection;
        if (localProxy != null)
        {
          localHttpURLConnection = (HttpURLConnection)localURL.openConnection(localProxy);
          int i = localHttpURLConnection.getResponseCode();
          if (i < 200) {
            break label508;
          }
          if (i >= 300)
          {
            break label508;
            Object localObject;
            this.c = localObject;
            if (!Environment.getExternalStorageState().equals("mounted")) {
              break label499;
            }
            StatFs localStatFs1 = new StatFs(Environment.getExternalStorageDirectory().getPath());
            l1 = localStatFs1.getBlockSize() * localStatFs1.getAvailableBlocks();
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "sd availaSize=" + l1 + "softsize=" + this.c);
            }
            if (l1 <= 2097152L + this.c) {
              break label499;
            }
            str1 = Environment.getExternalStorageDirectory() + "/DomobAppDownload/";
            b(str1);
            j = 1;
            if (j != 0) {
              break label453;
            }
            StatFs localStatFs2 = new StatFs(Environment.getDataDirectory().getPath());
            long l3 = localStatFs2.getBlockSize() * localStatFs2.getAvailableBlocks();
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "rom" + l3);
            }
            if (l3 >= 5242880L + this.c) {
              break label347;
            }
            a.b localb = this.a;
            localb.a(l1, l3);
            return false;
          }
        }
        else
        {
          localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
          continue;
        }
        int k = localHttpURLConnection.getContentLength();
        l2 = k;
        continue;
        str1 = this.b.getFilesDir().getAbsolutePath() + "/DomobAppDownload/";
      }
      catch (Exception localException)
      {
        this.a.d("连接下载地址错误");
        return false;
      }
      label347:
      b(str1);
      File localFile = new File(str1);
      String str2 = "chmod 777 " + localFile.getAbsolutePath();
      Runtime localRuntime = Runtime.getRuntime();
      try
      {
        if (localRuntime.exec(str2).waitFor() != 0)
        {
          this.a.a();
          return false;
        }
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        this.a.b(str1 + this.d + ".temp");
        return true;
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;)
        {
          label453:
          localInterruptedException.printStackTrace();
        }
      }
      label499:
      String str1 = null;
      int j = 0;
      continue;
      label508:
      long l2 = -1L;
    }
  }
  
  private static boolean b(String paramString)
  {
    File localFile = new File(paramString);
    if (!localFile.exists()) {
      return localFile.mkdirs();
    }
    return true;
  }
  
  private boolean c()
  {
    this.e = (Environment.getExternalStorageDirectory() + "/DomobAppDownload/" + this.d);
    if (a(this.e)) {}
    do
    {
      return true;
      this.e = (this.b.getFilesDir().getAbsolutePath() + "/DomobAppDownload/" + this.d);
    } while (a(this.e));
    return false;
  }
  
  protected final String a()
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "app is download:" + c() + " " + "is not complete:" + this.f);
    }
    if ((!c()) || (this.f)) {
      return null;
    }
    return this.e;
  }
  
  public final void run()
  {
    if ((!c()) && (!b())) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.a.f
 * JD-Core Version:    0.7.0.1
 */