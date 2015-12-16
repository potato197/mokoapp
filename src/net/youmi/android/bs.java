package net.youmi.android;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import java.io.File;

class bs
  extends AsyncTask
  implements ee
{
  private static Notification c;
  PendingIntent a;
  Context b;
  private String d;
  private String e;
  private long f = 0L;
  private long g = 0L;
  private dm h;
  
  bs(Context paramContext, dm paramdm)
  {
    this.b = paramContext;
    this.h = paramdm;
    Intent localIntent = new Intent();
    this.a = PendingIntent.getActivity(this.b, 99998, localIntent, 268435456);
    c = new Notification();
    c.icon = 17301633;
    c.setLatestEventInfo(this.b.getApplicationContext(), "下载更新", "开始下载", this.a);
  }
  
  private void a()
  {
    try
    {
      ((NotificationManager)this.b.getSystemService("notification")).notify(99998, c);
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  private void a(int paramInt)
  {
    try
    {
      c.tickerText = ("下载进度:" + paramInt + "%");
      c.flags = 2;
      c.setLatestEventInfo(this.b.getApplicationContext(), "下载更新", "下载进度:" + paramInt + "%", this.a);
      a();
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  /* Error */
  private void b(File paramFile)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +78 -> 79
    //   4: aload_1
    //   5: invokevirtual 126	java/io/File:exists	()Z
    //   8: istore_3
    //   9: iload_3
    //   10: ifeq +69 -> 79
    //   13: aload_0
    //   14: getfield 31	net/youmi/android/bs:b	Landroid/content/Context;
    //   17: ldc 74
    //   19: invokevirtual 78	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   22: checkcast 80	android/app/NotificationManager
    //   25: ldc 37
    //   27: invokevirtual 129	android/app/NotificationManager:cancel	(I)V
    //   30: aload_0
    //   31: getfield 31	net/youmi/android/bs:b	Landroid/content/Context;
    //   34: ldc 131
    //   36: invokestatic 136	net/youmi/android/ay:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   39: aload_0
    //   40: getfield 31	net/youmi/android/bs:b	Landroid/content/Context;
    //   43: aload_1
    //   44: aload_0
    //   45: getfield 33	net/youmi/android/bs:h	Lnet/youmi/android/dm;
    //   48: invokestatic 141	net/youmi/android/fd:a	(Landroid/content/Context;Ljava/io/File;Lnet/youmi/android/dm;)Z
    //   51: pop
    //   52: return
    //   53: astore 4
    //   55: aload 4
    //   57: invokestatic 89	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   60: goto -30 -> 30
    //   63: astore_2
    //   64: aload_2
    //   65: invokestatic 89	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   68: return
    //   69: astore 5
    //   71: aload 5
    //   73: invokestatic 89	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   76: goto -37 -> 39
    //   79: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	bs
    //   0	80	1	paramFile	File
    //   63	2	2	localException1	Exception
    //   8	2	3	bool	boolean
    //   53	3	4	localException2	Exception
    //   69	3	5	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   13	30	53	java/lang/Exception
    //   4	9	63	java/lang/Exception
    //   39	52	63	java/lang/Exception
    //   55	60	63	java/lang/Exception
    //   71	76	63	java/lang/Exception
    //   30	39	69	java/lang/Exception
  }
  
  private void b(String paramString)
  {
    try
    {
      c.tickerText = "下载更新失败";
      c.icon = 17301634;
      c.flags = 16;
      c.setLatestEventInfo(this.b.getApplicationContext(), "下载更新", paramString, this.a);
      a();
      ay.b(this.b, "更新失败,请稍候重试!");
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        f.a(localException);
      }
    }
  }
  
  /* Error */
  protected File a(String... paramVarArgs)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 31	net/youmi/android/bs:b	Landroid/content/Context;
    //   6: ifnonnull +26 -> 32
    //   9: iconst_1
    //   10: anewarray 151	java/lang/Integer
    //   13: astore 44
    //   15: aload 44
    //   17: iconst_0
    //   18: bipush 253
    //   20: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   23: aastore
    //   24: aload_0
    //   25: aload 44
    //   27: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   30: aconst_null
    //   31: areturn
    //   32: aload_1
    //   33: ifnonnull +26 -> 59
    //   36: iconst_1
    //   37: anewarray 151	java/lang/Integer
    //   40: astore 43
    //   42: aload 43
    //   44: iconst_0
    //   45: bipush 253
    //   47: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   50: aastore
    //   51: aload_0
    //   52: aload 43
    //   54: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   57: aconst_null
    //   58: areturn
    //   59: aload_0
    //   60: getfield 33	net/youmi/android/bs:h	Lnet/youmi/android/dm;
    //   63: ifnonnull +26 -> 89
    //   66: iconst_1
    //   67: anewarray 151	java/lang/Integer
    //   70: astore 42
    //   72: aload 42
    //   74: iconst_0
    //   75: bipush 253
    //   77: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   80: aastore
    //   81: aload_0
    //   82: aload 42
    //   84: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   87: aconst_null
    //   88: areturn
    //   89: aload_0
    //   90: getfield 31	net/youmi/android/bs:b	Landroid/content/Context;
    //   93: invokestatic 164	net/youmi/android/dq:b	(Landroid/content/Context;)Z
    //   96: ifne +26 -> 122
    //   99: iconst_1
    //   100: anewarray 151	java/lang/Integer
    //   103: astore 41
    //   105: aload 41
    //   107: iconst_0
    //   108: bipush 253
    //   110: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   113: aastore
    //   114: aload_0
    //   115: aload 41
    //   117: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   120: aconst_null
    //   121: areturn
    //   122: aload_0
    //   123: getfield 31	net/youmi/android/bs:b	Landroid/content/Context;
    //   126: invokestatic 168	net/youmi/android/az:a	(Landroid/content/Context;)Z
    //   129: ifne +25 -> 154
    //   132: iconst_1
    //   133: anewarray 151	java/lang/Integer
    //   136: astore 40
    //   138: aload 40
    //   140: iconst_0
    //   141: iconst_m1
    //   142: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   145: aastore
    //   146: aload_0
    //   147: aload 40
    //   149: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   152: aconst_null
    //   153: areturn
    //   154: aload_0
    //   155: getfield 31	net/youmi/android/bs:b	Landroid/content/Context;
    //   158: invokestatic 170	net/youmi/android/dq:c	(Landroid/content/Context;)Z
    //   161: ifne +26 -> 187
    //   164: iconst_1
    //   165: anewarray 151	java/lang/Integer
    //   168: astore 39
    //   170: aload 39
    //   172: iconst_0
    //   173: bipush 253
    //   175: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   178: aastore
    //   179: aload_0
    //   180: aload 39
    //   182: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   185: aconst_null
    //   186: areturn
    //   187: aload_0
    //   188: getfield 31	net/youmi/android/bs:b	Landroid/content/Context;
    //   191: invokestatic 173	net/youmi/android/s:b	(Landroid/content/Context;)Z
    //   194: ifne +26 -> 220
    //   197: iconst_1
    //   198: anewarray 151	java/lang/Integer
    //   201: astore 38
    //   203: aload 38
    //   205: iconst_0
    //   206: bipush 254
    //   208: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   211: aastore
    //   212: aload_0
    //   213: aload 38
    //   215: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   218: aconst_null
    //   219: areturn
    //   220: aload_1
    //   221: arraylength
    //   222: ifle -192 -> 30
    //   225: aload_0
    //   226: aload_1
    //   227: iconst_0
    //   228: aaload
    //   229: putfield 175	net/youmi/android/bs:d	Ljava/lang/String;
    //   232: aload_0
    //   233: aload_0
    //   234: getfield 175	net/youmi/android/bs:d	Ljava/lang/String;
    //   237: putfield 177	net/youmi/android/bs:e	Ljava/lang/String;
    //   240: iconst_1
    //   241: anewarray 151	java/lang/Integer
    //   244: astore 14
    //   246: aload 14
    //   248: iconst_0
    //   249: bipush 252
    //   251: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   254: aastore
    //   255: aload_0
    //   256: aload 14
    //   258: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   261: aload_0
    //   262: getfield 33	net/youmi/android/bs:h	Lnet/youmi/android/dm;
    //   265: getfield 181	net/youmi/android/dm:c	Ljava/lang/String;
    //   268: invokestatic 186	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   271: astore 15
    //   273: new 122	java/io/File
    //   276: dup
    //   277: invokestatic 191	net/youmi/android/bc:e	()Lnet/youmi/android/ed;
    //   280: aload 15
    //   282: invokevirtual 195	net/youmi/android/ed:a	(Ljava/lang/String;)Ljava/lang/String;
    //   285: invokespecial 196	java/io/File:<init>	(Ljava/lang/String;)V
    //   288: astore 16
    //   290: aload 16
    //   292: invokevirtual 126	java/io/File:exists	()Z
    //   295: ifeq +15 -> 310
    //   298: aload 16
    //   300: invokevirtual 199	java/io/File:delete	()Z
    //   303: istore 37
    //   305: iload 37
    //   307: ifeq +3 -> 310
    //   310: aload_0
    //   311: getfield 31	net/youmi/android/bs:b	Landroid/content/Context;
    //   314: aload_0
    //   315: invokestatic 202	net/youmi/android/s:a	(Landroid/content/Context;Lnet/youmi/android/ee;)Lorg/apache/http/impl/client/DefaultHttpClient;
    //   318: astore 18
    //   320: aload 18
    //   322: astore 6
    //   324: aload 6
    //   326: new 204	org/apache/http/client/methods/HttpGet
    //   329: dup
    //   330: aload_0
    //   331: getfield 175	net/youmi/android/bs:d	Ljava/lang/String;
    //   334: invokespecial 205	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   337: invokevirtual 211	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   340: astore 21
    //   342: aload 21
    //   344: invokeinterface 217 1 0
    //   349: invokeinterface 223 1 0
    //   354: sipush 200
    //   357: if_icmpne +322 -> 679
    //   360: aload 21
    //   362: invokeinterface 227 1 0
    //   367: astore 24
    //   369: aload 24
    //   371: ifnull +308 -> 679
    //   374: aload_0
    //   375: aload 24
    //   377: invokeinterface 233 1 0
    //   382: putfield 27	net/youmi/android/bs:f	J
    //   385: new 235	java/io/FileOutputStream
    //   388: dup
    //   389: aload 16
    //   391: invokespecial 237	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   394: astore 25
    //   396: aload 24
    //   398: invokeinterface 241 1 0
    //   403: astore 26
    //   405: aload 26
    //   407: astore 5
    //   409: sipush 1024
    //   412: newarray byte
    //   414: astore 28
    //   416: aload 5
    //   418: aload 28
    //   420: invokevirtual 247	java/io/InputStream:read	([B)I
    //   423: istore 29
    //   425: iload 29
    //   427: ifgt +85 -> 512
    //   430: aload 25
    //   432: invokevirtual 250	java/io/FileOutputStream:close	()V
    //   435: aload 6
    //   437: ifnull +13 -> 450
    //   440: aload 6
    //   442: invokevirtual 254	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   445: invokeinterface 259 1 0
    //   450: aload 5
    //   452: ifnull +8 -> 460
    //   455: aload 5
    //   457: invokevirtual 260	java/io/InputStream:close	()V
    //   460: aload 16
    //   462: areturn
    //   463: astore 17
    //   465: aload 17
    //   467: invokestatic 89	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   470: goto -160 -> 310
    //   473: astore 9
    //   475: aconst_null
    //   476: astore 10
    //   478: aconst_null
    //   479: astore 11
    //   481: aload 11
    //   483: ifnull +13 -> 496
    //   486: aload 11
    //   488: invokevirtual 254	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   491: invokeinterface 259 1 0
    //   496: aload 10
    //   498: ifnull -468 -> 30
    //   501: aload 10
    //   503: invokevirtual 260	java/io/InputStream:close	()V
    //   506: aconst_null
    //   507: areturn
    //   508: astore 12
    //   510: aconst_null
    //   511: areturn
    //   512: aload 25
    //   514: aload 28
    //   516: iconst_0
    //   517: iload 29
    //   519: invokevirtual 264	java/io/FileOutputStream:write	([BII)V
    //   522: iinc 2 1
    //   525: aload_0
    //   526: aload_0
    //   527: getfield 29	net/youmi/android/bs:g	J
    //   530: iload 29
    //   532: i2l
    //   533: ladd
    //   534: putfield 29	net/youmi/android/bs:g	J
    //   537: iload_2
    //   538: bipush 30
    //   540: irem
    //   541: ifne -125 -> 416
    //   544: aload_0
    //   545: getfield 27	net/youmi/android/bs:f	J
    //   548: lconst_0
    //   549: lcmp
    //   550: ifle +105 -> 655
    //   553: aload_0
    //   554: getfield 29	net/youmi/android/bs:g	J
    //   557: aload_0
    //   558: getfield 27	net/youmi/android/bs:f	J
    //   561: lcmp
    //   562: ifge +39 -> 601
    //   565: iconst_1
    //   566: anewarray 151	java/lang/Integer
    //   569: astore 33
    //   571: aload 33
    //   573: iconst_0
    //   574: ldc2_w 265
    //   577: aload_0
    //   578: getfield 29	net/youmi/android/bs:g	J
    //   581: lmul
    //   582: aload_0
    //   583: getfield 27	net/youmi/android/bs:f	J
    //   586: ldiv
    //   587: l2i
    //   588: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   591: aastore
    //   592: aload_0
    //   593: aload 33
    //   595: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   598: goto -182 -> 416
    //   601: iconst_1
    //   602: anewarray 151	java/lang/Integer
    //   605: astore 32
    //   607: aload 32
    //   609: iconst_0
    //   610: bipush 99
    //   612: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   615: aastore
    //   616: aload_0
    //   617: aload 32
    //   619: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   622: goto -206 -> 416
    //   625: astore 4
    //   627: aload 6
    //   629: ifnull +13 -> 642
    //   632: aload 6
    //   634: invokevirtual 254	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   637: invokeinterface 259 1 0
    //   642: aload 5
    //   644: ifnull +8 -> 652
    //   647: aload 5
    //   649: invokevirtual 260	java/io/InputStream:close	()V
    //   652: aload 4
    //   654: athrow
    //   655: iconst_1
    //   656: anewarray 151	java/lang/Integer
    //   659: astore 31
    //   661: aload 31
    //   663: iconst_0
    //   664: bipush 80
    //   666: invokestatic 155	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   669: aastore
    //   670: aload_0
    //   671: aload 31
    //   673: invokevirtual 159	net/youmi/android/bs:publishProgress	([Ljava/lang/Object;)V
    //   676: goto -260 -> 416
    //   679: aload 6
    //   681: ifnull +13 -> 694
    //   684: aload 6
    //   686: invokevirtual 254	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   689: invokeinterface 259 1 0
    //   694: iconst_0
    //   695: ifeq -665 -> 30
    //   698: aconst_null
    //   699: invokevirtual 260	java/io/InputStream:close	()V
    //   702: aconst_null
    //   703: areturn
    //   704: astore 22
    //   706: aconst_null
    //   707: areturn
    //   708: astore 34
    //   710: goto -275 -> 435
    //   713: astore 35
    //   715: goto -255 -> 460
    //   718: astore 7
    //   720: goto -68 -> 652
    //   723: astore 23
    //   725: goto -31 -> 694
    //   728: astore 8
    //   730: goto -88 -> 642
    //   733: astore_3
    //   734: aload_3
    //   735: astore 4
    //   737: aconst_null
    //   738: astore 5
    //   740: aconst_null
    //   741: astore 6
    //   743: goto -116 -> 627
    //   746: astore 20
    //   748: aload 20
    //   750: astore 4
    //   752: aconst_null
    //   753: astore 5
    //   755: goto -128 -> 627
    //   758: astore 13
    //   760: goto -264 -> 496
    //   763: astore 19
    //   765: aload 6
    //   767: astore 11
    //   769: aconst_null
    //   770: astore 10
    //   772: goto -291 -> 481
    //   775: astore 27
    //   777: aload 5
    //   779: astore 10
    //   781: aload 6
    //   783: astore 11
    //   785: goto -304 -> 481
    //   788: astore 36
    //   790: goto -340 -> 450
    //   793: astore 30
    //   795: goto -379 -> 416
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	798	0	this	bs
    //   0	798	1	paramVarArgs	String[]
    //   1	540	2	i	int
    //   733	2	3	localObject1	java.lang.Object
    //   625	28	4	localObject2	java.lang.Object
    //   735	16	4	localObject3	java.lang.Object
    //   407	371	5	localInputStream1	java.io.InputStream
    //   322	460	6	localDefaultHttpClient1	org.apache.http.impl.client.DefaultHttpClient
    //   718	1	7	localException1	Exception
    //   728	1	8	localException2	Exception
    //   473	1	9	localException3	Exception
    //   476	304	10	localInputStream2	java.io.InputStream
    //   479	305	11	localDefaultHttpClient2	org.apache.http.impl.client.DefaultHttpClient
    //   508	1	12	localException4	Exception
    //   758	1	13	localException5	Exception
    //   244	13	14	arrayOfInteger1	Integer[]
    //   271	10	15	str	String
    //   288	173	16	localFile	File
    //   463	3	17	localException6	Exception
    //   318	3	18	localDefaultHttpClient3	org.apache.http.impl.client.DefaultHttpClient
    //   763	1	19	localException7	Exception
    //   746	3	20	localObject4	java.lang.Object
    //   340	21	21	localHttpResponse	org.apache.http.HttpResponse
    //   704	1	22	localException8	Exception
    //   723	1	23	localException9	Exception
    //   367	30	24	localHttpEntity	org.apache.http.HttpEntity
    //   394	119	25	localFileOutputStream	java.io.FileOutputStream
    //   403	3	26	localInputStream3	java.io.InputStream
    //   775	1	27	localException10	Exception
    //   414	101	28	arrayOfByte	byte[]
    //   423	108	29	j	int
    //   793	1	30	localException11	Exception
    //   659	13	31	arrayOfInteger2	Integer[]
    //   605	13	32	arrayOfInteger3	Integer[]
    //   569	25	33	arrayOfInteger4	Integer[]
    //   708	1	34	localException12	Exception
    //   713	1	35	localException13	Exception
    //   788	1	36	localException14	Exception
    //   303	3	37	bool	boolean
    //   201	13	38	arrayOfInteger5	Integer[]
    //   168	13	39	arrayOfInteger6	Integer[]
    //   136	12	40	arrayOfInteger7	Integer[]
    //   103	13	41	arrayOfInteger8	Integer[]
    //   70	13	42	arrayOfInteger9	Integer[]
    //   40	13	43	arrayOfInteger10	Integer[]
    //   13	13	44	arrayOfInteger11	Integer[]
    // Exception table:
    //   from	to	target	type
    //   290	305	463	java/lang/Exception
    //   240	290	473	java/lang/Exception
    //   310	320	473	java/lang/Exception
    //   465	470	473	java/lang/Exception
    //   501	506	508	java/lang/Exception
    //   409	416	625	finally
    //   416	425	625	finally
    //   430	435	625	finally
    //   512	522	625	finally
    //   525	537	625	finally
    //   544	598	625	finally
    //   601	622	625	finally
    //   655	676	625	finally
    //   698	702	704	java/lang/Exception
    //   430	435	708	java/lang/Exception
    //   455	460	713	java/lang/Exception
    //   647	652	718	java/lang/Exception
    //   684	694	723	java/lang/Exception
    //   632	642	728	java/lang/Exception
    //   240	290	733	finally
    //   290	305	733	finally
    //   310	320	733	finally
    //   465	470	733	finally
    //   324	369	746	finally
    //   374	405	746	finally
    //   486	496	758	java/lang/Exception
    //   324	369	763	java/lang/Exception
    //   374	405	763	java/lang/Exception
    //   409	416	775	java/lang/Exception
    //   416	425	775	java/lang/Exception
    //   512	522	775	java/lang/Exception
    //   525	537	775	java/lang/Exception
    //   440	450	788	java/lang/Exception
    //   544	598	793	java/lang/Exception
    //   601	622	793	java/lang/Exception
    //   655	676	793	java/lang/Exception
  }
  
  protected void a(File paramFile)
  {
    super.onPostExecute(paramFile);
    if ((paramFile != null) && (paramFile.exists()))
    {
      b(paramFile);
      return;
    }
    b("更新失败,请稍候重试");
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  protected void a(Integer... paramVarArgs)
  {
    super.onProgressUpdate(paramVarArgs);
    if (paramVarArgs != null)
    {
      int i;
      try
      {
        if (paramVarArgs.length <= 0) {
          return;
        }
        i = paramVarArgs[0].intValue();
        if (i == -1)
        {
          b("存储卡不可用,无法更新下载,请检查存储卡设置!");
          return;
        }
        if (i == -2)
        {
          b("网络错误,无法更新下载");
          return;
        }
      }
      catch (Exception localException)
      {
        f.a(localException);
        return;
      }
      if (i == -3)
      {
        b("下载过程遇到错误,取消本次下载");
        return;
      }
      if (i == -4)
      {
        a(0);
        return;
      }
      if ((i >= 0) && (i <= 100)) {
        a(i);
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.bs
 * JD-Core Version:    0.7.0.1
 */