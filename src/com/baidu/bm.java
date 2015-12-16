package com.baidu;

import android.telephony.PhoneStateListener;

class bm
  extends PhoneStateListener
{
  private l a;
  
  private l a()
  {
    return this.a;
  }
  
  public void a(l paraml)
  {
    this.a = paraml;
  }
  
  public void onCallStateChanged(int paramInt, String paramString)
  {
    super.onCallStateChanged(paramInt, paramString);
    switch (paramInt)
    {
    default: 
    case 0: 
    case 2: 
      do
      {
        return;
        try
        {
          bk.b("CALL_STATE_IDLE");
          return;
        }
        catch (Exception localException)
        {
          bk.a("onCallStateChanged", localException);
          return;
        }
        bk.b(String.format("CALL_STATE_OFFHOOK in:%s", new Object[] { paramString }));
      } while ((a() == null) || ((paramString != null) && (!paramString.equals(""))));
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = a().h().getPhone();
      bk.b(String.format("CALL_STATE_OFFHOOK in:%s adcon:%s", arrayOfObject));
      a().e();
      a(null);
      return;
    }
    bk.b("CALL_STATE_RINGING");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.bm
 * JD-Core Version:    0.7.0.1
 */