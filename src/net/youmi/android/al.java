package net.youmi.android;

import java.io.ByteArrayOutputStream;

class al
{
  static final int[] a = { 255, 65280, 16711680, -16777216 };
  
  static final int a(byte paramByte, int paramInt1, int paramInt2)
  {
    if (paramInt1 + paramInt2 > 8) {
      return paramByte;
    }
    return (0xFF & paramByte << 8 - paramInt1 - paramInt2) >>> 8 - paramInt2;
  }
  
  static final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    for (;;)
    {
      if (i >= paramInt2) {
        return k;
      }
      k |= paramArrayOfByte[(paramInt1 + i)] << j & a[i];
      j += 8;
      i++;
    }
  }
  
  static final void a(int paramInt1, int paramInt2, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    for (int i = paramInt2 - 1;; i--)
    {
      if (i < 0)
      {
        paramByteArrayOutputStream.write(arrayOfByte);
        return;
      }
      arrayOfByte[i] = ((byte)(paramInt1 & 0xFF));
      paramInt1 >>>= 8;
    }
  }
  
  static final void a(long paramLong, int paramInt, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = paramInt - 1;; i--)
    {
      if (i < 0)
      {
        paramByteArrayOutputStream.write(arrayOfByte);
        return;
      }
      arrayOfByte[i] = ((byte)(int)(0xFF & paramLong));
      paramLong >>>= 8;
    }
  }
  
  static final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    if (paramString == null) {
      return;
    }
    for (;;)
    {
      try
      {
        if (paramString.indexOf(' ') > -1)
        {
          str = paramString.trim();
          if (str.indexOf('&') > -1) {
            str = str.replace('&', '_');
          }
          paramByteArrayOutputStream.write(str.getBytes("UTF-8"));
          return;
        }
      }
      catch (Exception localException)
      {
        return;
      }
      String str = paramString;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.al
 * JD-Core Version:    0.7.0.1
 */