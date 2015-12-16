package net.youmi.android;

import android.app.Activity;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

class ea
  extends FrameLayout
  implements bb
{
  ImageView a;
  ImageView b;
  ImageView c;
  Animation d;
  Animation e;
  
  public ea(cx paramcx, Activity paramActivity, ca paramca, boolean paramBoolean)
  {
    super(paramActivity);
    this.a = new ImageView(paramActivity);
    this.b = new ImageView(paramActivity);
    this.a.setScaleType(ImageView.ScaleType.FIT_XY);
    this.b.setScaleType(ImageView.ScaleType.FIT_XY);
    this.a.setVisibility(8);
    this.b.setVisibility(8);
    int i = cx.a(paramcx);
    int j = cx.b(paramcx);
    if (paramBoolean)
    {
      i = paramca.a().c().b();
      j = paramca.a().c().b();
    }
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(i, j);
    addView(this.a, localLayoutParams);
    addView(this.b, localLayoutParams);
    if (paramBoolean)
    {
      this.d = aj.c(paramca);
      this.e = aj.d(paramca);
      return;
    }
    this.d = aj.a(paramca);
    this.e = aj.b(paramca);
  }
  
  public void a()
  {
    setVisibility(8);
  }
  
  public void a(Animation paramAnimation)
  {
    try
    {
      startAnimation(paramAnimation);
      return;
    }
    catch (Exception localException) {}
  }
  
  /* Error */
  public boolean a(cu paramcu)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: iconst_0
    //   5: ireturn
    //   6: aload_1
    //   7: invokevirtual 103	net/youmi/android/cu:e	()Landroid/graphics/Bitmap;
    //   10: ifnull -6 -> 4
    //   13: aload_0
    //   14: invokevirtual 106	net/youmi/android/ea:e	()Landroid/widget/ImageView;
    //   17: astore_3
    //   18: aload_3
    //   19: ifnull -15 -> 4
    //   22: aload_3
    //   23: aload_1
    //   24: invokevirtual 103	net/youmi/android/cu:e	()Landroid/graphics/Bitmap;
    //   27: invokevirtual 110	android/widget/ImageView:setImageBitmap	(Landroid/graphics/Bitmap;)V
    //   30: iconst_1
    //   31: ireturn
    //   32: astore_2
    //   33: iconst_0
    //   34: ireturn
    //   35: astore 4
    //   37: goto -7 -> 30
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	this	ea
    //   0	40	1	paramcu	cu
    //   32	1	2	localException1	Exception
    //   17	6	3	localImageView	ImageView
    //   35	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   6	18	32	java/lang/Exception
    //   22	30	35	java/lang/Exception
  }
  
  public void b()
  {
    try
    {
      ImageView localImageView = e();
      if (localImageView == null) {
        return;
      }
      if (this.c != null) {
        this.c.setVisibility(8);
      }
      localImageView.setVisibility(0);
      this.c = localImageView;
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  public void c()
  {
    setVisibility(0);
  }
  
  public void d()
  {
    ImageView localImageView = e();
    if (localImageView == null) {
      return;
    }
    if (this.c != null)
    {
      this.c.startAnimation(this.e);
      this.c.setVisibility(8);
    }
    localImageView.setVisibility(0);
    localImageView.startAnimation(this.d);
    this.c = localImageView;
  }
  
  ImageView e()
  {
    if (this.a == this.c) {
      return this.b;
    }
    return this.a;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ea
 * JD-Core Version:    0.7.0.1
 */