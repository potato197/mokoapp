package com.baidu;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

class al
  implements View.OnClickListener
{
  al(aj paramaj) {}
  
  public void onClick(View paramView)
  {
    try
    {
      if (!"mounted".equals(Environment.getExternalStorageState()))
      {
        AppActivity.d(this.a.b).post(new am(this));
        return;
      }
      bk.b("action.onClick [to download]");
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(AppActivity.b(this.a.b).c()));
      localIntent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
      this.a.b.startActivity(localIntent);
      as.a().a(AppActivity.b(this.a.b));
      return;
    }
    catch (Exception localException)
    {
      bk.a(localException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.al
 * JD-Core Version:    0.7.0.1
 */