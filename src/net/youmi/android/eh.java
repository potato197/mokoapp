package net.youmi.android;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import java.lang.reflect.Method;
import java.util.Locale;

class eh
{
  private static int a = -1;
  private static int b = -1;
  private static int c = -1;
  private static int d = -1;
  private static int e = -1;
  private static String f;
  private static String g;
  private static int h = -1;
  private static String i;
  private static String j;
  private static String k = "";
  private static el l = null;
  private static int m = 0;
  private static long n = 0L;
  private static long o = 0L;
  private static boolean p = false;
  
  static String a()
  {
    if (g == null)
    {
      Locale localLocale = Locale.getDefault();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localLocale.getLanguage();
      arrayOfObject[1] = localLocale.getCountry();
      g = String.format("%s-%s", arrayOfObject);
    }
    return g;
  }
  
  static el a(Context paramContext)
  {
    if (l == null) {
      l = new el(paramContext);
    }
    return l;
  }
  
  static boolean a(int paramInt)
  {
    return h >= paramInt;
  }
  
  static boolean a(long paramLong)
  {
    long l1 = g();
    if (paramLong - o > l1)
    {
      if (p)
      {
        if (paramLong - n > 35000L) {
          p = false;
        }
      }
      else {
        return true;
      }
      return false;
    }
    return false;
  }
  
  static String b()
  {
    return Build.MODEL;
  }
  
  static void b(int paramInt)
  {
    h = paramInt;
    m = 0;
  }
  
