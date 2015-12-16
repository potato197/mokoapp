package com.baidu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class w
{
  private static final Proxy a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.172", 80));
  private static final Proxy b = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80));
  
  /* Error */
  public static android.graphics.Bitmap a(Context paramContext, URL paramURL)
  {
    // Byte code:
    //   0: ldc 41
    //   2: aload_1
    //   3: invokevirtual 47	java/net/URL:toString	()Ljava/lang/String;
    //   6: invokestatic 52	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   9: pop
    //   10: aload_0
    //   11: aload_1
    //   12: invokestatic 55	com/baidu/w:b	(Landroid/content/Context;Ljava/net/URL;)Ljava/net/HttpURLConnection;
    //   15: invokevirtual 61	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   18: astore 13
    //   20: aload 13
    //   22: astore 4
    //   24: aload 4
    //   26: invokestatic 67	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   29: astore 14
    //   31: aload 14
    //   33: astore 10
    //   35: aload 4
    //   37: ifnull +8 -> 45
    //   40: aload 4
    //   42: invokevirtual 72	java/io/InputStream:close	()V
    //   45: aload 10
    //   47: areturn
    //   48: astore 15
    //   50: ldc 74
    //   52: ldc 76
    //   54: aload 15
    //   56: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   59: pop
    //   60: aload 10
    //   62: areturn
    //   63: astore 8
    //   65: aconst_null
    //   66: astore 4
    //   68: ldc 74
    //   70: ldc 76
    //   72: aload 8
    //   74: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   77: pop
    //   78: aconst_null
    //   79: astore 10
    //   81: aload 4
    //   83: ifnull -38 -> 45
    //   86: aload 4
    //   88: invokevirtual 72	java/io/InputStream:close	()V
    //   91: aconst_null
    //   92: areturn
    //   93: astore 11
    //   95: ldc 74
    //   97: ldc 76
    //   99: aload 11
    //   101: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   104: pop
    //   105: aconst_null
    //   106: areturn
    //   107: astore_3
    //   108: aconst_null
    //   109: astore 4
    //   111: aload_3
    //   112: astore 5
    //   114: aload 4
    //   116: ifnull +8 -> 124
    //   119: aload 4
    //   121: invokevirtual 72	java/io/InputStream:close	()V
    //   124: aload 5
    //   126: athrow
    //   127: astore 6
    //   129: ldc 74
    //   131: ldc 76
    //   133: aload 6
    //   135: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   138: pop
    //   139: goto -15 -> 124
    //   142: astore 5
    //   144: goto -30 -> 114
    //   147: astore 8
    //   149: goto -81 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	paramContext	Context
    //   0	152	1	paramURL	URL
    //   107	5	3	localObject1	Object
    //   22	98	4	localInputStream1	java.io.InputStream
    //   112	13	5	localObject2	Object
    //   142	1	5	localObject3	Object
    //   127	7	6	localIOException1	IOException
    //   63	10	8	localIOException2	IOException
    //   147	1	8	localIOException3	IOException
    //   33	47	10	localBitmap1	android.graphics.Bitmap
    //   93	7	11	localIOException4	IOException
    //   18	3	13	localInputStream2	java.io.InputStream
    //   29	3	14	localBitmap2	android.graphics.Bitmap
    //   48	7	15	localIOException5	IOException
    // Exception table:
    //   from	to	target	type
    //   40	45	48	java/io/IOException
    //   10	20	63	java/io/IOException
    //   86	91	93	java/io/IOException
    //   10	20	107	finally
    //   119	124	127	java/io/IOException
    //   24	31	142	finally
    //   68	78	142	finally
    //   24	31	147	java/io/IOException
  }
  
  /* Error */
  public static android.graphics.Bitmap a(URL paramURL, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc 74
    //   4: aload_0
    //   5: invokevirtual 47	java/net/URL:toString	()Ljava/lang/String;
    //   8: invokestatic 52	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   11: pop
    //   12: aload_0
    //   13: invokevirtual 84	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   16: checkcast 86	java/net/JarURLConnection
    //   19: astore 12
    //   21: aload 12
    //   23: iconst_0
    //   24: invokevirtual 90	java/net/JarURLConnection:setConnectTimeout	(I)V
    //   27: aload 12
    //   29: iconst_0
    //   30: invokevirtual 93	java/net/JarURLConnection:setReadTimeout	(I)V
    //   33: aload 12
    //   35: iload_1
    //   36: invokevirtual 97	java/net/JarURLConnection:setUseCaches	(Z)V
    //   39: aload 12
    //   41: invokevirtual 100	java/net/JarURLConnection:connect	()V
    //   44: aload 12
    //   46: invokevirtual 101	java/net/JarURLConnection:getInputStream	()Ljava/io/InputStream;
    //   49: astore 13
    //   51: aload 13
    //   53: astore 8
    //   55: aload 8
    //   57: invokestatic 67	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   60: astore 14
    //   62: aload 8
    //   64: ifnull +8 -> 72
    //   67: aload 8
    //   69: invokevirtual 72	java/io/InputStream:close	()V
    //   72: aload 14
    //   74: areturn
    //   75: astore 15
    //   77: ldc 74
    //   79: ldc 76
    //   81: aload 15
    //   83: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   86: pop
    //   87: aload 14
    //   89: areturn
    //   90: astore 7
    //   92: aconst_null
    //   93: astore 8
    //   95: ldc 74
    //   97: ldc 76
    //   99: aload 7
    //   101: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   104: pop
    //   105: aload 8
    //   107: ifnull +8 -> 115
    //   110: aload 8
    //   112: invokevirtual 72	java/io/InputStream:close	()V
    //   115: aconst_null
    //   116: areturn
    //   117: astore 10
    //   119: ldc 74
    //   121: ldc 76
    //   123: aload 10
    //   125: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   128: pop
    //   129: aconst_null
    //   130: areturn
    //   131: astore 4
    //   133: aload_2
    //   134: ifnull +7 -> 141
    //   137: aload_2
    //   138: invokevirtual 72	java/io/InputStream:close	()V
    //   141: aload 4
    //   143: athrow
    //   144: astore 5
    //   146: ldc 74
    //   148: ldc 76
    //   150: aload 5
    //   152: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   155: pop
    //   156: goto -15 -> 141
    //   159: astore 4
    //   161: aload 8
    //   163: astore_2
    //   164: goto -31 -> 133
    //   167: astore 7
    //   169: goto -74 -> 95
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	paramURL	URL
    //   0	172	1	paramBoolean	boolean
    //   1	163	2	localObject1	Object
    //   131	11	4	localObject2	Object
    //   159	1	4	localObject3	Object
    //   144	7	5	localIOException1	IOException
    //   90	10	7	localIOException2	IOException
    //   167	1	7	localIOException3	IOException
    //   53	109	8	localInputStream1	java.io.InputStream
    //   117	7	10	localIOException4	IOException
    //   19	26	12	localJarURLConnection	java.net.JarURLConnection
    //   49	3	13	localInputStream2	java.io.InputStream
    //   60	28	14	localBitmap	android.graphics.Bitmap
    //   75	7	15	localIOException5	IOException
    // Exception table:
    //   from	to	target	type
    //   67	72	75	java/io/IOException
    //   12	51	90	java/io/IOException
    //   110	115	117	java/io/IOException
    //   12	51	131	finally
    //   137	141	144	java/io/IOException
    //   55	62	159	finally
    //   95	105	159	finally
    //   55	62	167	java/io/IOException
  }
  
  public static String a(Context paramContext, String paramString)
  {
    bk.b("AdUtil.read", paramString);
    try
    {
      byte[] arrayOfByte = i(paramContext, paramString);
      if (arrayOfByte != null)
      {
        String str = new String(arrayOfByte, "utf-8");
        return str;
      }
    }
    catch (Exception localException)
    {
      Log.w("Mobads SDK", "AdUtil.read", localException);
    }
    return "";
  }
  
  public static String a(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    if (paramString.startsWith("file:///")) {
      return k(paramContext, paramString);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    HttpURLConnection localHttpURLConnection = b(paramContext, paramString, paramInt1, paramInt2);
    localHttpURLConnection.connect();
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localHttpURLConnection.getInputStream()));
    for (;;)
    {
      String str = localBufferedReader.readLine();
      if (str == null) {
        break;
      }
      localStringBuilder.append(str);
    }
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(localStringBuilder.length());
    arrayOfObject[1] = Integer.valueOf(localHttpURLConnection.getContentLength());
    arrayOfObject[2] = Integer.valueOf(localHttpURLConnection.getResponseCode());
    arrayOfObject[3] = localHttpURLConnection.getResponseMessage();
    arrayOfObject[4] = localStringBuilder;
    bk.b("AdUtil.get", String.format("Header: %d/%d %d %s \t%s", arrayOfObject));
    if (localBufferedReader != null) {
      localBufferedReader.close();
    }
    if (localHttpURLConnection.getContentLength() < 0) {
      localStringBuilder = new StringBuilder("{error}");
    }
    return localStringBuilder.toString();
  }
  
  /* Error */
  public static String a(URL paramURL)
  {
    // Byte code:
    //   0: ldc 74
    //   2: aload_0
    //   3: invokevirtual 47	java/net/URL:toString	()Ljava/lang/String;
    //   6: invokestatic 52	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   9: pop
    //   10: aconst_null
    //   11: astore_2
    //   12: new 136	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   19: astore_3
    //   20: aload_0
    //   21: invokevirtual 84	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   24: checkcast 86	java/net/JarURLConnection
    //   27: astore 12
    //   29: aload 12
    //   31: iconst_0
    //   32: invokevirtual 90	java/net/JarURLConnection:setConnectTimeout	(I)V
    //   35: aload 12
    //   37: iconst_0
    //   38: invokevirtual 93	java/net/JarURLConnection:setReadTimeout	(I)V
    //   41: aload 12
    //   43: iconst_0
    //   44: invokevirtual 97	java/net/JarURLConnection:setUseCaches	(Z)V
    //   47: aload 12
    //   49: invokevirtual 100	java/net/JarURLConnection:connect	()V
    //   52: new 143	java/io/BufferedReader
    //   55: dup
    //   56: new 145	java/io/InputStreamReader
    //   59: dup
    //   60: aload 12
    //   62: invokevirtual 101	java/net/JarURLConnection:getInputStream	()Ljava/io/InputStream;
    //   65: invokespecial 148	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   68: invokespecial 151	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   71: astore 5
    //   73: aload 5
    //   75: invokevirtual 154	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   78: astore 13
    //   80: aload 13
    //   82: ifnull +40 -> 122
    //   85: aload_3
    //   86: aload 13
    //   88: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   91: pop
    //   92: goto -19 -> 73
    //   95: astore 4
    //   97: ldc 74
    //   99: ldc 76
    //   101: aload 4
    //   103: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   106: pop
    //   107: aload 5
    //   109: ifnull +8 -> 117
    //   112: aload 5
    //   114: invokevirtual 186	java/io/BufferedReader:close	()V
    //   117: aload_3
    //   118: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   121: areturn
    //   122: aload 5
    //   124: ifnull -7 -> 117
    //   127: aload 5
    //   129: invokevirtual 186	java/io/BufferedReader:close	()V
    //   132: goto -15 -> 117
    //   135: astore 15
    //   137: ldc 74
    //   139: ldc 76
    //   141: aload 15
    //   143: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   146: pop
    //   147: goto -30 -> 117
    //   150: astore 10
    //   152: ldc 74
    //   154: ldc 76
    //   156: aload 10
    //   158: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   161: pop
    //   162: goto -45 -> 117
    //   165: astore 6
    //   167: aload_2
    //   168: ifnull +7 -> 175
    //   171: aload_2
    //   172: invokevirtual 186	java/io/BufferedReader:close	()V
    //   175: aload 6
    //   177: athrow
    //   178: astore 7
    //   180: ldc 74
    //   182: ldc 76
    //   184: aload 7
    //   186: invokestatic 79	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   189: pop
    //   190: goto -15 -> 175
    //   193: astore 6
    //   195: aload 5
    //   197: astore_2
    //   198: goto -31 -> 167
    //   201: astore 4
    //   203: aconst_null
    //   204: astore 5
    //   206: goto -109 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	paramURL	URL
    //   11	187	2	localObject1	Object
    //   19	99	3	localStringBuilder	StringBuilder
    //   95	7	4	localIOException1	IOException
    //   201	1	4	localIOException2	IOException
    //   71	134	5	localBufferedReader	BufferedReader
    //   165	11	6	localObject2	Object
    //   193	1	6	localObject3	Object
    //   178	7	7	localIOException3	IOException
    //   150	7	10	localIOException4	IOException
    //   27	34	12	localJarURLConnection	java.net.JarURLConnection
    //   78	9	13	str	String
    //   135	7	15	localIOException5	IOException
    // Exception table:
    //   from	to	target	type
    //   73	80	95	java/io/IOException
    //   85	92	95	java/io/IOException
    //   127	132	135	java/io/IOException
    //   112	117	150	java/io/IOException
    //   20	73	165	finally
    //   171	175	178	java/io/IOException
    //   73	80	193	finally
    //   85	92	193	finally
    //   97	107	193	finally
    //   20	73	201	java/io/IOException
  }
  
  public static String a(boolean paramBoolean, Context paramContext, String paramString)
  {
    if (paramBoolean) {
      return c(paramString);
    }
    return a(paramContext, paramString);
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    FileOutputStream localFileOutputStream = null;
    int i;
    if (paramBoolean) {
      i = 32768;
    }
    for (;;)
    {
      try
      {
        localFileOutputStream = paramContext.openFileOutput(paramString1, i);
        if (localFileOutputStream != null) {
          localFileOutputStream.write(paramString2.getBytes("utf-8"));
        }
      }
      catch (Exception localException2)
      {
        StringBuilder localStringBuilder;
        boolean bool;
        Log.w("Mobads SDK", "AdUtil.write", localException2);
        if (localFileOutputStream == null) {
          continue;
        }
        try
        {
          localFileOutputStream.close();
          return;
        }
        catch (Exception localException3)
        {
          Log.w("Mobads SDK", "AdUtil.write", localException3);
          return;
        }
      }
      finally
      {
        if (localFileOutputStream == null) {
          break label158;
        }
      }
      try
      {
        localFileOutputStream.close();
        return;
      }
      catch (Exception localException4)
      {
        Log.w("Mobads SDK", "AdUtil.write", localException4);
        return;
      }
      i = 0;
      continue;
      localStringBuilder = new StringBuilder().append("AdUtil.write fout is null:");
      bool = false;
      if (localFileOutputStream == null) {
        bool = true;
      }
      Log.w("Mobads SDK", bool);
    }
    try
    {
      localFileOutputStream.close();
      label158:
      throw localObject;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        Log.w("Mobads SDK", "AdUtil.write", localException1);
      }
    }
  }
  
  /* Error */
  public static void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 233
    //   2: invokestatic 238	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   5: invokevirtual 242	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   8: ifne +4 -> 12
    //   11: return
    //   12: aconst_null
    //   13: astore_3
    //   14: invokestatic 246	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   17: astore 15
    //   19: new 248	java/io/File
    //   22: dup
    //   23: new 136	java/lang/StringBuilder
    //   26: dup
    //   27: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   30: aload 15
    //   32: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   35: getstatic 255	java/io/File:separator	Ljava/lang/String;
    //   38: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_0
    //   42: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokespecial 256	java/io/File:<init>	(Ljava/lang/String;)V
    //   51: astore 16
    //   53: aload 16
    //   55: invokevirtual 260	java/io/File:exists	()Z
    //   58: istore 17
    //   60: aconst_null
    //   61: astore_3
    //   62: iload 17
    //   64: ifne +18 -> 82
    //   67: aload 16
    //   69: invokevirtual 263	java/io/File:getParentFile	()Ljava/io/File;
    //   72: invokevirtual 266	java/io/File:mkdirs	()Z
    //   75: pop
    //   76: aload 16
    //   78: invokevirtual 269	java/io/File:createNewFile	()Z
    //   81: pop
    //   82: new 214	java/io/FileOutputStream
    //   85: dup
    //   86: aload 16
    //   88: iload_2
    //   89: invokespecial 272	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   92: astore 20
    //   94: aload 20
    //   96: aload_1
    //   97: ldc 114
    //   99: invokevirtual 212	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   102: invokevirtual 218	java/io/FileOutputStream:write	([B)V
    //   105: aload 20
    //   107: ifnull -96 -> 11
    //   110: aload 20
    //   112: invokevirtual 219	java/io/FileOutputStream:close	()V
    //   115: return
    //   116: astore 21
    //   118: ldc 119
    //   120: ldc_w 274
    //   123: aload 21
    //   125: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   128: pop
    //   129: return
    //   130: astore 11
    //   132: ldc 119
    //   134: ldc_w 274
    //   137: aload 11
    //   139: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   142: pop
    //   143: aload_3
    //   144: ifnull -133 -> 11
    //   147: aload_3
    //   148: invokevirtual 219	java/io/FileOutputStream:close	()V
    //   151: return
    //   152: astore 13
    //   154: ldc 119
    //   156: ldc_w 274
    //   159: aload 13
    //   161: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   164: pop
    //   165: return
    //   166: astore 7
    //   168: ldc 119
    //   170: ldc_w 274
    //   173: aload 7
    //   175: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   178: pop
    //   179: aload_3
    //   180: ifnull -169 -> 11
    //   183: aload_3
    //   184: invokevirtual 219	java/io/FileOutputStream:close	()V
    //   187: return
    //   188: astore 9
    //   190: ldc 119
    //   192: ldc_w 274
    //   195: aload 9
    //   197: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   200: pop
    //   201: return
    //   202: astore 4
    //   204: aload_3
    //   205: ifnull +7 -> 212
    //   208: aload_3
    //   209: invokevirtual 219	java/io/FileOutputStream:close	()V
    //   212: aload 4
    //   214: athrow
    //   215: astore 5
    //   217: ldc 119
    //   219: ldc_w 274
    //   222: aload 5
    //   224: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   227: pop
    //   228: goto -16 -> 212
    //   231: astore 4
    //   233: aload 20
    //   235: astore_3
    //   236: goto -32 -> 204
    //   239: astore 7
    //   241: aload 20
    //   243: astore_3
    //   244: goto -76 -> 168
    //   247: astore 11
    //   249: aload 20
    //   251: astore_3
    //   252: goto -120 -> 132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	255	0	paramString1	String
    //   0	255	1	paramString2	String
    //   0	255	2	paramBoolean	boolean
    //   13	239	3	localObject1	Object
    //   202	11	4	localObject2	Object
    //   231	1	4	localObject3	Object
    //   215	8	5	localIOException1	IOException
    //   166	8	7	localIOException2	IOException
    //   239	1	7	localIOException3	IOException
    //   188	8	9	localIOException4	IOException
    //   130	8	11	localFileNotFoundException1	java.io.FileNotFoundException
    //   247	1	11	localFileNotFoundException2	java.io.FileNotFoundException
    //   152	8	13	localIOException5	IOException
    //   17	14	15	localFile1	File
    //   51	36	16	localFile2	File
    //   58	5	17	bool	boolean
    //   92	158	20	localFileOutputStream	FileOutputStream
    //   116	8	21	localIOException6	IOException
    // Exception table:
    //   from	to	target	type
    //   110	115	116	java/io/IOException
    //   14	60	130	java/io/FileNotFoundException
    //   67	82	130	java/io/FileNotFoundException
    //   82	94	130	java/io/FileNotFoundException
    //   147	151	152	java/io/IOException
    //   14	60	166	java/io/IOException
    //   67	82	166	java/io/IOException
    //   82	94	166	java/io/IOException
    //   183	187	188	java/io/IOException
    //   14	60	202	finally
    //   67	82	202	finally
    //   82	94	202	finally
    //   132	143	202	finally
    //   168	179	202	finally
    //   208	212	215	java/io/IOException
    //   94	105	231	finally
    //   94	105	239	java/io/IOException
    //   94	105	247	java/io/FileNotFoundException
  }
  
  public static void a(boolean paramBoolean1, Context paramContext, String paramString1, String paramString2, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      a(paramString1, paramString2, paramBoolean2);
      return;
    }
    a(paramContext, paramString1, paramString2, paramBoolean2);
  }
  
  public static boolean a(String paramString)
  {
    return a(paramString, false);
  }
  
  public static boolean a(String paramString, boolean paramBoolean)
  {
    bk.b("AdUtil.existsExt", paramString);
    if (!"mounted".equals(Environment.getExternalStorageState())) {
      return false;
    }
    File localFile = Environment.getExternalStorageDirectory();
    if (paramBoolean) {}
    for (;;)
    {
      return new File(paramString).exists();
      paramString = localFile + File.separator + paramString;
    }
  }
  
  /* Error */
  public static boolean a(boolean paramBoolean, Context paramContext, URL paramURL, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: iconst_2
    //   4: anewarray 4	java/lang/Object
    //   7: astore 5
    //   9: aload 5
    //   11: iconst_0
    //   12: aload_3
    //   13: aastore
    //   14: aload 5
    //   16: iconst_1
    //   17: aload_2
    //   18: invokevirtual 47	java/net/URL:toString	()Ljava/lang/String;
    //   21: aastore
    //   22: ldc_w 290
    //   25: ldc_w 292
    //   28: aload 5
    //   30: invokestatic 185	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   33: invokestatic 52	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   36: pop
    //   37: aload_2
    //   38: invokevirtual 84	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   41: checkcast 86	java/net/JarURLConnection
    //   44: astore 16
    //   46: aload 16
    //   48: invokevirtual 100	java/net/JarURLConnection:connect	()V
    //   51: new 294	java/io/BufferedInputStream
    //   54: dup
    //   55: aload 16
    //   57: invokevirtual 101	java/net/JarURLConnection:getInputStream	()Ljava/io/InputStream;
    //   60: invokespecial 295	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   63: astore 8
    //   65: iload_0
    //   66: ifeq +172 -> 238
    //   69: ldc 233
    //   71: invokestatic 238	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   74: invokevirtual 242	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   77: istore 22
    //   79: iload 22
    //   81: ifne +38 -> 119
    //   84: aload 8
    //   86: ifnull +8 -> 94
    //   89: aload 8
    //   91: invokevirtual 296	java/io/BufferedInputStream:close	()V
    //   94: iconst_0
    //   95: ifeq +7 -> 102
    //   98: aconst_null
    //   99: invokevirtual 299	java/io/BufferedOutputStream:close	()V
    //   102: iconst_0
    //   103: ireturn
    //   104: astore 24
    //   106: ldc_w 301
    //   109: ldc 76
    //   111: aload 24
    //   113: invokestatic 303	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   116: pop
    //   117: iconst_0
    //   118: ireturn
    //   119: invokestatic 246	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   122: astore 23
    //   124: new 298	java/io/BufferedOutputStream
    //   127: dup
    //   128: new 214	java/io/FileOutputStream
    //   131: dup
    //   132: new 136	java/lang/StringBuilder
    //   135: dup
    //   136: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   139: aload 23
    //   141: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   144: getstatic 255	java/io/File:separator	Ljava/lang/String;
    //   147: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: aload_3
    //   151: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: invokespecial 304	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   160: invokespecial 307	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   163: astore 4
    //   165: sipush 5120
    //   168: newarray byte
    //   170: astore 18
    //   172: aload 8
    //   174: aload 18
    //   176: invokevirtual 311	java/io/BufferedInputStream:read	([B)I
    //   179: istore 19
    //   181: iload 19
    //   183: ifle +77 -> 260
    //   186: aload 4
    //   188: aload 18
    //   190: iconst_0
    //   191: iload 19
    //   193: invokevirtual 314	java/io/BufferedOutputStream:write	([BII)V
    //   196: goto -24 -> 172
    //   199: astore 7
    //   201: ldc_w 301
    //   204: ldc 76
    //   206: aload 7
    //   208: invokestatic 303	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   211: pop
    //   212: aload 8
    //   214: ifnull +8 -> 222
    //   217: aload 8
    //   219: invokevirtual 296	java/io/BufferedInputStream:close	()V
    //   222: aload 4
    //   224: ifnull +8 -> 232
    //   227: aload 4
    //   229: invokevirtual 299	java/io/BufferedOutputStream:close	()V
    //   232: iconst_1
    //   233: istore 15
    //   235: iload 15
    //   237: ireturn
    //   238: new 298	java/io/BufferedOutputStream
    //   241: dup
    //   242: aload_1
    //   243: aload_3
    //   244: iconst_0
    //   245: invokevirtual 208	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   248: invokespecial 307	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   251: astore 17
    //   253: aload 17
    //   255: astore 4
    //   257: goto -92 -> 165
    //   260: aload 8
    //   262: ifnull +8 -> 270
    //   265: aload 8
    //   267: invokevirtual 296	java/io/BufferedInputStream:close	()V
    //   270: aload 4
    //   272: ifnull +8 -> 280
    //   275: aload 4
    //   277: invokevirtual 299	java/io/BufferedOutputStream:close	()V
    //   280: iconst_1
    //   281: istore 15
    //   283: goto -48 -> 235
    //   286: astore 20
    //   288: ldc_w 301
    //   291: ldc 76
    //   293: aload 20
    //   295: invokestatic 303	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   298: pop
    //   299: iconst_0
    //   300: istore 15
    //   302: goto -67 -> 235
    //   305: astore 13
    //   307: ldc_w 301
    //   310: ldc 76
    //   312: aload 13
    //   314: invokestatic 303	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   317: pop
    //   318: iconst_0
    //   319: istore 15
    //   321: goto -86 -> 235
    //   324: astore 9
    //   326: aconst_null
    //   327: astore 8
    //   329: aload 8
    //   331: ifnull +8 -> 339
    //   334: aload 8
    //   336: invokevirtual 296	java/io/BufferedInputStream:close	()V
    //   339: aload 4
    //   341: ifnull +8 -> 349
    //   344: aload 4
    //   346: invokevirtual 299	java/io/BufferedOutputStream:close	()V
    //   349: aload 9
    //   351: athrow
    //   352: astore 10
    //   354: ldc_w 301
    //   357: ldc 76
    //   359: aload 10
    //   361: invokestatic 303	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   364: pop
    //   365: goto -16 -> 349
    //   368: astore 9
    //   370: goto -41 -> 329
    //   373: astore 7
    //   375: aconst_null
    //   376: astore 4
    //   378: aconst_null
    //   379: astore 8
    //   381: goto -180 -> 201
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	384	0	paramBoolean	boolean
    //   0	384	1	paramContext	Context
    //   0	384	2	paramURL	URL
    //   0	384	3	paramString	String
    //   1	376	4	localObject1	Object
    //   7	22	5	arrayOfObject	Object[]
    //   199	8	7	localIOException1	IOException
    //   373	1	7	localIOException2	IOException
    //   63	317	8	localBufferedInputStream	BufferedInputStream
    //   324	26	9	localObject2	Object
    //   368	1	9	localObject3	Object
    //   352	8	10	localIOException3	IOException
    //   305	8	13	localIOException4	IOException
    //   233	87	15	bool1	boolean
    //   44	12	16	localJarURLConnection	java.net.JarURLConnection
    //   251	3	17	localBufferedOutputStream	BufferedOutputStream
    //   170	19	18	arrayOfByte	byte[]
    //   179	13	19	i	int
    //   286	8	20	localIOException5	IOException
    //   77	3	22	bool2	boolean
    //   122	18	23	localFile	File
    //   104	8	24	localIOException6	IOException
    // Exception table:
    //   from	to	target	type
    //   89	94	104	java/io/IOException
    //   98	102	104	java/io/IOException
    //   69	79	199	java/io/IOException
    //   119	165	199	java/io/IOException
    //   165	172	199	java/io/IOException
    //   172	181	199	java/io/IOException
    //   186	196	199	java/io/IOException
    //   238	253	199	java/io/IOException
    //   265	270	286	java/io/IOException
    //   275	280	286	java/io/IOException
    //   217	222	305	java/io/IOException
    //   227	232	305	java/io/IOException
    //   37	65	324	finally
    //   334	339	352	java/io/IOException
    //   344	349	352	java/io/IOException
    //   69	79	368	finally
    //   119	165	368	finally
    //   165	172	368	finally
    //   172	181	368	finally
    //   186	196	368	finally
    //   201	212	368	finally
    //   238	253	368	finally
    //   37	65	373	java/io/IOException
  }
  
  private static HttpURLConnection b(Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    URL localURL = new URL(paramString);
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    NetworkInfo localNetworkInfo1 = localConnectivityManager.getNetworkInfo(0);
    NetworkInfo localNetworkInfo2 = localConnectivityManager.getNetworkInfo(1);
    HttpURLConnection localHttpURLConnection;
    if ((localNetworkInfo2 != null) && (localNetworkInfo2.isAvailable()))
    {
      bk.b("", "WIFI is available");
      localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
    }
    for (;;)
    {
      localHttpURLConnection.setConnectTimeout(paramInt1);
      localHttpURLConnection.setReadTimeout(paramInt2);
      return localHttpURLConnection;
      if ((localNetworkInfo1 != null) && (localNetworkInfo1.isAvailable()))
      {
        String str1 = localNetworkInfo1.getExtraInfo();
        if (str1 != null) {}
        for (String str2 = str1.toLowerCase();; str2 = "")
        {
          bk.b("current APN", str2);
          if ((!str2.startsWith("cmwap")) && (!str2.startsWith("uniwap")) && (!str2.startsWith("3gwap"))) {
            break label182;
          }
          localHttpURLConnection = (HttpURLConnection)localURL.openConnection(a);
          break;
        }
        label182:
        if (str2.startsWith("ctwap")) {
          localHttpURLConnection = (HttpURLConnection)localURL.openConnection(b);
        } else {
          localHttpURLConnection = (HttpURLConnection)localURL.openConnection();
        }
      }
      else
      {
        localHttpURLConnection = null;
      }
    }
  }
  
  private static HttpURLConnection b(Context paramContext, URL paramURL)
  {
    return j(paramContext, paramURL.toString());
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    bk.b("AdUtil.delete", paramString);
    return paramContext.deleteFile(paramString);
  }
  
  public static boolean b(String paramString)
  {
    bk.b("AdUtil.deleteExt", paramString);
    if (!"mounted".equals(Environment.getExternalStorageState())) {}
    File localFile2;
    do
    {
      return false;
      File localFile1 = Environment.getExternalStorageDirectory();
      localFile2 = new File(localFile1 + File.separator + paramString);
    } while (!localFile2.exists());
    return localFile2.delete();
  }
  
  public static boolean b(boolean paramBoolean, Context paramContext, String paramString)
  {
    if (paramBoolean) {
      return b(paramString);
    }
    return b(paramContext, paramString);
  }
  
  public static boolean b(boolean paramBoolean, Context paramContext, URL paramURL, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = paramURL.toString();
    bk.b("AdUtil.save", String.format("[%s] %s", arrayOfObject));
    HttpURLConnection localHttpURLConnection = b(paramContext, paramURL);
    localHttpURLConnection.connect();
    BufferedInputStream localBufferedInputStream = new BufferedInputStream(localHttpURLConnection.getInputStream());
    File localFile;
    if (paramBoolean)
    {
      if (!"mounted".equals(Environment.getExternalStorageState())) {
        return false;
      }
      localFile = Environment.getExternalStorageDirectory();
    }
    for (BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(localFile + File.separator + paramString));; localBufferedOutputStream = new BufferedOutputStream(paramContext.openFileOutput(paramString, 0)))
    {
      byte[] arrayOfByte = new byte[5120];
      for (;;)
      {
        int i = localBufferedInputStream.read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        localBufferedOutputStream.write(arrayOfByte, 0, i);
      }
    }
    if (localBufferedInputStream != null) {
      localBufferedInputStream.close();
    }
    if (localBufferedOutputStream != null) {
      localBufferedOutputStream.close();
    }
    return true;
  }
  
  /* Error */
  public static String c(String paramString)
  {
    // Byte code:
    //   0: ldc_w 377
    //   3: aload_0
    //   4: invokestatic 52	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   7: pop
    //   8: invokestatic 238	android/os/Environment:getExternalStorageState	()Ljava/lang/String;
    //   11: astore_2
    //   12: ldc 233
    //   14: aload_2
    //   15: invokevirtual 242	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   18: ifne +20 -> 38
    //   21: ldc_w 379
    //   24: aload_2
    //   25: invokevirtual 242	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   28: ifne +10 -> 38
    //   31: ldc 76
    //   33: astore 5
    //   35: aload 5
    //   37: areturn
    //   38: invokestatic 246	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   41: astore_3
    //   42: new 248	java/io/File
    //   45: dup
    //   46: new 136	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 137	java/lang/StringBuilder:<init>	()V
    //   53: aload_3
    //   54: invokevirtual 251	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   57: getstatic 255	java/io/File:separator	Ljava/lang/String;
    //   60: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: aload_0
    //   64: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: invokevirtual 192	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokespecial 256	java/io/File:<init>	(Ljava/lang/String;)V
    //   73: astore 4
    //   75: ldc 76
    //   77: astore 5
    //   79: aload 4
    //   81: invokevirtual 260	java/io/File:exists	()Z
    //   84: ifeq -49 -> 35
    //   87: new 381	java/io/FileInputStream
    //   90: dup
    //   91: aload 4
    //   93: invokespecial 384	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   96: astore 6
    //   98: aload 6
    //   100: invokevirtual 387	java/io/FileInputStream:available	()I
    //   103: newarray byte
    //   105: astore 19
    //   107: aload 6
    //   109: aload 19
    //   111: invokevirtual 388	java/io/FileInputStream:read	([B)I
    //   114: pop
    //   115: new 112	java/lang/String
    //   118: dup
    //   119: aload 19
    //   121: ldc 114
    //   123: invokespecial 117	java/lang/String:<init>	([BLjava/lang/String;)V
    //   126: astore 12
    //   128: aload 6
    //   130: ifnull +8 -> 138
    //   133: aload 6
    //   135: invokevirtual 389	java/io/FileInputStream:close	()V
    //   138: aload 12
    //   140: areturn
    //   141: astore 21
    //   143: ldc 119
    //   145: ldc_w 377
    //   148: aload 21
    //   150: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   153: pop
    //   154: goto -16 -> 138
    //   157: astore 7
    //   159: aconst_null
    //   160: astore 6
    //   162: ldc 119
    //   164: ldc_w 377
    //   167: aload 7
    //   169: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   172: pop
    //   173: aload 6
    //   175: ifnull +8 -> 183
    //   178: aload 6
    //   180: invokevirtual 389	java/io/FileInputStream:close	()V
    //   183: aload 5
    //   185: astore 12
    //   187: goto -49 -> 138
    //   190: astore 13
    //   192: ldc 119
    //   194: ldc_w 377
    //   197: aload 13
    //   199: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   202: pop
    //   203: aload 5
    //   205: astore 12
    //   207: goto -69 -> 138
    //   210: astore 15
    //   212: aconst_null
    //   213: astore 6
    //   215: ldc 119
    //   217: ldc_w 377
    //   220: aload 15
    //   222: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   225: pop
    //   226: aload 6
    //   228: ifnull +8 -> 236
    //   231: aload 6
    //   233: invokevirtual 389	java/io/FileInputStream:close	()V
    //   236: aload 5
    //   238: astore 12
    //   240: goto -102 -> 138
    //   243: astore 17
    //   245: ldc 119
    //   247: ldc_w 377
    //   250: aload 17
    //   252: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   255: pop
    //   256: aload 5
    //   258: astore 12
    //   260: goto -122 -> 138
    //   263: astore 8
    //   265: aconst_null
    //   266: astore 6
    //   268: aload 6
    //   270: ifnull +8 -> 278
    //   273: aload 6
    //   275: invokevirtual 389	java/io/FileInputStream:close	()V
    //   278: aload 8
    //   280: athrow
    //   281: astore 9
    //   283: ldc 119
    //   285: ldc_w 377
    //   288: aload 9
    //   290: invokestatic 124	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   293: pop
    //   294: goto -16 -> 278
    //   297: astore 8
    //   299: goto -31 -> 268
    //   302: astore 15
    //   304: goto -89 -> 215
    //   307: astore 7
    //   309: goto -147 -> 162
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	312	0	paramString	String
    //   11	14	2	str1	String
    //   41	13	3	localFile1	File
    //   73	19	4	localFile2	File
    //   33	224	5	str2	String
    //   96	178	6	localFileInputStream	FileInputStream
    //   157	11	7	localFileNotFoundException1	java.io.FileNotFoundException
    //   307	1	7	localFileNotFoundException2	java.io.FileNotFoundException
    //   263	16	8	localObject1	Object
    //   297	1	8	localObject2	Object
    //   281	8	9	localIOException1	IOException
    //   126	133	12	str3	String
    //   190	8	13	localIOException2	IOException
    //   210	11	15	localIOException3	IOException
    //   302	1	15	localIOException4	IOException
    //   243	8	17	localIOException5	IOException
    //   105	15	19	arrayOfByte	byte[]
    //   141	8	21	localIOException6	IOException
    // Exception table:
    //   from	to	target	type
    //   133	138	141	java/io/IOException
    //   87	98	157	java/io/FileNotFoundException
    //   178	183	190	java/io/IOException
    //   87	98	210	java/io/IOException
    //   231	236	243	java/io/IOException
    //   87	98	263	finally
    //   273	278	281	java/io/IOException
    //   98	128	297	finally
    //   162	173	297	finally
    //   215	226	297	finally
    //   98	128	302	java/io/IOException
    //   98	128	307	java/io/FileNotFoundException
  }
  
  public static boolean c(Context paramContext, String paramString)
  {
    boolean bool = paramContext.getFileStreamPath(paramString).exists();
    bk.b("AdUtil.exists", bool + " " + paramString);
    return bool;
  }
  
  public static boolean c(boolean paramBoolean, Context paramContext, String paramString)
  {
    if (paramBoolean) {
      return a(paramString);
    }
    return c(paramContext, paramString);
  }
  
  /* Error */
  public static android.graphics.Bitmap d(boolean paramBoolean, Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc_w 405
    //   3: aload_2
    //   4: invokestatic 52	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   7: pop
    //   8: iload_0
    //   9: aload_1
    //   10: aload_2
    //   11: invokestatic 409	com/baidu/w:f	(ZLandroid/content/Context;Ljava/lang/String;)Ljava/io/FileInputStream;
    //   14: astore 11
    //   16: aload 11
    //   18: invokestatic 67	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   21: astore 12
    //   23: aload 12
    //   25: astore 5
    //   27: aload 11
    //   29: ifnull +8 -> 37
    //   32: aload 11
    //   34: invokevirtual 389	java/io/FileInputStream:close	()V
    //   37: aload 5
    //   39: areturn
    //   40: astore 8
    //   42: aconst_null
    //   43: astore 5
    //   45: aload 8
    //   47: astore 9
    //   49: ldc_w 405
    //   52: aload 9
    //   54: invokestatic 412	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   57: pop
    //   58: aload 5
    //   60: areturn
    //   61: astore 4
    //   63: aconst_null
    //   64: astore 5
    //   66: aload 4
    //   68: astore 6
    //   70: ldc_w 405
    //   73: aload 6
    //   75: invokestatic 412	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   78: pop
    //   79: aload 5
    //   81: areturn
    //   82: astore 6
    //   84: goto -14 -> 70
    //   87: astore 9
    //   89: goto -40 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	paramBoolean	boolean
    //   0	92	1	paramContext	Context
    //   0	92	2	paramString	String
    //   61	6	4	localException1	Exception
    //   25	55	5	localBitmap1	android.graphics.Bitmap
    //   68	6	6	localException2	Exception
    //   82	1	6	localException3	Exception
    //   40	6	8	localIOException1	IOException
    //   47	6	9	localIOException2	IOException
    //   87	1	9	localIOException3	IOException
    //   14	19	11	localFileInputStream	FileInputStream
    //   21	3	12	localBitmap2	android.graphics.Bitmap
    // Exception table:
    //   from	to	target	type
    //   8	23	40	java/io/IOException
    //   8	23	61	java/lang/Exception
    //   32	37	82	java/lang/Exception
    //   32	37	87	java/io/IOException
  }
  
  public static String d(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, 40000, 60000);
  }
  
  public static void d(String paramString)
  {
    bk.c("BaiduMobAds SDK", paramString);
    throw new SecurityException(paramString);
  }
  
  public static String e(String paramString)
  {
    return "__sdk_" + f(paramString);
  }
  
  public static void e(Context paramContext, String paramString)
  {
    paramContext.startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + paramString)));
  }
  
  public static byte[] e(boolean paramBoolean, Context paramContext, String paramString)
  {
    bk.b("AdUtil.getISFromFile", paramString);
    try
    {
      FileInputStream localFileInputStream = f(paramBoolean, paramContext, paramString);
      byte[] arrayOfByte = new byte[localFileInputStream.available()];
      localFileInputStream.read(arrayOfByte);
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      bk.b("AdUtil.getISFromFile", "", localIOException);
    }
    return null;
  }
  
  private static FileInputStream f(boolean paramBoolean, Context paramContext, String paramString)
  {
    bk.b("AdUtil.getISFromFile", paramString);
    if (paramBoolean) {}
    try
    {
      String str = Environment.getExternalStorageState();
      if ((!"mounted".equals(str)) && (!"mounted_ro".equals(str))) {
        return null;
      }
      File localFile = Environment.getExternalStorageDirectory();
      localObject = new FileInputStream(localFile + File.separator + paramString);
    }
    catch (IOException localIOException)
    {
      FileInputStream localFileInputStream;
      bk.b("AdUtil.getISFromFile", "", localIOException);
      localObject = null;
    }
    localFileInputStream = paramContext.openFileInput(paramString);
    Object localObject = localFileInputStream;
    return localObject;
  }
  
  public static String f(String paramString)
  {
    int i = 0;
    byte[] arrayOfByte1 = paramString.getBytes();
    char[] arrayOfChar1 = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(arrayOfByte1);
      byte[] arrayOfByte2 = localMessageDigest.digest();
      char[] arrayOfChar2 = new char[32];
      int j = 0;
      while (i < 16)
      {
        int k = arrayOfByte2[i];
        int m = j + 1;
        arrayOfChar2[j] = arrayOfChar1[(0xF & k >>> 4)];
        j = m + 1;
        arrayOfChar2[m] = arrayOfChar1[(k & 0xF)];
        i++;
      }
      String str = new String(arrayOfChar2);
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      bk.b("AdUtil.getMD5", "", localNoSuchAlgorithmException);
    }
    return null;
  }
  
  public static void f(Context paramContext, String paramString)
  {
    bk.b("AdUtil.browser", paramString);
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    localIntent.addFlags(268435456);
    try
    {
      paramContext.startActivity(localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      bk.b("BaiduMobAds SDK", "[failed] " + paramString, localActivityNotFoundException);
    }
  }
  
  public static void g(Context paramContext, String paramString)
  {
    if (!h(paramContext, paramString)) {
      d("Cannot request an ad without Internet permissions!  Open manifest.xml and just before the final </manifest> tag add:  <uses-permission android:name=\"" + paramString + "\" />");
    }
  }
  
  public static boolean h(Context paramContext, String paramString)
  {
    if (paramContext.checkCallingOrSelfPermission(paramString) != -1) {}
    for (boolean bool = true;; bool = false)
    {
      bk.b("hasPermission ", bool + " | " + paramString);
      return bool;
    }
  }
  
  /* Error */
  private static byte[] i(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: aload_1
    //   4: invokevirtual 455	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   7: astore 17
    //   9: aload 17
    //   11: ifnull +243 -> 254
    //   14: aload 17
    //   16: invokevirtual 387	java/io/FileInputStream:available	()I
    //   19: newarray byte
    //   21: astore 22
    //   23: aload 17
    //   25: aload 22
    //   27: invokevirtual 388	java/io/FileInputStream:read	([B)I
    //   30: pop
    //   31: aload 22
    //   33: astore 8
    //   35: aload 17
    //   37: ifnull +8 -> 45
    //   40: aload 17
    //   42: invokevirtual 389	java/io/FileInputStream:close	()V
    //   45: aload 8
    //   47: areturn
    //   48: astore 18
    //   50: ldc 119
    //   52: ldc_w 528
    //   55: aload 18
    //   57: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   60: pop
    //   61: aload 8
    //   63: areturn
    //   64: astore 12
    //   66: aload 12
    //   68: astore 13
    //   70: aconst_null
    //   71: astore 8
    //   73: ldc 119
    //   75: ldc_w 528
    //   78: aload 13
    //   80: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   83: pop
    //   84: aload_2
    //   85: ifnull -40 -> 45
    //   88: aload_2
    //   89: invokevirtual 389	java/io/FileInputStream:close	()V
    //   92: aload 8
    //   94: areturn
    //   95: astore 15
    //   97: ldc 119
    //   99: ldc_w 528
    //   102: aload 15
    //   104: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   107: pop
    //   108: aload 8
    //   110: areturn
    //   111: astore 6
    //   113: aload 6
    //   115: astore 7
    //   117: aconst_null
    //   118: astore 8
    //   120: ldc 119
    //   122: ldc_w 528
    //   125: aload 7
    //   127: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   130: pop
    //   131: aload_2
    //   132: ifnull -87 -> 45
    //   135: aload_2
    //   136: invokevirtual 389	java/io/FileInputStream:close	()V
    //   139: aload 8
    //   141: areturn
    //   142: astore 10
    //   144: ldc 119
    //   146: ldc_w 528
    //   149: aload 10
    //   151: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   154: pop
    //   155: aload 8
    //   157: areturn
    //   158: astore_3
    //   159: aload_2
    //   160: ifnull +7 -> 167
    //   163: aload_2
    //   164: invokevirtual 389	java/io/FileInputStream:close	()V
    //   167: aload_3
    //   168: athrow
    //   169: astore 4
    //   171: ldc 119
    //   173: ldc_w 528
    //   176: aload 4
    //   178: invokestatic 277	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   181: pop
    //   182: goto -15 -> 167
    //   185: astore_3
    //   186: aload 17
    //   188: astore_2
    //   189: goto -30 -> 159
    //   192: astore 21
    //   194: aload 17
    //   196: astore_2
    //   197: aload 21
    //   199: astore 7
    //   201: aconst_null
    //   202: astore 8
    //   204: goto -84 -> 120
    //   207: astore 24
    //   209: aload 22
    //   211: astore 8
    //   213: aload 17
    //   215: astore_2
    //   216: aload 24
    //   218: astore 7
    //   220: goto -100 -> 120
    //   223: astore 20
    //   225: aload 17
    //   227: astore_2
    //   228: aload 20
    //   230: astore 13
    //   232: aconst_null
    //   233: astore 8
    //   235: goto -162 -> 73
    //   238: astore 23
    //   240: aload 22
    //   242: astore 8
    //   244: aload 17
    //   246: astore_2
    //   247: aload 23
    //   249: astore 13
    //   251: goto -178 -> 73
    //   254: aconst_null
    //   255: astore 8
    //   257: goto -222 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	paramContext	Context
    //   0	260	1	paramString	String
    //   1	246	2	localObject1	Object
    //   158	10	3	localObject2	Object
    //   185	1	3	localObject3	Object
    //   169	8	4	localIOException1	IOException
    //   111	3	6	localIOException2	IOException
    //   115	104	7	localObject4	Object
    //   33	223	8	arrayOfByte1	byte[]
    //   142	8	10	localIOException3	IOException
    //   64	3	12	localFileNotFoundException1	java.io.FileNotFoundException
    //   68	182	13	localObject5	Object
    //   95	8	15	localIOException4	IOException
    //   7	238	17	localFileInputStream	FileInputStream
    //   48	8	18	localIOException5	IOException
    //   223	6	20	localFileNotFoundException2	java.io.FileNotFoundException
    //   192	6	21	localIOException6	IOException
    //   21	220	22	arrayOfByte2	byte[]
    //   238	10	23	localFileNotFoundException3	java.io.FileNotFoundException
    //   207	10	24	localIOException7	IOException
    // Exception table:
    //   from	to	target	type
    //   40	45	48	java/io/IOException
    //   2	9	64	java/io/FileNotFoundException
    //   88	92	95	java/io/IOException
    //   2	9	111	java/io/IOException
    //   135	139	142	java/io/IOException
    //   2	9	158	finally
    //   73	84	158	finally
    //   120	131	158	finally
    //   163	167	169	java/io/IOException
    //   14	23	185	finally
    //   23	31	185	finally
    //   14	23	192	java/io/IOException
    //   23	31	207	java/io/IOException
    //   14	23	223	java/io/FileNotFoundException
    //   23	31	238	java/io/FileNotFoundException
  }
  
  private static HttpURLConnection j(Context paramContext, String paramString)
  {
    return b(paramContext, paramString, 40000, 60000);
  }
  
  private static String k(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramString.indexOf('?');
    if (i >= 0) {
      paramString = paramString.substring(0, i);
    }
    URLConnection localURLConnection = new URL(paramString).openConnection();
    localURLConnection.connect();
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(localURLConnection.getInputStream()));
    for (;;)
    {
      String str = localBufferedReader.readLine();
      if (str == null) {
        break;
      }
      localStringBuilder.append(str);
    }
    if (localBufferedReader != null) {
      localBufferedReader.close();
    }
    return localStringBuilder.toString();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.w
 * JD-Core Version:    0.7.0.1
 */