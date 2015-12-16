package net.youmi.android;

class ej
{
  /* Error */
  static boolean a(java.io.File paramFile1, java.io.File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokevirtual 18	java/io/File:exists	()Z
    //   6: istore 4
    //   8: iconst_0
    //   9: istore 5
    //   11: iload 4
    //   13: ifeq +74 -> 87
    //   16: new 20	java/io/FileInputStream
    //   19: dup
    //   20: aload_0
    //   21: invokespecial 23	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   24: astore 6
    //   26: new 25	java/io/FileOutputStream
    //   29: dup
    //   30: aload_1
    //   31: invokespecial 26	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   34: astore 7
    //   36: sipush 1024
    //   39: newarray byte
    //   41: astore 16
    //   43: aload 6
    //   45: aload 16
    //   47: invokevirtual 32	java/io/InputStream:read	([B)I
    //   50: istore 20
    //   52: iload 20
    //   54: ifgt +36 -> 90
    //   57: aload 7
    //   59: ifnull +8 -> 67
    //   62: aload 7
    //   64: invokevirtual 37	java/io/OutputStream:close	()V
    //   67: aload 6
    //   69: ifnull +8 -> 77
    //   72: aload 6
    //   74: invokevirtual 38	java/io/InputStream:close	()V
    //   77: aload_1
    //   78: invokevirtual 18	java/io/File:exists	()Z
    //   81: istore 10
    //   83: iload 10
    //   85: istore 5
    //   87: iload 5
    //   89: ireturn
    //   90: aload 7
    //   92: aload 16
    //   94: iconst_0
    //   95: iload 20
    //   97: invokevirtual 42	java/io/OutputStream:write	([BII)V
    //   100: goto -57 -> 43
    //   103: astore 17
    //   105: goto -48 -> 57
    //   108: astore 21
    //   110: aconst_null
    //   111: astore 7
    //   113: aload 7
    //   115: ifnull +8 -> 123
    //   118: aload 7
    //   120: invokevirtual 37	java/io/OutputStream:close	()V
    //   123: aload 6
    //   125: ifnull -48 -> 77
    //   128: aload 6
    //   130: invokevirtual 38	java/io/InputStream:close	()V
    //   133: goto -56 -> 77
    //   136: astore 9
    //   138: goto -61 -> 77
    //   141: astore 13
    //   143: aload_2
    //   144: ifnull +7 -> 151
    //   147: aload_2
    //   148: invokevirtual 37	java/io/OutputStream:close	()V
    //   151: aload 6
    //   153: ifnull +8 -> 161
    //   156: aload 6
    //   158: invokevirtual 38	java/io/InputStream:close	()V
    //   161: aload 13
    //   163: athrow
    //   164: astore_3
    //   165: iconst_0
    //   166: ireturn
    //   167: astore 11
    //   169: goto -46 -> 123
    //   172: astore 15
    //   174: goto -23 -> 151
    //   177: astore 14
    //   179: goto -18 -> 161
    //   182: astore 19
    //   184: goto -117 -> 67
    //   187: astore 18
    //   189: goto -112 -> 77
    //   192: astore 12
    //   194: aload 7
    //   196: astore_2
    //   197: aload 12
    //   199: astore 13
    //   201: goto -58 -> 143
    //   204: astore 8
    //   206: goto -93 -> 113
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	paramFile1	java.io.File
    //   0	209	1	paramFile2	java.io.File
    //   1	196	2	localObject1	Object
    //   164	1	3	localException1	java.lang.Exception
    //   6	6	4	bool1	boolean
    //   9	79	5	bool2	boolean
    //   24	133	6	localFileInputStream	java.io.FileInputStream
    //   34	161	7	localFileOutputStream	java.io.FileOutputStream
    //   204	1	8	localException2	java.lang.Exception
    //   136	1	9	localException3	java.lang.Exception
    //   81	3	10	bool3	boolean
    //   167	1	11	localException4	java.lang.Exception
    //   192	6	12	localObject2	Object
    //   141	21	13	localObject3	Object
    //   199	1	13	localObject4	Object
    //   177	1	14	localException5	java.lang.Exception
    //   172	1	15	localException6	java.lang.Exception
    //   41	52	16	arrayOfByte	byte[]
    //   103	1	17	localException7	java.lang.Exception
    //   187	1	18	localException8	java.lang.Exception
    //   182	1	19	localException9	java.lang.Exception
    //   50	46	20	i	int
    //   108	1	21	localException10	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   43	52	103	java/lang/Exception
    //   90	100	103	java/lang/Exception
    //   26	36	108	java/lang/Exception
    //   128	133	136	java/lang/Exception
    //   26	36	141	finally
    //   2	8	164	java/lang/Exception
    //   16	26	164	java/lang/Exception
    //   77	83	164	java/lang/Exception
    //   161	164	164	java/lang/Exception
    //   118	123	167	java/lang/Exception
    //   147	151	172	java/lang/Exception
    //   156	161	177	java/lang/Exception
    //   62	67	182	java/lang/Exception
    //   72	77	187	java/lang/Exception
    //   36	43	192	finally
    //   43	52	192	finally
    //   90	100	192	finally
    //   36	43	204	java/lang/Exception
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ej
 * JD-Core Version:    0.7.0.1
 */