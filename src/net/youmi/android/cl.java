package net.youmi.android;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class cl
  extends WebViewClient
{
  cl(aw paramaw) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    try
    {
      boolean bool3 = be.f(this.a.b, paramString);
      if (bool3) {
        return true;
      }
    }
    catch (Exception localException1)
    {
      f.a(localException1);
    }
    for (;;)
    {
      for (;;)
      {
        String str;
        try
        {
          boolean bool2 = be.d(this.a.b, paramString);
          if (bool2) {
            break;
          }
        }
        catch (Exception localException2)
        {
          boolean bool1;
          Intent localIntent;
          Activity localActivity;
          aw localaw;
          f.a(localException2);
          continue;
        }
        try
        {
          bool1 = be.e(this.a.b, paramString);
          if (bool1) {
            break;
          }
        }
        catch (Exception localException3)
        {
          f.a(localException3);
          continue;
          str = null;
        }
      }
      try
      {
        if (paramString.toLowerCase().indexOf("market://") > -1)
        {
          localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
          this.a.b.startActivity(localIntent);
          return true;
        }
      }
      catch (Exception localException4)
      {
        f.a(localException4);
      }
    }
    try
    {
      localActivity = this.a.b;
      localaw = this.a;
      if (this.a.c != null)
      {
        str = this.a.c.f();
        new i(localActivity, localaw, str).execute(new String[] { paramString });
        return true;
      }
    }
    catch (Exception localException5)
    {
      f.a(localException5);
      return true;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cl
 * JD-Core Version:    0.7.0.1
 */