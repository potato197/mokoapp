import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import com.google.ads.Ad;
import com.google.ads.AdListener;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.google.ads.InterstitialAd;
import com.google.ads.util.AdUtil;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

public final class d
{
  private static final Object a = new Object();
  private WeakReference<Activity> b;
  private Ad c;
  private AdListener d;
  private c e;
  private AdRequest f;
  private AdSize g;
  private f h;
  private String i;
  private g j;
  private h k;
  private Handler l;
  private long m;
  private boolean n;
  private boolean o;
  private SharedPreferences p;
  private long q;
  private x r;
  private LinkedList<String> s;
  private LinkedList<String> t;
  private int u = 4;
  
  public d(Activity paramActivity, Ad paramAd, AdSize paramAdSize, String paramString)
  {
    this.b = new WeakReference(paramActivity);
    this.c = paramAd;
    this.g = paramAdSize;
    this.i = paramString;
    this.h = new f();
    this.d = null;
    this.e = null;
    this.f = null;
    this.n = false;
    this.l = new Handler();
    this.q = 0L;
    this.o = false;
    synchronized (a)
    {
      this.p = paramActivity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
      long l1 = this.p.getLong("InterstitialTimeout" + paramString, -1L);
      if (l1 < 0L)
      {
        this.m = 5000L;
        this.r = new x(this);
        this.s = new LinkedList();
        this.t = new LinkedList();
        a();
        AdUtil.h(paramActivity.getApplicationContext());
        return;
      }
      this.m = l1;
    }
  }
  
  /* Error */
  private boolean z()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 75	d:e	Lc;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull +9 -> 17
    //   11: iconst_1
    //   12: istore_3
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_3
    //   16: ireturn
    //   17: iconst_0
    //   18: istore_3
    //   19: goto -6 -> 13
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	this	d
    //   22	4	1	localObject	Object
    //   6	2	2	localc	c
    //   12	7	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public final void a()
  {
    for (;;)
    {
      try
      {
        Activity localActivity = e();
        if (localActivity == null)
        {
          com.google.ads.util.a.a("activity was null while trying to create an AdWebView.");
          return;
        }
        this.j = new g(localActivity.getApplicationContext(), this.g);
        this.j.setVisibility(8);
        if ((this.c instanceof AdView))
        {
          this.k = new h(this, a.b, true, false);
          this.j.setWebViewClient(this.k);
        }
        else
        {
          this.k = new h(this, a.b, true, true);
        }
      }
      finally {}
    }
  }
  
