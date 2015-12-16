package com.github.droidfu.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.google.common.collect.MapMaker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImageCache
  implements Map<String, Bitmap>
{
  private Map<String, Bitmap> cache;
  private int cachedImageQuality = 75;
  private Bitmap.CompressFormat compressedImageFormat = Bitmap.CompressFormat.JPEG;
  private String secondLevelCacheDir;
  
  public ImageCache(Context paramContext, int paramInt1, int paramInt2)
  {
    this.cache = new MapMaker().initialCapacity(paramInt1).concurrencyLevel(paramInt2).weakValues().makeMap();
    this.secondLevelCacheDir = (paramContext.getApplicationContext().getCacheDir() + "/droidfu/imagecache");
    new File(this.secondLevelCacheDir).mkdirs();
  }
  
  private File getImageFile(String paramString)
  {
    String str = Integer.toHexString(paramString.hashCode()) + "." + this.compressedImageFormat.name();
    return new File(this.secondLevelCacheDir + "/" + str);
  }
  
  public void clear()
  {
    this.cache.clear();
  }
  
  public boolean containsKey(Object paramObject)
  {
    return this.cache.containsKey(paramObject);
  }
  
  public boolean containsValue(Object paramObject)
  {
    return this.cache.containsValue(paramObject);
  }
  
  public Set<Map.Entry<String, Bitmap>> entrySet()
  {
    return this.cache.entrySet();
  }
  
  /* Error */
  public Bitmap get(Object paramObject)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: checkcast 91	java/lang/String
    //   6: astore_3
    //   7: aload_0
    //   8: getfield 50	com/github/droidfu/imageloader/ImageCache:cache	Ljava/util/Map;
    //   11: aload_3
    //   12: invokeinterface 127 2 0
    //   17: checkcast 129	android/graphics/Bitmap
    //   20: astore 4
    //   22: aload 4
    //   24: ifnull +12 -> 36
    //   27: aload 4
    //   29: astore 7
    //   31: aload_0
    //   32: monitorexit
    //   33: aload 7
    //   35: areturn
    //   36: aload_0
    //   37: aload_3
    //   38: invokespecial 131	com/github/droidfu/imageloader/ImageCache:getImageFile	(Ljava/lang/String;)Ljava/io/File;
    //   41: astore 5
    //   43: aload 5
    //   45: invokevirtual 134	java/io/File:exists	()Z
    //   48: istore 6
    //   50: aconst_null
    //   51: astore 7
    //   53: iload 6
    //   55: ifeq -24 -> 31
    //   58: aload 5
    //   60: invokevirtual 137	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   63: invokestatic 143	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   66: astore 8
    //   68: aconst_null
    //   69: astore 7
    //   71: aload 8
    //   73: ifnull -42 -> 31
    //   76: aload_0
    //   77: getfield 50	com/github/droidfu/imageloader/ImageCache:cache	Ljava/util/Map;
    //   80: aload_3
    //   81: aload 8
    //   83: invokeinterface 147 3 0
    //   88: pop
    //   89: aload 8
    //   91: astore 7
    //   93: goto -62 -> 31
    //   96: astore_2
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_2
    //   100: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	101	0	this	ImageCache
    //   0	101	1	paramObject	Object
    //   96	4	2	localObject1	Object
    //   6	75	3	str	String
    //   20	8	4	localBitmap1	Bitmap
    //   41	18	5	localFile	File
    //   48	6	6	bool	boolean
    //   29	63	7	localObject2	Object
    //   66	24	8	localBitmap2	Bitmap
    // Exception table:
    //   from	to	target	type
    //   2	22	96	finally
    //   36	50	96	finally
    //   58	68	96	finally
    //   76	89	96	finally
  }
  
  public int getCachedImageQuality()
  {
    return this.cachedImageQuality;
  }
  
  public boolean isEmpty()
  {
    return this.cache.isEmpty();
  }
  
  public Set<String> keySet()
  {
    return this.cache.keySet();
  }
  
  public Bitmap put(String paramString, Bitmap paramBitmap)
  {
    File localFile = getImageFile(paramString);
    try
    {
      localFile.createNewFile();
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      paramBitmap.compress(this.compressedImageFormat, this.cachedImageQuality, localFileOutputStream);
      localFileOutputStream.close();
      return (Bitmap)this.cache.put(paramString, paramBitmap);
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        localFileNotFoundException.printStackTrace();
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        localIOException.printStackTrace();
      }
    }
  }
  
  public void putAll(Map<? extends String, ? extends Bitmap> paramMap)
  {
    throw new UnsupportedOperationException();
  }
  
  public Bitmap remove(Object paramObject)
  {
    return (Bitmap)this.cache.remove(paramObject);
  }
  
  public void setCachedImageQuality(int paramInt)
  {
    this.cachedImageQuality = paramInt;
  }
  
  public int size()
  {
    return this.cache.size();
  }
  
  public Collection<Bitmap> values()
  {
    return this.cache.values();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.imageloader.ImageCache
 * JD-Core Version:    0.7.0.1
 */