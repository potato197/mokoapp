package cn.domob.android.ads.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Handler;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import cn.domob.android.ads.DomobAdView;
import cn.domob.android.ads.h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
  extends Animation
{
  private static int c;
  private static int d;
  private ImageView[][] a = (ImageView[][])Array.newInstance(ImageView.class, new int[] { 3, 16 });
  private Handler b = new Handler();
  private DomobAdView e;
  private h f;
  private h g;
  private ArrayList<Bitmap> h;
  private Bitmap i;
  
  private void a(TranslateAnimation paramTranslateAnimation, int paramInt1, int paramInt2)
  {
    paramTranslateAnimation.setDuration(2000L);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(2000L);
    AnimationSet localAnimationSet = new AnimationSet(false);
    localAnimationSet.addAnimation(paramTranslateAnimation);
    localAnimationSet.addAnimation(localAlphaAnimation);
    this.a[paramInt1][paramInt2].startAnimation(localAnimationSet);
  }
  
  public final void a(DomobAdView paramDomobAdView, h paramh1, h paramh2)
  {
    c = paramh2.getWidth();
    d = paramh2.getHeight();
    this.i = Bitmap.createBitmap(paramh2.getWidth(), paramh2.getHeight(), Bitmap.Config.RGB_565);
    paramDomobAdView.draw(new Canvas(this.i));
    this.e = paramDomobAdView;
    this.f = paramh1;
    this.g = paramh2;
    this.h = new ArrayList();
    int j = 0;
    while (j < d)
    {
      int i8 = 0;
      while (i8 < c)
      {
        this.h.add(Bitmap.createBitmap(this.i, i8, j, c / 16, d / 3));
        i8 += c / 16;
      }
      j += d / 3;
    }
    int k = 0;
    int m = 0;
    int n = 1010101010;
    while (m < 3)
    {
      int i3 = 0;
      int i4 = k;
      int i5 = n;
      if (i3 < 16)
      {
        this.a[m][i3] = new ImageView(this.e.getContext());
        this.a[m][i3].setImageBitmap((Bitmap)this.h.get(i4));
        ImageView localImageView = this.a[m][i3];
        int i6 = i5 + 1;
        localImageView.setId(i5);
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if ((m != 0) || (i3 != 0))
        {
          if (i3 != 0) {
            break label348;
          }
          localLayoutParams.addRule(3, this.a[(m - 1)][i3].getId());
        }
        for (;;)
        {
          this.e.addView(this.a[m][i3], localLayoutParams);
          int i7 = i4 + 1;
          i3++;
          i4 = i7;
          i5 = i6;
          break;
          label348:
          localLayoutParams.addRule(1, this.a[m][(i3 - 1)].getId());
          localLayoutParams.addRule(8, this.a[m][(i3 - 1)].getId());
        }
      }
      m++;
      n = i5;
      k = i4;
    }
    for (int i1 = 0; i1 < 3; i1++) {
      for (int i2 = 0; i2 < 16; i2++)
      {
        if ((i1 <= 0) && (i2 < 8)) {
          a(new TranslateAnimation(1, 0.0F, 1, -1.0F + (float)Math.random(), 1, 0.0F, 1, -1.0F + (float)Math.random()), i1, i2);
        }
        if ((i1 <= 0) && (i2 >= 8)) {
          a(new TranslateAnimation(1, 0.0F, 1, 1.0F - (float)Math.random(), 1, 0.0F, 1, -1.0F + (float)Math.random()), i1, i2);
        }
        if ((i1 > 0) && (i2 < 8)) {
          a(new TranslateAnimation(1, 0.0F, 1, -1.0F + (float)Math.random(), 1, 0.0F, 1, 1.0F - (float)Math.random()), i1, i2);
        }
        if ((i1 > 0) && (i2 >= 8)) {
          a(new TranslateAnimation(1, 0.0F, 1, 1.0F - (float)Math.random(), 1, 0.0F, 1, 1.0F - (float)Math.random()), i1, i2);
        }
      }
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.i("DomobSDK", "FragmentAnimation finish");
    }
    a locala = new a();
    this.b.postDelayed(locala, 2000L);
  }
  
  final class a
    implements Runnable
  {
    private a(byte paramByte) {}
    
    public final void run()
    {
      label270:
      for (int i = 0;; i++)
      {
        int j;
        if (i < 3) {
          j = 0;
        }
        for (;;)
        {
          if (j >= 16) {
            break label270;
          }
          try
          {
            a.a(a.this)[i][j].setImageBitmap(null);
            a.b(a.this).removeView(a.a(a.this)[i][j]);
            j++;
          }
          catch (Exception localException)
          {
            AlphaAnimation localAlphaAnimation;
            Iterator localIterator;
            Log.e("DomobSDK", "ReplaceBuilderThread error " + localException.getMessage());
            return;
          }
        }
        a.c(a.this).setVisibility(0);
        DomobAdView.setBuilder(a.b(a.this), a.c(a.this));
        localAlphaAnimation = new AlphaAnimation(0.3F, 1.0F);
        localAlphaAnimation.setDuration(1600L);
        a.c(a.this).startAnimation(localAlphaAnimation);
        a.b(a.this).removeView(a.d(a.this));
        a.d(a.this).j();
        if (!a.e(a.this).isRecycled()) {
          a.e(a.this).recycle();
        }
        localIterator = a.f(a.this).iterator();
        while (localIterator.hasNext())
        {
          Bitmap localBitmap = (Bitmap)localIterator.next();
          if (!localBitmap.isRecycled()) {
            localBitmap.recycle();
          }
        }
        while (!Log.isLoggable("DomobSDK", 3)) {}
        Log.i("DomobSDK", "recycle");
        return;
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.a.a
 * JD-Core Version:    0.7.0.1
 */