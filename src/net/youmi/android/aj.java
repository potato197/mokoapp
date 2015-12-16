package net.youmi.android;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

class aj
{
  private static Animation a;
  private static Animation b;
  private static Animation c;
  private static Animation d;
  
  private static Animation a(int paramInt)
  {
    AnimationSet localAnimationSet = new AnimationSet(true);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, 0.0F, paramInt);
    localTranslateAnimation.setDuration(300L);
    localAnimationSet.addAnimation(localTranslateAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(300L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return localAnimationSet;
  }
  
  static Animation a(ca paramca)
  {
    if (c == null) {
      c = e(paramca);
    }
    return c;
  }
  
  static Animation b(ca paramca)
  {
    if (d == null) {
      d = a(paramca.a().a());
    }
    return d;
  }
  
  static Animation c(ca paramca)
  {
    if (a == null) {
      a = f(paramca);
    }
    return a;
  }
  
  static Animation d(ca paramca)
  {
    if (b == null) {
      b = g(paramca);
    }
    return b;
  }
  
  private static Animation e(ca paramca)
  {
    AnimationSet localAnimationSet = new AnimationSet(true);
    TranslateAnimation localTranslateAnimation = new TranslateAnimation(0.0F, 0.0F, -paramca.a().a(), 0.0F);
    localTranslateAnimation.setDuration(300L);
    localAnimationSet.addAnimation(localTranslateAnimation);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(300L);
    localAnimationSet.addAnimation(localAlphaAnimation);
    return localAnimationSet;
  }
  
  private static Animation f(ca paramca)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(600L);
    return localAlphaAnimation;
  }
  
  private static Animation g(ca paramca)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(600L);
    return localAlphaAnimation;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.aj
 * JD-Core Version:    0.7.0.1
 */