package net.youmi.android;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;

class r
{
  private static Notification a;
  private static int b = 0;
  
  static Notification a(Context paramContext)
  {
    try
    {
      if (a == null)
      {
        PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, 99999, AdActivity.a(paramContext), 268435456);
        a = new Notification();
        a.icon = 17301633;
        a.tickerText = "正在下载";
        a.flags = 16;
        a.setLatestEventInfo(paramContext.getApplicationContext(), "正在下载", "点击查看下载状态", localPendingIntent);
      }
      label68:
      return a;
    }
    catch (Exception localException)
    {
      break label68;
    }
  }
  
  /* Error */
  static String a(File paramFile)
  {
    // Byte code:
    //   0: new 64	java/io/FileInputStream
    //   3: dup
    //   4: aload_0
    //   5: invokespecial 67	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   8: astore_1
    //   9: new 69	java/io/ByteArrayOutputStream
    //   12: dup
    //   13: sipush 5120
    //   16: invokespecial 72	java/io/ByteArrayOutputStream:<init>	(I)V
    //   19: astore_2
    //   20: aload_1
    //   21: invokevirtual 76	java/io/FileInputStream:available	()I
    //   24: ifle +19 -> 43
    //   27: aload_2
    //   28: aload_1
    //   29: invokevirtual 79	java/io/FileInputStream:read	()I
    //   32: invokevirtual 82	java/io/ByteArrayOutputStream:write	(I)V
    //   35: aload_1
    //   36: ldc2_w 83
    //   39: invokevirtual 88	java/io/FileInputStream:skip	(J)J
    //   42: pop2
    //   43: aload_1
    //   44: invokevirtual 91	java/io/FileInputStream:close	()V
    //   47: aload_2
    //   48: invokevirtual 94	java/io/ByteArrayOutputStream:size	()I
    //   51: ifle +55 -> 106
    //   54: aload_2
    //   55: invokevirtual 98	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   58: invokestatic 103	net/youmi/android/cq:a	([B)Ljava/lang/String;
    //   61: astore 8
    //   63: aload 8
    //   65: astore 5
    //   67: aload_2
    //   68: invokevirtual 104	java/io/ByteArrayOutputStream:close	()V
    //   71: aload 5
    //   73: ifnull +17 -> 90
    //   76: aload 5
    //   78: iconst_0
    //   79: bipush 8
    //   81: invokevirtual 110	java/lang/String:substring	(II)Ljava/lang/String;
    //   84: astore 7
    //   86: aload 7
    //   88: astore 5
    //   90: aload 5
    //   92: areturn
    //   93: astore_3
    //   94: aconst_null
    //   95: areturn
    //   96: astore 4
    //   98: goto -51 -> 47
    //   101: astore 6
    //   103: goto -32 -> 71
    //   106: aconst_null
    //   107: astore 5
    //   109: goto -42 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	paramFile	File
    //   8	36	1	localFileInputStream	java.io.FileInputStream
    //   19	49	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   93	1	3	localException1	Exception
    //   96	1	4	localException2	Exception
    //   65	43	5	localObject	Object
    //   101	1	6	localException3	Exception
    //   84	3	7	str1	String
    //   61	3	8	str2	String
    // Exception table:
    //   from	to	target	type
    //   0	43	93	java/lang/Exception
    //   47	63	93	java/lang/Exception
    //   76	86	93	java/lang/Exception
    //   43	47	96	java/lang/Exception
    //   67	71	101	java/lang/Exception
  }
  
  /* Error */
  static ArrayList a()
  {
    // Byte code:
    //   0: invokestatic 117	net/youmi/android/bc:h	()Lnet/youmi/android/ed;
    //   3: invokevirtual 122	net/youmi/android/ed:b	()[Ljava/lang/String;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnull +118 -> 126
    //   11: iconst_0
    //   12: istore_2
    //   13: aconst_null
    //   14: astore_3
    //   15: iload_2
    //   16: aload_1
    //   17: arraylength
    //   18: if_icmplt +5 -> 23
    //   21: aload_3
    //   22: areturn
    //   23: aload_1
    //   24: iload_2
    //   25: aaload
    //   26: invokestatic 125	net/youmi/android/r:a	(Ljava/lang/String;)Lnet/youmi/android/ci;
    //   29: astore 4
    //   31: aload 4
    //   33: ifnull +69 -> 102
    //   36: aload 4
    //   38: invokestatic 128	net/youmi/android/r:a	(Lnet/youmi/android/ci;)Z
    //   41: ifeq +61 -> 102
    //   44: aload_3
    //   45: ifnonnull +13 -> 58
    //   48: new 130	java/util/ArrayList
    //   51: dup
    //   52: bipush 10
    //   54: invokespecial 131	java/util/ArrayList:<init>	(I)V
    //   57: astore_3
    //   58: aload 4
    //   60: getfield 137	net/youmi/android/ci:c	Ljava/io/File;
    //   63: ifnull +39 -> 102
    //   66: invokestatic 143	java/lang/System:currentTimeMillis	()J
    //   69: lstore 5
    //   71: aload 4
    //   73: getfield 137	net/youmi/android/ci:c	Ljava/io/File;
    //   76: invokevirtual 148	java/io/File:lastModified	()J
    //   79: lstore 7
    //   81: lload 5
    //   83: lload 7
    //   85: lsub
    //   86: ldc2_w 149
    //   89: lcmp
    //   90: ifle +18 -> 108
    //   93: aload 4
    //   95: getfield 137	net/youmi/android/ci:c	Ljava/io/File;
    //   98: invokevirtual 154	java/io/File:delete	()Z
    //   101: pop
    //   102: iinc 2 1
    //   105: goto -90 -> 15
    //   108: aload_3
    //   109: aload 4
    //   111: invokevirtual 158	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   114: pop
    //   115: goto -13 -> 102
    //   118: astore_0
    //   119: aconst_null
    //   120: areturn
    //   121: astore 10
    //   123: goto -21 -> 102
    //   126: aconst_null
    //   127: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   118	1	0	localException1	Exception
    //   6	18	1	arrayOfString	String[]
    //   12	91	2	i	int
    //   14	95	3	localArrayList	ArrayList
    //   29	81	4	localci	ci
    //   69	13	5	l1	long
    //   79	5	7	l2	long
    //   121	1	10	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   0	7	118	java/lang/Exception
    //   15	21	118	java/lang/Exception
    //   23	31	118	java/lang/Exception
    //   36	44	118	java/lang/Exception
    //   48	58	118	java/lang/Exception
    //   58	81	118	java/lang/Exception
    //   108	115	118	java/lang/Exception
    //   93	102	121	java/lang/Exception
  }
  
  static ci a(String paramString)
  {
    try
    {
      int i = paramString.lastIndexOf('_');
      if (i > -1)
      {
        long l = Long.parseLong(paramString.substring(i + 1));
        String str1 = paramString.substring(0, i);
        int j = str1.lastIndexOf('_');
        if (j > -1)
        {
          String str2 = str1.substring(j + 1);
          String str3 = str1.substring(0, j);
          ci localci = new ci();
          localci.b = paramString;
          localci.d = l;
          localci.e = str2;
          localci.a = str3;
          localci.c = new File(bc.h().a(paramString));
          return localci;
        }
      }
      return null;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static ci a(String paramString, long paramLong)
  {
    ci localci = new ci();
    localci.d = paramLong;
    localci.a = paramString;
    localci.e = cq.b(paramString + "sdfkoi897hk5490g89dlsd99").substring(0, 8);
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramString);
    localStringBuilder.append('_');
    localStringBuilder.append(localci.e);
    localStringBuilder.append('_');
    localStringBuilder.append(paramLong);
    localci.b = localStringBuilder.toString();
    localci.c = new File(bc.h().a(localci.b));
    return localci;
  }
  
  static boolean a(ci paramci)
  {
    try
    {
      boolean bool = cq.b(paramci.a + "sdfkoi897hk5490g89dlsd99").substring(0, 8).equals(paramci.e);
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  static boolean a(m paramm)
  {
    try
    {
      String str = a(paramm.c);
      if (str != null)
      {
        boolean bool = paramm.b.equals(str);
        if (bool) {
          return true;
        }
      }
    }
    catch (Exception localException) {}
    return false;
  }
  
  static ArrayList b()
  {
    try
    {
      String[] arrayOfString = bc.g().b();
      if (arrayOfString != null)
      {
        int i = 0;
        ArrayList localArrayList = null;
        for (;;)
        {
          if (i >= arrayOfString.length) {
            return localArrayList;
          }
          m localm = b(arrayOfString[i]);
          if ((localm != null) && (b(localm)))
          {
            if (localArrayList == null) {
              localArrayList = new ArrayList(10);
            }
            localArrayList.add(localm);
          }
          i++;
        }
      }
      return null;
    }
    catch (Exception localException)
    {
      f.a(localException);
      return null;
    }
  }
  
  static m b(String paramString)
  {
    try
    {
      int i = paramString.lastIndexOf('_');
      if ((i > -1) && (paramString.length() >= i + 16))
      {
        m localm = new m();
        String str = paramString.substring(0, i);
        localm.e = paramString;
        localm.a = paramString.substring(i + 1, i + 9);
        localm.b = paramString.substring(i + 9, i + 17);
        if (paramString.length() > i + 17) {
          str = str + paramString.substring(i + 17);
        }
        localm.d = str;
        localm.c = new File(bc.g().a(paramString));
        boolean bool = localm.c.exists();
        if (bool) {}
        return localm;
      }
    }
    catch (Exception localException)
    {
      return null;
    }
    return null;
  }
  
  static m b(ci paramci)
  {
    try
    {
      m localm = new m();
      localm.d = paramci.a;
      StringBuilder localStringBuilder = new StringBuilder(128);
      localStringBuilder.append(paramci.a);
      localStringBuilder.append(paramci.c.length());
      localStringBuilder.append("l53d2lj8sdf6jks8lq9efx");
      localm.a = cq.b(localStringBuilder.toString()).substring(0, 8);
      localm.b = a(paramci.c);
      localStringBuilder.delete(0, localStringBuilder.length());
      int i = localm.d.lastIndexOf('.');
      String str = "";
      if (i > -1)
      {
        localStringBuilder.append(localm.d.substring(0, i));
        str = localm.d.substring(i);
      }
      for (;;)
      {
        localStringBuilder.append('_');
        localStringBuilder.append(localm.a);
        localStringBuilder.append(localm.b);
        localStringBuilder.append(str);
        localm.e = localStringBuilder.toString();
        localm.c = new File(bc.g().a(localm.e));
        if ((!paramci.c.renameTo(localm.c)) || (!localm.c.exists())) {
          break;
        }
        return localm;
        localStringBuilder.append(localm.d);
      }
      return null;
    }
    catch (Exception localException) {}
  }
  
  static void b(Context paramContext)
  {
    for (;;)
    {
      NotificationManager localNotificationManager;
      try
      {
        localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
        if (localNotificationManager != null)
        {
          localNotification = a(paramContext);
          if (localNotification == null) {
            break label92;
          }
          if (b <= 0) {
            continue;
          }
          localNotification.number = b;
          localNotification.flags = 16;
          localNotificationManager.notify(99999, localNotification);
        }
      }
      catch (Exception localException)
      {
        Notification localNotification;
        f.a(localException);
        continue;
      }
      finally {}
      return;
      localNotification.flags = 16;
      localNotificationManager.cancel(99999);
      continue;
      label92:
      localNotificationManager.cancel(99999);
    }
  }
  
  static boolean b(m paramm)
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder(128);
      localStringBuilder.append(paramm.d);
      localStringBuilder.append(paramm.c.length());
      localStringBuilder.append("l53d2lj8sdf6jks8lq9efx");
      boolean bool1 = cq.b(localStringBuilder.toString()).substring(0, 8).equals(paramm.a);
      boolean bool2 = false;
      if (bool1) {
        bool2 = true;
      }
      return bool2;
    }
    catch (Exception localException) {}
    return false;
  }
  
  static void c(Context paramContext)
  {
    try
    {
      b = 1 + b;
      b(paramContext);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  static void d(Context paramContext)
  {
    try
    {
      b = -1 + b;
      b(paramContext);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  /* Error */
  static void e(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: iconst_0
    //   4: putstatic 12	net/youmi/android/r:b	I
    //   7: aload_0
    //   8: invokestatic 289	net/youmi/android/r:b	(Landroid/content/Context;)V
    //   11: ldc 2
    //   13: monitorexit
    //   14: return
    //   15: astore_2
    //   16: ldc 2
    //   18: monitorexit
    //   19: aload_2
    //   20: athrow
    //   21: astore_1
    //   22: goto -11 -> 11
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	25	0	paramContext	Context
    //   21	1	1	localException	Exception
    //   15	5	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	11	15	finally
    //   3	11	21	java/lang/Exception
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.r
 * JD-Core Version:    0.7.0.1
 */