  public final void a(float paramFloat)
  {
    long l1 = (1000.0F * paramFloat);
    try
    {
      this.q = l1;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      this.u = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(long paramLong)
  {
    synchronized (a)
    {
      SharedPreferences.Editor localEditor = this.p.edit();
      localEditor.putLong("InterstitialTimeout" + this.i, paramLong);
      localEditor.commit();
      this.m = paramLong;
      return;
    }
  }
  
  public final void a(AdListener paramAdListener)
  {
    try
    {
      this.d = paramAdListener;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final void a(com.google.ads.AdRequest.ErrorCode paramErrorCode)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aconst_null
    //   4: putfield 75	d:e	Lc;
    //   7: aload_0
    //   8: getfield 63	d:c	Lcom/google/ads/Ad;
    //   11: instanceof 208
    //   14: ifeq +17 -> 31
    //   17: aload_1
    //   18: getstatic 214	com/google/ads/AdRequest$ErrorCode:NO_FILL	Lcom/google/ads/AdRequest$ErrorCode;
    //   21: if_acmpne +61 -> 82
    //   24: aload_0
    //   25: getfield 71	d:h	Lf;
    //   28: invokevirtual 216	f:n	()V
    //   31: new 106	java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial 107	java/lang/StringBuilder:<init>	()V
    //   38: ldc 218
    //   40: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: aload_1
    //   44: invokevirtual 221	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   47: ldc 223
    //   49: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 117	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: invokestatic 225	com/google/ads/util/a:c	(Ljava/lang/String;)V
    //   58: aload_0
    //   59: getfield 73	d:d	Lcom/google/ads/AdListener;
    //   62: ifnull +17 -> 79
    //   65: aload_0
    //   66: getfield 73	d:d	Lcom/google/ads/AdListener;
    //   69: aload_0
    //   70: getfield 63	d:c	Lcom/google/ads/Ad;
    //   73: aload_1
    //   74: invokeinterface 231 3 0
    //   79: aload_0
    //   80: monitorexit
    //   81: return
    //   82: aload_1
    //   83: getstatic 234	com/google/ads/AdRequest$ErrorCode:NETWORK_ERROR	Lcom/google/ads/AdRequest$ErrorCode;
    //   86: if_acmpne -55 -> 31
    //   89: aload_0
    //   90: getfield 71	d:h	Lf;
    //   93: invokevirtual 236	f:l	()V
    //   96: goto -65 -> 31
    //   99: astore_2
    //   100: aload_0
    //   101: monitorexit
    //   102: aload_2
    //   103: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	104	0	this	d
    //   0	104	1	paramErrorCode	com.google.ads.AdRequest.ErrorCode
    //   99	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	31	99	finally
    //   31	79	99	finally
    //   82	96	99	finally
  }
  
  public final void a(AdRequest paramAdRequest)
  {
    for (;;)
    {
      Activity localActivity;
      try
      {
        if (z())
        {
          com.google.ads.util.a.e("loadAd called while the ad is already loading.");
          return;
        }
        localActivity = e();
        if (localActivity == null)
        {
          com.google.ads.util.a.e("activity is null while trying to load an ad.");
          continue;
        }
        if (!AdUtil.c(localActivity.getApplicationContext())) {
          continue;
        }
      }
      finally {}
      if (AdUtil.b(localActivity.getApplicationContext()))
      {
        this.n = false;
        this.f = paramAdRequest;
        this.e = new c(this);
        this.e.execute(new AdRequest[] { paramAdRequest });
      }
    }
  }
  
  final void a(String paramString)
  {
    try
    {
      this.s.add(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void b()
  {
    try
    {
      a(null);
      y();
      this.j.destroy();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void b(String paramString)
  {
    try
    {
      this.t.add(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  public final void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 88	d:o	Z
    //   6: ifeq +28 -> 34
    //   9: ldc_w 272
    //   12: invokestatic 162	com/google/ads/util/a:a	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: getfield 84	d:l	Landroid/os/Handler;
    //   19: aload_0
    //   20: getfield 136	d:r	Lx;
    //   23: invokevirtual 276	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   26: aload_0
    //   27: iconst_0
    //   28: putfield 88	d:o	Z
    //   31: aload_0
    //   32: monitorexit
    //   33: return
    //   34: ldc_w 278
    //   37: invokestatic 162	com/google/ads/util/a:a	(Ljava/lang/String;)V
    //   40: goto -9 -> 31
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	d
    //   43	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	31	43	finally
    //   34	40	43	finally
  }
  
  public final void d()
  {
    for (;;)
    {
      try
      {
        if ((this.c instanceof AdView))
        {
          if (!this.o)
          {
            com.google.ads.util.a.a("Enabling refreshing every " + this.q + " milliseconds.");
            this.l.postDelayed(this.r, this.q);
            this.o = true;
            return;
          }
          com.google.ads.util.a.a("Refreshing is already enabled.");
          continue;
        }
        com.google.ads.util.a.a("Tried to enable refreshing on something other than an AdView.");
      }
      finally {}
    }
  }
  
  public final Activity e()
  {
    return (Activity)this.b.get();
  }
  
  final Ad f()
  {
    return this.c;
  }
  
  public final c g()
  {
    try
    {
      c localc = this.e;
      return localc;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final String h()
  {
    return this.i;
  }
  
  public final g i()
  {
    try
    {
      g localg = this.j;
      return localg;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final h j()
  {
    try
    {
      h localh = this.k;
      return localh;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final AdSize k()
  {
    return this.g;
  }
  
  public final f l()
  {
    return this.h;
  }
  
  public final int m()
  {
    try
    {
      int i1 = this.u;
      return i1;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final long n()
  {
    if ((this.c instanceof InterstitialAd)) {
      synchronized (a)
      {
        long l1 = this.m;
        return l1;
      }
    }
    return 60000L;
  }
  
  public final boolean o()
  {
    try
    {
      boolean bool = this.n;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final boolean p()
  {
    try
    {
      boolean bool = this.o;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final void q()
  {
    try
    {
      this.e = null;
      this.n = true;
      this.j.setVisibility(0);
      this.h.c();
      if ((this.c instanceof AdView)) {
        u();
      }
      com.google.ads.util.a.c("onReceiveAd()");
      if (this.d != null) {
        this.d.onReceiveAd(this.c);
      }
      return;
    }
    finally {}
  }
  
  public final void r()
  {
    try
    {
      this.h.o();
      com.google.ads.util.a.c("onDismissScreen()");
      if (this.d != null) {
        this.d.onDismissScreen(this.c);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void s()
  {
    try
    {
      this.h.b();
      com.google.ads.util.a.c("onPresentScreen()");
      if (this.d != null) {
        this.d.onPresentScreen(this.c);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void t()
  {
    try
    {
      com.google.ads.util.a.c("onLeaveApplication()");
      if (this.d != null) {
        this.d.onLeaveApplication(this.c);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void u()
  {
    for (;;)
    {
      try
      {
        Activity localActivity = (Activity)this.b.get();
        if (localActivity == null)
        {
          com.google.ads.util.a.e("activity was null while trying to ping tracking URLs.");
          return;
        }
        Iterator localIterator = this.s.iterator();
        if (localIterator.hasNext()) {
          new Thread(new w((String)localIterator.next(), localActivity.getApplicationContext())).start();
        } else {
          this.s.clear();
        }
      }
      finally {}
    }
  }
  
  public final boolean v()
  {
    for (;;)
    {
      boolean bool1;
      try
      {
        Activity localActivity;
        if (!this.t.isEmpty())
        {
          bool1 = true;
          localActivity = (Activity)this.b.get();
          if (localActivity == null)
          {
            com.google.ads.util.a.e("activity was null while trying to ping click tracking URLs.");
            bool2 = bool1;
            return bool2;
          }
        }
        else
        {
          bool1 = false;
          continue;
        }
        Iterator localIterator = this.t.iterator();
        if (localIterator.hasNext())
        {
          new Thread(new w((String)localIterator.next(), localActivity.getApplicationContext())).start();
          continue;
        }
        this.t.clear();
      }
      finally {}
      boolean bool2 = bool1;
    }
  }
  
  public final void w()
  {
    for (;;)
    {
      try
      {
        if (this.f == null) {
          break label94;
        }
        if ((this.c instanceof AdView))
        {
          if ((((AdView)this.c).isShown()) && (AdUtil.b()))
          {
            com.google.ads.util.a.c("Refreshing ad.");
            a(this.f);
            this.l.postDelayed(this.r, this.q);
            return;
          }
          com.google.ads.util.a.a("Not refreshing because the ad is not visible.");
          continue;
        }
        com.google.ads.util.a.a("Tried to refresh an ad that wasn't an AdView.");
      }
      finally {}
      continue;
      label94:
      com.google.ads.util.a.a("Tried to refresh before calling loadAd().");
    }
  }
  
  public final void x()
  {
    try
    {
      this.n = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void y()
  {
    try
    {
      if (this.e != null)
      {
        this.e.cancel(false);
        this.e = null;
      }
      this.j.stopLoading();
      return;
    }
    finally {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     d
 * JD-Core Version:    0.7.0.1
 */