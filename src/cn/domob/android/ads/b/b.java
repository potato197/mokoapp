package cn.domob.android.ads.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

final class b
  extends Thread
{
  private boolean A = false;
  private byte[] B = new byte[256];
  private int C = 0;
  private int D = 0;
  private int E = 0;
  private boolean F = false;
  private int G = 0;
  private int H;
  private short[] I;
  private byte[] J;
  private byte[] K;
  private byte[] L;
  private c M;
  private int N;
  private a O = null;
  private byte[] P = null;
  public int a;
  public int b;
  private InputStream c;
  private int d;
  private boolean e;
  private int f;
  private int[] g;
  private int[] h;
  private int[] i;
  private int j;
  private int k;
  private int l;
  private boolean m;
  private boolean n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private Bitmap x;
  private Bitmap y;
  private c z = null;
  
  public b(byte[] paramArrayOfByte, a parama)
  {
    this.P = paramArrayOfByte;
    this.O = parama;
  }
  
  private Bitmap a(int paramInt)
  {
    Object localObject = this.M;
    int i1 = 0;
    if (localObject != null) {
      if (i1 != paramInt) {}
    }
    for (;;)
    {
      if (localObject != null) {
        break label42;
      }
      return null;
      c localc = ((c)localObject).c;
      i1++;
      localObject = localc;
      break;
      localObject = null;
    }
    label42:
    return ((c)localObject).a;
  }
  
  private int[] b(int paramInt)
  {
    int i1 = 0;
    int i2 = paramInt * 3;
    int[] arrayOfInt = null;
    byte[] arrayOfByte = new byte[i2];
    try
    {
      int i12 = this.c.read(arrayOfByte);
      i3 = i12;
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
      while (i4 < paramInt)
      {
        int i5 = i1 + 1;
        int i6 = 0xFF & arrayOfByte[i1];
        int i7 = i5 + 1;
        int i8 = 0xFF & arrayOfByte[i5];
        int i9 = i7 + 1;
        int i10 = 0xFF & arrayOfByte[i7];
        int i11 = i4 + 1;
        arrayOfInt[i4] = (i10 | 0xFF000000 | i6 << 16 | i8 << 8);
        i4 = i11;
        i1 = i9;
      }
    }
  }
  
  private void e()
  {
    int i1 = 0;
    int[] arrayOfInt = new int[this.a * this.b];
    if (this.E > 0) {
      if (this.E == 3)
      {
        int i20 = -2 + this.N;
        if (i20 > 0) {
          this.y = a(i20 - 1);
        }
      }
      else
      {
        if (this.y == null) {
          break label179;
        }
        this.y.getPixels(arrayOfInt, 0, this.a, 0, 0, this.a, this.b);
        if (this.E != 2) {
          break label179;
        }
        if (this.F) {
          break label472;
        }
      }
    }
    label179:
    label466:
    label472:
    for (int i16 = this.l;; i16 = 0)
    {
      for (int i17 = 0;; i17++)
      {
        if (i17 >= this.w) {
          break label179;
        }
        int i18 = (i17 + this.u) * this.a + this.t;
        int i19 = i18 + this.v;
        for (;;)
        {
          if (i18 < i19)
          {
            arrayOfInt[i18] = i16;
            i18++;
            continue;
            this.y = null;
            break;
          }
        }
      }
      int i2 = 8;
      int i3 = 1;
      int i4 = 0;
      int i15;
      if (i1 < this.s)
      {
        if (!this.n) {
          break label466;
        }
        if (i4 >= this.s) {
          i3++;
        }
        switch (i3)
        {
        default: 
          int i14 = i4 + i2;
          i15 = i4;
          i4 = i14;
        }
      }
      for (int i5 = i15;; i5 = i1)
      {
        int i6 = i5 + this.q;
        if (i6 < this.b)
        {
          int i7 = i6 * this.a;
          int i8 = i7 + this.p;
          int i9 = i8 + this.r;
          if (i7 + this.a < i9) {
            i9 = i7 + this.a;
          }
          int i10 = i1 * this.r;
          for (;;)
          {
            if (i8 < i9)
            {
              byte[] arrayOfByte = this.L;
              int i11 = i10 + 1;
              int i12 = 0xFF & arrayOfByte[i10];
              int i13 = this.i[i12];
              if (i13 != 0) {
                arrayOfInt[i8] = i13;
              }
              i8++;
              i10 = i11;
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
        try
        {
          this.x = Bitmap.createBitmap(arrayOfInt, this.a, this.b, Bitmap.Config.ARGB_4444);
          return;
        }
        catch (Exception localException)
        {
          Log.e("gif", "out of memory");
          return;
        }
        catch (Error localError)
        {
          Log.e("gif", "out of memory");
          return;
        }
      }
    }
  }
  
  private int f()
  {
    this.d = 0;
    this.N = 0;
    this.M = null;
    this.g = null;
    this.h = null;
    if (this.c != null)
    {
      String str = "";
      for (int i1 = 0; i1 < 6; i1++) {
        str = str + (char)h();
      }
      if (!str.startsWith("GIF"))
      {
        this.d = 1;
        if (!g())
        {
          j();
          if (this.N >= 0) {
            break label241;
          }
          this.d = 1;
          this.O.a(false, -1);
        }
      }
    }
    for (;;)
    {
      try
      {
        this.c.close();
        return this.d;
        this.a = l();
        this.b = l();
        int i2 = h();
        if ((i2 & 0x80) != 0)
        {
          bool = true;
          this.e = bool;
          this.f = (2 << (i2 & 0x7));
          this.j = h();
          h();
          if ((!this.e) || (g())) {
            break;
          }
          this.g = b(this.f);
          this.k = this.g[this.j];
          break;
        }
        boolean bool = false;
        continue;
        label241:
        this.d = -1;
        this.O.a(true, -1);
        continue;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
      }
      this.d = 2;
      this.O.a(false, -1);
    }
  }
  
  private boolean g()
  {
    return this.d != 0;
  }
  
  private int h()
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
  
  private int i()
  {
    this.C = h();
    int i1 = this.C;
    i2 = 0;
    if (i1 > 0) {
      try
      {
        while (i2 < this.C)
        {
          int i3 = this.c.read(this.B, i2, this.C - i2);
          if (i3 == -1) {
            break;
          }
          i2 += i3;
        }
        return i2;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        if (i2 < this.C) {
          this.d = 1;
        }
      }
    }
  }
  
  /* Error */
  private void j()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iload_1
    //   3: ifne +1490 -> 1493
    //   6: aload_0
    //   7: invokespecial 202	cn/domob/android/ads/b/b:g	()Z
    //   10: ifne +1483 -> 1493
    //   13: aload_0
    //   14: invokespecial 184	cn/domob/android/ads/b/b:h	()I
    //   17: lookupswitch	default:+43->60, 0:+-15->2, 33:+1275->1292, 44:+51->68, 59:+1471->1488
    //   61: iconst_1
    //   62: putfield 101	cn/domob/android/ads/b/b:d	I
    //   65: goto -63 -> 2
    //   68: aload_0
    //   69: aload_0
    //   70: invokespecial 214	cn/domob/android/ads/b/b:l	()I
    //   73: putfield 141	cn/domob/android/ads/b/b:p	I
    //   76: aload_0
    //   77: aload_0
    //   78: invokespecial 214	cn/domob/android/ads/b/b:l	()I
    //   81: putfield 139	cn/domob/android/ads/b/b:q	I
    //   84: aload_0
    //   85: aload_0
    //   86: invokespecial 214	cn/domob/android/ads/b/b:l	()I
    //   89: putfield 143	cn/domob/android/ads/b/b:r	I
    //   92: aload_0
    //   93: aload_0
    //   94: invokespecial 214	cn/domob/android/ads/b/b:l	()I
    //   97: putfield 135	cn/domob/android/ads/b/b:s	I
    //   100: aload_0
    //   101: invokespecial 184	cn/domob/android/ads/b/b:h	()I
    //   104: istore 9
    //   106: iload 9
    //   108: sipush 128
    //   111: iand
    //   112: ifeq +284 -> 396
    //   115: iconst_1
    //   116: istore 10
    //   118: aload_0
    //   119: iload 10
    //   121: putfield 231	cn/domob/android/ads/b/b:m	Z
    //   124: iload 9
    //   126: bipush 64
    //   128: iand
    //   129: ifeq +273 -> 402
    //   132: iconst_1
    //   133: istore 11
    //   135: aload_0
    //   136: iload 11
    //   138: putfield 137	cn/domob/android/ads/b/b:n	Z
    //   141: aload_0
    //   142: iconst_2
    //   143: iload 9
    //   145: bipush 7
    //   147: iand
    //   148: ishl
    //   149: putfield 233	cn/domob/android/ads/b/b:o	I
    //   152: aload_0
    //   153: getfield 231	cn/domob/android/ads/b/b:m	Z
    //   156: ifeq +252 -> 408
    //   159: aload_0
    //   160: aload_0
    //   161: aload_0
    //   162: getfield 233	cn/domob/android/ads/b/b:o	I
    //   165: invokespecial 222	cn/domob/android/ads/b/b:b	(I)[I
    //   168: putfield 173	cn/domob/android/ads/b/b:h	[I
    //   171: aload_0
    //   172: aload_0
    //   173: getfield 173	cn/domob/android/ads/b/b:h	[I
    //   176: putfield 147	cn/domob/android/ads/b/b:i	[I
    //   179: aload_0
    //   180: getfield 73	cn/domob/android/ads/b/b:F	Z
    //   183: istore 12
    //   185: iconst_0
    //   186: istore 13
    //   188: iload 12
    //   190: ifeq +24 -> 214
    //   193: aload_0
    //   194: getfield 147	cn/domob/android/ads/b/b:i	[I
    //   197: aload_0
    //   198: getfield 235	cn/domob/android/ads/b/b:H	I
    //   201: iaload
    //   202: istore 13
    //   204: aload_0
    //   205: getfield 147	cn/domob/android/ads/b/b:i	[I
    //   208: aload_0
    //   209: getfield 235	cn/domob/android/ads/b/b:H	I
    //   212: iconst_0
    //   213: iastore
    //   214: iload 13
    //   216: istore 14
    //   218: aload_0
    //   219: getfield 147	cn/domob/android/ads/b/b:i	[I
    //   222: ifnonnull +8 -> 230
    //   225: aload_0
    //   226: iconst_1
    //   227: putfield 101	cn/domob/android/ads/b/b:d	I
    //   230: aload_0
    //   231: invokespecial 202	cn/domob/android/ads/b/b:g	()Z
    //   234: ifne -232 -> 2
    //   237: aload_0
    //   238: getfield 143	cn/domob/android/ads/b/b:r	I
    //   241: aload_0
    //   242: getfield 135	cn/domob/android/ads/b/b:s	I
    //   245: imul
    //   246: istore 15
    //   248: aload_0
    //   249: getfield 145	cn/domob/android/ads/b/b:L	[B
    //   252: ifnull +13 -> 265
    //   255: aload_0
    //   256: getfield 145	cn/domob/android/ads/b/b:L	[B
    //   259: arraylength
    //   260: iload 15
    //   262: if_icmpge +11 -> 273
    //   265: aload_0
    //   266: iload 15
    //   268: newarray byte
    //   270: putfield 145	cn/domob/android/ads/b/b:L	[B
    //   273: aload_0
    //   274: getfield 237	cn/domob/android/ads/b/b:I	[S
    //   277: ifnonnull +12 -> 289
    //   280: aload_0
    //   281: sipush 4096
    //   284: newarray short
    //   286: putfield 237	cn/domob/android/ads/b/b:I	[S
    //   289: aload_0
    //   290: getfield 239	cn/domob/android/ads/b/b:J	[B
    //   293: ifnonnull +12 -> 305
    //   296: aload_0
    //   297: sipush 4096
    //   300: newarray byte
    //   302: putfield 239	cn/domob/android/ads/b/b:J	[B
    //   305: aload_0
    //   306: getfield 241	cn/domob/android/ads/b/b:K	[B
    //   309: ifnonnull +12 -> 321
    //   312: aload_0
    //   313: sipush 4097
    //   316: newarray byte
    //   318: putfield 241	cn/domob/android/ads/b/b:K	[B
    //   321: aload_0
    //   322: invokespecial 184	cn/domob/android/ads/b/b:h	()I
    //   325: istore 16
    //   327: iconst_1
    //   328: iload 16
    //   330: ishl
    //   331: istore 17
    //   333: iload 17
    //   335: iconst_1
    //   336: iadd
    //   337: istore 18
    //   339: iload 17
    //   341: iconst_2
    //   342: iadd
    //   343: istore 19
    //   345: iconst_m1
    //   346: istore 20
    //   348: iload 16
    //   350: iconst_1
    //   351: iadd
    //   352: istore 21
    //   354: iconst_m1
    //   355: iconst_1
    //   356: iload 21
    //   358: ishl
    //   359: iadd
    //   360: istore 22
    //   362: iconst_0
    //   363: istore 23
    //   365: iload 23
    //   367: iload 17
    //   369: if_icmpge +66 -> 435
    //   372: aload_0
    //   373: getfield 237	cn/domob/android/ads/b/b:I	[S
    //   376: iload 23
    //   378: iconst_0
    //   379: sastore
    //   380: aload_0
    //   381: getfield 239	cn/domob/android/ads/b/b:J	[B
    //   384: iload 23
    //   386: iload 23
    //   388: i2b
    //   389: bastore
    //   390: iinc 23 1
    //   393: goto -28 -> 365
    //   396: iconst_0
    //   397: istore 10
    //   399: goto -281 -> 118
    //   402: iconst_0
    //   403: istore 11
    //   405: goto -270 -> 135
    //   408: aload_0
    //   409: aload_0
    //   410: getfield 171	cn/domob/android/ads/b/b:g	[I
    //   413: putfield 147	cn/domob/android/ads/b/b:i	[I
    //   416: aload_0
    //   417: getfield 220	cn/domob/android/ads/b/b:j	I
    //   420: aload_0
    //   421: getfield 235	cn/domob/android/ads/b/b:H	I
    //   424: if_icmpne -245 -> 179
    //   427: aload_0
    //   428: iconst_0
    //   429: putfield 224	cn/domob/android/ads/b/b:k	I
    //   432: goto -253 -> 179
    //   435: iconst_0
    //   436: istore 24
    //   438: iconst_0
    //   439: istore 25
    //   441: iconst_0
    //   442: istore 26
    //   444: iconst_0
    //   445: istore 27
    //   447: iconst_0
    //   448: istore 28
    //   450: iconst_0
    //   451: istore 29
    //   453: iconst_0
    //   454: istore 30
    //   456: iconst_0
    //   457: istore 31
    //   459: iload 28
    //   461: iload 15
    //   463: if_icmpge +453 -> 916
    //   466: iload 25
    //   468: ifne +1037 -> 1505
    //   471: iload 30
    //   473: iload 21
    //   475: if_icmpge +53 -> 528
    //   478: iload 29
    //   480: ifne +17 -> 497
    //   483: aload_0
    //   484: invokespecial 243	cn/domob/android/ads/b/b:i	()I
    //   487: istore 29
    //   489: iload 29
    //   491: ifle +425 -> 916
    //   494: iconst_0
    //   495: istore 31
    //   497: iload 27
    //   499: sipush 255
    //   502: aload_0
    //   503: getfield 65	cn/domob/android/ads/b/b:B	[B
    //   506: iload 31
    //   508: baload
    //   509: iand
    //   510: iload 30
    //   512: ishl
    //   513: iadd
    //   514: istore 27
    //   516: iinc 30 8
    //   519: iinc 31 1
    //   522: iinc 29 255
    //   525: goto -66 -> 459
    //   528: iload 27
    //   530: iload 22
    //   532: iand
    //   533: istore 58
    //   535: iload 27
    //   537: iload 21
    //   539: ishr
    //   540: istore 27
    //   542: iload 30
    //   544: iload 21
    //   546: isub
    //   547: istore 30
    //   549: iload 58
    //   551: iload 19
    //   553: if_icmpgt +363 -> 916
    //   556: iload 58
    //   558: iload 18
    //   560: if_icmpeq +356 -> 916
    //   563: iload 58
    //   565: iload 17
    //   567: if_icmpne +29 -> 596
    //   570: iload 16
    //   572: iconst_1
    //   573: iadd
    //   574: istore 21
    //   576: iconst_m1
    //   577: iconst_1
    //   578: iload 21
    //   580: ishl
    //   581: iadd
    //   582: istore 22
    //   584: iload 17
    //   586: iconst_2
    //   587: iadd
    //   588: istore 19
    //   590: iconst_m1
    //   591: istore 20
    //   593: goto -134 -> 459
    //   596: iload 20
    //   598: iconst_m1
    //   599: if_icmpne +42 -> 641
    //   602: aload_0
    //   603: getfield 241	cn/domob/android/ads/b/b:K	[B
    //   606: astore 67
    //   608: iload 25
    //   610: iconst_1
    //   611: iadd
    //   612: istore 68
    //   614: aload 67
    //   616: iload 25
    //   618: aload_0
    //   619: getfield 239	cn/domob/android/ads/b/b:J	[B
    //   622: iload 58
    //   624: baload
    //   625: bastore
    //   626: iload 68
    //   628: istore 25
    //   630: iload 58
    //   632: istore 20
    //   634: iload 58
    //   636: istore 26
    //   638: goto -179 -> 459
    //   641: iload 58
    //   643: iload 19
    //   645: if_icmpne +849 -> 1494
    //   648: aload_0
    //   649: getfield 241	cn/domob/android/ads/b/b:K	[B
    //   652: astore 66
    //   654: iload 25
    //   656: iconst_1
    //   657: iadd
    //   658: istore 59
    //   660: aload 66
    //   662: iload 25
    //   664: iload 26
    //   666: i2b
    //   667: bastore
    //   668: iload 20
    //   670: istore 60
    //   672: iload 60
    //   674: iload 17
    //   676: if_icmple +43 -> 719
    //   679: aload_0
    //   680: getfield 241	cn/domob/android/ads/b/b:K	[B
    //   683: astore 64
    //   685: iload 59
    //   687: iconst_1
    //   688: iadd
    //   689: istore 65
    //   691: aload 64
    //   693: iload 59
    //   695: aload_0
    //   696: getfield 239	cn/domob/android/ads/b/b:J	[B
    //   699: iload 60
    //   701: baload
    //   702: bastore
    //   703: aload_0
    //   704: getfield 237	cn/domob/android/ads/b/b:I	[S
    //   707: iload 60
    //   709: saload
    //   710: istore 60
    //   712: iload 65
    //   714: istore 59
    //   716: goto -44 -> 672
    //   719: sipush 255
    //   722: aload_0
    //   723: getfield 239	cn/domob/android/ads/b/b:J	[B
    //   726: iload 60
    //   728: baload
    //   729: iand
    //   730: istore 61
    //   732: iload 19
    //   734: sipush 4096
    //   737: if_icmpge +179 -> 916
    //   740: aload_0
    //   741: getfield 241	cn/domob/android/ads/b/b:K	[B
    //   744: astore 62
    //   746: iload 59
    //   748: iconst_1
    //   749: iadd
    //   750: istore 63
    //   752: aload 62
    //   754: iload 59
    //   756: iload 61
    //   758: i2b
    //   759: bastore
    //   760: aload_0
    //   761: getfield 237	cn/domob/android/ads/b/b:I	[S
    //   764: iload 19
    //   766: iload 20
    //   768: i2s
    //   769: sastore
    //   770: aload_0
    //   771: getfield 239	cn/domob/android/ads/b/b:J	[B
    //   774: iload 19
    //   776: iload 61
    //   778: i2b
    //   779: bastore
    //   780: iload 19
    //   782: iconst_1
    //   783: iadd
    //   784: istore 53
    //   786: iload 53
    //   788: iload 22
    //   790: iand
    //   791: ifne +21 -> 812
    //   794: iload 53
    //   796: sipush 4096
    //   799: if_icmpge +13 -> 812
    //   802: iinc 21 1
    //   805: iload 22
    //   807: iload 53
    //   809: iadd
    //   810: istore 22
    //   812: iload 27
    //   814: istore 51
    //   816: iload 58
    //   818: istore 52
    //   820: iload 22
    //   822: istore 46
    //   824: iload 61
    //   826: istore 47
    //   828: iload 30
    //   830: istore 48
    //   832: iload 21
    //   834: istore 49
    //   836: iload 63
    //   838: istore 50
    //   840: iload 50
    //   842: iconst_1
    //   843: isub
    //   844: istore 54
    //   846: aload_0
    //   847: getfield 145	cn/domob/android/ads/b/b:L	[B
    //   850: astore 55
    //   852: iload 24
    //   854: iconst_1
    //   855: iadd
    //   856: istore 56
    //   858: aload 55
    //   860: iload 24
    //   862: aload_0
    //   863: getfield 241	cn/domob/android/ads/b/b:K	[B
    //   866: iload 54
    //   868: baload
    //   869: bastore
    //   870: iinc 28 1
    //   873: iload 56
    //   875: istore 24
    //   877: iload 49
    //   879: istore 21
    //   881: iload 48
    //   883: istore 30
    //   885: iload 47
    //   887: istore 26
    //   889: iload 46
    //   891: istore 22
    //   893: iload 52
    //   895: istore 57
    //   897: iload 51
    //   899: istore 27
    //   901: iload 54
    //   903: istore 25
    //   905: iload 53
    //   907: istore 19
    //   909: iload 57
    //   911: istore 20
    //   913: goto -454 -> 459
    //   916: iload 24
    //   918: istore 32
    //   920: iload 32
    //   922: iload 15
    //   924: if_icmpge +17 -> 941
    //   927: aload_0
    //   928: getfield 145	cn/domob/android/ads/b/b:L	[B
    //   931: iload 32
    //   933: iconst_0
    //   934: bastore
    //   935: iinc 32 1
    //   938: goto -18 -> 920
    //   941: aload_0
    //   942: invokespecial 245	cn/domob/android/ads/b/b:m	()V
    //   945: aload_0
    //   946: invokespecial 202	cn/domob/android/ads/b/b:g	()Z
    //   949: ifne -947 -> 2
    //   952: aload_0
    //   953: iconst_1
    //   954: aload_0
    //   955: getfield 113	cn/domob/android/ads/b/b:N	I
    //   958: iadd
    //   959: putfield 113	cn/domob/android/ads/b/b:N	I
    //   962: aload_0
    //   963: aload_0
    //   964: getfield 109	cn/domob/android/ads/b/b:a	I
    //   967: aload_0
    //   968: getfield 111	cn/domob/android/ads/b/b:b	I
    //   971: getstatic 153	android/graphics/Bitmap$Config:ARGB_4444	Landroid/graphics/Bitmap$Config;
    //   974: invokestatic 248	android/graphics/Bitmap:createBitmap	(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   977: putfield 159	cn/domob/android/ads/b/b:x	Landroid/graphics/Bitmap;
    //   980: aload_0
    //   981: invokespecial 250	cn/domob/android/ads/b/b:e	()V
    //   984: aload_0
    //   985: getfield 77	cn/domob/android/ads/b/b:O	Lcn/domob/android/ads/b/a;
    //   988: checkcast 252	android/view/View
    //   991: invokevirtual 256	android/view/View:getResources	()Landroid/content/res/Resources;
    //   994: invokevirtual 262	android/content/res/Resources:getDisplayMetrics	()Landroid/util/DisplayMetrics;
    //   997: astore 37
    //   999: new 264	android/graphics/Matrix
    //   1002: dup
    //   1003: invokespecial 265	android/graphics/Matrix:<init>	()V
    //   1006: astore 38
    //   1008: aload 38
    //   1010: aload 37
    //   1012: getfield 270	android/util/DisplayMetrics:density	F
    //   1015: aload 37
    //   1017: getfield 270	android/util/DisplayMetrics:density	F
    //   1020: invokevirtual 274	android/graphics/Matrix:postScale	(FF)Z
    //   1023: pop
    //   1024: aload_0
    //   1025: getfield 159	cn/domob/android/ads/b/b:x	Landroid/graphics/Bitmap;
    //   1028: iconst_0
    //   1029: iconst_0
    //   1030: aload_0
    //   1031: getfield 159	cn/domob/android/ads/b/b:x	Landroid/graphics/Bitmap;
    //   1034: invokevirtual 277	android/graphics/Bitmap:getWidth	()I
    //   1037: aload_0
    //   1038: getfield 159	cn/domob/android/ads/b/b:x	Landroid/graphics/Bitmap;
    //   1041: invokevirtual 280	android/graphics/Bitmap:getHeight	()I
    //   1044: aload 38
    //   1046: iconst_1
    //   1047: invokestatic 283	android/graphics/Bitmap:createBitmap	(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    //   1050: astore 44
    //   1052: aload_0
    //   1053: getfield 82	cn/domob/android/ads/b/b:M	Lcn/domob/android/ads/b/c;
    //   1056: ifnonnull +191 -> 1247
    //   1059: aload_0
    //   1060: new 84	cn/domob/android/ads/b/c
    //   1063: dup
    //   1064: aload 44
    //   1066: aload_0
    //   1067: getfield 75	cn/domob/android/ads/b/b:G	I
    //   1070: invokespecial 286	cn/domob/android/ads/b/c:<init>	(Landroid/graphics/Bitmap;I)V
    //   1073: putfield 82	cn/domob/android/ads/b/b:M	Lcn/domob/android/ads/b/c;
    //   1076: aload_0
    //   1077: aload_0
    //   1078: getfield 82	cn/domob/android/ads/b/b:M	Lcn/domob/android/ads/b/c;
    //   1081: putfield 61	cn/domob/android/ads/b/b:z	Lcn/domob/android/ads/b/c;
    //   1084: aload_0
    //   1085: getfield 73	cn/domob/android/ads/b/b:F	Z
    //   1088: ifeq +14 -> 1102
    //   1091: aload_0
    //   1092: getfield 147	cn/domob/android/ads/b/b:i	[I
    //   1095: aload_0
    //   1096: getfield 235	cn/domob/android/ads/b/b:H	I
    //   1099: iload 14
    //   1101: iastore
    //   1102: aload_0
    //   1103: aload_0
    //   1104: getfield 69	cn/domob/android/ads/b/b:D	I
    //   1107: putfield 71	cn/domob/android/ads/b/b:E	I
    //   1110: aload_0
    //   1111: aload_0
    //   1112: getfield 141	cn/domob/android/ads/b/b:p	I
    //   1115: putfield 131	cn/domob/android/ads/b/b:t	I
    //   1118: aload_0
    //   1119: aload_0
    //   1120: getfield 139	cn/domob/android/ads/b/b:q	I
    //   1123: putfield 129	cn/domob/android/ads/b/b:u	I
    //   1126: aload_0
    //   1127: aload_0
    //   1128: getfield 143	cn/domob/android/ads/b/b:r	I
    //   1131: putfield 133	cn/domob/android/ads/b/b:v	I
    //   1134: aload_0
    //   1135: aload_0
    //   1136: getfield 135	cn/domob/android/ads/b/b:s	I
    //   1139: putfield 127	cn/domob/android/ads/b/b:w	I
    //   1142: aload_0
    //   1143: aload_0
    //   1144: getfield 159	cn/domob/android/ads/b/b:x	Landroid/graphics/Bitmap;
    //   1147: putfield 117	cn/domob/android/ads/b/b:y	Landroid/graphics/Bitmap;
    //   1150: aload_0
    //   1151: aload_0
    //   1152: getfield 224	cn/domob/android/ads/b/b:k	I
    //   1155: putfield 125	cn/domob/android/ads/b/b:l	I
    //   1158: aload_0
    //   1159: iconst_0
    //   1160: putfield 69	cn/domob/android/ads/b/b:D	I
    //   1163: aload_0
    //   1164: iconst_0
    //   1165: putfield 73	cn/domob/android/ads/b/b:F	Z
    //   1168: aload_0
    //   1169: iconst_0
    //   1170: putfield 75	cn/domob/android/ads/b/b:G	I
    //   1173: aload_0
    //   1174: aconst_null
    //   1175: putfield 173	cn/domob/android/ads/b/b:h	[I
    //   1178: aload_0
    //   1179: getfield 77	cn/domob/android/ads/b/b:O	Lcn/domob/android/ads/b/a;
    //   1182: iconst_1
    //   1183: aload_0
    //   1184: getfield 113	cn/domob/android/ads/b/b:N	I
    //   1187: invokeinterface 209 3 0
    //   1192: goto -1190 -> 2
    //   1195: astore 35
    //   1197: ldc 161
    //   1199: ldc 163
    //   1201: invokestatic 168	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1204: pop
    //   1205: goto -1203 -> 2
    //   1208: astore 33
    //   1210: ldc 161
    //   1212: ldc 163
    //   1214: invokestatic 168	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1217: pop
    //   1218: goto -1216 -> 2
    //   1221: astore 42
    //   1223: ldc 161
    //   1225: ldc 163
    //   1227: invokestatic 168	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1230: pop
    //   1231: goto -1229 -> 2
    //   1234: astore 40
    //   1236: ldc 161
    //   1238: ldc 163
    //   1240: invokestatic 168	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   1243: pop
    //   1244: goto -1242 -> 2
    //   1247: aload_0
    //   1248: getfield 82	cn/domob/android/ads/b/b:M	Lcn/domob/android/ads/b/c;
    //   1251: astore 45
    //   1253: aload 45
    //   1255: getfield 86	cn/domob/android/ads/b/c:c	Lcn/domob/android/ads/b/c;
    //   1258: ifnull +13 -> 1271
    //   1261: aload 45
    //   1263: getfield 86	cn/domob/android/ads/b/c:c	Lcn/domob/android/ads/b/c;
    //   1266: astore 45
    //   1268: goto -15 -> 1253
    //   1271: aload 45
    //   1273: new 84	cn/domob/android/ads/b/c
    //   1276: dup
    //   1277: aload 44
    //   1279: aload_0
    //   1280: getfield 75	cn/domob/android/ads/b/b:G	I
    //   1283: invokespecial 286	cn/domob/android/ads/b/c:<init>	(Landroid/graphics/Bitmap;I)V
    //   1286: putfield 86	cn/domob/android/ads/b/c:c	Lcn/domob/android/ads/b/c;
    //   1289: goto -205 -> 1084
    //   1292: aload_0
    //   1293: invokespecial 184	cn/domob/android/ads/b/b:h	()I
    //   1296: lookupswitch	default:+28->1324, 249:+35->1331, 255:+118->1414
    //   1325: invokespecial 245	cn/domob/android/ads/b/b:m	()V
    //   1328: goto -1326 -> 2
    //   1331: aload_0
    //   1332: invokespecial 184	cn/domob/android/ads/b/b:h	()I
    //   1335: pop
    //   1336: aload_0
    //   1337: invokespecial 184	cn/domob/android/ads/b/b:h	()I
    //   1340: istore 6
    //   1342: aload_0
    //   1343: iload 6
    //   1345: bipush 28
    //   1347: iand
    //   1348: iconst_2
    //   1349: ishr
    //   1350: putfield 69	cn/domob/android/ads/b/b:D	I
    //   1353: aload_0
    //   1354: getfield 69	cn/domob/android/ads/b/b:D	I
    //   1357: ifne +8 -> 1365
    //   1360: aload_0
    //   1361: iconst_1
    //   1362: putfield 69	cn/domob/android/ads/b/b:D	I
    //   1365: iload 6
    //   1367: iconst_1
    //   1368: iand
    //   1369: ifeq +39 -> 1408
    //   1372: iconst_1
    //   1373: istore 7
    //   1375: aload_0
    //   1376: iload 7
    //   1378: putfield 73	cn/domob/android/ads/b/b:F	Z
    //   1381: aload_0
    //   1382: bipush 10
    //   1384: aload_0
    //   1385: invokespecial 214	cn/domob/android/ads/b/b:l	()I
    //   1388: imul
    //   1389: putfield 75	cn/domob/android/ads/b/b:G	I
    //   1392: aload_0
    //   1393: aload_0
    //   1394: invokespecial 184	cn/domob/android/ads/b/b:h	()I
    //   1397: putfield 235	cn/domob/android/ads/b/b:H	I
    //   1400: aload_0
    //   1401: invokespecial 184	cn/domob/android/ads/b/b:h	()I
    //   1404: pop
    //   1405: goto -1403 -> 2
    //   1408: iconst_0
    //   1409: istore 7
    //   1411: goto -36 -> 1375
    //   1414: aload_0
    //   1415: invokespecial 243	cn/domob/android/ads/b/b:i	()I
    //   1418: pop
    //   1419: ldc 175
    //   1421: astore_3
    //   1422: iconst_0
    //   1423: istore 4
    //   1425: iload 4
    //   1427: bipush 11
    //   1429: if_icmpge +35 -> 1464
    //   1432: new 177	java/lang/StringBuilder
    //   1435: dup
    //   1436: invokespecial 178	java/lang/StringBuilder:<init>	()V
    //   1439: aload_3
    //   1440: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1443: aload_0
    //   1444: getfield 65	cn/domob/android/ads/b/b:B	[B
    //   1447: iload 4
    //   1449: baload
    //   1450: i2c
    //   1451: invokevirtual 187	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   1454: invokevirtual 191	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1457: astore_3
    //   1458: iinc 4 1
    //   1461: goto -36 -> 1425
    //   1464: aload_3
    //   1465: ldc_w 288
    //   1468: invokevirtual 292	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1471: ifeq +10 -> 1481
    //   1474: aload_0
    //   1475: invokespecial 294	cn/domob/android/ads/b/b:k	()V
    //   1478: goto -1476 -> 2
    //   1481: aload_0
    //   1482: invokespecial 245	cn/domob/android/ads/b/b:m	()V
    //   1485: goto -1483 -> 2
    //   1488: iconst_1
    //   1489: istore_1
    //   1490: goto -1488 -> 2
    //   1493: return
    //   1494: iload 25
    //   1496: istore 59
    //   1498: iload 58
    //   1500: istore 60
    //   1502: goto -830 -> 672
    //   1505: iload 22
    //   1507: istore 46
    //   1509: iload 26
    //   1511: istore 47
    //   1513: iload 30
    //   1515: istore 48
    //   1517: iload 21
    //   1519: istore 49
    //   1521: iload 25
    //   1523: istore 50
    //   1525: iload 27
    //   1527: istore 51
    //   1529: iload 20
    //   1531: istore 52
    //   1533: iload 19
    //   1535: istore 53
    //   1537: goto -697 -> 840
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1540	0	this	b
    //   1	1489	1	i1	int
    //   1421	44	3	str	String
    //   1423	36	4	i2	int
    //   1340	29	6	i3	int
    //   1373	37	7	bool1	boolean
    //   104	44	9	i4	int
    //   116	282	10	bool2	boolean
    //   133	271	11	bool3	boolean
    //   183	6	12	bool4	boolean
    //   186	29	13	i5	int
    //   216	884	14	i6	int
    //   246	679	15	i7	int
    //   325	249	16	i8	int
    //   331	346	17	i9	int
    //   337	224	18	i10	int
    //   343	1191	19	i11	int
    //   346	1184	20	i12	int
    //   352	1166	21	i13	int
    //   360	1146	22	i14	int
    //   363	28	23	i15	int
    //   436	481	24	i16	int
    //   439	1083	25	i17	int
    //   442	1068	26	i18	int
    //   445	1081	27	i19	int
    //   448	423	28	i20	int
    //   451	72	29	i21	int
    //   454	1060	30	i22	int
    //   457	63	31	i23	int
    //   918	18	32	i24	int
    //   1208	1	33	localError1	Error
    //   1195	1	35	localException1	Exception
    //   997	19	37	localDisplayMetrics	android.util.DisplayMetrics
    //   1006	39	38	localMatrix	android.graphics.Matrix
    //   1234	1	40	localError2	Error
    //   1221	1	42	localException2	Exception
    //   1050	228	44	localBitmap	Bitmap
    //   1251	21	45	localc	c
    //   822	686	46	i25	int
    //   826	686	47	i26	int
    //   830	686	48	i27	int
    //   834	686	49	i28	int
    //   838	686	50	i29	int
    //   814	714	51	i30	int
    //   818	714	52	i31	int
    //   784	752	53	i32	int
    //   844	58	54	i33	int
    //   850	9	55	arrayOfByte1	byte[]
    //   856	18	56	i34	int
    //   895	15	57	i35	int
    //   533	966	58	i36	int
    //   658	839	59	i37	int
    //   670	831	60	i38	int
    //   730	95	61	i39	int
    //   744	9	62	arrayOfByte2	byte[]
    //   750	87	63	i40	int
    //   683	9	64	arrayOfByte3	byte[]
    //   689	24	65	i41	int
    //   652	9	66	arrayOfByte4	byte[]
    //   606	9	67	arrayOfByte5	byte[]
    //   612	15	68	i42	int
    // Exception table:
    //   from	to	target	type
    //   962	980	1195	java/lang/Exception
    //   962	980	1208	java/lang/Error
    //   1024	1052	1221	java/lang/Exception
    //   1024	1052	1234	java/lang/Error
  }
  
  private void k()
  {
    do
    {
      i();
    } while ((this.B[0] == 1) && ((this.C > 0) && (!g())));
  }
  
  private int l()
  {
    return h() | h() << 8;
  }
  
  private void m()
  {
    do
    {
      i();
    } while ((this.C > 0) && (!g()));
  }
  
  public final void a()
  {
    for (c localc = this.M; localc != null; localc = this.M)
    {
      localc.a.recycle();
      localc.a = null;
      this.M = this.M.c;
    }
    if (this.c != null) {}
    try
    {
      this.c.close();
      label54:
      this.c = null;
      this.P = null;
      return;
    }
    catch (Exception localException)
    {
      break label54;
    }
  }
  
  public final int b()
  {
    return this.N;
  }
  
  public final Bitmap c()
  {
    return a(0);
  }
  
  public final c d()
  {
    if (!this.A)
    {
      this.A = true;
      return this.M;
    }
    if (this.d == 0) {
      if (this.z.c != null) {
        this.z = this.z.c;
      }
    }
    for (;;)
    {
      return this.z;
      this.z = this.z.c;
      if (this.z == null) {
        this.z = this.M;
      }
    }
  }
  
  public final void run()
  {
    if (this.c != null) {
      f();
    }
    while (this.P == null) {
      return;
    }
    this.c = new ByteArrayInputStream(this.P);
    this.P = null;
    f();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.b.b
 * JD-Core Version:    0.7.0.1
 */