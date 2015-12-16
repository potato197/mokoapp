package net.youmi.android;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.impl.client.DefaultHttpClient;

class dw
  extends AsyncTask
  implements ee
{
  private Context a;
  private DefaultHttpClient b;
  private dl c;
  private long d;
  private long e;
  private String f;
  private String g;
  private boolean h = false;
  private String i;
  private String j;
  private long k;
  private long l;
  
  dw(Context paramContext, dl paramdl, cu paramcu)
  {
    this.a = paramContext;
    this.c = paramdl;
    if (paramcu == null)
    {
      this.h = false;
      return;
    }
    this.h = paramcu.s();
    paramcu.v();
    this.k = paramcu.B();
    this.l = paramcu.A();
    this.f = paramcu.g();
    this.g = paramcu.h();
    this.i = paramcu.o();
    this.j = paramcu.k();
  }
  
  long a()
  {
    return this.e - this.d;
  }
  
  /* Error */
  protected String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 85	java/lang/System:currentTimeMillis	()J
    //   4: putfield 77	net/youmi/android/dw:d	J
    //   7: aconst_null
    //   8: astore_3
    //   9: aconst_null
    //   10: astore 4
    //   12: aload_0
    //   13: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   16: astore 13
    //   18: aconst_null
    //   19: astore 4
    //   21: aconst_null
    //   22: astore_3
    //   23: aload 13
    //   25: ifnonnull +15 -> 40
    //   28: aload_0
    //   29: aload_0
    //   30: getfield 33	net/youmi/android/dw:a	Landroid/content/Context;
    //   33: aload_0
    //   34: invokestatic 92	net/youmi/android/s:a	(Landroid/content/Context;Lnet/youmi/android/ee;)Lorg/apache/http/impl/client/DefaultHttpClient;
    //   37: putfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   40: new 94	org/apache/http/client/methods/HttpGet
    //   43: dup
    //   44: aload_1
    //   45: invokespecial 97	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   48: astore 14
    //   50: aload_0
    //   51: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   54: aload 14
    //   56: invokevirtual 103	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   59: astore 15
    //   61: aconst_null
    //   62: astore 4
    //   64: aconst_null
    //   65: astore_3
    //   66: aload 15
    //   68: ifnull +559 -> 627
    //   71: aload 15
    //   73: invokeinterface 109 1 0
    //   78: astore 16
    //   80: aconst_null
    //   81: astore 4
    //   83: aconst_null
    //   84: astore_3
    //   85: aload 16
    //   87: ifnull +540 -> 627
    //   90: aload 16
    //   92: invokeinterface 114 1 0
    //   97: lstore 17
    //   99: aload_0
    //   100: getfield 33	net/youmi/android/dw:a	Landroid/content/Context;
    //   103: aload_2
    //   104: iconst_1
    //   105: invokevirtual 120	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   108: astore 4
    //   110: aconst_null
    //   111: astore_3
    //   112: aload 4
    //   114: ifnonnull +81 -> 195
    //   117: aload 14
    //   119: invokevirtual 123	org/apache/http/client/methods/HttpGet:abort	()V
    //   122: aload 4
    //   124: ifnull +8 -> 132
    //   127: aload 4
    //   129: invokevirtual 128	java/io/OutputStream:close	()V
    //   132: iconst_0
    //   133: ifeq +7 -> 140
    //   136: aconst_null
    //   137: invokevirtual 131	java/io/InputStream:close	()V
    //   140: aload_0
    //   141: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   144: ifnull +15 -> 159
    //   147: aload_0
    //   148: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   151: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   154: invokeinterface 140 1 0
    //   159: aconst_null
    //   160: astore 20
    //   162: aload 20
    //   164: areturn
    //   165: astore 22
    //   167: aload 22
    //   169: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   172: goto -40 -> 132
    //   175: astore 21
    //   177: aload 21
    //   179: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   182: goto -42 -> 140
    //   185: astore 19
    //   187: aload 19
    //   189: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   192: goto -33 -> 159
    //   195: aload 16
    //   197: invokeinterface 149 1 0
    //   202: astore_3
    //   203: aload_3
    //   204: ifnull +423 -> 627
    //   207: sipush 1024
    //   210: newarray byte
    //   212: astore 23
    //   214: iconst_0
    //   215: istore 24
    //   217: lconst_0
    //   218: lstore 25
    //   220: aload_3
    //   221: aload 23
    //   223: invokevirtual 153	java/io/InputStream:read	([B)I
    //   226: istore 27
    //   228: iload 27
    //   230: ifgt +102 -> 332
    //   233: lload 25
    //   235: lconst_0
    //   236: lcmp
    //   237: ifle +390 -> 627
    //   240: aload 4
    //   242: invokevirtual 128	java/io/OutputStream:close	()V
    //   245: aconst_null
    //   246: astore 4
    //   248: aload_0
    //   249: getfield 33	net/youmi/android/dw:a	Landroid/content/Context;
    //   252: aload_2
    //   253: invokevirtual 157	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   256: astore 37
    //   258: aload 37
    //   260: ifnull +367 -> 627
    //   263: aload 37
    //   265: invokevirtual 162	java/io/File:exists	()Z
    //   268: ifeq +359 -> 627
    //   271: aload 37
    //   273: invokevirtual 165	java/io/File:getPath	()Ljava/lang/String;
    //   276: astore 38
    //   278: aload 38
    //   280: astore 20
    //   282: aload 4
    //   284: ifnull +8 -> 292
    //   287: aload 4
    //   289: invokevirtual 128	java/io/OutputStream:close	()V
    //   292: aload_3
    //   293: ifnull +7 -> 300
    //   296: aload_3
    //   297: invokevirtual 131	java/io/InputStream:close	()V
    //   300: aload_0
    //   301: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   304: ifnull -142 -> 162
    //   307: aload_0
    //   308: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   311: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   314: invokeinterface 140 1 0
    //   319: aload 20
    //   321: areturn
    //   322: astore 39
    //   324: aload 39
    //   326: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   329: aload 20
    //   331: areturn
    //   332: aload 4
    //   334: aload 23
    //   336: iconst_0
    //   337: iload 27
    //   339: invokevirtual 169	java/io/OutputStream:write	([BII)V
    //   342: lload 25
    //   344: iload 27
    //   346: i2l
    //   347: ladd
    //   348: lstore 25
    //   350: iload 24
    //   352: iconst_1
    //   353: iadd
    //   354: istore 28
    //   356: iload 28
    //   358: bipush 10
    //   360: irem
    //   361: istore 29
    //   363: iload 29
    //   365: ifne +332 -> 697
    //   368: lload 17
    //   370: lconst_0
    //   371: lcmp
    //   372: ifle +39 -> 411
    //   375: iconst_1
    //   376: anewarray 171	java/lang/Integer
    //   379: astore 32
    //   381: aload 32
    //   383: iconst_0
    //   384: ldc2_w 172
    //   387: lload 25
    //   389: lmul
    //   390: lload 17
    //   392: ldiv
    //   393: l2i
    //   394: invokestatic 177	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   397: aastore
    //   398: aload_0
    //   399: aload 32
    //   401: invokevirtual 181	net/youmi/android/dw:publishProgress	([Ljava/lang/Object;)V
    //   404: iload 28
    //   406: istore 24
    //   408: goto -188 -> 220
    //   411: iconst_1
    //   412: anewarray 171	java/lang/Integer
    //   415: astore 31
    //   417: aload 31
    //   419: iconst_0
    //   420: bipush 50
    //   422: invokestatic 177	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   425: aastore
    //   426: aload_0
    //   427: aload 31
    //   429: invokevirtual 181	net/youmi/android/dw:publishProgress	([Ljava/lang/Object;)V
    //   432: iload 28
    //   434: istore 24
    //   436: goto -216 -> 220
    //   439: astore 30
    //   441: aload 30
    //   443: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   446: goto +251 -> 697
    //   449: astore 36
    //   451: aload 36
    //   453: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   456: goto -208 -> 248
    //   459: astore 9
    //   461: aload 9
    //   463: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   466: aload 4
    //   468: ifnull +8 -> 476
    //   471: aload 4
    //   473: invokevirtual 128	java/io/OutputStream:close	()V
    //   476: aload_3
    //   477: ifnull +7 -> 484
    //   480: aload_3
    //   481: invokevirtual 131	java/io/InputStream:close	()V
    //   484: aload_0
    //   485: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   488: ifnull +15 -> 503
    //   491: aload_0
    //   492: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   495: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   498: invokeinterface 140 1 0
    //   503: aconst_null
    //   504: areturn
    //   505: astore 41
    //   507: aload 41
    //   509: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   512: goto -220 -> 292
    //   515: astore 40
    //   517: aload 40
    //   519: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   522: goto -222 -> 300
    //   525: astore 12
    //   527: aload 12
    //   529: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   532: goto -56 -> 476
    //   535: astore 11
    //   537: aload 11
    //   539: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   542: goto -58 -> 484
    //   545: astore 10
    //   547: aload 10
    //   549: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   552: goto -49 -> 503
    //   555: astore 5
    //   557: aload 4
    //   559: ifnull +8 -> 567
    //   562: aload 4
    //   564: invokevirtual 128	java/io/OutputStream:close	()V
    //   567: aload_3
    //   568: ifnull +7 -> 575
    //   571: aload_3
    //   572: invokevirtual 131	java/io/InputStream:close	()V
    //   575: aload_0
    //   576: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   579: ifnull +15 -> 594
    //   582: aload_0
    //   583: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   586: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   589: invokeinterface 140 1 0
    //   594: aload 5
    //   596: athrow
    //   597: astore 8
    //   599: aload 8
    //   601: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   604: goto -37 -> 567
    //   607: astore 7
    //   609: aload 7
    //   611: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   614: goto -39 -> 575
    //   617: astore 6
    //   619: aload 6
    //   621: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   624: goto -30 -> 594
    //   627: aload 4
    //   629: ifnull +8 -> 637
    //   632: aload 4
    //   634: invokevirtual 128	java/io/OutputStream:close	()V
    //   637: aload_3
    //   638: ifnull +7 -> 645
    //   641: aload_3
    //   642: invokevirtual 131	java/io/InputStream:close	()V
    //   645: aload_0
    //   646: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   649: ifnull -146 -> 503
    //   652: aload_0
    //   653: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   656: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   659: invokeinterface 140 1 0
    //   664: goto -161 -> 503
    //   667: astore 33
    //   669: aload 33
    //   671: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   674: goto -171 -> 503
    //   677: astore 35
    //   679: aload 35
    //   681: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   684: goto -47 -> 637
    //   687: astore 34
    //   689: aload 34
    //   691: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   694: goto -49 -> 645
    //   697: iload 28
    //   699: istore 24
    //   701: goto -481 -> 220
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	704	0	this	dw
    //   0	704	1	paramString1	String
    //   0	704	2	paramString2	String
    //   8	634	3	localInputStream	InputStream
    //   10	623	4	localFileOutputStream	java.io.FileOutputStream
    //   555	40	5	localObject1	java.lang.Object
    //   617	3	6	localException1	Exception
    //   607	3	7	localException2	Exception
    //   597	3	8	localException3	Exception
    //   459	3	9	localException4	Exception
    //   545	3	10	localException5	Exception
    //   535	3	11	localException6	Exception
    //   525	3	12	localException7	Exception
    //   16	8	13	localDefaultHttpClient	DefaultHttpClient
    //   48	70	14	localHttpGet	org.apache.http.client.methods.HttpGet
    //   59	13	15	localHttpResponse	org.apache.http.HttpResponse
    //   78	118	16	localHttpEntity	org.apache.http.HttpEntity
    //   97	294	17	l1	long
    //   185	3	19	localException8	Exception
    //   160	170	20	localObject2	java.lang.Object
    //   175	3	21	localException9	Exception
    //   165	3	22	localException10	Exception
    //   212	123	23	arrayOfByte	byte[]
    //   215	485	24	m	int
    //   218	170	25	l2	long
    //   226	119	27	n	int
    //   354	344	28	i1	int
    //   361	3	29	i2	int
    //   439	3	30	localException11	Exception
    //   415	13	31	arrayOfInteger1	Integer[]
    //   379	21	32	arrayOfInteger2	Integer[]
    //   667	3	33	localException12	Exception
    //   687	3	34	localException13	Exception
    //   677	3	35	localException14	Exception
    //   449	3	36	localException15	Exception
    //   256	16	37	localFile	java.io.File
    //   276	3	38	str	String
    //   322	3	39	localException16	Exception
    //   515	3	40	localException17	Exception
    //   505	3	41	localException18	Exception
    // Exception table:
    //   from	to	target	type
    //   127	132	165	java/lang/Exception
    //   136	140	175	java/lang/Exception
    //   140	159	185	java/lang/Exception
    //   300	319	322	java/lang/Exception
    //   375	404	439	java/lang/Exception
    //   411	432	439	java/lang/Exception
    //   240	245	449	java/lang/Exception
    //   12	18	459	java/lang/Exception
    //   28	40	459	java/lang/Exception
    //   40	61	459	java/lang/Exception
    //   71	80	459	java/lang/Exception
    //   90	110	459	java/lang/Exception
    //   117	122	459	java/lang/Exception
    //   195	203	459	java/lang/Exception
    //   207	214	459	java/lang/Exception
    //   220	228	459	java/lang/Exception
    //   248	258	459	java/lang/Exception
    //   263	278	459	java/lang/Exception
    //   332	342	459	java/lang/Exception
    //   441	446	459	java/lang/Exception
    //   451	456	459	java/lang/Exception
    //   287	292	505	java/lang/Exception
    //   296	300	515	java/lang/Exception
    //   471	476	525	java/lang/Exception
    //   480	484	535	java/lang/Exception
    //   484	503	545	java/lang/Exception
    //   12	18	555	finally
    //   28	40	555	finally
    //   40	61	555	finally
    //   71	80	555	finally
    //   90	110	555	finally
    //   117	122	555	finally
    //   195	203	555	finally
    //   207	214	555	finally
    //   220	228	555	finally
    //   240	245	555	finally
    //   248	258	555	finally
    //   263	278	555	finally
    //   332	342	555	finally
    //   375	404	555	finally
    //   411	432	555	finally
    //   441	446	555	finally
    //   451	456	555	finally
    //   461	466	555	finally
    //   562	567	597	java/lang/Exception
    //   571	575	607	java/lang/Exception
    //   575	594	617	java/lang/Exception
    //   645	664	667	java/lang/Exception
    //   632	637	677	java/lang/Exception
    //   641	645	687	java/lang/Exception
  }
  
  public void a(String paramString) {}
  
  protected void a(Integer... paramVarArgs)
  {
    super.onProgressUpdate(paramVarArgs);
    try
    {
      if ((this.c != null) && (paramVarArgs != null) && (paramVarArgs.length > 0))
      {
        int m = paramVarArgs[0].intValue();
        this.c.b(m);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  protected boolean a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    if ((paramInputStream != null) && (paramOutputStream != null)) {
      try
      {
        byte[] arrayOfByte = new byte[1024];
        for (;;)
        {
          int m = paramInputStream.read(arrayOfByte);
          if (m <= 0) {
            return true;
          }
          paramOutputStream.write(arrayOfByte, 0, m);
        }
        return false;
      }
      catch (Exception localException) {}
    }
  }
  
  /* Error */
  protected boolean a(org.apache.http.HttpResponse paramHttpResponse, java.io.File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: invokeinterface 109 1 0
    //   8: astore 12
    //   10: aload 12
    //   12: ifnull +254 -> 266
    //   15: aload_2
    //   16: ifnull +250 -> 266
    //   19: aload 12
    //   21: invokeinterface 149 1 0
    //   26: astore 15
    //   28: aload 15
    //   30: astore 5
    //   32: aconst_null
    //   33: astore_3
    //   34: aload 5
    //   36: ifnull +122 -> 158
    //   39: new 198	java/io/FileOutputStream
    //   42: dup
    //   43: aload_2
    //   44: invokespecial 201	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   47: astore 9
    //   49: aload_0
    //   50: aload 5
    //   52: aload 9
    //   54: invokevirtual 203	net/youmi/android/dw:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)Z
    //   57: istore 18
    //   59: iload 18
    //   61: ifeq +94 -> 155
    //   64: aload 9
    //   66: invokevirtual 204	java/io/FileOutputStream:close	()V
    //   69: aload_2
    //   70: invokevirtual 162	java/io/File:exists	()Z
    //   73: istore 21
    //   75: aload_3
    //   76: ifnull +7 -> 83
    //   79: aload_3
    //   80: invokevirtual 204	java/io/FileOutputStream:close	()V
    //   83: aload 5
    //   85: ifnull +8 -> 93
    //   88: aload 5
    //   90: invokevirtual 131	java/io/InputStream:close	()V
    //   93: iload 21
    //   95: ireturn
    //   96: astore 19
    //   98: aload 9
    //   100: astore_3
    //   101: goto -32 -> 69
    //   104: astore 8
    //   106: aconst_null
    //   107: astore 9
    //   109: aload 9
    //   111: ifnull +8 -> 119
    //   114: aload 9
    //   116: invokevirtual 204	java/io/FileOutputStream:close	()V
    //   119: aload_3
    //   120: ifnull +7 -> 127
    //   123: aload_3
    //   124: invokevirtual 131	java/io/InputStream:close	()V
    //   127: iconst_0
    //   128: ireturn
    //   129: astore 4
    //   131: aconst_null
    //   132: astore 5
    //   134: aload_3
    //   135: ifnull +7 -> 142
    //   138: aload_3
    //   139: invokevirtual 204	java/io/FileOutputStream:close	()V
    //   142: aload 5
    //   144: ifnull +8 -> 152
    //   147: aload 5
    //   149: invokevirtual 131	java/io/InputStream:close	()V
    //   152: aload 4
    //   154: athrow
    //   155: aload 9
    //   157: astore_3
    //   158: aload_3
    //   159: ifnull +7 -> 166
    //   162: aload_3
    //   163: invokevirtual 204	java/io/FileOutputStream:close	()V
    //   166: aload 5
    //   168: ifnull -41 -> 127
    //   171: aload 5
    //   173: invokevirtual 131	java/io/InputStream:close	()V
    //   176: goto -49 -> 127
    //   179: astore 13
    //   181: goto -54 -> 127
    //   184: astore 23
    //   186: goto -103 -> 83
    //   189: astore 22
    //   191: iload 21
    //   193: ireturn
    //   194: astore 11
    //   196: goto -77 -> 119
    //   199: astore 10
    //   201: goto -74 -> 127
    //   204: astore 7
    //   206: goto -64 -> 142
    //   209: astore 6
    //   211: goto -59 -> 152
    //   214: astore 14
    //   216: goto -50 -> 166
    //   219: astore 4
    //   221: goto -87 -> 134
    //   224: astore 17
    //   226: aload 9
    //   228: astore_3
    //   229: aload 17
    //   231: astore 4
    //   233: goto -99 -> 134
    //   236: astore 24
    //   238: aload 5
    //   240: astore_3
    //   241: aconst_null
    //   242: astore 9
    //   244: goto -135 -> 109
    //   247: astore 16
    //   249: aload 5
    //   251: astore_3
    //   252: goto -143 -> 109
    //   255: astore 20
    //   257: aload_3
    //   258: astore 9
    //   260: aload 5
    //   262: astore_3
    //   263: goto -154 -> 109
    //   266: aconst_null
    //   267: astore_3
    //   268: aconst_null
    //   269: astore 5
    //   271: goto -113 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	274	0	this	dw
    //   0	274	1	paramHttpResponse	org.apache.http.HttpResponse
    //   0	274	2	paramFile	java.io.File
    //   1	267	3	localObject1	java.lang.Object
    //   129	24	4	localObject2	java.lang.Object
    //   219	1	4	localObject3	java.lang.Object
    //   231	1	4	localObject4	java.lang.Object
    //   30	240	5	localInputStream1	InputStream
    //   209	1	6	localException1	Exception
    //   204	1	7	localException2	Exception
    //   104	1	8	localException3	Exception
    //   47	212	9	localObject5	java.lang.Object
    //   199	1	10	localException4	Exception
    //   194	1	11	localException5	Exception
    //   8	12	12	localHttpEntity	org.apache.http.HttpEntity
    //   179	1	13	localException6	Exception
    //   214	1	14	localException7	Exception
    //   26	3	15	localInputStream2	InputStream
    //   247	1	16	localException8	Exception
    //   224	6	17	localObject6	java.lang.Object
    //   57	3	18	bool1	boolean
    //   96	1	19	localException9	Exception
    //   255	1	20	localException10	Exception
    //   73	119	21	bool2	boolean
    //   189	1	22	localException11	Exception
    //   184	1	23	localException12	Exception
    //   236	1	24	localException13	Exception
    // Exception table:
    //   from	to	target	type
    //   64	69	96	java/lang/Exception
    //   2	10	104	java/lang/Exception
    //   19	28	104	java/lang/Exception
    //   2	10	129	finally
    //   19	28	129	finally
    //   171	176	179	java/lang/Exception
    //   79	83	184	java/lang/Exception
    //   88	93	189	java/lang/Exception
    //   114	119	194	java/lang/Exception
    //   123	127	199	java/lang/Exception
    //   138	142	204	java/lang/Exception
    //   147	152	209	java/lang/Exception
    //   162	166	214	java/lang/Exception
    //   39	49	219	finally
    //   69	75	219	finally
    //   49	59	224	finally
    //   64	69	224	finally
    //   39	49	236	java/lang/Exception
    //   49	59	247	java/lang/Exception
    //   69	75	255	java/lang/Exception
  }
  
  /* Error */
  protected String[] a(String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +34 -> 35
    //   4: aload_0
    //   5: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   8: ifnull +15 -> 23
    //   11: aload_0
    //   12: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   15: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   18: invokeinterface 140 1 0
    //   23: aconst_null
    //   24: areturn
    //   25: astore 57
    //   27: aload 57
    //   29: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   32: goto -9 -> 23
    //   35: aload_1
    //   36: arraylength
    //   37: ifle +726 -> 763
    //   40: new 207	java/util/ArrayList
    //   43: dup
    //   44: aload_1
    //   45: arraylength
    //   46: invokespecial 209	java/util/ArrayList:<init>	(I)V
    //   49: astore 6
    //   51: iconst_0
    //   52: istore 7
    //   54: iload 7
    //   56: aload_1
    //   57: arraylength
    //   58: if_icmplt +60 -> 118
    //   61: aload 6
    //   63: invokevirtual 212	java/util/ArrayList:size	()I
    //   66: ifle +697 -> 763
    //   69: aload 6
    //   71: invokevirtual 212	java/util/ArrayList:size	()I
    //   74: anewarray 214	java/lang/String
    //   77: astore 53
    //   79: iconst_0
    //   80: istore 54
    //   82: aload 6
    //   84: invokevirtual 212	java/util/ArrayList:size	()I
    //   87: istore 55
    //   89: iload 54
    //   91: iload 55
    //   93: if_icmplt +599 -> 692
    //   96: aload_0
    //   97: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   100: ifnull +15 -> 115
    //   103: aload_0
    //   104: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   107: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   110: invokeinterface 140 1 0
    //   115: aload 53
    //   117: areturn
    //   118: aload_1
    //   119: iload 7
    //   121: aaload
    //   122: astore 19
    //   124: aconst_null
    //   125: astore 20
    //   127: aload 19
    //   129: ifnull +516 -> 645
    //   132: aload 19
    //   134: invokevirtual 217	java/lang/String:trim	()Ljava/lang/String;
    //   137: astore 21
    //   139: aload 21
    //   141: invokevirtual 220	java/lang/String:length	()I
    //   144: istore 22
    //   146: aconst_null
    //   147: astore 20
    //   149: iload 22
    //   151: ifle +494 -> 645
    //   154: aload 21
    //   156: invokevirtual 220	java/lang/String:length	()I
    //   159: iconst_1
    //   160: if_icmpne +3 -> 163
    //   163: aload_0
    //   164: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   167: ifnonnull +15 -> 182
    //   170: aload_0
    //   171: aload_0
    //   172: getfield 33	net/youmi/android/dw:a	Landroid/content/Context;
    //   175: aload_0
    //   176: invokestatic 92	net/youmi/android/s:a	(Landroid/content/Context;Lnet/youmi/android/ee;)Lorg/apache/http/impl/client/DefaultHttpClient;
    //   179: putfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   182: new 94	org/apache/http/client/methods/HttpGet
    //   185: dup
    //   186: aload 21
    //   188: invokespecial 97	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   191: astore 15
    //   193: aload_0
    //   194: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   197: aload 15
    //   199: invokevirtual 103	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   202: astore 24
    //   204: aload 24
    //   206: ifnull +435 -> 641
    //   209: aload 24
    //   211: ldc 222
    //   213: invokeinterface 226 2 0
    //   218: astore 25
    //   220: lconst_0
    //   221: lstore 26
    //   223: aload 25
    //   225: invokeinterface 231 1 0
    //   230: astore 45
    //   232: aload 45
    //   234: ifnull +36 -> 270
    //   237: aload 45
    //   239: invokevirtual 217	java/lang/String:trim	()Ljava/lang/String;
    //   242: astore 46
    //   244: aload 46
    //   246: invokevirtual 220	java/lang/String:length	()I
    //   249: ifle +21 -> 270
    //   252: new 233	java/util/Date
    //   255: dup
    //   256: aload 46
    //   258: invokespecial 234	java/util/Date:<init>	(Ljava/lang/String;)V
    //   261: invokevirtual 237	java/util/Date:getTime	()J
    //   264: lstore 47
    //   266: lload 47
    //   268: lstore 26
    //   270: invokestatic 242	net/youmi/android/bc:d	()Lnet/youmi/android/ed;
    //   273: aload 21
    //   275: invokevirtual 246	net/youmi/android/ed:d	(Ljava/lang/String;)Ljava/io/File;
    //   278: astore 29
    //   280: lload 26
    //   282: lconst_0
    //   283: lcmp
    //   284: ifgt +145 -> 429
    //   287: aload 29
    //   289: invokevirtual 162	java/io/File:exists	()Z
    //   292: ifeq +59 -> 351
    //   295: aload 6
    //   297: aload 29
    //   299: invokevirtual 165	java/io/File:getPath	()Ljava/lang/String;
    //   302: invokevirtual 250	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   305: pop
    //   306: aload 15
    //   308: ifnull +8 -> 316
    //   311: aload 15
    //   313: invokevirtual 123	org/apache/http/client/methods/HttpGet:abort	()V
    //   316: iconst_1
    //   317: anewarray 171	java/lang/Integer
    //   320: astore 32
    //   322: aload 32
    //   324: iconst_0
    //   325: bipush 100
    //   327: iload 7
    //   329: iconst_1
    //   330: iadd
    //   331: imul
    //   332: aload_1
    //   333: arraylength
    //   334: idiv
    //   335: invokestatic 177	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   338: aastore
    //   339: aload_0
    //   340: aload 32
    //   342: invokevirtual 181	net/youmi/android/dw:publishProgress	([Ljava/lang/Object;)V
    //   345: iinc 7 1
    //   348: goto -294 -> 54
    //   351: aload_0
    //   352: aload 24
    //   354: aload 29
    //   356: invokevirtual 252	net/youmi/android/dw:a	(Lorg/apache/http/HttpResponse;Ljava/io/File;)Z
    //   359: ifeq -53 -> 306
    //   362: aload 6
    //   364: aload 29
    //   366: invokevirtual 165	java/io/File:getPath	()Ljava/lang/String;
    //   369: invokevirtual 250	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   372: pop
    //   373: goto -67 -> 306
    //   376: astore 23
    //   378: aload 15
    //   380: astore 9
    //   382: aload 9
    //   384: ifnull +8 -> 392
    //   387: aload 9
    //   389: invokevirtual 123	org/apache/http/client/methods/HttpGet:abort	()V
    //   392: iconst_1
    //   393: anewarray 171	java/lang/Integer
    //   396: astore 11
    //   398: aload 11
    //   400: iconst_0
    //   401: bipush 100
    //   403: iload 7
    //   405: iconst_1
    //   406: iadd
    //   407: imul
    //   408: aload_1
    //   409: arraylength
    //   410: idiv
    //   411: invokestatic 177	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   414: aastore
    //   415: aload_0
    //   416: aload 11
    //   418: invokevirtual 181	net/youmi/android/dw:publishProgress	([Ljava/lang/Object;)V
    //   421: goto -76 -> 345
    //   424: astore 10
    //   426: goto -81 -> 345
    //   429: aload 29
    //   431: invokevirtual 162	java/io/File:exists	()Z
    //   434: ifeq +170 -> 604
    //   437: aload 29
    //   439: invokevirtual 255	java/io/File:lastModified	()J
    //   442: lload 26
    //   444: lcmp
    //   445: ifne +25 -> 470
    //   448: aload 6
    //   450: aload 29
    //   452: invokevirtual 165	java/io/File:getPath	()Ljava/lang/String;
    //   455: invokevirtual 250	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   458: pop
    //   459: aload 15
    //   461: invokevirtual 123	org/apache/http/client/methods/HttpGet:abort	()V
    //   464: aconst_null
    //   465: astore 15
    //   467: goto -161 -> 306
    //   470: aload 29
    //   472: invokevirtual 258	java/io/File:deleteOnExit	()V
    //   475: aload_0
    //   476: aload 24
    //   478: aload 29
    //   480: invokevirtual 252	net/youmi/android/dw:a	(Lorg/apache/http/HttpResponse;Ljava/io/File;)Z
    //   483: istore 40
    //   485: iload 40
    //   487: ifeq -181 -> 306
    //   490: aload 29
    //   492: lload 26
    //   494: invokevirtual 262	java/io/File:setLastModified	(J)Z
    //   497: pop
    //   498: aload 6
    //   500: aload 29
    //   502: invokevirtual 165	java/io/File:getPath	()Ljava/lang/String;
    //   505: invokevirtual 250	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   508: pop
    //   509: goto -203 -> 306
    //   512: astore 14
    //   514: aload 15
    //   516: ifnull +8 -> 524
    //   519: aload 15
    //   521: invokevirtual 123	org/apache/http/client/methods/HttpGet:abort	()V
    //   524: iconst_1
    //   525: anewarray 171	java/lang/Integer
    //   528: astore 17
    //   530: aload 17
    //   532: iconst_0
    //   533: bipush 100
    //   535: iload 7
    //   537: iconst_1
    //   538: iadd
    //   539: imul
    //   540: aload_1
    //   541: arraylength
    //   542: idiv
    //   543: invokestatic 177	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   546: aastore
    //   547: aload_0
    //   548: aload 17
    //   550: invokevirtual 181	net/youmi/android/dw:publishProgress	([Ljava/lang/Object;)V
    //   553: aload 14
    //   555: athrow
    //   556: astore 4
    //   558: aload 4
    //   560: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   563: aload_0
    //   564: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   567: ifnull +15 -> 582
    //   570: aload_0
    //   571: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   574: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   577: invokeinterface 140 1 0
    //   582: aconst_null
    //   583: areturn
    //   584: astore 39
    //   586: aload 39
    //   588: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   591: goto -116 -> 475
    //   594: astore 41
    //   596: aload 41
    //   598: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   601: goto -103 -> 498
    //   604: aload_0
    //   605: aload 24
    //   607: aload 29
    //   609: invokevirtual 252	net/youmi/android/dw:a	(Lorg/apache/http/HttpResponse;Ljava/io/File;)Z
    //   612: istore 35
    //   614: iload 35
    //   616: ifeq -310 -> 306
    //   619: aload 29
    //   621: lload 26
    //   623: invokevirtual 262	java/io/File:setLastModified	(J)Z
    //   626: pop
    //   627: aload 6
    //   629: aload 29
    //   631: invokevirtual 165	java/io/File:getPath	()Ljava/lang/String;
    //   634: invokevirtual 250	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   637: pop
    //   638: goto -332 -> 306
    //   641: aload 15
    //   643: astore 20
    //   645: aload 20
    //   647: ifnull +8 -> 655
    //   650: aload 20
    //   652: invokevirtual 123	org/apache/http/client/methods/HttpGet:abort	()V
    //   655: iconst_1
    //   656: anewarray 171	java/lang/Integer
    //   659: astore 50
    //   661: aload 50
    //   663: iconst_0
    //   664: bipush 100
    //   666: iload 7
    //   668: iconst_1
    //   669: iadd
    //   670: imul
    //   671: aload_1
    //   672: arraylength
    //   673: idiv
    //   674: invokestatic 177	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   677: aastore
    //   678: aload_0
    //   679: aload 50
    //   681: invokevirtual 181	net/youmi/android/dw:publishProgress	([Ljava/lang/Object;)V
    //   684: goto -339 -> 345
    //   687: astore 49
    //   689: goto -344 -> 345
    //   692: aload 53
    //   694: iload 54
    //   696: aload 6
    //   698: iload 54
    //   700: invokevirtual 266	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   703: checkcast 214	java/lang/String
    //   706: aastore
    //   707: iinc 54 1
    //   710: goto -628 -> 82
    //   713: astore 56
    //   715: aload 56
    //   717: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   720: goto -605 -> 115
    //   723: astore 5
    //   725: aload 5
    //   727: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   730: goto -148 -> 582
    //   733: astore_2
    //   734: aload_0
    //   735: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   738: ifnull +15 -> 753
    //   741: aload_0
    //   742: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   745: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   748: invokeinterface 140 1 0
    //   753: aload_2
    //   754: athrow
    //   755: astore_3
    //   756: aload_3
    //   757: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   760: goto -7 -> 753
    //   763: aload_0
    //   764: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   767: ifnull -185 -> 582
    //   770: aload_0
    //   771: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   774: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   777: invokeinterface 140 1 0
    //   782: goto -200 -> 582
    //   785: astore 52
    //   787: aload 52
    //   789: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   792: goto -210 -> 582
    //   795: astore 33
    //   797: goto -481 -> 316
    //   800: astore 36
    //   802: goto -175 -> 627
    //   805: astore 12
    //   807: goto -415 -> 392
    //   810: astore 18
    //   812: goto -288 -> 524
    //   815: astore 51
    //   817: goto -162 -> 655
    //   820: astore 16
    //   822: goto -269 -> 553
    //   825: astore 13
    //   827: aload 13
    //   829: astore 14
    //   831: aconst_null
    //   832: astore 15
    //   834: goto -320 -> 514
    //   837: astore 8
    //   839: aconst_null
    //   840: astore 9
    //   842: goto -460 -> 382
    //   845: astore 31
    //   847: goto -502 -> 345
    //   850: astore 28
    //   852: goto -582 -> 270
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	855	0	this	dw
    //   0	855	1	paramArrayOfString	String[]
    //   733	21	2	localObject1	java.lang.Object
    //   755	2	3	localException1	Exception
    //   556	3	4	localException2	Exception
    //   723	3	5	localException3	Exception
    //   49	648	6	localArrayList	java.util.ArrayList
    //   52	618	7	m	int
    //   837	1	8	localException4	Exception
    //   380	461	9	localHttpGet1	org.apache.http.client.methods.HttpGet
    //   424	1	10	localException5	Exception
    //   396	21	11	arrayOfInteger1	Integer[]
    //   805	1	12	localException6	Exception
    //   825	3	13	localObject2	java.lang.Object
    //   512	42	14	localObject3	java.lang.Object
    //   829	1	14	localObject4	java.lang.Object
    //   191	642	15	localHttpGet2	org.apache.http.client.methods.HttpGet
    //   820	1	16	localException7	Exception
    //   528	21	17	arrayOfInteger2	Integer[]
    //   810	1	18	localException8	Exception
    //   122	11	19	str1	String
    //   125	526	20	localObject5	java.lang.Object
    //   137	137	21	str2	String
    //   144	6	22	n	int
    //   376	1	23	localException9	Exception
    //   202	404	24	localHttpResponse	org.apache.http.HttpResponse
    //   218	6	25	localHeader	org.apache.http.Header
    //   221	401	26	l1	long
    //   850	1	28	localException10	Exception
    //   278	352	29	localFile	java.io.File
    //   845	1	31	localException11	Exception
    //   320	21	32	arrayOfInteger3	Integer[]
    //   795	1	33	localException12	Exception
    //   612	3	35	bool1	boolean
    //   800	1	36	localException13	Exception
    //   584	3	39	localException14	Exception
    //   483	3	40	bool2	boolean
    //   594	3	41	localException15	Exception
    //   230	8	45	str3	String
    //   242	15	46	str4	String
    //   264	3	47	l2	long
    //   687	1	49	localException16	Exception
    //   659	21	50	arrayOfInteger4	Integer[]
    //   815	1	51	localException17	Exception
    //   785	3	52	localException18	Exception
    //   77	616	53	arrayOfString	String[]
    //   80	628	54	i1	int
    //   87	7	55	i2	int
    //   713	3	56	localException19	Exception
    //   25	3	57	localException20	Exception
    // Exception table:
    //   from	to	target	type
    //   4	23	25	java/lang/Exception
    //   193	204	376	java/lang/Exception
    //   209	220	376	java/lang/Exception
    //   270	280	376	java/lang/Exception
    //   287	306	376	java/lang/Exception
    //   351	373	376	java/lang/Exception
    //   429	464	376	java/lang/Exception
    //   475	485	376	java/lang/Exception
    //   498	509	376	java/lang/Exception
    //   586	591	376	java/lang/Exception
    //   596	601	376	java/lang/Exception
    //   604	614	376	java/lang/Exception
    //   627	638	376	java/lang/Exception
    //   392	421	424	java/lang/Exception
    //   193	204	512	finally
    //   209	220	512	finally
    //   223	232	512	finally
    //   237	266	512	finally
    //   270	280	512	finally
    //   287	306	512	finally
    //   351	373	512	finally
    //   429	464	512	finally
    //   470	475	512	finally
    //   475	485	512	finally
    //   490	498	512	finally
    //   498	509	512	finally
    //   586	591	512	finally
    //   596	601	512	finally
    //   604	614	512	finally
    //   619	627	512	finally
    //   627	638	512	finally
    //   35	51	556	java/lang/Exception
    //   54	79	556	java/lang/Exception
    //   82	89	556	java/lang/Exception
    //   553	556	556	java/lang/Exception
    //   692	707	556	java/lang/Exception
    //   470	475	584	java/lang/Exception
    //   490	498	594	java/lang/Exception
    //   655	684	687	java/lang/Exception
    //   96	115	713	java/lang/Exception
    //   563	582	723	java/lang/Exception
    //   35	51	733	finally
    //   54	79	733	finally
    //   82	89	733	finally
    //   311	316	733	finally
    //   316	345	733	finally
    //   387	392	733	finally
    //   392	421	733	finally
    //   519	524	733	finally
    //   524	553	733	finally
    //   553	556	733	finally
    //   558	563	733	finally
    //   650	655	733	finally
    //   655	684	733	finally
    //   692	707	733	finally
    //   734	753	755	java/lang/Exception
    //   763	782	785	java/lang/Exception
    //   311	316	795	java/lang/Exception
    //   619	627	800	java/lang/Exception
    //   387	392	805	java/lang/Exception
    //   519	524	810	java/lang/Exception
    //   650	655	815	java/lang/Exception
    //   524	553	820	java/lang/Exception
    //   118	124	825	finally
    //   132	146	825	finally
    //   154	163	825	finally
    //   163	182	825	finally
    //   182	193	825	finally
    //   118	124	837	java/lang/Exception
    //   132	146	837	java/lang/Exception
    //   154	163	837	java/lang/Exception
    //   163	182	837	java/lang/Exception
    //   182	193	837	java/lang/Exception
    //   316	345	845	java/lang/Exception
    //   223	232	850	java/lang/Exception
    //   237	266	850	java/lang/Exception
  }
  
  /* Error */
  protected String[] a(String[]... paramVarArgs)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 171	java/lang/Integer
    //   4: astore 6
    //   6: aload 6
    //   8: iconst_0
    //   9: iconst_1
    //   10: invokestatic 177	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   13: aastore
    //   14: aload_0
    //   15: aload 6
    //   17: invokevirtual 181	net/youmi/android/dw:publishProgress	([Ljava/lang/Object;)V
    //   20: aload_1
    //   21: ifnull +320 -> 341
    //   24: aload_1
    //   25: arraylength
    //   26: ifle +315 -> 341
    //   29: aload_1
    //   30: iconst_0
    //   31: aaload
    //   32: astore 8
    //   34: aload 8
    //   36: ifnull +305 -> 341
    //   39: aload 8
    //   41: arraylength
    //   42: ifle +299 -> 341
    //   45: aload_0
    //   46: getfield 33	net/youmi/android/dw:a	Landroid/content/Context;
    //   49: invokestatic 272	net/youmi/android/az:a	(Landroid/content/Context;)Z
    //   52: ifeq +47 -> 99
    //   55: aload_0
    //   56: aload 8
    //   58: invokevirtual 274	net/youmi/android/dw:a	([Ljava/lang/String;)[Ljava/lang/String;
    //   61: astore 19
    //   63: aload 19
    //   65: astore 15
    //   67: aload_0
    //   68: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   71: ifnull +15 -> 86
    //   74: aload_0
    //   75: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   78: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   81: invokeinterface 140 1 0
    //   86: aload 15
    //   88: areturn
    //   89: astore 20
    //   91: aload 20
    //   93: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   96: aload 15
    //   98: areturn
    //   99: aload 8
    //   101: iconst_0
    //   102: aaload
    //   103: astore 9
    //   105: aload 9
    //   107: ifnull +234 -> 341
    //   110: aload 9
    //   112: invokevirtual 217	java/lang/String:trim	()Ljava/lang/String;
    //   115: astore 10
    //   117: aload 10
    //   119: invokevirtual 220	java/lang/String:length	()I
    //   122: ifle +219 -> 341
    //   125: aload 10
    //   127: invokestatic 279	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   130: astore 11
    //   132: aload_0
    //   133: getfield 33	net/youmi/android/dw:a	Landroid/content/Context;
    //   136: aload 11
    //   138: invokevirtual 157	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   141: astore 18
    //   143: aload 18
    //   145: astore 13
    //   147: aload 13
    //   149: ifnull +66 -> 215
    //   152: aload 13
    //   154: invokevirtual 162	java/io/File:exists	()Z
    //   157: ifeq +58 -> 215
    //   160: iconst_1
    //   161: anewarray 214	java/lang/String
    //   164: astore 15
    //   166: aload 15
    //   168: iconst_0
    //   169: aload 13
    //   171: invokevirtual 165	java/io/File:getPath	()Ljava/lang/String;
    //   174: aastore
    //   175: aload_0
    //   176: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   179: ifnull -93 -> 86
    //   182: aload_0
    //   183: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   186: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   189: invokeinterface 140 1 0
    //   194: aload 15
    //   196: areturn
    //   197: astore 17
    //   199: aload 17
    //   201: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   204: aload 15
    //   206: areturn
    //   207: astore 12
    //   209: aconst_null
    //   210: astore 13
    //   212: goto -65 -> 147
    //   215: aload_0
    //   216: aload 10
    //   218: aload 11
    //   220: invokevirtual 281	net/youmi/android/dw:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   223: astore 14
    //   225: aload 14
    //   227: ifnull +114 -> 341
    //   230: iconst_1
    //   231: anewarray 214	java/lang/String
    //   234: dup
    //   235: iconst_0
    //   236: aload 14
    //   238: aastore
    //   239: astore 15
    //   241: aload_0
    //   242: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   245: ifnull -159 -> 86
    //   248: aload_0
    //   249: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   252: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   255: invokeinterface 140 1 0
    //   260: aload 15
    //   262: areturn
    //   263: astore 16
    //   265: aload 16
    //   267: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   270: aload 15
    //   272: areturn
    //   273: astore 4
    //   275: aload 4
    //   277: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   280: aload_0
    //   281: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   284: ifnull +15 -> 299
    //   287: aload_0
    //   288: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   291: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   294: invokeinterface 140 1 0
    //   299: aconst_null
    //   300: areturn
    //   301: astore 5
    //   303: aload 5
    //   305: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   308: goto -9 -> 299
    //   311: astore_2
    //   312: aload_0
    //   313: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   316: ifnull +15 -> 331
    //   319: aload_0
    //   320: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   323: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   326: invokeinterface 140 1 0
    //   331: aload_2
    //   332: athrow
    //   333: astore_3
    //   334: aload_3
    //   335: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   338: goto -7 -> 331
    //   341: aload_0
    //   342: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   345: ifnull -46 -> 299
    //   348: aload_0
    //   349: getfield 87	net/youmi/android/dw:b	Lorg/apache/http/impl/client/DefaultHttpClient;
    //   352: invokevirtual 135	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   355: invokeinterface 140 1 0
    //   360: goto -61 -> 299
    //   363: astore 7
    //   365: aload 7
    //   367: invokestatic 145	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   370: goto -71 -> 299
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	373	0	this	dw
    //   0	373	1	paramVarArgs	String[][]
    //   311	21	2	localObject	java.lang.Object
    //   333	2	3	localException1	Exception
    //   273	3	4	localException2	Exception
    //   301	3	5	localException3	Exception
    //   4	12	6	arrayOfInteger	Integer[]
    //   363	3	7	localException4	Exception
    //   32	68	8	arrayOfString1	String[]
    //   103	8	9	str1	String
    //   115	102	10	str2	String
    //   130	89	11	str3	String
    //   207	1	12	localException5	Exception
    //   145	66	13	localFile1	java.io.File
    //   223	14	14	str4	String
    //   65	206	15	arrayOfString2	String[]
    //   263	3	16	localException6	Exception
    //   197	3	17	localException7	Exception
    //   141	3	18	localFile2	java.io.File
    //   61	3	19	arrayOfString3	String[]
    //   89	3	20	localException8	Exception
    // Exception table:
    //   from	to	target	type
    //   67	86	89	java/lang/Exception
    //   175	194	197	java/lang/Exception
    //   132	143	207	java/lang/Exception
    //   241	260	263	java/lang/Exception
    //   0	20	273	java/lang/Exception
    //   24	34	273	java/lang/Exception
    //   39	63	273	java/lang/Exception
    //   99	105	273	java/lang/Exception
    //   110	132	273	java/lang/Exception
    //   152	175	273	java/lang/Exception
    //   215	225	273	java/lang/Exception
    //   230	241	273	java/lang/Exception
    //   280	299	301	java/lang/Exception
    //   0	20	311	finally
    //   24	34	311	finally
    //   39	63	311	finally
    //   99	105	311	finally
    //   110	132	311	finally
    //   132	143	311	finally
    //   152	175	311	finally
    //   215	225	311	finally
    //   230	241	311	finally
    //   275	280	311	finally
    //   312	331	333	java/lang/Exception
    //   341	360	363	java/lang/Exception
  }
  
  protected void b(String[] paramArrayOfString)
  {
    super.onPostExecute(paramArrayOfString);
    this.e = System.currentTimeMillis();
    if (this.c != null)
    {
      if (paramArrayOfString == null) {}
      try
      {
        this.c.a();
        return;
      }
      catch (Exception localException1)
      {
        try
        {
          int m;
          this.c.a();
          return;
        }
        catch (Exception localException2) {}
      }
      m = paramArrayOfString.length;
      if (m > 0) {
        try
        {
          this.c.a(this, paramArrayOfString);
          return;
        }
        catch (Exception localException3) {}
      }
    }
  }
  
  boolean b()
  {
    return this.h;
  }
  
  long c()
  {
    return this.k;
  }
  
  long d()
  {
    return this.d - this.l;
  }
  
  String e()
  {
    return this.f;
  }
  
  String f()
  {
    return this.g;
  }
  
  String g()
  {
    return this.i;
  }
  
  String h()
  {
    return this.j;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dw
 * JD-Core Version:    0.7.0.1
 */