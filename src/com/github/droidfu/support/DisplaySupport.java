package com.github.droidfu.support;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public class DisplaySupport
{
  private static DisplayMetrics displayMetrics;
  
  public static int dipToPx(Activity paramActivity, int paramInt)
  {
    if (displayMetrics == null)
    {
      displayMetrics = new DisplayMetrics();
      paramActivity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
    }
    return (int)(0.5F + paramInt * displayMetrics.density);
  }
  
  public static Drawable scaleDrawable(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    return new BitmapDrawable(Bitmap.createScaledBitmap(BitmapFactory.decodeResource(paramContext.getResources(), paramInt1), paramInt2, paramInt3, true));
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.support.DisplaySupport
 * JD-Core Version:    0.7.0.1
 */