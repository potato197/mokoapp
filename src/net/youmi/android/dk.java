package net.youmi.android;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

class dk
  extends View
{
  RectF a = new RectF();
  int b;
  int c;
  RectF d = new RectF();
  Paint e = new Paint();
  float f = 3.0F;
  int g = 0;
  ca h;
  float i = 1.0F;
  
  dk(Context paramContext, ca paramca)
  {
    super(paramContext);
    this.h = paramca;
    this.f = this.h.a(this.f);
  }
  
  void a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= 100))
    {
      this.g = paramInt;
      postInvalidate();
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    try
    {
      int j = getLayoutParams().width;
      int k = this.h.a(10);
      getLayoutParams().height = k;
      if (j <= 0) {
        j = this.h.d();
      }
      if (j > this.h.d()) {
        j = this.h.d();
      }
      this.b = j;
      this.c = k;
      this.a.set(0.0F, 0.0F, j, k);
      this.i = (this.b / 100.0F);
      return;
    }
    catch (Exception localException) {}
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.e.reset();
    this.e.setARGB(100, 180, 180, 180);
    this.e.setStyle(Paint.Style.STROKE);
    this.e.setStrokeWidth(this.f);
    paramCanvas.drawRect(this.a, this.e);
    this.d.set(this.f, this.f, this.i * this.g - this.f, this.c - this.f);
    this.e.reset();
    this.e.setARGB(255, 65, 105, 225);
    paramCanvas.drawRect(this.d, this.e);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dk
 * JD-Core Version:    0.7.0.1
 */