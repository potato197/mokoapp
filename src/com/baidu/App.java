package com.baidu;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

class App
  implements bl
{
  private static final List<String> a = new ArrayList();
  private Map<String, String> b = new HashMap();
  private String c;
  private String d;
  private String e;
  private Bitmap f;
  private List<App.Snag> g = new ArrayList();
  
  static
  {
    a.add("durl");
    a.add("s");
    a.add("n");
    a.add("d");
    a.add("dn");
    a.add("v");
    a.add("t");
    a.add("o");
    a.add("ov");
    a.add("c");
    a.add("clklog");
    a.add("dev");
    a.add("time");
  }
  
  public static App a(Context paramContext, String paramString, JSONObject paramJSONObject)
  {
    App localApp = new App();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localApp.b.put(str, paramJSONObject.optString(str));
    }
    localApp.b.put("clklog", paramString);
    localApp.f = w.a(paramContext, new URL(paramJSONObject.optString("w_picurl")));
    JSONArray localJSONArray = new JSONArray(paramJSONObject.optString("a_picurl"));
    for (int i = 0;; i++)
    {
      if (i >= localJSONArray.length()) {
        return localApp;
      }
      JSONObject localJSONObject = localJSONArray.getJSONObject(i);
      Object localObject = localApp.f;
      try
      {
        Bitmap localBitmap = w.a(paramContext, new URL(localJSONObject.getString("s")));
        localObject = localBitmap;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          App.Snag localSnag;
          bk.a(localException);
        }
      }
      localSnag = new App.Snag((Bitmap)localObject, localJSONObject.getString("b"));
      localApp.g.add(localSnag);
    }
    return localApp;
  }
  
  public static App a(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong, Bitmap paramBitmap)
  {
    App localApp = new App();
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localApp.b.put(str, "");
    }
    localApp.b.put("clklog", paramString1);
    localApp.b.put("durl", paramString2);
    localApp.b.put("n", paramString3);
    localApp.b.put("d", paramString4);
    localApp.b.put("s", paramLong + "");
    localApp.f = paramBitmap;
    return localApp;
  }
  
  public List<App.Snag> a()
  {
    return this.g;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public String b()
  {
    return (String)this.b.get("clklog");
  }
  
  public String c()
  {
    return (String)this.b.get("durl");
  }
  
  public int d()
  {
    try
    {
      int i = Integer.parseInt((String)this.b.get("dn"));
      return i;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public Bitmap e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    return ((paramObject instanceof App)) && (((App)paramObject).c().equals(c()));
  }
  
  public String f()
  {
    if (this.c == null) {}
    try
    {
      this.c = Uri.parse((String)this.b.get("durl")).getLastPathSegment();
      return this.c;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bk.a(localException);
        this.c = "";
      }
    }
  }
  
  public String g()
  {
    return (String)this.b.get("dev");
  }
  
  public String h()
  {
    return (String)this.b.get("time");
  }
  
  public String i()
  {
    if (this.d == null) {}
    for (;;)
    {
      try
      {
        l = Long.parseLong((String)this.b.get("s"));
        if (l >= 1024L) {
          continue;
        }
        this.d = (l + "B");
      }
      catch (Exception localException)
      {
        long l;
        this.d = "";
        bk.a(localException);
        continue;
        this.d = (l / 1048576L + "MB");
        continue;
      }
      return this.d;
      if (l >= 1048576L) {
        continue;
      }
      this.d = (l / 1024L + "KB");
    }
  }
  
  public String j()
  {
    return (String)this.b.get("n");
  }
  
  public String k()
  {
    return (String)this.b.get("d");
  }
  
  public String l()
  {
    return (String)this.b.get("v");
  }
  
  public String m()
  {
    return (String)this.b.get("t");
  }
  
  public String n()
  {
    return this.e;
  }
  
  public String toString()
  {
    return this.b.toString();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.App
 * JD-Core Version:    0.7.0.1
 */