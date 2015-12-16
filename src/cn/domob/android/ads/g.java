package cn.domob.android.ads;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import cn.domob.android.a.c;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class g
{
  protected static Hashtable<String, String> a = new Hashtable();
  protected static String b = null;
  private static Vector<String> q = new Vector();
  private static boolean w = false;
  private static String x = "";
  private h c;
  private boolean d = false;
  private c e = null;
  private Vector<a> f = new Vector();
  private Vector<Intent> g = new Vector();
  private String h = null;
  private String i;
  private String j;
  private String k = null;
  private HashMap<String, Boolean> l = new HashMap();
  private HashMap<String, String> m;
  private Intent n = null;
  private f o;
  private String p = "0";
  private WebView r;
  private int s = 0;
  private Handler t;
  private String u = null;
  private boolean v = false;
  
  protected g()
  {
    WebView.enablePlatformNotifications();
  }
  
  protected static g a(f paramf, JSONObject paramJSONObject)
  {
    g localg;
    if ((paramJSONObject == null) || (paramJSONObject.length() == 0))
    {
      Log.e("DomobSDK", "failed to init engine, jsonobject is null!");
      localg = null;
    }
    do
    {
      do
      {
        return localg;
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "init engine now.");
        }
        localg = new g();
        localg.o = paramf;
        localg.c = new h(localg, paramf.k(), paramf, paramJSONObject);
      } while (paramf.j());
      if (!localg.a(paramJSONObject, paramf)) {
        break;
      }
    } while (!Log.isLoggable("DomobSDK", 3));
    Log.d("DomobSDK", "success to parse ad response.");
    return localg;
    return null;
  }
  
  private String a(String paramString)
  {
    i locali = a.a(paramString, null);
    locali.a(this.c.b.k());
    if (locali.a())
    {
      byte[] arrayOfByte = locali.d();
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "preload byte length:" + arrayOfByte.length);
      }
      try
      {
        String str = new String(arrayOfByte, locali.f());
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
        return "";
      }
    }
    return "";
  }
  
  private void a(String paramString, final Context paramContext)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.i("DomobSDK", "startDownload url:" + paramString);
    }
    cn.domob.android.a.a.a(paramString, (String)this.m.get("name"), this.k, paramContext, new c()
    {
      public final void a()
      {
        g.a(g.this, 0, g.b(g.this));
      }
      
      public final void a(int paramAnonymousInt)
      {
        if (paramAnonymousInt == 512) {
          return;
        }
        g.a(g.this, 2, g.b(g.this));
      }
      
      public final void b()
      {
        g.a(g.this, 1, g.b(g.this));
        DomobActivity.a(paramContext);
      }
      
      public final void c()
      {
        g.a(g.this, 3, g.b(g.this));
      }
    });
  }
  
  private boolean a(JSONObject paramJSONObject, f paramf)
  {
    this.j = paramJSONObject.optString("sid", null);
    String str = paramJSONObject.optString("rp_url", null);
    this.i = str;
    if ((this.j == null) || (this.j.trim().equals(""))) {}
    for (x = t.b(this.i); str == null; x = this.j)
    {
      Log.e("DomobSDK", "there is no jsonpurl which is required!");
      return false;
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "parse response now.");
    }
    if ((str != null) && (!str.equals("")))
    {
      a locala = new a(str);
      if (this.f != null) {
        this.f.add(locala);
      }
    }
    this.h = paramJSONObject.optString("identifier", null);
    if ((this.h == null) || (this.h.equals("nullad")))
    {
      Log.e("DomobSDK", "ad identifier is null, ignore it!");
      return false;
    }
    this.m = new HashMap();
    this.m.put("id", this.h);
    this.m.put("rpurlmd5", x);
    JSONObject localJSONObject = paramJSONObject.optJSONObject("ac");
    if (localJSONObject != null) {
      b(localJSONObject);
    }
    JSONArray localJSONArray = paramJSONObject.optJSONArray("ac");
    int i1 = 0;
    for (;;)
    {
      if ((localJSONArray != null) && (i1 < localJSONArray.length())) {
        try
        {
          b(localJSONArray.getJSONObject(i1));
          i1++;
        }
        catch (JSONException localJSONException)
        {
          for (;;)
          {
            localJSONException.printStackTrace();
          }
        }
      }
    }
    try
    {
      this.k = paramJSONObject.optString("pkg");
      if ((this.k != null) && (!"".equals(this.k))) {}
      try
      {
        if (paramf.k().getPackageManager().getPackageInfo(this.k, 1) != null)
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.i("DomobSDK", "already insalled. pkgName: " + this.k);
          }
          b = this.k;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        label389:
        break label389;
      }
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.i("DomobSDK", "fail to get pkg name from ad response. " + localException.getMessage());
        }
      }
    }
  }
  
  private void b(JSONObject paramJSONObject)
  {
    String str1;
    String str2;
    boolean bool1;
    boolean bool2;
    boolean bool3;
    String str3;
    if (paramJSONObject != null)
    {
      str1 = paramJSONObject.optString("a", null);
      str2 = paramJSONObject.optString("opentype", null);
      this.p = paramJSONObject.optString("loadingtype", "0");
      bool1 = paramJSONObject.optBoolean("click_confirm", true);
      bool2 = paramJSONObject.optBoolean("preload", false);
      bool3 = paramJSONObject.optBoolean("auto_run", false);
      w = bool3;
      str3 = paramJSONObject.optString("name", "");
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "OpenType is:" + str2);
      }
      if (str1 == null) {
        Log.e("DomobSDK", "invalid action type!");
      }
    }
    else
    {
      return;
    }
    String str4 = paramJSONObject.optString("d", null);
    String str5 = null;
    String str6;
    String str7;
    label196:
    int i1;
    String str8;
    Uri localUri;
    if ("map".equals(str1))
    {
      str6 = "android.intent.action.VIEW";
      if (str4 == null)
      {
        Log.e("DomobSDK", "map data is null!");
        return;
      }
      str7 = "geo:" + str4;
      i1 = paramJSONObject.optInt("f", 268435456);
      str8 = paramJSONObject.optString("b", null);
      localUri = Uri.parse(str7);
      if (localUri == null) {
        break label796;
      }
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "intent uri:" + localUri.toString());
      }
    }
    for (;;)
    {
      Intent localIntent = new Intent(str6, localUri);
      if (i1 != 0) {
        localIntent.addFlags(i1);
      }
      Bundle localBundle = new Bundle();
      if ("url".equals(str1))
      {
        localBundle.putString("opentype", str2);
        localBundle.putBoolean("click_confirm", bool1);
        localBundle.putBoolean("preload", bool2);
        localBundle.putBoolean("auto_run", bool3);
        localBundle.putString("name", str3);
        if (bool2)
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.i("DomobSDK", "preload is needed by server");
          }
          if ((str2 == null) || (str2.equals("inapp_fs"))) {
            localBundle.putString("html", a(str4));
          }
        }
      }
      localBundle.putString("type", str1);
      localIntent.putExtras(localBundle);
      if ((str8 != null) && (str5 != null)) {
        localIntent.putExtra(str5, str8);
      }
      String str9 = paramJSONObject.optString("s", null);
      if (("mail".equals(str1)) && (str9 != null)) {
        localIntent.putExtra("android.intent.extra.SUBJECT", str9);
      }
      if (this.g == null) {
        break;
      }
      this.g.add(localIntent);
      return;
      if ("sms".equals(str1))
      {
        str6 = "android.intent.action.SENDTO";
        if (str4 == null)
        {
          Log.e("DomobSDK", "smsto is null!");
          return;
        }
        str7 = "smsto:" + str4;
        str5 = "sms_body";
        break label196;
      }
      if ("mail".equals(str1))
      {
        str6 = "android.intent.action.SENDTO";
        if (str4 == null)
        {
          Log.e("DomobSDK", "mailto is null!");
          return;
        }
        str7 = "mailto:" + str4;
        str5 = "android.intent.extra.TEXT";
        break label196;
      }
      if (("url".equals(str1)) || ("market".equals(str1)))
      {
        if (str4 == null)
        {
          Log.e("DomobSDK", "url is null!");
          return;
        }
        str6 = "android.intent.action.VIEW";
        str7 = str4;
        str5 = null;
        break label196;
      }
      if ("call".equals(str1))
      {
        str6 = "android.intent.action.DIAL";
        if (str4 == null)
        {
          Log.e("DomobSDK", "tel number is null!");
          return;
        }
        str7 = "tel:" + str4;
        str5 = null;
        break label196;
      }
      if (("video".equals(str1)) || ("audio".equals(str1)))
      {
        if (str4 == null)
        {
          Log.e("DomobSDK", "url is null!");
          return;
        }
        str6 = "android.intent.action.VIEW";
        str7 = str4;
        str5 = null;
        break label196;
      }
      Log.e("DomobSDK", "unknown action type!");
      return;
      label796:
      Log.e("DomobSDK", "intent uri is null");
    }
  }
  
  static boolean c()
  {
    return w;
  }
  
  static String d()
  {
    return x;
  }
  
  final void a()
  {
    final Context localContext1;
    Intent localIntent;
    Bundle localBundle;
    final String str1;
    String str2;
    boolean bool1;
    if (this.c != null)
    {
      localContext1 = this.c.getContext();
      if (localContext1 != null)
      {
        t.a("doAction -> start.");
        PackageManager localPackageManager = localContext1.getPackageManager();
        Iterator localIterator = this.g.iterator();
        if (localIterator.hasNext())
        {
          localIntent = (Intent)localIterator.next();
          localBundle = localIntent.getExtras();
          str1 = localBundle.getString("opentype");
          str2 = localBundle.getString("type");
          bool1 = localBundle.getBoolean("click_confirm", true);
          boolean bool2 = localBundle.getBoolean("preload", false);
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "doAction -> intent's opentype:" + str1 + "  intent:" + localIntent.toString() + ",click confirm:" + bool1 + ", preload:" + bool2);
          }
          if (localPackageManager.resolveActivity(localIntent, 65536) == null) {}
        }
      }
    }
    for (;;)
    {
      final String str5;
      final HashMap localHashMap;
      try
      {
        if (!"url".equals(str2)) {
          break label1047;
        }
        String str3 = localIntent.getDataString();
        if (str3.indexOf("?") < 0) {
          str3 = str3 + "?";
        }
        StringBuilder localStringBuilder = new StringBuilder().append(str3);
        Object[] arrayOfObject = new Object[3];
        if (!str3.endsWith("?")) {
          break label1090;
        }
        str4 = "";
        arrayOfObject[0] = str4;
        arrayOfObject[1] = "010300";
        arrayOfObject[2] = str1;
        str5 = String.format("%ssv=%s&ot=%s", arrayOfObject);
        t.a("open URL:" + str5);
        if ("inapp_slider".equals(str1))
        {
          boolean bool3 = this.o.t();
          t.a("isAtBottom:" + bool3);
          if (!bool3) {
            break label1098;
          }
          str1 = "inapp_slider";
          if (350 >= DomobAdManager.h(localContext1)) {
            str1 = "inapp_fs";
          }
          if (DomobAdManager.d(localContext1) == "h") {
            str1 = "inapp_fs";
          }
        }
        this.u = localBundle.getString("html");
        this.m.put("name", localBundle.getString("name"));
        switch (8.a[b.a(str1).ordinal()])
        {
        case 1: 
        case 2: 
        case 3: 
          if (!this.p.equals("1")) {
            break label788;
          }
          localHashMap = this.m;
          if (this.o.v()) {
            break label1089;
          }
          this.o.d(true);
          if (true != this.o.u()) {
            break label582;
          }
          a(this.o, str5, str1, localHashMap);
          return;
        }
      }
      catch (Exception localException)
      {
        Log.e("DomobSDK", "error happened in doAction!");
        localException.printStackTrace();
      }
      break;
      label582:
      this.v = false;
      final Context localContext2 = this.o.k();
      this.o.a(new RelativeLayout.LayoutParams((int)(320.0F * DomobAdManager.f(localContext2)), 5));
      t.a("getWidthForView:" + this.o.q());
      this.r = new WebView(localContext2);
      this.r.setVisibility(4);
      this.o.a(this.r);
      this.r.getSettings().setJavaScriptEnabled(true);
      this.r.getSettings().setCacheMode(1);
      this.r.setScrollBarStyle(0);
      this.r.setWebViewClient(new WebViewClient()
      {
        public final void onPageFinished(WebView paramAnonymousWebView, String paramAnonymousString)
        {
          if (!g.h(g.this))
          {
            g.c(g.this).c(8);
            g.c(g.this).r();
            g.c(g.this).b(g.e(g.this));
            g.g(g.this).sendEmptyMessage(2);
            g.this.a(g.c(g.this), str5, str1, localHashMap);
            t.a("onPagefinish in loadingLanding.");
          }
          g.a(g.this, false);
          super.onPageFinished(paramAnonymousWebView, paramAnonymousString);
        }
        
        public final void onPageStarted(WebView paramAnonymousWebView, String paramAnonymousString, Bitmap paramAnonymousBitmap)
        {
          g.c(g.this).c(0);
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "progressBar has been shown");
          }
          g.c(g.this).b(5);
          t.a("onPageStart in loadingLanding.");
          g.a(g.this, 0);
          g.a(g.this, new Handler()
          {
            public final void handleMessage(Message paramAnonymous2Message)
            {
              super.handleMessage(paramAnonymous2Message);
              if (paramAnonymous2Message.what == 1)
              {
                if ((g.c(g.this).v() == true) && (g.d(g.this) == 20))
                {
                  Toast.makeText(g.6.this.a, "连接超时，请检查网络状况", 0).show();
                  g.c(g.this).c(8);
                  g.c(g.this).r();
                  g.c(g.this).b(g.e(g.this));
                  g.c(g.this).d(false);
                  g.a(g.this, 0);
                  g.a(g.this, true);
                }
                while (g.d(g.this) == -1) {
                  return;
                }
                g.f(g.this);
                g.g(g.this).sendEmptyMessageDelayed(1, 1000L);
                return;
              }
              g.a(g.this, -1);
            }
          });
          g.g(g.this).sendEmptyMessage(1);
          super.onPageStarted(paramAnonymousWebView, paramAnonymousString, paramAnonymousBitmap);
        }
        
        public final void onReceivedError(WebView paramAnonymousWebView, int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
        {
          Toast.makeText(localContext2, "连接超时，请检查网络状况", 0).show();
          g.c(g.this).c(8);
          g.c(g.this).r();
          g.c(g.this).b(g.e(g.this));
          g.c(g.this).d(false);
          g.a(g.this, true);
          super.onReceivedError(paramAnonymousWebView, paramAnonymousInt, paramAnonymousString1, paramAnonymousString2);
        }
      });
      this.r.setWebChromeClient(new WebChromeClient()
      {
        public final void onProgressChanged(WebView paramAnonymousWebView, int paramAnonymousInt)
        {
          g.c(g.this).b(paramAnonymousInt);
          super.onProgressChanged(paramAnonymousWebView, paramAnonymousInt);
        }
      });
      if (this.u != null)
      {
        this.r.loadDataWithBaseURL(str5, this.u, "text/html", "utf-8", null);
        return;
      }
      this.r.loadUrl(str5);
      return;
      label788:
      a(this.o, str5, str1, this.m);
      return;
      this.n = cn.domob.android.a.a.a(localContext1, str5, (String)this.m.get("name"));
      if (this.n != null)
      {
        if (bool1)
        {
          new AlertDialog.Builder(localContext1).setTitle("安装").setMessage((String)this.m.get("name") + "已经下载是否现在安装?").setNegativeButton("否", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
          }).setPositiveButton("是", new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              DomobActivity.a(localContext1);
              Intent localIntent = g.a(g.this);
              localContext1.startActivity(localIntent);
            }
          }).show();
          return;
        }
        DomobActivity.a(localContext1);
        this.c.getContext().startActivity(this.n);
        return;
      }
      if (bool1)
      {
        new AlertDialog.Builder(localContext1).setMessage("是否下载" + (String)this.m.get("name") + "?").setPositiveButton("确定", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            Toast.makeText(localContext1, "开始下载", 0).show();
            g.a(g.this, 9, g.b(g.this));
            g.a(g.this, str5, localContext1);
          }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
        }).show();
        return;
      }
      a(str5, localContext1);
      return;
      localContext1.startActivity(localIntent);
      return;
      label1047:
      localContext1.startActivity(localIntent);
      break;
      Log.e("DomobSDK", "activity cannot be resolved, intent.getAction() =  " + localIntent.getAction());
      break;
      label1089:
      return;
      label1090:
      String str4 = "&";
      continue;
      label1098:
      str1 = "inapp_fs";
    }
  }
  
  public final void a(f paramf, String paramString1, String paramString2, HashMap<String, String> paramHashMap)
  {
    paramHashMap.put("pkgName", this.k);
    if (this.r == null) {
      this.r = new WebView(paramf.k());
    }
    switch (8.a[b.a(paramString2).ordinal()])
    {
    }
    for (;;)
    {
      if (paramf.s() != null) {
        paramf.s().onLandingPageOpening();
      }
      return;
      try
      {
        new o(this.o, paramString1, paramHashMap, paramString2, this.u, this.r).a().show();
        this.u = null;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localException2.printStackTrace();
        }
      }
      try
      {
        new o(this.o, paramString1, paramHashMap, paramString2, this.u, this.r).b().show();
        this.u = null;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          localException1.printStackTrace();
        }
      }
    }
  }
  
  protected final void a(h paramh)
  {
    this.c = paramh;
    if (this.e == null) {
      this.e = paramh;
    }
  }
  
  protected final void a(JSONObject paramJSONObject)
  {
    t.a("start to reportClick.");
    String str2;
    int i1;
    if ((this.o.j()) && (this.f.size() > 0))
    {
      str2 = ((a)this.f.get(0)).a;
      i1 = str2.length();
      if (i1 >= 20) {
        break label441;
      }
    }
    label431:
    label441:
    for (int i2 = i1;; i2 = 20)
    {
      String str3 = str2.substring(i1 - i2, i1);
      if (!this.l.containsKey(str3))
      {
        this.l.put(str3, Boolean.valueOf(true));
        this.d = false;
      }
      if (this.d)
      {
        Log.w("DomobSDK", "already clicked, ignore it.");
        if (this.e != null)
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "show click animation.");
          }
          this.e.a();
        }
        t.a("finish to reportClick.");
        return;
      }
      if (this.i != null) {
        if ((this.j != null) && (!this.j.trim().equals(""))) {
          break label431;
        }
      }
      for (x = t.b(this.i);; x = this.j)
      {
        if (this.k != null)
        {
          a.put(this.k, x);
          q.add(this.k);
          if (q.size() > 15)
          {
            a.remove(q.get(0));
            q.remove(0);
          }
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "report clicked now.");
        }
        this.d = true;
        if ((this.c == null) || (paramJSONObject == null)) {
          break;
        }
        Context localContext = this.c.getContext();
        Iterator localIterator = this.f.iterator();
        while (localIterator.hasNext())
        {
          a locala = (a)localIterator.next();
          a locala1 = new a(this);
          String str1 = r.a(localContext, paramJSONObject.toString());
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "click report:" + str1);
          }
          i locali = a.a(locala.a, "click_tracking", r.a(localContext), DomobAdManager.b(localContext), locala1, str1);
          locali.a(localContext);
          locali.b();
        }
        break;
      }
    }
  }
  
  protected final h b()
  {
    return this.c;
  }
  
  protected final void e()
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "clear engine resources.");
    }
    if (this.g != null)
    {
      this.g.clear();
      this.g = null;
    }
    if (this.f != null)
    {
      this.f.clear();
      this.f = null;
    }
  }
  
  static final class a
  {
    public String a;
    
    public a(String paramString)
    {
      this.a = paramString;
    }
  }
  
  static enum b
  {
    private final String f;
    
    static
    {
      b[] arrayOfb = new b[5];
      arrayOfb[0] = a;
      arrayOfb[1] = b;
      arrayOfb[2] = c;
      arrayOfb[3] = d;
      arrayOfb[4] = e;
      g = arrayOfb;
    }
    
    private b(String paramString)
    {
      this.f = paramString;
    }
    
    public static b a(String paramString)
    {
      for (b localb : ) {
        if (localb.f.equals(paramString)) {
          return localb;
        }
      }
      return e;
    }
  }
  
  static abstract interface c
  {
    public abstract void a();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.g
 * JD-Core Version:    0.7.0.1
 */