package net.youmi.android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.view.View;

class df
  extends View
{
  float A = 1.0F;
  float B = 0.0F;
  int C = 0;
  Paint D = new Paint();
  Path E;
  private int F = 0;
  float a;
  int b;
  float c = 7.0F;
  int d = 0;
  int e = 0;
  int f;
  int g;
  float h = 1.0F;
  float i = 12.0F;
  int j = Color.rgb(135, 206, 235);
  int k = Color.rgb(240, 248, 255);
  int l = Color.rgb(65, 105, 225);
  int m = Color.argb(200, 0, 0, 0);
  LinearGradient n;
  LinearGradient o;
  float p = 3.5F;
  float q = 3.5F;
  float r = 1.5F;
  float s = 1.0F;
  ShapeDrawable t;
  Rect u = new Rect();
  RectF v = new RectF();
  RectF w = new RectF();
  int x = 0;
  int y = 0;
  float z = 1.0F;
  
  public df(Context paramContext, int paramInt1, int paramInt2, ca paramca)
  {
    super(paramContext);
    this.a = paramInt1;
    this.b = paramInt2;
    if (paramca.c()) {
      this.i = 12.0F;
    }
    for (;;)
    {
      this.D.setTextSize(this.i);
      this.D.setTextAlign(Paint.Align.CENTER);
      Rect localRect = new Rect();
      this.D.getTextBounds("179%", 0, 3, localRect);
      this.D.setColor(-1);
      this.D.setAntiAlias(true);
      this.h = paramca.a(this.h);
      this.f = localRect.width();
      this.g = localRect.height();
      float f1 = 1.6F * localRect.width();
      float f2 = 2.2F * localRect.height();
      float f3 = 1.5F * f2;
      this.x = Math.round(f1);
      this.y = Math.round(f3);
      this.c = paramca.a(this.c);
      this.s = (this.a / 100.0F);
      this.d = ((int)(this.b - this.c - this.y));
      this.E = new Path();
      RectF localRectF = new RectF(0.0F, 0.0F, f1, f2);
      this.E.addRoundRect(localRectF, this.p, this.p, Path.Direction.CCW);
      this.E.moveTo(0.25F * f1, f2);
      float f4 = 0.28F * f1;
      this.C = Math.round(f4);
      this.E.lineTo(f4, f3);
      this.E.lineTo(f1 * 0.55F, f2);
      this.E.close();
      this.t = new ShapeDrawable(new PathShape(this.E, this.x, this.y));
      this.v.set(0.0F, paramInt2 - this.c, paramInt1, paramInt2);
      this.z = paramca.a(this.z);
      this.A = paramca.a(this.A);
      this.q = paramca.a(this.q);
      this.r = paramca.a(this.r);
      Paint localPaint = this.t.getPaint();
      localPaint.reset();
      localPaint.setColor(this.m);
      localPaint.setShadowLayer(paramca.a(2.0F), 0.0F, 0.0F, Color.rgb(245, 245, 245));
      localPaint.setAntiAlias(true);
      return;
      switch (paramca.e())
      {
      default: 
        this.i = 12.0F;
        break;
      case 120: 
        this.i = 10.0F;
        break;
      case 160: 
        this.i = 12.0F;
        break;
      case 240: 
        this.i = 17.0F;
        break;
      case 320: 
        this.i = 19.0F;
      }
    }
  }
  
  private void a(Canvas paramCanvas)
  {
    this.t.draw(paramCanvas);
  }
  
  private void b(Canvas paramCanvas)
  {
    this.D.reset();
    this.D.setStrokeWidth(this.z);
    if (this.n == null) {
      this.n = new LinearGradient(0.0F, this.v.top, 0.0F, this.v.bottom, new int[] { -16777216, -7829368, -12303292, -16777216 }, null, Shader.TileMode.CLAMP);
    }
    this.D.setShader(this.n);
    paramCanvas.drawRoundRect(this.v, this.q, this.q, this.D);
  }
  
  private void c(Canvas paramCanvas)
  {
    this.D.reset();
    this.w.set(this.z, this.b - this.c + this.z, this.B - this.z, this.b - this.z);
    if (this.o == null) {
      this.o = new LinearGradient(0.0F, this.w.top, 0.0F, this.w.bottom, this.k, this.l, Shader.TileMode.CLAMP);
    }
    this.D.setShader(this.o);
    this.D.setAntiAlias(true);
    paramCanvas.drawRoundRect(this.w, this.r, this.r, this.D);
  }
  
  void a()
  {
    this.F = 0;
  }
  
  void a(int paramInt)
  {
    if (paramInt == this.F) {}
    while ((paramInt < 0) || (paramInt > 100)) {
      return;
    }
    this.F = paramInt;
    if (this.F == 100)
    {
      setVisibility(4);
      return;
    }
    if (getVisibility() != 0)
    {
      setVisibility(0);
      return;
    }
    invalidate();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    try
    {
      this.B = (this.s * this.F);
      this.e = Math.round(this.B - this.C);
      this.u.set(this.e, this.d, this.x + this.e, this.y + this.d);
      this.t.setBounds(this.u);
      a(paramCanvas);
      this.D.reset();
      this.D.setTextAlign(Paint.Align.CENTER);
      this.D.setAntiAlias(true);
      this.D.setColor(this.j);
      this.D.setTextSize(this.i);
      paramCanvas.drawText(this.F, this.u.centerX(), this.u.centerY(), this.D);
      b(paramCanvas);
      c(paramCanvas);
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.df
 * JD-Core Version:    0.7.0.1
 */