package com.baidu;

import org.json.JSONException;
import org.json.JSONObject;

class j
  extends Thread
{
  j(c paramc, boolean paramBoolean) {}
  
  public void run()
  {
    synchronized (c.a(this.b))
    {
      try
      {
        c.a(this.b).put("stopped", this.a);
        c.c(this.b);
        bk.b("AdCache.setStopped", this.a + "");
        return;
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          bk.a("AdCache.setStopped", localJSONException);
        }
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.j
 * JD-Core Version:    0.7.0.1
 */