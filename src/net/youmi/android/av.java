package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

class av
{
  /* Error */
  private static String a(Context paramContext, ArrayList paramArrayList)
  {
    // Byte code:
    //   0: new 14	java/lang/StringBuilder
    //   3: dup
    //   4: sipush 512
    //   7: invokespecial 17	java/lang/StringBuilder:<init>	(I)V
    //   10: astore_2
    //   11: iconst_4
    //   12: invokestatic 22	net/youmi/android/cq:a	(I)Ljava/lang/String;
    //   15: astore 4
    //   17: aload_2
    //   18: invokestatic 28	net/youmi/android/w:h	()Ljava/lang/String;
    //   21: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: pop
    //   25: aload_2
    //   26: ldc 34
    //   28: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_2
    //   33: invokestatic 39	net/youmi/android/bq:b	()Ljava/lang/String;
    //   36: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: aload_2
    //   41: invokestatic 42	net/youmi/android/er:b	()Ljava/lang/String;
    //   44: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: pop
    //   48: aload_2
    //   49: aload 4
    //   51: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: new 44	java/io/ByteArrayOutputStream
    //   58: dup
    //   59: sipush 512
    //   62: invokespecial 45	java/io/ByteArrayOutputStream:<init>	(I)V
    //   65: astore 10
    //   67: aload_0
    //   68: invokestatic 50	net/youmi/android/eh:a	(Landroid/content/Context;)Lnet/youmi/android/el;
    //   71: invokevirtual 54	net/youmi/android/el:a	()Ljava/lang/String;
    //   74: aload 10
    //   76: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   79: aload 10
    //   81: bipush 38
    //   83: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   86: aload_1
    //   87: ifnull +43 -> 130
    //   90: aload_1
    //   91: invokevirtual 68	java/util/ArrayList:size	()I
    //   94: ifle +36 -> 130
    //   97: new 14	java/lang/StringBuilder
    //   100: dup
    //   101: bipush 50
    //   103: invokespecial 17	java/lang/StringBuilder:<init>	(I)V
    //   106: astore 11
    //   108: iconst_0
    //   109: istore 12
    //   111: iload 12
    //   113: aload_1
    //   114: invokevirtual 68	java/util/ArrayList:size	()I
    //   117: if_icmplt +77 -> 194
    //   120: aload 11
    //   122: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   125: aload 10
    //   127: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   130: aload 10
    //   132: bipush 38
    //   134: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   137: aload 10
    //   139: invokestatic 74	net/youmi/android/av:a	(Ljava/io/ByteArrayOutputStream;)V
    //   142: new 14	java/lang/StringBuilder
    //   145: dup
    //   146: invokestatic 77	net/youmi/android/bq:d	()Ljava/lang/String;
    //   149: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   152: invokespecial 86	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   155: invokestatic 89	net/youmi/android/er:e	()Ljava/lang/String;
    //   158: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: aload 4
    //   163: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   166: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   169: invokestatic 92	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   172: astore 15
    //   174: aload_2
    //   175: aload 10
    //   177: invokevirtual 96	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   180: aload 15
    //   182: invokestatic 99	net/youmi/android/cq:a	([BLjava/lang/String;)Ljava/lang/String;
    //   185: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: pop
    //   189: aload_2
    //   190: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   193: areturn
    //   194: aload 11
    //   196: aload_1
    //   197: iload 12
    //   199: invokevirtual 103	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   202: invokevirtual 106	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: iload 12
    //   208: iconst_m1
    //   209: aload_1
    //   210: invokevirtual 68	java/util/ArrayList:size	()I
    //   213: iadd
    //   214: if_icmpge +11 -> 225
    //   217: aload 11
    //   219: ldc 108
    //   221: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: pop
    //   225: iinc 12 1
    //   228: goto -117 -> 111
    //   231: astore_3
    //   232: aconst_null
    //   233: areturn
    //   234: astore 16
    //   236: goto -47 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	paramContext	Context
    //   0	239	1	paramArrayList	ArrayList
    //   10	180	2	localStringBuilder1	StringBuilder
    //   231	1	3	localException1	Exception
    //   15	147	4	str1	String
    //   65	111	10	localByteArrayOutputStream	ByteArrayOutputStream
    //   106	112	11	localStringBuilder2	StringBuilder
    //   109	117	12	i	int
    //   172	9	15	str2	String
    //   234	1	16	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	86	231	java/lang/Exception
    //   90	108	231	java/lang/Exception
    //   111	130	231	java/lang/Exception
    //   130	174	231	java/lang/Exception
    //   189	194	231	java/lang/Exception
    //   194	225	231	java/lang/Exception
    //   174	189	234	java/lang/Exception
  }
  
  static cu a(Context paramContext, String paramString, long paramLong, AdView paramAdView)
  {
    for (;;)
    {
      try
      {
        JSONObject localJSONObject1 = new JSONObject(paramString);
        i = cy.a(localJSONObject1, "c", -999);
        if (i >= 0)
        {
          str1 = cy.a(localJSONObject1, "rsd", null);
          if (str1 == null) {
            break label573;
          }
          bk.a(cy.a(localJSONObject1, "rt", 30));
          str2 = cy.a(localJSONObject1, "cc", null);
          JSONObject localJSONObject2 = cy.a(localJSONObject1, "d", null);
          if (localJSONObject2 == null) {
            break label573;
          }
          str3 = cy.a(localJSONObject2, "id", null);
          if (str3 == null) {
            break label573;
          }
          j = cy.a(localJSONObject2, "t", -1);
          if (j <= -1) {
            break label573;
          }
          k = cy.a(localJSONObject2, "ot", -1);
          if (k <= -1) {
            break label573;
          }
          str4 = cy.a(localJSONObject2, "e", null);
          if (str4 == null) {
            break label573;
          }
          localJSONObject3 = cy.a(localJSONObject2, "src", null);
          if (localJSONObject3 == null) {
            break label573;
          }
          str5 = cy.a(localJSONObject3, "iu", null);
          str6 = cy.a(localJSONObject3, "mu", null);
          str7 = cy.a(localJSONObject3, "cu", null);
          str8 = cy.a(localJSONObject3, "st", null);
          str9 = cy.a(localJSONObject3, "su", null);
          JSONObject localJSONObject4 = cy.a(localJSONObject3, "text", null);
          str10 = null;
          str11 = null;
          if (localJSONObject4 != null)
          {
            str10 = cy.a(localJSONObject4, "tt", null);
            str11 = cy.a(localJSONObject4, "st", null);
          }
          localJSONObject5 = cy.a(localJSONObject2, "dest", null);
          if (localJSONObject5 == null) {
            break label573;
          }
          str12 = cy.a(localJSONObject5, "js", null);
          if (str12 != null)
          {
            str12 = str12.trim();
            if (str12.length() > 0) {
              ak.a(str12);
            }
          }
          str13 = cy.a(localJSONObject5, "tu", null);
          if (str13 == null) {
            break label573;
          }
          localJSONArray = cy.a(localJSONObject5, "imgs", null);
          if (localJSONArray == null) {
            continue;
          }
          int m = localJSONArray.length();
          localObject1 = null;
          if (m > 0) {
            n = 0;
          }
        }
      }
      catch (Exception localException1)
      {
        int i;
        String str1;
        String str2;
        String str3;
        int j;
        int k;
        String str4;
        JSONObject localJSONObject3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONObject localJSONObject5;
        String str12;
        String str13;
        JSONArray localJSONArray;
        Object localObject1;
        int n;
        int i1;
        boolean bool1;
        label377:
        boolean bool2;
        label391:
        boolean bool3;
        label496:
        label502:
        break label573;
        Object localObject2 = null;
        continue;
      }
      try
      {
        i1 = localJSONArray.length();
        if (n < i1) {
          continue;
        }
      }
      catch (Exception localException2) {}
    }
    localObject2 = localObject1;
    if (cy.a(localJSONObject5, "ic", 0) <= 0)
    {
      bool1 = false;
      if (cy.a(localJSONObject3, "il", 1) != 0) {
        break label496;
      }
      bool2 = false;
      if (ak.a() == null) {
        break label502;
      }
      bool3 = true;
    }
    for (;;)
    {
      cu localcu = cu.a(paramContext, bool3, str3, str1, str4, j, k, str2, str10, str11, str5, str6, str7, str8, str9, str13, localObject2, bool1, bool2, str12, paramLong);
      return localcu;
      if (localObject1 == null)
      {
        ArrayList localArrayList = new ArrayList(localJSONArray.length());
        localObject1 = localArrayList;
      }
      localObject1.add(localJSONArray.getString(n));
      n++;
      break;
      bool1 = true;
      break label377;
      bool2 = true;
      break label391;
      bool3 = false;
      continue;
      if (i == -999) {
        f.b("Unable to connect to the server, please check your network configuration!");
      }
      while (paramAdView != null)
      {
        paramAdView.i();
        break;
        f.b("Request Ad Error Code : " + i);
      }
    }
    label573:
    return null;
  }
  
