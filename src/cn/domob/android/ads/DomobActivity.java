package cn.domob.android.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import cn.domob.android.a.a;
import cn.domob.android.a.c;
import java.util.Hashtable;

public class DomobActivity
  extends Activity
{
  private Context a = this;
  private String b = "";
  
  public static void a(Context paramContext)
  {
    if (e.a() == true) {}
    do
    {
      return;
      e.a(true);
      e locale = new e();
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.PACKAGE_ADDED");
      localIntentFilter.addDataScheme("package");
      paramContext.getApplicationContext().registerReceiver(locale, localIntentFilter);
    } while (!Log.isLoggable("DomobSDK", 3));
    Log.i("DomobSDK", "register receiver done");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    switch (getIntent().getIntExtra("DomobActivityType", 0))
    {
    default: 
      finish();
    case 2: 
      String str1;
      String str2;
      do
      {
        do
        {
          return;
          super.onCreate(paramBundle);
        } while (getIntent().getExtras() == null);
        Intent localIntent = getIntent();
        str1 = localIntent.getStringExtra("appName");
        this.b = localIntent.getStringExtra("appId");
        str2 = localIntent.getStringExtra("actType");
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", str2 + " is showing");
        }
      } while ((str2 == null) || (!str2.equals("typeCancel")));
      new AlertDialog.Builder(this.a).setTitle("取消").setMessage(str1 + "正在下载是否取消?").setNegativeButton("取消下载", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          a locala = (a)a.a.get(DomobActivity.a(DomobActivity.this));
          if (locala != null)
          {
            locala.b();
            c localc = locala.a();
            if (localc != null) {
              localc.c();
            }
          }
          DomobActivity.this.finish();
        }
      }).setPositiveButton("继续下载", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          DomobActivity.this.finish();
        }
      }).show();
      return;
    }
    setTheme(16973835);
    super.onCreate(paramBundle);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.DomobActivity
 * JD-Core Version:    0.7.0.1
 */