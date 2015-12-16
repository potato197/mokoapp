package net.youmi.android;

import java.io.File;

abstract class di
  extends dh
{
  protected ed h;
  
  di(ed paramed)
  {
    this.h = paramed;
  }
  
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
  
  protected abstract boolean a(File paramFile);
  
  protected abstract boolean a(byte[] paramArrayOfByte);
  
  /* Error */
  protected int b()
  {
    // Byte code:
    //   0: aload_0
    //   1: lconst_0
    //   2: invokevirtual 37	net/youmi/android/di:a	(J)V
    //   5: aload_0
    //   6: getfield 13	net/youmi/android/di:h	Lnet/youmi/android/ed;
    //   9: ifnull +64 -> 73
    //   12: new 39	java/io/File
    //   15: dup
    //   16: aload_0
    //   17: getfield 13	net/youmi/android/di:h	Lnet/youmi/android/ed;
    //   20: aload_0
    //   21: getfield 42	net/youmi/android/di:a	Ljava/lang/String;
    //   24: invokevirtual 47	net/youmi/android/ed:c	(Ljava/lang/String;)Ljava/lang/String;
    //   27: invokespecial 50	java/io/File:<init>	(Ljava/lang/String;)V
    //   30: astore 15
    //   32: aload 15
    //   34: invokevirtual 54	java/io/File:exists	()Z
    //   37: ifeq +36 -> 73
    //   40: aload_0
    //   41: aload 15
    //   43: invokevirtual 56	net/youmi/android/di:a	(Ljava/io/File;)Z
    //   46: ifeq +27 -> 73
    //   49: aload_0
    //   50: bipush 6
    //   52: putfield 60	net/youmi/android/di:f	I
    //   55: aload_0
    //   56: invokevirtual 63	net/youmi/android/di:i	()V
    //   59: aload_0
    //   60: getfield 60	net/youmi/android/di:f	I
    //   63: istore 16
    //   65: iload 16
    //   67: ireturn
    //   68: astore_2
    //   69: aload_2
    //   70: invokestatic 68	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   73: aload_0
    //   74: invokevirtual 71	net/youmi/android/di:f	()Lorg/apache/http/impl/client/DefaultHttpClient;
    //   77: new 73	org/apache/http/client/methods/HttpGet
    //   80: dup
    //   81: aload_0
    //   82: getfield 42	net/youmi/android/di:a	Ljava/lang/String;
    //   85: invokespecial 74	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   88: invokevirtual 80	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   91: astore_3
    //   92: aload_3
    //   93: invokeinterface 86 1 0
    //   98: invokeinterface 91 1 0
    //   103: sipush 200
    //   106: if_icmpne +220 -> 326
    //   109: aload_3
    //   110: invokeinterface 95 1 0
    //   115: astore 5
    //   117: aload_0
    //   118: aload 5
    //   120: invokeinterface 101 1 0
    //   125: putfield 104	net/youmi/android/di:c	J
    //   128: aload 5
    //   130: invokeinterface 108 1 0
    //   135: astore 6
    //   137: aload 6
    //   139: ifnonnull +18 -> 157
    //   142: aload_0
    //   143: bipush 7
    //   145: putfield 60	net/youmi/android/di:f	I
    //   148: aload_0
    //   149: invokevirtual 63	net/youmi/android/di:i	()V
    //   152: aload_0
    //   153: getfield 60	net/youmi/android/di:f	I
    //   156: ireturn
    //   157: new 110	java/io/ByteArrayOutputStream
    //   160: dup
    //   161: aload_0
    //   162: getfield 104	net/youmi/android/di:c	J
    //   165: l2i
    //   166: invokespecial 113	java/io/ByteArrayOutputStream:<init>	(I)V
    //   169: astore 7
    //   171: sipush 1024
    //   174: newarray byte
    //   176: astore 8
    //   178: aload 6
    //   180: aload 8
    //   182: invokevirtual 119	java/io/InputStream:read	([B)I
    //   185: istore 9
    //   187: iload 9
    //   189: ifgt +83 -> 272
    //   192: aload_0
    //   193: bipush 7
    //   195: putfield 60	net/youmi/android/di:f	I
    //   198: aload 7
    //   200: invokevirtual 122	java/io/ByteArrayOutputStream:size	()I
    //   203: ifle +50 -> 253
    //   206: aload 7
    //   208: invokevirtual 126	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   211: astore 12
    //   213: aload_0
    //   214: getfield 13	net/youmi/android/di:h	Lnet/youmi/android/ed;
    //   217: ifnull +21 -> 238
    //   220: aload_0
    //   221: getfield 13	net/youmi/android/di:h	Lnet/youmi/android/ed;
    //   224: aload_0
    //   225: getfield 19	net/youmi/android/di:e	Landroid/content/Context;
    //   228: aload_0
    //   229: getfield 42	net/youmi/android/di:a	Ljava/lang/String;
    //   232: aload 12
    //   234: invokevirtual 129	net/youmi/android/ed:a	(Landroid/content/Context;Ljava/lang/String;[B)Z
    //   237: pop
    //   238: aload_0
    //   239: aload 12
    //   241: invokevirtual 131	net/youmi/android/di:a	([B)Z
    //   244: ifeq +73 -> 317
    //   247: aload_0
    //   248: bipush 6
    //   250: putfield 60	net/youmi/android/di:f	I
    //   253: aload 6
    //   255: invokevirtual 134	java/io/InputStream:close	()V
    //   258: aload 7
    //   260: invokevirtual 135	java/io/ByteArrayOutputStream:close	()V
    //   263: aload_0
    //   264: invokevirtual 63	net/youmi/android/di:i	()V
    //   267: aload_0
    //   268: getfield 60	net/youmi/android/di:f	I
    //   271: ireturn
    //   272: aload_0
    //   273: iconst_5
    //   274: putfield 60	net/youmi/android/di:f	I
    //   277: aload_0
    //   278: aload_0
    //   279: getfield 138	net/youmi/android/di:d	J
    //   282: iload 9
    //   284: i2l
    //   285: ladd
    //   286: putfield 138	net/youmi/android/di:d	J
    //   289: aload 7
    //   291: aload 8
    //   293: iconst_0
    //   294: iload 9
    //   296: invokevirtual 142	java/io/ByteArrayOutputStream:write	([BII)V
    //   299: goto -121 -> 178
    //   302: astore_1
    //   303: aload_0
    //   304: iconst_4
    //   305: putfield 60	net/youmi/android/di:f	I
    //   308: aload_0
    //   309: invokevirtual 63	net/youmi/android/di:i	()V
    //   312: aload_0
    //   313: getfield 60	net/youmi/android/di:f	I
    //   316: ireturn
    //   317: aload_0
    //   318: bipush 7
    //   320: putfield 60	net/youmi/android/di:f	I
    //   323: goto -70 -> 253
    //   326: aload_0
    //   327: bipush 7
    //   329: putfield 60	net/youmi/android/di:f	I
    //   332: aload_0
    //   333: invokevirtual 63	net/youmi/android/di:i	()V
    //   336: aload_0
    //   337: getfield 60	net/youmi/android/di:f	I
    //   340: istore 4
    //   342: iload 4
    //   344: ireturn
    //   345: astore 10
    //   347: goto -89 -> 258
    //   350: astore 11
    //   352: goto -89 -> 263
    //   355: astore 13
    //   357: goto -119 -> 238
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	360	0	this	di
    //   302	1	1	localException1	java.lang.Exception
    //   68	2	2	localException2	java.lang.Exception
    //   91	19	3	localHttpResponse	org.apache.http.HttpResponse
    //   340	3	4	i	int
    //   115	14	5	localHttpEntity	org.apache.http.HttpEntity
    //   135	119	6	localInputStream	java.io.InputStream
    //   169	121	7	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   176	116	8	arrayOfByte1	byte[]
    //   185	110	9	j	int
    //   345	1	10	localException3	java.lang.Exception
    //   350	1	11	localException4	java.lang.Exception
    //   211	29	12	arrayOfByte2	byte[]
    //   355	1	13	localException5	java.lang.Exception
    //   30	12	15	localFile	File
    //   63	3	16	k	int
    // Exception table:
    //   from	to	target	type
    //   5	65	68	java/lang/Exception
    //   0	5	302	java/lang/Exception
    //   69	73	302	java/lang/Exception
    //   73	137	302	java/lang/Exception
    //   142	157	302	java/lang/Exception
    //   157	178	302	java/lang/Exception
    //   178	187	302	java/lang/Exception
    //   192	213	302	java/lang/Exception
    //   238	253	302	java/lang/Exception
    //   263	272	302	java/lang/Exception
    //   272	299	302	java/lang/Exception
    //   317	323	302	java/lang/Exception
    //   326	342	302	java/lang/Exception
    //   253	258	345	java/lang/Exception
    //   258	263	350	java/lang/Exception
    //   213	238	355	java/lang/Exception
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.di
 * JD-Core Version:    0.7.0.1
 */