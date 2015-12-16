package net.youmi.android;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

class i
  extends AsyncTask
  implements ee
{
  protected Context a;
  protected String b;
  protected String c;
  protected eb d;
  protected long e;
  protected String f;
  protected File g;
  private String h;
  private String i;
  private long j = 0L;
  private long k = 0L;
  private int l = -1;
  
  i(Context paramContext, eb parameb)
  {
    this.a = paramContext;
    this.d = parameb;
  }
  
  i(Context paramContext, eb parameb, String paramString)
  {
    this.a = paramContext;
    this.d = parameb;
    this.i = paramString;
  }
  
  /* Error */
  private int a(org.apache.http.HttpEntity paramHttpEntity)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 47	java/lang/Integer
    //   4: astore 12
    //   6: aload 12
    //   8: iconst_0
    //   9: bipush 60
    //   11: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   14: aastore
    //   15: aload_0
    //   16: aload 12
    //   18: invokevirtual 55	net/youmi/android/i:publishProgress	([Ljava/lang/Object;)V
    //   21: aload_1
    //   22: invokeinterface 61 1 0
    //   27: astore 13
    //   29: aload 13
    //   31: astore 6
    //   33: aload_0
    //   34: getfield 63	net/youmi/android/i:e	J
    //   37: lconst_0
    //   38: lcmp
    //   39: ifle +221 -> 260
    //   42: aload_0
    //   43: getfield 63	net/youmi/android/i:e	J
    //   46: l2i
    //   47: istore 14
    //   49: new 65	java/io/ByteArrayOutputStream
    //   52: dup
    //   53: iload 14
    //   55: invokespecial 68	java/io/ByteArrayOutputStream:<init>	(I)V
    //   58: astore 7
    //   60: sipush 1024
    //   63: newarray byte
    //   65: astore 15
    //   67: aload 6
    //   69: aload 15
    //   71: invokevirtual 74	java/io/InputStream:read	([B)I
    //   74: istore 16
    //   76: iload 16
    //   78: ifgt +190 -> 268
    //   81: aload 7
    //   83: invokevirtual 78	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   86: astore 17
    //   88: aload_0
    //   89: new 80	java/lang/String
    //   92: dup
    //   93: aload 17
    //   95: ldc 82
    //   97: invokespecial 85	java/lang/String:<init>	([BLjava/lang/String;)V
    //   100: putfield 87	net/youmi/android/i:h	Ljava/lang/String;
    //   103: aload_0
    //   104: getfield 87	net/youmi/android/i:h	Ljava/lang/String;
    //   107: astore 18
    //   109: aload 18
    //   111: ifnull +52 -> 163
    //   114: aload_0
    //   115: getfield 87	net/youmi/android/i:h	Ljava/lang/String;
    //   118: invokestatic 92	net/youmi/android/cv:c	(Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 27
    //   123: aload 27
    //   125: ifnull +38 -> 163
    //   128: aload 27
    //   130: invokevirtual 96	java/lang/String:trim	()Ljava/lang/String;
    //   133: invokevirtual 99	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   136: astore 28
    //   138: aload 28
    //   140: ldc 82
    //   142: invokevirtual 103	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   145: ifne +18 -> 163
    //   148: aload_0
    //   149: new 80	java/lang/String
    //   152: dup
    //   153: aload 17
    //   155: aload 28
    //   157: invokespecial 85	java/lang/String:<init>	([BLjava/lang/String;)V
    //   160: putfield 87	net/youmi/android/i:h	Ljava/lang/String;
    //   163: aload_0
    //   164: getfield 87	net/youmi/android/i:h	Ljava/lang/String;
    //   167: ifnull +240 -> 407
    //   170: iconst_1
    //   171: anewarray 47	java/lang/Integer
    //   174: astore 21
    //   176: aload 21
    //   178: iconst_0
    //   179: bipush 95
    //   181: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   184: aastore
    //   185: aload_0
    //   186: aload 21
    //   188: invokevirtual 55	net/youmi/android/i:publishProgress	([Ljava/lang/Object;)V
    //   191: aload_0
    //   192: aload_0
    //   193: getfield 105	net/youmi/android/i:c	Ljava/lang/String;
    //   196: aload_0
    //   197: getfield 87	net/youmi/android/i:h	Ljava/lang/String;
    //   200: invokestatic 110	net/youmi/android/ba:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   203: putfield 87	net/youmi/android/i:h	Ljava/lang/String;
    //   206: iconst_1
    //   207: anewarray 47	java/lang/Integer
    //   210: astore 22
    //   212: aload 22
    //   214: iconst_0
    //   215: bipush 100
    //   217: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   220: aastore
    //   221: aload_0
    //   222: aload 22
    //   224: invokevirtual 55	net/youmi/android/i:publishProgress	([Ljava/lang/Object;)V
    //   227: aload_0
    //   228: getfield 87	net/youmi/android/i:h	Ljava/lang/String;
    //   231: astore 23
    //   233: aload 23
    //   235: ifnull +172 -> 407
    //   238: aload 6
    //   240: ifnull +8 -> 248
    //   243: aload 6
    //   245: invokevirtual 113	java/io/InputStream:close	()V
    //   248: aload 7
    //   250: ifnull +8 -> 258
    //   253: aload 7
    //   255: invokevirtual 114	java/io/ByteArrayOutputStream:close	()V
    //   258: iconst_1
    //   259: ireturn
    //   260: sipush 2048
    //   263: istore 14
    //   265: goto -216 -> 49
    //   268: aload 7
    //   270: aload 15
    //   272: iconst_0
    //   273: iload 16
    //   275: invokevirtual 118	java/io/ByteArrayOutputStream:write	([BII)V
    //   278: goto -211 -> 67
    //   281: astore_2
    //   282: aload 7
    //   284: astore_3
    //   285: aload 6
    //   287: astore 4
    //   289: aload_2
    //   290: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   293: aload 4
    //   295: ifnull +8 -> 303
    //   298: aload 4
    //   300: invokevirtual 113	java/io/InputStream:close	()V
    //   303: aload_3
    //   304: ifnull +7 -> 311
    //   307: aload_3
    //   308: invokevirtual 114	java/io/ByteArrayOutputStream:close	()V
    //   311: iconst_0
    //   312: ireturn
    //   313: astore 26
    //   315: aload 26
    //   317: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   320: goto -157 -> 163
    //   323: astore 5
    //   325: aload 6
    //   327: ifnull +8 -> 335
    //   330: aload 6
    //   332: invokevirtual 113	java/io/InputStream:close	()V
    //   335: aload 7
    //   337: ifnull +8 -> 345
    //   340: aload 7
    //   342: invokevirtual 114	java/io/ByteArrayOutputStream:close	()V
    //   345: aload 5
    //   347: athrow
    //   348: astore 25
    //   350: aload 25
    //   352: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   355: goto -107 -> 248
    //   358: astore 24
    //   360: aload 24
    //   362: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   365: iconst_1
    //   366: ireturn
    //   367: astore 11
    //   369: aload 11
    //   371: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   374: goto -71 -> 303
    //   377: astore 10
    //   379: aload 10
    //   381: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   384: goto -73 -> 311
    //   387: astore 9
    //   389: aload 9
    //   391: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   394: goto -59 -> 335
    //   397: astore 8
    //   399: aload 8
    //   401: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   404: goto -59 -> 345
    //   407: aload 6
    //   409: ifnull +8 -> 417
    //   412: aload 6
    //   414: invokevirtual 113	java/io/InputStream:close	()V
    //   417: aload 7
    //   419: ifnull -108 -> 311
    //   422: aload 7
    //   424: invokevirtual 114	java/io/ByteArrayOutputStream:close	()V
    //   427: goto -116 -> 311
    //   430: astore 19
    //   432: aload 19
    //   434: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   437: goto -126 -> 311
    //   440: astore 20
    //   442: aload 20
    //   444: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   447: goto -30 -> 417
    //   450: astore 5
    //   452: aconst_null
    //   453: astore 7
    //   455: aconst_null
    //   456: astore 6
    //   458: goto -133 -> 325
    //   461: astore 5
    //   463: aconst_null
    //   464: astore 7
    //   466: goto -141 -> 325
    //   469: astore 5
    //   471: aload 4
    //   473: astore 6
    //   475: aload_3
    //   476: astore 7
    //   478: goto -153 -> 325
    //   481: astore_2
    //   482: aconst_null
    //   483: astore_3
    //   484: aconst_null
    //   485: astore 4
    //   487: goto -198 -> 289
    //   490: astore_2
    //   491: aload 6
    //   493: astore 4
    //   495: aconst_null
    //   496: astore_3
    //   497: goto -208 -> 289
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	500	0	this	i
    //   0	500	1	paramHttpEntity	org.apache.http.HttpEntity
    //   281	9	2	localException1	Exception
    //   481	1	2	localException2	Exception
    //   490	1	2	localException3	Exception
    //   284	213	3	localObject1	java.lang.Object
    //   287	207	4	localObject2	java.lang.Object
    //   323	23	5	localObject3	java.lang.Object
    //   450	1	5	localObject4	java.lang.Object
    //   461	1	5	localObject5	java.lang.Object
    //   469	1	5	localObject6	java.lang.Object
    //   31	461	6	localObject7	java.lang.Object
    //   58	419	7	localObject8	java.lang.Object
    //   397	3	8	localException4	Exception
    //   387	3	9	localException5	Exception
    //   377	3	10	localException6	Exception
    //   367	3	11	localException7	Exception
    //   4	13	12	arrayOfInteger1	Integer[]
    //   27	3	13	localInputStream	java.io.InputStream
    //   47	217	14	m	int
    //   65	206	15	arrayOfByte1	byte[]
    //   74	200	16	n	int
    //   86	68	17	arrayOfByte2	byte[]
    //   107	3	18	str1	String
    //   430	3	19	localException8	Exception
    //   440	3	20	localException9	Exception
    //   174	13	21	arrayOfInteger2	Integer[]
    //   210	13	22	arrayOfInteger3	Integer[]
    //   231	3	23	str2	String
    //   358	3	24	localException10	Exception
    //   348	3	25	localException11	Exception
    //   313	3	26	localException12	Exception
    //   121	8	27	str3	String
    //   136	20	28	str4	String
    // Exception table:
    //   from	to	target	type
    //   60	67	281	java/lang/Exception
    //   67	76	281	java/lang/Exception
    //   81	109	281	java/lang/Exception
    //   163	233	281	java/lang/Exception
    //   268	278	281	java/lang/Exception
    //   315	320	281	java/lang/Exception
    //   114	123	313	java/lang/Exception
    //   128	163	313	java/lang/Exception
    //   60	67	323	finally
    //   67	76	323	finally
    //   81	109	323	finally
    //   114	123	323	finally
    //   128	163	323	finally
    //   163	233	323	finally
    //   268	278	323	finally
    //   315	320	323	finally
    //   243	248	348	java/lang/Exception
    //   253	258	358	java/lang/Exception
    //   298	303	367	java/lang/Exception
    //   307	311	377	java/lang/Exception
    //   330	335	387	java/lang/Exception
    //   340	345	397	java/lang/Exception
    //   422	427	430	java/lang/Exception
    //   412	417	440	java/lang/Exception
    //   0	29	450	finally
    //   33	49	461	finally
    //   49	60	461	finally
    //   289	293	469	finally
    //   0	29	481	java/lang/Exception
    //   33	49	490	java/lang/Exception
    //   49	60	490	java/lang/Exception
  }
  
  /* Error */
  private int a(HttpResponse paramHttpResponse, org.apache.http.HttpEntity paramHttpEntity)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 37	net/youmi/android/i:a	Landroid/content/Context;
    //   4: invokestatic 129	net/youmi/android/az:a	(Landroid/content/Context;)Z
    //   7: ifne +9 -> 16
    //   10: iconst_4
    //   11: istore 4
    //   13: iload 4
    //   15: ireturn
    //   16: aload_0
    //   17: aload_1
    //   18: invokespecial 132	net/youmi/android/i:a	(Lorg/apache/http/HttpResponse;)Z
    //   21: istore_3
    //   22: iconst_0
    //   23: istore 4
    //   25: iload_3
    //   26: ifeq -13 -> 13
    //   29: aload_0
    //   30: invokespecial 135	net/youmi/android/i:f	()Z
    //   33: ifeq +5 -> 38
    //   36: iconst_3
    //   37: ireturn
    //   38: invokestatic 140	net/youmi/android/r:a	()Ljava/util/ArrayList;
    //   41: astore 38
    //   43: aload 38
    //   45: ifnull +20 -> 65
    //   48: iconst_0
    //   49: istore 39
    //   51: aload 38
    //   53: invokevirtual 146	java/util/ArrayList:size	()I
    //   56: istore 40
    //   58: iload 39
    //   60: iload 40
    //   62: if_icmplt +201 -> 263
    //   65: iconst_1
    //   66: anewarray 47	java/lang/Integer
    //   69: astore 14
    //   71: aload 14
    //   73: iconst_0
    //   74: sipush -999
    //   77: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   80: aastore
    //   81: aload_0
    //   82: aload 14
    //   84: invokevirtual 55	net/youmi/android/i:publishProgress	([Ljava/lang/Object;)V
    //   87: aload_0
    //   88: getfield 148	net/youmi/android/i:f	Ljava/lang/String;
    //   91: aload_0
    //   92: getfield 63	net/youmi/android/i:e	J
    //   95: invokestatic 151	net/youmi/android/r:a	(Ljava/lang/String;J)Lnet/youmi/android/ci;
    //   98: astore 15
    //   100: aload 15
    //   102: ifnull +753 -> 855
    //   105: aload_2
    //   106: invokeinterface 61 1 0
    //   111: astore 29
    //   113: aload 29
    //   115: astore 8
    //   117: aconst_null
    //   118: astore 7
    //   120: aload 8
    //   122: ifnull +510 -> 632
    //   125: sipush 1024
    //   128: newarray byte
    //   130: astore 30
    //   132: new 153	java/io/FileOutputStream
    //   135: dup
    //   136: aload 15
    //   138: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   141: invokespecial 160	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   144: astore 24
    //   146: aload 8
    //   148: aload 30
    //   150: invokevirtual 74	java/io/InputStream:read	([B)I
    //   153: istore 31
    //   155: iload 31
    //   157: ifgt +204 -> 361
    //   160: aload 24
    //   162: invokevirtual 161	java/io/FileOutputStream:close	()V
    //   165: aconst_null
    //   166: astore 24
    //   168: aload 15
    //   170: invokestatic 164	net/youmi/android/r:b	(Lnet/youmi/android/ci;)Lnet/youmi/android/m;
    //   173: astore 33
    //   175: aload 33
    //   177: ifnull +451 -> 628
    //   180: aload 33
    //   182: getfield 167	net/youmi/android/m:c	Ljava/io/File;
    //   185: ifnull +443 -> 628
    //   188: aload 33
    //   190: getfield 167	net/youmi/android/m:c	Ljava/io/File;
    //   193: invokevirtual 172	java/io/File:exists	()Z
    //   196: ifeq +432 -> 628
    //   199: aload_0
    //   200: aload 33
    //   202: getfield 167	net/youmi/android/m:c	Ljava/io/File;
    //   205: putfield 174	net/youmi/android/i:g	Ljava/io/File;
    //   208: aload 15
    //   210: ifnull +31 -> 241
    //   213: aload 15
    //   215: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   218: ifnull +23 -> 241
    //   221: aload 15
    //   223: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   226: invokevirtual 172	java/io/File:exists	()Z
    //   229: ifeq +12 -> 241
    //   232: aload 15
    //   234: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   237: invokevirtual 177	java/io/File:delete	()Z
    //   240: pop
    //   241: aload 8
    //   243: ifnull +8 -> 251
    //   246: aload 8
    //   248: invokevirtual 113	java/io/InputStream:close	()V
    //   251: aload 24
    //   253: ifnull +8 -> 261
    //   256: aload 24
    //   258: invokevirtual 161	java/io/FileOutputStream:close	()V
    //   261: iconst_1
    //   262: ireturn
    //   263: aload 38
    //   265: iload 39
    //   267: invokevirtual 181	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   270: checkcast 155	net/youmi/android/ci
    //   273: astore 41
    //   275: aload 41
    //   277: getfield 183	net/youmi/android/ci:a	Ljava/lang/String;
    //   280: aload_0
    //   281: getfield 148	net/youmi/android/i:f	Ljava/lang/String;
    //   284: invokevirtual 103	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   287: ifeq +46 -> 333
    //   290: aload 41
    //   292: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   295: ifnull +38 -> 333
    //   298: invokestatic 189	java/lang/System:currentTimeMillis	()J
    //   301: lstore 42
    //   303: aload 41
    //   305: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   308: invokevirtual 192	java/io/File:lastModified	()J
    //   311: lstore 44
    //   313: lload 42
    //   315: lload 44
    //   317: lsub
    //   318: ldc2_w 193
    //   321: lcmp
    //   322: ifle +37 -> 359
    //   325: aload 41
    //   327: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   330: invokevirtual 197	java/io/File:deleteOnExit	()V
    //   333: iinc 39 1
    //   336: goto -285 -> 51
    //   339: astore 46
    //   341: aload 46
    //   343: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   346: goto -13 -> 333
    //   349: astore 5
    //   351: aload 5
    //   353: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   356: goto -291 -> 65
    //   359: iconst_2
    //   360: ireturn
    //   361: aload 24
    //   363: aload 30
    //   365: iconst_0
    //   366: iload 31
    //   368: invokevirtual 198	java/io/FileOutputStream:write	([BII)V
    //   371: goto -225 -> 146
    //   374: astore 22
    //   376: aload 24
    //   378: astore 16
    //   380: aload 8
    //   382: astore 17
    //   384: aload 22
    //   386: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   389: aload 15
    //   391: ifnull +31 -> 422
    //   394: aload 15
    //   396: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   399: ifnull +23 -> 422
    //   402: aload 15
    //   404: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   407: invokevirtual 172	java/io/File:exists	()Z
    //   410: ifeq +12 -> 422
    //   413: aload 15
    //   415: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   418: invokevirtual 177	java/io/File:delete	()Z
    //   421: pop
    //   422: aload 17
    //   424: ifnull +8 -> 432
    //   427: aload 17
    //   429: invokevirtual 113	java/io/InputStream:close	()V
    //   432: aload 16
    //   434: ifnull +8 -> 442
    //   437: aload 16
    //   439: invokevirtual 161	java/io/FileOutputStream:close	()V
    //   442: iconst_5
    //   443: ireturn
    //   444: astore 32
    //   446: aload 32
    //   448: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   451: goto -283 -> 168
    //   454: astore 23
    //   456: aload 15
    //   458: ifnull +31 -> 489
    //   461: aload 15
    //   463: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   466: ifnull +23 -> 489
    //   469: aload 15
    //   471: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   474: invokevirtual 172	java/io/File:exists	()Z
    //   477: ifeq +12 -> 489
    //   480: aload 15
    //   482: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   485: invokevirtual 177	java/io/File:delete	()Z
    //   488: pop
    //   489: aload 23
    //   491: athrow
    //   492: astore 6
    //   494: aload 24
    //   496: astore 7
    //   498: aload 6
    //   500: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   503: aload 8
    //   505: ifnull +8 -> 513
    //   508: aload 8
    //   510: invokevirtual 113	java/io/InputStream:close	()V
    //   513: aload 7
    //   515: ifnull -73 -> 442
    //   518: aload 7
    //   520: invokevirtual 161	java/io/FileOutputStream:close	()V
    //   523: goto -81 -> 442
    //   526: astore 12
    //   528: aload 12
    //   530: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   533: goto -91 -> 442
    //   536: astore 36
    //   538: aload 36
    //   540: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   543: goto -302 -> 241
    //   546: astore 9
    //   548: aload 24
    //   550: astore 7
    //   552: aload 8
    //   554: ifnull +8 -> 562
    //   557: aload 8
    //   559: invokevirtual 113	java/io/InputStream:close	()V
    //   562: aload 7
    //   564: ifnull +8 -> 572
    //   567: aload 7
    //   569: invokevirtual 161	java/io/FileOutputStream:close	()V
    //   572: aload 9
    //   574: athrow
    //   575: astore 35
    //   577: aload 35
    //   579: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   582: goto -331 -> 251
    //   585: astore 34
    //   587: aload 34
    //   589: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   592: goto -331 -> 261
    //   595: astore 27
    //   597: aload 27
    //   599: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   602: goto -180 -> 422
    //   605: astore 6
    //   607: aload 17
    //   609: astore 8
    //   611: aload 16
    //   613: astore 7
    //   615: goto -117 -> 498
    //   618: astore 25
    //   620: aload 25
    //   622: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   625: goto -136 -> 489
    //   628: aload 24
    //   630: astore 7
    //   632: aload 15
    //   634: ifnull +210 -> 844
    //   637: aload 15
    //   639: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   642: ifnull +202 -> 844
    //   645: aload 15
    //   647: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   650: invokevirtual 172	java/io/File:exists	()Z
    //   653: ifeq +191 -> 844
    //   656: aload 15
    //   658: getfield 157	net/youmi/android/ci:c	Ljava/io/File;
    //   661: invokevirtual 177	java/io/File:delete	()Z
    //   664: pop
    //   665: aload 7
    //   667: astore 16
    //   669: aload 8
    //   671: astore 17
    //   673: goto -251 -> 422
    //   676: astore 20
    //   678: aload 20
    //   680: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   683: aload 7
    //   685: astore 16
    //   687: aload 8
    //   689: astore 17
    //   691: goto -269 -> 422
    //   694: astore 13
    //   696: aload 13
    //   698: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   701: goto -188 -> 513
    //   704: astore 11
    //   706: aload 11
    //   708: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   711: goto -149 -> 562
    //   714: astore 10
    //   716: aload 10
    //   718: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   721: goto -149 -> 572
    //   724: astore 19
    //   726: aload 19
    //   728: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   731: goto -299 -> 432
    //   734: astore 18
    //   736: aload 18
    //   738: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   741: goto -299 -> 442
    //   744: astore 9
    //   746: aconst_null
    //   747: astore 7
    //   749: aconst_null
    //   750: astore 8
    //   752: goto -200 -> 552
    //   755: astore 9
    //   757: aload 17
    //   759: astore 8
    //   761: aload 16
    //   763: astore 7
    //   765: goto -213 -> 552
    //   768: astore 9
    //   770: goto -218 -> 552
    //   773: astore 6
    //   775: aconst_null
    //   776: astore 7
    //   778: aconst_null
    //   779: astore 8
    //   781: goto -283 -> 498
    //   784: astore 6
    //   786: goto -288 -> 498
    //   789: astore 23
    //   791: aconst_null
    //   792: astore 24
    //   794: aconst_null
    //   795: astore 8
    //   797: goto -341 -> 456
    //   800: astore 23
    //   802: aconst_null
    //   803: astore 24
    //   805: goto -349 -> 456
    //   808: astore 23
    //   810: aload 16
    //   812: astore 24
    //   814: aload 17
    //   816: astore 8
    //   818: goto -362 -> 456
    //   821: astore 22
    //   823: aconst_null
    //   824: astore 16
    //   826: aconst_null
    //   827: astore 17
    //   829: goto -445 -> 384
    //   832: astore 22
    //   834: aload 8
    //   836: astore 17
    //   838: aconst_null
    //   839: astore 16
    //   841: goto -457 -> 384
    //   844: aload 7
    //   846: astore 16
    //   848: aload 8
    //   850: astore 17
    //   852: goto -430 -> 422
    //   855: aconst_null
    //   856: astore 7
    //   858: aconst_null
    //   859: astore 8
    //   861: goto -229 -> 632
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	864	0	this	i
    //   0	864	1	paramHttpResponse	HttpResponse
    //   0	864	2	paramHttpEntity	org.apache.http.HttpEntity
    //   21	5	3	bool	boolean
    //   11	13	4	m	int
    //   349	3	5	localException1	Exception
    //   492	7	6	localException2	Exception
    //   605	1	6	localException3	Exception
    //   773	1	6	localException4	Exception
    //   784	1	6	localException5	Exception
    //   118	739	7	localObject1	java.lang.Object
    //   115	745	8	localObject2	java.lang.Object
    //   546	27	9	localObject3	java.lang.Object
    //   744	1	9	localObject4	java.lang.Object
    //   755	1	9	localObject5	java.lang.Object
    //   768	1	9	localObject6	java.lang.Object
    //   714	3	10	localException6	Exception
    //   704	3	11	localException7	Exception
    //   526	3	12	localException8	Exception
    //   694	3	13	localException9	Exception
    //   69	14	14	arrayOfInteger	Integer[]
    //   98	559	15	localci1	ci
    //   378	469	16	localObject7	java.lang.Object
    //   382	469	17	localObject8	java.lang.Object
    //   734	3	18	localException10	Exception
    //   724	3	19	localException11	Exception
    //   676	3	20	localException12	Exception
    //   374	11	22	localException13	Exception
    //   821	1	22	localException14	Exception
    //   832	1	22	localException15	Exception
    //   454	36	23	localObject9	java.lang.Object
    //   789	1	23	localObject10	java.lang.Object
    //   800	1	23	localObject11	java.lang.Object
    //   808	1	23	localObject12	java.lang.Object
    //   144	669	24	localObject13	java.lang.Object
    //   618	3	25	localException16	Exception
    //   595	3	27	localException17	Exception
    //   111	3	29	localInputStream	java.io.InputStream
    //   130	234	30	arrayOfByte	byte[]
    //   153	214	31	n	int
    //   444	3	32	localException18	Exception
    //   173	28	33	localm	m
    //   585	3	34	localException19	Exception
    //   575	3	35	localException20	Exception
    //   536	3	36	localException21	Exception
    //   41	223	38	localArrayList	ArrayList
    //   49	285	39	i1	int
    //   56	7	40	i2	int
    //   273	53	41	localci2	ci
    //   301	13	42	l1	long
    //   311	5	44	l2	long
    //   339	3	46	localException22	Exception
    // Exception table:
    //   from	to	target	type
    //   325	333	339	java/lang/Exception
    //   38	43	349	java/lang/Exception
    //   51	58	349	java/lang/Exception
    //   263	313	349	java/lang/Exception
    //   341	346	349	java/lang/Exception
    //   146	155	374	java/lang/Exception
    //   168	175	374	java/lang/Exception
    //   180	208	374	java/lang/Exception
    //   361	371	374	java/lang/Exception
    //   446	451	374	java/lang/Exception
    //   160	165	444	java/lang/Exception
    //   146	155	454	finally
    //   160	165	454	finally
    //   168	175	454	finally
    //   180	208	454	finally
    //   361	371	454	finally
    //   446	451	454	finally
    //   489	492	492	java/lang/Exception
    //   538	543	492	java/lang/Exception
    //   620	625	492	java/lang/Exception
    //   518	523	526	java/lang/Exception
    //   213	241	536	java/lang/Exception
    //   213	241	546	finally
    //   461	489	546	finally
    //   489	492	546	finally
    //   538	543	546	finally
    //   620	625	546	finally
    //   246	251	575	java/lang/Exception
    //   256	261	585	java/lang/Exception
    //   394	422	595	java/lang/Exception
    //   597	602	605	java/lang/Exception
    //   461	489	618	java/lang/Exception
    //   637	665	676	java/lang/Exception
    //   508	513	694	java/lang/Exception
    //   557	562	704	java/lang/Exception
    //   567	572	714	java/lang/Exception
    //   427	432	724	java/lang/Exception
    //   437	442	734	java/lang/Exception
    //   65	100	744	finally
    //   394	422	755	finally
    //   597	602	755	finally
    //   498	503	768	finally
    //   637	665	768	finally
    //   678	683	768	finally
    //   65	100	773	java/lang/Exception
    //   678	683	784	java/lang/Exception
    //   105	113	789	finally
    //   125	146	800	finally
    //   384	389	808	finally
    //   105	113	821	java/lang/Exception
    //   125	146	832	java/lang/Exception
  }
  
  private boolean a(HttpResponse paramHttpResponse)
  {
    try
    {
      Header[] arrayOfHeader = paramHttpResponse.getHeaders("Content-Disposition");
      if ((arrayOfHeader != null) && (arrayOfHeader.length > 0)) {}
      for (int m = 0;; m++)
      {
        if (m >= arrayOfHeader.length) {}
        do
        {
          if (this.f == null) {
            this.f = cv.b(this.c);
          }
          if (this.f == null) {
            break label124;
          }
          return true;
          Header localHeader = arrayOfHeader[m];
          if (localHeader == null) {
            break;
          }
          this.f = cv.a(localHeader.getValue());
          if (this.f == null) {
            break;
          }
          this.f = this.f.trim();
        } while (this.f.length() > 0);
        this.f = null;
      }
      return false;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  private boolean f()
  {
    for (;;)
    {
      try
      {
        localArrayList = r.b();
        if (localArrayList != null)
        {
          m = 0;
          int n = localArrayList.size();
          if (m < n) {
            continue;
          }
        }
      }
      catch (Exception localException1)
      {
        ArrayList localArrayList;
        int m;
        m localm;
        f.a(localException1);
        continue;
        try
        {
          localm.c.delete();
        }
        catch (Exception localException3)
        {
          f.a(localException3);
        }
        continue;
      }
      return false;
      try
      {
        localm = (m)localArrayList.get(m);
        if (localm.d.equals(this.f))
        {
          if (!r.a(localm)) {
            continue;
          }
          if (ef.a(this.a, localm.c.getPath()) != null)
          {
            this.g = localm.c;
            return true;
          }
        }
      }
      catch (Exception localException2)
      {
        f.a(localException2);
        continue;
      }
      try
      {
        localm.c.delete();
        m++;
      }
      catch (Exception localException4)
      {
        f.a(localException4);
      }
    }
  }
  
  /* Error */
  protected Integer a(String... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 189	java/lang/System:currentTimeMillis	()J
    //   4: putfield 31	net/youmi/android/i:j	J
    //   7: aload_0
    //   8: getfield 39	net/youmi/android/i:d	Lnet/youmi/android/eb;
    //   11: ifnonnull +12 -> 23
    //   14: iconst_0
    //   15: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   18: astore 16
    //   20: aload 16
    //   22: areturn
    //   23: aload_0
    //   24: getfield 37	net/youmi/android/i:a	Landroid/content/Context;
    //   27: ifnonnull +8 -> 35
    //   30: iconst_0
    //   31: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   34: areturn
    //   35: aload_1
    //   36: ifnonnull +8 -> 44
    //   39: iconst_0
    //   40: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: areturn
    //   44: aload_1
    //   45: arraylength
    //   46: ifle +719 -> 765
    //   49: aload_0
    //   50: aload_1
    //   51: iconst_0
    //   52: aaload
    //   53: putfield 236	net/youmi/android/i:b	Ljava/lang/String;
    //   56: aload_0
    //   57: aload_0
    //   58: getfield 236	net/youmi/android/i:b	Ljava/lang/String;
    //   61: putfield 105	net/youmi/android/i:c	Ljava/lang/String;
    //   64: aload_0
    //   65: getfield 37	net/youmi/android/i:a	Landroid/content/Context;
    //   68: invokestatic 240	net/youmi/android/dq:c	(Landroid/content/Context;)Z
    //   71: ifne +8 -> 79
    //   74: iconst_0
    //   75: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   78: areturn
    //   79: aload_0
    //   80: getfield 37	net/youmi/android/i:a	Landroid/content/Context;
    //   83: invokestatic 244	net/youmi/android/s:b	(Landroid/content/Context;)Z
    //   86: ifne +8 -> 94
    //   89: iconst_0
    //   90: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   93: areturn
    //   94: aconst_null
    //   95: astore_2
    //   96: aload_0
    //   97: getfield 37	net/youmi/android/i:a	Landroid/content/Context;
    //   100: aload_0
    //   101: invokestatic 247	net/youmi/android/s:a	(Landroid/content/Context;Lnet/youmi/android/ee;)Lorg/apache/http/impl/client/DefaultHttpClient;
    //   104: astore_2
    //   105: new 249	org/apache/http/client/methods/HttpGet
    //   108: dup
    //   109: aload_0
    //   110: getfield 236	net/youmi/android/i:b	Ljava/lang/String;
    //   113: invokespecial 252	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   116: astore 7
    //   118: iconst_1
    //   119: anewarray 47	java/lang/Integer
    //   122: astore 8
    //   124: aload 8
    //   126: iconst_0
    //   127: bipush 35
    //   129: invokestatic 257	net/youmi/android/bn:a	(I)I
    //   132: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   135: aastore
    //   136: aload_0
    //   137: aload 8
    //   139: invokevirtual 55	net/youmi/android/i:publishProgress	([Ljava/lang/Object;)V
    //   142: aload_2
    //   143: aload 7
    //   145: invokevirtual 263	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   148: astore 9
    //   150: iconst_1
    //   151: anewarray 47	java/lang/Integer
    //   154: astore 10
    //   156: aload 10
    //   158: iconst_0
    //   159: bipush 35
    //   161: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   164: aastore
    //   165: aload_0
    //   166: aload 10
    //   168: invokevirtual 55	net/youmi/android/i:publishProgress	([Ljava/lang/Object;)V
    //   171: aload 9
    //   173: invokeinterface 267 1 0
    //   178: invokeinterface 272 1 0
    //   183: sipush 200
    //   186: if_icmpne +620 -> 806
    //   189: iconst_1
    //   190: anewarray 47	java/lang/Integer
    //   193: astore 12
    //   195: aload 12
    //   197: iconst_0
    //   198: bipush 38
    //   200: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   203: aastore
    //   204: aload_0
    //   205: aload 12
    //   207: invokevirtual 55	net/youmi/android/i:publishProgress	([Ljava/lang/Object;)V
    //   210: aload 9
    //   212: invokeinterface 276 1 0
    //   217: astore 13
    //   219: aload 13
    //   221: ifnull +585 -> 806
    //   224: aload_0
    //   225: aload 13
    //   227: invokeinterface 279 1 0
    //   232: putfield 63	net/youmi/android/i:e	J
    //   235: aload 13
    //   237: invokeinterface 283 1 0
    //   242: astore 14
    //   244: aload 14
    //   246: ifnonnull +39 -> 285
    //   249: iconst_0
    //   250: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   253: astore 15
    //   255: aload 15
    //   257: astore 16
    //   259: aload_2
    //   260: ifnull -240 -> 20
    //   263: aload_2
    //   264: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   267: invokeinterface 292 1 0
    //   272: aload 16
    //   274: areturn
    //   275: astore 17
    //   277: aload 17
    //   279: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   282: aload 16
    //   284: areturn
    //   285: aload 14
    //   287: invokeinterface 213 1 0
    //   292: astore 18
    //   294: aload 18
    //   296: ifnonnull +39 -> 335
    //   299: iconst_0
    //   300: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   303: astore 19
    //   305: aload 19
    //   307: astore 16
    //   309: aload_2
    //   310: ifnull -290 -> 20
    //   313: aload_2
    //   314: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   317: invokeinterface 292 1 0
    //   322: aload 16
    //   324: areturn
    //   325: astore 20
    //   327: aload 20
    //   329: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   332: aload 16
    //   334: areturn
    //   335: aload 18
    //   337: invokevirtual 96	java/lang/String:trim	()Ljava/lang/String;
    //   340: invokevirtual 99	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   343: astore 21
    //   345: aload 21
    //   347: ldc_w 294
    //   350: invokevirtual 298	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   353: iconst_m1
    //   354: if_icmple +51 -> 405
    //   357: aload_0
    //   358: iconst_1
    //   359: putfield 35	net/youmi/android/i:l	I
    //   362: aload_0
    //   363: aload 9
    //   365: aload 13
    //   367: invokespecial 300	net/youmi/android/i:a	(Lorg/apache/http/HttpResponse;Lorg/apache/http/HttpEntity;)I
    //   370: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   373: astore 34
    //   375: aload 34
    //   377: astore 16
    //   379: aload_2
    //   380: ifnull -360 -> 20
    //   383: aload_2
    //   384: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   387: invokeinterface 292 1 0
    //   392: aload 16
    //   394: areturn
    //   395: astore 35
    //   397: aload 35
    //   399: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   402: aload 16
    //   404: areturn
    //   405: aload 21
    //   407: ldc_w 302
    //   410: invokevirtual 298	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   413: iconst_m1
    //   414: if_icmple +51 -> 465
    //   417: aload_0
    //   418: iconst_1
    //   419: putfield 35	net/youmi/android/i:l	I
    //   422: aload_0
    //   423: aload 9
    //   425: aload 13
    //   427: invokespecial 300	net/youmi/android/i:a	(Lorg/apache/http/HttpResponse;Lorg/apache/http/HttpEntity;)I
    //   430: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   433: astore 32
    //   435: aload 32
    //   437: astore 16
    //   439: aload_2
    //   440: ifnull -420 -> 20
    //   443: aload_2
    //   444: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   447: invokeinterface 292 1 0
    //   452: aload 16
    //   454: areturn
    //   455: astore 33
    //   457: aload 33
    //   459: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   462: aload 16
    //   464: areturn
    //   465: aload 21
    //   467: ldc_w 304
    //   470: invokevirtual 298	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   473: iconst_m1
    //   474: if_icmple +49 -> 523
    //   477: aload_0
    //   478: iconst_0
    //   479: putfield 35	net/youmi/android/i:l	I
    //   482: aload_0
    //   483: aload 13
    //   485: invokespecial 306	net/youmi/android/i:a	(Lorg/apache/http/HttpEntity;)I
    //   488: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   491: astore 30
    //   493: aload 30
    //   495: astore 16
    //   497: aload_2
    //   498: ifnull -478 -> 20
    //   501: aload_2
    //   502: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   505: invokeinterface 292 1 0
    //   510: aload 16
    //   512: areturn
    //   513: astore 31
    //   515: aload 31
    //   517: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   520: aload 16
    //   522: areturn
    //   523: aload 21
    //   525: ldc_w 308
    //   528: invokevirtual 298	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   531: iconst_m1
    //   532: if_icmple +49 -> 581
    //   535: aload_0
    //   536: iconst_0
    //   537: putfield 35	net/youmi/android/i:l	I
    //   540: aload_0
    //   541: aload 13
    //   543: invokespecial 306	net/youmi/android/i:a	(Lorg/apache/http/HttpEntity;)I
    //   546: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   549: astore 28
    //   551: aload 28
    //   553: astore 16
    //   555: aload_2
    //   556: ifnull -536 -> 20
    //   559: aload_2
    //   560: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   563: invokeinterface 292 1 0
    //   568: aload 16
    //   570: areturn
    //   571: astore 29
    //   573: aload 29
    //   575: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   578: aload 16
    //   580: areturn
    //   581: aload 21
    //   583: ldc_w 310
    //   586: invokevirtual 298	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   589: iconst_m1
    //   590: if_icmple +49 -> 639
    //   593: aload_0
    //   594: iconst_0
    //   595: putfield 35	net/youmi/android/i:l	I
    //   598: aload_0
    //   599: aload 13
    //   601: invokespecial 306	net/youmi/android/i:a	(Lorg/apache/http/HttpEntity;)I
    //   604: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   607: astore 26
    //   609: aload 26
    //   611: astore 16
    //   613: aload_2
    //   614: ifnull -594 -> 20
    //   617: aload_2
    //   618: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   621: invokeinterface 292 1 0
    //   626: aload 16
    //   628: areturn
    //   629: astore 27
    //   631: aload 27
    //   633: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   636: aload 16
    //   638: areturn
    //   639: aload 21
    //   641: ldc_w 312
    //   644: invokevirtual 298	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   647: iconst_m1
    //   648: if_icmple +49 -> 697
    //   651: aload_0
    //   652: iconst_0
    //   653: putfield 35	net/youmi/android/i:l	I
    //   656: aload_0
    //   657: aload 13
    //   659: invokespecial 306	net/youmi/android/i:a	(Lorg/apache/http/HttpEntity;)I
    //   662: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   665: astore 24
    //   667: aload 24
    //   669: astore 16
    //   671: aload_2
    //   672: ifnull -652 -> 20
    //   675: aload_2
    //   676: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   679: invokeinterface 292 1 0
    //   684: aload 16
    //   686: areturn
    //   687: astore 25
    //   689: aload 25
    //   691: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   694: aload 16
    //   696: areturn
    //   697: aload_0
    //   698: iconst_m1
    //   699: putfield 35	net/youmi/android/i:l	I
    //   702: aload 7
    //   704: invokeinterface 317 1 0
    //   709: iconst_0
    //   710: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   713: astore 22
    //   715: aload 22
    //   717: astore 16
    //   719: aload_2
    //   720: ifnull -700 -> 20
    //   723: aload_2
    //   724: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   727: invokeinterface 292 1 0
    //   732: aload 16
    //   734: areturn
    //   735: astore 23
    //   737: aload 23
    //   739: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   742: aload 16
    //   744: areturn
    //   745: astore 5
    //   747: aload 5
    //   749: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   752: aload_2
    //   753: ifnull +12 -> 765
    //   756: aload_2
    //   757: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   760: invokeinterface 292 1 0
    //   765: iconst_0
    //   766: invokestatic 51	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   769: areturn
    //   770: astore 6
    //   772: aload 6
    //   774: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   777: goto -12 -> 765
    //   780: astore_3
    //   781: aload_2
    //   782: ifnull +12 -> 794
    //   785: aload_2
    //   786: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   789: invokeinterface 292 1 0
    //   794: aload_3
    //   795: athrow
    //   796: astore 4
    //   798: aload 4
    //   800: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   803: goto -9 -> 794
    //   806: aload_2
    //   807: ifnull -42 -> 765
    //   810: aload_2
    //   811: invokevirtual 287	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   814: invokeinterface 292 1 0
    //   819: goto -54 -> 765
    //   822: astore 11
    //   824: aload 11
    //   826: invokestatic 123	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   829: goto -64 -> 765
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	832	0	this	i
    //   0	832	1	paramVarArgs	String[]
    //   95	716	2	localDefaultHttpClient	org.apache.http.impl.client.DefaultHttpClient
    //   780	15	3	localObject1	java.lang.Object
    //   796	3	4	localException1	Exception
    //   745	3	5	localException2	Exception
    //   770	3	6	localException3	Exception
    //   116	587	7	localHttpGet	org.apache.http.client.methods.HttpGet
    //   122	16	8	arrayOfInteger1	Integer[]
    //   148	276	9	localHttpResponse	HttpResponse
    //   154	13	10	arrayOfInteger2	Integer[]
    //   822	3	11	localException4	Exception
    //   193	13	12	arrayOfInteger3	Integer[]
    //   217	441	13	localHttpEntity	org.apache.http.HttpEntity
    //   242	44	14	localHeader	Header
    //   253	3	15	localInteger1	Integer
    //   18	725	16	localObject2	java.lang.Object
    //   275	3	17	localException5	Exception
    //   292	44	18	str1	String
    //   303	3	19	localInteger2	Integer
    //   325	3	20	localException6	Exception
    //   343	297	21	str2	String
    //   713	3	22	localInteger3	Integer
    //   735	3	23	localException7	Exception
    //   665	3	24	localInteger4	Integer
    //   687	3	25	localException8	Exception
    //   607	3	26	localInteger5	Integer
    //   629	3	27	localException9	Exception
    //   549	3	28	localInteger6	Integer
    //   571	3	29	localException10	Exception
    //   491	3	30	localInteger7	Integer
    //   513	3	31	localException11	Exception
    //   433	3	32	localInteger8	Integer
    //   455	3	33	localException12	Exception
    //   373	3	34	localInteger9	Integer
    //   395	3	35	localException13	Exception
    // Exception table:
    //   from	to	target	type
    //   263	272	275	java/lang/Exception
    //   313	322	325	java/lang/Exception
    //   383	392	395	java/lang/Exception
    //   443	452	455	java/lang/Exception
    //   501	510	513	java/lang/Exception
    //   559	568	571	java/lang/Exception
    //   617	626	629	java/lang/Exception
    //   675	684	687	java/lang/Exception
    //   723	732	735	java/lang/Exception
    //   96	219	745	java/lang/Exception
    //   224	244	745	java/lang/Exception
    //   249	255	745	java/lang/Exception
    //   285	294	745	java/lang/Exception
    //   299	305	745	java/lang/Exception
    //   335	375	745	java/lang/Exception
    //   405	435	745	java/lang/Exception
    //   465	493	745	java/lang/Exception
    //   523	551	745	java/lang/Exception
    //   581	609	745	java/lang/Exception
    //   639	667	745	java/lang/Exception
    //   697	715	745	java/lang/Exception
    //   756	765	770	java/lang/Exception
    //   96	219	780	finally
    //   224	244	780	finally
    //   249	255	780	finally
    //   285	294	780	finally
    //   299	305	780	finally
    //   335	375	780	finally
    //   405	435	780	finally
    //   465	493	780	finally
    //   523	551	780	finally
    //   581	609	780	finally
    //   639	667	780	finally
    //   697	715	780	finally
    //   747	752	780	finally
    //   785	794	796	java/lang/Exception
    //   810	819	822	java/lang/Exception
  }
  
  String a()
  {
    return this.b;
  }
  
  protected void a(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
    this.k = System.currentTimeMillis();
    try
    {
      if (this.d != null)
      {
        int m = this.l;
        switch (m)
        {
        }
      }
    }
    catch (Exception localException1)
    {
      em localem;
      f.a(localException1);
      return;
    }
    try
    {
      this.d.e();
      return;
    }
    catch (Exception localException11)
    {
      int n;
      f.a(localException11);
      return;
    }
    if (this.h != null)
    {
      localem = new em(this.c, this.h);
      try
      {
        this.d.a(this, localem);
        return;
      }
      catch (Exception localException9)
      {
        f.a(localException9);
        return;
      }
    }
    try
    {
      this.d.e();
      return;
    }
    catch (Exception localException10)
    {
      f.a(localException10);
      return;
    }
    n = paramInteger.intValue();
    switch (n)
    {
    default: 
      try
      {
        this.d.e();
        return;
      }
      catch (Exception localException8)
      {
        f.a(localException8);
        return;
      }
    case 1: 
      if (this.g == null) {
        break label344;
      }
      boolean bool2 = this.g.exists();
      if (!bool2) {
        break label344;
      }
      try
      {
        this.d.a(this, this.g, this.f);
        return;
      }
      catch (Exception localException7)
      {
        f.a(localException7);
        return;
      }
    case 2: 
      try
      {
        this.d.f();
        return;
      }
      catch (Exception localException6)
      {
        f.a(localException6);
        return;
      }
    case 3: 
      if (this.g == null) {
        break label344;
      }
      boolean bool1 = this.g.exists();
      if (!bool1) {
        break label344;
      }
      try
      {
        this.d.b(this, this.g, this.f);
        return;
      }
      catch (Exception localException5)
      {
        f.a(localException5);
        return;
      }
    case 4: 
      try
      {
        this.d.g();
        return;
      }
      catch (Exception localException3)
      {
        f.a(localException3);
        return;
      }
    }
    try
    {
      this.d.h();
      return;
    }
    catch (Exception localException2)
    {
      f.a(localException2);
      return;
    }
    try
    {
      label344:
      this.d.e();
      return;
    }
    catch (Exception localException4)
    {
      f.a(localException4);
    }
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  protected void a(Integer... paramVarArgs)
  {
    super.onProgressUpdate(paramVarArgs);
    try
    {
      if ((this.d != null) && (paramVarArgs.length > 0))
      {
        int m = paramVarArgs[0].intValue();
        if (m >= 0)
        {
          this.d.a(m);
          return;
        }
        if (this.l == 1)
        {
          this.d.a(this);
          return;
        }
      }
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  String b()
  {
    return this.c;
  }
  
  String c()
  {
    return this.i;
  }
  
  long d()
  {
    return this.k - this.j;
  }
  
  long e()
  {
    return this.j;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.i
 * JD-Core Version:    0.7.0.1
 */