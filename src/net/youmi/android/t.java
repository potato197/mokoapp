package net.youmi.android;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class t
  implements View.OnClickListener
{
  t(cf paramcf) {}
  
  public void onClick(View paramView)
  {
    try
    {
      if (cf.b(this.a) == null) {
        return;
      }
      File localFile = new File(cf.b(this.a).a);
      if (localFile.exists())
      {
        Intent localIntent = new Intent("android.intent.action.SEND");
        localIntent.putExtra("android.intent.extra.STREAM", Uri.fromFile(localFile));
        if (cf.b(this.a).d != null)
        {
          localIntent.setType(cf.b(this.a).d);
          if (cf.f(this.a) != null)
          {
            localIntent.putExtra("android.intent.extra.SUBJECT", cf.f(this.a));
            if (cf.g(this.a) == null) {
              break label195;
            }
            localIntent.putExtra("android.intent.extra.TEXT", cf.f(this.a) + " " + cf.g(this.a));
          }
        }
        for (;;)
        {
          this.a.a.startActivity(Intent.createChooser(localIntent, "分享图片"));
          return;
          localIntent.setType("image/jpeg");
          break;
          label195:
          localIntent.putExtra("android.intent.extra.TEXT", cf.f(this.a));
        }
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.t
 * JD-Core Version:    0.7.0.1
 */