package com.github.droidfu.imageloader;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

public class ImageLoaderHandler
  extends Handler
{
  private ImageView imageView;
  
  public ImageLoaderHandler(ImageView paramImageView)
  {
    this.imageView = paramImageView;
  }
  
  ImageView getImageView()
  {
    return this.imageView;
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0)
    {
      Bitmap localBitmap = (Bitmap)paramMessage.getData().getParcelable("droidfu:extra_bitmap");
      this.imageView.setImageBitmap(localBitmap);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.imageloader.ImageLoaderHandler
 * JD-Core Version:    0.7.0.1
 */