package cn.domob.android.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class t
{
  private static String a = null;
  
  protected static String a(Context paramContext)
  {
    StringBuffer localStringBuffer;
    if (a == null)
    {
      localStringBuffer = new StringBuffer();
      localStringBuffer.append("android");
      localStringBuffer.append(",");
      localStringBuffer.append(",");
      if (Build.VERSION.RELEASE.length() <= 0) {
        break label208;
      }
      localStringBuffer.append(Build.VERSION.RELEASE.replaceAll(",", "_"));
    }
    for (;;)
    {
      localStringBuffer.append(",");
      localStringBuffer.append(",");
      String str1 = Build.MODEL;
      if (str1.length() > 0) {
        localStringBuffer.append(str1.replaceAll(",", "_"));
      }
      localStringBuffer.append(",");
      String str2 = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
      if (str2 != null) {
        localStringBuffer.append(str2.replaceAll(",", "_"));
      }
      localStringBuffer.append(",");
      localStringBuffer.append(",");
      localStringBuffer.append(",");
      a = localStringBuffer.toString();
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "getUserAgent:" + a);
      }
      return a;
      label208:
      localStringBuffer.append("1.5");
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    new AlertDialog.Builder(paramContext).setTitle(paramString1).setMessage(paramString2).setNegativeButton("确定", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    }).show();
  }
  
  protected static void a(String paramString)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", paramString);
    }
  }
  
  public static String b(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return "";
    }
    for (;;)
    {
      int j;
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
        localMessageDigest.reset();
        localMessageDigest.update(paramString.getBytes("UTF-8"));
        byte[] arrayOfByte = localMessageDigest.digest();
        localStringBuilder = new StringBuilder();
        int i = arrayOfByte.length;
        j = 0;
        if (j < i)
        {
          String str1 = Integer.toHexString(0xFF & arrayOfByte[j]);
          if (str1.length() == 1) {
            localStringBuilder.append("0").append(str1);
          } else {
            localStringBuilder.append(str1);
          }
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        StringBuilder localStringBuilder;
        return "";
        String str2 = localStringBuilder.toString();
        return str2;
      }
      catch (Exception localException)
      {
        continue;
      }
      j++;
    }
  }
  
  public static boolean c(String paramString)
  {
    return Pattern.compile("[0-9]*").matcher(paramString).matches();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.t
 * JD-Core Version:    0.7.0.1
 */