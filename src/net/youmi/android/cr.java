package net.youmi.android;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

class cr
{
  private byte[] a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private final Vector p = new Vector();
  private int q = 0;
  private final int[] r = new int[4];
  private int s;
  private int[] t;
  private byte[] u;
  private final int[] v = new int[256];
  private final byte[] w = new byte[256];
  private final short[] x = new short[4096];
  private final byte[] y = new byte[4096];
  private final byte[] z = new byte[4097];
  
  cr(InputStream paramInputStream)
  {
    a(paramInputStream);
  }
  
  cr(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  cr(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    g();
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    for (int i1 = 0;; i1++)
    {
      if (i1 >= paramInt2) {
        return;
      }
      byte[] arrayOfByte1 = this.a;
      int i2 = paramInt1 + 1;
      int i3 = (0xFF & arrayOfByte1[paramInt1]) << 8;
      byte[] arrayOfByte2 = this.a;
      int i4 = i2 + 1;
      int i5 = i3 + (0xFF & arrayOfByte2[i2]) << 8;
      byte[] arrayOfByte3 = this.a;
      paramInt1 = i4 + 1;
      int i6 = i5 + (0xFF & arrayOfByte3[i4]);
      this.v[i1] = (i6 | 0xFF000000);
    }
  }
  
  private final void a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramInputStream.available());
    byte[] arrayOfByte = new byte[1024];
    for (;;)
    {
      int i1 = paramInputStream.read(arrayOfByte);
      if (i1 == -1)
      {
        this.a = localByteArrayOutputStream.toByteArray();
        this.b = 0;
      }
      try
      {
        paramInputStream.close();
        localByteArrayOutputStream.close();
        label52:
        g();
        return;
        localByteArrayOutputStream.write(arrayOfByte, 0, i1);
      }
      catch (Exception localException)
      {
        break label52;
      }
    }
  }
  
  private final void a(x paramx, int[] paramArrayOfInt)
  {
    paramx.a();
    int i1;
    int i2;
    int i3;
    if (paramx.e == 1)
    {
      a(paramx.k, paramx.j);
      int[] arrayOfInt = paramx.n;
      i1 = 0;
      i2 = 0;
      i3 = 0;
      if (arrayOfInt != null)
      {
        int i19 = arrayOfInt[3];
        i1 = 0;
        i2 = 0;
        i3 = 0;
        if (i19 == 1)
        {
          i3 = 1;
          i2 = arrayOfInt[5];
          i1 = this.v[i2];
          this.v[i2] = 0;
        }
      }
      if (paramx.f != 1) {
        break label165;
      }
    }
    int i5;
    int i7;
    int i8;
    int i9;
    int i10;
    label165:
    for (int i4 = 1;; i4 = 0)
    {
      i5 = paramx.c;
      int i6 = paramx.d;
      i7 = paramx.a;
      i8 = paramx.b;
      i9 = 0;
      i10 = 0;
      if (i9 < i6) {
        break label171;
      }
      if (i3 != 0) {
        this.v[i2] = i1;
      }
      return;
      a(this.m, this.l);
      break;
    }
    label171:
    if (i4 == 0) {
      i10 = i8 + i9;
    }
    int i13;
    int i14;
    int i15;
    if (i10 < this.d)
    {
      int i11 = i10 * this.c;
      int i12 = i11 + i7;
      i13 = i12 + i5;
      if (i11 + this.c < i13) {
        i13 = i11 + this.c;
      }
      i14 = i9 * i5;
      i15 = i12;
    }
    for (;;)
    {
      if (i15 >= i13)
      {
        i9++;
        break;
      }
      byte[] arrayOfByte = this.u;
      int i16 = i14 + 1;
      int i17 = 0xFF & arrayOfByte[i14];
      int i18 = this.v[i17];
      if (i18 != 0) {
        paramArrayOfInt[i15] = i18;
      }
      i15++;
      i14 = i16;
    }
  }
  
  private final void b(int paramInt)
  {
    if (this.t == null) {
      this.t = new int[this.c * this.d];
    }
    x localx = (x)this.p.elementAt(paramInt);
    int[] arrayOfInt = localx.n;
    int i3;
    if ((this.q > 0) && (this.q == 2))
    {
      if ((arrayOfInt == null) || (arrayOfInt[3] != 1)) {
        break label237;
      }
      i3 = this.r[1];
      if (i3 < this.r[3]) {}
    }
    else
    {
      a(localx, this.t);
      this.s = this.j;
      this.q = 0;
      if (arrayOfInt != null)
      {
        this.q = arrayOfInt[1];
        if ((localx.e == 0) && (this.i == arrayOfInt[5])) {
          this.s = 0;
        }
      }
      this.r[0] = localx.a;
      this.r[1] = localx.b;
      this.r[2] = (localx.a + localx.c);
      this.r[3] = (localx.b + localx.d);
      return;
    }
    for (int i4 = this.r[0];; i4++)
    {
      if (i4 >= this.r[2])
      {
        i3++;
        break;
      }
      this.t[(i4 + i3 * this.c)] = 0;
    }
    label237:
    int i1 = this.r[1];
    label245:
    if (i1 < this.r[3]) {}
    for (int i2 = this.r[0];; i2++)
    {
      if (i2 >= this.r[2])
      {
        i1++;
        break label245;
        break;
      }
      this.t[(i2 + i1 * this.c)] = this.s;
    }
  }
  
  private final void g()
  {
    if (!(new StringBuilder(String.valueOf(new StringBuilder(String.valueOf("")).append((char)this.a[this.b]).toString())).append((char)this.a[(1 + this.b)]).toString() + (char)this.a[(2 + this.b)]).equalsIgnoreCase("GIF")) {
      throw new IOException("this is not a gif image");
    }
    String str = new StringBuilder(String.valueOf(new StringBuilder(String.valueOf("")).append((char)this.a[(3 + this.b)]).toString())).append((char)this.a[(4 + this.b)]).toString() + (char)this.a[(5 + this.b)];
    if ((!str.equalsIgnoreCase("87a")) && (!str.equalsIgnoreCase("89a"))) {
      throw new IOException("this is not a gif image");
    }
    this.b = (6 + this.b);
    this.c = al.a(this.a, this.b, 2);
    this.d = al.a(this.a, 2 + this.b, 2);
    this.e = al.a(this.a[(4 + this.b)], 7, 1);
    this.f = al.a(this.a[(4 + this.b)], 4, 3);
    this.g = al.a(this.a[(4 + this.b)], 3, 1);
    this.h = al.a(this.a[(4 + this.b)], 0, 3);
    this.i = (0xFF & this.a[(5 + this.b)]);
    this.k = (0xFF & this.a[(6 + this.b)]);
    this.b = (7 + this.b);
    if (this.e == 1)
    {
      this.m = this.b;
      this.l = (1 << 1 + this.h);
      this.b += 3 * this.l;
      a(this.m, this.l);
      this.j = this.v[this.i];
    }
    int[] arrayOfInt1 = (int[])null;
    this.n = 0;
    int[] arrayOfInt2 = arrayOfInt1;
    int i1 = 0;
    for (;;)
    {
      if (i1 != 0) {}
      int i3;
      do
      {
        return;
        byte[] arrayOfByte1 = this.a;
        int i2 = this.b;
        this.b = (i2 + 1);
        i3 = 0xFF & arrayOfByte1[i2];
      } while (i3 == -1);
      switch (i3)
      {
      default: 
        break;
      case 33: 
        byte[] arrayOfByte2 = this.a;
        int i4 = this.b;
        this.b = (i4 + 1);
        switch (0xFF & arrayOfByte2[i4])
        {
        default: 
          h();
        }
        break;
      case 44: 
        x localx = new x(this);
        x.a(localx);
        localx.n = arrayOfInt2;
        this.p.addElement(localx);
        this.n = (1 + this.n);
        continue;
        arrayOfInt2 = i();
        break;
      case 59: 
        i1 = 1;
      }
    }
  }
  
  private final void h()
  {
    byte[] arrayOfByte1 = this.a;
    int i1 = this.b;
    this.b = (i1 + 1);
    byte[] arrayOfByte2;
    int i3;
    for (int i2 = 0xFF & arrayOfByte1[i1];; i2 = 0xFF & arrayOfByte2[i3])
    {
      if (i2 <= 0) {
        return;
      }
      this.b = (i2 + this.b);
      arrayOfByte2 = this.a;
      i3 = this.b;
      this.b = (i3 + 1);
    }
  }
  
  private final int[] i()
  {
    byte[] arrayOfByte = this.a;
    int i1 = this.b;
    this.b = (i1 + 1);
    int i2 = 0xFF & arrayOfByte[i1];
    if (i2 != 4) {
      throw new IOException("parse graphics extend block error");
    }
    int[] arrayOfInt = new int[6];
    arrayOfInt[0] = al.a(this.a[this.b], 5, 3);
    arrayOfInt[1] = al.a(this.a[this.b], 2, 3);
    arrayOfInt[2] = al.a(this.a[this.b], 1, 1);
    arrayOfInt[3] = al.a(this.a[this.b], 0, 1);
    arrayOfInt[4] = (10 * al.a(this.a, 1 + this.b, 2));
    arrayOfInt[5] = al.a(this.a, 3 + this.b, 1);
    this.b = (i2 + this.b);
    return arrayOfInt;
  }
  
  final int a()
  {
    return this.c;
  }
  
  final int a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.n)) {
      throw new IllegalArgumentException("the frame[ " + paramInt + " ]is invalid");
    }
    int[] arrayOfInt = ((x)this.p.elementAt(paramInt)).n;
    if (arrayOfInt != null) {
      return arrayOfInt[4];
    }
    return 0;
  }
  
  final int b()
  {
    return this.d;
  }
  
  final int c()
  {
    return this.n;
  }
  
  final int[] d()
  {
    int i1 = this.o;
    this.o = (i1 + 1);
    b(i1);
    if (this.o >= this.n) {
      this.o = 0;
    }
    return this.t;
  }
  
  /* Error */
  final android.graphics.Bitmap e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 243	net/youmi/android/cr:d	()[I
    //   6: astore 4
    //   8: aconst_null
    //   9: astore_2
    //   10: aload 4
    //   12: ifnull +24 -> 36
    //   15: aload 4
    //   17: aload_0
    //   18: invokevirtual 245	net/youmi/android/cr:a	()I
    //   21: aload_0
    //   22: invokevirtual 247	net/youmi/android/cr:b	()I
    //   25: getstatic 253	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   28: invokestatic 259	android/graphics/Bitmap:createBitmap	([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   31: astore 5
    //   33: aload 5
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: areturn
    //   40: astore_3
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_3
    //   44: athrow
    //   45: astore_1
    //   46: aconst_null
    //   47: astore_2
    //   48: goto -12 -> 36
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	51	0	this	cr
    //   45	1	1	localException	Exception
    //   9	39	2	localObject1	Object
    //   40	4	3	localObject2	Object
    //   6	10	4	arrayOfInt	int[]
    //   31	3	5	localBitmap	android.graphics.Bitmap
    // Exception table:
    //   from	to	target	type
    //   2	8	40	finally
    //   15	33	40	finally
    //   2	8	45	java/lang/Exception
    //   15	33	45	java/lang/Exception
  }
  
  final int f()
  {
    int i1 = -1 + this.o;
    if (i1 < 0) {
      i1 = -1 + this.n;
    }
    return a(i1);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cr
 * JD-Core Version:    0.7.0.1
 */