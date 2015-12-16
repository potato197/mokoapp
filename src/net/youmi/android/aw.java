package net.youmi.android;

import android.app.Activity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;

final class aw
  extends WebView
  implements eb
{
  d a;
  Activity b;
  cu c;
  
  public aw(Activity paramActivity, cu paramcu, o paramo)
  {
    super(paramActivity);
    this.a = new d(this, paramo);
    this.b = paramActivity;
    this.c = paramcu;
    i();
  }
  
  public aw(Activity paramActivity, o paramo)
  {
    super(paramActivity);
    this.a = new d(this, paramo);
    this.b = paramActivity;
    i();
  }
  
  private void b(em paramem)
  {
    if (paramem != null) {}
    try
    {
      loadDataWithBaseURL(paramem.a(), paramem.b(), "text/html", "utf-8", null);
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  private void i()
  {
    try
    {
      
      label3:
      j();
      k();
      l();
      m();
      return;
    }
    catch (Exception localException)
    {
      break label3;
    }
  }
  
  private void j()
  {
    WebSettings localWebSettings = getSettings();
    localWebSettings.setCacheMode(1);
    localWebSettings.setAllowFileAccess(true);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSupportZoom(true);
    localWebSettings.setBuiltInZoomControls(true);
    localWebSettings.setUseWideViewPort(true);
    localWebSettings.setLightTouchEnabled(true);
    localWebSettings.setSavePassword(true);
  }
  
  private void k()
  {
    setWebViewClient(new cl(this));
  }
  
  private void l()
  {
    setWebChromeClient(new cg(this));
  }
  
  private void m()
  {
    try
    {
      setDownloadListener(new cj(this));
      return;
    }
    catch (Exception localException) {}
  }
  
  void a()
  {
    b(this.a.a());
  }
  
  public void a(int paramInt)
  {
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      try
      {
        if (this.b != null)
        {
          if (paramInt >= 100)
          {
            this.b.setProgressBarVisibility(false);
            return;
          }
          this.b.setProgressBarIndeterminateVisibility(true);
          this.b.setProgress(paramInt * 100);
          return;
        }
      }
      catch (Exception localException) {}
    }
  }
  
  void a(em paramem)
  {
    b(this.a.a(paramem));
  }
  
  public void a(i parami)
  {
    r.c(this.b);
    ay.a(this.b, "开始下载");
    a(100);
    try
    {
      bw localbw = new bw();
      localbw.a = parami.c();
      localbw.c = parami.a();
      localbw.d = parami.b();
      k.a(this.b, localbw, 1);
      return;
    }
    catch (Exception localException) {}
  }
  
  public void a(i parami, File paramFile, String paramString)
  {
    r.d(this.b);
    if ((paramFile != null) && (paramFile.exists())) {
      ay.a(this.b, "下载成功");
    }
    try
    {
      bw localbw = k.a(this.b, paramFile.getPath(), paramString, parami.a(), parami.b(), parami.c());
      k.a(this.b, localbw, 2);
      k.a(this.b, localbw, 3);
      be.b(this.b, paramFile.getPath());
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
  
  public void a(i parami, em paramem)
  {
    if (paramem != null)
    {
      if (this.c != null) {
        paramem.a(ba.a(paramem.b(), this.c.z(), this.c.o(), this.c.k()));
      }
      a(paramem);
    }
  }
  
  void b()
  {
    b(this.a.c());
  }
  
  public void b(i parami, File paramFile, String paramString)
  {
    a(100);
    if ((paramFile != null) && (paramFile.exists())) {
      ay.a(this.b, "下载成功");
    }
    try
    {
      bw localbw = k.a(this.b, paramFile.getPath(), paramString, parami.a(), parami.b(), parami.c());
      k.a(this.b, localbw, 3);
      be.b(this.b, paramFile.getPath());
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
  
  boolean c()
  {
    return this.a.f();
  }
  
  void d()
  {
    b(this.a.b());
  }
  
  public void e()
  {
    a(100);
  }
  
  public void f()
  {
    ay.a(this.b, "正在下载");
    a(100);
  }
  
  public void g()
  {
    ay.a(this.b, "存储卡不可用,请启用存储卡", 1);
    a(100);
  }
  
  public void h()
  {
    r.d(this.b);
    ay.a(this.b, "下载失败");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.aw
 * JD-Core Version:    0.7.0.1
 */