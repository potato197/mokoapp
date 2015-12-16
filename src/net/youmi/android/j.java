package net.youmi.android;

import java.util.ArrayList;

class j
{
  static char a(String paramString)
  {
    if (paramString.equals("0000")) {}
    do
    {
      return '0';
      if (paramString.equals("0001")) {
        return '1';
      }
      if (paramString.equals("0010")) {
        return '2';
      }
      if (paramString.equals("0011")) {
        return '3';
      }
      if (paramString.equals("0100")) {
        return '4';
      }
      if (paramString.equals("0101")) {
        return '5';
      }
      if (paramString.equals("0110")) {
        return '6';
      }
      if (paramString.equals("0111")) {
        return '7';
      }
      if (paramString.equals("1000")) {
        return '8';
      }
      if (paramString.equals("1001")) {
        return '9';
      }
      if (paramString.equals("1010")) {
        return 'a';
      }
      if (paramString.equals("1011")) {
        return 'b';
      }
      if (paramString.equals("1100")) {
        return 'c';
      }
      if (paramString.equals("1101")) {
        return 'd';
      }
      if (paramString.equals("1110")) {
        return 'e';
      }
    } while (!paramString.equals("1111"));
    return 'f';
  }
  
  static String a(char paramChar)
  {
    switch (paramChar)
    {
    default: 
      return "0000";
    case '0': 
      return "0000";
    case '1': 
      return "0001";
    case '2': 
      return "0010";
    case '3': 
      return "0011";
    case '4': 
      return "0100";
    case '5': 
      return "0101";
    case '6': 
      return "0110";
    case '7': 
      return "0111";
    case '8': 
      return "1000";
    case '9': 
      return "1001";
    case 'a': 
      return "1010";
    case 'b': 
      return "1011";
    case 'c': 
      return "1100";
    case 'd': 
      return "1101";
    case 'e': 
      return "1110";
    }
    return "1111";
  }
  
  static String a(StringBuilder paramStringBuilder, int paramInt)
  {
    int i = 0;
    if (paramStringBuilder == null) {
      return "";
    }
    int j = paramInt * 4;
    for (;;)
    {
      try
      {
        if (paramStringBuilder.length() > 0)
        {
          StringBuilder localStringBuilder;
          String str;
          if (paramStringBuilder.length() > j)
          {
            paramStringBuilder.delete(0, paramStringBuilder.length() - j);
            localStringBuilder = new StringBuilder(paramInt);
            str = paramStringBuilder.toString();
            if (i >= j) {
              return localStringBuilder.toString();
            }
          }
          else
          {
            if (paramStringBuilder.length() >= j) {
              continue;
            }
            int m = j - paramStringBuilder.length();
            int n = 0;
            if (n < m)
            {
              paramStringBuilder.insert(0, '0');
              n++;
              continue;
            }
            continue;
            if (k < j)
            {
              paramStringBuilder.append('0');
              k++;
              continue;
            }
            continue;
          }
          if (paramStringBuilder.length() >= i + 4) {
            localStringBuilder.append(a(str.substring(i, i + 4)));
          }
          i += 4;
          continue;
        }
        int k = 0;
      }
      catch (Exception localException)
      {
        return "";
      }
    }
  }
  
  static StringBuilder a(String paramString, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder(32);
    String str2;
    ArrayList localArrayList;
    int n;
    int i1;
    if (paramString != null)
    {
      String str1 = paramString.trim();
      if (str1.length() > 0)
      {
        str2 = str1.toLowerCase();
        int m = str2.length();
        localArrayList = new ArrayList(m);
        n = m - 1;
        if (n >= 0) {
          break label107;
        }
        i1 = -1 + localArrayList.size();
        label73:
        if (i1 >= 0) {
          break label129;
        }
      }
    }
    if (localStringBuilder.length() > 0) {
      if (localStringBuilder.length() > paramInt) {
        localStringBuilder.delete(0, localStringBuilder.length() - paramInt);
      }
    }
    for (;;)
    {
      return localStringBuilder;
      label107:
      localArrayList.add(a(str2.charAt(n)));
      n--;
      break;
      label129:
      localStringBuilder.append((String)localArrayList.get(i1));
      i1--;
      break label73;
      if (localStringBuilder.length() < paramInt)
      {
        int j = paramInt - localStringBuilder.length();
        for (int k = 0; k < j; k++) {
          localStringBuilder.insert(0, '0');
        }
        continue;
        for (int i = 0; i < paramInt; i++) {
          localStringBuilder.append('0');
        }
      }
    }
  }
  
  static String[] a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {}
    while (paramString2 == null) {
      return null;
    }
    return paramString1.split(paramString2);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.j
 * JD-Core Version:    0.7.0.1
 */