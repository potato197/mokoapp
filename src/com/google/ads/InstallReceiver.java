package com.google.ads;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.util.AdUtil;
import com.google.ads.util.a;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Set;

public class InstallReceiver
  extends BroadcastReceiver
{
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    if (paramString1 != null) {}
    for (;;)
    {
      int j;
      StringBuilder localStringBuilder;
      try
      {
        String[] arrayOfString1 = paramString1.split("&");
        int i = arrayOfString1.length;
        j = 0;
        localStringBuilder = null;
        if (j < i)
        {
          String str1 = arrayOfString1[j];
          if (!str1.startsWith("admob_")) {
            break label239;
          }
          String[] arrayOfString2 = str1.substring("admob_".length()).split("=");
          String str2 = URLEncoder.encode(arrayOfString2[0], "UTF-8");
          String str3 = URLEncoder.encode(arrayOfString2[1], "UTF-8");
          if (localStringBuilder == null)
          {
            localStringBuilder = new StringBuilder(128);
            localStringBuilder.append(str2).append("=").append(str3);
            break label239;
          }
          localStringBuilder.append("&");
          continue;
          return null;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        a.a("Could not create install URL.  Install not tracked.", localUnsupportedEncodingException);
      }
      while (localStringBuilder == null) {}
      String str4 = URLEncoder.encode(paramString2, "UTF-8");
      localStringBuilder.append("&").append("isu").append("=").append(str4);
      String str5 = URLEncoder.encode(paramString3, "UTF-8");
      localStringBuilder.append("&").append("app_id").append("=").append(str5);
      String str6 = "http://a.admob.com/f0?" + localStringBuilder.toString();
      return str6;
      label239:
      j++;
    }
  }
  
  public void forwardIntent(Context paramContext, Intent paramIntent)
  {
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      if (localPackageManager != null)
      {
        ActivityInfo localActivityInfo = localPackageManager.getReceiverInfo(new ComponentName(paramContext, InstallReceiver.class), 128);
        if ((localActivityInfo != null) && (localActivityInfo.metaData != null))
        {
          Set localSet = localActivityInfo.metaData.keySet();
          if (localSet != null)
          {
            Iterator localIterator = localSet.iterator();
            while (localIterator.hasNext())
            {
              String str1 = (String)localIterator.next();
              String str2 = null;
              try
              {
                str2 = localActivityInfo.metaData.getString(str1);
                if (!str2.equals("com.google.android.apps.analytics.AnalyticsReceiver"))
                {
                  ((BroadcastReceiver)Class.forName(str2).newInstance()).onReceive(paramContext, paramIntent);
                  a.a("Successfully forwarded install notification to " + str2);
                }
              }
              catch (Exception localException3)
              {
                a.c("Could not forward Market's INSTALL_REFERRER intent to " + str2, localException3);
              }
            }
          }
        }
      }
      try
      {
        ((BroadcastReceiver)Class.forName("com.google.android.apps.analytics.AnalyticsReceiver").newInstance()).onReceive(paramContext, paramIntent);
        a.a("Successfully forwarded install notification to com.google.android.apps.analytics.AnalyticsReceiver");
        return;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        a.d("Google Analytics not installed.");
        return;
      }
      catch (Exception localException2)
      {
        a.c("Exception from the Google Analytics install receiver.", localException2);
      }
    }
    catch (Exception localException1)
    {
      a.c("Unhandled exception while forwarding install intents. Possibly lost some install information.", localException1);
      return;
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      String str1 = paramIntent.getStringExtra("referrer");
      String str2 = AdUtil.a(paramContext);
      String str3 = a(str1, str2, paramContext.getPackageName());
      if (str3 != null) {
        a.d("Processing install from an AdMob ad (" + str3 + ").");
      }
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(str3).openConnection();
      AdUtil.a(localHttpURLConnection, paramContext.getApplicationContext());
      localHttpURLConnection.setRequestProperty("X-Admob-Isu", str2);
      localHttpURLConnection.getResponseCode();
      forwardIntent(paramContext, paramIntent);
      return;
    }
    catch (Exception localException)
    {
      a.a("Unhandled exception processing Market install.", localException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.InstallReceiver
 * JD-Core Version:    0.7.0.1
 */