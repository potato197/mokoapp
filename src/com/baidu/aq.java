package com.baidu;

import android.app.ProgressDialog;

class aq
  implements Runnable
{
  aq(AppActivity paramAppActivity, boolean paramBoolean) {}
  
  public void run()
  {
    if (this.a)
    {
      AppActivity.n(this.b).show();
      return;
    }
    AppActivity.n(this.b).dismiss();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.aq
 * JD-Core Version:    0.7.0.1
 */