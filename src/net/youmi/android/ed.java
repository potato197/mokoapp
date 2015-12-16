package net.youmi.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;

class ed
{
  private String a = "";
  private String b = "";
  private long c = -1L;
  private long d = -1L;
  
  ed(String paramString, long paramLong1, long paramLong2)
  {
    this.a = paramString;
    this.b = (Environment.getExternalStorageDirectory() + "/" + paramString + "/");
    this.c = paramLong1;
    this.d = paramLong2;
    a();
    c();
  }
  
  private boolean a(File paramFile)
  {
    if (paramFile == null) {}
    while ((this.d == -1L) || (this.d <= 0L) || (System.currentTimeMillis() - paramFile.lastModified() <= this.d)) {
      return false;
    }
    return true;
  }
  
  private void c()
  {
    try
    {
      if ((this.c == -1L) && (this.d == -1L)) {
        return;
      }
      if ((this.c > 0L) || (this.d > 0L))
      {
        new Thread(new an(this)).start();
        return;
      }
    }
    catch (Exception localException) {}
  }
  
  String a(String paramString)
  {
    return this.b + paramString;
  }
  
  void a()
  {
    try
    {
      File localFile = new File(this.b);
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  boolean a(Context paramContext, String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      if (az.a(paramContext))
      {
        FileOutputStream localFileOutputStream = new FileOutputStream(c(paramString));
        localFileOutputStream.write(paramArrayOfByte);
        localFileOutputStream.flush();
        return true;
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  String b(String paramString)
  {
    if (paramString == null) {}
    String str;
    do
    {
      return null;
      str = paramString.trim();
    } while (str.length() == 0);
    return cq.b(str);
  }
  
  String[] b()
  {
    return new File(this.b).list();
  }
  
  String c(String paramString)
  {
    String str = b(paramString);
    if (str != null) {
      return a(str);
    }
    return null;
  }
  
  File d(String paramString)
  {
    return new File(c(paramString));
  }
  
  boolean e(String paramString)
  {
    String str = b(paramString);
    if (str == null) {
      return false;
    }
    return f(str);
  }
  
  boolean f(String paramString)
  {
    File localFile = new File(a(paramString));
    if (localFile.exists()) {
      return localFile.canRead();
    }
    return false;
  }
  
  Bitmap g(String paramString)
  {
    try
    {
      Bitmap localBitmap = BitmapFactory.decodeFile(c(paramString));
      return localBitmap;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ed
 * JD-Core Version:    0.7.0.1
 */