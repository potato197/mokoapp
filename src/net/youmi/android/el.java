package net.youmi.android;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;

class el
{
  private static String e = "yuJtmxbnRzbmWJnK";
  private String a = "";
  private String b = "";
  private String c = "";
  private String d = "";
  private String f;
  private boolean g = false;
  
  el(Context paramContext)
  {
    label225:
    label363:
    try
    {
      localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager == null) {}
    }
    catch (Exception localException1)
    {
      TelephonyManager localTelephonyManager;
      String str2;
      String str1;
      label241:
      label254:
      break label225;
    }
    for (;;)
    {
      try
      {
        str2 = localTelephonyManager.getSubscriberId();
        if (str2 != null) {
          this.b = str2.trim();
        }
      }
      catch (Exception localException4)
      {
        label412:
        break;
        k = i;
        break label363;
        j = 0;
        break label241;
      }
      try
      {
        str1 = localTelephonyManager.getDeviceId();
        if (str1 != null)
        {
          this.a = str1;
          if (this.a != null)
          {
            if (this.a.indexOf(" ") > -1) {
              this.a.replace(" ", "");
            }
            if (this.a.indexOf("-") > -1) {
              this.a = this.a.replace("-", "");
            }
            if (this.a.indexOf("\n") > -1) {
              this.a = this.a.replace("\n", "");
            }
            int i1 = this.a.indexOf("MEID:");
            if (i1 > -1) {
              this.a = this.a.substring(i1 + "MEID:".length());
            }
            this.a = this.a.trim();
          }
        }
      }
      catch (Exception localException5)
      {
        break label225;
      }
    }
    if (this.a == null)
    {
      this.a = "";
      j = i;
      if (this.b != null) {
        break label412;
      }
      this.b = "";
      if (i == 0) {}
    }
    for (;;)
    {
      try
      {
        this.c = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
        if (this.c == null) {
          continue;
        }
        this.c = this.c.trim();
        int n = this.c.length();
        if (n > 0) {
          i = 0;
        }
      }
      catch (Exception localException3)
      {
        continue;
        this.d = "";
        k = i;
        continue;
      }
      if (i == 0) {
        break label533;
      }
      try
      {
        this.d = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        if (this.d == null) {
          continue;
        }
        this.d = this.d.trim();
        int m = this.d.length();
        k = 0;
        if (m <= 0) {
          break label533;
        }
      }
      catch (Exception localException2)
      {
        k = i;
        continue;
        this.f = cq.c(cq.b(this.a + this.b + this.c + e).substring(7, 25));
        continue;
      }
      if (k == 0) {
        break label462;
      }
      this.f = cq.c(a(paramContext).substring(7, 25));
      this.g = g();
      return;
      if (this.a.length() != 0) {
        break label539;
      }
      j = i;
      break;
      if (this.b.length() == 0) {
        break label254;
      }
      i = j;
      break label254;
      this.c = "";
    }
  }
  
  private boolean g()
  {
    try
    {
      String str = Build.MODEL.trim().toLowerCase();
      if ((this.a != null) && (this.a.equals("000000000000000"))) {
        return true;
      }
      if (str != null)
      {
        if (!str.equals("sdk"))
        {
          boolean bool = str.equals("google_sdk");
          if (bool) {}
        }
      }
      else {
        return false;
      }
    }
    catch (Exception localException) {}
    return true;
  }
  
  String a()
  {
    return this.f;
  }
  
  /* Error */
  String a(Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc 162
    //   3: invokestatic 167	net/youmi/android/ax:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Properties;
    //   6: astore_3
    //   7: aload_3
    //   8: ldc 169
    //   10: invokevirtual 174	java/util/Properties:containsKey	(Ljava/lang/Object;)Z
    //   13: istore 4
    //   15: aconst_null
    //   16: astore 5
    //   18: iload 4
    //   20: ifeq +14 -> 34
    //   23: aload_3
    //   24: ldc 169
    //   26: invokevirtual 178	java/util/Properties:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast 53	java/lang/String
    //   32: astore 5
    //   34: aload 5
    //   36: ifnonnull +82 -> 118
    //   39: new 126	java/lang/StringBuilder
    //   42: dup
    //   43: invokestatic 182	net/youmi/android/eh:d	()Ljava/lang/String;
    //   46: invokestatic 130	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   49: invokespecial 133	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   52: invokestatic 184	net/youmi/android/eh:b	()Ljava/lang/String;
    //   55: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: ldc 185
    //   60: invokestatic 190	net/youmi/android/bn:a	(I)I
    //   63: invokevirtual 193	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   66: invokestatic 199	java/lang/System:currentTimeMillis	()J
    //   69: invokevirtual 202	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   72: invokestatic 204	net/youmi/android/eh:c	()Ljava/lang/String;
    //   75: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: getstatic 19	net/youmi/android/el:e	Ljava/lang/String;
    //   81: invokevirtual 137	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokestatic 142	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   90: astore 6
    //   92: aload 6
    //   94: astore 5
    //   96: aload 5
    //   98: ifnull +20 -> 118
    //   101: aload_3
    //   102: ldc 169
    //   104: aload 5
    //   106: invokevirtual 208	java/util/Properties:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   109: pop
    //   110: aload_1
    //   111: aload_3
    //   112: ldc 162
    //   114: invokestatic 211	net/youmi/android/ax:a	(Landroid/content/Context;Ljava/util/Properties;Ljava/lang/String;)Z
    //   117: pop
    //   118: aload 5
    //   120: ifnonnull +15 -> 135
    //   123: getstatic 147	android/os/Build:MODEL	Ljava/lang/String;
    //   126: invokestatic 142	net/youmi/android/cq:b	(Ljava/lang/String;)Ljava/lang/String;
    //   129: astore 7
    //   131: aload 7
    //   133: astore 5
    //   135: aload 5
    //   137: areturn
    //   138: astore_2
    //   139: ldc 27
    //   141: areturn
    //   142: astore 8
    //   144: goto -26 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	el
    //   0	147	1	paramContext	Context
    //   138	1	2	localException1	Exception
    //   6	106	3	localProperties	java.util.Properties
    //   13	6	4	bool	boolean
    //   16	120	5	localObject	Object
    //   90	3	6	str1	String
    //   129	3	7	str2	String
    //   142	1	8	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	15	138	java/lang/Exception
    //   23	34	138	java/lang/Exception
    //   39	92	138	java/lang/Exception
    //   123	131	138	java/lang/Exception
    //   101	118	142	java/lang/Exception
  }
  
  String b()
  {
    return this.d;
  }
  
  String c()
  {
    return this.c;
  }
  
  String d()
  {
    return this.b;
  }
  
  String e()
  {
    return this.a;
  }
  
  boolean f()
  {
    return this.g;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.el
 * JD-Core Version:    0.7.0.1
 */