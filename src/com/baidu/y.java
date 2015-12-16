package com.baidu;

class y
  implements AdViewListener
{
  y(AdView paramAdView) {}
  
  public void onAdSwitch()
  {
    bk.b("AdViewListener.onAdSwitch");
  }
  
  public void onReceiveFail(FailReason paramFailReason)
  {
    bk.b("AdViewListener.onReceiveFail", paramFailReason.getValue());
  }
  
  public void onReceiveSuccess()
  {
    bk.b("AdViewListener.onReceiveSuccess");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.y
 * JD-Core Version:    0.7.0.1
 */