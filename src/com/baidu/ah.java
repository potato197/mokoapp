package com.baidu;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.widget.ImageView;
import java.util.List;
import org.json.JSONObject;

class ah
  extends Thread
{
  ah(AppActivity paramAppActivity, Activity paramActivity) {}
  
  public void run()
  {
    try
    {
      AppActivity.a(this.b, true);
      String str = this.b.getIntent().getStringExtra("curl");
      bk.b("fetch app detail: " + str);
      AppActivity.a(this.b, App.a(this.a, this.b.getIntent().getStringExtra("clklogurl"), new JSONObject(w.d(AppActivity.a(this.b).getContext(), str))));
      if (!AppActivity.a().contains(AppActivity.b(this.b))) {
        AppActivity.a().add(AppActivity.b(this.b));
      }
      AppActivity.d(this.b).post(new ai(this));
      AppActivity.a(this.b, false);
      return;
    }
    catch (Exception localException)
    {
      AppActivity.a(this.b, false);
      bk.a(localException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.ah
 * JD-Core Version:    0.7.0.1
 */