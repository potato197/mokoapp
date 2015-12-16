package com.baidu;

import android.content.Context;
import android.content.Intent;
import java.util.Map;

class ar
  extends bn
{
  public ar(AdView paramAdView)
  {
    super(paramAdView);
  }
  
  private void m()
  {
    try
    {
      bk.b("AppAdContainer.toShop");
      Intent localIntent = new Intent();
      localIntent.setClass(getContext(), AppActivity.class);
      localIntent.putExtra("curl", h().getClickURL());
      localIntent.putExtra("clklogurl", h().h());
      localIntent.putExtra("surl", h().getSURL());
      localIntent.putExtra("tit", h().getTitle());
      localIntent.putExtra("desc", h().getDescription());
      localIntent.putExtra("ad_charge", h().o());
      localIntent.putExtra("limg", h().a());
      getContext().startActivity(localIntent);
      c().put(ay.b, Integer.valueOf(1 + ((Integer)c().get(ay.b)).intValue()));
      as.a().a(getContext());
      return;
    }
    catch (Exception localException)
    {
      bk.a(localException);
    }
  }
  
  public void a(Context paramContext)
  {
    bk.b("AppAdContainer.clicked");
    m();
  }
  
  public void b(Context paramContext)
  {
    bk.b("AppAdContainer.phoned");
    m();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.ar
 * JD-Core Version:    0.7.0.1
 */