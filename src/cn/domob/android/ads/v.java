package cn.domob.android.ads;

import android.util.Log;

final class v
{
  private DomobAdView a = null;
  
  public v(DomobAdView paramDomobAdView)
  {
    this.a = paramDomobAdView;
  }
  
  public final void a()
  {
    if (this.a != null) {
      DomobAdView.b(this.a);
    }
  }
  
  public final void a(g paramg)
  {
    if (this.a != null) {}
    synchronized (this.a)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "new ad, construct it.");
      }
      this.a.a(paramg, paramg.b());
      return;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.v
 * JD-Core Version:    0.7.0.1
 */