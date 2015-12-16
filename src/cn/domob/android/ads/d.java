package cn.domob.android.ads;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Hashtable;

final class d
{
  protected static void a(c paramc, String paramString, byte[] paramArrayOfByte)
  {
    Cursor localCursor = null;
    for (;;)
    {
      try
      {
        localCursor = paramc.b(c.b, paramString);
        if ((localCursor != null) && (localCursor.getCount() != 0)) {
          continue;
        }
        paramc.a(c.b);
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "save image:" + paramString + " to cache!");
        }
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("_name", paramString);
        localContentValues.put("_image", paramArrayOfByte);
        localContentValues.put("_date", Long.valueOf(System.currentTimeMillis()));
        paramc.a(c.b, localContentValues);
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      return;
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", paramString + " is already in cache.");
      }
    }
  }
  
  protected static boolean a(c paramc, String paramString1, String paramString2, Hashtable<String, byte[]> paramHashtable)
  {
    Cursor localCursor = null;
    for (;;)
    {
      try
      {
        localCursor = paramc.b(c.b, paramString2);
        if ((localCursor == null) || (localCursor.getCount() <= 0)) {
          continue;
        }
        localCursor.moveToFirst();
        byte[] arrayOfByte = localCursor.getBlob(localCursor.getColumnIndexOrThrow("_image"));
        bool1 = false;
        if (arrayOfByte != null)
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "load image from cache:" + paramString2);
          }
          paramHashtable.put(paramString1, arrayOfByte);
          bool1 = true;
        }
      }
      catch (Exception localException)
      {
        boolean bool2;
        localException.printStackTrace();
        boolean bool1 = false;
        continue;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      return bool1;
      bool2 = Log.isLoggable("DomobSDK", 3);
      bool1 = false;
      if (bool2)
      {
        Log.d("DomobSDK", "fail to load image:" + paramString2 + " from cache");
        bool1 = false;
      }
    }
  }
  
  protected static boolean b(c paramc, String paramString1, String paramString2, Hashtable<String, byte[]> paramHashtable)
  {
    bool1 = true;
    bool2 = false;
    for (;;)
    {
      try
      {
        Cursor localCursor = paramc.b(c.a, paramString2);
        localObject2 = localCursor;
        if (localObject2 == null) {}
      }
      catch (Exception localException1)
      {
        int i;
        byte[] arrayOfByte2;
        Context localContext;
        ByteArrayOutputStream localByteArrayOutputStream;
        Bitmap localBitmap;
        byte[] arrayOfByte1;
        bool3 = false;
        localObject1 = null;
        Log.i("DomobSDK", "cannot load it from res this time.");
        if (Log.isLoggable("DomobSDK", 3)) {
          localException1.printStackTrace();
        }
        bool1 = bool3;
        localObject2 = localObject1;
        continue;
      }
      try
      {
        i = ((Cursor)localObject2).getCount();
        bool2 = false;
        if (i <= 0) {
          continue;
        }
        ((Cursor)localObject2).moveToFirst();
        arrayOfByte2 = ((Cursor)localObject2).getBlob(((Cursor)localObject2).getColumnIndexOrThrow("_image"));
        if (arrayOfByte2 == null) {
          break label287;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "success to load from resources DB.");
        }
        paramHashtable.put(paramString1, arrayOfByte2);
      }
      catch (Exception localException2)
      {
        Object localObject3 = localObject2;
        bool3 = bool2;
        localObject1 = localObject3;
        continue;
        bool1 = false;
        continue;
      }
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
      return bool1;
      localContext = paramc.a();
      bool2 = false;
      if (localContext != null)
      {
        localByteArrayOutputStream = new ByteArrayOutputStream();
        localBitmap = BitmapFactory.decodeStream(localContext.getAssets().open(paramString2));
        localBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
        arrayOfByte1 = localByteArrayOutputStream.toByteArray();
        bool2 = false;
        if (arrayOfByte1 != null)
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "success to load from preload resources.");
          }
          paramHashtable.put(paramString1, arrayOfByte1);
          bool2 = bool1;
        }
        localByteArrayOutputStream.close();
        if (localBitmap != null) {
          localBitmap.recycle();
        }
      }
      bool1 = bool2;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.d
 * JD-Core Version:    0.7.0.1
 */