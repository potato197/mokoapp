package net.youmi.android;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;

final class en
  extends Drawable
{
  private int A;
  private int B = Color.argb(80, 0, 0, 0);
  private float C = 3.0F;
  private float D = 1.0F;
  private Path E = new Path();
  private Path F = new Path();
  private Path G = new Path();
  private Path H = new Path();
  private Paint I = new Paint();
  private Shader J;
  private Shader K;
  private int L = 0;
  private int M = 2;
  private ca N;
  int a;
  int b;
  float c = 3.0F;
  float d = 1.2F;
  float e = 4.0F;
  private String f = "有米";
  private float g = 9.0F;
  private float h = 0.8F;
  private float i = 0.0F;
  private float j = 0.0F;
  private float k = 0.0F;
  private float l = 0.0F;
  private float m = 0.0F;
  private float n = 0.0F;
  private Rect o = new Rect();
  private float p = 5.0F;
  private float q = 5.0F;
  private RectF r = new RectF(0.0F, 0.0F, 320.0F, 50.0F);
  private RectF s = new RectF(this.r);
  private RectF t = new RectF(this.r);
  private int u = Color.argb(230, 250, 250, 250);
  private int v = Color.argb(230, 234, 234, 234);
  private int w = Color.rgb(217, 217, 217);
  private int x = Color.rgb(115, 115, 115);
  private int y = 255;
  private int z;
  
  en(int paramInt1, int paramInt2, ca paramca)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.N = paramca;
    b();
    this.r.set(0.0F, 0.0F, this.a, this.b);
    this.s.set(0.0F, 0.0F, this.a, this.b);
    this.t.set(0.0F, 0.0F, this.a, this.b);
    this.t.inset(this.d, this.d);
    this.J = new LinearGradient(0.0F, 0.0F, 1.0F, 1.0F, this.u, this.v, Shader.TileMode.CLAMP);
    this.K = new LinearGradient(0.0F, 0.0F, 0 + this.N.a(5), this.b, Color.argb(8, 255, 255, 255), Color.argb(50, 255, 255, 255), Shader.TileMode.CLAMP);
    this.E.addRect(this.s, Path.Direction.CW);
    this.E.close();
    this.I.reset();
    this.I.setTextSize(this.g);
    this.o.set(0, 0, this.a, this.b);
    this.I.getTextBounds(this.f, 0, this.f.length(), this.o);
    this.i = (1.5F * this.o.width() + 2.0F * this.p + 2.0F * this.q);
    this.j = (this.o.height() + 2.0F * this.h - this.d);
    float f1 = this.t.left;
    float f2 = this.t.right;
    float f3 = this.t.top;
    float f4 = this.t.bottom;
    RectF localRectF1 = new RectF();
    if (this.L == 0) {
      if (this.M == 2)
      {
        this.i = (1.1F * this.o.width());
        this.j = (this.o.height() + 2.0F * this.h);
        this.z = Math.round(this.a - this.i - this.d);
        this.A = Math.round(f3 + this.j);
        float f5 = 0.5F * this.j;
        this.k = (f2 - 0.5F * (this.i + this.d));
        this.l = (0.5F * f3 + this.j - this.h);
        this.m = this.k;
        this.n = this.l;
        this.n -= this.N.a(1.0F);
        this.F.moveTo(f2 - this.e, f4);
        RectF localRectF3 = new RectF();
        localRectF3.set(f2 - 2.0F * this.e, f4 - 2.0F * this.e, f2, f4);
        this.F.arcTo(localRectF3, 90.0F, -90.0F);
        float f6 = f5 + (f3 + this.j);
        this.F.lineTo(f2, f6);
        localRectF1.set(f2 - this.o.width() - 0.4F * (this.i - this.o.width()), f3 - this.d + this.h, 2.0F + this.o.width(), this.o.height());
        (f2 - 0.5F * this.i);
        (f3 + this.j);
        localRectF3.set(f2 - this.j, f3 + this.j, f2, f3 + 2.0F * this.j);
        this.F.arcTo(localRectF3, 360.0F, -90.0F);
        this.F.lineTo(f2 - this.i, f3 + this.j);
        (f3 + 0.5F * this.j);
        (f2 - this.i);
        localRectF3.set(f2 - this.i - f5, f3, f5 + (f2 - this.i), f3 + this.j);
        this.F.arcTo(localRectF3, 90.0F, 90.0F);
        (f2 - this.i - this.p);
        localRectF3.set(f2 - this.i - 1.5F * this.j, f3, f2 - this.i - f5, f3 + this.j);
        this.F.arcTo(localRectF3, 360.0F, -90.0F);
        this.F.lineTo(f1 + this.e, f3);
        localRectF3.set(f1, f3, f1 + 2.0F * this.e, f3 + 2.0F * this.e);
        this.F.arcTo(localRectF3, 270.0F, -90.0F);
        this.F.lineTo(f1, f4 - this.e);
        localRectF3.set(f1, f4 - 2.0F * this.e, f1 + 2.0F * this.e, f4);
        this.F.arcTo(localRectF3, 180.0F, -90.0F);
        float f7 = f2 - this.e;
        this.F.lineTo(f7, f4);
      }
    }
    for (;;)
    {
      this.F.close();
      this.F.setFillType(Path.FillType.INVERSE_EVEN_ODD);
      RectF localRectF2 = new RectF(this.t);
      localRectF2.inset(-10.0F, -10.0F);
      this.G.addRect(localRectF2, Path.Direction.CW);
      this.G.addPath(this.F);
      this.G.close();
      this.H.moveTo(0.0F, 0.0F);
      this.H.lineTo(this.a, 0.0F);
      this.H.cubicTo(0.5F * this.a, 0.25F * this.b, 0.25F * this.a, 0.5F * this.b, 0.0F, this.b);
      this.H.lineTo(0.0F, 0.0F);
      this.H.close();
      return;
      if (this.L != 1) {}
    }
  }
  
  int a()
  {
    return this.z;
  }
  
  protected void b()
  {
    this.g = this.N.i().a();
    this.c = this.N.a(this.c);
    this.d = this.N.a(this.d);
    this.e = this.N.a(this.e);
    this.h = this.N.a(this.h);
    this.p = this.N.a(this.p);
    this.q = this.N.a(this.q);
    this.C = this.N.a(this.C);
    this.D = this.N.a(this.D);
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.I.reset();
    this.I.setShadowLayer(this.C, this.D, this.D, this.B);
    this.G.setFillType(Path.FillType.WINDING);
    paramCanvas.drawPath(this.G, this.I);
    this.I.reset();
    this.I.setShader(this.J);
    this.I.setAntiAlias(true);
    paramCanvas.drawPath(this.F, this.I);
    this.I.reset();
    this.I.setStrokeWidth(1.0F);
    this.I.setStyle(Paint.Style.STROKE);
    this.I.setColor(-1);
    this.I.setAntiAlias(true);
    paramCanvas.drawPath(this.F, this.I);
    this.I.setStrokeWidth(0.5F);
    this.I.setColor(-7829368);
    paramCanvas.drawRect(this.s, this.I);
    this.I.reset();
    this.I.setTextAlign(Paint.Align.CENTER);
    this.I.setTextSize(this.g);
    this.I.setColor(-1);
    this.I.setAntiAlias(true);
    paramCanvas.drawText(this.f, this.k, this.l, this.I);
    this.I.setColor(this.x);
    paramCanvas.drawText(this.f, this.m, this.n, this.I);
    this.I.reset();
    this.I.setShader(this.K);
    this.I.setAntiAlias(true);
    paramCanvas.drawPath(this.H, this.I);
  }
  
  public int getOpacity()
  {
    return 255 - this.y;
  }
  
  public void setAlpha(int paramInt)
  {
    this.y = paramInt;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.en
 * JD-Core Version:    0.7.0.1
 */