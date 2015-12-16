package com.guohead.sdk.adapters;

import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;
import java.lang.reflect.Method;

public class EventAdapter
  extends GuoheAdAdapter
{
  public EventAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void finish() {}
  
  public void handle()
  {
    Logger.d("Event notification request initiated");
    String str2;
    Class localClass;
    if (this.guoheAdLayout.guoheAdInterface != null)
    {
      String str1 = this.ration.key;
      if (str1 == null) {
        Logger.w("Event key is null");
      }
      int i = str1.indexOf("|;|");
      if (i < 0) {
        Logger.w("Event key separator not found");
      }
      str2 = str1.substring(i + 3);
      localClass = this.guoheAdLayout.guoheAdInterface.getClass();
    }
    for (;;)
    {
      try
      {
        localClass.getMethod(str2, (Class[])null).invoke(this.guoheAdLayout.guoheAdInterface, (Object[])null);
        this.guoheAdLayout.guoheAdManager.resetRollover();
        this.guoheAdLayout.rotateThreadedDelayed();
        return;
      }
      catch (Exception localException)
      {
        Logger.e("Caught exception in handle() at EventAdapter" + localException);
        continue;
      }
      Logger.w("Event notification would be sent, but no interface is listening");
    }
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.rotateThreadedNow();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.EventAdapter
 * JD-Core Version:    0.7.0.1
 */