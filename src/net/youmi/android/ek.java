package net.youmi.android;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class ek
  extends AsyncTask
{
  private boolean a = false;
  private bx b;
  
  ek(bx parambx)
  {
    this.b = parambx;
  }
  
  /* Error */
  protected Integer a(cr... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 17	net/youmi/android/ek:b	Lnet/youmi/android/bx;
    //   4: ifnonnull +8 -> 12
    //   7: iconst_2
    //   8: invokestatic 26	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   11: areturn
    //   12: aload_1
    //   13: ifnonnull +8 -> 21
    //   16: iconst_0
    //   17: invokestatic 26	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   20: areturn
    //   21: aload_1
    //   22: arraylength
    //   23: ifne +8 -> 31
    //   26: iconst_0
    //   27: invokestatic 26	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: areturn
    //   31: aload_1
    //   32: iconst_0
    //   33: aaload
    //   34: astore_3
    //   35: aload_3
    //   36: ifnonnull +8 -> 44
    //   39: iconst_0
    //   40: invokestatic 26	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   43: areturn
    //   44: aload_0
    //   45: iconst_1
    //   46: putfield 15	net/youmi/android/ek:a	Z
    //   49: aload_0
    //   50: getfield 15	net/youmi/android/ek:a	Z
    //   53: ifne +8 -> 61
    //   56: iconst_1
    //   57: invokestatic 26	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   60: areturn
    //   61: aload_0
    //   62: getfield 17	net/youmi/android/ek:b	Lnet/youmi/android/bx;
    //   65: ifnonnull +12 -> 77
    //   68: iconst_2
    //   69: invokestatic 26	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   72: astore 9
    //   74: aload 9
    //   76: areturn
    //   77: aload_0
    //   78: iconst_1
    //   79: anewarray 28	android/graphics/Bitmap
    //   82: dup
    //   83: iconst_0
    //   84: aload_3
    //   85: invokevirtual 34	net/youmi/android/cr:e	()Landroid/graphics/Bitmap;
    //   88: aastore
    //   89: invokevirtual 38	net/youmi/android/ek:publishProgress	([Ljava/lang/Object;)V
    //   92: aload_3
    //   93: invokevirtual 42	net/youmi/android/cr:f	()I
    //   96: istore 6
    //   98: iload 6
    //   100: sipush 150
    //   103: if_icmpge +42 -> 145
    //   106: ldc2_w 43
    //   109: invokestatic 50	java/lang/Thread:sleep	(J)V
    //   112: goto -63 -> 49
    //   115: astore 5
    //   117: aload 5
    //   119: invokestatic 55	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   122: goto -73 -> 49
    //   125: astore_2
    //   126: aload_2
    //   127: invokestatic 55	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   130: iconst_3
    //   131: invokestatic 26	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   134: areturn
    //   135: astore 4
    //   137: aload 4
    //   139: invokestatic 55	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   142: goto -50 -> 92
    //   145: iload 6
    //   147: i2l
    //   148: lstore 7
    //   150: lload 7
    //   152: invokestatic 50	java/lang/Thread:sleep	(J)V
    //   155: goto -106 -> 49
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	158	0	this	ek
    //   0	158	1	paramVarArgs	cr[]
    //   125	2	2	localException1	Exception
    //   34	59	3	localcr	cr
    //   135	3	4	localException2	Exception
    //   115	3	5	localException3	Exception
    //   96	50	6	i	int
    //   148	3	7	l	long
    //   72	3	9	localInteger	Integer
    // Exception table:
    //   from	to	target	type
    //   92	98	115	java/lang/Exception
    //   106	112	115	java/lang/Exception
    //   150	155	115	java/lang/Exception
    //   0	12	125	java/lang/Exception
    //   16	21	125	java/lang/Exception
    //   21	31	125	java/lang/Exception
    //   31	35	125	java/lang/Exception
    //   39	44	125	java/lang/Exception
    //   44	49	125	java/lang/Exception
    //   49	61	125	java/lang/Exception
    //   61	74	125	java/lang/Exception
    //   117	122	125	java/lang/Exception
    //   137	142	125	java/lang/Exception
    //   77	92	135	java/lang/Exception
  }
  
  void a()
  {
    this.a = false;
  }
  
  protected void a(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
  }
  
  protected void a(Bitmap... paramVarArgs)
  {
    super.onProgressUpdate(paramVarArgs);
    try
    {
      if ((this.b != null) && (paramVarArgs != null) && (paramVarArgs.length > 0)) {
        this.b.a(paramVarArgs[0]);
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ek
 * JD-Core Version:    0.7.0.1
 */