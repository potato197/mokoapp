package com.baidu;

import android.os.Handler;
import android.os.Looper;
import org.json.JSONObject;

class z
  extends Thread
{
  z(AdView paramAdView1, AdView paramAdView2) {}
  
  public void run()
  {
    
    try
    {
      AdView.a(this.b, c.a().g() + "/cpro/ui/mads.php");
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = "http://mpro.baidu.com/ex/dispatch.html";
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = r.b(this.b.getContext());
      arrayOfObject2[1] = r.a(this.b.getContext());
      arrayOfObject1[1] = ax.a(String.format("q=%s&appid=%s", arrayOfObject2));
      String str1 = String.format("%s?code=%s", arrayOfObject1);
      bk.b("dispatcher", str1);
      String str2 = w.a(this.a.getContext(), str1, 10000, 10000);
      bk.b("dispatcher", str2);
      JSONObject localJSONObject = new JSONObject(str2);
      int i = localJSONObject.optInt("type");
      if (i < 0) {
        return;
      }
      if (i == 1)
      {
        AdView.a(this.b, localJSONObject.getString("requrl"));
        AdView.a(this.b, t.c);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bk.a(localException);
      }
    }
    AdView.e(this.b).post(new aa(this));
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.z
 * JD-Core Version:    0.7.0.1
 */