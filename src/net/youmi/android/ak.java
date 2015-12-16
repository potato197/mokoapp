package net.youmi.android;

import android.content.Context;

class ak
{
  private static cu a;
  private static String b;
  
  static cu a()
  {
    return a;
  }
  
  /* Error */
  static void a(android.app.Activity paramActivity, AdView paramAdView)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: invokestatic 24	java/lang/System:currentTimeMillis	()J
    //   6: lstore 5
    //   8: lload 5
    //   10: invokestatic 29	net/youmi/android/eh:a	(J)Z
    //   13: istore 7
    //   15: iload 7
    //   17: ifeq +83 -> 100
    //   20: aload_1
    //   21: getstatic 15	net/youmi/android/ak:a	Lnet/youmi/android/cu;
    //   24: invokevirtual 34	net/youmi/android/AdView:a	(Lnet/youmi/android/cu;)V
    //   27: lload 5
    //   29: invokestatic 37	net/youmi/android/eh:b	(J)V
    //   32: iconst_1
    //   33: invokestatic 40	net/youmi/android/eh:a	(Z)V
    //   36: aload_0
    //   37: aload_1
    //   38: invokestatic 45	net/youmi/android/av:a	(Landroid/content/Context;Lnet/youmi/android/AdView;)Lnet/youmi/android/cu;
    //   41: astore 10
    //   43: aload 10
    //   45: ifnull +14 -> 59
    //   48: aload 10
    //   50: putstatic 15	net/youmi/android/ak:a	Lnet/youmi/android/cu;
    //   53: invokestatic 24	java/lang/System:currentTimeMillis	()J
    //   56: invokestatic 48	net/youmi/android/eh:c	(J)V
    //   59: iconst_0
    //   60: invokestatic 40	net/youmi/android/eh:a	(Z)V
    //   63: getstatic 15	net/youmi/android/ak:a	Lnet/youmi/android/cu;
    //   66: ifnull +25 -> 91
    //   69: aload_1
    //   70: getstatic 15	net/youmi/android/ak:a	Lnet/youmi/android/cu;
    //   73: invokevirtual 34	net/youmi/android/AdView:a	(Lnet/youmi/android/cu;)V
    //   76: aload_0
    //   77: getstatic 15	net/youmi/android/ak:a	Lnet/youmi/android/cu;
    //   80: invokestatic 51	net/youmi/android/av:a	(Landroid/app/Activity;Lnet/youmi/android/cu;)V
    //   83: aload_0
    //   84: aload_1
    //   85: getstatic 15	net/youmi/android/ak:a	Lnet/youmi/android/cu;
    //   88: invokestatic 54	net/youmi/android/av:a	(Landroid/app/Activity;Lnet/youmi/android/AdView;Lnet/youmi/android/cu;)V
    //   91: aload_0
    //   92: aload_1
    //   93: invokestatic 58	net/youmi/android/eu:a	(Landroid/app/Activity;Lnet/youmi/android/AdView;)V
    //   96: ldc 2
    //   98: monitorexit
    //   99: return
    //   100: aload_1
    //   101: getstatic 15	net/youmi/android/ak:a	Lnet/youmi/android/cu;
    //   104: invokevirtual 34	net/youmi/android/AdView:a	(Lnet/youmi/android/cu;)V
    //   107: goto -16 -> 91
    //   110: astore_3
    //   111: goto -20 -> 91
    //   114: astore 4
    //   116: goto -20 -> 96
    //   119: astore_2
    //   120: ldc 2
    //   122: monitorexit
    //   123: aload_2
    //   124: athrow
    //   125: astore 9
    //   127: goto -68 -> 59
    //   130: astore 8
    //   132: goto -105 -> 27
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	paramActivity	android.app.Activity
    //   0	135	1	paramAdView	AdView
    //   119	5	2	localObject	Object
    //   110	1	3	localException1	Exception
    //   114	1	4	localException2	Exception
    //   6	22	5	l	long
    //   13	3	7	bool	boolean
    //   130	1	8	localException3	Exception
    //   125	1	9	localException4	Exception
    //   41	8	10	localcu	cu
    // Exception table:
    //   from	to	target	type
    //   3	15	110	java/lang/Exception
    //   27	36	110	java/lang/Exception
    //   59	91	110	java/lang/Exception
    //   100	107	110	java/lang/Exception
    //   91	96	114	java/lang/Exception
    //   3	15	119	finally
    //   20	27	119	finally
    //   27	36	119	finally
    //   36	43	119	finally
    //   48	59	119	finally
    //   59	91	119	finally
    //   91	96	119	finally
    //   100	107	119	finally
    //   36	43	125	java/lang/Exception
    //   48	59	125	java/lang/Exception
    //   20	27	130	java/lang/Exception
  }
  
  static void a(Context paramContext, cu paramcu)
  {
    if (paramcu == null) {}
    while (paramcu.s()) {
      return;
    }
    paramcu.v();
    try
    {
      new Thread(new ab(paramContext, paramcu)).start();
      return;
    }
    catch (Exception localException) {}
  }
  
  static void a(String paramString)
  {
    b = paramString;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ak
 * JD-Core Version:    0.7.0.1
 */