package com.baidu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.view.View;

class GifAnimView
  extends View
  implements az
{
  private ba a = null;
  private Bitmap b = null;
  private boolean c = true;
  private boolean d = false;
  private int e = -1;
  private int f = -1;
  private Rect g = null;
  private be h = null;
  private GifAnimView.GifImageType i = GifAnimView.GifImageType.SYNC_DECODER;
  private bf j;
  private int k = 255;
  private Handler l = new bc(this);
  
  public GifAnimView(Context paramContext, bf parambf)
  {
    super(paramContext);
    this.j = parambf;
  }
  
  private void b(byte[] paramArrayOfByte)
  {
    if (this.a != null)
    {
      this.a.a();
      this.a = null;
    }
    this.a = new ba(paramArrayOfByte, this);
    this.a.start();
  }
  
  private void c()
  {
    if (this.l != null)
    {
      Message localMessage = this.l.obtainMessage();
      this.l.sendMessage(localMessage);
    }
  }
  
  public void a()
  {
    this.d = true;
  }
  
  public void a(int paramInt)
  {
    this.k = paramInt;
    invalidate();
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      this.e = paramInt1;
      this.f = paramInt2;
      bk.a(this.f + "");
      this.g = new Rect();
      this.g.left = 0;
      this.g.top = 0;
      this.g.right = paramInt1;
      this.g.bottom = paramInt2;
    }
  }
  
  public void a(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean)
    {
      if (this.a == null) {
        break label212;
      }
      switch (bd.a[this.i.ordinal()])
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
            new be(this, null).start();
            return;
          }
          c();
          return;
          if (paramInt == 1)
          {
            this.b = this.a.c();
            c();
            return;
          }
        } while (paramInt != -1);
        if (this.a.b() <= 1) {
          break;
        }
      } while (this.h != null);
      this.h = new be(this, null);
      this.h.start();
      return;
      c();
      return;
      if (paramInt == 1)
      {
        this.b = this.a.c();
        c();
        return;
      }
      if (paramInt == -1)
      {
        c();
        return;
      }
    } while (this.h != null);
    this.h = new be(this, null);
    this.h.start();
    return;
    label212:
    bk.b("gif", "parse error");
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    b(paramArrayOfByte);
  }
  
  public void b()
  {
    this.d = false;
  }
  
  protected void onDraw(Canvas paramCanvas)
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
    int m = paramCanvas.getSaveCount();
    paramCanvas.save();
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    Paint localPaint = new Paint();
    localPaint.setAlpha(this.k);
    if (this.e == -1) {
      paramCanvas.drawBitmap(this.b, 0.0F, 0.0F, localPaint);
    }
    for (;;)
    {
      paramCanvas.restoreToCount(m);
      return;
      paramCanvas.drawBitmap(this.b, null, this.g, localPaint);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = 1;
    int n = getPaddingLeft();
    int i1 = getPaddingRight();
    int i2 = getPaddingTop();
    int i3 = getPaddingBottom();
    int i4;
    if (this.a == null) {
      i4 = m;
    }
    for (;;)
    {
      int i5 = i4 + (n + i1);
      int i6 = m + (i2 + i3);
      int i7 = Math.max(i5, getSuggestedMinimumWidth());
      int i8 = Math.max(i6, getSuggestedMinimumHeight());
      setMeasuredDimension(resolveSize(i7, paramInt1), resolveSize(i8, paramInt2));
      return;
      i4 = this.a.a;
      m = this.a.b;
    }
  }
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    bk.b("GifAnimView.onWindowVisibilityChanged", "visibility: " + paramInt);
    if (paramInt != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      return;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.GifAnimView
 * JD-Core Version:    0.7.0.1
 */