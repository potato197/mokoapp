package net.youmi.android;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

class cz
{
  private static int a = -1;
  private static int b = -1;
  private static int c = -1;
  private static int d = -1;
  private static int e = -1;
  private static int f = -1;
  
  static int a(Activity paramActivity)
  {
    if (a == -1)
    {
      for (;;)
      {
        try
        {
          PackageInfo localPackageInfo = paramActivity.getPackageManager().getPackageInfo(paramActivity.getPackageName(), 1);
          if (localPackageInfo == null) {
            continue;
          }
          arrayOfActivityInfo = localPackageInfo.activities;
          if (arrayOfActivityInfo == null) {
            continue;
          }
          j = 0;
          i = 0;
        }
        catch (Exception localException1)
        {
          ActivityInfo[] arrayOfActivityInfo;
          int j;
          int k;
          boolean bool;
          int i = 0;
          continue;
          i = 0;
          continue;
        }
        try
        {
          k = arrayOfActivityInfo.length;
          if (j < k) {
            continue;
          }
        }
        catch (Exception localException2)
        {
          continue;
        }
        if (i != 0) {
          continue;
        }
        a = 0;
        return 5;
        bool = arrayOfActivityInfo[j].name.equals("net.youmi.android.AdActivity");
        if (bool) {
          i = 1;
        }
        j++;
      }
      a = 1;
    }
    while (b == -1) {
      if (!dq.c(paramActivity))
      {
        b = 0;
        return 1;
        if (a == 0) {
          return 5;
        }
      }
      else
      {
        b = 1;
      }
    }
    while (c == -1) {
      if (!dq.d(paramActivity))
      {
        c = 0;
        return 2;
        if (b == 0) {
          return 1;
        }
      }
      else
      {
        c = 1;
      }
    }
    while (d == -1) {
      if (!dq.e(paramActivity))
      {
        d = 0;
        return 3;
        if (c == 0) {
          return 2;
        }
      }
      else
      {
        d = 1;
      }
    }
    while (e == -1) {
      if (!dq.b(paramActivity))
      {
        e = 0;
        return 4;
        if (d == 0) {
          return 3;
        }
      }
      else
      {
        e = 1;
        if (f != -1) {
          break label271;
        }
        if (!dq.f(paramActivity)) {
          break label250;
        }
        f = 1;
      }
    }
    label250:
    while (f != 0) {
      for (;;)
      {
        return 0;
        if (e != 0) {
          break;
        }
        return 4;
        if (!dq.g(paramActivity))
        {
          f = 0;
          return 6;
        }
        f = 1;
      }
    }
    label271:
    return 6;
  }
  
  static cu a(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder(1024);
    localStringBuilder.append("<html><head><title>有米广告配置</title></head><body><h2>有米广告Android Banner Ad SDk配置简易教程</h2>");
    localStringBuilder.append("<h3>1.请务必为您的应用程序配置正确的AppId和应用密码</h3>");
    localStringBuilder.append("<p>");
    localStringBuilder.append("<label style='color:green'>//请使用静态的方法调用AdManager.init(),设置AppId、密码、广告请求间隔和测试模式等参数(在任意AdView初始化前调用一次即可)</label><br/>");
    localStringBuilder.append("static{<br/>");
    localStringBuilder.append("<label style='color:green'>//第一个参数为您的应用AppId</label><br/>");
    localStringBuilder.append("<label style='color:green'>//第二个参数为您的应用密码</label><br/>");
    localStringBuilder.append("<label style='color:green'>//第三个参数是请求广告的间隔，有效的设置值为30至200，单位为秒</label><br/>");
    localStringBuilder.append("<label style='color:green'>//第四个参数是设置测试模式，设置为true时，可以获取测试广告，正式发布请设置此参数为false</label><br/>");
    localStringBuilder.append("net.youmi.android.AdManager.init(String appid, String appsec, int intervalSecond,boolean isTestMode);<br/>");
    localStringBuilder.append("}<br/>");
    localStringBuilder.append("</p>");
    localStringBuilder.append("<h3>2.请务必为您的应用程序配置以下权限:</h3>");
    localStringBuilder.append("<p style='color:blue'>");
    localStringBuilder.append("android.permission.INTERNET");
    localStringBuilder.append("</p>");
    localStringBuilder.append("<p style='color:blue'>");
    localStringBuilder.append("android.permission.READ_PHONE_STATE");
    localStringBuilder.append("</p>");
    localStringBuilder.append("<p style='color:blue'>");
    localStringBuilder.append("android.permission.ACCESS_NETWORK_STATE");
    localStringBuilder.append("</p>");
    localStringBuilder.append("<p style='color:blue'>");
    localStringBuilder.append("android.permission.WRITE_EXTERNAL_STORAGE_PERMISSION");
    localStringBuilder.append("</p>");
    localStringBuilder.append("<p style='color:blue'>");
    localStringBuilder.append("android.permission.ACCESS_COARSE_LOCATION");
    localStringBuilder.append("</p>");
    localStringBuilder.append("<h3>3.请务必在Androidmanifest.xml中添加以下Activity:</h3>");
    localStringBuilder.append("<p style='color:blue'>");
    localStringBuilder.append("&#60;activity android:name=\"net.youmi.android.AdActivity\"");
    localStringBuilder.append("<br/>");
    localStringBuilder.append("android:configChanges=\"keyboard|keyboardHidden|orientation\"/&#62;");
    localStringBuilder.append("</p>");
    localStringBuilder.append("</body></html>");
    String str = localStringBuilder.toString();
    int i = 11;
    if (paramInt == 5) {
      i = -1;
    }
    cu localcu = cu.a(paramActivity, false, "sample" + bn.a(), "FABC", "FABC", 0, i, "00000000", paramString1, paramString2, null, null, null, null, null, "#", null, false, true, null, System.currentTimeMillis());
    localcu.v();
    localcu.w();
    localcu.a(new em("#", str));
    return localcu;
  }
  
  static cu b(Activity paramActivity)
  {
    return a(paramActivity, "请为您的应用配置相应权限", "缺少INTERNET权限", 1);
  }
  
  static cu c(Activity paramActivity)
  {
    return a(paramActivity, "请为您的应用配置相应权限", "缺少READ_PHONE_STATE权限", 2);
  }
  
  static cu d(Activity paramActivity)
  {
    return a(paramActivity, "请为您的应用配置相应权限", "缺少ACCESS_COARSE_LOCATION权限", 6);
  }
  
  static cu e(Activity paramActivity)
  {
    return a(paramActivity, "请为您的应用配置相应权限", "缺少ACCESS_NETWORK_STATE权限", 3);
  }
  
  static cu f(Activity paramActivity)
  {
    return a(paramActivity, "请为您的应用配置相应权限", "缺少WRITE_EXTERNAL_STORAGE_PERMISSION权限", 4);
  }
  
  static cu g(Activity paramActivity)
  {
    return a(paramActivity, "请为您的应用程序添加AdActivity,否则无法显示广告详情", "缺少net.youmi.android.AdActivity", 5);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cz
 * JD-Core Version:    0.7.0.1
 */