package com.google.ads;

public class AdSize
{
  public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
  public static final AdSize IAB_BANNER = new AdSize(468, 60, "468x60_as");
  public static final AdSize IAB_LEADERBOARD = new AdSize(728, 90, "728x90_as");
  public static final AdSize IAB_MRECT = new AdSize(300, 250, "300x250_as");
  private int a;
  private int b;
  private String c;
  
  public AdSize(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, null);
  }
  
  private AdSize(int paramInt1, int paramInt2, String paramString)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramString;
  }
  
  public int getHeight()
  {
    return this.b;
  }
  
  public int getWidth()
  {
    return this.a;
  }
  
  public String toString()
  {
    return this.c;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.AdSize
 * JD-Core Version:    0.7.0.1
 */