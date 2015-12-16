package cn.domob.android.ads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import cn.domob.android.a.c;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;

public class o
{
  private f A;
  private String B;
  private boolean C;
  private boolean D;
  private boolean E;
  private boolean F;
  WebView a;
  private String b;
  private Context c;
  private Dialog d;
  private HashMap<String, String> e;
  private RelativeLayout f;
  private RelativeLayout g;
  private Animation h;
  private Animation i;
  private Animation j;
  private Animation k;
  private Handler l;
  private int m;
  private int n;
  private int o;
  private float p;
  private float q;
  private float r;
  private String s;
  private ImageButton t;
  private ImageButton u;
  private View v;
  private String w;
  private ImageView x;
  private RotateAnimation y;
  private int z;
  
  public o() {}
  
  public o(f paramf, String paramString1, HashMap<String, String> paramHashMap, String paramString2, String paramString3, WebView paramWebView)
  {
    this.b = null;
    this.c = null;
    this.d = null;
    this.l = new Handler();
    this.m = 0;
    this.p = 1.0F;
    this.q = 1.0F;
    this.B = "";
    this.C = false;
    this.D = false;
    this.E = false;
    this.F = false;
    new p(this);
    this.A = paramf;
    this.b = a(paramString1);
    this.e = paramHashMap;
    this.s = paramString2;
    this.c = paramf.k();
    this.B = ((String)paramHashMap.get("pkgName"));
    this.n = DomobAdManager.g(this.c);
    this.o = DomobAdManager.h(this.c);
    this.p = DomobAdManager.f(this.c);
    this.q = DomobAdManager.e(this.c);
    this.r = (this.q / this.p);
    this.a = paramWebView;
    this.w = paramString3;
    for (;;)
    {
      try
      {
        LinearLayout localLinearLayout = new LinearLayout(this.c);
        localLinearLayout.setOrientation(0);
        localLinearLayout.setGravity(17);
        localLinearLayout.setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeStream(this.c.getAssets().open("banner.png"))));
        this.t = new ImageButton(this.c);
        LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams((int)(40.0F * this.p), (int)(40.0F * this.p));
        this.t.setLayoutParams(localLayoutParams1);
        if (this.a.canGoBack())
        {
          str = "preview.png";
          this.t.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              o.t(o.this);
            }
          });
          localLinearLayout.addView(a(str, this.t));
          this.u = new ImageButton(this.c);
          LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams((int)(40.0F * this.p), (int)(40.0F * this.p));
          this.u.setLayoutParams(localLayoutParams2);
          this.u.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              o.u(o.this);
            }
          });
          localLinearLayout.addView(a("next_off.png", this.u));
          ImageButton localImageButton1 = new ImageButton(this.c);
          localImageButton1.setLayoutParams(new LinearLayout.LayoutParams((int)(40.0F * this.p), (int)(40.0F * this.p)));
          localImageButton1.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              try
              {
                o.w(o.this);
                return;
              }
              catch (Exception localException)
              {
                while (!Log.isLoggable("DomobSDK", 3)) {}
                Log.e("DomobSDK", "intent " + o.k(o.this) + " error");
              }
            }
          });
          localLinearLayout.addView(a("refresh.png", localImageButton1));
          ImageButton localImageButton2 = new ImageButton(this.c);
          localImageButton2.setLayoutParams(new LinearLayout.LayoutParams((int)(40.0F * this.p), (int)(40.0F * this.p)));
          localImageButton2.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              try
              {
                o.v(o.this);
                return;
              }
              catch (Exception localException)
              {
                while (!Log.isLoggable("DomobSDK", 3)) {}
                Log.e("DomobSDK", "intent " + o.k(o.this) + " error");
              }
            }
          });
          localLinearLayout.addView(a("out.png", localImageButton2));
          localLinearLayout.addView(f());
          this.v = localLinearLayout;
        }
      }
      catch (IOException localIOException1)
      {
        String str;
        localIOException1.printStackTrace();
        continue;
      }
      try
      {
        this.x = new ImageView(this.c);
        this.x.setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeStream(this.c.getAssets().open("loading.png"))));
        this.x.setVisibility(8);
        this.y = new RotateAnimation(0.0F, 360.0F, 1, 0.5F, 1, 0.5F);
        this.y.setDuration(1000L);
        this.y.setInterpolator(new LinearInterpolator());
        this.y.setRepeatCount(-1);
        return;
      }
      catch (IOException localIOException2)
      {
        localIOException2.printStackTrace();
      }
      str = "preview_off.png";
    }
  }
  
  /* Error */
  private static Drawable a(String paramString, Context paramContext)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 159	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_0
    //   7: invokevirtual 167	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   10: astore 13
    //   12: aload 13
    //   14: astore 4
    //   16: new 153	android/graphics/drawable/BitmapDrawable
    //   19: dup
    //   20: aload 4
    //   22: invokestatic 173	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   25: invokespecial 176	android/graphics/drawable/BitmapDrawable:<init>	(Landroid/graphics/Bitmap;)V
    //   28: astore 14
    //   30: aload 4
    //   32: invokevirtual 289	java/io/InputStream:close	()V
    //   35: aload 14
    //   37: areturn
    //   38: astore 15
    //   40: ldc_w 291
    //   43: ldc_w 293
    //   46: invokestatic 298	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   49: pop
    //   50: aload 14
    //   52: areturn
    //   53: astore 7
    //   55: aconst_null
    //   56: astore 8
    //   58: ldc_w 291
    //   61: new 300	java/lang/StringBuilder
    //   64: dup
    //   65: invokespecial 301	java/lang/StringBuilder:<init>	()V
    //   68: ldc_w 303
    //   71: invokevirtual 307	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: aload_0
    //   75: invokevirtual 307	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: ldc_w 309
    //   81: invokevirtual 307	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   84: invokevirtual 313	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: invokestatic 298	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   90: pop
    //   91: aload 8
    //   93: invokevirtual 289	java/io/InputStream:close	()V
    //   96: aconst_null
    //   97: areturn
    //   98: astore 11
    //   100: ldc_w 291
    //   103: ldc_w 293
    //   106: invokestatic 298	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   109: pop
    //   110: aconst_null
    //   111: areturn
    //   112: astore_3
    //   113: aconst_null
    //   114: astore 4
    //   116: aload 4
    //   118: invokevirtual 289	java/io/InputStream:close	()V
    //   121: aload_3
    //   122: athrow
    //   123: astore 5
    //   125: ldc_w 291
    //   128: ldc_w 293
    //   131: invokestatic 298	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   134: pop
    //   135: goto -14 -> 121
    //   138: astore_3
    //   139: goto -23 -> 116
    //   142: astore 9
    //   144: aload 8
    //   146: astore 4
    //   148: aload 9
    //   150: astore_3
    //   151: goto -35 -> 116
    //   154: astore 17
    //   156: aload 4
    //   158: astore 8
    //   160: goto -102 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	paramString	String
    //   0	163	1	paramContext	Context
    //   4	2	2	localAssetManager	AssetManager
    //   112	10	3	localObject1	Object
    //   138	1	3	localObject2	Object
    //   150	1	3	localObject3	Object
    //   14	143	4	localObject4	Object
    //   123	1	5	localException1	Exception
    //   53	1	7	localException2	Exception
    //   56	103	8	localObject5	Object
    //   142	7	9	localObject6	Object
    //   98	1	11	localException3	Exception
    //   10	3	13	localInputStream	java.io.InputStream
    //   28	23	14	localBitmapDrawable	BitmapDrawable
    //   38	1	15	localException4	Exception
    //   154	1	17	localException5	Exception
    // Exception table:
    //   from	to	target	type
    //   30	35	38	java/lang/Exception
    //   5	12	53	java/lang/Exception
    //   91	96	98	java/lang/Exception
    //   5	12	112	finally
    //   116	121	123	java/lang/Exception
    //   16	30	138	finally
    //   58	91	142	finally
    //   16	30	154	java/lang/Exception
  }
  
  private LinearLayout a(String paramString, ImageButton paramImageButton)
  {
    LinearLayout localLinearLayout = new LinearLayout(this.c);
    paramImageButton.setBackgroundDrawable(a(paramString, this.c));
    if (this.m == 1) {}
    for (LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams((int)(40.0F * this.p), (int)(40.0F * this.p));; localLayoutParams = new LinearLayout.LayoutParams((int)(30.0F * this.p), (int)(30.0F * this.p)))
    {
      paramImageButton.setLayoutParams(localLayoutParams);
      localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 1.0F));
      localLinearLayout.setGravity(17);
      localLinearLayout.addView(paramImageButton);
      return localLinearLayout;
    }
  }
  
  static String a(String paramString)
  {
    String str1 = paramString.trim();
    int i1 = str1.indexOf(':');
    boolean bool = true;
    String str2 = str1;
    for (int i2 = 0; i2 < i1; i2++)
    {
      char c1 = str2.charAt(i2);
      if (!Character.isLetter(c1)) {
        break;
      }
      bool &= Character.isLowerCase(c1);
      if ((i2 == i1 - 1) && (!bool)) {
        str2 = str2.substring(0, i1).toLowerCase() + str2.substring(i1);
      }
    }
    if ((str2.startsWith("http://")) || (str2.startsWith("https://"))) {}
    while ((!str2.startsWith("http:")) && (!str2.startsWith("https:"))) {
      return str2;
    }
    if ((str2.startsWith("http:/")) || (str2.startsWith("https:/"))) {
      return str2.replaceFirst("/", "//");
    }
    return str2.replaceFirst(":", "://");
  }
  
  private void c()
  {
    int i1;
    if ((this.c instanceof Activity))
    {
      int i2 = ((Activity)this.c).getWindow().getAttributes().flags;
      int i3 = -1 + Integer.toBinaryString(1024).length();
      if ((i2 >>> i3) % 2 == (1024 >>> i3) % 2) {
        i1 = 1;
      }
    }
    for (;;)
    {
      if (i1 != 0)
      {
        this.d = new Dialog(this.c, 16973841);
        return;
        i1 = 0;
      }
      else
      {
        this.d = new Dialog(this.c, 16973840);
        return;
        i1 = 0;
      }
    }
  }
  
  private Button d()
  {
    Button localButton = new Button(this.c);
    localButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    GradientDrawable localGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[] { -1, -16777216 });
    localGradientDrawable.setGradientCenter(0.5F, 0.5F);
    localGradientDrawable.setGradientType(1);
    localGradientDrawable.setCornerRadii(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    localGradientDrawable.setGradientRadius((float)(60.0D * Math.sqrt(5.0D)));
    localGradientDrawable.setAlpha(200);
    localButton.setBackgroundDrawable(localGradientDrawable);
    return localButton;
  }
  
  private WebView e()
  {
    this.x.setVisibility(0);
    this.x.startAnimation(this.y);
    this.a.setVisibility(0);
    this.a.getSettings().setJavaScriptEnabled(true);
    this.a.addJavascriptInterface(new Object() {}, "domobJs");
    this.a.setDownloadListener(new DownloadListener()
    {
      public final void onDownloadStart(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, String paramAnonymousString4, long paramAnonymousLong)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.i("DomobSDK", "inapp download url: " + paramAnonymousString1);
        }
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject3 = null;
        Object localObject4 = null;
        for (;;)
        {
          int j;
          Object localObject6;
          Object localObject9;
          Object localObject7;
          try
          {
            String str1 = new URL(paramAnonymousString1).getQuery();
            localObject4 = null;
            localObject3 = null;
            localObject2 = null;
            localObject1 = null;
            if (str1 != null)
            {
              String[] arrayOfString = str1.split("&");
              int i = arrayOfString.length;
              j = 0;
              if (j < i)
              {
                String str2 = arrayOfString[j];
                String str3 = str2.split("=")[0];
                localObject6 = str2.split("=")[1];
                if ("appname".equals(str3))
                {
                  String str4 = URLDecoder.decode((String)localObject6);
                  Object localObject10 = localObject3;
                  localObject9 = localObject2;
                  localObject7 = str4;
                  localObject6 = localObject10;
                }
                else if ("appid".equals(str3))
                {
                  localObject7 = localObject1;
                  Object localObject8 = localObject6;
                  localObject6 = localObject3;
                  localObject9 = localObject8;
                }
                else if ("pkg".equals(str3))
                {
                  localObject9 = localObject2;
                  localObject7 = localObject1;
                }
                else
                {
                  boolean bool = "ver".equals(str3);
                  if (bool)
                  {
                    localObject4 = localObject6;
                    localObject6 = localObject3;
                    localObject9 = localObject2;
                    localObject7 = localObject1;
                  }
                }
              }
            }
          }
          catch (Exception localException)
          {
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.e("DomobSDK", "fail to get appName.", localException);
            }
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.i("DomobSDK", String.format("appName: %s; appId: %s; pkg: %s; ver: %s", new Object[] { localObject1, localObject2, localObject3, localObject4 }));
            }
            if (localObject1 == null)
            {
              localObject5 = (String)o.m(o.this).get("name");
              o.a(o.this, paramAnonymousString1, o.c(o.this), false, (String)localObject5);
              return;
            }
            Object localObject5 = localObject1;
            continue;
            localObject6 = localObject3;
            localObject9 = localObject2;
            localObject7 = localObject1;
          }
          j++;
          localObject1 = localObject7;
          localObject2 = localObject9;
          localObject3 = localObject6;
        }
      }
    });
    this.a.setWebViewClient(new WebViewClient()
    {
      public final void onPageFinished(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        super.onPageFinished(paramAnonymousWebView, paramAnonymousString);
        o.b(o.this, true);
        if ((!o.g(o.this)) && (!o.n(o.this)))
        {
          o.c(o.this, true);
          o.a(o.this, 4);
        }
        o.o(o.this).clearAnimation();
        o.o(o.this).setVisibility(8);
        if (o.p(o.this).equals("inapp_fs")) {
          o.q(o.this);
        }
      }
      
      public final void onPageStarted(WebView paramAnonymousWebView, String paramAnonymousString, Bitmap paramAnonymousBitmap)
      {
        super.onPageStarted(paramAnonymousWebView, paramAnonymousString, paramAnonymousBitmap);
        o.o(o.this).setVisibility(0);
        o.o(o.this).startAnimation(o.r(o.this));
        if (o.p(o.this).equals("inapp_fs")) {
          o.q(o.this);
        }
      }
      
      public final void onReceivedError(WebView paramAnonymousWebView, int paramAnonymousInt, String paramAnonymousString1, String paramAnonymousString2)
      {
        if ((!o.s(o.this)) && (!o.n(o.this)))
        {
          o.d(o.this, true);
          o.a(o.this, 5);
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.e("DomobSDK", "WebView ReceivedError:" + paramAnonymousString1);
        }
        super.onReceivedError(paramAnonymousWebView, paramAnonymousInt, paramAnonymousString1, paramAnonymousString2);
      }
      
      public final boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.i("DomobSDK", "shouldOverrideUrlLoading: " + paramAnonymousString);
        }
        if (paramAnonymousString.startsWith("wtai://wp/"))
        {
          if (paramAnonymousString.startsWith("wtai://wp/mc;"))
          {
            Intent localIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("tel:" + paramAnonymousString.substring("wtai://wp/mc;".length())));
            o.c(o.this).startActivity(localIntent3);
            return true;
          }
        }
        else
        {
          if (!paramAnonymousString.startsWith("market://search?q=")) {
            break label196;
          }
          try
          {
            Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse(paramAnonymousString));
            localIntent2.addCategory("android.intent.category.BROWSABLE");
            o.c(o.this).startActivity(localIntent2);
            return true;
          }
          catch (Exception localException2)
          {
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.e("DomobSDK", "failed to intent market " + paramAnonymousString);
            }
          }
        }
        for (;;)
        {
          paramAnonymousWebView.loadUrl(paramAnonymousString);
          return true;
          label196:
          if ((paramAnonymousString.startsWith("sms:")) || (paramAnonymousString.startsWith("mailto:")))
          {
            try
            {
              Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse(paramAnonymousString));
              o.c(o.this).startActivity(localIntent1);
              return true;
            }
            catch (Exception localException1) {}
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.e("DomobSDK", "failed to intent " + paramAnonymousString);
            }
          }
        }
      }
    });
    this.a.setWebChromeClient(new WebChromeClient()
    {
      public final void onProgressChanged(WebView paramAnonymousWebView, int paramAnonymousInt)
      {
        if (o.p(o.this).equals("inapp_fs")) {
          o.q(o.this);
        }
        super.onProgressChanged(paramAnonymousWebView, paramAnonymousInt);
      }
    });
    this.a.getSettings().setCacheMode(1);
    this.a.setScrollBarStyle(0);
    if (this.s.equals("inapp_fs"))
    {
      RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams1.addRule(12);
      localLayoutParams1.bottomMargin = ((int)(40.0F * this.p));
      this.a.setLayoutParams(localLayoutParams1);
      if (this.a.getUrl() == null) {
        break label226;
      }
      this.a.reload();
    }
    label310:
    for (;;)
    {
      this.a.clearCache(true);
      return this.a;
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
      localLayoutParams2.addRule(14);
      this.a.setLayoutParams(localLayoutParams2);
      break;
      label226:
      if (this.w != null) {
        this.a.loadDataWithBaseURL(this.b, this.w, "text/html", "utf-8", null);
      }
      for (;;)
      {
        if (!Log.isLoggable("DomobSDK", 3)) {
          break label310;
        }
        Log.d("DomobSDK", "loadUrl" + this.b);
        break;
        this.a.loadUrl(this.b);
      }
    }
  }
  
  private LinearLayout f()
  {
    ImageButton localImageButton = new ImageButton(this.c);
    String str;
    if (this.m == 1) {
      str = "close.png";
    }
    for (LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams((int)(40.0F * this.p), (int)(40.0F * this.p));; localLayoutParams = new LinearLayout.LayoutParams((int)(30.0F * this.p), (int)(30.0F * this.p)))
    {
      localImageButton.setLayoutParams(localLayoutParams);
      localImageButton.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          o.i(o.this);
          o.a locala = new o.a(o.this);
          o.j(o.this).postDelayed(locala, 500L);
        }
      });
      return a(str, localImageButton);
      str = "exit.png";
    }
  }
  
  private void g()
  {
    if (this.a.canGoBack()) {}
    for (;;)
    {
      try
      {
        this.t.setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeStream(this.c.getAssets().open("preview.png"))));
        if (!this.a.canGoForward()) {
          break;
        }
      }
      catch (IOException localIOException4)
      {
        try
        {
          this.u.setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeStream(this.c.getAssets().open("next.png"))));
          return;
        }
        catch (IOException localIOException3)
        {
          localIOException3.printStackTrace();
          return;
        }
        localIOException4 = localIOException4;
        localIOException4.printStackTrace();
        continue;
      }
      try
      {
        this.t.setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeStream(this.c.getAssets().open("preview_off.png"))));
      }
      catch (IOException localIOException1)
      {
        localIOException1.printStackTrace();
      }
    }
    try
    {
      this.u.setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeStream(this.c.getAssets().open("next_off.png"))));
      return;
    }
    catch (IOException localIOException2)
    {
      localIOException2.printStackTrace();
    }
  }
  
  protected final Dialog a()
    throws Exception
  {
    this.f = new RelativeLayout(this.c);
    this.f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    this.f.addView(e());
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams1.addRule(13);
    this.f.addView(this.x, localLayoutParams1);
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, (int)(40.0F * this.p));
    localLayoutParams2.addRule(12);
    this.f.addView(this.v, localLayoutParams2);
    c();
    this.h = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
    this.h.setDuration(500L);
    this.f.startAnimation(this.h);
    this.d.getWindow().getAttributes().dimAmount = 0.5F;
    this.d.getWindow().setFlags(2, 2);
    this.d.setContentView(this.f);
    this.d.setOnDismissListener(new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        if (o.a(o.this) == 1) {
          ((Activity)o.c(o.this)).setRequestedOrientation(o.b(o.this));
        }
        o.d(o.this).removeView(o.this.a);
        o.e(o.this).d(false);
        if (o.e(o.this).s() != null) {
          o.e(o.this).s().onLandingPageClose();
        }
        if ((!o.f(o.this)) && (!o.g(o.this)))
        {
          o.a(o.this, true);
          o.a(o.this, 10);
        }
        o.a(o.this, 6);
      }
    });
    return this.d;
  }
  
  protected final Dialog b()
    throws Exception
  {
    this.m = 1;
    this.f = new RelativeLayout(this.c);
    this.f.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    this.g = new RelativeLayout(this.c);
    this.g.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    WindowManager.LayoutParams localLayoutParams;
    label306:
    RelativeLayout.LayoutParams localLayoutParams4;
    if (this.s.equals("inapp_slider"))
    {
      this.g.setPadding(0, (int)(10.0F / this.r), 0, 0);
      WebView localWebView = e();
      this.g.addView(localWebView);
      RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams1.addRule(13);
      this.g.addView(this.x, localLayoutParams1);
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams2.addRule(11);
      if ("inapp_dlg".equals(this.s)) {
        this.g.addView(f(), localLayoutParams2);
      }
      c();
      localLayoutParams = this.d.getWindow().getAttributes();
      this.z = ((Activity)this.c).getRequestedOrientation();
      if (DomobAdManager.d(this.c) != "v") {
        break label1008;
      }
      ((Activity)this.c).setRequestedOrientation(1);
      if (this.o / this.n <= 0) {
        break label921;
      }
      if (-10 + this.n < 300) {
        break label870;
      }
      localLayoutParams.width = ((int)(0.95D * (this.n / this.r)));
      localLayoutParams.height = ((localLayoutParams.width << 2) / 3);
      localLayoutParams.dimAmount = 0.7F;
      if (this.s.equals("inapp_slider"))
      {
        localLayoutParams.width = ((int)(this.n / this.r));
        localLayoutParams.height = ((int)(315.0F * this.p));
        localLayoutParams.y = ((int)(this.o / this.r / 2.0F - this.A.p() - localLayoutParams.height / 2));
        localLayoutParams.dimAmount = 0.0F;
        localWebView.getLayoutParams().width = ((int)(this.n / this.r));
        Button localButton = d();
        localButton.getBackground().setAlpha(100);
        RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        localLayoutParams5.addRule(12);
        localLayoutParams5.height = ((int)(315.0F * this.p - 10.0F * this.p));
        this.f.addView(localButton, localLayoutParams5);
      }
      this.d.getWindow().setAttributes(localLayoutParams);
      this.d.getWindow().setFlags(2, 2);
      this.f.addView(d());
      if ("inapp_slider".equals(this.s))
      {
        TextView localTextView = new TextView(this.c);
        localTextView.setText("   domob", TextView.BufferType.SPANNABLE);
        RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        localLayoutParams3.addRule(9);
        this.f.addView(localTextView, localLayoutParams3);
      }
      localLayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams4.addRule(14);
      if ("inapp_slider".equals(this.s)) {
        if (this.o >= 800) {
          break label1214;
        }
      }
    }
    label921:
    label1214:
    for (localLayoutParams4.topMargin = ((int)(10.0F / this.r));; localLayoutParams4.topMargin = ((int)(20.0F / this.r)))
    {
      this.f.addView(this.g, localLayoutParams4);
      this.d.setContentView(this.f);
      this.j = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, this.d.getWindow().getAttributes().width / 2, this.d.getWindow().getAttributes().height / 2);
      this.j.setDuration(500L);
      if (this.s.equals("inapp_slider"))
      {
        this.h = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
        this.h.setDuration(500L);
        this.h.setInterpolator(new DecelerateInterpolator(0.7F));
        this.f.startAnimation(this.h);
      }
      this.d.setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          if (o.a(o.this) == 1) {
            ((Activity)o.c(o.this)).setRequestedOrientation(o.b(o.this));
          }
          o.h(o.this).removeView(o.this.a);
          o.e(o.this).d(false);
          if (o.e(o.this).s() != null) {
            o.e(o.this).s().onLandingPageClose();
          }
          if ((!o.f(o.this)) && (!o.g(o.this)))
          {
            o.a(o.this, true);
            o.a(o.this, 10);
          }
          o.a(o.this, 6);
        }
      });
      return this.d;
      DomobAdManager.d(this.c);
      this.g.setPadding((int)(10.0F / this.r), (int)(10.0F / this.r), (int)(10.0F / this.r), (int)(10.0F / this.r));
      break;
      label870:
      localLayoutParams.width = ((int)((20 + (-10 + this.n)) * this.p));
      localLayoutParams.height = ((int)((20 + (-10 + this.n) << 2) / 3 * this.p));
      break label306;
      if (-10 + this.o >= 400)
      {
        localLayoutParams.width = ((int)(300.0F * this.p));
        localLayoutParams.height = ((int)(400.0F * this.p));
        break label306;
      }
      localLayoutParams.height = ((int)((-10 + this.o) * this.p));
      localLayoutParams.width = ((int)(3 * localLayoutParams.height / 4 * this.p));
      break label306;
      label1008:
      ((Activity)this.c).setRequestedOrientation(0);
      if (this.n / this.o > 0)
      {
        if (-10 + this.o >= 400)
        {
          localLayoutParams.height = ((int)(0.95D * (this.o / this.r)));
          localLayoutParams.width = ((localLayoutParams.height << 2) / 3);
          break label306;
        }
        localLayoutParams.width = ((int)((-10 + this.o << 2) / 3 * this.p));
        localLayoutParams.height = ((int)((-10 + this.o) * this.p));
        break label306;
      }
      if (-10 + this.o >= 400)
      {
        localLayoutParams.width = ((int)(300.0F * this.p));
        localLayoutParams.height = ((int)(400.0F * this.p));
        break label306;
      }
      localLayoutParams.height = ((int)((-10 + this.o) * this.p));
      localLayoutParams.width = ((int)(3 * localLayoutParams.height / 4 * this.p));
      break label306;
    }
  }
  
  final class a
    implements Runnable
  {
    a() {}
    
    public final void run()
    {
      o.l(o.this).dismiss();
    }
  }
  
  final class b
    implements Runnable
  {
    b() {}
    
    public final void run()
    {
      o.d(o.this).removeAllViews();
      if (o.h(o.this) != null) {
        o.h(o.this).removeAllViews();
      }
      o.this.a = new WebView(o.c(o.this));
      o localo1 = o.this;
      o.a(localo1, o.a(null));
      o localo2 = o.this;
      o.b(localo2, null);
      o.this.a.loadUrl(o.k(o.this));
      o.b(o.this, 0);
      try
      {
        o.this.a().show();
        if (o.e(o.this).s() != null) {
          o.e(o.this).s().onLandingPageOpening();
        }
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.o
 * JD-Core Version:    0.7.0.1
 */