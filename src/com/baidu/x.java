package com.baidu;

class x
  implements s
{
  x(AdView paramAdView) {}
  
  public void a()
  {
    bk.b("adRequestStart");
  }
  
  public void a(Exception paramException, FailReason paramFailReason)
  {
    bk.b("adRequestException");
    AdView.a(this.a).onReceiveFail(paramFailReason);
  }
  
  public void a(boolean paramBoolean)
  {
    bk.b("adRequestSuccess refreshNow", paramBoolean + "");
    if (paramBoolean) {
      AdView.b(this.a);
    }
    AdView.a(this.a).onReceiveSuccess();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.x
 * JD-Core Version:    0.7.0.1
 */