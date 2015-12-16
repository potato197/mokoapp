package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

public final class AdView
  extends RelativeLayout
{
  private a a = new a();
  private fe b;
  private Activity c;
  private ca d;
  private int e = Color.rgb(64, 118, 170);
  private int f = 255;
  private int g = -1;
  private AdViewListener h;
  private cu i;
  private fa j;
  private aa k = new ce(this);
  private int l = 0;
  private int m = 0;
  private long n = 0L;
  
  public AdView(Activity paramActivity)
  {
    super(paramActivity);
    a(paramActivity);
  }
  
  public AdView(Activity paramActivity, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramActivity);
    a(paramActivity, paramInt1, paramInt2, paramInt3);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a((Activity)paramContext, paramAttributeSet);
  }
  
  public AdView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a((Activity)paramContext, paramAttributeSet, paramInt);
  }
  
  a a()
  {
    return this.a;
  }
  
  void a(Activity paramActivity)
  {
    int i1 = this.e;
    int i2 = this.f;
    a(paramActivity, null, 0, i1, this.g, i2);
  }
  
  void a(Activity paramActivity, int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramActivity, null, 0, paramInt1, paramInt2, paramInt3);
  }
  
  void a(Activity paramActivity, AttributeSet paramAttributeSet)
  {
    int i1 = this.e;
    int i2 = this.f;
    a(paramActivity, paramAttributeSet, 0, i1, this.g, i2);
  }
  
  void a(Activity paramActivity, AttributeSet paramAttributeSet, int paramInt)
  {
    int i1 = this.e;
    int i2 = this.f;
    a(paramActivity, paramAttributeSet, paramInt, i1, this.g, i2);
  }
  
  void a(Activity paramActivity, AttributeSet paramAttributeSet, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.c = paramActivity;
    try
    {
      this.d = ca.a(this.c);
      if (paramAttributeSet != null)
      {
        try
        {
          String str = "http://schemas.android.com/apk/res/" + paramActivity.getPackageName();
          paramInt3 = paramAttributeSet.getAttributeUnsignedIntValue(str, "textColor", paramInt3);
          paramInt2 = paramAttributeSet.getAttributeUnsignedIntValue(str, "backgroundColor", paramInt2);
          int i3 = paramAttributeSet.getAttributeUnsignedIntValue(str, "backgroundTransparent", paramInt4);
          paramInt4 = i3;
          i1 = paramInt2;
          i2 = paramInt3;
          if (paramInt4 > 255) {
            paramInt4 = 255;
          }
          if (paramInt4 < 0) {
            paramInt4 = 0;
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            i1 = paramInt2;
            i2 = paramInt3;
          }
        }
        this.g = i2;
        this.e = i1;
        this.f = paramInt4;
        return;
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        continue;
        int i1 = paramInt2;
        int i2 = paramInt3;
      }
    }
  }
  
  void a(cu paramcu)
  {
    if (paramcu == null) {}
    do
    {
      do
      {
        return;
      } while ((this.i != null) && (this.i.f().equals(paramcu.f())));
      this.i = paramcu;
      h();
    } while (this.b == null);
    this.b.b(paramcu);
  }
  
  public void addView(View paramView)
  {
    if (this.b == paramView) {
      super.addView(paramView);
    }
  }
  
  public void addView(View paramView, int paramInt)
  {
    if (this.b == paramView) {
      super.addView(paramView, paramInt);
    }
  }
  
  public void addView(View paramView, int paramInt1, int paramInt2)
  {
    if (paramView == this.b) {
      super.addView(paramView, paramInt1, paramInt2);
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramView == this.b) {
      super.addView(paramView, paramInt, paramLayoutParams);
    }
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramView == this.b) {
      super.addView(paramView, paramLayoutParams);
    }
  }
  
  protected boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramView == this.b) {
      return super.addViewInLayout(paramView, paramInt, paramLayoutParams);
    }
    return false;
  }
  
  protected boolean addViewInLayout(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (paramView == this.b) {
      return super.addViewInLayout(paramView, paramInt, paramLayoutParams, paramBoolean);
    }
    return false;
  }
  
  ca b()
  {
    return this.d;
  }
  
  cu c()
  {
    return this.i;
  }
  
  int d()
  {
    return this.e;
  }
  
  int e()
  {
    return this.g;
  }
  
  void f()
  {
    if ((getVisibility() == 0) && (this.a.a(this))) {}
    switch (cz.a(this.c))
    {
    default: 
      return;
    case 0: 
      try
      {
        ak.a(this.c, this);
        return;
      }
      catch (Exception localException)
      {
        f.a(localException);
        return;
      }
    case 1: 
      a(cz.b(this.c));
      return;
    case 3: 
      a(cz.e(this.c));
      return;
    case 2: 
      a(cz.c(this.c));
      return;
    case 4: 
      a(cz.f(this.c));
      return;
    case 5: 
      a(cz.g(this.c));
      return;
    }
    a(cz.d(this.c));
  }
  
  void g()
  {
    new Thread(new ck(this)).start();
  }
  
  public int getAdHeight()
  {
    return this.m;
  }
  
  public int getAdWidth()
  {
    return this.l;
  }
  
  void h()
  {
    try
    {
      getHandler().post(new ch(this));
      return;
    }
    catch (Exception localException) {}
  }
  
  void i()
  {
    try
    {
      getHandler().post(new cm(this));
      return;
    }
    catch (Exception localException) {}
  }
  
  protected void onAttachedToWindow()
  {
    if (this.b == null) {}
    try
    {
      this.m = this.d.a().a();
    }
    catch (Exception localException4)
    {
      try
      {
        localLayoutParams1 = getLayoutParams();
        if (localLayoutParams1 != null)
        {
          localLayoutParams1.height = -2;
          if (localLayoutParams1.width == -1) {
            this.l = this.d.d();
          }
        }
      }
      catch (Exception localException4)
      {
        try
        {
          this.b = new fe(this.c, this, this.d, this.e, this.g, this.f);
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(this.l, this.m);
          addView(this.b, localLayoutParams);
        }
        catch (Exception localException4)
        {
          try
          {
            for (;;)
            {
              ViewGroup.LayoutParams localLayoutParams1;
              this.j = new fa(this.k, -1);
              label134:
              super.onAttachedToWindow();
              return;
              localException2 = localException2;
              f.a(localException2);
              continue;
              if (localLayoutParams1.width == -2)
              {
                this.l = this.d.f();
                continue;
                localException3 = localException3;
                f.a(localException3);
              }
              else
              {
                localLayoutParams1.width = -2;
                this.l = this.d.f();
                continue;
                this.l = this.d.d();
                continue;
                localException4 = localException4;
                f.a(localException4);
              }
            }
          }
          catch (Exception localException1)
          {
            break label134;
          }
        }
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    try
    {
      this.j.c();
      super.onDetachedFromWindow();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        f.a(localException);
      }
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        a locala = this.a;
        if (!paramBoolean) {
          continue;
        }
        bool = false;
        locala.a = bool;
        if (!paramBoolean) {
          continue;
        }
        this.j.b();
        if (System.currentTimeMillis() - this.n >= eh.g()) {
          refreshAd();
        }
      }
      catch (Exception localException)
      {
        boolean bool;
        continue;
      }
      super.onWindowFocusChanged(paramBoolean);
      return;
      bool = true;
      continue;
      this.n = System.currentTimeMillis();
      this.j.a();
    }
  }
  
  public void refreshAd()
  {
    g();
  }
  
  public void setAdViewListener(AdViewListener paramAdViewListener)
  {
    this.h = paramAdViewListener;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.a.b = false;
      return;
    }
    this.a.b = true;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.AdView
 * JD-Core Version:    0.7.0.1
 */