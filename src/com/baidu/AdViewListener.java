package com.baidu;

public abstract interface AdViewListener
{
  public abstract void onAdSwitch();
  
  public abstract void onReceiveFail(FailReason paramFailReason);
  
  public abstract void onReceiveSuccess();
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.AdViewListener
 * JD-Core Version:    0.7.0.1
 */