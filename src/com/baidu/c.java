package com.baidu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class c
{
  public static Map<k, String> a;
  private static c b = new c();
  private static final SimpleDateFormat d = new SimpleDateFormat("yyyyMMdd");
  private static WeakReference<Context> i;
  private static boolean l = false;
  private Map<k, Bitmap> c = new HashMap();
  private String e;
  private boolean f;
  private boolean g;
  private String h;
  private JSONObject j;
  private JSONObject k;
  private boolean m;
  
  static
  {
    a = new HashMap();
    for (k localk : k.a()) {
      a.put(localk, "__sdk_" + localk.toString().toLowerCase());
    }
  }
  
  private Bitmap a(k paramk, boolean paramBoolean)
  {
    if (this.c.get(paramk) == null)
    {
      if (a((String)a.get(paramk)) == null) {
        break label105;
      }
      this.c.put(paramk, w.a(a((String)a.get(paramk)), false));
    }
    while (this.c.get(paramk) == null)
    {
      w.b(false, r(), (String)a.get(paramk));
      throw new IllegalArgumentException("no resource");
      label105:
      if (w.c(false, r(), (String)a.get(paramk)))
      {
        this.c.put(paramk, w.d(false, r(), (String)a.get(paramk)));
      }
      else
      {
        Map localMap = this.c;
        if (paramBoolean) {}
        for (Bitmap.Config localConfig = Bitmap.Config.ALPHA_8;; localConfig = Bitmap.Config.RGB_565)
        {
          localMap.put(paramk, Bitmap.createBitmap(1, 1, localConfig));
          break;
        }
      }
    }
    return (Bitmap)this.c.get(paramk);
  }
  
  public static c a()
  {
    return b;
  }
  
  public static URL a(String paramString)
  {
    return c.class.getResource("/res/" + paramString);
  }
  
  public static void a(Context paramContext)
  {
    i = new WeakReference(paramContext);
    if (!l)
    {
      l = true;
      b.s();
    }
  }
  
  private void a(JSONObject paramJSONObject)
  {
    try
    {
      Iterator localIterator = paramJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = w.e(paramJSONObject.getJSONObject(localIterator.next().toString()).getJSONObject("content").getString("w_picurl"));
        if (!w.c(false, r(), str))
        {
          bk.b("AdCache.transferRes", str);
          w.a(false, r(), a(str), str);
        }
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      bk.a("AdCache.transferRes", "", localJSONException);
    }
  }
  
  private Context r()
  {
    return (Context)i.get();
  }
  
  private void s()
  {
    int n = 0;
    bk.b("AdCache.init");
    for (;;)
    {
      try
      {
        if (w.c(false, r(), "__local_cache.json")) {
          break label188;
        }
        bk.b("AdCache.init", "copying new cahce.json");
        if (a("__local_cache.json") != null)
        {
          w.a(false, r(), a("__local_cache.json"), "__local_cache.json");
          localObject = null;
          i1 = 1;
          if (localObject == null)
          {
            localObject = w.a(false, r(), "__local_cache.json");
            this.k = new JSONObject((String)localObject);
          }
          this.j = new JSONObject((String)localObject);
          bk.b("AdCache", "raw cache length: " + ((String)localObject).length());
          if ((this.j != null) && (this.k != null)) {
            break label385;
          }
          throw new IllegalArgumentException("displayCache == null || cache == null");
        }
      }
      catch (JSONException localJSONException1)
      {
        bk.b("AdCache.init", "", localJSONException1);
        return;
      }
      w.a(false, r(), "__local_cache.json", "{\"install\": 11010,\"hangup\": false,\"stopped\": false,\"index_server\": \"http://mobads.baidu.com:80\",\"text\": {},\"image\": {},\"app\": {},\"click\": {}}", false);
      int i1 = 1;
      Object localObject = null;
      continue;
      label188:
      String str = w.a(false, r(), "__local_cache.json");
      for (;;)
      {
        try
        {
          this.k = new JSONObject(str);
          if (a("__local_cache.json") != null)
          {
            localJSONObject = new JSONObject(w.a(a("__local_cache.json")));
            long l1 = localJSONObject.getLong("install");
            long l2 = this.k.getLong("install");
            bk.b("AdCache.init", "newVersion: " + l1 + " oldVersion: " + l2);
            if (l1 == l2) {
              break label547;
            }
            w.b(false, r(), "__local_cache.json");
            w.a(false, r(), a("__local_cache.json"), "__local_cache.json");
            this.k = null;
            i1 = 1;
            localObject = null;
          }
        }
        catch (JSONException localJSONException2)
        {
          bk.b("AdCache", "Cache parsing error");
          w.b(false, r(), "__local_cache.json");
          s();
          return;
        }
        JSONObject localJSONObject = new JSONObject("{\"install\": 11010,\"hangup\": false,\"stopped\": false,\"index_server\": \"http://mobads.baidu.com:80\",\"text\": {},\"image\": {},\"app\": {},\"click\": {}}");
      }
      label385:
      if (i1 != 0)
      {
        t[] arrayOft = t.a();
        int i2 = arrayOft.length;
        while (n < i2)
        {
          t localt = arrayOft[n];
          a(this.k.getJSONObject(localt.toString()));
          n++;
        }
        d();
      }
      if (!t())
      {
        bk.b("AdCache", "Validation: [Failed]");
        w.b(false, r(), "__local_cache.json");
        s();
        return;
      }
      this.e = this.k.getString("index_server");
      this.f = this.k.getBoolean("hangup");
      this.g = this.k.getBoolean("stopped");
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(this.k.getLong("install"));
      this.h = String.format("android_%s", arrayOfObject);
      return;
      label547:
      localObject = str;
      i1 = 0;
    }
  }
  
  private boolean t()
  {
    bk.b("AdCache.validate");
    ArrayList localArrayList = new ArrayList();
    for (t localt : t.a()) {
      localArrayList.add(this.k.getJSONObject(localt.toString()));
    }
    Iterator localIterator1 = localArrayList.iterator();
    String str;
    do
    {
      JSONObject localJSONObject;
      Iterator localIterator2;
      while (!localIterator2.hasNext())
      {
        if (!localIterator1.hasNext()) {
          break;
        }
        localJSONObject = (JSONObject)localIterator1.next();
        localIterator2 = localJSONObject.keys();
      }
      str = localJSONObject.getJSONObject(localIterator2.next().toString()).getJSONObject("content").getString("w_picurl");
    } while ((str.trim().equals("")) || (w.c(false, r(), w.e(str))));
    return false;
    return true;
  }
  
  private void u()
  {
    bk.b("AdCache.flush");
    try
    {
      String str = this.k.toString();
      w.a(false, r(), "__local_cache.json", str, false);
      return;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException();
    }
  }
  
  private void v()
  {
    if (!this.m)
    {
      this.m = true;
      bk.b("AdCache.validateClicklog");
    }
    for (;;)
    {
      int n;
      synchronized (this.k)
      {
        try
        {
          Iterator localIterator = this.k.getJSONObject("click").keys();
          if (localIterator.hasNext())
          {
            String str1 = localIterator.next().toString();
            JSONArray localJSONArray = this.k.getJSONObject("click").getJSONObject(str1).getJSONArray("record");
            n = 0;
            if (n >= localJSONArray.length()) {
              continue;
            }
            if (localJSONArray.isNull(n)) {
              break label250;
            }
            String str2 = localJSONArray.getJSONObject(n).getString("date");
            Date localDate = new Date(System.currentTimeMillis() - 259200000L);
            if (!d.parse(str2).before(localDate)) {
              break label250;
            }
            bk.b("AdCache.validateClicklog", str1 + " " + str2);
            localJSONArray.put(n, JSONObject.NULL);
          }
        }
        catch (JSONException localJSONException)
        {
          bk.a("AdCache.validateClicklog", "", localJSONException);
          return;
          u();
          continue;
        }
        catch (ParseException localParseException)
        {
          bk.a("AdCache.validateClicklog", "", localParseException);
          continue;
        }
      }
      label250:
      n++;
    }
  }
  
  private String w()
  {
    return d.format(new Date(System.currentTimeMillis()));
  }
  
  public Vector<Ad> a(t paramt)
  {
    Vector localVector = new Vector();
    try
    {
      JSONObject localJSONObject1 = this.j.getJSONObject(paramt.toString());
      Iterator localIterator = localJSONObject1.keys();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          String str = localIterator.next().toString();
          JSONObject localJSONObject2 = localJSONObject1.getJSONObject(str);
          Ad localAd = Ad.a(r(), localJSONObject2.getJSONObject("content"), str);
          if (localAd != null)
          {
            localVector.add(localAd);
            continue;
            if (localVector.size() != 0) {
              break;
            }
          }
        }
      }
    }
    catch (JSONException localJSONException)
    {
      bk.a("AdCache.init", "", localJSONException);
    }
    for (;;)
    {
      bk.b("AdCache.getAds", "No Ads(" + paramt + ")");
      localVector = null;
      return localVector;
      Collections.sort(localVector, new g(this));
    }
  }
  
  public void a(t paramt, int paramInt)
  {
    if (!r.k(r())) {
      return;
    }
    new h(this, paramt).start();
  }
  
  public void a(t paramt, long paramLong, JSONObject paramJSONObject)
  {
    synchronized (this.k)
    {
      JSONObject localJSONObject2 = this.k.getJSONObject(paramt.toString());
      JSONObject localJSONObject3 = new JSONObject();
      localJSONObject3.put("content", paramJSONObject);
      localJSONObject2.put(paramLong + "", localJSONObject3);
      u();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(paramLong);
      arrayOfObject[1] = Integer.valueOf(-1 + localJSONObject2.length());
      bk.b("AdCache.updateAd", String.format("[%d] at [%d]", arrayOfObject));
      return;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
    new i(this, paramBoolean).start();
  }
  
  public boolean a(Ad paramAd, Map<ay, Integer> paramMap)
  {
    bk.b("AdCache.setClicklog", paramAd + " " + paramMap);
    if (paramAd == null) {
      return false;
    }
    v();
    for (;;)
    {
      try
      {
        int n;
        synchronized (this.k)
        {
          JSONObject localJSONObject2 = this.k.getJSONObject("click");
          String str1 = paramAd.m();
          if (!localJSONObject2.has(str1))
          {
            JSONObject localJSONObject3 = new JSONObject();
            localJSONObject3.put("clklogurl", paramAd.h());
            localJSONObject3.put("record", new JSONArray());
            localJSONObject2.put(str1, localJSONObject3);
          }
          JSONArray localJSONArray = localJSONObject2.getJSONObject(str1).getJSONArray("record");
          n = 0;
          if ((n >= localJSONArray.length()) || ((!localJSONArray.isNull(n)) && (w().equals(localJSONArray.getJSONObject(n).getString("date")))))
          {
            if (n == localJSONArray.length())
            {
              JSONObject localJSONObject4 = new JSONObject();
              localJSONObject4.put("date", w());
              localJSONObject4.put("stamp", r.d());
              localJSONObject4.put("click", 0);
              localJSONObject4.put("show", 0);
              localJSONObject4.put("phone", 0);
              localJSONArray.put(localJSONObject4);
            }
            JSONObject localJSONObject5 = localJSONArray.getJSONObject(n);
            ay[] arrayOfay = ay.a();
            int i1 = arrayOfay.length;
            int i2 = 0;
            if (i2 < i1)
            {
              ay localay = arrayOfay[i2];
              String str2 = localay.toString().toLowerCase();
              localJSONObject5.put(str2, localJSONObject5.getInt(str2) + ((Integer)paramMap.get(localay)).intValue());
              i2++;
              continue;
            }
            u();
            bk.b("AdCache.setClicklog", paramMap.toString());
            return true;
          }
        }
        n++;
      }
      catch (Exception localException)
      {
        bk.a("AdCache.setClicklog", "", localException);
        return false;
      }
    }
  }
  
  public String b()
  {
    return this.h;
  }
  
  public void b(t paramt)
  {
    synchronized (this.k)
    {
      Iterator localIterator = this.k.getJSONObject(paramt.toString()).keys();
      if (localIterator.hasNext())
      {
        bk.b("AdCache.clearAds", localIterator.next().toString());
        localIterator.remove();
      }
    }
    u();
  }
  
  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
    new j(this, paramBoolean).start();
  }
  
  public void c()
  {
    try
    {
      this.j = new JSONObject(this.k.toString());
      return;
    }
    catch (JSONException localJSONException)
    {
      bk.a("AdCache.refresh", "", localJSONException);
    }
  }
  
  public void d()
  {
    bk.b("AdCache.validateResVolumn");
    File localFile1 = r().getFilesDir();
    File[] arrayOfFile1 = localFile1.listFiles(new d(this, a.values()));
    long l1 = 0L;
    int n = arrayOfFile1.length;
    int i1 = 0;
    while (i1 < n)
    {
      File localFile3 = arrayOfFile1[i1];
      bk.b(localFile3.toString() + " " + localFile3.length());
      long l3 = l1 + localFile3.length();
      i1++;
      l1 = l3;
    }
    bk.b("AdCache.validateResVolumn", l1 + "/" + 1048576);
    if (l1 <= 1048576L) {}
    for (;;)
    {
      return;
      File[] arrayOfFile2 = localFile1.listFiles(new e(this));
      ArrayList localArrayList = new ArrayList();
      int i2 = arrayOfFile2.length;
      for (int i3 = 0; i3 < i2; i3++) {
        localArrayList.add(arrayOfFile2[i3]);
      }
      Collections.sort(localArrayList, new f(this));
      long l2 = l1;
      for (int i4 = 0; (i4 < localArrayList.size()) && (l2 > 1048576L); i4++)
      {
        File localFile2 = (File)localArrayList.get(i4);
        bk.b(localFile2.lastModified() + " " + localFile2.getName() + " " + localFile2.length());
        l2 -= localFile2.length();
        w.b(false, r(), localFile2.getName());
        bk.b("AdCache.validateResVolumn", l2 + "/" + 1048576);
      }
    }
  }
  
  public boolean e()
  {
    bk.b("AdCache.isHangup", this.f + "");
    return this.f;
  }
  
  public boolean f()
  {
    bk.b("AdCache.isStopped", this.g + "");
    return this.g;
  }
  
  public String g()
  {
    return this.e;
  }
  
  public Bitmap h()
  {
    return a(k.c, false);
  }
  
  public Bitmap i()
  {
    return a(k.e, false);
  }
  
  public Bitmap j()
  {
    return a(k.b, false);
  }
  
  public Bitmap k()
  {
    return a(k.d, false);
  }
  
  public Bitmap l()
  {
    return a(k.h, true);
  }
  
  public Bitmap m()
  {
    return a(k.a, false);
  }
  
  public Bitmap n()
  {
    return a(k.f, false);
  }
  
  public Bitmap o()
  {
    return a(k.g, false);
  }
  
  public int p()
  {
    return 5;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.c
 * JD-Core Version:    0.7.0.1
 */