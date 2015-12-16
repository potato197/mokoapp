package com.google.ads.util;

import java.io.UnsupportedEncodingException;

public class b
{
  static
  {
    if (!b.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    int j;
    int k;
    int m;
    label68:
    int n;
    label162:
    for (;;)
    {
      int i;
      b localb;
      try
      {
        i = paramArrayOfByte.length;
        localb = new b();
        j = 4 * (i / 3);
        if (!localb.d) {
          break label116;
        }
        if (i % 3 > 0) {
          j += 4;
        }
        if ((!localb.e) || (i <= 0)) {
          break label162;
        }
        k = 1 + (i - 1) / 57;
        if (!localb.f) {
          break;
        }
        m = 2;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new AssertionError(localUnsupportedEncodingException);
      }
      localb.a = new byte[n];
      localb.a(paramArrayOfByte, i);
      if ((!a) && (localb.b != n)) {
        throw new AssertionError();
      }
      label116:
      switch (i % 3)
      {
      case 0: 
        String str = new String(localb.a, "US-ASCII");
        return str;
        n = j;
      }
    }
    for (;;)
    {
      n = j + m * k;
      break label68;
      break;
      j += 2;
      break;
      j += 3;
      break;
      m = 1;
    }
  }
  
  public static abstract class a
  {
    public byte[] a;
    public int b;
  }
  
  public static final class b
    extends b.a
  {
    private static final byte[] h;
    private static final byte[] i;
    public int c = 0;
    public final boolean d = false;
    public final boolean e = false;
    public final boolean f = false;
    private final byte[] j = new byte[2];
    private int k;
    private final byte[] l = i;
    
    static
    {
      if (!b.class.desiredAssertionStatus()) {}
      for (boolean bool = true;; bool = false)
      {
        g = bool;
        h = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        i = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
        return;
      }
    }
    
    public b()
    {
      this.a = null;
      if (this.e) {}
      for (int m = 19;; m = -1)
      {
        this.k = m;
        return;
      }
    }
    
    public final boolean a(byte[] paramArrayOfByte, int paramInt)
    {
      byte[] arrayOfByte1 = this.l;
      byte[] arrayOfByte2 = this.a;
      int m = this.k;
      int n = paramInt + 0;
      int i2;
      int i3;
      label58:
      int i35;
      int i36;
      int i5;
      int i4;
      switch (this.c)
      {
      default: 
        i2 = -1;
        i3 = 0;
        if (i2 != -1)
        {
          arrayOfByte2[0] = arrayOfByte1[(0x3F & i2 >> 18)];
          arrayOfByte2[1] = arrayOfByte1[(0x3F & i2 >> 12)];
          arrayOfByte2[2] = arrayOfByte1[(0x3F & i2 >> 6)];
          i35 = 4;
          arrayOfByte2[3] = arrayOfByte1[(i2 & 0x3F)];
          i36 = m - 1;
          if (i36 == 0)
          {
            if (this.f)
            {
              i35 = 5;
              arrayOfByte2[4] = 13;
            }
            i5 = i35 + 1;
            arrayOfByte2[i35] = 10;
            i4 = 19;
          }
        }
        break;
      }
      for (;;)
      {
        label164:
        int i31;
        int i32;
        int i33;
        int i34;
        if (i3 + 3 <= n)
        {
          int i30 = (0xFF & paramArrayOfByte[i3]) << 16 | (0xFF & paramArrayOfByte[(i3 + 1)]) << 8 | 0xFF & paramArrayOfByte[(i3 + 2)];
          arrayOfByte2[i5] = arrayOfByte1[(0x3F & i30 >> 18)];
          arrayOfByte2[(i5 + 1)] = arrayOfByte1[(0x3F & i30 >> 12)];
          arrayOfByte2[(i5 + 2)] = arrayOfByte1[(0x3F & i30 >> 6)];
          arrayOfByte2[(i5 + 3)] = arrayOfByte1[(i30 & 0x3F)];
          i31 = i3 + 3;
          i32 = i5 + 4;
          i33 = i4 - 1;
          if (i33 != 0) {
            break label1067;
          }
          if (!this.f) {
            break label1060;
          }
          i34 = i32 + 1;
          arrayOfByte2[i32] = 13;
        }
        for (;;)
        {
          i5 = i34 + 1;
          arrayOfByte2[i34] = 10;
          i3 = i31;
          i4 = 19;
          break label164;
          i2 = -1;
          i3 = 0;
          break label58;
          if (2 > n) {
            break;
          }
          int i37 = (0xFF & this.j[0]) << 16 | (0xFF & paramArrayOfByte[0]) << 8 | 0xFF & paramArrayOfByte[1];
          this.c = 0;
          i2 = i37;
          i3 = 2;
          break label58;
          if (n <= 0) {
            break;
          }
          int i1 = (0xFF & this.j[0]) << 16 | (0xFF & this.j[1]) << 8 | 0xFF & paramArrayOfByte[0];
          this.c = 0;
          i2 = i1;
          i3 = 1;
          break label58;
          if (i3 - this.c == n - 1)
          {
            int i22;
            if (this.c > 0) {
              i22 = this.j[0];
            }
            for (int i23 = 1;; i23 = 0)
            {
              int i24 = (i22 & 0xFF) << 4;
              this.c -= i23;
              int i25 = i5 + 1;
              arrayOfByte2[i5] = arrayOfByte1[(0x3F & i24 >> 6)];
              int i26 = i25 + 1;
              arrayOfByte2[i25] = arrayOfByte1[(i24 & 0x3F)];
              if (this.d)
              {
                int i29 = i26 + 1;
                arrayOfByte2[i26] = 61;
                i26 = i29 + 1;
                arrayOfByte2[i29] = 61;
              }
              if (this.e)
              {
                if (this.f)
                {
                  int i28 = i26 + 1;
                  arrayOfByte2[i26] = 13;
                  i26 = i28;
                }
                int i27 = i26 + 1;
                arrayOfByte2[i26] = 10;
                i26 = i27;
              }
              i5 = i26;
              if ((g) || (this.c == 0)) {
                break;
              }
              throw new AssertionError();
              int i21 = i3 + 1;
              i22 = paramArrayOfByte[i3];
              i3 = i21;
            }
          }
          int i8;
          int i9;
          label715:
          int i12;
          label756:
          int i16;
          int i17;
          if (i3 - this.c == n - 2) {
            if (this.c > 1)
            {
              i8 = this.j[0];
              i9 = 1;
              int i10 = (i8 & 0xFF) << 10;
              if (this.c <= 0) {
                break label937;
              }
              byte[] arrayOfByte3 = this.j;
              int i20 = i9 + 1;
              i12 = arrayOfByte3[i9];
              i9 = i20;
              int i13 = i10 | (i12 & 0xFF) << 2;
              this.c -= i9;
              int i14 = i5 + 1;
              arrayOfByte2[i5] = arrayOfByte1[(0x3F & i13 >> 12)];
              int i15 = i14 + 1;
              arrayOfByte2[i14] = arrayOfByte1[(0x3F & i13 >> 6)];
              i16 = i15 + 1;
              arrayOfByte2[i15] = arrayOfByte1[(i13 & 0x3F)];
              if (!this.d) {
                break label1053;
              }
              i17 = i16 + 1;
              arrayOfByte2[i16] = 61;
            }
          }
          for (;;)
          {
            if (this.e)
            {
              if (this.f)
              {
                int i19 = i17 + 1;
                arrayOfByte2[i17] = 13;
                i17 = i19;
              }
              int i18 = i17 + 1;
              arrayOfByte2[i17] = 10;
              i17 = i18;
            }
            i5 = i17;
            break;
            int i7 = i3 + 1;
            i8 = paramArrayOfByte[i3];
            i3 = i7;
            i9 = 0;
            break label715;
            label937:
            int i11 = i3 + 1;
            i12 = paramArrayOfByte[i3];
            i3 = i11;
            break label756;
            if ((!this.e) || (i5 <= 0) || (i4 == 19)) {
              break;
            }
            int i6;
            if (this.f)
            {
              i6 = i5 + 1;
              arrayOfByte2[i5] = 13;
            }
            for (;;)
            {
              i5 = i6 + 1;
              arrayOfByte2[i6] = 10;
              break;
              if ((!g) && (i3 != n)) {
                throw new AssertionError();
              }
              this.b = i5;
              this.k = i4;
              return true;
              i6 = i5;
            }
            label1053:
            i17 = i16;
          }
          label1060:
          i34 = i32;
        }
        label1067:
        i4 = i33;
        i5 = i32;
        i3 = i31;
        continue;
        i4 = i36;
        i5 = i35;
        continue;
        i4 = m;
        i5 = 0;
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.util.b
 * JD-Core Version:    0.7.0.1
 */