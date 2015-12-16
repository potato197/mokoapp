package com.baidu;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.Vector;

class o
{
  private static Map<t, o> a = new HashMap();
  private q b = new q(this);
  private Vector<Ad> c;
  private int d = 0;
  private Timer e;
  private boolean f;
  private t g;
  
  static
  {
    for (t localt : t.a()) {
      a.put(localt, new o(localt));
    }
  }
  
  private o(t paramt)
  {
    this.g = paramt;
  }
  
  public static o a(t paramt)
  {
    return (o)a.get(paramt);
  }
  
  private void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  private boolean a()
  {
    return this.f;
  }
  
  private boolean b()
  {
    return (this.c == null) || (this.c.size() <= 0);
  }
  
  public Ad a(Context paramContext, String paramString, s params)
  {
    if (a())
    {
      a(false);
      c.a().c();
      this.c = null;
      this.d = 0;
    }
    if (this.c == null)
    {
      this.c = c.a().a(this.g);
      this.d = 0;
    }
    this.b.a(paramContext, paramString, params);
    if (this.e == null)
    {
      this.e = new Timer();
      this.e.schedule(this.b, 0L, 3600000L);
    }
    if ((this.c != null) && (this.c.size() > 0))
    {
      Vector localVector = this.c;
      int i = this.d;
      this.d = (i + 1);
      Ad localAd = (Ad)localVector.elementAt(i % this.c.size());
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(-1 + this.d);
      arrayOfObject[1] = localAd.toString();
      bk.b("AdLoader.fetchAd", String.format("[%d] %s", arrayOfObject));
      return localAd;
    }
    return null;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.o
 * JD-Core Version:    0.7.0.1
 */