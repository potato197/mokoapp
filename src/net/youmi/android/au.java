package net.youmi.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

class au
  extends View
{
  Shader a;
  int b;
  int c;
  ca d;
  fe e;
  Drawable f;
  AdView g;
  Paint h = new Paint();
  Rect i = new Rect();
  RectF j = new RectF();
  RectF k = new RectF();
  RectF l = new RectF();
  Rect m = new Rect();
  float n = 0.0F;
  float o = 0.0F;
  float p = 5.0F;
  float q = 5.0F;
  int r = Color.argb(185, 0, 0, 0);
  int s = Color.argb(255, 10, 10, 10);
  boolean t = false;
  String u = "点击查看详情";
  Runnable v = new et(this);
  private cu w;
  
  public au(Context paramContext, AdView paramAdView, fe paramfe, int paramInt1, int paramInt2, ca paramca, Drawable paramDrawable)
  {
    super(paramContext);
    this.d = paramca;
    this.b = paramInt1;
    this.g = paramAdView;
    this.c = paramInt2;
    this.e = paramfe;
    this.f = paramDrawable;
    int i1 = paramca.a().d().a();
    int i2 = paramca.a().d().b();
    int i3 = paramca.a().d().c();
    int i4 = paramca.a().d().e();
    int i5 = paramca.a().d().d();
    int i6 = (paramInt2 - i4) / 2;
    this.j.set(paramInt1 - i2 - i1, paramInt2 - i2 - i1, paramInt1 - i1, paramInt2 - i1);
    this.h.setTextSize(paramca.a().d().f());
    this.h.getTextBounds("点击查看详情", 0, "点击查看详情".length(), this.m);
    this.k.set(paramInt1 - this.m.width() - i3 - i5 * 4 - i6, i6, paramInt1 - i6, i4 + i6);
    this.l.set(this.k.left + i5, this.k.top + i5, this.k.left + i3 + i5, this.k.top + i5 + i3);
    this.n = (this.l.right + i5);
    this.o = (paramInt2 / 2 + paramca.a(5));
    this.a = new LinearGradient(0.0F, 0.0F, 0.0F, paramInt2, Color.argb(255, 255, 255, 255), Color.argb(255, 80, 80, 80), Shader.TileMode.CLAMP);
    this.p = paramca.a(this.p);
    this.q = paramca.a(this.q);
    setClickable(true);
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    try
    {
      if (this.g.a().c)
      {
        this.g.a().c();
        return;
      }
      if (this.w.y())
      {
        if (this.g.a().a())
        {
          float f1 = paramMotionEvent.getX();
          float f2 = paramMotionEvent.getY();
          if (this.k.contains(f1, f2))
          {
            this.g.a().c();
            this.e.c();
            return;
          }
          this.g.a().c();
          return;
        }
        this.g.a().b();
        return;
      }
      this.g.a().c();
      this.e.c();
      return;
    }
    catch (Exception localException) {}
  }
  
  void a(cu paramcu)
  {
    if (paramcu == null) {}
    while ((this.w != null) && (this.w.f().equals(paramcu.f()))) {
      return;
    }
    this.w = paramcu;
    switch (this.w.a())
    {
    default: 
      this.u = "点击查看详情";
    }
    for (;;)
    {
      this.g.a().c();
      try
      {
        getHandler().post(this.v);
        label152:
        postInvalidate();
        return;
        this.u = "点击浏览网页";
        continue;
        this.u = "点击查看详情";
        continue;
        this.u = "点击直接下载";
        continue;
        this.u = "点击拨打电话";
        continue;
        this.u = "点击发送邮件";
        continue;
        this.u = "点击查看地图";
        continue;
        this.u = "点击查看详情";
        continue;
        this.u = "点击发送短信";
        continue;
        this.u = "点击播放视频";
      }
      catch (Exception localException)
      {
        break label152;
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    for (;;)
    {
      Bitmap localBitmap;
      try
      {
        if (this.w == null) {
          return;
        }
        localBitmap = this.w.n();
        if (localBitmap != null)
        {
          if (localBitmap.isRecycled()) {
            localBitmap = null;
          }
        }
        else
        {
          int i1 = this.w.b();
          if (i1 == 1) {
            break label364;
          }
          i2 = 0;
          if (i1 == 0) {
            break label364;
          }
          this.h.reset();
          if (!this.g.a().c) {
            break label133;
          }
          if ((i2 == 0) || (localBitmap == null)) {
            break label363;
          }
          paramCanvas.drawBitmap(localBitmap, this.i, this.j, this.h);
          return;
        }
      }
      catch (Exception localException)
      {
        f.a(localException);
        return;
      }
      this.i.set(0, 0, localBitmap.getWidth(), localBitmap.getHeight());
      continue;
      label133:
      if (this.g.a().a())
      {
        paramCanvas.drawColor(this.r);
        this.h.reset();
        this.h.setAntiAlias(true);
        this.h.setShader(this.a);
        this.h.setShadowLayer(this.q, 0.0F, 0.0F, -12303292);
        paramCanvas.drawRoundRect(this.k, this.p, this.p, this.h);
        this.h.reset();
        if (localBitmap != null) {
          paramCanvas.drawBitmap(localBitmap, this.i, this.l, this.h);
        }
        this.h.reset();
        this.h.setTextSize(this.d.a().d().f());
        this.h.setTextAlign(Paint.Align.LEFT);
        this.h.setColor(this.s);
        this.h.setAntiAlias(true);
        paramCanvas.drawText(this.u, this.n, this.o, this.h);
        return;
      }
      if ((i2 != 0) && (localBitmap != null)) {
        paramCanvas.drawBitmap(localBitmap, this.i, this.j, this.h);
      }
      if (this.t) {
        paramCanvas.drawColor(this.r);
      }
      label363:
      return;
      label364:
      int i2 = 0;
      if (localBitmap != null) {
        i2 = 1;
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default: 
      this.t = false;
    }
    for (;;)
    {
      postInvalidate();
      return super.onTouchEvent(paramMotionEvent);
      this.t = true;
      continue;
      this.t = false;
      a(paramMotionEvent);
      continue;
      this.t = true;
      continue;
      this.t = false;
      continue;
      this.t = false;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.au
 * JD-Core Version:    0.7.0.1
 */