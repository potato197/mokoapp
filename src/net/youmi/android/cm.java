package net.youmi.android;

class cm
  implements Runnable
{
  cm(AdView paramAdView) {}
  
  public void run()
  {
    try
    {
      if (AdView.a(this.a) != null) {
        AdView.a(this.a).onConnectFailed(this.a);
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cm
 * JD-Core Version:    0.7.0.1
 */