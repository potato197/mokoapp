package net.youmi.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Toast;
import java.io.File;

class fe
  extends FrameLayout
  implements dl, eb
{
  cx a;
  au b;
  boolean c = false;
  df d;
  AdView e;
  int f = 255;
  Activity g;
  dy h;
  Animation i = new AlphaAnimation(0.0F, 1.0F);
  Animation j = new AlphaAnimation(1.0F, 0.0F);
  
  fe(Activity paramActivity, AdView paramAdView, ca paramca, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramActivity);
    this.g = paramActivity;
    this.e = paramAdView;
    this.f = paramInt3;
    int k = this.e.getAdWidth();
    int m = this.e.getAdHeight();
    c(paramInt1);
    en localen = new en(k, m, paramca);
    this.b = new au(paramActivity, paramAdView, this, paramAdView.getAdWidth(), paramAdView.getAdHeight(), paramca, localen);
    int n = this.e.getAdWidth() - localen.a();
    int i1 = paramca.a().d().b() + 2 * paramca.a().d().a();
    if (n < i1) {}
    for (;;)
    {
      this.a = new cx(paramActivity, paramAdView, this, paramca, paramInt2, this.e.getAdWidth() - i1 - paramca.a().c().b() - 2 * paramca.a().c().a());
      FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(k, m);
      addView(this.a, localLayoutParams1);
      FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(this.e.getAdWidth(), this.e.getAdHeight());
      addView(this.b, localLayoutParams2);
      this.b.bringToFront();
      this.d = new df(paramActivity, k, m, paramca);
      FrameLayout.LayoutParams localLayoutParams3 = new FrameLayout.LayoutParams(k, m);
      addView(this.d, localLayoutParams3);
      this.d.bringToFront();
      this.d.setVisibility(8);
      FrameLayout.LayoutParams localLayoutParams4 = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams4.gravity = 85;
      localLayoutParams4.rightMargin = paramca.a(paramca.a().d().a());
      localLayoutParams4.bottomMargin = paramca.a(paramca.a().d().a());
      this.i.setDuration(800L);
      this.j.setDuration(800L);
      setFocusable(true);
      setClickable(true);
      setVisibility(8);
      b();
      return;
      i1 = n;
    }
  }
  
  public void a()
  {
    this.e.a().c = false;
    try
    {
      this.d.setVisibility(8);
      this.d.a();
      try
      {
        label27:
        Toast.makeText(this.g, "无法连接服务器,请稍后重试!", 0).show();
        return;
      }
      catch (Exception localException2) {}
    }
    catch (Exception localException1)
    {
      break label27;
    }
  }
  
  public void a(int paramInt)
  {
    try
    {
      this.d.a(paramInt);
      return;
    }
    catch (Exception localException) {}
  }
  
  void a(cu paramcu)
  {
    if ((paramcu != null) && (paramcu.i() != null))
    {
      dp.a = paramcu;
      AdActivity.a(this.g);
    }
  }
  
  /* Error */
  public void a(dw paramdw, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	net/youmi/android/fe:e	Lnet/youmi/android/AdView;
    //   4: invokevirtual 163	net/youmi/android/AdView:a	()Lnet/youmi/android/a;
    //   7: iconst_0
    //   8: putfield 166	net/youmi/android/a:c	Z
    //   11: aload_2
    //   12: ifnonnull +8 -> 20
    //   15: aload_0
    //   16: invokevirtual 200	net/youmi/android/fe:e	()V
    //   19: return
    //   20: new 202	java/lang/Thread
    //   23: dup
    //   24: new 204	net/youmi/android/br
    //   27: dup
    //   28: aload_0
    //   29: aload_1
    //   30: invokespecial 207	net/youmi/android/br:<init>	(Lnet/youmi/android/fe;Lnet/youmi/android/dw;)V
    //   33: invokespecial 210	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   36: invokevirtual 213	java/lang/Thread:start	()V
    //   39: aload_0
    //   40: getfield 47	net/youmi/android/fe:g	Landroid/app/Activity;
    //   43: aload_2
    //   44: aload_1
    //   45: invokevirtual 218	net/youmi/android/dw:e	()Ljava/lang/String;
    //   48: aload_1
    //   49: invokevirtual 220	net/youmi/android/dw:f	()Ljava/lang/String;
    //   52: invokestatic 223	net/youmi/android/AdActivity:a	(Landroid/app/Activity;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   55: aload_0
    //   56: getfield 124	net/youmi/android/fe:d	Lnet/youmi/android/df;
    //   59: bipush 8
    //   61: invokevirtual 128	net/youmi/android/df:setVisibility	(I)V
    //   64: aload_0
    //   65: getfield 124	net/youmi/android/fe:d	Lnet/youmi/android/df;
    //   68: invokevirtual 168	net/youmi/android/df:a	()V
    //   71: return
    //   72: astore 6
    //   74: return
    //   75: astore_3
    //   76: return
    //   77: astore 5
    //   79: goto -24 -> 55
    //   82: astore 4
    //   84: goto -45 -> 39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	87	0	this	fe
    //   0	87	1	paramdw	dw
    //   0	87	2	paramArrayOfString	String[]
    //   75	1	3	localException1	Exception
    //   82	1	4	localException2	Exception
    //   77	1	5	localException3	Exception
    //   72	1	6	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   55	71	72	java/lang/Exception
    //   0	11	75	java/lang/Exception
    //   15	19	75	java/lang/Exception
    //   39	55	77	java/lang/Exception
    //   20	39	82	java/lang/Exception
  }
  
  public void a(i parami)
  {
    this.e.a().c = false;
    this.e.a().c = false;
    try
    {
      this.d.setVisibility(8);
      this.d.a();
      label38:
      r.c(this.g);
      ay.a(this.g, "开始下载");
      try
      {
        bw localbw = new bw();
        localbw.a = parami.c();
        localbw.c = parami.a();
        localbw.d = parami.b();
        k.a(this.g, localbw, 1);
        return;
      }
      catch (Exception localException2) {}
    }
    catch (Exception localException1)
    {
      break label38;
    }
  }
  
  public void a(i parami, File paramFile, String paramString)
  {
    r.d(this.g);
    if ((paramFile != null) && (paramFile.exists())) {
      ay.a(this.g, "下载成功");
    }
    try
    {
      bw localbw = k.a(this.g, paramFile.getPath(), paramString, parami.a(), parami.b(), parami.c());
      k.a(this.g, localbw, 2);
      k.a(this.g, localbw, 3);
      be.b(this.g, paramFile.getPath());
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        f.a(localException);
      }
    }
  }
  
  /* Error */
  public void a(i parami, em paramem)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	net/youmi/android/fe:e	Lnet/youmi/android/AdView;
    //   4: invokevirtual 163	net/youmi/android/AdView:a	()Lnet/youmi/android/a;
    //   7: iconst_0
    //   8: putfield 166	net/youmi/android/a:c	Z
    //   11: aload_2
    //   12: ifnonnull +8 -> 20
    //   15: aload_0
    //   16: invokevirtual 200	net/youmi/android/fe:e	()V
    //   19: return
    //   20: aload_0
    //   21: getfield 49	net/youmi/android/fe:e	Lnet/youmi/android/AdView;
    //   24: invokevirtual 289	net/youmi/android/AdView:c	()Lnet/youmi/android/cu;
    //   27: astore 6
    //   29: aload 6
    //   31: ifnonnull +30 -> 61
    //   34: aload_0
    //   35: invokevirtual 200	net/youmi/android/fe:e	()V
    //   38: return
    //   39: astore 4
    //   41: aload_0
    //   42: getfield 124	net/youmi/android/fe:d	Lnet/youmi/android/df;
    //   45: bipush 8
    //   47: invokevirtual 128	net/youmi/android/df:setVisibility	(I)V
    //   50: aload_0
    //   51: getfield 124	net/youmi/android/fe:d	Lnet/youmi/android/df;
    //   54: invokevirtual 168	net/youmi/android/df:a	()V
    //   57: return
    //   58: astore 5
    //   60: return
    //   61: aload_2
    //   62: aload_2
    //   63: invokevirtual 292	net/youmi/android/em:b	()Ljava/lang/String;
    //   66: aload 6
    //   68: invokevirtual 295	net/youmi/android/cu:z	()Ljava/lang/String;
    //   71: aload 6
    //   73: invokevirtual 298	net/youmi/android/cu:o	()Ljava/lang/String;
    //   76: aload 6
    //   78: invokevirtual 301	net/youmi/android/cu:k	()Ljava/lang/String;
    //   81: invokestatic 306	net/youmi/android/ba:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   84: invokevirtual 309	net/youmi/android/em:a	(Ljava/lang/String;)V
    //   87: aload 6
    //   89: aload_2
    //   90: invokevirtual 312	net/youmi/android/cu:a	(Lnet/youmi/android/em;)V
    //   93: new 202	java/lang/Thread
    //   96: dup
    //   97: new 314	net/youmi/android/ds
    //   100: dup
    //   101: aload_0
    //   102: aload 6
    //   104: aload_1
    //   105: invokespecial 317	net/youmi/android/ds:<init>	(Lnet/youmi/android/fe;Lnet/youmi/android/cu;Lnet/youmi/android/i;)V
    //   108: invokespecial 210	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   111: invokevirtual 213	java/lang/Thread:start	()V
    //   114: aload_0
    //   115: aload 6
    //   117: invokevirtual 319	net/youmi/android/fe:a	(Lnet/youmi/android/cu;)V
    //   120: goto -79 -> 41
    //   123: astore_3
    //   124: return
    //   125: astore 7
    //   127: goto -13 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	fe
    //   0	130	1	parami	i
    //   0	130	2	paramem	em
    //   123	1	3	localException1	Exception
    //   39	1	4	localException2	Exception
    //   58	1	5	localException3	Exception
    //   27	89	6	localcu	cu
    //   125	1	7	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   20	29	39	java/lang/Exception
    //   34	38	39	java/lang/Exception
    //   61	93	39	java/lang/Exception
    //   114	120	39	java/lang/Exception
    //   41	57	58	java/lang/Exception
    //   0	11	123	java/lang/Exception
    //   15	19	123	java/lang/Exception
    //   93	114	125	java/lang/Exception
  }
  
  void b() {}
  
  public void b(int paramInt)
  {
    try
    {
      this.d.a(paramInt);
      return;
    }
    catch (Exception localException) {}
  }
  
  void b(cu paramcu)
  {
    try
    {
      this.a.a(paramcu);
      this.b.a(paramcu);
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  public void b(i parami, File paramFile, String paramString)
  {
    this.e.a().c = false;
    try
    {
      this.d.setVisibility(8);
      this.d.a();
      label27:
      if ((paramFile != null) && (paramFile.exists())) {
        ay.a(this.g, "下载成功");
      }
      try
      {
        bw localbw = k.a(this.g, paramFile.getPath(), paramString, parami.a(), parami.b(), parami.c());
        k.a(this.g, localbw, 3);
        be.b(this.g, paramFile.getPath());
        return;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          f.a(localException2);
        }
      }
    }
    catch (Exception localException1)
    {
      break label27;
    }
  }
  
  void c()
  {
    try
    {
      Toast.makeText(this.g, "正在加载", 0).show();
      cu localcu = this.e.c();
      if (localcu != null) {
        switch (localcu.a())
        {
        case -1: 
          em localem = localcu.i();
          if (localem != null) {
            try
            {
              WebView localWebView = new WebView(this.g);
              localWebView.loadDataWithBaseURL(null, localcu.i().b(), "text/html", "utf-8", null);
              new AlertDialog.Builder(this.g).setTitle("有米广告SDK配置简易教程").setView(localWebView).create().show();
              return;
            }
            catch (Exception localException10)
            {
              f.a(localException10);
              return;
            }
          }
          break;
        case 11: 
          if (localcu.i() != null)
          {
            a(localcu);
            return;
          }
          this.e.a().c = true;
          i locali2 = new i(this.g, this);
          String[] arrayOfString3 = new String[1];
          arrayOfString3[0] = localcu.p();
          locali2.execute(arrayOfString3);
          return;
        case 21: 
          try
          {
            this.h = new dy(this.g, localcu, System.currentTimeMillis() - localcu.A(), 0L);
            be.c(this.g, localcu.p());
            return;
          }
          catch (Exception localException9)
          {
            return;
          }
        case 22: 
        case 31: 
        case 41: 
        case 42: 
        case 43: 
        case 44: 
          try
          {
            this.e.a().c = true;
            i locali1 = new i(this.g, this, localcu.f());
            String[] arrayOfString2 = new String[1];
            arrayOfString2[0] = localcu.p();
            locali1.execute(arrayOfString2);
            try
            {
              label353:
              ak.a(this.g, localcu);
              return;
            }
            catch (Exception localException8)
            {
              return;
            }
            try
            {
              String[] arrayOfString1 = localcu.x();
              if (arrayOfString1 == null) {
                break label587;
              }
              this.e.a().c = true;
              new dw(this.g, this, localcu).execute(new String[][] { arrayOfString1 });
              return;
            }
            catch (Exception localException6)
            {
              return;
            }
            try
            {
              this.h = new dy(this.g, localcu, System.currentTimeMillis() - localcu.A(), 0L);
              be.a(this.g, Uri.parse(localcu.p()));
              return;
            }
            catch (Exception localException5)
            {
              return;
            }
            try
            {
              this.h = new dy(this.g, localcu, System.currentTimeMillis() - localcu.A(), 0L);
              z.a(this.g, localcu.p());
              return;
            }
            catch (Exception localException4)
            {
              return;
            }
            try
            {
              this.h = new dy(this.g, localcu, System.currentTimeMillis() - localcu.A(), 0L);
              z.c(this.g, localcu.p());
              return;
            }
            catch (Exception localException3)
            {
              return;
            }
            try
            {
              this.h = new dy(this.g, localcu, System.currentTimeMillis() - localcu.A(), 0L);
              z.b(this.g, localcu.p());
              return;
            }
            catch (Exception localException2)
            {
              return;
            }
          }
          catch (Exception localException7)
          {
            break label353;
          }
        }
      }
      label587:
      return;
    }
    catch (Exception localException1) {}
  }
  
  void c(int paramInt)
  {
    int k = this.f;
    int m = Color.red(paramInt);
    int n = Color.green(paramInt);
    int i1 = Color.blue(paramInt);
    int i2;
    int i3;
    label56:
    int i4;
    label74:
    int i5;
    label87:
    int i6;
    if (m + 60 < 255)
    {
      i2 = m + 60;
      if (n + 60 >= 255) {
        break label179;
      }
      i3 = n + 60;
      if (i1 + 60 >= 255) {
        break label187;
      }
      i4 = i1 + 60;
      if (m - 60 <= 0) {
        break label195;
      }
      i5 = m - 60;
      if (n - 60 <= 0) {
        break label201;
      }
      i6 = n - 60;
      label102:
      if (i1 - 60 <= 0) {
        break label207;
      }
    }
    label179:
    label187:
    label195:
    label201:
    label207:
    for (int i7 = i1 - 60;; i7 = 0)
    {
      GradientDrawable.Orientation localOrientation = GradientDrawable.Orientation.TOP_BOTTOM;
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = Color.argb(k, i2, i3, i4);
      arrayOfInt[1] = Color.argb(k, i5, i6, i7);
      setBackgroundDrawable(new GradientDrawable(localOrientation, arrayOfInt));
      return;
      i2 = 255;
      break;
      i3 = 255;
      break label56;
      i4 = 255;
      break label74;
      i5 = 0;
      break label87;
      i6 = 0;
      break label102;
    }
  }
  
  public void e()
  {
    this.e.a().c = false;
    try
    {
      this.d.setVisibility(8);
      this.d.a();
      try
      {
        label27:
        Toast.makeText(this.g, "无法连接服务器,请稍后重试!", 0).show();
        return;
      }
      catch (Exception localException2) {}
    }
    catch (Exception localException1)
    {
      break label27;
    }
  }
  
  public void f()
  {
    this.e.a().c = false;
    ay.a(this.g, "正在下载");
    try
    {
      this.d.setVisibility(8);
      this.d.a();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void g()
  {
    this.e.a().c = false;
    ay.a(this.g, "存储卡不可用,请启用存储卡", 1);
    try
    {
      this.d.setVisibility(8);
      this.d.a();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void h()
  {
    r.d(this.g);
    ay.a(this.g, "下载失败");
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    try
    {
      if (this.h != null) {
        this.h.a();
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.fe
 * JD-Core Version:    0.7.0.1
 */