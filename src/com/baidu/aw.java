package com.baidu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.TextView;

class aw
  extends TextView
{
  private float a;
  private float b;
  private float c;
  private boolean d;
  private Paint e;
  private String f = "";
  private float g = 50.0F;
  private final float h = 1.0F;
  
  public aw(Context paramContext)
  {
    super(paramContext);
  }
  
  private void b()
  {
    this.b = this.g;
    this.d = true;
  }
  
  private void c()
  {
    this.b = 0.0F;
    this.d = false;
  }
  
  public void a()
  {
    this.a = getPaint().measureText(this.f);
    this.g = (getWidth() / 4);
    if (this.g == 0.0F) {
      this.g = 50.0F;
    }
    this.c = (getTextSize() + getPaddingTop());
    c();
    if ((getWidth() > 0) && (this.a > getWidth())) {
      b();
    }
  }
  
  public void a(String paramString)
  {
    this.f = paramString;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      paramCanvas.drawText(this.f, this.b, this.c, this.e);
      if (!this.d) {
        return;
      }
      this.b -= 1.0F;
      int i = (int)(this.a - 3 * getWidth() / 4);
      if (this.b < -i) {
        this.b = this.g;
      }
      postInvalidateDelayed(35L);
      return;
    }
    catch (Exception localException)
    {
      bk.a("AutoScrollTextView.onDraw", localException);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    a();
  }
  
  public void setTextColor(int paramInt)
  {
    super.setTextColor(paramInt);
    this.e = getPaint();
    this.e.setColor(paramInt);
  }
  
  public void setTextSize(float paramFloat)
  {
    super.setTextSize(paramFloat);
    this.e = getPaint();
    this.e.setTextSize(paramFloat);
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    super.setTypeface(paramTypeface);
    this.e = getPaint();
    this.e.setTypeface(paramTypeface);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.aw
 * JD-Core Version:    0.7.0.1
 */