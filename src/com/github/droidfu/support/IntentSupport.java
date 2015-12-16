package com.github.droidfu.support;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.List;
import java.util.Locale;

public class IntentSupport
{
  public static final String MIME_TYPE_EMAIL = "message/rfc822";
  public static final String MIME_TYPE_TEXT = "text/*";
  
  public static boolean isIntentAvailable(Context paramContext, Intent paramIntent)
  {
    return !paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536).isEmpty();
  }
  
  public static boolean isIntentAvailable(Context paramContext, String paramString1, Uri paramUri, String paramString2)
  {
    if (paramUri != null) {}
    for (Intent localIntent = new Intent(paramString1, paramUri);; localIntent = new Intent(paramString1))
    {
      if (paramString2 != null) {
        localIntent.setType(paramString2);
      }
      if (paramContext.getPackageManager().queryIntentActivities(localIntent, 65536).isEmpty()) {
        break;
      }
      return true;
    }
    return false;
  }
  
  public static boolean isIntentAvailable(Context paramContext, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(paramString1);
    if (paramString2 != null) {
      localIntent.setType(paramString2);
    }
    return !paramContext.getPackageManager().queryIntentActivities(localIntent, 65536).isEmpty();
  }
  
  public static Intent newEmailIntent(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.putExtra("android.intent.extra.EMAIL", new String[] { paramString1 });
    localIntent.putExtra("android.intent.extra.TEXT", paramString3);
    localIntent.putExtra("android.intent.extra.SUBJECT", paramString2);
    localIntent.setType("message/rfc822");
    return localIntent;
  }
  
  public static Intent newMapsIntent(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("geo:0,0?q=");
    localStringBuilder.append(Uri.encode(paramString1));
    localStringBuilder.append(Uri.encode("(" + paramString2 + ")"));
    localStringBuilder.append("&hl=" + Locale.getDefault().getLanguage());
    return new Intent("android.intent.action.VIEW", Uri.parse(localStringBuilder.toString()));
  }
  
  public static Intent newShareIntent(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.putExtra("android.intent.extra.TEXT", paramString2);
    localIntent.putExtra("android.intent.extra.SUBJECT", paramString1);
    localIntent.setType("text/*");
    return Intent.createChooser(localIntent, paramString3);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.support.IntentSupport
 * JD-Core Version:    0.7.0.1
 */