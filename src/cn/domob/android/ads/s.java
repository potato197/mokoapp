package cn.domob.android.ads;

import android.content.Context;
import android.graphics.Paint.FontMetrics;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

final class s
  extends TextView
{
  public float a = -1.0F;
  public boolean b = false;
  public float c;
  
  public s(Context paramContext, float paramFloat)
  {
    super(paramContext);
    this.c = paramFloat;
    setGravity(80);
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    Typeface localTypeface;
    float f1;
    CharSequence localCharSequence;
    TextPaint localTextPaint;
    if (this.b)
    {
      localTypeface = getTypeface();
      f1 = getTextSize();
      localCharSequence = getText();
      localTextPaint = new TextPaint(getPaint());
      if (localCharSequence == null) {}
    }
    for (float f2 = f1;; f2 -= 0.5F)
    {
      if (f2 < this.a) {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "font size is less than min size!");
        }
      }
      Paint.FontMetrics localFontMetrics;
      do
      {
        if (f1 != f2) {
          setTextSize(1, f2 / this.c);
        }
        return;
        localTextPaint.setTypeface(localTypeface);
        localTextPaint.setTextSize(f2);
        if (localTextPaint.measureText(localCharSequence, 0, localCharSequence.length()) > getMeasuredWidth()) {
          break;
        }
        localFontMetrics = localTextPaint.getFontMetrics();
      } while (Math.ceil(localFontMetrics.descent - localFontMetrics.ascent) <= getMeasuredHeight());
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.s
 * JD-Core Version:    0.7.0.1
 */