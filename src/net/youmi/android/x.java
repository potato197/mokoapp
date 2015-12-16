package net.youmi.android;

import java.io.IOException;

final class x
{
  int a;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k;
  byte l;
  int m;
  int[] n;
  
  x(cr paramcr) {}
  
  private final void a(int paramInt)
  {
    byte[] arrayOfByte1 = cr.a(this.o);
    int i1 = paramInt + 1;
    int i3;
    byte[] arrayOfByte2;
    for (int i2 = 0xFF & arrayOfByte1[paramInt];; i2 = 0xFF & arrayOfByte2[i3])
    {
      if (i2 <= 0)
      {
        cr.a(this.o, i1);
        return;
      }
      i3 = i2 + i1;
      arrayOfByte2 = cr.a(this.o);
      i1 = i3 + 1;
    }
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    int i1 = this.c * this.d;
    if ((cr.d(this.o) == null) || (cr.d(this.o).length < i1)) {
      cr.a(this.o, new byte[i1]);
    }
    int i2 = 1 << paramInt2;
    int i3 = i2 + 1;
    int i4 = i2 + 2;
    int i5 = paramInt2 + 1;
    int i6 = -1 + (1 << i5);
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13;
    int i14;
    int i15;
    int i16;
    int i17;
    if (i12 >= i2)
    {
      i13 = 0;
      i14 = -1;
      i15 = 0;
      i16 = 0;
      i17 = paramInt1;
      label112:
      if (i13 < i1) {
        break label159;
      }
    }
    int i35;
    label122:
    int i29;
    label159:
    label239:
    int i30;
    label273:
    int i31;
    label425:
    int i33;
    do
    {
      do
      {
        int i37;
        do
        {
          i35 = i11;
          if (i35 < i1) {
            break label696;
          }
          return;
          cr.e(this.o)[i12] = 0;
          cr.f(this.o)[i12] = ((byte)i12);
          i12++;
          break;
          if (i10 != 0) {
            break label724;
          }
          if (i7 >= i5) {
            break label273;
          }
          if (i16 != 0) {
            break label239;
          }
          byte[] arrayOfByte6 = cr.a(this.o);
          i37 = i17 + 1;
          i16 = 0xFF & arrayOfByte6[i17];
        } while (i16 <= 0);
        System.arraycopy(cr.a(this.o), i37, cr.g(this.o), 0, i16);
        i17 = i37 + i16;
        i15 = 0;
        i8 += ((0xFF & cr.g(this.o)[i15]) << i7);
        i7 += 8;
        i15++;
        i16--;
        break label112;
        i29 = i8 & i6;
        i8 >>= i5;
        i7 -= i5;
      } while ((i29 > i4) || (i29 == i3));
      if (i29 == i2)
      {
        i5 = paramInt2 + 1;
        i6 = -1 + (1 << i5);
        i4 = i2 + 2;
        i14 = -1;
        break label112;
      }
      if (i14 == -1)
      {
        byte[] arrayOfByte5 = cr.h(this.o);
        int i36 = i10 + 1;
        arrayOfByte5[i10] = cr.f(this.o)[i29];
        i10 = i36;
        i14 = i29;
        i9 = i29;
        break label112;
      }
      if (i29 != i4) {
        break label713;
      }
      byte[] arrayOfByte4 = cr.h(this.o);
      i30 = i10 + 1;
      arrayOfByte4[i10] = ((byte)i9);
      i31 = i14;
      if (i31 > i2) {
        break label647;
      }
      i33 = 0xFF & cr.f(this.o)[i31];
    } while (i4 >= 4096);
    byte[] arrayOfByte3 = cr.h(this.o);
    int i34 = i30 + 1;
    arrayOfByte3[i30] = ((byte)i33);
    cr.e(this.o)[i4] = ((short)i14);
    cr.f(this.o)[i4] = ((byte)i33);
    int i25 = i4 + 1;
    if (((i25 & i6) == 0) && (i25 < 4096))
    {
      i5++;
      i6 += i25;
    }
    int i23 = i8;
    int i24 = i29;
    int i18 = i5;
    int i19 = i33;
    int i20 = i7;
    int i21 = i6;
    int i22 = i34;
    for (;;)
    {
      int i26 = i22 - 1;
      byte[] arrayOfByte1 = cr.d(this.o);
      int i27 = i11 + 1;
      arrayOfByte1[i11] = cr.h(this.o)[i26];
      i13++;
      i11 = i27;
      i6 = i21;
      i7 = i20;
      i9 = i19;
      i5 = i18;
      int i28 = i24;
      i8 = i23;
      i10 = i26;
      i4 = i25;
      i14 = i28;
      break;
      label647:
      byte[] arrayOfByte2 = cr.h(this.o);
      int i32 = i30 + 1;
      arrayOfByte2[i30] = cr.f(this.o)[i31];
      i31 = cr.e(this.o)[i31];
      i30 = i32;
      break label425;
      label696:
      cr.d(this.o)[i35] = 0;
      i35++;
      break label122;
      label713:
      i30 = i10;
      i31 = i29;
      break label425;
      label724:
      i18 = i5;
      i19 = i9;
      i20 = i7;
      i21 = i6;
      i22 = i10;
      i23 = i8;
      i24 = i14;
      i25 = i4;
    }
  }
  
  private final void b()
  {
    this.a = al.a(cr.a(this.o), cr.b(this.o), 2);
    this.b = al.a(cr.a(this.o), 2 + cr.b(this.o), 2);
    this.c = al.a(cr.a(this.o), 4 + cr.b(this.o), 2);
    this.d = al.a(cr.a(this.o), 6 + cr.b(this.o), 2);
    this.e = al.a(cr.a(this.o)[(8 + cr.b(this.o))], 7, 1);
    this.f = al.a(cr.a(this.o)[(8 + cr.b(this.o))], 6, 1);
    if (this.f != 0) {
      throw new IOException("unsupport interf flag now");
    }
    this.g = al.a(cr.a(this.o)[(8 + cr.b(this.o))], 5, 1);
    this.h = al.a(cr.a(this.o)[(8 + cr.b(this.o))], 3, 2);
    this.i = al.a(cr.a(this.o)[(8 + cr.b(this.o))], 0, 3);
    cr localcr1 = this.o;
    cr.a(localcr1, 9 + cr.b(localcr1));
    if (this.e == 1)
    {
      this.k = cr.b(this.o);
      this.j = (1 << 1 + this.i);
      localcr3 = this.o;
      cr.a(localcr3, cr.b(localcr3) + 3 * this.j);
    }
    while (cr.c(this.o) != 0)
    {
      cr localcr3;
      byte[] arrayOfByte = cr.a(this.o);
      cr localcr2 = this.o;
      int i1 = cr.b(localcr2);
      cr.a(localcr2, i1 + 1);
      this.l = arrayOfByte[i1];
      this.m = cr.b(this.o);
      a(this.m);
      return;
    }
    throw new IOException("gct and lct is all null");
  }
  
  final void a()
  {
    a(this.m, this.l);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.x
 * JD-Core Version:    0.7.0.1
 */