package net.youmi.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class bx
  extends ImageView
{
  private cr a;
  private ek b;
  private Bitmap c;
  private boolean d = false;
  
  public bx(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramContext);
    setScaleType(ImageView.ScaleType.FIT_XY);
  }
  
  private void b()
  {
    try
    {
      if (this.b != null) {
        c();
      }
      if (this.a != null)
      {
        this.b = new ek(this);
        ek localek = this.b;
        cr[] arrayOfcr = new cr[1];
        arrayOfcr[0] = this.a;
        localek.execute(arrayOfcr);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void c()
  {
    try
    {
      if (this.b != null) {
        this.b.a();
      }
      this.b = null;
      return;
    }
    catch (Exception localException) {}
  }
  
  void a()
  {
    this.d = false;
    c();
  }
  
  void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null) {}
    try
    {
      if (!paramBitmap.isRecycled())
      {
        Bitmap localBitmap = this.c;
        this.c = paramBitmap;
        setImageBitmap(paramBitmap);
        if (localBitmap != this.c) {
          localBitmap.recycle();
        }
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  void a(cr paramcr)
  {
    if (paramcr == null) {}
    for (;;)
    {
      return;
      try
      {
        if (paramcr.c() > 0)
        {
          this.a = paramcr;
          this.d = true;
          b();
          return;
        }
      }
      catch (Exception localException) {}
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    try
    {
      c();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    if (paramBoolean) {}
    try
    {
      if (!this.d) {
        return;
      }
      b();
      return;
    }
    catch (Exception localException) {}
    c();
    return;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.bx
 * JD-Core Version:    0.7.0.1
 */