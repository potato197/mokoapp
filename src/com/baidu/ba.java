package com.baidu;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class ba
  extends Thread
{
  private Bitmap A;
  private bb B = null;
  private boolean C = false;
  private byte[] D = new byte[256];
  private int E = 0;
  private int F = 0;
  private int G = 0;
  private boolean H = false;
  private int I = 0;
  private int J;
  private short[] K;
  private byte[] L;
  private byte[] M;
  private byte[] N;
  private bb O;
  private int P;
  private az Q = null;
  private byte[] R = null;
  public int a;
  public int b;
  private InputStream c;
  private int d;
  private boolean e;
  private int f;
  private int g = 1;
  private int[] h;
  private int[] i;
  private int[] j;
  private int k;
  private int l;
  private int m;
  private int n;
  private boolean o;
  private boolean p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private Bitmap z;
  
  public ba(byte[] paramArrayOfByte, az paramaz)
  {
    this.R = paramArrayOfByte;
    this.Q = paramaz;
  }
  
  private int[] c(int paramInt)
  {
    int i1 = 0;
    int i2 = paramInt * 3;
    int[] arrayOfInt = null;
    byte[] arrayOfByte = new byte[i2];
    try
    {
      int i11 = this.c.read(arrayOfByte);
      i3 = i11;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        int i3 = 0;
      }
      arrayOfInt = new int[256];
      i4 = 0;
    }
    if (i3 < i2) {
      this.d = 1;
    }
    for (;;)
    {
      return arrayOfInt;
      int i4;
      while (i1 < paramInt)
      {
        int i5 = i4 + 1;
        int i6 = 0xFF & arrayOfByte[i4];
        int i7 = i5 + 1;
        int i8 = 0xFF & arrayOfByte[i5];
        i4 = i7 + 1;
        int i9 = 0xFF & arrayOfByte[i7];
        int i10 = i1 + 1;
        arrayOfInt[i1] = (i9 | 0xFF000000 | i6 << 16 | i8 << 8);
        i1 = i10;
      }
    }
  }
  
  private void e()
  {
    int i1 = 0;
    int[] arrayOfInt = new int[this.a * this.b];
    if (this.G > 0) {
      if (this.G == 3)
      {
        int i21 = -2 + this.P;
        if (i21 > 0) {
          this.A = a(i21 - 1);
        }
      }
      else
      {
        if (this.A == null) {
          break label179;
        }
        this.A.getPixels(arrayOfInt, 0, this.a, 0, 0, this.a, this.b);
        if (this.G != 2) {
          break label179;
        }
        if (this.H) {
          break label454;
        }
      }
    }
    label179:
    label448:
    label454:
    for (int i17 = this.m;; i17 = 0)
    {
      for (int i18 = 0;; i18++)
      {
        if (i18 >= this.y) {
          break label179;
        }
        int i19 = (i18 + this.w) * this.a + this.v;
        int i20 = i19 + this.x;
        for (;;)
        {
          if (i19 < i20)
          {
            arrayOfInt[i19] = i17;
            i19++;
            continue;
            this.A = null;
            break;
          }
        }
      }
      int i2 = 8;
      int i3 = 1;
      int i4 = 0;
      int i16;
      if (i1 < this.u)
      {
        if (!this.p) {
          break label448;
        }
        if (i4 >= this.u) {
          i3++;
        }
        switch (i3)
        {
        default: 
          int i15 = i4 + i2;
          i16 = i4;
          i4 = i15;
        }
      }
      for (int i5 = i16;; i5 = i1)
      {
        int i6 = i5 + this.s;
        if (i6 < this.b)
        {
          int i7 = i6 * this.a;
          int i8 = i7 + this.r;
          int i9 = i8 + this.t;
          if (i7 + this.a < i9) {
            i9 = i7 + this.a;
          }
          int i10 = i1 * this.t;
          int i11 = i8;
          for (;;)
          {
            if (i11 < i9)
            {
              byte[] arrayOfByte = this.N;
              int i12 = i10 + 1;
              int i13 = 0xFF & arrayOfByte[i10];
              int i14 = this.j[i13];
              if (i14 != 0) {
                arrayOfInt[i11] = i14;
              }
              i11++;
              i10 = i12;
              continue;
              i4 = 4;
              break;
              i4 = 2;
              i2 = 4;
              break;
              i4 = 1;
              i2 = 2;
              break;
            }
          }
        }
        i1++;
        break;
        this.z = Bitmap.createBitmap(arrayOfInt, this.a, this.b, Bitmap.Config.ARGB_4444);
        return;
      }
    }
  }
  
  private int f()
  {
    this.c = new ByteArrayInputStream(this.R);
    this.R = null;
    return g();
  }
  
  private int g()
  {
    j();
    if (this.c != null)
    {
      o();
      if (!i())
      {
        m();
        if (this.P >= 0) {
          break label61;
        }
        this.d = 1;
        this.Q.a(false, -1);
      }
    }
    for (;;)
    {
      try
      {
        this.c.close();
        return this.d;
        label61:
        this.d = -1;
        this.Q.a(true, -1);
        continue;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
      }
      this.d = 2;
      this.Q.a(false, -1);
    }
  }
  
  private void h()
  {
    int i1 = this.t * this.u;
    if ((this.N == null) || (this.N.length < i1)) {
      this.N = new byte[i1];
    }
    if (this.K == null) {
      this.K = new short[4096];
    }
    if (this.L == null) {
      this.L = new byte[4096];
    }
    if (this.M == null) {
      this.M = new byte[4097];
    }
    int i2 = k();
    int i3 = 1 << i2;
    int i4 = i3 + 1;
    int i5 = i3 + 2;
    int i6 = i2 + 1;
    int i7 = -1 + (1 << i6);
    for (int i8 = 0; i8 < i3; i8++)
    {
      this.K[i8] = 0;
      this.L[i8] = ((byte)i8);
    }
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = -1;
    int i17 = 0;
    if (i13 < i1)
    {
      if (i10 != 0) {
        break label661;
      }
      if (i15 >= i6) {
        break label265;
      }
      if (i14 != 0) {
        break label234;
      }
      i14 = l();
      if (i14 > 0) {
        break label231;
      }
    }
    label231:
    label234:
    int i30;
    label265:
    int i31;
    int i32;
    label406:
    int i33;
    do
    {
      do
      {
        for (int i18 = i9; i18 < i1; i18++) {
          this.N[i18] = 0;
        }
        i17 = 0;
        i12 += ((0xFF & this.D[i17]) << i15);
        i15 += 8;
        i17++;
        i14--;
        break;
        i30 = i12 & i7;
        i12 >>= i6;
        i15 -= i6;
      } while ((i30 > i5) || (i30 == i4));
      if (i30 == i3)
      {
        i6 = i2 + 1;
        i7 = -1 + (1 << i6);
        i5 = i3 + 2;
        i16 = -1;
        break;
      }
      if (i16 == -1)
      {
        byte[] arrayOfByte5 = this.M;
        int i36 = i10 + 1;
        arrayOfByte5[i10] = this.L[i30];
        i10 = i36;
        i16 = i30;
        i11 = i30;
        break;
      }
      if (i30 != i5) {
        break label650;
      }
      byte[] arrayOfByte4 = this.M;
      i31 = i10 + 1;
      arrayOfByte4[i10] = ((byte)i11);
      i32 = i16;
      while (i32 > i3)
      {
        byte[] arrayOfByte3 = this.M;
        int i35 = i31 + 1;
        arrayOfByte3[i31] = this.L[i32];
        i32 = this.K[i32];
        i31 = i35;
      }
      i33 = 0xFF & this.L[i32];
    } while (i5 >= 4096);
    byte[] arrayOfByte2 = this.M;
    int i34 = i31 + 1;
    arrayOfByte2[i31] = ((byte)i33);
    this.K[i5] = ((short)i16);
    this.L[i5] = ((byte)i33);
    int i26 = i5 + 1;
    if (((i26 & i7) == 0) && (i26 < 4096))
    {
      i6++;
      i7 += i26;
    }
    int i24 = i12;
    int i25 = i30;
    int i19 = i7;
    int i20 = i33;
    int i21 = i15;
    int i22 = i6;
    int i23 = i34;
    for (;;)
    {
      int i27 = i23 - 1;
      byte[] arrayOfByte1 = this.N;
      int i28 = i9 + 1;
      arrayOfByte1[i9] = this.M[i27];
      i13++;
      i9 = i28;
      i6 = i22;
      i15 = i21;
      i11 = i20;
      i7 = i19;
      int i29 = i25;
      i12 = i24;
      i10 = i27;
      i5 = i26;
      i16 = i29;
      break;
      return;
      label650:
      i31 = i10;
      i32 = i30;
      break label406;
      label661:
      i19 = i7;
      i20 = i11;
      i21 = i15;
      i22 = i6;
      i23 = i10;
      i24 = i12;
      i25 = i16;
      i26 = i5;
    }
  }
  
  private boolean i()
  {
    return this.d != 0;
  }
  
  private void j()
  {
    this.d = 0;
    this.P = 0;
    this.O = null;
    this.h = null;
    this.i = null;
  }
  
  private int k()
  {
    try
    {
      int i1 = this.c.read();
      return i1;
    }
    catch (Exception localException)
    {
      this.d = 1;
    }
    return 0;
  }
  
  private int l()
  {
    this.E = k();
    int i1 = this.E;
    int i2 = 0;
    if (i1 > 0) {}
    for (;;)
    {
      try
      {
        if (i2 < this.E)
        {
          i3 = this.c.read(this.D, i2, this.E - i2);
          if (i3 != -1) {
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        int i3;
        localException.printStackTrace();
        continue;
      }
      if (i2 < this.E) {
        this.d = 1;
      }
      return i2;
      i2 += i3;
    }
  }
  
  private void m()
  {
    int i1 = 0;
    while ((i1 == 0) && (!i())) {
      switch (k())
      {
      case 0: 
      default: 
        this.d = 1;
        break;
      case 44: 
        p();
        break;
      case 33: 
        switch (k())
        {
        default: 
          u();
          break;
        case 249: 
          n();
          break;
        case 255: 
          l();
          String str = "";
          for (int i2 = 0; i2 < 11; i2++) {
            str = str + (char)this.D[i2];
          }
          if (str.equals("NETSCAPE2.0")) {
            r();
          } else {
            u();
          }
          break;
        }
        break;
      case 59: 
        i1 = 1;
      }
    }
  }
  
  private void n()
  {
    int i1 = 1;
    k();
    int i2 = k();
    this.F = ((i2 & 0x1C) >> 2);
    if (this.F == 0) {
      this.F = i1;
    }
    if ((i2 & 0x1) != 0) {}
    for (;;)
    {
      this.H = i1;
      this.I = (10 * s());
      this.J = k();
      k();
      return;
      i1 = 0;
    }
  }
  
  private void o()
  {
    String str = "";
    for (int i1 = 0; i1 < 6; i1++) {
      str = str + (char)k();
    }
    if (!str.startsWith("GIF")) {
      this.d = 1;
    }
    do
    {
      return;
      q();
    } while ((!this.e) || (i()));
    this.h = c(this.f);
    this.l = this.h[this.k];
  }
  
  private void p()
  {
    this.r = s();
    this.s = s();
    this.t = s();
    this.u = s();
    int i1 = k();
    boolean bool1;
    boolean bool2;
    label61:
    label103:
    int i2;
    if ((i1 & 0x80) != 0)
    {
      bool1 = true;
      this.o = bool1;
      if ((i1 & 0x40) == 0) {
        break label167;
      }
      bool2 = true;
      this.p = bool2;
      this.q = (2 << (i1 & 0x7));
      if (!this.o) {
        break label172;
      }
      this.i = c(this.q);
      this.j = this.i;
      boolean bool3 = this.H;
      i2 = 0;
      if (bool3)
      {
        int i3 = this.j[this.J];
        this.j[this.J] = 0;
        i2 = i3;
      }
      if (this.j == null) {
        this.d = 1;
      }
      if (!i()) {
        break label199;
      }
    }
    label167:
    label172:
    label199:
    do
    {
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label61;
      this.j = this.h;
      if (this.k != this.J) {
        break label103;
      }
      this.l = 0;
      break label103;
      h();
      u();
    } while (i());
    this.P = (1 + this.P);
    this.z = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_4444);
    e();
    if (this.O == null)
    {
      this.O = new bb(this.z, this.I);
      this.B = this.O;
    }
    for (;;)
    {
      if (this.H) {
        this.j[this.J] = i2;
      }
      t();
      this.Q.a(true, this.P);
      return;
      for (bb localbb = this.O; localbb.c != null; localbb = localbb.c) {}
      localbb.c = new bb(this.z, this.I);
    }
  }
  
  private void q()
  {
    this.a = s();
    this.b = s();
    int i1 = k();
    if ((i1 & 0x80) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.e = bool;
      this.f = (2 << (i1 & 0x7));
      this.k = k();
      this.n = k();
      bk.a(this.n + "");
      return;
    }
  }
  
  private void r()
  {
    do
    {
      l();
      if (this.D[0] == 1) {
        this.g = (0xFF & this.D[1] | (0xFF & this.D[2]) << 8);
      }
    } while ((this.E > 0) && (!i()));
  }
  
  private int s()
  {
    return k() | k() << 8;
  }
  
  private void t()
  {
    this.G = this.F;
    this.v = this.r;
    this.w = this.s;
    this.x = this.t;
    this.y = this.u;
    this.A = this.z;
    this.m = this.l;
    this.F = 0;
    this.H = false;
    this.I = 0;
    this.i = null;
  }
  
  private void u()
  {
    do
    {
      l();
    } while ((this.E > 0) && (!i()));
  }
  
  public Bitmap a(int paramInt)
  {
    bb localbb = b(paramInt);
    if (localbb == null) {
      return null;
    }
    return localbb.a;
  }
  
  public void a()
  {
    for (bb localbb = this.O; localbb != null; localbb = this.O)
    {
      localbb.a = null;
      this.O = this.O.c;
    }
    if (this.c != null) {}
    try
    {
      this.c.close();
      label47:
      this.c = null;
      this.R = null;
      return;
    }
    catch (Exception localException)
    {
      break label47;
    }
  }
  
  public int b()
  {
    return this.P;
  }
  
  public bb b(int paramInt)
  {
    Object localObject = this.O;
    int i1 = 0;
    while (localObject != null)
    {
      if (i1 == paramInt) {
        return localObject;
      }
      bb localbb = ((bb)localObject).c;
      i1++;
      localObject = localbb;
    }
    return null;
  }
  
  public Bitmap c()
  {
    return a(0);
  }
  
  public bb d()
  {
    if (!this.C)
    {
      this.C = true;
      return this.O;
    }
    if (this.d == 0) {
      if (this.B.c != null) {
        this.B = this.B.c;
      }
    }
    for (;;)
    {
      return this.B;
      this.B = this.B.c;
      if (this.B == null) {
        this.B = this.O;
      }
    }
  }
  
  public void run()
  {
    if (this.c != null) {
      g();
    }
    while (this.R == null) {
      return;
    }
    f();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.ba
 * JD-Core Version:    0.7.0.1
 */