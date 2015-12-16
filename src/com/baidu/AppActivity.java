package com.baidu;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class AppActivity
  extends Activity
{
  private static final String a = AppActivity.class.getSimpleName();
  private static List<App> b = new ArrayList();
  private static BitmapDrawable s;
  private static BitmapDrawable t;
  private static BitmapDrawable u;
  private App c;
  private Handler d = new Handler();
  private ProgressDialog e;
  private boolean f = true;
  private ScrollView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private ImageView l;
  private Button m;
  private TextView n;
  private HorizontalScrollView o;
  private LinearLayout p;
  private LinearLayout q;
  private ImageView r;
  
  static
  {
    Bitmap localBitmap1 = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
    localBitmap1.setPixel(0, 0, -394759);
    s = new BitmapDrawable(localBitmap1);
    Rect localRect1 = new Rect(0, 0, 1, 27);
    Bitmap localBitmap2 = Bitmap.createBitmap(localRect1.width(), localRect1.height(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas1 = new Canvas(localBitmap2);
    GradientDrawable localGradientDrawable1 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] { -2105377, -394759 });
    localGradientDrawable1.setBounds(localRect1);
    localGradientDrawable1.draw(localCanvas1);
    t = new BitmapDrawable(localBitmap2);
    Rect localRect2 = new Rect(0, 0, 1, 23);
    Bitmap localBitmap3 = Bitmap.createBitmap(localRect2.width(), localRect2.height(), Bitmap.Config.ARGB_8888);
    localBitmap3.setPixel(0, 0, -2500135);
    localBitmap3.setPixel(0, -2 + localRect2.bottom, -1973791);
    localBitmap3.setPixel(0, -1 + localRect2.bottom, -4737097);
    Canvas localCanvas2 = new Canvas(localBitmap3);
    GradientDrawable localGradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] { -5000269, -1973791 });
    localGradientDrawable2.setBounds(localRect2.left, 1, localRect2.right, -2 + localRect2.bottom);
    localGradientDrawable2.draw(localCanvas2);
    u = new BitmapDrawable(localBitmap3);
  }
  
  private void a(boolean paramBoolean)
  {
    this.d.post(new aq(this, paramBoolean));
  }
  
  private void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if (paramBoolean)
    {
      setContentView(this.g);
      setTitle("应用详情查看");
      return;
    }
    setContentView(this.q);
    setTitle("应用截图查看");
  }
  
  private boolean b()
  {
    return this.f;
  }
  
  private void c()
  {
    String str = getIntent().getStringExtra("limg");
    boolean bool = str.equals("");
    Bitmap localBitmap = null;
    if (!bool) {
      localBitmap = w.d(false, this, str);
    }
    this.c = App.a(getIntent().getStringExtra("clklogurl"), getIntent().getStringExtra("surl"), getIntent().getStringExtra("tit"), "", getIntent().getLongExtra("ad_charge", 0L), localBitmap);
    if (b.contains(this.c))
    {
      this.c = ((App)b.get(b.indexOf(this.c)));
      a(false);
      return;
    }
    new ah(this, this).start();
  }
  
  private void d()
  {
    bk.b("setApp", this.c.toString());
    if ((this.c.n() == null) && (as.a().c(this.c))) {
      this.c.a(as.a().f(this.c));
    }
    this.d.post(new aj(this, this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bk.b(a, "onCreate");
    getWindow().setBackgroundDrawable(s);
    setRequestedOrientation(1);
    this.e = ProgressDialog.show(this, "正在连接服务器", "连接中,请稍后..", true, true);
    if (b.size() > 20) {
      b.clear();
    }
    this.g = new ScrollView(this);
    b(true);
    LinearLayout localLinearLayout1 = new LinearLayout(this);
    localLinearLayout1.setOrientation(1);
    localLinearLayout1.setGravity(1);
    this.g.addView(localLinearLayout1);
    TextView localTextView1 = new TextView(this);
    localTextView1.setLayoutParams(new LinearLayout.LayoutParams(-1, t.getBitmap().getHeight()));
    localTextView1.setBackgroundDrawable(t);
    localLinearLayout1.addView(localTextView1);
    LinearLayout localLinearLayout2 = new LinearLayout(this);
    localLinearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    localLinearLayout2.setPadding(17, 0, 17, 17);
    localLinearLayout1.addView(localLinearLayout2);
    this.l = new ImageView(this);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(94, 94);
    this.l.setLayoutParams(localLayoutParams1);
    localLinearLayout2.addView(this.l);
    LinearLayout localLinearLayout3 = new LinearLayout(this);
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams2.setMargins(17, 0, 0, 0);
    localLinearLayout3.setLayoutParams(localLayoutParams2);
    localLinearLayout3.setOrientation(1);
    localLinearLayout2.addView(localLinearLayout3);
    this.h = new TextView(this);
    this.h.setTextSize(22.0F);
    this.h.setLineSpacing(0.0F, 1.1F);
    this.h.setTextColor(-16777216);
    localLinearLayout3.addView(this.h);
    LinearLayout localLinearLayout4 = new LinearLayout(this);
    localLinearLayout3.addView(localLinearLayout4);
    this.i = new TextView(this);
    this.i.setTextSize(13.0F);
    localLinearLayout4.addView(this.i);
    this.j = new TextView(this);
    this.j.setTextSize(13.0F);
    localLinearLayout4.addView(this.j);
    LinearLayout localLinearLayout5 = new LinearLayout(this);
    localLinearLayout3.addView(localLinearLayout5);
    TextView localTextView2 = new TextView(this);
    localTextView2.setText("免费");
    localTextView2.setTextColor(-11565370);
    localTextView2.setTextSize(18.0F);
    localLinearLayout5.addView(localTextView2);
    this.m = new Button(this);
    LinearLayout.LayoutParams localLayoutParams3 = new LinearLayout.LayoutParams(105, 45);
    localLayoutParams3.setMargins(17, 0, 0, 0);
    this.m.setLayoutParams(localLayoutParams3);
    this.m.setTextSize(18.0F);
    this.m.setPadding(0, 0, 0, 0);
    this.m.setGravity(17);
    this.m.setText("安 装");
    localLinearLayout5.addView(this.m);
    TextView localTextView3 = new TextView(this);
    localTextView3.setLayoutParams(new LinearLayout.LayoutParams(-1, u.getBitmap().getHeight()));
    localTextView3.setBackgroundDrawable(u);
    localTextView3.setPadding(17, 0, 0, 0);
    localTextView3.setText("简介");
    localTextView3.setTextSize(16.0F);
    localTextView3.setTextColor(-1);
    localLinearLayout1.addView(localTextView3);
    ScrollView localScrollView = new ScrollView(this);
    localScrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 150));
    localScrollView.setPadding(17, 17, 17, 0);
    localLinearLayout1.addView(localScrollView);
    this.n = new TextView(this);
    this.n.setTextColor(-12105913);
    localScrollView.addView(this.n);
    this.o = new HorizontalScrollView(this);
    this.o.setVisibility(8);
    LinearLayout.LayoutParams localLayoutParams4 = new LinearLayout.LayoutParams(-1, -2);
    this.o.setLayoutParams(localLayoutParams4);
    this.o.setPadding(17, 17, 17, 17);
    localLinearLayout1.addView(this.o);
    this.p = new LinearLayout(this);
    this.p.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    this.p.setOrientation(0);
    this.o.addView(this.p);
    TextView localTextView4 = new TextView(this);
    localTextView4.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
    localTextView4.setBackgroundColor(-1315861);
    localLinearLayout1.addView(localTextView4);
    this.k = new TextView(this);
    this.k.setPadding(17, 17, 17, 17);
    this.k.setTextColor(-12105913);
    this.k.setTextSize(13.0F);
    this.k.setLineSpacing(0.0F, 1.2F);
    localLinearLayout1.addView(this.k);
    this.q = new LinearLayout(this);
    this.q.setOrientation(1);
    this.q.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.r = new ImageView(this);
    LinearLayout.LayoutParams localLayoutParams5 = new LinearLayout.LayoutParams(-2, -2);
    this.r.setLayoutParams(localLayoutParams5);
    this.q.addView(this.r);
    c();
  }
  
  protected void onDestroy()
  {
    bk.b(a, "onDestroy");
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (!b())
      {
        b(true);
        return true;
      }
      return super.onKeyDown(paramInt, paramKeyEvent);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    bk.b(a, "onPause");
    super.onPause();
  }
  
  protected void onRestart()
  {
    super.onRestart();
    bk.b(a, "onRestart");
  }
  
  protected void onResume()
  {
    super.onResume();
    d();
    bk.b(a, "onResume");
  }
  
  protected void onStart()
  {
    super.onStart();
    bk.b(a, "onStart");
  }
  
  protected void onStop()
  {
    bk.b(a, "onStop");
    super.onStop();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.AppActivity
 * JD-Core Version:    0.7.0.1
 */