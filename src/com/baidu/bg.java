package com.baidu;

import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class bg
  extends l
{
  private Map<String, GifAnimView> k = new HashMap();
  private int l = 255;
  
  public bg(AdView paramAdView)
  {
    super(paramAdView);
    bk.b("ImageAdContainer", "{");
    setFocusable(true);
    setClickable(true);
    bk.b("ImageAdContainer", "}");
  }
  
  private void l()
  {
    if (this.b == null) {
      return;
    }
    Iterator localIterator = this.k.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      ((GifAnimView)localEntry.getValue()).setVisibility(8);
      ((GifAnimView)localEntry.getValue()).a();
    }
    setBackgroundDrawable(null);
    switch (bi.a[this.b.n().ordinal()])
    {
    default: 
    case 1: 
      for (;;)
      {
        if (this.e != null)
        {
          removeView(this.e);
          this.e = null;
        }
        this.e = new ImageView(getContext());
        RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(this.h, this.h);
        localLayoutParams1.addRule(15);
        localLayoutParams1.addRule(11);
        this.e.setLayoutParams(localLayoutParams1);
        this.e.setImageBitmap(this.b.e());
        this.e.setAlpha((int)(0.8D * this.l));
        addView(this.e);
        return;
        BitmapDrawable localBitmapDrawable = new BitmapDrawable(this.b.c());
        localBitmapDrawable.setAlpha(this.l);
        setBackgroundDrawable(localBitmapDrawable);
      }
    }
    GifAnimView localGifAnimView;
    if (!this.k.containsKey(this.b.m()))
    {
      localGifAnimView = new GifAnimView(getContext(), new bh(this));
      localGifAnimView.a(w.e(false, getContext(), this.b.a()));
      addView(localGifAnimView);
      this.k.put(this.b.m(), localGifAnimView);
    }
    for (;;)
    {
      localGifAnimView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
      ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
      localGifAnimView.a(localLayoutParams.width, localLayoutParams.height);
      localGifAnimView.a(this.l);
      break;
      localGifAnimView = (GifAnimView)this.k.get(this.b.m());
      localGifAnimView.setVisibility(0);
      localGifAnimView.b();
    }
  }
  
  public void a(int paramInt) {}
  
  public void a(Ad paramAd, t paramt, int paramInt, ag paramag)
  {
    bk.b("ImageAdContainer", "setAd");
    this.g = paramag.a;
    this.h = paramag.b;
    this.c = ((int)(0.10416666418314D * this.h));
    if ((paramAd == null) || (paramAd.c() == null)) {
      throw new IllegalArgumentException();
    }
    this.d = false;
    this.b = paramAd;
    l();
    super.a(paramAd, paramt, paramInt, paramag);
  }
  
  public void b(int paramInt)
  {
    if (this.l != paramInt) {}
    for (int i = 1;; i = 0)
    {
      this.l = paramInt;
      if (i != 0) {
        l();
      }
      return;
    }
  }
  
  public void setBackgroundColor(int paramInt) {}
  
  public void setVisibility(int paramInt)
  {
    if (getVisibility() == paramInt) {}
    GifAnimView localGifAnimView;
    for (;;)
    {
      return;
      super.setVisibility(paramInt);
      bk.b("ImageAdContainer.setVisibility", "visibility:" + paramInt);
      try
      {
        localGifAnimView = (GifAnimView)this.k.get(this.b.m());
        if (localGifAnimView != null) {
          if (paramInt != 0)
          {
            localGifAnimView.a();
            return;
          }
        }
      }
      catch (Exception localException)
      {
        bk.a(localException);
        return;
      }
    }
    localGifAnimView.b();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.bg
 * JD-Core Version:    0.7.0.1
 */