package net.youmi.android;

import java.net.URLDecoder;

class ap
{
  static String a(String paramString)
  {
    try
    {
      if (paramString.indexOf("%20") > -1) {
        paramString = paramString.replace("%20", "+");
      }
      String str = URLDecoder.decode(paramString, "UTF-8");
      return str;
    }
    catch (Exception localException) {}
    return "";
  }
  
  static String a(String paramString1, String paramString2)
  {
    int i = 0;
    StringBuffer localStringBuffer1 = new StringBuffer();
    StringBuffer localStringBuffer2 = new StringBuffer();
    for (;;)
    {
      try
      {
        String str1 = cq.b(paramString2);
        str2 = cq.b(str1.substring(12)) + cq.b(str1.substring(0, 20));
        j = str2.length();
        int k = paramString1.length();
        m = 0;
        if (i < k) {
          continue;
        }
      }
      catch (Exception localException)
      {
        String str2;
        int j;
        int m;
        continue;
      }
      return localStringBuffer1.toString();
      localStringBuffer2.delete(0, localStringBuffer2.length());
      localStringBuffer2.append(paramString1.charAt(i));
      localStringBuffer2.append(paramString1.charAt(i + 1));
      localStringBuffer1.append((char)((char)Integer.valueOf(localStringBuffer2.toString(), 16).intValue() ^ str2.charAt(m)));
      m = (m + 1) % j;
      i += 2;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ap
 * JD-Core Version:    0.7.0.1
 */