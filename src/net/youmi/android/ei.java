package net.youmi.android;

import android.content.Context;
import android.location.Location;

class ei
{
  private static Location a;
  private static ew b;
  
  static Location a(Context paramContext)
  {
    return a;
  }
  
  /* Error */
  static void a(Context paramContext, AdView paramAdView)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: getstatic 15	net/youmi/android/ei:a	Landroid/location/Location;
    //   5: ifnull +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 23
    //   12: invokevirtual 29	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   15: checkcast 31	android/location/LocationManager
    //   18: astore 4
    //   20: aload 4
    //   22: ifnull +353 -> 375
    //   25: aload 4
    //   27: ldc 33
    //   29: invokevirtual 37	android/location/LocationManager:getLastKnownLocation	(Ljava/lang/String;)Landroid/location/Location;
    //   32: astore 23
    //   34: aload 23
    //   36: ifnull +36 -> 72
    //   39: aload 23
    //   41: invokevirtual 43	android/location/Location:getLongitude	()D
    //   44: dconst_0
    //   45: dcmpl
    //   46: ifne +13 -> 59
    //   49: aload 23
    //   51: invokevirtual 46	android/location/Location:getLatitude	()D
    //   54: dconst_0
    //   55: dcmpl
    //   56: ifeq +16 -> 72
    //   59: aload 23
    //   61: putstatic 15	net/youmi/android/ei:a	Landroid/location/Location;
    //   64: return
    //   65: astore 5
    //   67: aload 5
    //   69: invokestatic 51	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   72: aload_0
    //   73: ldc 53
    //   75: invokevirtual 29	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   78: checkcast 55	android/telephony/TelephonyManager
    //   81: astore 8
    //   83: aload 8
    //   85: ifnull +112 -> 197
    //   88: aload 8
    //   90: invokevirtual 59	android/telephony/TelephonyManager:getPhoneType	()I
    //   93: istore 9
    //   95: iload 9
    //   97: iconst_2
    //   98: if_icmpne +99 -> 197
    //   101: aload 8
    //   103: invokevirtual 63	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   106: astore 13
    //   108: aload 13
    //   110: invokevirtual 67	java/lang/Object:getClass	()Ljava/lang/Class;
    //   113: invokevirtual 73	java/lang/Class:getMethods	()[Ljava/lang/reflect/Method;
    //   116: astore 14
    //   118: aload 14
    //   120: ifnull +247 -> 367
    //   123: iconst_0
    //   124: istore 15
    //   126: iconst_0
    //   127: istore 11
    //   129: aload 14
    //   131: arraylength
    //   132: istore 16
    //   134: iload 15
    //   136: iload 16
    //   138: if_icmplt +100 -> 238
    //   141: iload 11
    //   143: ifne +7 -> 150
    //   146: iload_2
    //   147: ifeq +50 -> 197
    //   150: new 39	android/location/Location
    //   153: dup
    //   154: ldc 33
    //   156: invokespecial 76	android/location/Location:<init>	(Ljava/lang/String;)V
    //   159: astore 12
    //   161: aload 12
    //   163: iload 11
    //   165: i2d
    //   166: ldc2_w 77
    //   169: ddiv
    //   170: invokevirtual 82	android/location/Location:setLatitude	(D)V
    //   173: aload 12
    //   175: iload_2
    //   176: i2d
    //   177: ldc2_w 77
    //   180: ddiv
    //   181: invokevirtual 85	android/location/Location:setLongitude	(D)V
    //   184: aload 12
    //   186: putstatic 15	net/youmi/android/ei:a	Landroid/location/Location;
    //   189: return
    //   190: astore 6
    //   192: aload 6
    //   194: invokestatic 51	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   197: getstatic 18	net/youmi/android/ei:b	Lnet/youmi/android/ew;
    //   200: ifnonnull +175 -> 375
    //   203: new 87	net/youmi/android/ew
    //   206: dup
    //   207: aload_0
    //   208: invokevirtual 91	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   211: invokespecial 94	net/youmi/android/ew:<init>	(Landroid/content/Context;)V
    //   214: putstatic 18	net/youmi/android/ei:b	Lnet/youmi/android/ew;
    //   217: aload_1
    //   218: new 96	net/youmi/android/ep
    //   221: dup
    //   222: aload 4
    //   224: invokespecial 99	net/youmi/android/ep:<init>	(Landroid/location/LocationManager;)V
    //   227: invokevirtual 105	net/youmi/android/AdView:post	(Ljava/lang/Runnable;)Z
    //   230: pop
    //   231: return
    //   232: astore_3
    //   233: aload_3
    //   234: invokestatic 51	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   237: return
    //   238: aload 14
    //   240: iload 15
    //   242: aaload
    //   243: astore 17
    //   245: aload 17
    //   247: ifnull +110 -> 357
    //   250: aload 17
    //   252: invokevirtual 111	java/lang/reflect/Method:getName	()Ljava/lang/String;
    //   255: ldc 113
    //   257: invokevirtual 119	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   260: ifeq +36 -> 296
    //   263: aload 17
    //   265: aload 13
    //   267: iconst_0
    //   268: anewarray 4	java/lang/Object
    //   271: invokevirtual 123	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   274: checkcast 125	java/lang/Integer
    //   277: invokevirtual 128	java/lang/Integer:intValue	()I
    //   280: istore 21
    //   282: iload_2
    //   283: istore 22
    //   285: iload 21
    //   287: istore 19
    //   289: iload 22
    //   291: istore 18
    //   293: goto +83 -> 376
    //   296: aload 17
    //   298: invokevirtual 111	java/lang/reflect/Method:getName	()Ljava/lang/String;
    //   301: ldc 130
    //   303: invokevirtual 119	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   306: ifeq +51 -> 357
    //   309: aload 17
    //   311: aload 13
    //   313: iconst_0
    //   314: anewarray 4	java/lang/Object
    //   317: invokevirtual 123	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   320: checkcast 125	java/lang/Integer
    //   323: invokevirtual 128	java/lang/Integer:intValue	()I
    //   326: istore 20
    //   328: iload 20
    //   330: istore 18
    //   332: iload 11
    //   334: istore 19
    //   336: goto +40 -> 376
    //   339: astore 10
    //   341: iconst_0
    //   342: istore 11
    //   344: aload 10
    //   346: invokestatic 51	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   349: goto -208 -> 141
    //   352: astore 10
    //   354: goto -10 -> 344
    //   357: iload_2
    //   358: istore 18
    //   360: iload 11
    //   362: istore 19
    //   364: goto +12 -> 376
    //   367: iconst_0
    //   368: istore_2
    //   369: iconst_0
    //   370: istore 11
    //   372: goto -231 -> 141
    //   375: return
    //   376: iinc 15 1
    //   379: iload 19
    //   381: istore 11
    //   383: iload 18
    //   385: istore_2
    //   386: goto -257 -> 129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	389	0	paramContext	Context
    //   0	389	1	paramAdView	AdView
    //   1	385	2	i	int
    //   232	2	3	localException1	java.lang.Exception
    //   18	205	4	localLocationManager	android.location.LocationManager
    //   65	3	5	localException2	java.lang.Exception
    //   190	3	6	localException3	java.lang.Exception
    //   81	21	8	localTelephonyManager	android.telephony.TelephonyManager
    //   93	6	9	j	int
    //   339	6	10	localException4	java.lang.Exception
    //   352	1	10	localException5	java.lang.Exception
    //   127	255	11	k	int
    //   159	26	12	localLocation1	Location
    //   106	206	13	localCellLocation	android.telephony.CellLocation
    //   116	123	14	arrayOfMethod	java.lang.reflect.Method[]
    //   124	253	15	m	int
    //   132	7	16	n	int
    //   243	67	17	localMethod	java.lang.reflect.Method
    //   291	93	18	i1	int
    //   287	93	19	i2	int
    //   326	3	20	i3	int
    //   280	6	21	i4	int
    //   283	7	22	i5	int
    //   32	28	23	localLocation2	Location
    // Exception table:
    //   from	to	target	type
    //   25	34	65	java/lang/Exception
    //   39	59	65	java/lang/Exception
    //   59	64	65	java/lang/Exception
    //   72	83	190	java/lang/Exception
    //   88	95	190	java/lang/Exception
    //   150	189	190	java/lang/Exception
    //   344	349	190	java/lang/Exception
    //   2	8	232	java/lang/Exception
    //   9	20	232	java/lang/Exception
    //   67	72	232	java/lang/Exception
    //   192	197	232	java/lang/Exception
    //   197	231	232	java/lang/Exception
    //   101	118	339	java/lang/Exception
    //   129	134	352	java/lang/Exception
    //   238	245	352	java/lang/Exception
    //   250	282	352	java/lang/Exception
    //   296	328	352	java/lang/Exception
  }
  
  static void a(Location paramLocation)
  {
    if (paramLocation != null) {
      a = paramLocation;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ei
 * JD-Core Version:    0.7.0.1
 */