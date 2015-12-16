package net.youmi.android;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

class ca
{
  private boolean a = true;
  private y b;
  private bo c;
  private int d;
  private int e;
  private float f = 1.0F;
  private int g = 160;
  private int h;
  private int i;
  private dj j;
  
  protected ca(DisplayMetrics paramDisplayMetrics1, DisplayMetrics paramDisplayMetrics2)
  {
    this.h = paramDisplayMetrics1.widthPixels;
    this.i = paramDisplayMetrics1.heightPixels;
    this.f = paramDisplayMetrics1.density;
    this.g = paramDisplayMetrics1.densityDpi;
    if (this.g == 160)
    {
      this.d = Math.round(paramDisplayMetrics2.widthPixels * paramDisplayMetrics2.density);
      this.e = Math.round(paramDisplayMetrics2.heightPixels * paramDisplayMetrics2.density);
    }
    for (this.a = true;; this.a = false)
    {
      if (this.d > this.e)
      {
        int k = this.d;
        this.d = this.e;
        this.e = k;
      }
      return;
      this.d = this.h;
      this.e = this.i;
    }
  }
  
  public static ca a(Activity paramActivity)
  {
    try
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      paramActivity.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
      ca localca = new ca(paramActivity.getResources().getDisplayMetrics(), localDisplayMetrics);
      return localca;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public float a(float paramFloat)
  {
    float f1 = 1.0F;
    if (paramFloat <= 0.0F) {
      paramFloat = f1;
    }
    if (c()) {
      return paramFloat;
    }
    float f2 = paramFloat * this.f;
    if (f2 <= 0.0F) {}
    for (;;)
    {
      return f1;
      f1 = f2;
    }
  }
  
  public int a(int paramInt)
  {
    int k = 1;
    if (paramInt <= 0) {
      paramInt = k;
    }
    if (c()) {
      return paramInt;
    }
    int m = Math.round(paramInt * this.f);
    if (m <= 0) {}
    for (;;)
    {
      return k;
      k = m;
    }
  }
  
  public y a()
  {
    if (this.b == null) {
      this.b = new y(this, this);
    }
    return this.b;
  }
  
  bo b()
  {
    if (this.c == null) {
      this.c = new bo(this, this);
    }
    return this.c;
  }
  
  boolean c()
  {
    return this.a;
  }
  
  public int d()
  {
    return this.h;
  }
  
  public int e()
  {
    return this.g;
  }
  
  int f()
  {
    if (this.h > this.i) {
      return this.i;
    }
    return this.h;
  }
  
  int g()
  {
    return this.d;
  }
  
  int h()
  {
    return this.e;
  }
  
  dj i()
  {
    if (this.j == null) {
      this.j = new dj(this, this);
    }
    return this.j;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ca
 * JD-Core Version:    0.7.0.1
 */