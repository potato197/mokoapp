package net.youmi.android;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

class ax
{
  static int a(Properties paramProperties, String paramString, int paramInt)
  {
    try
    {
      String str = a(paramProperties, paramString, null);
      if (str == null) {
        return paramInt;
      }
      int i = Integer.parseInt(str);
      return i;
    }
    catch (Exception localException) {}
    return paramInt;
  }
  
  static String a(Properties paramProperties, String paramString1, String paramString2)
  {
    try
    {
      String str = paramProperties.getProperty(paramString1);
      return str;
    }
    catch (Exception localException) {}
    return paramString2;
  }
  
  static Properties a(Context paramContext, String paramString)
  {
    localProperties = new Properties();
    try
    {
      FileInputStream localFileInputStream = paramContext.openFileInput(paramString);
      if (localFileInputStream != null) {
        localProperties.load(localFileInputStream);
      }
      try
      {
        localFileInputStream.close();
        return localProperties;
      }
      catch (Exception localException2)
      {
        return localProperties;
      }
      return localProperties;
    }
    catch (Exception localException1) {}
  }
  
  static boolean a(Context paramContext, Properties paramProperties, String paramString)
  {
    try
    {
      FileOutputStream localFileOutputStream = paramContext.openFileOutput(paramString, 0);
      boolean bool = false;
      if (localFileOutputStream != null) {
        paramProperties.store(localFileOutputStream, null);
      }
      try
      {
        localFileOutputStream.close();
        label28:
        bool = true;
        return bool;
      }
      catch (Exception localException2)
      {
        break label28;
      }
      return false;
    }
    catch (Exception localException1) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ax
 * JD-Core Version:    0.7.0.1
 */