package cn.domob.android.ads;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

abstract class i
  implements Runnable
{
  private static Executor m = null;
  protected URL a;
  protected Proxy b;
  protected b c;
  protected String d;
  protected int e;
  protected Map<String, String> f;
  protected String g;
  protected byte[] h;
  protected boolean i;
  protected int j;
  protected String k;
  protected String l;
  private String n;
  
  protected i(String paramString1, String paramString2, String paramString3, b paramb, int paramInt, Map<String, String> paramMap, String paramString4)
  {
    this.n = paramString1;
    this.c = paramb;
    this.f = paramMap;
    this.e = paramInt;
    this.j = 0;
    if (paramString4 != null) {
      this.g = paramString4;
    }
    for (this.d = "application/x-www-form-urlencoded";; this.d = null)
    {
      this.b = null;
      this.i = true;
      return;
      this.g = null;
    }
  }
  
  protected final void a(Context paramContext)
  {
    if (paramContext == null) {}
    do
    {
      return;
      Cursor localCursor = null;
      try
      {
        localCursor = DomobAdManager.m(paramContext);
        if ((localCursor != null) && (localCursor.getCount() > 0))
        {
          localCursor.moveToFirst();
          String str1 = localCursor.getString(localCursor.getColumnIndexOrThrow("proxy"));
          int i1 = localCursor.getInt(localCursor.getColumnIndexOrThrow("port"));
          String str2 = localCursor.getString(localCursor.getColumnIndexOrThrow("apn"));
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "current apnType is " + str2);
          }
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "proxy:" + str1 + "| port:" + i1);
          }
          if ((str1 != null) && (!str1.trim().equals("")) && (i1 != 0) && (!str2.equalsIgnoreCase("ctwap")))
          {
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "ad request use proxy");
            }
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "setProxy -- proxy:" + str1 + "| port:" + i1);
            }
            this.b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str1, i1));
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
        }
      }
    } while (localCursor == null);
    localCursor.close();
  }
  
  abstract boolean a();
  
  protected final void b()
  {
    if (m == null) {
      m = Executors.newCachedThreadPool();
    }
    m.execute(this);
  }
  
  protected final String c()
  {
    return this.n;
  }
  
  protected final byte[] d()
  {
    return this.h;
  }
  
  protected final int e()
  {
    return this.j;
  }
  
  final String f()
  {
    if (this.l == null) {
      return "UTF-8";
    }
    return this.l;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.i
 * JD-Core Version:    0.7.0.1
 */