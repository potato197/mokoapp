package com.baidu;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.net.URL;

final class a
  extends Thread
{
  a(Context paramContext, String paramString, Ad paramAd) {}
  
  public void run()
  {
    try
    {
      w.b(false, this.a, new URL(this.b), Ad.a(this.c));
      return;
    }
    catch (Exception localException)
    {
      bk.a("createAd", localException);
      Ad.a(this.c, Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8));
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.a
 * JD-Core Version:    0.7.0.1
 */