package cn.domob.android.ads;

public abstract interface DomobAdListener
{
  public abstract void onFailedToReceiveFreshAd(DomobAdView paramDomobAdView);
  
  public abstract void onLandingPageClose();
  
  public abstract void onLandingPageOpening();
  
  public abstract void onReceivedFreshAd(DomobAdView paramDomobAdView);
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.DomobAdListener
 * JD-Core Version:    0.7.0.1
 */