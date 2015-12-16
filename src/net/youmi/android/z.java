package net.youmi.android;

import android.app.Activity;

class z
{
  static void a(Activity paramActivity, String paramString)
  {
    if (paramString != null) {}
    try
    {
      String str1 = paramString.trim();
      if ((str1.length() > 0) && (str1.indexOf("sms:") == 0) && (str1.length() > "sms:".length()))
      {
        String[] arrayOfString = str1.substring("sms:".length()).split("&");
        if (arrayOfString.length > 0)
        {
          String str2 = arrayOfString[0];
          String str3 = "";
          if (arrayOfString.length > 1) {
            str3 = arrayOfString[1];
          }
          be.a(paramActivity, str2, str3);
        }
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  static boolean b(Activity paramActivity, String paramString)
  {
    if (paramString == null) {
      return false;
    }
    try
    {
      String str1 = paramString.trim();
      if ((str1.indexOf("mailto:") == 0) && (str1.length() > "mailto:".length()))
      {
        b localb = new b(str1.substring("mailto:".length()).split("&"));
        String str2 = (String)localb.a(0, null);
        String str3 = (String)localb.a(1, null);
        String str4 = (String)localb.a(2, null);
        String str5 = (String)localb.a(3, null);
        String str6 = (String)localb.a(4, null);
        String str7 = (String)localb.a(5, "0");
        if (str2 == null) {
          return false;
        }
        String[] arrayOfString1 = j.a(str2, ",");
        String[] arrayOfString2 = j.a(str3, ",");
        String[] arrayOfString3 = j.a(str4, ",");
        if (str5 != null) {
          str5 = ap.a(str5);
        }
        if (str6 != null) {
          str6 = ap.a(str6);
        }
        if (str7.equals("0")) {
          be.a(paramActivity, arrayOfString1, arrayOfString2, arrayOfString3, str5, str6);
        } else {
          be.b(paramActivity, arrayOfString1, arrayOfString2, arrayOfString3, str5, str6);
        }
      }
    }
    catch (Exception localException) {}
    return false;
    return true;
  }
  
  static boolean c(Activity paramActivity, String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return false;
      try
      {
        String str1 = paramString.trim();
        if ((str1.indexOf("loc:") == 0) && (str1.length() > "loc:".length()))
        {
          b localb = new b(j.a(str1.substring("loc:".length()), "&"));
          String str2 = (String)localb.a(0, null);
          String str3 = (String)localb.a(1, null);
          String str4 = (String)localb.a(2, "A");
          String str5 = (String)localb.a(3, "");
          if ((str2 != null) && (str3 != null))
          {
            be.a(paramActivity, str3, str2, str4, str5);
            return false;
          }
        }
      }
      catch (Exception localException) {}
    }
    return false;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.z
 * JD-Core Version:    0.7.0.1
 */