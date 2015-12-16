package com.guohead.sdk.util;

import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Logger
{
  public static final int ADD_LOG = 73;
  public static final int ADD_LOG_STAT = 137;
  static int cacheLen;
  static String curAd;
  static ArrayList<String> logCache;
  static boolean logFlag;
  static boolean logForTest = true;
  static Handler mHandler;
  static boolean mLogD;
  static boolean mLogE = true;
  static boolean mLogI = true;
  static boolean mLogV;
  static boolean mLogW;
  static SimpleDateFormat sdf = new SimpleDateFormat("", Locale.SIMPLIFIED_CHINESE);
  static boolean statFlag;
  static ArrayList<String> statusCache;
  static int statusLen;
  static TextView tvLog;
  
  static
  {
    mLogD = true;
    mLogV = true;
    mLogW = true;
    logCache = new ArrayList();
    logFlag = false;
    statusCache = new ArrayList();
  }
  
  private static void addLog(String paramString)
  {
    if (logFlag) {
      logCache.remove(0);
    }
    for (;;)
    {
      logCache.add(paramString);
      if (mHandler != null) {
        mHandler.sendEmptyMessage(73);
      }
      return;
      cacheLen = logCache.size();
      if (cacheLen > 89) {
        logFlag = true;
      }
    }
  }
  
  public static void addStatus(String paramString)
  {
    if (statFlag) {
      statusCache.remove(0);
    }
    for (;;)
    {
      sdf.applyPattern("HH:mm:ss");
      StringBuffer localStringBuffer = new StringBuffer(sdf.format(new Date()));
      statusCache.add("\n" + paramString);
      if (mHandler != null) {
        mHandler.sendEmptyMessage(137);
      }
      return;
      cacheLen = statusCache.size();
      if (cacheLen > 149) {
        logFlag = true;
      }
    }
  }
  
  private static String convertToString(ArrayList<String> paramArrayList)
  {
    int i = paramArrayList.size();
    StringBuffer localStringBuffer = new StringBuffer();
    for (int j = 0; j < i; j++)
    {
      localStringBuffer.append("\n===============================\n");
      localStringBuffer.append((String)paramArrayList.get(j));
    }
    return localStringBuffer.toString();
  }
  
  public static void d(String paramString)
  {
    if (mLogD) {
      Log.d("Guohead SDK", "     " + paramString);
    }
    addLog(paramString);
  }
  
  public static void e(String paramString)
  {
    if (mLogE) {
      Log.e("Guohead SDK", "     " + paramString);
    }
    addLog(paramString);
  }
  
  public static String getLog()
  {
    return convertToString(logCache);
  }
  
  public static String getStatus()
  {
    return convertToString(statusCache);
  }
  
  public static void i(String paramString)
  {
    if (mLogI) {
      Log.i("Guohead SDK", "     " + paramString);
    }
    addLog(paramString);
  }
  
  public static void out(String paramString)
  {
    if (logForTest)
    {
      Log.d("Guohead SDK", "     " + paramString);
      addLog(paramString);
    }
  }
  
  public static void setHandler(Handler paramHandler)
  {
    mHandler = paramHandler;
  }
  
  public static void setLogFlag(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    mLogE = paramBoolean1;
    mLogI = paramBoolean2;
    mLogD = paramBoolean3;
    mLogV = paramBoolean4;
    mLogW = paramBoolean5;
  }
  
  public static void v(String paramString)
  {
    if (mLogV) {
      Log.v("Guohead SDK", "     " + paramString);
    }
    addLog(paramString);
  }
  
  public static void w(String paramString)
  {
    if (mLogW) {
      Log.w("Guohead SDK", "     " + paramString);
    }
    addLog(paramString);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.util.Logger
 * JD-Core Version:    0.7.0.1
 */