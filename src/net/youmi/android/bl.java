package net.youmi.android;

import java.util.List;

class bl
  extends dh
{
  private String h;
  private String i;
  private List j;
  private boolean k = false;
  
  protected int a()
  {
    if (!dq.c(this.e)) {
      return 1;
    }
    if (!s.b(this.e)) {
      return 2;
    }
    return 0;
  }
  
  /* Error */
  protected int b()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 40	net/youmi/android/bl:f	()Lorg/apache/http/impl/client/DefaultHttpClient;
    //   4: astore 18
    //   6: aload 18
    //   8: astore_2
    //   9: aload_2
    //   10: ifnonnull +23 -> 33
    //   13: aload_0
    //   14: iconst_4
    //   15: putfield 43	net/youmi/android/bl:f	I
    //   18: aload_0
    //   19: invokevirtual 45	net/youmi/android/bl:i	()V
    //   22: aload_0
    //   23: getfield 43	net/youmi/android/bl:f	I
    //   26: ireturn
    //   27: astore_1
    //   28: aconst_null
    //   29: astore_2
    //   30: goto -21 -> 9
    //   33: aload_0
    //   34: lconst_0
    //   35: invokevirtual 48	net/youmi/android/bl:a	(J)V
    //   38: aload_0
    //   39: getfield 17	net/youmi/android/bl:k	Z
    //   42: ifeq +197 -> 239
    //   45: new 50	org/apache/http/client/methods/HttpPost
    //   48: dup
    //   49: aload_0
    //   50: getfield 52	net/youmi/android/bl:a	Ljava/lang/String;
    //   53: invokespecial 55	org/apache/http/client/methods/HttpPost:<init>	(Ljava/lang/String;)V
    //   56: astore 5
    //   58: aload 5
    //   60: new 57	org/apache/http/client/entity/UrlEncodedFormEntity
    //   63: dup
    //   64: aload_0
    //   65: getfield 59	net/youmi/android/bl:j	Ljava/util/List;
    //   68: ldc 61
    //   70: invokespecial 64	org/apache/http/client/entity/UrlEncodedFormEntity:<init>	(Ljava/util/List;Ljava/lang/String;)V
    //   73: invokevirtual 68	org/apache/http/client/methods/HttpPost:setEntity	(Lorg/apache/http/HttpEntity;)V
    //   76: aload_2
    //   77: aload 5
    //   79: invokevirtual 74	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   82: astore 6
    //   84: aload 6
    //   86: invokeinterface 80 1 0
    //   91: invokeinterface 85 1 0
    //   96: sipush 200
    //   99: if_icmpne +227 -> 326
    //   102: aload 6
    //   104: invokeinterface 89 1 0
    //   109: astore 9
    //   111: aload_0
    //   112: aload 9
    //   114: invokeinterface 95 1 0
    //   119: putfield 98	net/youmi/android/bl:c	J
    //   122: aload_0
    //   123: aload 9
    //   125: invokestatic 104	org/apache/http/util/EntityUtils:getContentCharSet	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   128: putfield 106	net/youmi/android/bl:i	Ljava/lang/String;
    //   131: aload 9
    //   133: invokeinterface 110 1 0
    //   138: astore 10
    //   140: sipush 1024
    //   143: newarray byte
    //   145: astore 11
    //   147: new 112	java/io/ByteArrayOutputStream
    //   150: dup
    //   151: invokespecial 113	java/io/ByteArrayOutputStream:<init>	()V
    //   154: astore 12
    //   156: aload 10
    //   158: aload 11
    //   160: invokevirtual 119	java/io/InputStream:read	([B)I
    //   163: istore 13
    //   165: iload 13
    //   167: ifgt +116 -> 283
    //   170: aload 12
    //   172: invokevirtual 123	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   175: astore 14
    //   177: aload_0
    //   178: getfield 106	net/youmi/android/bl:i	Ljava/lang/String;
    //   181: ifnonnull +125 -> 306
    //   184: aload_0
    //   185: ldc 61
    //   187: putfield 106	net/youmi/android/bl:i	Ljava/lang/String;
    //   190: aload_0
    //   191: new 125	java/lang/String
    //   194: dup
    //   195: aload 14
    //   197: ldc 61
    //   199: invokespecial 128	java/lang/String:<init>	([BLjava/lang/String;)V
    //   202: putfield 130	net/youmi/android/bl:h	Ljava/lang/String;
    //   205: aload 10
    //   207: invokevirtual 133	java/io/InputStream:close	()V
    //   210: aload 12
    //   212: invokevirtual 134	java/io/ByteArrayOutputStream:close	()V
    //   215: aload_2
    //   216: invokevirtual 138	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   219: invokeinterface 143 1 0
    //   224: aload_0
    //   225: bipush 6
    //   227: putfield 43	net/youmi/android/bl:f	I
    //   230: aload_0
    //   231: invokevirtual 45	net/youmi/android/bl:i	()V
    //   234: aload_0
    //   235: getfield 43	net/youmi/android/bl:f	I
    //   238: ireturn
    //   239: new 145	org/apache/http/client/methods/HttpGet
    //   242: dup
    //   243: aload_0
    //   244: getfield 52	net/youmi/android/bl:a	Ljava/lang/String;
    //   247: invokespecial 146	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   250: astore 5
    //   252: goto -176 -> 76
    //   255: astore_3
    //   256: aload_3
    //   257: invokestatic 151	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   260: aload_2
    //   261: invokevirtual 138	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   264: invokeinterface 143 1 0
    //   269: aload_0
    //   270: iconst_4
    //   271: putfield 43	net/youmi/android/bl:f	I
    //   274: aload_0
    //   275: invokevirtual 45	net/youmi/android/bl:i	()V
    //   278: aload_0
    //   279: getfield 43	net/youmi/android/bl:f	I
    //   282: ireturn
    //   283: aload 12
    //   285: aload 11
    //   287: iconst_0
    //   288: iload 13
    //   290: invokevirtual 155	java/io/ByteArrayOutputStream:write	([BII)V
    //   293: aload_0
    //   294: aload 12
    //   296: invokevirtual 158	java/io/ByteArrayOutputStream:size	()I
    //   299: i2l
    //   300: invokevirtual 48	net/youmi/android/bl:a	(J)V
    //   303: goto -147 -> 156
    //   306: aload_0
    //   307: new 125	java/lang/String
    //   310: dup
    //   311: aload 14
    //   313: aload_0
    //   314: getfield 106	net/youmi/android/bl:i	Ljava/lang/String;
    //   317: invokespecial 128	java/lang/String:<init>	([BLjava/lang/String;)V
    //   320: putfield 130	net/youmi/android/bl:h	Ljava/lang/String;
    //   323: goto -118 -> 205
    //   326: aload_2
    //   327: invokevirtual 138	org/apache/http/impl/client/DefaultHttpClient:getConnectionManager	()Lorg/apache/http/conn/ClientConnectionManager;
    //   330: invokeinterface 143 1 0
    //   335: aload_0
    //   336: bipush 7
    //   338: putfield 43	net/youmi/android/bl:f	I
    //   341: aload_0
    //   342: invokevirtual 45	net/youmi/android/bl:i	()V
    //   345: aload_0
    //   346: getfield 43	net/youmi/android/bl:f	I
    //   349: istore 8
    //   351: iload 8
    //   353: ireturn
    //   354: astore 4
    //   356: aload 4
    //   358: invokestatic 151	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   361: goto -92 -> 269
    //   364: astore 15
    //   366: goto -156 -> 210
    //   369: astore 16
    //   371: goto -156 -> 215
    //   374: astore 7
    //   376: goto -41 -> 335
    //   379: astore 17
    //   381: goto -157 -> 224
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	384	0	this	bl
    //   27	1	1	localException1	java.lang.Exception
    //   8	319	2	localDefaultHttpClient1	org.apache.http.impl.client.DefaultHttpClient
    //   255	2	3	localException2	java.lang.Exception
    //   354	3	4	localException3	java.lang.Exception
    //   56	195	5	localObject	java.lang.Object
    //   82	21	6	localHttpResponse	org.apache.http.HttpResponse
    //   374	1	7	localException4	java.lang.Exception
    //   349	3	8	m	int
    //   109	23	9	localHttpEntity	org.apache.http.HttpEntity
    //   138	68	10	localInputStream	java.io.InputStream
    //   145	141	11	arrayOfByte1	byte[]
    //   154	141	12	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   163	126	13	n	int
    //   175	137	14	arrayOfByte2	byte[]
    //   364	1	15	localException5	java.lang.Exception
    //   369	1	16	localException6	java.lang.Exception
    //   379	1	17	localException7	java.lang.Exception
    //   4	3	18	localDefaultHttpClient2	org.apache.http.impl.client.DefaultHttpClient
    // Exception table:
    //   from	to	target	type
    //   0	6	27	java/lang/Exception
    //   33	76	255	java/lang/Exception
    //   76	156	255	java/lang/Exception
    //   156	165	255	java/lang/Exception
    //   170	205	255	java/lang/Exception
    //   224	239	255	java/lang/Exception
    //   239	252	255	java/lang/Exception
    //   283	303	255	java/lang/Exception
    //   306	323	255	java/lang/Exception
    //   335	351	255	java/lang/Exception
    //   260	269	354	java/lang/Exception
    //   205	210	364	java/lang/Exception
    //   210	215	369	java/lang/Exception
    //   326	335	374	java/lang/Exception
    //   215	224	379	java/lang/Exception
  }
  
  String c()
  {
    return this.h;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.bl
 * JD-Core Version:    0.7.0.1
 */