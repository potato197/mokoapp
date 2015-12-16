package com.github.droidfu.support;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;

public class DiagnosticSupport
{
  public static String createDiagnosis(Activity paramActivity, Exception paramException)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    ContentResolver localContentResolver = paramActivity.getContentResolver();
    Configuration localConfiguration = new Configuration();
    Settings.System.getConfiguration(localContentResolver, localConfiguration);
    localStringBuilder.append("Application version: " + getApplicationVersionString(paramActivity) + "\n");
    localStringBuilder.append("Device locale: " + localConfiguration.locale.toString() + "\n\n");
    localStringBuilder.append("PHONE SPECS\n");
    localStringBuilder.append("model: " + Build.MODEL + "\n");
    localStringBuilder.append("brand: " + Build.BRAND + "\n");
    localStringBuilder.append("product: " + Build.PRODUCT + "\n");
    localStringBuilder.append("device: " + Build.DEVICE + "\n\n");
    localStringBuilder.append("PLATFORM INFO\n");
    localStringBuilder.append("Android " + Build.VERSION.RELEASE + " " + Build.ID + " (build " + Build.VERSION.INCREMENTAL + ")\n");
    localStringBuilder.append("build tags: " + Build.TAGS + "\n");
    localStringBuilder.append("build type: " + Build.TYPE + "\n\n");
    localStringBuilder.append("SYSTEM SETTINGS\n");
    for (;;)
    {
      try
      {
        if (Settings.Secure.getInt(localContentResolver, "wifi_on") != 0) {
          continue;
        }
        str = "DATA";
        localStringBuilder.append("network mode: " + str + "\n");
        localStringBuilder.append("HTTP proxy: " + Settings.Secure.getString(localContentResolver, "http_proxy") + "\n\n");
      }
      catch (Settings.SettingNotFoundException localSettingNotFoundException)
      {
        String str;
        StringWriter localStringWriter;
        localSettingNotFoundException.printStackTrace();
        continue;
      }
      localStringBuilder.append("STACK TRACE FOLLOWS\n\n");
      localStringWriter = new StringWriter();
      paramException.printStackTrace(new PrintWriter(localStringWriter));
      localStringBuilder.append(localStringWriter.toString());
      return localStringBuilder.toString();
      str = "WIFI";
    }
  }
  
  public static String getApplicationVersionString(Context paramContext)
  {
    try
    {
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
      String str = "v" + localPackageInfo.versionName;
      return str;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.support.DiagnosticSupport
 * JD-Core Version:    0.7.0.1
 */