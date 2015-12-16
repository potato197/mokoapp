package com.github.droidfu.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import java.net.URL;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ImageLoader
  implements Runnable
{
  static final String BITMAP_EXTRA = "droidfu:extra_bitmap";
  private static final int DEFAULT_POOL_SIZE = 2;
  static final int HANDLER_MESSAGE_ID;
  private static ThreadPoolExecutor executor;
  private static ImageCache imageCache;
  private static int numAttempts = 3;
  private Handler handler;
  private String imageUrl;
  
  private ImageLoader(String paramString, ImageView paramImageView)
  {
    this.imageUrl = paramString;
    this.handler = new ImageLoaderHandler(paramImageView);
  }
  
  private ImageLoader(String paramString, ImageLoaderHandler paramImageLoaderHandler)
  {
    this.imageUrl = paramString;
    this.handler = paramImageLoaderHandler;
  }
  
  public static void clearCache()
  {
    synchronized (imageCache)
    {
      imageCache.clear();
      return;
    }
  }
  
  public static void initialize(Context paramContext)
  {
    try
    {
      if (executor == null) {
        executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(2);
      }
      if (imageCache == null) {
        imageCache = new ImageCache(paramContext, 25, 5);
      }
      return;
    }
    finally {}
  }
  
  public static void setMaxDownloadAttempts(int paramInt)
  {
    numAttempts = paramInt;
  }
  
  public static void setThreadPoolSize(int paramInt)
  {
    executor.setMaximumPoolSize(paramInt);
  }
  
  public static void start(String paramString, ImageView paramImageView)
  {
    ImageLoader localImageLoader = new ImageLoader(paramString, paramImageView);
    synchronized (imageCache)
    {
      Bitmap localBitmap = imageCache.get(paramString);
      if (localBitmap == null)
      {
        executor.execute(localImageLoader);
        return;
      }
      paramImageView.setImageBitmap(localBitmap);
    }
  }
  
  public static void start(String paramString, ImageLoaderHandler paramImageLoaderHandler)
  {
    ImageLoader localImageLoader = new ImageLoader(paramString, paramImageLoaderHandler);
    synchronized (imageCache)
    {
      Bitmap localBitmap = imageCache.get(paramString);
      if (localBitmap == null)
      {
        executor.execute(localImageLoader);
        return;
      }
      localImageLoader.notifyImageLoaded(localBitmap);
    }
  }
  
  public void notifyImageLoaded(Bitmap paramBitmap)
  {
    Message localMessage = new Message();
    localMessage.what = 0;
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("droidfu:extra_bitmap", paramBitmap);
    localMessage.setData(localBundle);
    this.handler.sendMessage(localMessage);
  }
  
  public void run()
  {
    Bitmap localBitmap = null;
    i = 1;
    for (;;)
    {
      if (i <= numAttempts) {}
      try
      {
        localBitmap = BitmapFactory.decodeStream(new URL(this.imageUrl).openStream());
        synchronized (imageCache)
        {
          imageCache.put(this.imageUrl, localBitmap);
          if (localBitmap != null) {
            notifyImageLoaded(localBitmap);
          }
          return;
        }
        try
        {
          Thread.sleep(2000L);
          i++;
        }
        catch (InterruptedException localInterruptedException)
        {
          break label122;
        }
      }
      catch (Throwable localThrowable)
      {
        Log.w(ImageLoader.class.getSimpleName(), "download for " + this.imageUrl + " failed (attempt " + i + ")");
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.imageloader.ImageLoader
 * JD-Core Version:    0.7.0.1
 */