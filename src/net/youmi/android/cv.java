package net.youmi.android;

import android.net.Uri;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class cv
{
  static final Pattern a = Pattern.compile("filename=\"(.*?)\"");
  static final Pattern b = Pattern.compile("filename='(.*?)'");
  
  static String a(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return null;
      try
      {
        Matcher localMatcher1 = a.matcher(paramString);
        if (localMatcher1.find()) {
          return localMatcher1.group(localMatcher1.groupCount());
        }
        Matcher localMatcher2 = b.matcher(paramString);
        if (localMatcher2.find())
        {
          String str = localMatcher2.group(localMatcher2.groupCount());
          return str;
        }
      }
      catch (Exception localException) {}
    }
    return null;
  }
  
  static String b(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return null;
      try
      {
        Uri localUri = Uri.parse(paramString);
        if (localUri != null)
        {
          String str1 = localUri.getPath();
          int i = str1.lastIndexOf('/');
          if (i > -1)
          {
            String str2 = str1.substring(i + 1);
            return str2;
          }
        }
      }
      catch (Exception localException) {}
    }
    return null;
  }
  
  static String c(String paramString)
  {
    if (paramString == null) {}
    for (;;)
    {
      return null;
      try
      {
        Matcher localMatcher = Pattern.compile("<meta.*content.*text/html;.*charset=(.*?)\"|'.*/>", 2).matcher(paramString);
        if (localMatcher.find())
        {
          String str = localMatcher.group(localMatcher.groupCount());
          return str;
        }
      }
      catch (Exception localException) {}
    }
    return null;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cv
 * JD-Core Version:    0.7.0.1
 */