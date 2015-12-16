package cn.domob.android.ads;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import cn.domob.android.a.a;
import java.util.ArrayList;
import java.util.Hashtable;

public final class e
  extends BroadcastReceiver
{
  private static boolean a = false;
  
  public static void a(Context paramContext)
  {
    if (a == true) {}
    do
    {
      return;
      a = true;
      e locale = new e();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.PACKAGE_ADDED");
      localIntentFilter.addDataScheme("package");
      paramContext.getApplicationContext().registerReceiver(locale, localIntentFilter);
    } while (!Log.isLoggable("DomobSDK", 3));
    Log.i("DomobSDK", "register receiver done");
  }
  
  private static void a(Context paramContext, int paramInt, String paramString)
  {
    q localq = new q(paramContext);
    localq.getClass();
    q.a locala = new q.a(localq);
    locala.a = paramInt;
    locala.b = 2;
    locala.c = new ArrayList();
    locala.c.add(paramString);
    locala.d = g.d();
    if ((paramInt == 7) && (g.a.containsKey(paramString))) {
      locala.d = ((String)g.a.get(paramString));
    }
    localq.a(locala);
  }
  
  public static void a(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public static boolean a()
  {
    return a;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1 = paramIntent.getAction();
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.i("DomobSDK", paramIntent.toString());
    }
    PackageManager localPackageManager;
    if ("android.intent.action.PACKAGE_ADDED".equals(str1)) {
      localPackageManager = paramContext.getPackageManager();
    }
    try
    {
      String str2 = localPackageManager.getPackageInfo(paramIntent.getDataString().substring(8), 0).packageName;
      if (g.c())
      {
        a(paramContext, 8, str2);
        Intent localIntent = localPackageManager.getLaunchIntentForPackage(str2);
        localIntent.setFlags(268435456);
        paramContext.startActivity(localIntent);
      }
      for (;;)
      {
        a = false;
        paramContext.unregisterReceiver(this);
        return;
        a(paramContext, 7, str2);
        Integer localInteger = (Integer)a.b.get(str2);
        if (localInteger != null)
        {
          a.b.get(str2);
          ((NotificationManager)paramContext.getSystemService("notification")).cancel(localInteger.intValue());
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.e
 * JD-Core Version:    0.7.0.1
 */