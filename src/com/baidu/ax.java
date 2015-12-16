package com.baidu;

class ax
{
  private static final byte[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private static final byte[] b = new byte[''];
  
  static
  {
    for (int i = 0; i < 128; i++) {
      b[i] = -1;
    }
    for (int j = 65; j <= 90; j++) {
      b[j] = ((byte)(j - 65));
    }
    for (int k = 97; k <= 122; k++) {
      b[k] = ((byte)(26 + (k - 97)));
    }
    for (int m = 48; m <= 57; m++) {
      b[m] = ((byte)(52 + (m - 48)));
    }
    b[43] = 62;
    b[47] = 63;
  }
  
  public static String a(String paramString)
  {
    int i = 0;
    while (paramString.length() % 3 != 0) {
      paramString = paramString + "$";
    }
    byte[] arrayOfByte1 = paramString.getBytes();
    byte[] arrayOfByte2 = new byte[4 * (arrayOfByte1.length / 3)];
    int j = 0;
    while (j < arrayOfByte1.length)
    {
      arrayOfByte2[i] = a[((0xFC & arrayOfByte1[j]) >> 2)];
      arrayOfByte2[(i + 1)] = a[(((0x3 & arrayOfByte1[j]) << 4) + ((0xF0 & arrayOfByte1[(j + 1)]) >> 4))];
      arrayOfByte2[(i + 2)] = a[(((0xF & arrayOfByte1[(j + 1)]) << 2) + ((0xC0 & arrayOfByte1[(j + 2)]) >> 6))];
      arrayOfByte2[(i + 3)] = a[(0x3F & arrayOfByte1[(j + 2)])];
      j += 3;
      i += 4;
    }
    return new String(arrayOfByte2);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.ax
 * JD-Core Version:    0.7.0.1
 */