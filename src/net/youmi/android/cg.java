package net.youmi.android;

import android.app.Activity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

class cg
  extends WebChromeClient
{
  cg(aw paramaw) {}
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    super.onProgressChanged(paramWebView, paramInt);
    this.a.a(paramInt);
  }
  
  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    super.onReceivedTitle(paramWebView, paramString);
    try
    {
      if (this.a.b != null) {
        this.a.b.setTitle(paramString);
      }
      return;
    }
    catch (Exception localException)
    {
      f.a(localException);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cg
 * JD-Core Version:    0.7.0.1
 */