  /* Error */
  static cu a(Context paramContext, AdView paramAdView)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: invokestatic 223	net/youmi/android/er:d	()Z
    //   5: ifne +5 -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: invokestatic 227	net/youmi/android/n:a	()V
    //   13: invokestatic 229	net/youmi/android/eh:e	()V
    //   16: invokestatic 235	java/lang/System:currentTimeMillis	()J
    //   19: ldc2_w 236
    //   22: ldiv
    //   23: lstore 4
    //   25: new 14	java/lang/StringBuilder
    //   28: dup
    //   29: sipush 512
    //   32: invokespecial 17	java/lang/StringBuilder:<init>	(I)V
    //   35: astore 6
    //   37: iconst_4
    //   38: invokestatic 22	net/youmi/android/cq:a	(I)Ljava/lang/String;
    //   41: astore 7
    //   43: aload 6
    //   45: invokestatic 238	net/youmi/android/w:a	()Ljava/lang/String;
    //   48: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload 6
    //   54: ldc 34
    //   56: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: aload 6
    //   62: invokestatic 39	net/youmi/android/bq:b	()Ljava/lang/String;
    //   65: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload 6
    //   71: invokestatic 42	net/youmi/android/er:b	()Ljava/lang/String;
    //   74: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: aload 6
    //   80: aload 7
    //   82: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: new 44	java/io/ByteArrayOutputStream
    //   89: dup
    //   90: sipush 512
    //   93: invokespecial 45	java/io/ByteArrayOutputStream:<init>	(I)V
    //   96: astore 13
    //   98: aload_0
    //   99: invokestatic 241	net/youmi/android/er:a	(Landroid/content/Context;)I
    //   102: iconst_2
    //   103: aload 13
    //   105: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   108: aload_0
    //   109: invokestatic 249	net/youmi/android/bv:a	(Landroid/content/Context;)Z
    //   112: istore 14
    //   114: iload 14
    //   116: ifeq +656 -> 772
    //   119: iconst_3
    //   120: istore 15
    //   122: aload_0
    //   123: invokestatic 254	net/youmi/android/s:a	(Landroid/content/Context;)Ljava/lang/String;
    //   126: astore 26
    //   128: aload 26
    //   130: ldc_w 256
    //   133: invokevirtual 259	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   136: ifne +29 -> 165
    //   139: aload 26
    //   141: ldc_w 261
    //   144: invokevirtual 259	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   147: ifne +18 -> 165
    //   150: aload 26
    //   152: ldc_w 263
    //   155: invokevirtual 259	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   158: istore 27
    //   160: iload 27
    //   162: ifeq +10 -> 172
    //   165: iload 15
    //   167: bipush 8
    //   169: ior
    //   170: istore 15
    //   172: aload_0
    //   173: invokestatic 268	net/youmi/android/ei:a	(Landroid/content/Context;)Landroid/location/Location;
    //   176: astore 25
    //   178: aload 25
    //   180: ifnull +9 -> 189
    //   183: iload 15
    //   185: iconst_4
    //   186: ior
    //   187: istore 15
    //   189: iload 15
    //   191: bipush 16
    //   193: ior
    //   194: istore 18
    //   196: iload 18
    //   198: iconst_2
    //   199: aload 13
    //   201: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   204: aload_1
    //   205: invokevirtual 271	net/youmi/android/AdView:b	()Lnet/youmi/android/ca;
    //   208: invokevirtual 276	net/youmi/android/ca:a	()Lnet/youmi/android/y;
    //   211: invokevirtual 280	net/youmi/android/y:a	()I
    //   214: iconst_2
    //   215: aload 13
    //   217: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   220: aload_1
    //   221: invokevirtual 271	net/youmi/android/AdView:b	()Lnet/youmi/android/ca;
    //   224: invokevirtual 276	net/youmi/android/ca:a	()Lnet/youmi/android/y;
    //   227: invokevirtual 283	net/youmi/android/y:b	()Lnet/youmi/android/dv;
    //   230: invokevirtual 286	net/youmi/android/dv:a	()I
    //   233: iconst_2
    //   234: aload 13
    //   236: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   239: invokestatic 288	net/youmi/android/er:h	()I
    //   242: iconst_2
    //   243: aload 13
    //   245: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   248: invokestatic 289	net/youmi/android/bq:a	()I
    //   251: iconst_1
    //   252: aload 13
    //   254: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   257: invokestatic 292	net/youmi/android/eh:f	()I
    //   260: iconst_2
    //   261: aload 13
    //   263: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   266: lload 4
    //   268: iconst_4
    //   269: aload 13
    //   271: invokestatic 295	net/youmi/android/al:a	(JILjava/io/ByteArrayOutputStream;)V
    //   274: invokestatic 296	net/youmi/android/bq:h	()I
    //   277: iconst_2
    //   278: aload 13
    //   280: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   283: invokestatic 298	net/youmi/android/bq:e	()I
    //   286: iconst_2
    //   287: aload 13
    //   289: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   292: aload_0
    //   293: invokestatic 300	net/youmi/android/eh:e	(Landroid/content/Context;)Z
    //   296: ifeq +482 -> 778
    //   299: iload_2
    //   300: iconst_1
    //   301: aload 13
    //   303: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   306: invokestatic 302	net/youmi/android/bq:c	()I
    //   309: iconst_1
    //   310: aload 13
    //   312: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   315: aload_0
    //   316: invokestatic 254	net/youmi/android/s:a	(Landroid/content/Context;)Ljava/lang/String;
    //   319: aload 13
    //   321: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   324: aload 13
    //   326: bipush 38
    //   328: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   331: aload_0
    //   332: invokestatic 50	net/youmi/android/eh:a	(Landroid/content/Context;)Lnet/youmi/android/el;
    //   335: astore 19
    //   337: aload 19
    //   339: invokevirtual 304	net/youmi/android/el:c	()Ljava/lang/String;
    //   342: aload 13
    //   344: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   347: aload 13
    //   349: bipush 38
    //   351: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   354: aload 19
    //   356: invokevirtual 305	net/youmi/android/el:b	()Ljava/lang/String;
    //   359: aload 13
    //   361: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   364: aload 13
    //   366: bipush 38
    //   368: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   371: aload 19
    //   373: invokevirtual 54	net/youmi/android/el:a	()Ljava/lang/String;
    //   376: aload 13
    //   378: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   381: aload 13
    //   383: bipush 38
    //   385: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   388: aload_0
    //   389: invokestatic 307	net/youmi/android/eh:d	(Landroid/content/Context;)Ljava/lang/String;
    //   392: aload 13
    //   394: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   397: aload 13
    //   399: bipush 38
    //   401: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   404: invokestatic 308	net/youmi/android/eh:b	()Ljava/lang/String;
    //   407: aload 13
    //   409: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   412: aload 13
    //   414: bipush 38
    //   416: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   419: invokestatic 309	net/youmi/android/eh:d	()Ljava/lang/String;
    //   422: aload 13
    //   424: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   427: aload 13
    //   429: bipush 38
    //   431: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   434: aload 19
    //   436: invokevirtual 310	net/youmi/android/el:e	()Ljava/lang/String;
    //   439: aload 13
    //   441: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   444: aload 13
    //   446: bipush 38
    //   448: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   451: ldc_w 312
    //   454: aload 13
    //   456: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   459: aload 13
    //   461: bipush 38
    //   463: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   466: aload_0
    //   467: invokevirtual 317	android/content/Context:getPackageName	()Ljava/lang/String;
    //   470: aload 13
    //   472: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   475: aload 13
    //   477: bipush 38
    //   479: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   482: aload_0
    //   483: invokevirtual 321	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   486: getfield 327	android/content/pm/ApplicationInfo:name	Ljava/lang/String;
    //   489: aload 13
    //   491: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   494: aload 13
    //   496: bipush 38
    //   498: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   501: aload_0
    //   502: invokestatic 329	net/youmi/android/eh:c	(Landroid/content/Context;)Ljava/lang/String;
    //   505: aload 13
    //   507: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   510: aload 13
    //   512: bipush 38
    //   514: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   517: invokestatic 330	net/youmi/android/eh:c	()Ljava/lang/String;
    //   520: aload 13
    //   522: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   525: aload 13
    //   527: bipush 38
    //   529: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   532: ldc_w 312
    //   535: aload 13
    //   537: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   540: aload 13
    //   542: bipush 38
    //   544: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   547: aload 19
    //   549: invokevirtual 331	net/youmi/android/el:d	()Ljava/lang/String;
    //   552: aload 13
    //   554: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   557: aload 13
    //   559: bipush 38
    //   561: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   564: aload_0
    //   565: invokestatic 333	net/youmi/android/eh:f	(Landroid/content/Context;)Ljava/lang/String;
    //   568: aload 13
    //   570: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   573: aload 13
    //   575: bipush 38
    //   577: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   580: aload 13
    //   582: bipush 38
    //   584: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   587: aload 13
    //   589: bipush 38
    //   591: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   594: aload 13
    //   596: bipush 38
    //   598: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   601: aload 13
    //   603: bipush 38
    //   605: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   608: aload 13
    //   610: bipush 38
    //   612: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   615: aload 13
    //   617: bipush 38
    //   619: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   622: aload 13
    //   624: bipush 38
    //   626: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   629: aload 13
    //   631: bipush 38
    //   633: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   636: new 14	java/lang/StringBuilder
    //   639: dup
    //   640: invokestatic 77	net/youmi/android/bq:d	()Ljava/lang/String;
    //   643: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   646: invokespecial 86	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   649: invokestatic 89	net/youmi/android/er:e	()Ljava/lang/String;
    //   652: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   655: aload 7
    //   657: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   660: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   663: invokestatic 92	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   666: astore 20
    //   668: aload 6
    //   670: aload 13
    //   672: invokevirtual 96	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   675: aload 20
    //   677: invokestatic 99	net/youmi/android/cq:a	([BLjava/lang/String;)Ljava/lang/String;
    //   680: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   683: pop
    //   684: ldc_w 335
    //   687: invokestatic 336	net/youmi/android/n:a	(Ljava/lang/String;)V
    //   690: aload 6
    //   692: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   695: astore 22
    //   697: new 338	net/youmi/android/bl
    //   700: dup
    //   701: invokespecial 339	net/youmi/android/bl:<init>	()V
    //   704: astore 23
    //   706: aload 23
    //   708: aload_0
    //   709: aload 22
    //   711: invokevirtual 342	net/youmi/android/bl:a	(Landroid/content/Context;Ljava/lang/String;)I
    //   714: bipush 6
    //   716: if_icmpne +22 -> 738
    //   719: ldc_w 344
    //   722: invokestatic 336	net/youmi/android/n:a	(Ljava/lang/String;)V
    //   725: aload_0
    //   726: aload 23
    //   728: invokevirtual 345	net/youmi/android/bl:c	()Ljava/lang/String;
    //   731: lload 4
    //   733: aload_1
    //   734: invokestatic 347	net/youmi/android/av:a	(Landroid/content/Context;Ljava/lang/String;JLnet/youmi/android/AdView;)Lnet/youmi/android/cu;
    //   737: areturn
    //   738: ldc 205
    //   740: invokestatic 209	net/youmi/android/f:b	(Ljava/lang/String;)V
    //   743: aload_1
    //   744: invokevirtual 214	net/youmi/android/AdView:i	()V
    //   747: aconst_null
    //   748: areturn
    //   749: astore_3
    //   750: aload_3
    //   751: invokestatic 350	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   754: goto -7 -> 747
    //   757: astore 17
    //   759: goto -570 -> 189
    //   762: astore 21
    //   764: goto -80 -> 684
    //   767: astore 16
    //   769: goto -597 -> 172
    //   772: iconst_0
    //   773: istore 15
    //   775: goto -653 -> 122
    //   778: iconst_0
    //   779: istore_2
    //   780: goto -481 -> 299
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	783	0	paramContext	Context
    //   0	783	1	paramAdView	AdView
    //   1	779	2	i	int
    //   749	2	3	localException1	Exception
    //   23	709	4	l	long
    //   35	656	6	localStringBuilder	StringBuilder
    //   41	615	7	str1	String
    //   96	575	13	localByteArrayOutputStream	ByteArrayOutputStream
    //   112	3	14	bool1	boolean
    //   120	654	15	j	int
    //   767	1	16	localException2	Exception
    //   757	1	17	localException3	Exception
    //   194	3	18	k	int
    //   335	213	19	localel	el
    //   666	10	20	str2	String
    //   762	1	21	localException4	Exception
    //   695	15	22	str3	String
    //   704	23	23	localbl	bl
    //   176	3	25	localLocation	Location
    //   126	25	26	str4	String
    //   158	3	27	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	8	749	java/lang/Exception
    //   10	114	749	java/lang/Exception
    //   196	299	749	java/lang/Exception
    //   299	668	749	java/lang/Exception
    //   684	738	749	java/lang/Exception
    //   738	747	749	java/lang/Exception
    //   172	178	757	java/lang/Exception
    //   668	684	762	java/lang/Exception
    //   122	160	767	java/lang/Exception
  }
  
  /* Error */
  static dm a(Context paramContext)
  {
    // Byte code:
    //   0: invokestatic 223	net/youmi/android/er:d	()Z
    //   3: ifne +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: new 14	java/lang/StringBuilder
    //   11: dup
    //   12: sipush 512
    //   15: invokespecial 17	java/lang/StringBuilder:<init>	(I)V
    //   18: astore_2
    //   19: iconst_4
    //   20: invokestatic 22	net/youmi/android/cq:a	(I)Ljava/lang/String;
    //   23: astore_3
    //   24: aload_2
    //   25: invokestatic 352	net/youmi/android/w:e	()Ljava/lang/String;
    //   28: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: aload_2
    //   33: ldc 34
    //   35: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload_2
    //   40: invokestatic 39	net/youmi/android/bq:b	()Ljava/lang/String;
    //   43: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_2
    //   48: invokestatic 42	net/youmi/android/er:b	()Ljava/lang/String;
    //   51: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload_2
    //   56: aload_3
    //   57: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: new 44	java/io/ByteArrayOutputStream
    //   64: dup
    //   65: sipush 512
    //   68: invokespecial 45	java/io/ByteArrayOutputStream:<init>	(I)V
    //   71: astore 9
    //   73: aload_0
    //   74: invokestatic 50	net/youmi/android/eh:a	(Landroid/content/Context;)Lnet/youmi/android/el;
    //   77: invokevirtual 54	net/youmi/android/el:a	()Ljava/lang/String;
    //   80: aload 9
    //   82: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   85: aload 9
    //   87: bipush 38
    //   89: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   92: aload 9
    //   94: invokestatic 74	net/youmi/android/av:a	(Ljava/io/ByteArrayOutputStream;)V
    //   97: new 14	java/lang/StringBuilder
    //   100: dup
    //   101: invokestatic 77	net/youmi/android/bq:d	()Ljava/lang/String;
    //   104: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   107: invokespecial 86	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   110: invokestatic 89	net/youmi/android/er:e	()Ljava/lang/String;
    //   113: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: aload_3
    //   117: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: invokestatic 92	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   126: astore 10
    //   128: aload_2
    //   129: aload 9
    //   131: invokevirtual 96	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   134: aload 10
    //   136: invokestatic 99	net/youmi/android/cq:a	([BLjava/lang/String;)Ljava/lang/String;
    //   139: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: pop
    //   143: aload_2
    //   144: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: astore 12
    //   149: new 338	net/youmi/android/bl
    //   152: dup
    //   153: invokespecial 339	net/youmi/android/bl:<init>	()V
    //   156: astore 13
    //   158: aload 13
    //   160: aload_0
    //   161: aload 12
    //   163: invokevirtual 342	net/youmi/android/bl:a	(Landroid/content/Context;Ljava/lang/String;)I
    //   166: bipush 6
    //   168: if_icmpne +231 -> 399
    //   171: aload 13
    //   173: invokevirtual 345	net/youmi/android/bl:c	()Ljava/lang/String;
    //   176: invokestatic 355	net/youmi/android/cy:a	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   179: astore 14
    //   181: aload 14
    //   183: ifnull +216 -> 399
    //   186: aload 14
    //   188: ldc 114
    //   190: sipush -999
    //   193: invokestatic 119	net/youmi/android/cy:a	(Lorg/json/JSONObject;Ljava/lang/String;I)I
    //   196: ifne +203 -> 399
    //   199: aload 14
    //   201: ldc_w 357
    //   204: iconst_0
    //   205: invokestatic 119	net/youmi/android/cy:a	(Lorg/json/JSONObject;Ljava/lang/String;I)I
    //   208: iconst_1
    //   209: if_icmpne +190 -> 399
    //   212: aload 14
    //   214: ldc_w 359
    //   217: iconst_m1
    //   218: invokestatic 119	net/youmi/android/cy:a	(Lorg/json/JSONObject;Ljava/lang/String;I)I
    //   221: istore 15
    //   223: iload 15
    //   225: ifle +174 -> 399
    //   228: aload 14
    //   230: ldc_w 361
    //   233: aconst_null
    //   234: invokestatic 124	net/youmi/android/cy:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   237: astore 16
    //   239: aload 16
    //   241: ifnull +158 -> 399
    //   244: aload 16
    //   246: invokevirtual 166	java/lang/String:trim	()Ljava/lang/String;
    //   249: astore 17
    //   251: aload 17
    //   253: invokevirtual 169	java/lang/String:length	()I
    //   256: ifle +143 -> 399
    //   259: aload 17
    //   261: aload_0
    //   262: invokevirtual 317	android/content/Context:getPackageName	()Ljava/lang/String;
    //   265: invokevirtual 259	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   268: ifeq +131 -> 399
    //   271: iload 15
    //   273: aload_0
    //   274: invokevirtual 365	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   277: aload_0
    //   278: invokevirtual 317	android/content/Context:getPackageName	()Ljava/lang/String;
    //   281: iconst_0
    //   282: invokevirtual 371	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   285: getfield 377	android/content/pm/PackageInfo:versionCode	I
    //   288: if_icmple +111 -> 399
    //   291: aload 14
    //   293: ldc_w 379
    //   296: aconst_null
    //   297: invokestatic 124	net/youmi/android/cy:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   300: astore 18
    //   302: aload 18
    //   304: ifnull +95 -> 399
    //   307: aload 18
    //   309: invokevirtual 166	java/lang/String:trim	()Ljava/lang/String;
    //   312: astore 19
    //   314: aload 19
    //   316: invokevirtual 169	java/lang/String:length	()I
    //   319: ifle +80 -> 399
    //   322: aload 14
    //   324: ldc_w 381
    //   327: aconst_null
    //   328: invokestatic 124	net/youmi/android/cy:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   331: astore 20
    //   333: aload 14
    //   335: ldc_w 383
    //   338: aconst_null
    //   339: invokestatic 124	net/youmi/android/cy:a	(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   342: astore 21
    //   344: new 385	net/youmi/android/dm
    //   347: dup
    //   348: invokespecial 386	net/youmi/android/dm:<init>	()V
    //   351: astore 22
    //   353: aload 22
    //   355: aload 19
    //   357: putfield 388	net/youmi/android/dm:d	Ljava/lang/String;
    //   360: aload 22
    //   362: aload 17
    //   364: putfield 390	net/youmi/android/dm:c	Ljava/lang/String;
    //   367: aload 22
    //   369: iload 15
    //   371: putfield 392	net/youmi/android/dm:a	I
    //   374: aload 22
    //   376: aload 20
    //   378: putfield 394	net/youmi/android/dm:b	Ljava/lang/String;
    //   381: aload 22
    //   383: aload 21
    //   385: putfield 396	net/youmi/android/dm:e	Ljava/lang/String;
    //   388: aload 22
    //   390: areturn
    //   391: astore_1
    //   392: aconst_null
    //   393: areturn
    //   394: astore 11
    //   396: goto -253 -> 143
    //   399: aconst_null
    //   400: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	401	0	paramContext	Context
    //   391	1	1	localException1	Exception
    //   18	126	2	localStringBuilder	StringBuilder
    //   23	94	3	str1	String
    //   71	59	9	localByteArrayOutputStream	ByteArrayOutputStream
    //   126	9	10	str2	String
    //   394	1	11	localException2	Exception
    //   147	15	12	str3	String
    //   156	16	13	localbl	bl
    //   179	155	14	localJSONObject	JSONObject
    //   221	149	15	i	int
    //   237	8	16	str4	String
    //   249	114	17	str5	String
    //   300	8	18	str6	String
    //   312	44	19	str7	String
    //   331	46	20	str8	String
    //   342	42	21	str9	String
    //   351	38	22	localdm	dm
    // Exception table:
    //   from	to	target	type
    //   0	6	391	java/lang/Exception
    //   8	128	391	java/lang/Exception
    //   143	181	391	java/lang/Exception
    //   186	223	391	java/lang/Exception
    //   228	239	391	java/lang/Exception
    //   244	302	391	java/lang/Exception
    //   307	388	391	java/lang/Exception
    //   128	143	394	java/lang/Exception
  }
  
  static void a(Activity paramActivity, AdView paramAdView, cu paramcu)
  {
    if (!er.d()) {}
    for (;;)
    {
      return;
      if ((paramcu != null) && (!paramcu.q()) && (!eh.e(paramActivity)) && (paramcu.l() != null)) {}
      try
      {
        du localdu = ao.a;
        if ((!localdu.b()) || (!paramcu.l().equals("00000000")))
        {
          StringBuilder localStringBuilder1 = j.a(paramcu.l(), 32);
          if (localStringBuilder1 == null) {
            break label1346;
          }
          long l = System.currentTimeMillis() / 1000L;
          localStringBuffer = new StringBuffer(512);
          str1 = cq.a(4);
          localStringBuffer.append(w.d());
          localStringBuffer.append("00000");
          localStringBuffer.append(bq.b());
          localStringBuffer.append(er.b());
          localStringBuffer.append(str1);
          localByteArrayOutputStream = new ByteArrayOutputStream(512);
          if (localStringBuilder1.charAt(31) == '1') {
            al.a(er.a(paramActivity), 2, localByteArrayOutputStream);
          }
          if (localStringBuilder1.charAt(30) == '1') {
            al.a(er.h(), 1, localByteArrayOutputStream);
          }
          if (!localdu.b())
          {
            if (localStringBuilder1.charAt(29) == '0') {
              localStringBuilder1 = localStringBuilder1.replace(29, 30, "1");
            }
            if (localStringBuilder1.charAt(28) == '0') {
              localStringBuilder1 = localStringBuilder1.replace(28, 29, "1");
            }
            localdu.a();
          }
          localStringBuilder2 = localStringBuilder1;
          int i = localdu.a;
          int j = localdu.b;
          if (localStringBuilder2.charAt(29) == '1') {
            al.a(i, 4, localByteArrayOutputStream);
          }
          if (localStringBuilder2.charAt(28) == '1') {
            al.a(j - i, 2, localByteArrayOutputStream);
          }
          if (localStringBuilder2.charAt(27) == '1') {
            al.a(l, 4, localByteArrayOutputStream);
          }
          if (localStringBuilder2.charAt(26) == '1') {
            al.a(paramAdView.b().h(), 2, localByteArrayOutputStream);
          }
          if (localStringBuilder2.charAt(25) == '1') {
            al.a(bq.e(), 2, localByteArrayOutputStream);
          }
          if (localStringBuilder2.charAt(24) == '1') {
            al.a(paramAdView.b().g(), 2, localByteArrayOutputStream);
          }
          if (localStringBuilder2.charAt(23) == '1') {
            al.a(bq.c(), 1, localByteArrayOutputStream);
          }
          int k = localStringBuilder2.charAt(22);
          m = 0;
          if (k == 49)
          {
            al.a(s.a(paramActivity), localByteArrayOutputStream);
            m = 1;
          }
          localel = eh.a(paramActivity);
          if (localStringBuilder2.charAt(21) != '1') {
            break label508;
          }
          if (m == 0) {
            break label1351;
          }
          localByteArrayOutputStream.write(38);
        }
      }
      catch (Exception localException1)
      {
        try
        {
          StringBuffer localStringBuffer;
          String str1;
          ByteArrayOutputStream localByteArrayOutputStream;
          StringBuilder localStringBuilder2;
          int m;
          el localel;
          label508:
          Location localLocation;
          label532:
          label566:
          label599:
          label631:
          label1149:
          String str2;
          label663:
          label703:
          label755:
          localStringBuffer.append(cq.a(localByteArrayOutputStream.toByteArray(), str2));
          label807:
          label839:
          label863:
          label993:
          localStringBuffer.append(',');
          label897:
          label929:
          label961:
          label1118:
          localStringBuffer.append(j.a(localStringBuilder2, 8).toUpperCase());
          label1025:
          label1056:
          label1087:
          String str3 = localStringBuffer.toString();
          label1180:
          bl localbl = new bl();
          if (localbl.a(paramActivity, str3) != 6) {
            break label1346;
          }
          JSONObject localJSONObject = cy.a(localbl.c());
          if (localJSONObject == null) {
            break label1346;
          }
          cy.a(localJSONObject, "c", -999);
          for (;;)
          {
            paramcu.r();
            return;
            m = 1;
            break;
            m = 1;
            break label532;
            m = 1;
            break label566;
            m = 1;
            break label599;
            m = 1;
            break label631;
            m = 1;
            break label663;
            m = 1;
            break label703;
            m = 1;
            break label755;
            m = 1;
            break label807;
            m = 1;
            break label839;
            m = 1;
            break label863;
            m = 1;
            break label897;
            m = 1;
            break label929;
            m = 1;
            break label961;
            m = 1;
            break label993;
            m = 1;
            break label1025;
            m = 1;
            break label1056;
            m = 1;
            break label1087;
            m = 1;
            break label1118;
            m = 1;
            break label1149;
            m = 1;
            break label1180;
            localException1 = localException1;
          }
        }
        catch (Exception localException2)
        {
          break label1267;
        }
      }
    }
    al.a(localel.c(), localByteArrayOutputStream);
    if (localStringBuilder2.charAt(20) == '1')
    {
      if (m != 0)
      {
        localByteArrayOutputStream.write(38);
        al.a(localel.a(), localByteArrayOutputStream);
      }
    }
    else
    {
      if (localStringBuilder2.charAt(19) == '1')
      {
        if (m == 0) {
          break label1363;
        }
        localByteArrayOutputStream.write(38);
        al.a(eh.d(paramActivity), localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(18) == '1')
      {
        if (m == 0) {
          break label1369;
        }
        localByteArrayOutputStream.write(38);
        al.a(eh.b(), localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(17) == '1')
      {
        if (m == 0) {
          break label1375;
        }
        localByteArrayOutputStream.write(38);
        al.a(eh.d(), localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(16) == '1')
      {
        if (m == 0) {
          break label1381;
        }
        localByteArrayOutputStream.write(38);
        al.a(localel.e(), localByteArrayOutputStream);
      }
      localLocation = ei.a(paramActivity);
      if (localStringBuilder2.charAt(15) == '1')
      {
        if (m == 0) {
          break label1387;
        }
        localByteArrayOutputStream.write(38);
        if (localLocation != null) {
          al.a(localLocation.getLatitude(), localByteArrayOutputStream);
        }
      }
      if (localStringBuilder2.charAt(14) == '1')
      {
        if (m == 0) {
          break label1393;
        }
        localByteArrayOutputStream.write(38);
        if (localLocation != null) {
          al.a(localLocation.getLongitude(), localByteArrayOutputStream);
        }
      }
      if (localStringBuilder2.charAt(13) == '1')
      {
        if (m == 0) {
          break label1399;
        }
        localByteArrayOutputStream.write(38);
        al.a(eh.c(), localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(12) == '1')
      {
        if (m == 0) {
          break label1405;
        }
        localByteArrayOutputStream.write(38);
      }
      if (localStringBuilder2.charAt(11) == '1')
      {
        if (m == 0) {
          break label1411;
        }
        localByteArrayOutputStream.write(38);
        al.a(localel.d(), localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(10) == '1')
      {
        if (m == 0) {
          break label1417;
        }
        localByteArrayOutputStream.write(38);
        al.a("21", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(9) == '1')
      {
        if (m == 0) {
          break label1423;
        }
        localByteArrayOutputStream.write(38);
        al.a("22", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(8) == '1')
      {
        if (m == 0) {
          break label1429;
        }
        localByteArrayOutputStream.write(38);
        al.a("23", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(7) == '1')
      {
        if (m == 0) {
          break label1435;
        }
        localByteArrayOutputStream.write(38);
        al.a("24", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(6) == '1')
      {
        if (m == 0) {
          break label1441;
        }
        localByteArrayOutputStream.write(38);
        al.a("25", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(5) == '1')
      {
        if (m == 0) {
          break label1447;
        }
        localByteArrayOutputStream.write(38);
        al.a("26", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(4) == '1')
      {
        if (m == 0) {
          break label1453;
        }
        localByteArrayOutputStream.write(38);
        al.a("27", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(3) == '1')
      {
        if (m == 0) {
          break label1459;
        }
        localByteArrayOutputStream.write(38);
        al.a("28", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(2) == '1')
      {
        if (m == 0) {
          break label1465;
        }
        localByteArrayOutputStream.write(38);
        al.a("29", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(1) == '1')
      {
        if (m == 0) {
          break label1471;
        }
        localByteArrayOutputStream.write(38);
        al.a("30", localByteArrayOutputStream);
      }
      if (localStringBuilder2.charAt(0) == '1')
      {
        if (m != 0) {
          localByteArrayOutputStream.write(38);
        }
        al.a("31", localByteArrayOutputStream);
      }
      str2 = cq.b(bq.d() + er.e() + str1);
    }
  }
  
  static void a(Activity paramActivity, cu paramcu)
  {
    try
    {
      if (!er.d()) {
        return;
      }
      StringBuilder localStringBuilder;
      ByteArrayOutputStream localByteArrayOutputStream;
      String str1;
      if ((paramcu != null) && (!paramcu.t()))
      {
        long l = paramcu.B();
        localStringBuilder = new StringBuilder(512);
        localStringBuilder.append(w.b());
        localStringBuilder.append("00000");
        localStringBuilder.append(bq.b());
        localStringBuilder.append(er.b());
        localStringBuilder.append(paramcu.o());
        localByteArrayOutputStream = new ByteArrayOutputStream(512);
        al.a(bq.a(), 1, localByteArrayOutputStream);
        al.a(l, 4, localByteArrayOutputStream);
        al.a(bq.c(), 1, localByteArrayOutputStream);
        a(localByteArrayOutputStream);
        str1 = cq.b(bq.d() + er.e() + paramcu.o());
      }
      label172:
      String str2;
      return;
    }
    catch (Exception localException1)
    {
      try
      {
        localStringBuilder.append(cq.a(localByteArrayOutputStream.toByteArray(), str1));
        localStringBuilder.append(',');
        localStringBuilder.append(paramcu.k());
        str2 = localStringBuilder.toString();
        new bl().a(paramActivity, str2);
        for (;;)
        {
          paramcu.w();
          return;
          localException1 = localException1;
        }
      }
      catch (Exception localException2)
      {
        break label172;
      }
    }
  }
  
  /* Error */
  static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 300	net/youmi/android/eh:e	(Landroid/content/Context;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: new 14	java/lang/StringBuilder
    //   11: dup
    //   12: sipush 512
    //   15: invokespecial 17	java/lang/StringBuilder:<init>	(I)V
    //   18: astore 15
    //   20: iconst_4
    //   21: invokestatic 22	net/youmi/android/cq:a	(I)Ljava/lang/String;
    //   24: astore 16
    //   26: aload 15
    //   28: ldc 34
    //   30: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   33: pop
    //   34: aload 15
    //   36: invokestatic 39	net/youmi/android/bq:b	()Ljava/lang/String;
    //   39: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   42: pop
    //   43: aload 15
    //   45: invokestatic 42	net/youmi/android/er:b	()Ljava/lang/String;
    //   48: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload 15
    //   54: aload 16
    //   56: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: pop
    //   60: new 44	java/io/ByteArrayOutputStream
    //   63: dup
    //   64: sipush 512
    //   67: invokespecial 45	java/io/ByteArrayOutputStream:<init>	(I)V
    //   70: astore 21
    //   72: iload_1
    //   73: iconst_1
    //   74: aload 21
    //   76: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   79: iload_2
    //   80: iconst_1
    //   81: aload 21
    //   83: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   86: iload_3
    //   87: iconst_4
    //   88: aload 21
    //   90: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   93: iload 4
    //   95: iconst_4
    //   96: aload 21
    //   98: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   101: iload 5
    //   103: iconst_4
    //   104: aload 21
    //   106: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   109: aload_0
    //   110: invokestatic 50	net/youmi/android/eh:a	(Landroid/content/Context;)Lnet/youmi/android/el;
    //   113: invokevirtual 54	net/youmi/android/el:a	()Ljava/lang/String;
    //   116: aload 21
    //   118: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   121: aload 21
    //   123: bipush 38
    //   125: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   128: aload 6
    //   130: ifnull +278 -> 408
    //   133: aload 6
    //   135: aload 21
    //   137: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   140: aload 21
    //   142: bipush 38
    //   144: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   147: aload 7
    //   149: ifnull +280 -> 429
    //   152: aload 7
    //   154: aload 21
    //   156: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   159: aload 21
    //   161: bipush 38
    //   163: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   166: aload 8
    //   168: ifnull +269 -> 437
    //   171: aload 8
    //   173: aload 21
    //   175: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   178: aload 21
    //   180: bipush 38
    //   182: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   185: aload 9
    //   187: ifnull +258 -> 445
    //   190: aload 9
    //   192: aload 21
    //   194: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   197: aload 21
    //   199: bipush 38
    //   201: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   204: aload 10
    //   206: ifnull +247 -> 453
    //   209: aload 10
    //   211: aload 21
    //   213: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   216: aload 21
    //   218: bipush 38
    //   220: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   223: aload 11
    //   225: ifnull +236 -> 461
    //   228: aload 11
    //   230: invokestatic 513	net/youmi/android/cq:a	(Ljava/lang/String;)Ljava/lang/String;
    //   233: astore 22
    //   235: aload 22
    //   237: aload 21
    //   239: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   242: aload 21
    //   244: bipush 38
    //   246: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   249: aload 11
    //   251: ifnull +218 -> 469
    //   254: aload 12
    //   256: invokestatic 513	net/youmi/android/cq:a	(Ljava/lang/String;)Ljava/lang/String;
    //   259: astore 23
    //   261: aload 23
    //   263: aload 21
    //   265: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   268: aload 21
    //   270: bipush 38
    //   272: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   275: aload 13
    //   277: ifnull +139 -> 416
    //   280: aload 13
    //   282: aload 21
    //   284: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   287: aload 21
    //   289: bipush 38
    //   291: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   294: aload 21
    //   296: invokestatic 74	net/youmi/android/av:a	(Ljava/io/ByteArrayOutputStream;)V
    //   299: new 14	java/lang/StringBuilder
    //   302: dup
    //   303: invokestatic 77	net/youmi/android/bq:d	()Ljava/lang/String;
    //   306: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   309: invokespecial 86	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   312: invokestatic 89	net/youmi/android/er:e	()Ljava/lang/String;
    //   315: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: aload 16
    //   320: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   323: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   326: invokestatic 92	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   329: astore 24
    //   331: aload 15
    //   333: aload 21
    //   335: invokevirtual 96	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   338: aload 24
    //   340: invokestatic 99	net/youmi/android/cq:a	([BLjava/lang/String;)Ljava/lang/String;
    //   343: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: invokestatic 515	net/youmi/android/w:f	()Ljava/lang/String;
    //   350: astore 26
    //   352: new 64	java/util/ArrayList
    //   355: dup
    //   356: iconst_2
    //   357: invokespecial 196	java/util/ArrayList:<init>	(I)V
    //   360: astore 27
    //   362: aload 27
    //   364: new 517	org/apache/http/message/BasicNameValuePair
    //   367: dup
    //   368: ldc_w 519
    //   371: aload 15
    //   373: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   376: invokespecial 522	org/apache/http/message/BasicNameValuePair:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   379: invokevirtual 203	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   382: pop
    //   383: new 524	net/youmi/android/aq
    //   386: dup
    //   387: aload_0
    //   388: aload 26
    //   390: invokespecial 527	net/youmi/android/aq:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   393: aload 27
    //   395: invokevirtual 530	net/youmi/android/aq:a	(Ljava/util/List;)I
    //   398: pop
    //   399: return
    //   400: astore 14
    //   402: aload 14
    //   404: invokestatic 350	net/youmi/android/f:a	(Ljava/lang/Throwable;)V
    //   407: return
    //   408: ldc_w 312
    //   411: astore 6
    //   413: goto -280 -> 133
    //   416: ldc_w 312
    //   419: astore 13
    //   421: goto -141 -> 280
    //   424: astore 25
    //   426: goto -79 -> 347
    //   429: ldc_w 312
    //   432: astore 7
    //   434: goto -282 -> 152
    //   437: ldc_w 312
    //   440: astore 8
    //   442: goto -271 -> 171
    //   445: ldc_w 312
    //   448: astore 9
    //   450: goto -260 -> 190
    //   453: ldc_w 312
    //   456: astore 10
    //   458: goto -249 -> 209
    //   461: ldc_w 312
    //   464: astore 22
    //   466: goto -231 -> 235
    //   469: ldc_w 312
    //   472: astore 23
    //   474: goto -213 -> 261
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	477	0	paramContext	Context
    //   0	477	1	paramInt1	int
    //   0	477	2	paramInt2	int
    //   0	477	3	paramInt3	int
    //   0	477	4	paramInt4	int
    //   0	477	5	paramInt5	int
    //   0	477	6	paramString1	String
    //   0	477	7	paramString2	String
    //   0	477	8	paramString3	String
    //   0	477	9	paramString4	String
    //   0	477	10	paramString5	String
    //   0	477	11	paramString6	String
    //   0	477	12	paramString7	String
    //   0	477	13	paramString8	String
    //   400	3	14	localException1	Exception
    //   18	354	15	localStringBuilder	StringBuilder
    //   24	295	16	str1	String
    //   70	264	21	localByteArrayOutputStream	ByteArrayOutputStream
    //   233	232	22	str2	String
    //   259	214	23	str3	String
    //   329	10	24	str4	String
    //   424	1	25	localException2	Exception
    //   350	39	26	str5	String
    //   360	34	27	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   0	7	400	java/lang/Exception
    //   8	128	400	java/lang/Exception
    //   133	147	400	java/lang/Exception
    //   152	166	400	java/lang/Exception
    //   171	185	400	java/lang/Exception
    //   190	204	400	java/lang/Exception
    //   209	223	400	java/lang/Exception
    //   228	235	400	java/lang/Exception
    //   235	249	400	java/lang/Exception
    //   254	261	400	java/lang/Exception
    //   261	275	400	java/lang/Exception
    //   280	331	400	java/lang/Exception
    //   347	399	400	java/lang/Exception
    //   331	347	424	java/lang/Exception
  }
  
  /* Error */
  static void a(Context paramContext, long paramLong1, String paramString1, String paramString2, long paramLong2, long paramLong3, long paramLong4)
  {
    // Byte code:
    //   0: invokestatic 223	net/youmi/android/er:d	()Z
    //   3: ifne +4 -> 7
    //   6: return
    //   7: new 14	java/lang/StringBuilder
    //   10: dup
    //   11: sipush 512
    //   14: invokespecial 17	java/lang/StringBuilder:<init>	(I)V
    //   17: astore 12
    //   19: aload 12
    //   21: invokestatic 532	net/youmi/android/w:c	()Ljava/lang/String;
    //   24: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: pop
    //   28: aload 12
    //   30: ldc 34
    //   32: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   35: pop
    //   36: aload 12
    //   38: invokestatic 39	net/youmi/android/bq:b	()Ljava/lang/String;
    //   41: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload 12
    //   47: invokestatic 42	net/youmi/android/er:b	()Ljava/lang/String;
    //   50: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: pop
    //   54: aload 12
    //   56: aload_3
    //   57: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: new 44	java/io/ByteArrayOutputStream
    //   64: dup
    //   65: sipush 512
    //   68: invokespecial 45	java/io/ByteArrayOutputStream:<init>	(I)V
    //   71: astore 18
    //   73: lload 5
    //   75: iconst_4
    //   76: aload 18
    //   78: invokestatic 295	net/youmi/android/al:a	(JILjava/io/ByteArrayOutputStream;)V
    //   81: lload 7
    //   83: iconst_4
    //   84: aload 18
    //   86: invokestatic 295	net/youmi/android/al:a	(JILjava/io/ByteArrayOutputStream;)V
    //   89: lload 9
    //   91: iconst_4
    //   92: aload 18
    //   94: invokestatic 295	net/youmi/android/al:a	(JILjava/io/ByteArrayOutputStream;)V
    //   97: invokestatic 289	net/youmi/android/bq:a	()I
    //   100: iconst_1
    //   101: aload 18
    //   103: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   106: lload_1
    //   107: iconst_4
    //   108: aload 18
    //   110: invokestatic 295	net/youmi/android/al:a	(JILjava/io/ByteArrayOutputStream;)V
    //   113: invokestatic 302	net/youmi/android/bq:c	()I
    //   116: iconst_1
    //   117: aload 18
    //   119: invokestatic 244	net/youmi/android/al:a	(IILjava/io/ByteArrayOutputStream;)V
    //   122: aload 18
    //   124: invokestatic 74	net/youmi/android/av:a	(Ljava/io/ByteArrayOutputStream;)V
    //   127: new 14	java/lang/StringBuilder
    //   130: dup
    //   131: invokestatic 77	net/youmi/android/bq:d	()Ljava/lang/String;
    //   134: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   137: invokespecial 86	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   140: invokestatic 89	net/youmi/android/er:e	()Ljava/lang/String;
    //   143: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: aload_3
    //   147: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   153: invokestatic 92	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   156: astore 19
    //   158: aload 12
    //   160: aload 18
    //   162: invokevirtual 96	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   165: aload 19
    //   167: invokestatic 99	net/youmi/android/cq:a	([BLjava/lang/String;)Ljava/lang/String;
    //   170: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: pop
    //   174: aload 12
    //   176: bipush 44
    //   178: invokevirtual 504	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   181: pop
    //   182: aload 12
    //   184: aload 4
    //   186: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload 12
    //   192: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: astore 23
    //   197: new 338	net/youmi/android/bl
    //   200: dup
    //   201: invokespecial 339	net/youmi/android/bl:<init>	()V
    //   204: aload_0
    //   205: aload 23
    //   207: invokevirtual 342	net/youmi/android/bl:a	(Landroid/content/Context;Ljava/lang/String;)I
    //   210: pop
    //   211: return
    //   212: astore 11
    //   214: return
    //   215: astore 20
    //   217: goto -43 -> 174
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	paramContext	Context
    //   0	220	1	paramLong1	long
    //   0	220	3	paramString1	String
    //   0	220	4	paramString2	String
    //   0	220	5	paramLong2	long
    //   0	220	7	paramLong3	long
    //   0	220	9	paramLong4	long
    //   212	1	11	localException1	Exception
    //   17	174	12	localStringBuilder	StringBuilder
    //   71	90	18	localByteArrayOutputStream	ByteArrayOutputStream
    //   156	10	19	str1	String
    //   215	1	20	localException2	Exception
    //   195	11	23	str2	String
    // Exception table:
    //   from	to	target	type
    //   0	6	212	java/lang/Exception
    //   7	158	212	java/lang/Exception
    //   174	211	212	java/lang/Exception
    //   158	174	215	java/lang/Exception
  }
  
  static void a(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    paramByteArrayOutputStream.write(38);
    paramByteArrayOutputStream.write(38);
    paramByteArrayOutputStream.write(38);
    paramByteArrayOutputStream.write(38);
    paramByteArrayOutputStream.write(38);
    paramByteArrayOutputStream.write(38);
    paramByteArrayOutputStream.write(38);
    paramByteArrayOutputStream.write(38);
    paramByteArrayOutputStream.write(38);
  }
  
  static boolean b(Context paramContext)
  {
    for (;;)
    {
      int i;
      try
      {
        if (!er.d()) {
          return false;
        }
        String str1 = c(paramContext);
        if (str1 != null)
        {
          bl localbl1 = new bl();
          if (localbl1.a(paramContext, str1) == 6)
          {
            JSONObject localJSONObject1 = cy.a(localbl1.c());
            if ((localJSONObject1 != null) && (cy.a(localJSONObject1, "c", -999) == 0))
            {
              ArrayList localArrayList = new ArrayList(10);
              JSONArray localJSONArray = cy.a(localJSONObject1, "d", null);
              if ((localJSONArray != null) && (localJSONArray.length() > 0))
              {
                i = 0;
                if (i < localJSONArray.length()) {}
              }
              else
              {
                bl localbl2 = new bl();
                String str2 = a(paramContext, localArrayList);
                if (str2 == null) {
                  break label280;
                }
                localbl2.a(paramContext, str2);
                if (localbl2.g() != 6) {
                  break label282;
                }
                break label282;
              }
              JSONObject localJSONObject2 = cy.a(localJSONArray, i, null);
              if (localJSONObject2 == null) {
                break label284;
              }
              int j = cy.a(localJSONObject2, "id", -1);
              if (j <= 0) {
                break label284;
              }
              String str3 = cy.a(localJSONObject2, "v", null);
              String str4 = cy.a(localJSONObject2, "s", null);
              if (str3 == null) {
                break label284;
              }
              String str5 = str3.trim();
              if ((str5.length() <= 0) || (str4 == null) || (str4.length() <= 0) || (!de.a(str5, str4)) || (localArrayList.contains(Integer.valueOf(j)))) {
                break label284;
              }
              localArrayList.add(Integer.valueOf(j));
            }
          }
        }
      }
      catch (Exception localException) {}
      label280:
      return false;
      label282:
      return true;
      label284:
      i++;
    }
  }
  
  /* Error */
  private static String c(Context paramContext)
  {
    // Byte code:
    //   0: new 14	java/lang/StringBuilder
    //   3: dup
    //   4: sipush 512
    //   7: invokespecial 17	java/lang/StringBuilder:<init>	(I)V
    //   10: astore_1
    //   11: iconst_4
    //   12: invokestatic 22	net/youmi/android/cq:a	(I)Ljava/lang/String;
    //   15: astore_3
    //   16: aload_1
    //   17: invokestatic 554	net/youmi/android/w:g	()Ljava/lang/String;
    //   20: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload_1
    //   25: ldc 34
    //   27: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload_1
    //   32: invokestatic 39	net/youmi/android/bq:b	()Ljava/lang/String;
    //   35: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: pop
    //   39: aload_1
    //   40: invokestatic 42	net/youmi/android/er:b	()Ljava/lang/String;
    //   43: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_1
    //   48: aload_3
    //   49: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: new 44	java/io/ByteArrayOutputStream
    //   56: dup
    //   57: sipush 512
    //   60: invokespecial 45	java/io/ByteArrayOutputStream:<init>	(I)V
    //   63: astore 9
    //   65: aload_0
    //   66: invokestatic 50	net/youmi/android/eh:a	(Landroid/content/Context;)Lnet/youmi/android/el;
    //   69: invokevirtual 54	net/youmi/android/el:a	()Ljava/lang/String;
    //   72: aload 9
    //   74: invokestatic 59	net/youmi/android/al:a	(Ljava/lang/String;Ljava/io/ByteArrayOutputStream;)V
    //   77: aload 9
    //   79: bipush 38
    //   81: invokevirtual 62	java/io/ByteArrayOutputStream:write	(I)V
    //   84: aload 9
    //   86: invokestatic 74	net/youmi/android/av:a	(Ljava/io/ByteArrayOutputStream;)V
    //   89: new 14	java/lang/StringBuilder
    //   92: dup
    //   93: invokestatic 77	net/youmi/android/bq:d	()Ljava/lang/String;
    //   96: invokestatic 83	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   99: invokespecial 86	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   102: invokestatic 89	net/youmi/android/er:e	()Ljava/lang/String;
    //   105: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: aload_3
    //   109: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   112: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: invokestatic 92	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   118: astore 10
    //   120: aload_1
    //   121: aload 9
    //   123: invokevirtual 96	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   126: aload 10
    //   128: invokestatic 99	net/youmi/android/cq:a	([BLjava/lang/String;)Ljava/lang/String;
    //   131: invokevirtual 32	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload_1
    //   136: invokevirtual 71	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: astore 12
    //   141: aload 12
    //   143: areturn
    //   144: astore_2
    //   145: aconst_null
    //   146: areturn
    //   147: astore 11
    //   149: goto -14 -> 135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	152	0	paramContext	Context
    //   10	126	1	localStringBuilder	StringBuilder
    //   144	1	2	localException1	Exception
    //   15	94	3	str1	String
    //   63	59	9	localByteArrayOutputStream	ByteArrayOutputStream
    //   118	9	10	str2	String
    //   147	1	11	localException2	Exception
    //   139	3	12	str3	String
    // Exception table:
    //   from	to	target	type
    //   0	120	144	java/lang/Exception
    //   135	141	144	java/lang/Exception
    //   120	135	147	java/lang/Exception
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.av
 * JD-Core Version:    0.7.0.1
 */