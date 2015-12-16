package com.baidu;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

class r
{
  private static String a;
  private static String b;
  private static String c;
  private static final SimpleDateFormat d = new SimpleDateFormat("yyyyMMddHHmmss");
  
  static String a()
  {
    return Build.MODEL;
  }
  
  public static String a(Context paramContext)
  {
    if (a == null) {
      a = a(paramContext, "BaiduMobAd_APP_ID");
    }
    return a;
  }
  
  /* Error */
  public static String a(Context paramContext, t paramt, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: iconst_0
    //   4: istore 5
    //   6: new 43	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   13: astore 6
    //   15: aload 6
    //   17: ldc 46
    //   19: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: pop
    //   23: aload 6
    //   25: ldc 52
    //   27: aload_0
    //   28: invokestatic 54	com/baidu/r:b	(Landroid/content/Context;)Ljava/lang/String;
    //   31: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   34: aload 6
    //   36: ldc 59
    //   38: aload_0
    //   39: invokestatic 61	com/baidu/r:a	(Landroid/content/Context;)Ljava/lang/String;
    //   42: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   45: aload 6
    //   47: ldc 63
    //   49: aload_1
    //   50: invokevirtual 68	com/baidu/t:b	()I
    //   53: invokestatic 71	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   56: aload 6
    //   58: ldc 73
    //   60: iconst_5
    //   61: invokestatic 71	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   64: new 75	android/util/DisplayMetrics
    //   67: dup
    //   68: invokespecial 76	android/util/DisplayMetrics:<init>	()V
    //   71: astore 13
    //   73: aload_0
    //   74: invokestatic 80	com/baidu/r:j	(Landroid/content/Context;)Landroid/util/DisplayMetrics;
    //   77: astore 63
    //   79: aload 63
    //   81: astore 13
    //   83: aload 13
    //   85: getfield 84	android/util/DisplayMetrics:widthPixels	I
    //   88: i2f
    //   89: aload 13
    //   91: getfield 88	android/util/DisplayMetrics:density	F
    //   94: fmul
    //   95: f2d
    //   96: invokestatic 94	java/lang/Math:ceil	(D)D
    //   99: d2i
    //   100: istore 16
    //   102: aload 13
    //   104: getfield 97	android/util/DisplayMetrics:heightPixels	I
    //   107: i2f
    //   108: aload 13
    //   110: getfield 88	android/util/DisplayMetrics:density	F
    //   113: fmul
    //   114: f2d
    //   115: invokestatic 94	java/lang/Math:ceil	(D)D
    //   118: d2i
    //   119: istore 17
    //   121: iload 16
    //   123: iload 17
    //   125: invokestatic 101	java/lang/Math:min	(II)I
    //   128: istore 18
    //   130: iload 18
    //   132: lookupswitch	default:+1003->1135, 320:+645->777, 400:+652->784, 480:+659->791, 640:+666->798
    //   177: iconst_3
    //   178: ldc 103
    //   180: iload 19
    //   182: invokestatic 71	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   185: aload 6
    //   187: ldc 105
    //   189: iload 18
    //   191: invokestatic 71	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   194: aload 6
    //   196: ldc 107
    //   198: ldc 109
    //   200: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   203: aload 6
    //   205: ldc 111
    //   207: ldc 109
    //   209: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   212: aload_0
    //   213: invokestatic 114	com/baidu/r:c	(Landroid/content/Context;)Z
    //   216: ifeq +589 -> 805
    //   219: aload 6
    //   221: ldc 116
    //   223: iload 4
    //   225: invokestatic 71	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   228: aload 6
    //   230: ldc 118
    //   232: invokestatic 120	com/baidu/r:a	()Ljava/lang/String;
    //   235: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   238: aload 6
    //   240: ldc 122
    //   242: invokestatic 124	com/baidu/r:b	()Ljava/lang/String;
    //   245: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   248: aload 6
    //   250: ldc 126
    //   252: ldc 128
    //   254: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   257: aload 6
    //   259: ldc 130
    //   261: invokestatic 132	com/baidu/r:c	()Ljava/lang/String;
    //   264: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   267: aload 6
    //   269: ldc 134
    //   271: iload 16
    //   273: invokestatic 71	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   276: aload 6
    //   278: ldc 136
    //   280: iload 17
    //   282: invokestatic 71	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;I)V
    //   285: aload 6
    //   287: ldc 138
    //   289: aload_0
    //   290: invokestatic 141	com/baidu/r:f	(Landroid/content/Context;)Ljava/lang/String;
    //   293: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   296: aload 6
    //   298: ldc 143
    //   300: aload_0
    //   301: invokestatic 146	com/baidu/r:g	(Landroid/content/Context;)Ljava/lang/String;
    //   304: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   307: aload 6
    //   309: ldc 148
    //   311: aload_0
    //   312: invokestatic 151	com/baidu/r:l	(Landroid/content/Context;)Ljava/lang/String;
    //   315: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   318: aload 6
    //   320: ldc 153
    //   322: aload_3
    //   323: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   326: aload 6
    //   328: ldc 155
    //   330: aload_0
    //   331: invokestatic 158	com/baidu/r:e	(Landroid/content/Context;)Ljava/lang/String;
    //   334: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   337: aload 6
    //   339: ldc 160
    //   341: aload_0
    //   342: invokestatic 162	com/baidu/r:d	(Landroid/content/Context;)Ljava/lang/String;
    //   345: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   348: aload_0
    //   349: ldc 164
    //   351: invokestatic 169	com/baidu/w:h	(Landroid/content/Context;Ljava/lang/String;)Z
    //   354: ifeq +166 -> 520
    //   357: aload_0
    //   358: ldc 171
    //   360: invokevirtual 177	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   363: checkcast 179	android/location/LocationManager
    //   366: ldc 181
    //   368: invokevirtual 185	android/location/LocationManager:getLastKnownLocation	(Ljava/lang/String;)Landroid/location/Location;
    //   371: astore 56
    //   373: ldc 187
    //   375: new 43	java/lang/StringBuilder
    //   378: dup
    //   379: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   382: ldc 189
    //   384: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: aload 56
    //   389: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   392: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   395: invokestatic 200	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   398: pop
    //   399: aload 56
    //   401: ifnull +119 -> 520
    //   404: invokestatic 206	java/lang/System:currentTimeMillis	()J
    //   407: lstore 58
    //   409: iconst_3
    //   410: anewarray 4	java/lang/Object
    //   413: astore 60
    //   415: aload 60
    //   417: iconst_0
    //   418: lload 58
    //   420: invokestatic 212	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   423: aastore
    //   424: aload 60
    //   426: iconst_1
    //   427: aload 56
    //   429: invokevirtual 217	android/location/Location:getTime	()J
    //   432: invokestatic 212	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   435: aastore
    //   436: aload 60
    //   438: iconst_2
    //   439: lload 58
    //   441: aload 56
    //   443: invokevirtual 217	android/location/Location:getTime	()J
    //   446: lsub
    //   447: invokestatic 212	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   450: aastore
    //   451: ldc 187
    //   453: ldc 219
    //   455: aload 60
    //   457: invokestatic 225	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   460: invokestatic 200	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   463: pop
    //   464: iconst_3
    //   465: anewarray 4	java/lang/Object
    //   468: astore 62
    //   470: aload 62
    //   472: iconst_0
    //   473: aload 56
    //   475: invokevirtual 217	android/location/Location:getTime	()J
    //   478: invokestatic 212	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   481: aastore
    //   482: aload 62
    //   484: iconst_1
    //   485: aload 56
    //   487: invokevirtual 229	android/location/Location:getLongitude	()D
    //   490: invokestatic 234	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   493: aastore
    //   494: aload 62
    //   496: iconst_2
    //   497: aload 56
    //   499: invokevirtual 237	android/location/Location:getLatitude	()D
    //   502: invokestatic 234	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   505: aastore
    //   506: aload 6
    //   508: ldc 238
    //   510: ldc 240
    //   512: aload 62
    //   514: invokestatic 225	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   517: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   520: aload_0
    //   521: ldc 242
    //   523: invokestatic 169	com/baidu/w:h	(Landroid/content/Context;Ljava/lang/String;)Z
    //   526: ifeq +199 -> 725
    //   529: aload_0
    //   530: ldc 244
    //   532: invokevirtual 177	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   535: checkcast 246	android/net/wifi/WifiManager
    //   538: astore 38
    //   540: aload 38
    //   542: invokevirtual 250	android/net/wifi/WifiManager:isWifiEnabled	()Z
    //   545: ifeq +180 -> 725
    //   548: ldc 252
    //   550: new 43	java/lang/StringBuilder
    //   553: dup
    //   554: invokespecial 44	java/lang/StringBuilder:<init>	()V
    //   557: aload 38
    //   559: invokevirtual 256	android/net/wifi/WifiManager:getScanResults	()Ljava/util/List;
    //   562: invokevirtual 192	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   565: ldc_w 258
    //   568: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   571: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   574: invokestatic 200	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   577: pop
    //   578: ldc_w 259
    //   581: istore 40
    //   583: iconst_m1
    //   584: istore 41
    //   586: iload 5
    //   588: aload 38
    //   590: invokevirtual 256	android/net/wifi/WifiManager:getScanResults	()Ljava/util/List;
    //   593: invokeinterface 264 1 0
    //   598: if_icmpge +317 -> 915
    //   601: aload 38
    //   603: invokevirtual 256	android/net/wifi/WifiManager:getScanResults	()Ljava/util/List;
    //   606: iload 5
    //   608: invokeinterface 268 2 0
    //   613: checkcast 270	android/net/wifi/ScanResult
    //   616: astore 50
    //   618: aload 50
    //   620: getfield 273	android/net/wifi/ScanResult:level	I
    //   623: invokestatic 277	java/lang/Math:abs	(I)I
    //   626: istore 51
    //   628: iconst_3
    //   629: anewarray 4	java/lang/Object
    //   632: astore 52
    //   634: aload 52
    //   636: iconst_0
    //   637: aload 50
    //   639: getfield 280	android/net/wifi/ScanResult:SSID	Ljava/lang/String;
    //   642: aastore
    //   643: aload 52
    //   645: iconst_1
    //   646: aload 50
    //   648: getfield 283	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   651: aastore
    //   652: aload 52
    //   654: iconst_2
    //   655: iload 51
    //   657: invokestatic 288	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   660: aastore
    //   661: ldc_w 290
    //   664: aload 52
    //   666: invokestatic 225	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   669: invokestatic 293	com/baidu/bk:b	(Ljava/lang/String;)I
    //   672: pop
    //   673: iload 40
    //   675: iload 51
    //   677: if_icmple +447 -> 1124
    //   680: iload 5
    //   682: istore 54
    //   684: iload 51
    //   686: istore 55
    //   688: iinc 5 1
    //   691: iload 55
    //   693: istore 40
    //   695: iload 54
    //   697: istore 41
    //   699: goto -113 -> 586
    //   702: astore 14
    //   704: ldc 187
    //   706: aload 14
    //   708: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   711: pop
    //   712: goto -629 -> 83
    //   715: astore 8
    //   717: ldc 187
    //   719: aload 8
    //   721: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   724: pop
    //   725: ldc 187
    //   727: aload 6
    //   729: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   732: invokestatic 200	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   735: pop
    //   736: new 43	java/lang/StringBuilder
    //   739: dup
    //   740: aload_2
    //   741: invokespecial 297	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   744: ldc_w 299
    //   747: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   750: aload 6
    //   752: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   755: invokestatic 304	com/baidu/ax:a	(Ljava/lang/String;)Ljava/lang/String;
    //   758: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   761: invokevirtual 195	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   764: astore 11
    //   766: ldc 187
    //   768: aload 11
    //   770: invokestatic 200	com/baidu/bk:b	(Ljava/lang/String;Ljava/lang/String;)I
    //   773: pop
    //   774: aload 11
    //   776: areturn
    //   777: bipush 48
    //   779: istore 19
    //   781: goto -605 -> 176
    //   784: bipush 85
    //   786: istore 19
    //   788: goto -612 -> 176
    //   791: bipush 80
    //   793: istore 19
    //   795: goto -619 -> 176
    //   798: bipush 96
    //   800: istore 19
    //   802: goto -626 -> 176
    //   805: iconst_0
    //   806: istore 4
    //   808: goto -589 -> 219
    //   811: astore 20
    //   813: ldc 187
    //   815: aload 20
    //   817: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   820: pop
    //   821: goto -554 -> 267
    //   824: astore 22
    //   826: ldc 187
    //   828: aload 22
    //   830: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   833: pop
    //   834: goto -538 -> 296
    //   837: astore 24
    //   839: ldc 187
    //   841: aload 24
    //   843: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   846: pop
    //   847: goto -540 -> 307
    //   850: astore 26
    //   852: ldc 187
    //   854: aload 26
    //   856: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   859: pop
    //   860: goto -542 -> 318
    //   863: astore 28
    //   865: ldc 187
    //   867: aload 28
    //   869: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   872: pop
    //   873: goto -547 -> 326
    //   876: astore 30
    //   878: ldc 187
    //   880: aload 30
    //   882: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   885: pop
    //   886: goto -549 -> 337
    //   889: astore 32
    //   891: ldc 187
    //   893: aload 32
    //   895: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   898: pop
    //   899: goto -551 -> 348
    //   902: astore 34
    //   904: ldc 187
    //   906: aload 34
    //   908: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   911: pop
    //   912: goto -392 -> 520
    //   915: iload 41
    //   917: iflt +133 -> 1050
    //   920: aload 38
    //   922: invokevirtual 256	android/net/wifi/WifiManager:getScanResults	()Ljava/util/List;
    //   925: iload 41
    //   927: invokeinterface 268 2 0
    //   932: checkcast 270	android/net/wifi/ScanResult
    //   935: astore 45
    //   937: aload 45
    //   939: getfield 283	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   942: ldc_w 306
    //   945: ldc_w 258
    //   948: invokevirtual 310	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   951: invokevirtual 313	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   954: astore 46
    //   956: iconst_2
    //   957: anewarray 4	java/lang/Object
    //   960: astore 47
    //   962: aload 47
    //   964: iconst_0
    //   965: aload 46
    //   967: aastore
    //   968: aload 47
    //   970: iconst_1
    //   971: aload 45
    //   973: getfield 273	android/net/wifi/ScanResult:level	I
    //   976: invokestatic 277	java/lang/Math:abs	(I)I
    //   979: invokestatic 288	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   982: aastore
    //   983: aload 6
    //   985: ldc_w 315
    //   988: ldc_w 317
    //   991: aload 47
    //   993: invokestatic 225	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   996: invokestatic 57	com/baidu/r:a	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    //   999: iconst_3
    //   1000: anewarray 4	java/lang/Object
    //   1003: astore 48
    //   1005: aload 48
    //   1007: iconst_0
    //   1008: aload 45
    //   1010: getfield 280	android/net/wifi/ScanResult:SSID	Ljava/lang/String;
    //   1013: aastore
    //   1014: aload 48
    //   1016: iconst_1
    //   1017: aload 45
    //   1019: getfield 283	android/net/wifi/ScanResult:BSSID	Ljava/lang/String;
    //   1022: aastore
    //   1023: aload 48
    //   1025: iconst_2
    //   1026: aload 45
    //   1028: getfield 273	android/net/wifi/ScanResult:level	I
    //   1031: invokestatic 277	java/lang/Math:abs	(I)I
    //   1034: invokestatic 288	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1037: aastore
    //   1038: ldc_w 319
    //   1041: aload 48
    //   1043: invokestatic 225	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1046: invokestatic 293	com/baidu/bk:b	(Ljava/lang/String;)I
    //   1049: pop
    //   1050: aload 38
    //   1052: invokevirtual 323	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   1055: astore 42
    //   1057: iconst_3
    //   1058: anewarray 4	java/lang/Object
    //   1061: astore 43
    //   1063: aload 43
    //   1065: iconst_0
    //   1066: aload 42
    //   1068: invokevirtual 328	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   1071: aastore
    //   1072: aload 43
    //   1074: iconst_1
    //   1075: aload 42
    //   1077: invokevirtual 331	android/net/wifi/WifiInfo:getMacAddress	()Ljava/lang/String;
    //   1080: aastore
    //   1081: aload 43
    //   1083: iconst_2
    //   1084: aload 42
    //   1086: invokevirtual 334	android/net/wifi/WifiInfo:getRssi	()I
    //   1089: invokestatic 277	java/lang/Math:abs	(I)I
    //   1092: invokestatic 288	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1095: aastore
    //   1096: ldc_w 336
    //   1099: aload 43
    //   1101: invokestatic 225	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   1104: invokestatic 293	com/baidu/bk:b	(Ljava/lang/String;)I
    //   1107: pop
    //   1108: goto -383 -> 725
    //   1111: astore 36
    //   1113: ldc 187
    //   1115: aload 36
    //   1117: invokestatic 296	com/baidu/bk:a	(Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1120: pop
    //   1121: goto -396 -> 725
    //   1124: iload 41
    //   1126: istore 54
    //   1128: iload 40
    //   1130: istore 55
    //   1132: goto -444 -> 688
    //   1135: ldc2_w 337
    //   1138: iload 18
    //   1140: i2d
    //   1141: dmul
    //   1142: d2i
    //   1143: istore 19
    //   1145: goto -969 -> 176
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1148	0	paramContext	Context
    //   0	1148	1	paramt	t
    //   0	1148	2	paramString1	String
    //   0	1148	3	paramString2	String
    //   1	806	4	i	int
    //   4	685	5	j	int
    //   13	971	6	localStringBuilder	StringBuilder
    //   715	5	8	localException1	Exception
    //   764	11	11	str1	String
    //   71	38	13	localObject	Object
    //   702	5	14	localException2	Exception
    //   100	172	16	k	int
    //   119	162	17	m	int
    //   128	1011	18	n	int
    //   180	964	19	i1	int
    //   811	5	20	localException3	Exception
    //   824	5	22	localException4	Exception
    //   837	5	24	localException5	Exception
    //   850	5	26	localException6	Exception
    //   863	5	28	localException7	Exception
    //   876	5	30	localException8	Exception
    //   889	5	32	localException9	Exception
    //   902	5	34	localException10	Exception
    //   1111	5	36	localException11	Exception
    //   538	513	38	localWifiManager	android.net.wifi.WifiManager
    //   581	548	40	i2	int
    //   584	541	41	i3	int
    //   1055	30	42	localWifiInfo	android.net.wifi.WifiInfo
    //   1061	39	43	arrayOfObject1	Object[]
    //   935	92	45	localScanResult1	android.net.wifi.ScanResult
    //   954	12	46	str2	String
    //   960	32	47	arrayOfObject2	Object[]
    //   1003	39	48	arrayOfObject3	Object[]
    //   616	31	50	localScanResult2	android.net.wifi.ScanResult
    //   626	59	51	i4	int
    //   632	33	52	arrayOfObject4	Object[]
    //   682	445	54	i5	int
    //   686	445	55	i6	int
    //   371	127	56	localLocation	android.location.Location
    //   407	33	58	l	long
    //   413	43	60	arrayOfObject5	Object[]
    //   468	45	62	arrayOfObject6	Object[]
    //   77	3	63	localDisplayMetrics	DisplayMetrics
    // Exception table:
    //   from	to	target	type
    //   73	79	702	java/lang/Exception
    //   23	73	715	java/lang/Exception
    //   83	130	715	java/lang/Exception
    //   176	219	715	java/lang/Exception
    //   219	228	715	java/lang/Exception
    //   267	285	715	java/lang/Exception
    //   704	712	715	java/lang/Exception
    //   813	821	715	java/lang/Exception
    //   826	834	715	java/lang/Exception
    //   839	847	715	java/lang/Exception
    //   852	860	715	java/lang/Exception
    //   865	873	715	java/lang/Exception
    //   878	886	715	java/lang/Exception
    //   891	899	715	java/lang/Exception
    //   904	912	715	java/lang/Exception
    //   1113	1121	715	java/lang/Exception
    //   228	267	811	java/lang/Exception
    //   285	296	824	java/lang/Exception
    //   296	307	837	java/lang/Exception
    //   307	318	850	java/lang/Exception
    //   318	326	863	java/lang/Exception
    //   326	337	876	java/lang/Exception
    //   337	348	889	java/lang/Exception
    //   348	399	902	java/lang/Exception
    //   404	520	902	java/lang/Exception
    //   520	578	1111	java/lang/Exception
    //   586	673	1111	java/lang/Exception
    //   920	1050	1111	java/lang/Exception
    //   1050	1108	1111	java/lang/Exception
  }
  
