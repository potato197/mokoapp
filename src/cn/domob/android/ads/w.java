package cn.domob.android.ads;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class w
  extends i
{
  private HttpURLConnection m;
  
  protected w(String paramString1, String paramString2, String paramString3, String paramString4, b paramb, int paramInt, Map<String, String> paramMap, String paramString5)
  {
    super(paramString2, paramString3, paramString4, paramb, paramInt, null, paramString5);
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "connect url=" + paramString1);
    }
    try
    {
      this.a = new URL(paramString1);
      this.m = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        this.a = null;
        localException.printStackTrace();
      }
    }
  }
  
  private void g()
  {
    if (this.m != null)
    {
      this.m.disconnect();
      this.m = null;
    }
  }
  
  final boolean a()
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "initConn");
    }
    URL localURL = this.a;
    boolean bool1 = false;
    if (localURL != null) {}
    for (;;)
    {
      try
      {
        HttpURLConnection.setFollowRedirects(true);
        g();
        if (this.b == null) {
          break label220;
        }
        this.m = ((HttpURLConnection)this.a.openConnection(this.b));
        if (this.m == null) {
          break label333;
        }
        this.m.setConnectTimeout(this.e);
        this.m.setReadTimeout(this.e);
        if (this.f == null) {
          break;
        }
        Iterator localIterator = this.f.keySet().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        String str1 = (String)localIterator.next();
        if (str1 == null) {
          continue;
        }
        String str2 = (String)this.f.get(str1);
        if (str2 == null) {
          continue;
        }
        this.m.addRequestProperty(str1, str2);
        continue;
        if (bool1) {
          break label197;
        }
      }
      catch (Exception localException)
      {
        Log.e("DomobSDK", "Error happened in connection.");
        localException.printStackTrace();
      }
      this.h = null;
      label197:
      if (this.c != null) {
        this.c.a(this);
      }
      g();
      return bool1;
      label220:
      this.m = ((HttpURLConnection)this.a.openConnection());
    }
    if (this.g != null)
    {
      this.m.setRequestMethod("POST");
      this.m.setDoOutput(true);
      this.m.setRequestProperty("Content-Type", this.d);
      this.m.setRequestProperty("Content-Length", Integer.toString(this.g.length()));
      BufferedWriter localBufferedWriter = new BufferedWriter(new OutputStreamWriter(this.m.getOutputStream()), 4096);
      localBufferedWriter.write(this.g);
      localBufferedWriter.close();
    }
    label333:
    ByteArrayOutputStream localByteArrayOutputStream;
    for (;;)
    {
      this.j = this.m.getResponseCode();
      if ((this.j < 200) || (this.j >= 300)) {
        break label547;
      }
      this.k = this.m.getContentType();
      this.l = this.m.getContentEncoding();
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "resp type:" + this.k + ",mRespEncoding:" + this.l);
      }
      this.a = this.m.getURL();
      if (!this.i) {
        break label538;
      }
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(this.m.getInputStream(), 4096);
      byte[] arrayOfByte = new byte[4096];
      localByteArrayOutputStream = new ByteArrayOutputStream(4096);
      for (;;)
      {
        int i = localBufferedInputStream.read(arrayOfByte);
        if (i == -1) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
      this.m.connect();
    }
    this.h = localByteArrayOutputStream.toByteArray();
    label538:
    label547:
    for (boolean bool2 = true;; bool2 = false)
    {
      bool1 = bool2;
      break;
    }
  }
  
  public final void run()
  {
    try
    {
      a();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.w
 * JD-Core Version:    0.7.0.1
 */