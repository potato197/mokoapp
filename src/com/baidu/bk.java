package com.baidu;

import android.util.Log;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;

class bk
{
  private static final SimpleDateFormat a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
  
  static
  {
    a();
  }
  
  public static int a(String paramString)
  {
    return a("Mobads SDK", paramString);
  }
  
  public static int a(String paramString1, String paramString2)
  {
    if (!a(3)) {
      return -1;
    }
    d(paramString1, paramString2);
    return Log.d(paramString1, paramString2);
  }
  
  public static int a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    return a(String.format("%s:: %s", new Object[] { paramString1, paramString2 }), paramThrowable);
  }
  
  public static int a(String paramString, Throwable paramThrowable)
  {
    if (!a(5)) {
      return -1;
    }
    c("Mobads SDK", paramString, paramThrowable);
    return Log.w("Mobads SDK", paramString, paramThrowable);
  }
  
  public static int a(Throwable paramThrowable)
  {
    return a("", paramThrowable);
  }
  
  public static void a()
  {
    w.b("_b_sdk.log");
  }
  
  public static boolean a(int paramInt)
  {
    return a("Mobads SDK", paramInt);
  }
  
  public static boolean a(String paramString, int paramInt)
  {
    return paramInt >= 6;
  }
  
  public static int b(String paramString)
  {
    if (!a(5)) {
      return -1;
    }
    d("Mobads SDK", paramString);
    return Log.w("Mobads SDK", paramString);
  }
  
  public static int b(String paramString1, String paramString2)
  {
    return b(String.format("%s:: %s", new Object[] { paramString1, paramString2 }));
  }
  
  public static int b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    return b(String.format("%s:: %s", new Object[] { paramString1, paramString2 }), paramThrowable);
  }
  
  public static int b(String paramString, Throwable paramThrowable)
  {
    if (!a(6)) {
      return -1;
    }
    c("Mobads SDK", paramString, paramThrowable);
    return Log.e("Mobads SDK", paramString, paramThrowable);
  }
  
  public static int c(String paramString)
  {
    if (!a(6)) {
      return -1;
    }
    d("Mobads SDK", paramString);
    return Log.e("Mobads SDK", paramString);
  }
  
  public static int c(String paramString1, String paramString2)
  {
    return c(String.format("%s:: %s", new Object[] { paramString1, paramString2 }));
  }
  
  private static void c(String paramString1, String paramString2, Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
    paramThrowable.printStackTrace(localPrintWriter);
    d(paramString1, paramString2 + "\n" + localStringWriter.toString());
    localPrintWriter.close();
    try
    {
      localStringWriter.close();
      return;
    }
    catch (IOException localIOException)
    {
      Log.w("Log.debug", "", localIOException);
    }
  }
  
  private static void d(String paramString1, String paramString2) {}
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.bk
 * JD-Core Version:    0.7.0.1
 */