package com.baidu;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;

class bn
  extends l
{
  private LinearLayout k;
  private aw l;
  private aw m;
  private ImageView n;
  private ImageView o;
  private BitmapDrawable p;
  private float q;
  private int r = -11184811;
  private int s = -1;
  private int t = 255;
  private int u;
  
  public bn(AdView paramAdView)
  {
    super(paramAdView);
    bk.b("TextAdContainer", "{");
    setFocusable(true);
    setClickable(true);
    this.n = new ImageView(getContext());
    this.o = new ImageView(getContext());
    this.l = new aw(getContext());
    this.m = new aw(getContext());
    this.n.setScaleType(ImageView.ScaleType.FIT_XY);
    this.o.setScaleType(ImageView.ScaleType.FIT_XY);
    bk.b("TextAdContainer", "}");
  }
  
  private BitmapDrawable a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    bk.b(String.format("TextAdContainer.refreshBackgroundDrawable tc:%X bc:%X bt:%d", arrayOfObject));
    try
    {
      Bitmap localBitmap = Bitmap.createBitmap(paramRect.width(), paramRect.height(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Paint localPaint1 = new Paint();
      localPaint1.setColor(Color.argb(paramInt3, Color.red(paramInt1), Color.green(paramInt1), Color.blue(paramInt1)));
      localPaint1.setAntiAlias(true);
      localCanvas.drawRect(paramRect, localPaint1);
      int i = Color.argb(paramInt3 / 2, Color.red(paramInt2), Color.green(paramInt2), Color.blue(paramInt2));
      int j = Color.argb(paramInt3, Color.red(paramInt2), Color.green(paramInt2), Color.blue(paramInt2));
      GradientDrawable localGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] { i, j });
      int i1 = (int)(0.5D * paramRect.height()) + paramRect.top;
      localGradientDrawable.setBounds(paramRect.left, paramRect.top, paramRect.right, i1);
      localGradientDrawable.draw(localCanvas);
      Paint localPaint2 = new Paint();
      localPaint2.setColor(j);
      localCanvas.drawRect(new Rect(paramRect.left, i1, paramRect.right, paramRect.bottom), localPaint2);
      BitmapDrawable localBitmapDrawable = new BitmapDrawable(localBitmap);
      return localBitmapDrawable;
    }
    catch (Exception localException)
    {
      bk.a(localException);
    }
    return null;
  }
  
  private void m()
  {
    this.p = a(new Rect(0, 0, this.g, this.h), this.s, this.r, this.t);
    setBackgroundDrawable(this.p);
  }
  
  public void a(int paramInt)
  {
    if (this.s != paramInt) {}
    for (int i = 1;; i = 0)
    {
      this.s = Color.argb(this.t, Color.red(paramInt), Color.green(paramInt), Color.blue(paramInt));
      if (this.l != null) {
        this.l.setTextColor(this.s);
      }
      if (this.m != null) {
        this.m.setTextColor(this.s);
      }
      if (i != 0) {
        m();
      }
      return;
    }
  }
  
  public void a(Ad paramAd, t paramt, int paramInt, ag paramag)
  {
    bk.b("TextAdContainer", "setAd " + paramag);
    this.g = paramag.a;
    this.h = paramag.b;
    this.c = ((int)(0.10416666418314D * this.h));
    l();
    if ((paramAd == null) || (paramAd.c() == null)) {
      throw new IllegalArgumentException();
    }
    this.b = paramAd;
    this.d = false;
    if (paramAd.i() == 1)
    {
      a(paramAd.k());
      this.t = paramAd.l();
      this.r = paramAd.j();
    }
    this.l.a(paramAd.getTitle());
    this.l.a();
    this.m.a(paramAd.getDescription());
    this.m.a();
    RelativeLayout.LayoutParams localLayoutParams;
    if ("".equals(paramAd.getTitle()))
    {
      bk.b("empty title " + paramAd);
      this.l.setVisibility(8);
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -1);
      localLayoutParams2.setMargins(0, (int)((this.h - 3 * this.c - this.q) / 2.0F), 0, 0);
      this.m.setLayoutParams(localLayoutParams2);
      this.n.setImageBitmap(paramAd.d());
      this.o.setImageBitmap(paramAd.f());
      this.e.setImageBitmap(paramAd.e());
      this.f.setImageBitmap(paramAd.g());
      localLayoutParams = (RelativeLayout.LayoutParams)this.k.getLayoutParams();
      if (paramAd.n() != bj.d) {
        break label408;
      }
    }
    label408:
    for (int i = this.c;; i = this.h)
    {
      localLayoutParams.setMargins(i, this.c, this.h + this.u, this.c);
      this.k.setLayoutParams(localLayoutParams);
      super.a(paramAd, paramt, paramInt, paramag);
      return;
      this.l.setVisibility(0);
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-1, -1);
      localLayoutParams1.setMargins(0, 0, 0, 0);
      this.m.setLayoutParams(localLayoutParams1);
      break;
    }
  }
  
  public void b(int paramInt)
  {
    if (this.t != paramInt) {}
    for (int i = 1;; i = 0)
    {
      this.t = paramInt;
      this.n.setAlpha(this.t);
      this.o.setAlpha(this.t);
      this.e.setAlpha(this.t);
      this.f.setAlpha((int)(1.0D * this.t));
      a(this.s);
      if (i != 0) {
        m();
      }
      return;
    }
  }
  
  protected void l()
  {
    if (i()) {
      return;
    }
    j();
    int i = this.h - 2 * this.c;
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(i, i);
    localLayoutParams1.addRule(9);
    localLayoutParams1.setMargins(this.c, this.c, this.c, this.c);
    this.n.setLayoutParams(localLayoutParams1);
    addView(this.n);
    this.u = ((int)(2.0D * this.h / 48.0D));
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(this.h + this.u, this.h);
    localLayoutParams2.addRule(11);
    localLayoutParams2.addRule(10);
    this.o.setLayoutParams(localLayoutParams2);
    addView(this.o);
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(this.h, this.h);
    localLayoutParams3.addRule(10);
    localLayoutParams3.addRule(11);
    this.e.setLayoutParams(localLayoutParams3);
    addView(this.e);
    int j = (int)(0.4166666666666667D * i);
    RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(j, j);
    localLayoutParams4.addRule(11);
    localLayoutParams4.addRule(12);
    this.f.setLayoutParams(localLayoutParams4);
    addView(this.f);
    this.k = new LinearLayout(getContext());
    RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams5.setMargins(this.h, this.c, this.h + this.u, this.c);
    this.k.setLayoutParams(localLayoutParams5);
    this.k.setOrientation(1);
    addView(this.k);
    float f = 0.2708333F * this.h;
    this.l.setTextColor(-1);
    this.l.setTypeface(a);
    this.l.setTextSize(f);
    LinearLayout.LayoutParams localLayoutParams6 = new LinearLayout.LayoutParams(-1, -2);
    this.l.setLayoutParams(localLayoutParams6);
    this.k.addView(this.l);
    this.q = (0.3333333F * this.h);
    this.m.setTextColor(-1);
    this.m.setTypeface(a);
    this.m.setTextSize(this.q);
    LinearLayout.LayoutParams localLayoutParams7 = new LinearLayout.LayoutParams(-1, -2);
    this.m.setLayoutParams(localLayoutParams7);
    this.k.addView(this.m);
    m();
  }
  
  protected void onDraw(Canvas paramCanvas) {}
  
  public void setBackgroundColor(int paramInt)
  {
    if (this.r != paramInt) {}
    for (int i = 1;; i = 0)
    {
      this.r = (0xFF000000 | paramInt);
      if (i != 0) {
        m();
      }
      return;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.bn
 * JD-Core Version:    0.7.0.1
 */