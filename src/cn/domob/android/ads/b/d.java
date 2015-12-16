package cn.domob.android.ads.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;

public final class d
  extends View
  implements a
{
  private b a = null;
  private Bitmap b = null;
  private boolean c = true;
  private boolean d = false;
  private int e = -1;
  private Rect f = null;
  private View g = this;
  private a h = null;
  private b i = b.b;
  private a j = null;
  
  public d(Context paramContext)
  {
    super(paramContext);
  }
  
  public final void a()
  {
    if (this.a != null)
    {
      this.a.a();
      this.c = false;
      this.a = null;
    }
  }
  
  public final void a(b paramb)
  {
    if (this.a == null) {
      this.i = paramb;
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt)
  {
    if ((paramBoolean) && (this.a != null)) {
      switch (1.a[this.i.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
          } while (paramInt != -1);
          if (this.a.b() > 1)
          {
            this.j = new a();
            this.j.start();
            return;
          }
          this.g.postInvalidate();
          return;
          if (paramInt == 1)
          {
            this.b = this.a.c();
            this.g.postInvalidate();
            return;
          }
        } while (paramInt != -1);
        if (this.a.b() <= 1) {
          break;
        }
      } while (this.h != null);
      this.h = new a();
      this.h.start();
      return;
      this.g.postInvalidate();
      return;
      if (paramInt == 1)
      {
        this.b = this.a.c();
        this.g.postInvalidate();
        return;
      }
      if (paramInt == -1)
      {
        this.g.postInvalidate();
        return;
      }
    } while (this.h != null);
    this.h = new a();
    this.h.start();
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    if (this.a != null)
    {
      this.a.a();
      this.a = null;
    }
    this.a = new b(paramArrayOfByte, this);
    this.a.start();
  }
  
  protected final void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.a == null) {}
    do
    {
      return;
      if (this.b == null) {
        this.b = this.a.c();
      }
    } while (this.b == null);
    int k = paramCanvas.getSaveCount();
    paramCanvas.save();
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    if (this.e == -1) {
      paramCanvas.drawBitmap(this.b, 0.0F, 0.0F, null);
    }
    for (;;)
    {
      paramCanvas.restoreToCount(k);
      return;
      paramCanvas.drawBitmap(this.b, null, null, null);
    }
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    int k = 1;
    int m = getPaddingLeft();
    int n = getPaddingRight();
    int i1 = getPaddingTop();
    int i2 = getPaddingBottom();
    int i3;
    if (this.a == null) {
      i3 = k;
    }
    for (;;)
    {
      int i4 = i3 + (m + n);
      int i5 = k + (i1 + i2);
      int i6 = Math.max(i4, getSuggestedMinimumWidth());
      int i7 = Math.max(i5, getSuggestedMinimumHeight());
      setMeasuredDimension(resolveSize(i6, paramInt1), resolveSize(i7, paramInt2));
      return;
      i3 = this.a.a;
      k = this.a.b;
    }
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.d = true;
      return;
    }
    this.d = false;
  }
  
  final class a
    extends Thread
  {
    private a(byte paramByte) {}
    
    public final void run()
    {
      if (d.a(d.this) == null) {}
      label98:
      for (;;)
      {
        return;
        for (;;)
        {
          if (!d.b(d.this)) {
            break label98;
          }
          if (!d.c(d.this))
          {
            c localc = d.a(d.this).d();
            if (localc == null) {
              break;
            }
            d.a(d.this, localc.a);
            long l = localc.b;
            if (d.d(d.this) == null) {
              break;
            }
            d.d(d.this).postInvalidate();
            SystemClock.sleep(l);
            continue;
          }
          SystemClock.sleep(50L);
        }
      }
    }
  }
  
  public static enum b
  {
    static
    {
      b[] arrayOfb = new b[3];
      arrayOfb[0] = a;
      arrayOfb[1] = b;
      arrayOfb[2] = c;
      d = arrayOfb;
    }
    
    private b(int paramInt) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.b.d
 * JD-Core Version:    0.7.0.1
 */