  /* Error */
  static void b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 104
    //   3: invokevirtual 110	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   6: checkcast 112	android/telephony/TelephonyManager
    //   9: astore_2
    //   10: aload_2
    //   11: ifnull +35 -> 46
    //   14: aload_2
    //   15: invokevirtual 115	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   18: astore 8
    //   20: aload 8
    //   22: ifnonnull +25 -> 47
    //   25: ldc 41
    //   27: putstatic 117	net/youmi/android/eh:i	Ljava/lang/String;
    //   30: aload_2
    //   31: invokevirtual 120	android/telephony/TelephonyManager:getLine1Number	()Ljava/lang/String;
    //   34: astore 5
    //   36: aload 5
    //   38: ifnonnull +21 -> 59
    //   41: ldc 41
    //   43: putstatic 122	net/youmi/android/eh:j	Ljava/lang/String;
    //   46: return
    //   47: aload 8
    //   49: putstatic 117	net/youmi/android/eh:i	Ljava/lang/String;
    //   52: goto -22 -> 30
    //   55: astore_3
    //   56: goto -26 -> 30
    //   59: aload 5
    //   61: invokevirtual 125	java/lang/String:trim	()Ljava/lang/String;
    //   64: astore 6
    //   66: aload 6
    //   68: invokevirtual 129	java/lang/String:length	()I
    //   71: bipush 11
    //   73: if_icmple +29 -> 102
    //   76: bipush 245
    //   78: aload 6
    //   80: invokevirtual 129	java/lang/String:length	()I
    //   83: iadd
    //   84: istore 7
    //   86: aload 6
    //   88: iload 7
    //   90: iload 7
    //   92: bipush 7
    //   94: iadd
    //   95: invokevirtual 133	java/lang/String:substring	(II)Ljava/lang/String;
    //   98: putstatic 122	net/youmi/android/eh:j	Ljava/lang/String;
    //   101: return
    //   102: aload 6
    //   104: invokevirtual 129	java/lang/String:length	()I
    //   107: bipush 11
    //   109: if_icmpne +15 -> 124
    //   112: aload 6
    //   114: iconst_0
    //   115: bipush 7
    //   117: invokevirtual 133	java/lang/String:substring	(II)Ljava/lang/String;
    //   120: putstatic 122	net/youmi/android/eh:j	Ljava/lang/String;
    //   123: return
    //   124: ldc 41
    //   126: putstatic 122	net/youmi/android/eh:j	Ljava/lang/String;
    //   129: return
    //   130: astore_1
    //   131: return
    //   132: astore 4
    //   134: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	135	0	paramContext	Context
    //   130	1	1	localException1	Exception
    //   9	22	2	localTelephonyManager	TelephonyManager
    //   55	1	3	localException2	Exception
    //   132	1	4	localException3	Exception
    //   34	26	5	str1	String
    //   64	49	6	str2	String
    //   84	11	7	i1	int
    //   18	30	8	str3	String
    // Exception table:
    //   from	to	target	type
    //   14	20	55	java/lang/Exception
    //   25	30	55	java/lang/Exception
    //   47	52	55	java/lang/Exception
    //   0	10	130	java/lang/Exception
    //   30	36	132	java/lang/Exception
    //   41	46	132	java/lang/Exception
    //   59	101	132	java/lang/Exception
    //   102	123	132	java/lang/Exception
    //   124	129	132	java/lang/Exception
  }
  
  static String c()
  {
    return "android " + Build.VERSION.RELEASE;
  }
  
  static String c(Context paramContext)
  {
    if (j == null) {
      b(paramContext);
    }
    if (j == null) {
      return "";
    }
    return j;
  }
  
  static String d()
  {
    return Build.BRAND;
  }
  
  static String d(Context paramContext)
  {
    if (i == null) {
      b(paramContext);
    }
    if (i == null) {
      return "";
    }
    return i;
  }
  
  static void e()
  {
    m = 1 + m;
  }
  
  static boolean e(Context paramContext)
  {
    if (er.a()) {}
    while (a(paramContext).f()) {
      return true;
    }
    return false;
  }
  
  static int f()
  {
    return m;
  }
  
  static String f(Context paramContext)
  {
    for (;;)
    {
      CellLocation localCellLocation;
      try
      {
        if ((f != null) && (f.length() > 0))
        {
          str1 = f;
          return str1;
        }
        try
        {
          localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
          if (localTelephonyManager != null)
          {
            str2 = "";
            localObject2 = "";
          }
        }
        catch (Exception localException1)
        {
          TelephonyManager localTelephonyManager;
          String str8;
          String str9;
          int i3;
          int i1;
          GsmCellLocation localGsmCellLocation;
          Method[] arrayOfMethod;
          f.a(localException1);
          str1 = "";
        }
      }
      finally {}
      try
      {
        str8 = localTelephonyManager.getNetworkOperator().trim();
        if (str8.length() <= 3) {
          break label739;
        }
        str2 = str8.substring(0, 3);
        str9 = str8.substring(3);
        localObject2 = str9;
        str3 = str2;
      }
      catch (Exception localException2)
      {
        str3 = str2;
        continue;
        Object localObject3 = localObject2;
        str4 = str3;
        localObject4 = localObject3;
        continue;
        i2++;
        continue;
      }
      if (str3.length() != 0)
      {
        i3 = ((String)localObject2).length();
        if (i3 != 0) {
          break;
        }
      }
      try
      {
        String str5 = localTelephonyManager.getSubscriberId();
        if (str5 == null) {
          break;
        }
        String str6 = str5.trim();
        if (str6.length() <= 5) {
          break;
        }
        str3 = str6.substring(0, 3);
        String str7 = str6.substring(3, 5);
        str4 = str3;
        localObject4 = str7;
        i1 = localTelephonyManager.getPhoneType();
        if (i1 != 1) {
          continue;
        }
        if ((a > -1) && (b > -1))
        {
          f = "0|" + str4 + "|" + (String)localObject4 + "|" + a + "|" + b;
          str1 = f;
        }
      }
      catch (Exception localException3)
      {
        f.a(localException3);
        break;
      }
      localGsmCellLocation = (GsmCellLocation)localTelephonyManager.getCellLocation();
      if (localGsmCellLocation != null)
      {
        a = localGsmCellLocation.getCid();
        b = localGsmCellLocation.getLac();
      }
      Method localMethod;
      if ((a > -1) && (b > -1))
      {
        f = "0|" + str4 + "|" + (String)localObject4 + "|" + a + "|" + b;
        str1 = f;
        continue;
        if (i1 != 2) {
          break label727;
        }
        if ((c > -1) && (e > -1) && (d > -1))
        {
          f = "1|" + str4 + "|" + (String)localObject4 + "|" + c + "|" + e + "|" + d;
          str1 = f;
          continue;
        }
        localCellLocation = localTelephonyManager.getCellLocation();
        arrayOfMethod = localCellLocation.getClass().getMethods();
        if (arrayOfMethod != null)
        {
          i2 = 0;
          if (i2 < arrayOfMethod.length) {}
        }
        else
        {
          if ((c <= -1) || (e <= -1) || (d <= -1)) {
            continue;
          }
          f = "1|" + str4 + "|" + (String)localObject4 + "|" + c + "|" + e + "|" + d;
          str1 = f;
          continue;
        }
        localMethod = arrayOfMethod[i2];
        if (localMethod == null) {
          break label770;
        }
        if (localMethod.getName().equals("getBaseStationId"))
        {
          c = ((Integer)localMethod.invoke(localCellLocation, new Object[0])).intValue();
          break label770;
        }
        if (!localMethod.getName().equals("getNetworkId")) {
          continue;
        }
        e = ((Integer)localMethod.invoke(localCellLocation, new Object[0])).intValue();
        break label770;
      }
      continue;
      if (!localMethod.getName().equals("getSystemId")) {
        break label770;
      }
      d = ((Integer)localMethod.invoke(localCellLocation, new Object[0])).intValue();
      break label770;
      label727:
      f = "";
      String str1 = f;
      continue;
      label739:
      str3 = str2;
    }
  }
  
  static long g()
  {
    long l1 = bq.g();
    if (l1 < er.g()) {
      l1 = er.g();
    }
    if (l1 < bk.a()) {
      l1 = bk.a();
    }
    return l1;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.eh
 * JD-Core Version:    0.7.0.1
 */