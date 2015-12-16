package com.baidu;

import android.content.Context;
import android.graphics.Typeface;
import android.telephony.TelephonyManager;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

abstract class l
  extends RelativeLayout
{
  protected static final Typeface a = Typeface.create(Typeface.SANS_SERIF, 1);
  public static List<AnimationSet> i = new ArrayList();
  private static bm l;
  protected Ad b;
  protected int c = 5;
  protected boolean d;
  protected ImageView e;
  protected ImageView f;
  protected int g = 320;
  protected int h = 48;
  Map<ay, Integer> j;
  private boolean k;
  private long m;
  private AdView n;
  private int o = 0;
  private int p = 1;
  
  public l(AdView paramAdView)
  {
    super(paramAdView.getContext());
    Context localContext = paramAdView.getContext();
    a(paramAdView);
    if (l == null)
    {
      l = new bm();
      ((TelephonyManager)localContext.getSystemService("phone")).listen(l, 32);
    }
    this.e = new ImageView(localContext);
    this.f = new ImageView(localContext);
    this.e.setScaleType(ImageView.ScaleType.FIT_XY);
    this.f.setScaleType(ImageView.ScaleType.FIT_XY);
    c(localContext);
    b();
  }
  
  private void a(AdView paramAdView)
  {
    this.n = paramAdView;
  }
  
  private void c(Context paramContext)
  {
    if (i.size() > 0) {
      return;
    }
    AnimationSet localAnimationSet1 = new AnimationSet(true);
    ScaleAnimation localScaleAnimation1 = new ScaleAnimation(1.0F, 1.2F, 1.0F, 1.2F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation1.setDuration('È');
    localAnimationSet1.addAnimation(localScaleAnimation1);
    ScaleAnimation localScaleAnimation2 = new ScaleAnimation(1.2F, 0.001F, 1.2F, 0.001F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation2.setDuration(250L);
    localScaleAnimation2.setStartOffset('È');
    localAnimationSet1.addAnimation(localScaleAnimation2);
    i.add(localAnimationSet1);
    AnimationSet localAnimationSet2 = new AnimationSet(true);
    RotateAnimation localRotateAnimation1 = new RotateAnimation(0.0F, 10, 1, 0.5F, 1, 0.5F);
    localRotateAnimation1.setStartOffset(0);
    localRotateAnimation1.setDuration(80);
    localAnimationSet2.addAnimation(localRotateAnimation1);
    RotateAnimation localRotateAnimation2 = new RotateAnimation(10, 0.0F, 1, 0.5F, 1, 0.5F);
    localRotateAnimation2.setStartOffset(80);
    localRotateAnimation2.setDuration(80);
    localAnimationSet2.addAnimation(localRotateAnimation2);
    RotateAnimation localRotateAnimation3 = new RotateAnimation(0.0F, -10, 1, 0.5F, 1, 0.5F);
    localRotateAnimation3.setStartOffset(' ');
    localRotateAnimation3.setDuration(80);
    localAnimationSet2.addAnimation(localRotateAnimation3);
    RotateAnimation localRotateAnimation4 = new RotateAnimation(-10, 0.0F, 1, 0.5F, 1, 0.5F);
    localRotateAnimation4.setStartOffset('ð');
    localRotateAnimation4.setDuration(80);
    localAnimationSet2.addAnimation(localRotateAnimation4);
    i.add(localAnimationSet2);
    AnimationSet localAnimationSet3 = new AnimationSet(true);
    ScaleAnimation localScaleAnimation3 = new ScaleAnimation(1.0F, 0.95F, 1.0F, 0.95F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation3.setDuration('');
    localAnimationSet3.addAnimation(localScaleAnimation3);
    ScaleAnimation localScaleAnimation4 = new ScaleAnimation(0.95F, 1.0F, 0.95F, 1.0F, 1, 0.5F, 1, 0.5F);
    localScaleAnimation4.setDuration('');
    localScaleAnimation4.setStartOffset('');
    localAnimationSet3.addAnimation(localScaleAnimation4);
    i.add(localAnimationSet3);
    AnimationSet localAnimationSet4 = new AnimationSet(true);
    AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(1.0F, 0.4F);
    localAlphaAnimation1.setStartOffset(0);
    localAlphaAnimation1.setDuration(300);
    localAnimationSet4.addAnimation(localAlphaAnimation1);
    AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(0.4F, 1.0F);
    localAlphaAnimation2.setStartOffset(300);
    localAlphaAnimation2.setDuration(300);
    localAnimationSet4.addAnimation(localAlphaAnimation2);
    i.add(localAnimationSet4);
    AnimationSet localAnimationSet5 = new AnimationSet(true);
    Animation localAnimation1 = AnimationUtils.loadAnimation(paramContext, 17432579);
    localAnimation1.setStartOffset(0);
    localAnimation1.setDuration(500);
    localAnimationSet5.addAnimation(localAnimation1);
    i.add(localAnimationSet5);
    AnimationSet localAnimationSet6 = new AnimationSet(true);
    Animation localAnimation2 = AnimationUtils.loadAnimation(paramContext, 17432578);
    localAnimation2.setStartOffset(0);
    localAnimation2.setDuration(500);
    localAnimationSet6.addAnimation(localAnimation2);
    i.add(localAnimationSet6);
  }
  
  private AdView l()
  {
    return this.n;
  }
  
  public long a()
  {
    return this.m;
  }
  
  public abstract void a(int paramInt);
  
  public void a(Context paramContext)
  {
    if (h().getClickURL() != null) {
      new m(this, paramContext).start();
    }
  }
  
  protected void a(MotionEvent paramMotionEvent)
  {
    if (isPressed())
    {
      setPressed(false);
      if (paramMotionEvent != null) {}
      for (;;)
      {
        int i2;
        try
        {
          boolean bool1 = paramMotionEvent.getX() < this.e.getLeft();
          i2 = 0;
          if (bool1) {
            break label218;
          }
          boolean bool2 = paramMotionEvent.getX() < this.e.getRight();
          i2 = 0;
          if (bool2) {
            break label218;
          }
          boolean bool3 = paramMotionEvent.getY() < this.e.getTop();
          i2 = 0;
          if (bool3) {
            break label218;
          }
          boolean bool4 = paramMotionEvent.getY() < this.e.getBottom();
          i2 = 0;
          if (bool4) {
            break label218;
          }
          i2 = 1;
        }
        catch (Exception localException)
        {
          bk.a(localException);
          return;
        }
        if (i1 != 0)
        {
          bk.b("pressAnimation", "Hit!");
          this.e.startAnimation((Animation)i.get(0));
        }
        if ((paramMotionEvent != null) && (i1 != 0) && (this.b.getPhone() != null) && (!this.b.getPhone().equals("")))
        {
          b(getContext());
          return;
        }
        if (!r.k(getContext())) {
          break;
        }
        a(getContext());
        return;
        int i1 = 0;
        continue;
        label218:
        i1 = i2;
      }
    }
  }
  
  protected void a(Ad paramAd, t paramt, int paramInt, ag paramag)
  {
    this.o = (1 + this.o);
    bk.b("AdContainer.setAd", "showCount: " + this.o);
    if (this.o == this.p) {
      if (this.p > 8) {
        break label83;
      }
    }
    label83:
    for (this.p <<= 1;; this.p = (10 + this.p))
    {
      c.a().a(paramt, paramInt);
      k();
      return;
    }
  }
  
  public void b()
  {
    this.m = System.currentTimeMillis();
    this.j = new HashMap();
    for (ay localay : ay.a()) {
      this.j.put(localay, Integer.valueOf(0));
    }
  }
  
  public abstract void b(int paramInt);
  
  public void b(Context paramContext)
  {
    if (!h().getPhone().equals(""))
    {
      f();
      new n(this, paramContext).start();
    }
  }
  
  public Map<ay, Integer> c()
  {
    return this.j;
  }
  
  public boolean d()
  {
    ay[] arrayOfay = ay.a();
    int i1 = arrayOfay.length;
    int i2 = 0;
    if (i2 < i1)
    {
      ay localay = arrayOfay[i2];
      if (((Integer)this.j.get(localay)).intValue() <= 0) {}
    }
    for (int i3 = 0;; i3 = 1)
    {
      if (i3 != 0)
      {
        return false;
        i2++;
        break;
      }
      if (((Integer)this.j.get(ay.a)).intValue() <= 0) {
        return false;
      }
      return System.currentTimeMillis() - a() >= 10000L;
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!l().a()) {}
    for (;;)
    {
      try
      {
        i1 = paramMotionEvent.getAction();
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = Integer.valueOf(i1);
        arrayOfObject[1] = Float.valueOf(paramMotionEvent.getX());
        arrayOfObject[2] = Float.valueOf(paramMotionEvent.getY());
        bk.b("BaiduMobAds SDK", String.format("dispatchTouchEvent:: %s (%f, %f)", arrayOfObject));
        if (i1 != 0) {
          continue;
        }
        setPressed(true);
      }
      catch (Exception localException)
      {
        int i1;
        float f1;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        bk.a("dispatchTouchEvent", localException);
        continue;
        setPressed(true);
        continue;
        if (i1 != 1) {
          continue;
        }
        if (!isPressed()) {
          continue;
        }
        a(paramMotionEvent);
        setPressed(false);
        continue;
        if (i1 != 3) {
          continue;
        }
        setPressed(false);
        continue;
      }
      return super.dispatchTouchEvent(paramMotionEvent);
      if (i1 != 2) {
        continue;
      }
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      i2 = getLeft();
      i3 = getTop();
      i4 = getRight();
      i5 = getBottom();
      if ((f1 >= i2) && (f1 <= i4) && (f2 >= i3) && (f2 <= i5)) {
        continue;
      }
      setPressed(false);
    }
  }
  
  public void e()
  {
    this.j.put(ay.c, Integer.valueOf(1 + ((Integer)this.j.get(ay.c)).intValue()));
  }
  
  void f()
  {
    l.a(this);
  }
  
  public Animation g()
  {
    bk.b("AdContainer.initingAnimation");
    (Math.abs(new Random().nextInt()) % (-1 + i.size()));
    (-2 + i.size());
    return (Animation)i.get(2);
  }
  
  public Ad h()
  {
    return this.b;
  }
  
  protected boolean i()
  {
    return this.k;
  }
  
  protected void j()
  {
    this.k = true;
  }
  
  public void k()
  {
    c().put(ay.a, Integer.valueOf(1 + ((Integer)c().get(ay.a)).intValue()));
  }
  
  public abstract void setBackgroundColor(int paramInt);
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Boolean.valueOf(d());
    arrayOfObject[1] = this.j;
    return String.format("[val:%s %s]", arrayOfObject);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.l
 * JD-Core Version:    0.7.0.1
 */