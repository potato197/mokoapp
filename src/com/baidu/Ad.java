package com.baidu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;

public class Ad
{
  private String a;
  private String b;
  private String c;
  private t d;
  private Bitmap e;
  private Bitmap f;
  private Bitmap g;
  private Bitmap h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private bj n;
  private ClickType o = ClickType.BROWSE;
  private int p;
  private int q;
  private int r;
  private int s;
  private long t;
  
  static Ad a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString7, String paramString8, String paramString9, long paramLong)
  {
    Ad localAd = a(paramContext, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramLong);
    if (localAd != null)
    {
      localAd.p = paramInt1;
      localAd.r = paramInt3;
      localAd.q = paramInt2;
      localAd.s = paramInt4;
    }
    return localAd;
  }
  
  private static Ad a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, long paramLong)
  {
    if (paramString4.equals("")) {
      throw new IllegalArgumentException("id");
    }
    Ad localAd = new Ad();
    if (paramString7.trim().equals(""))
    {
      localAd.n = bj.d;
      localAd.i = "";
      localAd.e = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
    }
    c localc;
    for (;;)
    {
      localAd.a = paramString4;
      localAd.d = t.a(paramString5);
      localAd.m = paramString6;
      localAd.l = paramString8;
      localAd.c = paramString1.replace("{empty}", "").trim();
      localAd.b = paramString2.replace("$$", " ").trim();
      localAd.j = paramString3;
      if (localAd.d != t.c) {}
      try
      {
        String str2 = c.a().g() + "/ad.html?url=%s&sn=%s&clk=%s";
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = URLEncoder.encode(paramString3, "utf-8");
        arrayOfObject[1] = r.f(paramContext);
        arrayOfObject[2] = "";
        localAd.j = String.format(str2, arrayOfObject);
        localAd.k = paramString9;
        localAd.t = paramLong;
        if (paramString3.toLowerCase().endsWith(".apk")) {
          localAd.o = ClickType.DOWNLOAD;
        }
        if (!localAd.m.equals("")) {
          localAd.o = ClickType.PHONE;
        }
        if (localAd.d == t.c) {
          localAd.o = ClickType.DOWNLOAD;
        }
        localc = c.a();
        switch (b.a[localAd.o.ordinal()])
        {
        default: 
          localAd.g = c.a().m();
          localAd.h = c.a().l();
          return localAd;
          int i1 = paramString7.toLowerCase().lastIndexOf('.');
          String str1 = "";
          if (i1 >= 0) {
            str1 = paramString7.toLowerCase().substring(i1);
          }
          if (str1.equals(".gif")) {
            localAd.n = bj.b;
          }
          for (;;)
          {
            localAd.i = w.e(paramString7);
            localAd.e = w.d(false, paramContext, localAd.i);
            if (localAd.e != null) {
              break;
            }
            bk.b("Ad.created", "Empty image, reloaded");
            new a(paramContext, paramString7, localAd).start();
            return null;
            if ((str1.equals(".swf")) || (str1.equals(".flv"))) {
              localAd.n = bj.c;
            } else {
              localAd.n = bj.a;
            }
          }
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        for (;;)
        {
          bk.a("Ad.created", localUnsupportedEncodingException);
        }
        if (t.b == localAd.d) {}
        for (Bitmap localBitmap3 = localc.i();; localBitmap3 = localc.h())
        {
          localAd.f = localBitmap3;
          break;
        }
        if (t.b == localAd.d) {}
        for (Bitmap localBitmap2 = localc.k();; localBitmap2 = localc.j())
        {
          localAd.f = localBitmap2;
          break;
        }
        if (t.b != localAd.d) {}
      }
    }
    for (Bitmap localBitmap1 = localc.o();; localBitmap1 = localc.n())
    {
      localAd.f = localBitmap1;
      break;
    }
  }
  
  static Ad a(Context paramContext, JSONObject paramJSONObject, String paramString)
  {
    String str1 = paramJSONObject.getString("tit");
    String str2 = paramJSONObject.getString("desc");
    String str3 = paramJSONObject.getString("curl");
    String str4 = paramJSONObject.getString("surl");
    String str5 = paramJSONObject.getString("type");
    String str6 = paramJSONObject.getString("phone");
    long l1 = paramJSONObject.getLong("ad_charge");
    int i1 = paramJSONObject.getInt("styt");
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    if (i1 == 1)
    {
      i2 = paramJSONObject.getInt("titc");
      i3 = paramJSONObject.getInt("bgc");
      i4 = paramJSONObject.getInt("trsp");
    }
    return a(paramContext, str1, str2, str3, paramString, str5, str6, i1, i2, i3, i4, paramJSONObject.getString("w_picurl"), paramJSONObject.getString("clklogurl"), str4, l1);
  }
  
  String a()
  {
    return this.i;
  }
  
  t b()
  {
    return this.d;
  }
  
  Bitmap c()
  {
    return this.e;
  }
  
  Bitmap d()
  {
    return this.e;
  }
  
  Bitmap e()
  {
    return this.f;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Ad)) {
      return m().equals(((Ad)paramObject).m());
    }
    return false;
  }
  
  Bitmap f()
  {
    return this.g;
  }
  
  Bitmap g()
  {
    return this.h;
  }
  
  public ClickType getClickType()
  {
    return this.o;
  }
  
  public String getClickURL()
  {
    return this.j;
  }
  
  public String getDescription()
  {
    return this.b;
  }
  
  public String getPhone()
  {
    return this.m;
  }
  
  public String getSURL()
  {
    return this.k;
  }
  
  public String getTitle()
  {
    return this.c;
  }
  
  public AdType getType()
  {
    return this.d.c();
  }
  
  String h()
  {
    return this.l;
  }
  
  int i()
  {
    return this.p;
  }
  
  int j()
  {
    return this.q;
  }
  
  int k()
  {
    return this.r;
  }
  
  int l()
  {
    return this.s;
  }
  
  String m()
  {
    return this.a;
  }
  
  bj n()
  {
    return this.n;
  }
  
  long o()
  {
    return this.t;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = m();
    arrayOfObject[1] = b();
    arrayOfObject[2] = getTitle();
    arrayOfObject[3] = getDescription();
    arrayOfObject[4] = getPhone();
    return String.format("%s; %s; %s; %s; %s", arrayOfObject);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.Ad
 * JD-Core Version:    0.7.0.1
 */