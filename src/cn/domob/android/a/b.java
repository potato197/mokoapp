package cn.domob.android.a;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.io.File;
import java.util.Hashtable;

final class b
  extends Handler
{
  b(a parama) {}
  
  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if ((paramMessage.what - a.a(this.a) < 5) && (paramMessage.what != 100)) {}
    do
    {
      return;
      a.a(this.a, paramMessage.what);
      a.b(this.a, paramMessage.what);
      a.d(this.a).setLatestEventInfo(a.c(), a.b(this.a) + "正在下载", "已下载" + paramMessage.what + "%", a.c(this.a));
      a.f(this.a).notify(a.e(this.a), a.d(this.a));
    } while (a.g(this.a) != 100);
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", a.b(this.a) + " download success");
    }
    File localFile1 = new File(a.h(this.a));
    if (a.h(this.a).endsWith(".temp"))
    {
      a.a(this.a, a.h(this.a).substring(0, a.h(this.a).length() - ".temp".length()));
      File localFile2 = new File(a.h(this.a));
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", a.b(this.a) + "FileName change to " + localFile2);
      }
      localFile1.renameTo(localFile2);
    }
    a.a.remove(a.i(this.a));
    if (a.j(this.a) != null)
    {
      c localc = a.j(this.a);
      a.h(this.a);
      localc.b();
    }
    a.b(this.a, 0);
    a.d(this.a).icon = 17301634;
    a.d(this.a).tickerText = (a.b(this.a) + "下载完毕");
    a.d(this.a).flags = 16;
    Intent localIntent1 = a.a(a.h(this.a));
    a.a(this.a, PendingIntent.getActivity(a.c(), a.e(this.a), localIntent1, 134217728));
    a.d(this.a).setLatestEventInfo(a.c(), a.b(this.a) + "下载完毕", "", a.c(this.a));
    a.f(this.a).notify(a.e(this.a), a.d(this.a));
    Intent localIntent2 = a.a(a.h(this.a));
    localIntent2.addFlags(268435456);
    a.c().startActivity(localIntent2);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.a.b
 * JD-Core Version:    0.7.0.1
 */