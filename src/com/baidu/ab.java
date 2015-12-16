package com.baidu;

import android.graphics.Bitmap;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;

class ab
  implements Runnable
{
  ab(AdView paramAdView1, AdView paramAdView2) {}
  
  public void run()
  {
    for (;;)
    {
      Ad localAd;
      try
      {
        AdView.f(this.b);
        AdView.g(this.b);
        localAd = o.a(AdView.c(this.b)).a(this.b.getContext(), AdView.h(this.b), AdView.i(this.b));
        if (this.b.a())
        {
          bk.b("AdLoaderHandler.run", "[has spam] do nothing, wait next timeout");
          AdView.a(this.b, false);
          return;
        }
        if (localAd == null)
        {
          bk.b("AdLoaderHandler.run", "No Ads in cache");
          continue;
        }
        AdView.j(this.b).b();
      }
      catch (Exception localException)
      {
        AdView.l(this.b);
        bk.a("AdLoadHandler.run", "Unhandled exception while requesting an ad.", localException);
        return;
      }
      ag localag = AdView.a(this.b, this.b.getWidth(), this.b.getHeight(), localAd);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localag.a);
      arrayOfObject[1] = Integer.valueOf(localag.b);
      bk.b("AdLoaderHandler.run", String.format("adapter size(%d, %d)", arrayOfObject));
      ViewGroup.LayoutParams localLayoutParams = this.b.getLayoutParams();
      localLayoutParams.width = localag.a;
      localLayoutParams.height = localag.b;
      this.a.setLayoutParams(localLayoutParams);
      int i = r.i(this.b.getContext());
      int j = r.h(this.b.getContext());
      if (AdView.c(this.b) == t.b)
      {
        localag.a = Math.min(i, j);
        localag.b = ((int)(localag.a / localAd.c().getWidth() * localAd.c().getHeight()));
      }
      AdView.j(this.b).setVisibility(this.b.getVisibility());
      RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(localag.a, localag.b);
      localLayoutParams1.addRule(13);
      AdView.j(this.b).setLayoutParams(localLayoutParams1);
      AdView.j(this.b).a(localAd, AdView.c(this.b), AdView.k(this.b), localag);
      AdView.j(this.b).setBackgroundColor(this.b.getBackgroundColor());
      AdView.j(this.b).b(this.b.getBackgroundTransparent());
      AdView.j(this.b).a(this.b.getTextColor());
      this.a.startAnimation(AdView.j(this.b).g());
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.ab
 * JD-Core Version:    0.7.0.1
 */