package com.baidu;

import android.graphics.Bitmap;

public class App$Snag
{
  private final Bitmap a;
  private Bitmap b;
  private final String c;
  
  public App$Snag(Bitmap paramBitmap, String paramString)
  {
    this.a = paramBitmap;
    this.c = paramString;
  }
  
  public Bitmap getFullBmp()
  {
    return this.b;
  }
  
  public String getFullUrl()
  {
    return this.c;
  }
  
  public Bitmap getThumbBmp()
  {
    return this.a;
  }
  
  public void setFullBmp(Bitmap paramBitmap)
  {
    this.b = paramBitmap;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.App.Snag
 * JD-Core Version:    0.7.0.1
 */