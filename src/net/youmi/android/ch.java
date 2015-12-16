package net.youmi.android;

class ch
  implements Runnable
{
  ch(AdView paramAdView) {}
  
  public void run()
  {
    try
    {
      if (AdView.a(this.a) != null) {
        AdView.a(this.a).onAdViewSwitchedAd(this.a);
      }
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.ch
 * JD-Core Version:    0.7.0.1
 */