package net.youmi.android;

import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;

class cq
{
  static final char[] a = "0123456789ABCDEF".toCharArray();
  static final char[] b = "0123456789abcdef".toCharArray();
  private static final char[] c = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_-".toCharArray();
  private static final char d = (char)Integer.parseInt("00000011", 2);
  private static final char e = (char)Integer.parseInt("00001111", 2);
  private static final char f = (char)Integer.parseInt("00111111", 2);
  private static final char g = (char)Integer.parseInt("11111100", 2);
  private static final char h = (char)Integer.parseInt("11110000", 2);
  private static final char i = (char)Integer.parseInt("11000000", 2);
  private static final char[] j = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static int[] k = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
  
  static final String a(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramInt);
    for (int m = 0;; m++)
    {
      if (m >= paramInt) {
        return localStringBuilder.toString();
      }
      localStringBuilder.append(c[bn.a(c.length)]);
    }
  }
  
  static String a(String paramString)
  {
    try
    {
      Object localObject = URLEncoder.encode(paramString, "UTF-8");
      if (((String)localObject).indexOf("+") > -1)
      {
        String str = ((String)localObject).replace("+", "%20");
        localObject = str;
      }
      return localObject;
    }
    catch (Exception localException) {}
    return "";
  }
  
  static String a(byte[] paramArrayOfByte)
  {
    int m = 0;
    char[] arrayOfChar1 = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      byte[] arrayOfByte = localMessageDigest.digest();
      char[] arrayOfChar2 = new char[32];
      int n = 0;
      for (;;)
      {
        if (m >= 16) {
          return new String(arrayOfChar2);
        }
        int i1 = arrayOfByte[m];
        int i2 = n + 1;
        arrayOfChar2[n] = arrayOfChar1[(0xF & i1 >>> 4)];
        n = i2 + 1;
        arrayOfChar2[i2] = arrayOfChar1[(i1 & 0xF)];
        m++;
      }
      return null;
    }
    catch (Exception localException) {}
  }
  
  static final String a(byte[] paramArrayOfByte, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    byte[] arrayOfByte1 = paramString.getBytes();
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length + paramArrayOfByte.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, arrayOfByte1.length, paramArrayOfByte.length);
    String str1 = a(arrayOfByte2).substring(9, 18);
    int m = str1.length();
    int n = 0;
    String str2;
    String str3;
    int i4;
    int i5;
    label110:
    int i7;
    label141:
    int i8;
    label150:
    byte[] arrayOfByte3;
    int i11;
    int i12;
    int i13;
    int i14;
    if (n >= 9)
    {
      str2 = localStringBuilder.toString();
      str3 = b(str2 + paramString);
      i4 = 0;
      i5 = 0;
      if (i5 < 26) {
        break label346;
      }
      if (i4 < 67) {
        i4 = 67;
      }
      if ((i4 & 0x1) != 0) {
        break label377;
      }
      i7 = i4 - 1;
      i8 = i7;
      if (i8 > 0) {
        break label386;
      }
      localStringBuilder.delete(0, localStringBuilder.length());
      arrayOfByte3 = str3.getBytes();
      i11 = arrayOfByte3.length;
      i12 = paramArrayOfByte.length;
      i13 = 0;
      i14 = 0;
    }
    String str4;
    int i20;
    int i21;
    int i22;
    for (;;)
    {
      if (i14 >= i12)
      {
        str4 = localStringBuilder.toString();
        localStringBuilder.delete(0, localStringBuilder.length());
        i20 = str4.length();
        localStringBuilder.append(c[(i20 % 3)]);
        i21 = i4;
        i22 = 0;
        if (i22 < i20) {
          break label518;
        }
        return str2 + localStringBuilder.toString();
        int i1 = n + 3;
        if (i1 > m) {
          i1 = m;
        }
        int i2 = Integer.parseInt(str1.substring(n, i1), 16);
        if (i2 < 64) {}
        for (int i3 = 0;; i3 = i2 >>> 6)
        {
          localStringBuilder.append(c[i3]);
          localStringBuilder.append(c[(i2 & 0x3F)]);
          n += 3;
          break;
        }
        label346:
        int i6 = i4 << 1;
        if (str3.charAt(i5) > '7') {
          i6++;
        }
        i5++;
        i4 = i6;
        break label110;
        label377:
        i7 = i4 - 2;
        break label141;
        label386:
        label428:
        label430:
        for (int i9 = 0;; i9++)
        {
          if (i9 >= k.length) {}
          for (int i10 = 1;; i10 = 0)
          {
            if (i10 != 0) {
              break label428;
            }
            i8 -= 2;
            break;
            if (i8 % k[i9] != 0) {
              break label430;
            }
          }
          break label150;
        }
      }
      int i15 = paramArrayOfByte[i14];
      int i16 = i13 + 1;
      int i17 = (byte)(i15 ^ arrayOfByte3[i13]);
      if (i16 >= i11) {
        i16 = 0;
      }
      int i18 = (i17 & 0xF0) >>> 4;
      localStringBuilder.append(a[i18]);
      int i19 = i17 & 0xF;
      localStringBuilder.append(a[i19]);
      i14++;
      i13 = i16;
    }
    label518:
    int i23;
    label533:
    int i24;
    if (i22 + 3 < i20)
    {
      i23 = i22 + 3;
      i24 = Integer.parseInt(str4.substring(i22, i23), 16);
      if (i24 >= 64) {
        break label639;
      }
    }
    label639:
    for (int i25 = 0;; i25 = i24 >>> 6)
    {
      int i26 = (byte)i25;
      int i27 = 0x3F & 13859 + i21 * i8;
      localStringBuilder.append(c[(0x3F & i26 + i27)]);
      i21 = 0x3F & 13859 + i8 * i27;
      localStringBuilder.append(c[(0x3F & i24 + i21)]);
      i22 += 3;
      break;
      i23 = i20;
      break label533;
    }
  }
  
  static String b(String paramString)
  {
    Object localObject = null;
    if (paramString != null) {}
    try
    {
      int m = paramString.length();
      localObject = null;
      if (m > 0) {}
      MessageDigest localMessageDigest;
      Object[] arrayOfObject;
      String str;
      return null;
    }
    catch (Exception localException1)
    {
      try
      {
        localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.update(paramString.getBytes(), 0, paramString.length());
        arrayOfObject = new Object[1];
        arrayOfObject[0] = new BigInteger(1, localMessageDigest.digest());
        str = String.format("%032x", arrayOfObject);
        localObject = str;
        return localObject;
      }
      catch (Exception localException2) {}
      localException1 = localException1;
      return "";
    }
  }
  
  static final String c(String paramString)
  {
    int m = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder((m << 1) / 3);
    int n = 0;
    int i1 = 0;
    if (n >= m) {
      return localStringBuilder.toString();
    }
    int i2;
    label45:
    int i3;
    if (n + 3 < m)
    {
      i2 = n + 3;
      i3 = Integer.parseInt(paramString.substring(n, i2), 16);
      if (i3 >= 64) {
        break label123;
      }
    }
    label123:
    for (int i4 = 0;; i4 = i3 >>> 6)
    {
      int i5 = (byte)i4;
      localStringBuilder.append(c[i5]);
      int i6 = i1 + 1;
      localStringBuilder.append(c[(i3 & 0x3F)]);
      i1 = i6 + 1;
      n += 3;
      break;
      i2 = m;
      break label45;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cq
 * JD-Core Version:    0.7.0.1
 */