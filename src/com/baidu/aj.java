package com.baidu;

import android.app.Activity;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;

class aj
  implements Runnable
{
  aj(AppActivity paramAppActivity, Activity paramActivity) {}
  
  public void run()
  {
    AppActivity.e(this.b).setText(AppActivity.b(this.b).j());
    if (AppActivity.b(this.b).e() != null) {
      AppActivity.a(this.b).setImageBitmap(AppActivity.b(this.b).e());
    }
    AppActivity.f(this.b).setText("已下载 " + AppActivity.b(this.b).d());
    AppActivity.g(this.b).setText(AppActivity.b(this.b).k());
    TextView localTextView = AppActivity.h(this.b);
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = AppActivity.b(this.b).g();
    arrayOfObject[1] = AppActivity.b(this.b).l();
    arrayOfObject[2] = AppActivity.b(this.b).h();
    arrayOfObject[3] = AppActivity.b(this.b).i();
    arrayOfObject[4] = AppActivity.b(this.b).m();
    localTextView.setText(String.format("开发者：%s\n版本：%s\n发布日期：%s\nAPP大小：%s\n类别：%s", arrayOfObject));
    AppActivity.i(this.b).setText("   ");
    AppActivity.j(this.b).setEnabled(false);
    if (as.a().d(AppActivity.b(this.b))) {
      AppActivity.i(this.b).append("应用已安装");
    }
    while (AppActivity.b(this.b).a().size() > 0)
    {
      AppActivity.k(this.b).setVisibility(0);
      AppActivity.l(this.b).removeAllViews();
      Iterator localIterator = AppActivity.b(this.b).a().iterator();
      while (localIterator.hasNext())
      {
        App.Snag localSnag = (App.Snag)localIterator.next();
        ImageView localImageView = new ImageView(this.a);
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(135, 67);
        if (AppActivity.b(this.b).a().indexOf(localSnag) != -1 + AppActivity.b(this.b).a().size()) {
          localLayoutParams.setMargins(0, 0, 17, 0);
        }
        localImageView.setLayoutParams(localLayoutParams);
        localImageView.setImageBitmap(localSnag.getThumbBmp());
        localImageView.setOnClickListener(new an(this, localSnag));
        AppActivity.l(this.b).addView(localImageView);
      }
      if (as.a().c(AppActivity.b(this.b)))
      {
        AppActivity.i(this.b).append("应用已下载");
        AppActivity.j(this.b).setEnabled(true);
        AppActivity.j(this.b).setOnClickListener(new ak(this));
      }
      else if (as.a().b(AppActivity.b(this.b)))
      {
        AppActivity.i(this.b).append("下载中...");
      }
      else
      {
        AppActivity.i(this.b).append("");
        AppActivity.j(this.b).setEnabled(true);
        AppActivity.j(this.b).setOnClickListener(new al(this));
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.aj
 * JD-Core Version:    0.7.0.1
 */