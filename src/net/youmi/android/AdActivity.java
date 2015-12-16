package net.youmi.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;

public final class AdActivity
  extends Activity
{
  cu a;
  private ff b;
  private ca c;
  
  static Intent a(Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext.getPackageName(), AdActivity.class.getName());
    localIntent.putExtra("D780FBF4215247bcBB1AC0AD33C474FE", "FEDC335110C04414AF100EA25C26A70D");
    return localIntent;
  }
  
  static void a(Activity paramActivity)
  {
    Intent localIntent = new Intent(paramActivity, AdActivity.class);
    localIntent.putExtra("D780FBF4215247bcBB1AC0AD33C474FE", "FD7C4B12A60F415dBE8C580A137F5F1C");
    paramActivity.startActivity(localIntent);
  }
  
  static void a(Activity paramActivity, String[] paramArrayOfString, String paramString1, String paramString2)
  {
    if (paramArrayOfString == null) {}
    for (;;)
    {
      return;
      try
      {
        if (paramArrayOfString.length != 0)
        {
          Intent localIntent = new Intent(paramActivity, AdActivity.class);
          localIntent.putExtra("D780FBF4215247bcBB1AC0AD33C474FE", "DB9C288EF60A40d4897665843327626E");
          localIntent.putExtra("EB80F3291A8E469c962CA133BDC549D7", paramArrayOfString);
          localIntent.putExtra("172C94EDC717477aBF600D7898A64A8E", paramString1);
          localIntent.putExtra("D50EF1926ADD471892E72BCE6D7E032C", paramString2);
          paramActivity.startActivity(localIntent);
          return;
        }
      }
      catch (Exception localException) {}
    }
  }
  
  private void b()
  {
    Intent localIntent = getIntent();
    String str1 = localIntent.getStringExtra("D780FBF4215247bcBB1AC0AD33C474FE");
    if (str1.equals("A821718FB7F248b590F3721F6576D289"))
    {
      this.b = new ex(this, this.c);
      requestWindowFeature(2);
      setProgressBarIndeterminate(false);
      setContentView(this.b.b());
      return;
    }
    cu localcu;
    if (str1.equals("FD7C4B12A60F415dBE8C580A137F5F1C"))
    {
      localcu = dp.a;
      if (localcu != null)
      {
        this.a = localcu;
        switch (localcu.a())
        {
        }
      }
    }
    while (str1.equals("FEDC335110C04414AF100EA25C26A70D"))
    {
      setTitle("下载管理");
      this.b = new fg(this, this.c);
      setContentView(this.b.b());
      return;
      if (localcu.i() == null)
      {
        a();
      }
      else
      {
        ex localex = new ex(this, this.c);
        requestWindowFeature(2);
        setProgressBarIndeterminate(false);
        this.b = localex;
        setContentView(this.b.b());
        localex.a(localcu.i());
        return;
      }
    }
    if (str1.equals("DB9C288EF60A40d4897665843327626E"))
    {
      String[] arrayOfString = localIntent.getStringArrayExtra("EB80F3291A8E469c962CA133BDC549D7");
      if ((arrayOfString != null) && (arrayOfString.length > 0))
      {
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        String str2 = localIntent.getStringExtra("172C94EDC717477aBF600D7898A64A8E");
        String str3 = localIntent.getStringExtra("D50EF1926ADD471892E72BCE6D7E032C");
        this.b = new cf(this, this.c, arrayOfString, str2, str3);
        setContentView(this.b.b());
        return;
      }
    }
    a();
  }
  
  static void b(Activity paramActivity)
  {
    Intent localIntent = new Intent(paramActivity, AdActivity.class);
    localIntent.putExtra("D780FBF4215247bcBB1AC0AD33C474FE", "FEDC335110C04414AF100EA25C26A70D");
    paramActivity.startActivity(localIntent);
  }
  
  void a()
  {
    try
    {
      finish();
      return;
    }
    catch (Exception localException) {}
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.c = ca.a(this);
    b();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      try
      {
        if (this.b != null)
        {
          this.b.b_();
          return true;
        }
      }
      catch (Exception localException) {}
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.AdActivity
 * JD-Core Version:    0.7.0.1
 */