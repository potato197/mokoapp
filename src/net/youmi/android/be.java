package net.youmi.android;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import java.net.URLDecoder;

class be
{
  static void a(Activity paramActivity)
  {
    try
    {
      AdActivity.b(paramActivity);
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  static void a(Activity paramActivity, String paramString)
  {
    try
    {
      if (paramString.toLowerCase().indexOf(".apk") > -1) {
        a(paramActivity, paramString);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  static void a(Activity paramActivity, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    try
    {
      b(paramActivity, "http://ditu.google.com/maps?q=" + paramString1 + "," + paramString2 + "(" + paramString3 + " " + paramString4 + ")&z=16");
      return;
    }
    catch (Exception localException) {}
  }
  
  static void a(Activity paramActivity, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString1, String paramString2)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.SEND");
      localIntent.putExtra("android.intent.extra.EMAIL", paramArrayOfString1);
      if ((paramArrayOfString2 != null) && (paramArrayOfString2.length > 0)) {
        localIntent.putExtra("android.intent.extra.CC", paramArrayOfString2);
      }
      if ((paramArrayOfString3 != null) && (paramArrayOfString3.length > 0)) {
        localIntent.putExtra("android.intent.extra.BCC", paramArrayOfString3);
      }
      localIntent.putExtra("android.intent.extra.SUBJECT", paramString1);
      localIntent.putExtra("android.intent.extra.TEXT", paramString2);
      localIntent.setType("message/rfc822");
      paramActivity.startActivity(localIntent);
      return;
    }
    catch (Exception localException) {}
  }
  
  static void a(Context paramContext, String paramString)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse(paramString), "application/vnd.android.package-archive");
      paramContext.startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
  
  static boolean a(Activity paramActivity, Uri paramUri)
  {
    if (paramUri != null) {
      try
      {
        Intent localIntent = new Intent("android.intent.action.DIAL", paramUri);
        localIntent.addFlags(268435456);
        paramActivity.startActivity(localIntent);
        return true;
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  static boolean a(Activity paramActivity, String paramString1, String paramString2)
  {
    if (paramString1 != null) {
      try
      {
        Intent localIntent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + paramString1));
        if (paramString2 != null) {
          localIntent.putExtra("sms_body", paramString2);
        }
        paramActivity.startActivity(localIntent);
        return true;
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  static void b(Activity paramActivity, String paramString)
  {
    if (paramString == null) {}
    String str;
    do
    {
      return;
      str = paramString.trim();
    } while (str.length() == 0);
    try
    {
      Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse(str));
      localIntent1.addFlags(268435456);
      localIntent1.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
      paramActivity.startActivity(localIntent1);
      return;
    }
    catch (Exception localException1)
    {
      try
      {
        Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
        localIntent2.addFlags(268435456);
        paramActivity.startActivity(localIntent2);
        return;
      }
      catch (Exception localException2) {}
    }
  }
  
  static void b(Activity paramActivity, String[] paramArrayOfString1, String[] paramArrayOfString2, String[] paramArrayOfString3, String paramString1, String paramString2)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.SEND");
      localIntent.putExtra("android.intent.extra.EMAIL", paramArrayOfString1);
      if ((paramArrayOfString2 != null) && (paramArrayOfString2.length > 0)) {
        localIntent.putExtra("android.intent.extra.CC", paramArrayOfString2);
      }
      if ((paramArrayOfString3 != null) && (paramArrayOfString3.length > 0)) {
        localIntent.putExtra("android.intent.extra.BCC", paramArrayOfString3);
      }
      localIntent.putExtra("android.intent.extra.SUBJECT", paramString1);
      localIntent.putExtra("android.intent.extra.TEXT", Html.fromHtml(paramString2));
      localIntent.setType("text/html");
      paramActivity.startActivity(localIntent);
      return;
    }
    catch (Exception localException) {}
  }
  
  static void b(Context paramContext, String paramString)
  {
    a(paramContext, "file://" + paramString);
  }
  
  static void c(Activity paramActivity, String paramString)
  {
    if (paramString == null) {}
    String str;
    do
    {
      return;
      str = paramString.trim();
    } while (str.length() == 0);
    try
    {
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(str));
      localIntent.addFlags(268435456);
      paramActivity.startActivity(localIntent);
      return;
    }
    catch (Exception localException) {}
  }
  
  static boolean d(Activity paramActivity, String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return false;
      try
      {
        if (paramString.indexOf("geo:") == 0)
        {
          Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
          localIntent.addFlags(268435456);
          paramActivity.startActivity(localIntent);
          return true;
        }
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  static boolean e(Activity paramActivity, String paramString)
  {
    if (paramString == null) {
      return false;
    }
    for (;;)
    {
      try
      {
        String str1 = new String(paramString);
        int i = str1.indexOf("?body=");
        if (i > -1)
        {
          str2 = str1.substring(i + "?body=".length());
          str1 = str1.substring(0, i);
          if (str1.indexOf("sms:") == 0)
          {
            localObject = str1.substring("sms:".length());
            if (localObject == null) {
              break;
            }
            Intent localIntent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:" + (String)localObject));
            if (str2 != null) {
              localIntent.putExtra("sms_body", URLDecoder.decode(str2));
            }
            paramActivity.startActivity(localIntent);
            return true;
          }
          int j = str1.indexOf("smsto:");
          Object localObject = null;
          if (j != 0) {
            continue;
          }
          String str3 = str1.substring("smsto:".length());
          localObject = str3;
          continue;
        }
        String str2 = null;
      }
      catch (Exception localException)
      {
        return false;
      }
    }
  }
  
  static boolean f(Activity paramActivity, String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return false;
      try
      {
        Object localObject;
        if (paramString.indexOf("wtai://wp/mc;") == 0) {
          localObject = paramString.substring("wtai://wp/mc;".length());
        }
        while (localObject != null)
        {
          Intent localIntent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + (String)localObject));
          localIntent.addFlags(268435456);
          paramActivity.startActivity(localIntent);
          return true;
          int i = paramString.indexOf("tel:");
          localObject = null;
          if (i == 0)
          {
            String str = paramString.substring("tel:".length());
            localObject = str;
          }
        }
        return false;
      }
      catch (Exception localException) {}
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.be
 * JD-Core Version:    0.7.0.1
 */