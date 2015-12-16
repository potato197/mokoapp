package com.baidu;

import org.json.JSONException;
import org.json.JSONObject;

class i
  extends Thread
{
  i(c paramc, boolean paramBoolean) {}
  
  public void run()
  {
    synchronized (c.a(this.b))
    {
      try
      {
        c.a(this.b).put("hangup", this.a);
        c.c(this.b);
        bk.b("AdCache.setHangup", this.a + "");
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          bk.a("AdCache.setHangup", localJSONException);
        }
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.i
 * JD-Core Version:    0.7.0.1
 */