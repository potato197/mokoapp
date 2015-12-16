package cn.domob.android.a;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import cn.domob.android.ads.DomobActivity;
import java.io.File;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;

public final class a
{
  public static Hashtable<String, a> a;
  public static Hashtable<String, Integer> b = new Hashtable();
  private static Context c = null;
  private static int j = 0;
  private static Hashtable<String, Integer> k;
  private static Vector<String> l = new Vector();
  private Notification d = null;
  private NotificationManager e = null;
  private int f = 0;
  private int g = 0;
  private c h = null;
  private String i = "";
  private int m = 0;
  private String n = "";
  private String o = "";
  private String p = "";
  private PendingIntent q;
  private Handler r = new b(this);
  private d s;
  
  static
  {
    a = new Hashtable();
    k = new Hashtable();
  }
  
  private a(String paramString1, String paramString2, String paramString3, String paramString4, Context paramContext)
  {
    c = paramContext.getApplicationContext();
    this.n = paramString1;
    this.o = paramString2;
    this.p = paramString3;
    if (!k.containsKey(paramString3))
    {
      j = 1 + j;
      k.put(paramString3, Integer.valueOf(j));
    }
    for (this.f = j;; this.f = ((Integer)k.get(paramString3)).intValue())
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", paramString2 + " notification_id is " + this.f);
      }
      if (paramString4 != null)
      {
        b.put(paramString4, Integer.valueOf(this.f));
        l.add(paramString4);
        if (l.size() > 30)
        {
          b.remove(l.get(0));
          l.remove(0);
        }
      }
      return;
    }
  }
  
  public static Intent a(Context paramContext, String paramString1, String paramString2)
  {
    f localf = new f(paramContext, b(paramString1), paramString1, null);
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", paramString2 + " is exsist");
    }
    String str = localf.a();
    if (str == null) {
      return null;
    }
    return a(str);
  }
  
  static Intent a(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.parse("file://" + paramString), "application/vnd.android.package-archive");
    return localIntent;
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, Context paramContext, c paramc)
  {
    String str = b(paramString1);
    if (a.containsKey(str))
    {
      paramc.a(512);
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "app" + paramString2 + " is downloading");
      }
    }
    do
    {
      return;
      if (a.size() != 3) {
        break;
      }
      paramc.a(512);
    } while (!Log.isLoggable("DomobSDK", 3));
    Log.d("DomobSDK", "max download is 3");
    return;
    a locala = new a(paramString1, paramString2, str, paramString3, paramContext);
    locala.h = paramc;
    locala.d = new Notification();
    locala.d.icon = 17301633;
    locala.d.tickerText = (locala.o + "正在下载，请稍候...");
    Context localContext = c;
    int i1 = locala.f;
    Intent localIntent = new Intent();
    localIntent.setClass(c, DomobActivity.class);
    localIntent.putExtra("appName", locala.o);
    localIntent.putExtra("appId", locala.p);
    localIntent.putExtra("actType", "typeCancel");
    localIntent.putExtra("DomobActivityType", 2);
    locala.q = PendingIntent.getActivity(localContext, i1, localIntent, 134217728);
    locala.d.setLatestEventInfo(c, locala.o + "正在下载，请稍候...", "", locala.q);
    locala.e = ((NotificationManager)c.getSystemService("notification"));
    locala.e.notify(locala.f, locala.d);
    new f(c, locala.p, locala.n, new b(locala)).start();
    paramc.a();
  }
  
  private static String b(String paramString)
  {
    try
    {
      String str1 = new URL(paramString).getPath();
      String str2 = str1.substring(str1.lastIndexOf("/"), str1.lastIndexOf("."));
      return str2;
    }
    catch (Exception localException) {}
    return "";
  }
  
  public final c a()
  {
    return this.h;
  }
  
  public final void b()
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "stop download  cancel notify " + this.f);
    }
    if (this.s != null) {
      this.s.a();
    }
    this.e.cancel(this.f);
    a.remove(this.p);
  }
  
  public class a
  {
    public a() {}
    
    a() {}
    
    protected static Proxy a(Context paramContext)
    {
      try
      {
        if (paramContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != -1) {
          break label282;
        }
        Log.e("DomobSDK", "Cannot access user's network type.  Permissions are not set.");
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          label55:
          int i;
          label282:
          label360:
          Object localObject = null;
          continue;
          label396:
          Proxy localProxy2 = null;
          continue;
          label402:
          label409:
          do
          {
            str1 = "";
            break;
          } while (i != 1);
          String str1 = "wifi";
        }
      }
      if ((str1 != null) && (str1.equals("wifi")))
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "download network is wifi, don't read apn.");
        }
        localObject = null;
        if (localObject == null) {
          break label360;
        }
      }
      try
      {
        if (localObject.getCount() <= 0) {
          break label360;
        }
        localObject.moveToFirst();
        String str2 = localObject.getString(localObject.getColumnIndexOrThrow("proxy"));
        int j = localObject.getInt(localObject.getColumnIndexOrThrow("port"));
        String str3 = localObject.getString(localObject.getColumnIndexOrThrow("apn"));
        if ((str2 == null) || (str2.equals("")) || (j == 0) || (str3.equalsIgnoreCase("ctwap"))) {
          break label396;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "download use proxy " + str2 + " port:" + j);
        }
        localProxy2 = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str2, j));
        localProxy1 = localProxy2;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          StringBuilder localStringBuilder;
          localException1.printStackTrace();
          Proxy localProxy1 = null;
          continue;
          boolean bool = false;
        }
      }
      if (localObject != null) {
        localObject.close();
      }
      if (Log.isLoggable("DomobSDK", 3))
      {
        localStringBuilder = new StringBuilder().append("download use proxy ");
        if (localProxy1 != null)
        {
          bool = true;
          Log.d("DomobSDK", bool);
        }
      }
      else
      {
        do
        {
          return localProxy1;
          NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
          if (localNetworkInfo == null) {
            break label402;
          }
          i = localNetworkInfo.getType();
          if (i != 0) {
            break label409;
          }
          str1 = localNetworkInfo.getSubtypeName();
          if (str1 != null) {
            break;
          }
          str1 = "GPRS";
          break;
          Uri localUri = Uri.parse("content://telephony/carriers/preferapn");
          Cursor localCursor = paramContext.getContentResolver().query(localUri, null, null, null, null);
          localObject = localCursor;
          break label55;
          localProxy1 = null;
        } while (localObject == null);
        localObject.close();
        return null;
      }
    }
    
    public void a(int paramInt)
    {
      a.k(a.this).sendEmptyMessage(paramInt);
    }
    
    public void a(String paramString)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.i("DomobSDK", a.b(a.this) + "下载线程出错，错误原因：" + paramString);
      }
      a.this.b();
      a.b(a.this, paramString);
      if (a.j(a.this) != null) {
        a.j(a.this).a(6);
      }
    }
  }
  
  class b
  {
    b() {}
    
    public void a()
    {
      Log.e("DomobSDK", a.b(a.this) + "rom can't chmod");
      if (a.j(a.this) != null) {
        a.j(a.this).a(5);
      }
      a.b(a.this, "sd卡不存在");
    }
    
    public void a(long paramLong1, long paramLong2)
    {
      Log.e("DomobSDK", a.b(a.this) + "not enough size sdsize=" + paramLong1 + " romsize=" + paramLong2);
      if (a.j(a.this) != null) {
        a.j(a.this).a(1);
      }
      a.b(a.this, "空间不足");
    }
    
    public void a(String paramString)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.i("DomobSDK", a.b(a.this) + " already exists in " + paramString);
      }
      a.a(a.this, paramString);
      a.a(a.this, a.h(a.this), 0L);
    }
    
    public void b(String paramString)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.i("DomobSDK", a.b(a.this) + " is  not download,it will download in " + paramString);
      }
      a.a(a.this, paramString);
      a.a(a.this, a.h(a.this), 0L);
    }
    
    public void c(String paramString)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.i("DomobSDK", a.b(a.this) + " is download but not finished in " + paramString);
      }
      a.a(a.this, paramString);
      File localFile = new File(a.h(a.this));
      a.a(a.this, a.h(a.this), localFile.length());
    }
    
    public void d(String paramString)
    {
      Log.e("DomobSDK", a.b(a.this) + "无法连接到下载地址");
      if (a.j(a.this) != null)
      {
        c localc = a.j(a.this);
        new StringBuilder().append(a.b(a.this)).append(paramString).toString();
        localc.a(5);
      }
      a.b(a.this, "无法连接到下载地址");
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.a.a
 * JD-Core Version:    0.7.0.1
 */