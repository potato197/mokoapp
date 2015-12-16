package com.guohead.sdk;

public abstract interface GuoheAdStateListener
{
  public abstract void onClick();
  
  public abstract void onFail();
  
  public abstract void onReceiveAd();
  
  public abstract void onRefreshAd();
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.GuoheAdStateListener
 * JD-Core Version:    0.7.0.1
 */