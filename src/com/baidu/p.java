package com.baidu;

import android.content.Context;

class p
  extends Thread
{
  private Context b;
  private s c;
  private String d;
  private int e;
  
  public p(o paramo, Context paramContext, String paramString, s params)
  {
    this.b = paramContext;
    this.c = params;
    this.d = paramString;
  }
  
  /* Error */
  private void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	com/baidu/p:b	Landroid/content/Context;
    //   4: aload_0
    //   5: getfield 18	com/baidu/p:a	Lcom/baidu/o;
    //   8: invokestatic 36	com/baidu/o:a	(Lcom/baidu/o;)Lcom/baidu/t;
    //   11: aload_0
    //   12: getfield 27	com/baidu/p:d	Ljava/lang/String;
    //   15: invokestatic 41	com/baidu/c:a	()Lcom/baidu/c;
    //   18: invokevirtual 44	com/baidu/c:b	()Ljava/lang/String;
    //   21: invokestatic 49	com/baidu/r:a	(Landroid/content/Context;Lcom/baidu/t;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   24: astore_3
    //   25: new 51	org/json/JSONObject
    //   28: dup
    //   29: aload_0
    //   30: getfield 23	com/baidu/p:b	Landroid/content/Context;
    //   33: aload_3
    //   34: invokestatic 56	com/baidu/w:d	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   37: invokespecial 59	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   40: astore 4
    //   42: aload 4
    //   44: ldc 61
    //   46: invokevirtual 65	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   49: istore 5
    //   51: invokestatic 41	com/baidu/c:a	()Lcom/baidu/c;
    //   54: astore 6
    //   56: iload 5
    //   58: iconst_m1
    //   59: if_icmpne +302 -> 361
    //   62: iconst_1
    //   63: istore 7
    //   65: aload 6
    //   67: iload 7
    //   69: invokevirtual 68	com/baidu/c:a	(Z)V
    //   72: invokestatic 41	com/baidu/c:a	()Lcom/baidu/c;
    //   75: astore 8
    //   77: iload 5
    //   79: ifne +288 -> 367
    //   82: iconst_1
    //   83: istore 9
    //   85: aload 8
    //   87: iload 9
    //   89: invokevirtual 70	com/baidu/c:b	(Z)V
    //   92: iload 5
    //   94: ifle +279 -> 373
    //   97: invokestatic 41	com/baidu/c:a	()Lcom/baidu/c;
    //   100: aload_0
    //   101: getfield 18	com/baidu/p:a	Lcom/baidu/o;
    //   104: invokestatic 36	com/baidu/o:a	(Lcom/baidu/o;)Lcom/baidu/t;
    //   107: invokevirtual 73	com/baidu/c:b	(Lcom/baidu/t;)V
    //   110: aload 4
    //   112: ldc 75
    //   114: invokevirtual 79	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   117: astore 10
    //   119: iconst_0
    //   120: istore 11
    //   122: iload 11
    //   124: iload 5
    //   126: if_icmpge +382 -> 508
    //   129: ldc 81
    //   131: astore 14
    //   133: aload 10
    //   135: iload 11
    //   137: invokevirtual 87	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   140: astore 20
    //   142: invokestatic 93	java/lang/System:currentTimeMillis	()J
    //   145: lstore 21
    //   147: aload 20
    //   149: ldc 95
    //   151: invokevirtual 99	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   154: invokestatic 101	com/baidu/w:e	(Ljava/lang/String;)Ljava/lang/String;
    //   157: astore 14
    //   159: aload 20
    //   161: ldc 95
    //   163: invokevirtual 99	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   166: invokevirtual 106	java/lang/String:trim	()Ljava/lang/String;
    //   169: ldc 81
    //   171: invokevirtual 110	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   174: ifne +41 -> 215
    //   177: iconst_0
    //   178: aload_0
    //   179: getfield 23	com/baidu/p:b	Landroid/content/Context;
    //   182: aload 14
    //   184: invokestatic 113	com/baidu/w:c	(ZLandroid/content/Context;Ljava/lang/String;)Z
    //   187: ifne +28 -> 215
    //   190: iconst_0
    //   191: aload_0
    //   192: getfield 23	com/baidu/p:b	Landroid/content/Context;
    //   195: new 115	java/net/URL
    //   198: dup
    //   199: aload 20
    //   201: ldc 95
    //   203: invokevirtual 99	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   206: invokespecial 116	java/net/URL:<init>	(Ljava/lang/String;)V
    //   209: aload 14
    //   211: invokestatic 119	com/baidu/w:b	(ZLandroid/content/Context;Ljava/net/URL;Ljava/lang/String;)Z
    //   214: pop
    //   215: invokestatic 124	com/baidu/k:a	()[Lcom/baidu/k;
    //   218: astore 23
    //   220: aload 23
    //   222: arraylength
    //   223: istore 24
    //   225: iconst_0
    //   226: istore 25
    //   228: iload 25
    //   230: iload 24
    //   232: if_icmpge +184 -> 416
    //   235: aload 23
    //   237: iload 25
    //   239: aaload
    //   240: astore 26
    //   242: getstatic 127	com/baidu/c:a	Ljava/util/Map;
    //   245: aload 26
    //   247: invokeinterface 133 2 0
    //   252: checkcast 103	java/lang/String
    //   255: invokestatic 136	com/baidu/c:a	(Ljava/lang/String;)Ljava/net/URL;
    //   258: ifnonnull +97 -> 355
    //   261: iconst_0
    //   262: aload_0
    //   263: getfield 23	com/baidu/p:b	Landroid/content/Context;
    //   266: getstatic 127	com/baidu/c:a	Ljava/util/Map;
    //   269: aload 26
    //   271: invokeinterface 133 2 0
    //   276: checkcast 103	java/lang/String
    //   279: invokestatic 113	com/baidu/w:c	(ZLandroid/content/Context;Ljava/lang/String;)Z
    //   282: ifne +73 -> 355
    //   285: aload_0
    //   286: getfield 23	com/baidu/p:b	Landroid/content/Context;
    //   289: astore 27
    //   291: iconst_2
    //   292: anewarray 138	java/lang/Object
    //   295: astore 28
    //   297: aload 28
    //   299: iconst_0
    //   300: invokestatic 41	com/baidu/c:a	()Lcom/baidu/c;
    //   303: invokevirtual 141	com/baidu/c:g	()Ljava/lang/String;
    //   306: aastore
    //   307: aload 28
    //   309: iconst_1
    //   310: getstatic 127	com/baidu/c:a	Ljava/util/Map;
    //   313: aload 26
    //   315: invokeinterface 133 2 0
    //   320: aastore
    //   321: iconst_0
    //   322: aload 27
    //   324: new 115	java/net/URL
    //   327: dup
    //   328: ldc 143
    //   330: aload 28
    //   332: invokestatic 147	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   335: invokespecial 116	java/net/URL:<init>	(Ljava/lang/String;)V
    //   338: getstatic 127	com/baidu/c:a	Ljava/util/Map;
    //   341: aload 26
    //   343: invokeinterface 133 2 0
    //   348: checkcast 103	java/lang/String
    //   351: invokestatic 119	com/baidu/w:b	(ZLandroid/content/Context;Ljava/net/URL;Ljava/lang/String;)Z
    //   354: pop
    //   355: iinc 25 1
    //   358: goto -130 -> 228
    //   361: iconst_0
    //   362: istore 7
    //   364: goto -299 -> 65
    //   367: iconst_0
    //   368: istore 9
    //   370: goto -285 -> 85
    //   373: iload 5
    //   375: ifgt -265 -> 110
    //   378: aload_0
    //   379: getfield 25	com/baidu/p:c	Lcom/baidu/s;
    //   382: aconst_null
    //   383: getstatic 153	com/baidu/FailReason:NO_AD	Lcom/baidu/FailReason;
    //   386: invokeinterface 158 3 0
    //   391: goto -281 -> 110
    //   394: astore_1
    //   395: ldc 160
    //   397: aload_1
    //   398: invokestatic 165	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   401: pop
    //   402: aload_0
    //   403: getfield 25	com/baidu/p:c	Lcom/baidu/s;
    //   406: aload_1
    //   407: getstatic 168	com/baidu/FailReason:OTHER_EXCEPTION	Lcom/baidu/FailReason;
    //   410: invokeinterface 158 3 0
    //   415: return
    //   416: aload_0
    //   417: getfield 23	com/baidu/p:b	Landroid/content/Context;
    //   420: aload 20
    //   422: aload 14
    //   424: invokestatic 173	com/baidu/Ad:a	(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/baidu/Ad;
    //   427: pop
    //   428: invokestatic 41	com/baidu/c:a	()Lcom/baidu/c;
    //   431: aload_0
    //   432: getfield 18	com/baidu/p:a	Lcom/baidu/o;
    //   435: invokestatic 36	com/baidu/o:a	(Lcom/baidu/o;)Lcom/baidu/t;
    //   438: lload 21
    //   440: aload 20
    //   442: invokevirtual 176	com/baidu/c:a	(Lcom/baidu/t;JLorg/json/JSONObject;)V
    //   445: aload_0
    //   446: iconst_1
    //   447: aload_0
    //   448: getfield 178	com/baidu/p:e	I
    //   451: iadd
    //   452: putfield 178	com/baidu/p:e	I
    //   455: iinc 11 1
    //   458: goto -336 -> 122
    //   461: astore 17
    //   463: ldc 160
    //   465: aload 17
    //   467: invokestatic 165	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   470: pop
    //   471: aload 14
    //   473: ldc 81
    //   475: invokevirtual 110	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   478: ifne -23 -> 455
    //   481: iconst_0
    //   482: aload_0
    //   483: getfield 23	com/baidu/p:b	Landroid/content/Context;
    //   486: aload 14
    //   488: invokestatic 180	com/baidu/w:b	(ZLandroid/content/Context;Ljava/lang/String;)Z
    //   491: pop
    //   492: goto -37 -> 455
    //   495: astore 15
    //   497: ldc 160
    //   499: aload 15
    //   501: invokestatic 165	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   504: pop
    //   505: goto -50 -> 455
    //   508: aload_0
    //   509: getfield 178	com/baidu/p:e	I
    //   512: ifle +70 -> 582
    //   515: iconst_2
    //   516: anewarray 138	java/lang/Object
    //   519: astore 12
    //   521: aload 12
    //   523: iconst_0
    //   524: aload_0
    //   525: getfield 178	com/baidu/p:e	I
    //   528: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   531: aastore
    //   532: aload 12
    //   534: iconst_1
    //   535: invokestatic 41	com/baidu/c:a	()Lcom/baidu/c;
    //   538: invokevirtual 190	com/baidu/c:p	()I
    //   541: invokestatic 186	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   544: aastore
    //   545: ldc 160
    //   547: ldc 192
    //   549: aload 12
    //   551: invokestatic 147	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   554: invokestatic 195	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   557: pop
    //   558: aload_0
    //   559: getfield 18	com/baidu/p:a	Lcom/baidu/o;
    //   562: iconst_1
    //   563: invokestatic 198	com/baidu/o:a	(Lcom/baidu/o;Z)V
    //   566: aload_0
    //   567: getfield 25	com/baidu/p:c	Lcom/baidu/s;
    //   570: aload_0
    //   571: getfield 18	com/baidu/p:a	Lcom/baidu/o;
    //   574: invokestatic 201	com/baidu/o:b	(Lcom/baidu/o;)Z
    //   577: invokeinterface 202 2 0
    //   582: invokestatic 41	com/baidu/c:a	()Lcom/baidu/c;
    //   585: invokevirtual 204	com/baidu/c:d	()V
    //   588: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	589	0	this	p
    //   394	13	1	localException1	Exception
    //   24	10	3	str1	String
    //   40	71	4	localJSONObject1	org.json.JSONObject
    //   49	325	5	i	int
    //   54	12	6	localc1	c
    //   63	300	7	bool1	boolean
    //   75	11	8	localc2	c
    //   83	286	9	bool2	boolean
    //   117	17	10	localJSONArray	org.json.JSONArray
    //   120	336	11	j	int
    //   519	31	12	arrayOfObject1	java.lang.Object[]
    //   131	356	14	str2	String
    //   495	5	15	localException2	Exception
    //   461	5	17	localJSONException	org.json.JSONException
    //   140	301	20	localJSONObject2	org.json.JSONObject
    //   145	294	21	l	long
    //   218	18	23	arrayOfk	k[]
    //   223	10	24	k	int
    //   226	130	25	m	int
    //   240	102	26	localk	k
    //   289	34	27	localContext	Context
    //   295	36	28	arrayOfObject2	java.lang.Object[]
    // Exception table:
    //   from	to	target	type
    //   0	56	394	java/lang/Exception
    //   65	77	394	java/lang/Exception
    //   85	92	394	java/lang/Exception
    //   97	110	394	java/lang/Exception
    //   110	119	394	java/lang/Exception
    //   378	391	394	java/lang/Exception
    //   463	492	394	java/lang/Exception
    //   497	505	394	java/lang/Exception
    //   508	582	394	java/lang/Exception
    //   582	588	394	java/lang/Exception
    //   133	215	461	org/json/JSONException
    //   215	225	461	org/json/JSONException
    //   235	355	461	org/json/JSONException
    //   416	455	461	org/json/JSONException
    //   133	215	495	java/lang/Exception
    //   215	225	495	java/lang/Exception
    //   235	355	495	java/lang/Exception
    //   416	455	495	java/lang/Exception
  }
  
  public void run()
  {
    bk.b("AdRequestHandler.run", o.a(this.a).toString());
    try
    {
      this.c.a();
      a();
      return;
    }
    catch (Exception localException)
    {
      bk.a(localException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.p
 * JD-Core Version:    0.7.0.1
 */