  private static String a(Context paramContext, String paramString)
  {
    String str = "error";
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if (localApplicationInfo != null)
      {
        Object localObject = localApplicationInfo.metaData.get(paramString);
        str = localObject + "";
        if (str.trim().equals("")) {
          throw new Exception();
        }
      }
    }
    catch (Exception localException)
    {
      bk.b(String.format("Could not read %s meta-data from AndroidManifest.xml", new Object[] { paramString }), localException);
      bk.b(String.format("getMetaData{%s: %s}", new Object[] { paramString, str }));
    }
    return str;
  }
  
  public static void a(String paramString)
  {
    b = paramString + "_cpr";
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString, int paramInt)
  {
    a(paramStringBuilder, paramString, "" + paramInt);
  }
  
  private static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    try
    {
      paramStringBuilder.append("&").append(paramString1).append("=").append(paramString2);
      return;
    }
    catch (Exception localException)
    {
      bk.a("addParamter", localException);
    }
  }
  
  public static String b()
  {
    return Build.BRAND;
  }
  
  public static String b(Context paramContext)
  {
    if (b == null) {
      a(a(paramContext, "BaiduMobAd_APP_SEC"));
    }
    return b;
  }
  
  public static String c()
  {
    return Build.VERSION.SDK;
  }
  
  public static boolean c(Context paramContext)
  {
    return "debug_cpr".equals(b(paramContext));
  }
  
  public static String d()
  {
    return d.format(new Date(System.currentTimeMillis()));
  }
  
  static String d(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
  }
  
  public static String e(Context paramContext)
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Integer.valueOf(0);
    arrayOfObject1[1] = Integer.valueOf(0);
    arrayOfObject1[2] = Integer.valueOf(0);
    String str1 = String.format("%s_%s_%s", arrayOfObject1);
    try
    {
      CellLocation localCellLocation = ((TelephonyManager)paramContext.getSystemService("phone")).getCellLocation();
      bk.b("getLocation cell:", localCellLocation + "");
      if (localCellLocation == null) {
        return str1;
      }
      if ((localCellLocation instanceof GsmCellLocation))
      {
        GsmCellLocation localGsmCellLocation = (GsmCellLocation)localCellLocation;
        Object[] arrayOfObject3 = new Object[3];
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = Integer.valueOf(localGsmCellLocation.getCid());
        arrayOfObject3[0] = String.format("%d", arrayOfObject4);
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Integer.valueOf(localGsmCellLocation.getLac());
        arrayOfObject3[1] = String.format("%d", arrayOfObject5);
        arrayOfObject3[2] = Integer.valueOf(0);
        return String.format("%s_%s_%s", arrayOfObject3);
      }
      String[] arrayOfString = localCellLocation.toString().replace("[", "").replace("]", "").split(",");
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = arrayOfString[0];
      arrayOfObject2[1] = arrayOfString[3];
      arrayOfObject2[2] = arrayOfString[4];
      String str2 = String.format("%s_%s_%s", arrayOfObject2);
      return str2;
    }
    catch (Exception localException)
    {
      bk.a("getLocation", localException);
    }
    return str1;
  }
  
  public static String f(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
  }
  
  public static String g(Context paramContext)
  {
    return ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperator();
  }
  
  public static int h(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.heightPixels;
  }
  
  public static int i(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics.widthPixels;
  }
  
  public static DisplayMetrics j(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }
  
  public static boolean k(Context paramContext)
  {
    for (;;)
    {
      try
      {
        ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
        NetworkInfo[] arrayOfNetworkInfo = new NetworkInfo[2];
        arrayOfNetworkInfo[0] = localConnectivityManager.getNetworkInfo(0);
        arrayOfNetworkInfo[1] = localConnectivityManager.getNetworkInfo(1);
        int i = arrayOfNetworkInfo.length;
        j = 0;
        if (j >= i) {
          break label133;
        }
        NetworkInfo localNetworkInfo = arrayOfNetworkInfo[j];
        if (localNetworkInfo != null)
        {
          boolean bool2 = localNetworkInfo.isAvailable();
          if (bool2) {
            bool1 = true;
          }
        }
      }
      catch (Exception localException1)
      {
        int j;
        bool1 = false;
        Exception localException2 = localException1;
        bk.a("networkAvailable", localException2);
        return bool1;
      }
      try
      {
        bk.b("AdManager", "networkAvailable: " + bool1);
        return bool1;
      }
      catch (Exception localException3)
      {
        continue;
      }
      j++;
      continue;
      label133:
      boolean bool1 = false;
    }
  }
  
  public static String l(Context paramContext)
  {
    if (c == null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      try
      {
        Enumeration localEnumeration = new JarFile(paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).sourceDir).entries();
        while (localEnumeration.hasMoreElements())
        {
          JarEntry localJarEntry = (JarEntry)localEnumeration.nextElement();
          if (!"AndroidManifest.xml".equals(localJarEntry.getName()))
          {
            Object[] arrayOfObject = new Object[2];
            arrayOfObject[0] = localJarEntry.getName();
            arrayOfObject[1] = Long.valueOf(localJarEntry.getSize());
            localStringBuilder.append(String.format("%s_%d__", arrayOfObject));
          }
        }
        return c;
      }
      catch (Exception localException)
      {
        bk.a("AdManager.getCS", localException);
        c = w.f(localStringBuilder.toString());
      }
    }
  }
  
  public static void m(Context paramContext)
  {
    w.g(paramContext, "android.permission.INTERNET");
    w.g(paramContext, "android.permission.ACCESS_NETWORK_STATE");
    w.g(paramContext, "android.permission.READ_PHONE_STATE");
    w.g(paramContext, "android.permission.ACCESS_COARSE_LOCATION");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.r
 * JD-Core Version:    0.7.0.1
 */