package com.guohead.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.guohead.sdk.adapters.GuoheAdAdapter;
import com.guohead.sdk.obj.Custom;
import com.guohead.sdk.obj.Extra;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.GuoheAdUtil;
import com.guohead.sdk.util.Logger;
import java.util.Timer;
import java.util.TimerTask;

public class GuoheAdLayout
  extends RelativeLayout
  implements GuoheAdStateListener
{
  public String ClickedLink = "http://www.guohead.com";
  public Ration activeRation;
  public Activity activity;
  public Runnable adRunnable;
  public int bgColor = 0;
  public Custom custom;
  public Extra extra;
  public int fgColor = 0;
  public GuoheAdInterface guoheAdInterface;
  public GuoheAdStateListener guoheAdListener;
  public GuoheAdManager guoheAdManager;
  public Handler handler;
  private GuoheAdHttpClient httpClient = new GuoheAdHttpClient();
  public boolean isRotating;
  boolean isVisible = true;
  private String keyGuoheAd;
  public Ration nextRation;
  public ViewGroup nextView;
  public long showTime = 0L;
  public RelativeLayout superView;
  public Ration tempRation;
  public Runnable viewRunnable;
  
  public GuoheAdLayout(Activity paramActivity)
  {
    super(paramActivity);
    init(paramActivity);
  }
  
  public GuoheAdLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GuoheAdManager.init(paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.GuoheAdLayout).getString(0));
    init((Activity)paramContext);
  }
  
  private void countClickThreaded(final String paramString)
  {
    new Thread("Guohead SDK")
    {
      public void run()
      {
        Ration localRation = GuoheAdLayout.this.activeRation;
        if (paramString != null) {
          localRation.nid = paramString;
        }
        GuoheAdLayout.this.httpClient.httpGet(localRation, 3, Boolean.valueOf(false));
      }
    }.start();
    sendClickedLink();
    if (this.guoheAdListener != null) {
      this.guoheAdListener.onClick();
    }
  }
  
  private void handleAd()
  {
    Logger.d("handleAd()");
    this.tempRation = this.nextRation;
    if (this.nextRation == null)
    {
      Logger.e("nextRation is null!");
      rotateThreadedDelayed();
      return;
    }
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = this.nextRation.nid;
    arrayOfObject[1] = this.nextRation.name;
    arrayOfObject[2] = Integer.valueOf(this.nextRation.type);
    arrayOfObject[3] = this.nextRation.key;
    arrayOfObject[4] = this.nextRation.key2;
    arrayOfObject[5] = this.nextRation.key3;
    Logger.d(String.format("Showing ad:\n\tnid: %s\n\tname: %s\n\ttype: %d\n\tkey: %s\n\tkey2: %s\n\tkey3: %s", arrayOfObject));
    try
    {
      GuoheAdAdapter.handle(this, this.nextRation);
      Logger.d("GuoheAdAdapter.handle()");
      return;
    }
    catch (Throwable localThrowable)
    {
      Logger.w("Caught an exception in adapter:" + localThrowable);
      localThrowable.printStackTrace();
      rolloverThreaded();
    }
  }
  
  private void sendClickedLink()
  {
    new Timer().schedule(new TimerTask()
    {
      /* Error */
      public void run()
      {
        // Byte code:
        //   0: new 24	java/lang/StringBuilder
        //   3: dup
        //   4: invokespecial 25	java/lang/StringBuilder:<init>	()V
        //   7: astore_1
        //   8: new 27	java/util/ArrayList
        //   11: dup
        //   12: invokespecial 28	java/util/ArrayList:<init>	()V
        //   15: astore_2
        //   16: aload_2
        //   17: ldc 30
        //   19: invokevirtual 34	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   22: pop
        //   23: aload_2
        //   24: ldc 36
        //   26: invokevirtual 34	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   29: pop
        //   30: new 38	java/io/BufferedReader
        //   33: dup
        //   34: new 40	java/io/InputStreamReader
        //   37: dup
        //   38: invokestatic 46	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
        //   41: aload_2
        //   42: iconst_0
        //   43: anewarray 48	java/lang/String
        //   46: invokevirtual 52	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
        //   49: checkcast 54	[Ljava/lang/String;
        //   52: invokevirtual 58	java/lang/Runtime:exec	([Ljava/lang/String;)Ljava/lang/Process;
        //   55: invokevirtual 64	java/lang/Process:getInputStream	()Ljava/io/InputStream;
        //   58: invokespecial 67	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
        //   61: invokespecial 70	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
        //   64: astore 11
        //   66: aload 11
        //   68: invokevirtual 74	java/io/BufferedReader:readLine	()Ljava/lang/String;
        //   71: astore 12
        //   73: aload 12
        //   75: ifnull +76 -> 151
        //   78: aload 12
        //   80: ldc 76
        //   82: invokevirtual 80	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
        //   85: ifeq -19 -> 66
        //   88: aload 12
        //   90: ldc 82
        //   92: invokevirtual 86	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
        //   95: bipush 7
        //   97: aaload
        //   98: astore 13
        //   100: aload_1
        //   101: aload 13
        //   103: iconst_4
        //   104: aload 13
        //   106: invokevirtual 90	java/lang/String:length	()I
        //   109: invokevirtual 94	java/lang/String:substring	(II)Ljava/lang/String;
        //   112: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   115: pop
        //   116: aload_1
        //   117: ldc 82
        //   119: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: pop
        //   123: goto -57 -> 66
        //   126: astore 4
        //   128: new 24	java/lang/StringBuilder
        //   131: dup
        //   132: invokespecial 25	java/lang/StringBuilder:<init>	()V
        //   135: ldc 100
        //   137: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   140: aload 4
        //   142: invokevirtual 103	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   145: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   148: invokestatic 112	com/guohead/sdk/util/Logger:e	(Ljava/lang/String;)V
        //   151: aload_1
        //   152: ifnull +59 -> 211
        //   155: aload_1
        //   156: invokevirtual 113	java/lang/StringBuilder:length	()I
        //   159: ldc 114
        //   161: isub
        //   162: iconst_0
        //   163: invokestatic 120	java/lang/Math:max	(II)I
        //   166: istore 5
        //   168: iload 5
        //   170: ifle +11 -> 181
        //   173: aload_1
        //   174: iconst_0
        //   175: iload 5
        //   177: invokevirtual 124	java/lang/StringBuilder:delete	(II)Ljava/lang/StringBuilder;
        //   180: pop
        //   181: aload_1
        //   182: invokevirtual 106	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   185: ldc 82
        //   187: invokevirtual 86	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
        //   190: astore 7
        //   192: aload 7
        //   194: arraylength
        //   195: istore 8
        //   197: aload_0
        //   198: getfield 15	com/guohead/sdk/GuoheAdLayout$8:this$0	Lcom/guohead/sdk/GuoheAdLayout;
        //   201: aload 7
        //   203: iload 8
        //   205: iconst_1
        //   206: isub
        //   207: aaload
        //   208: putfield 128	com/guohead/sdk/GuoheAdLayout:ClickedLink	Ljava/lang/String;
        //   211: return
        //   212: astore_3
        //   213: aload_3
        //   214: invokevirtual 129	java/lang/Exception:toString	()Ljava/lang/String;
        //   217: invokestatic 112	com/guohead/sdk/util/Logger:e	(Ljava/lang/String;)V
        //   220: return
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	221	0	this	8
        //   7	175	1	localStringBuilder	java.lang.StringBuilder
        //   15	27	2	localArrayList	java.util.ArrayList
        //   212	2	3	localException	Exception
        //   126	15	4	localIOException	java.io.IOException
        //   166	10	5	i	int
        //   190	12	7	arrayOfString	String[]
        //   195	12	8	j	int
        //   64	3	11	localBufferedReader	java.io.BufferedReader
        //   71	18	12	str1	String
        //   98	7	13	str2	String
        // Exception table:
        //   from	to	target	type
        //   8	66	126	java/io/IOException
        //   66	73	126	java/io/IOException
        //   78	123	126	java/io/IOException
        //   0	8	212	java/lang/Exception
        //   8	66	212	java/lang/Exception
        //   66	73	212	java/lang/Exception
        //   78	123	212	java/lang/Exception
        //   128	151	212	java/lang/Exception
        //   155	168	212	java/lang/Exception
        //   173	181	212	java/lang/Exception
        //   181	211	212	java/lang/Exception
      }
    }, 1000L);
  }
  
  protected void countFailThreaded()
  {
    new Thread("Guohead SDK")
    {
      public void run()
      {
        if (GuoheAdLayout.this.tempRation == null)
        {
          Logger.d(" tempRation null la!");
          return;
        }
        GuoheAdLayout.this.httpClient.httpGet(GuoheAdLayout.this.tempRation, 3, Boolean.valueOf(false));
        GuoheAdLayout.this.tempRation = null;
      }
    }.start();
  }
  
  public void countImpressionThreaded()
  {
    Logger.d("Sending metrics request for impression");
    new Thread("Guohead SDK")
    {
      public void run()
      {
        GuoheAdLayout.this.httpClient.httpGet(GuoheAdLayout.this.activeRation, 2, Boolean.valueOf(false));
      }
    }.start();
  }
  
  void init(final Activity paramActivity)
  {
    this.keyGuoheAd = GuoheAdUtil.getAppKey(paramActivity);
    this.activity = paramActivity;
    this.superView = this;
    this.isRotating = true;
    this.handler = new Handler();
    this.adRunnable = new Runnable()
    {
      public void run()
      {
        GuoheAdLayout.this.handleAd();
      }
    };
    this.viewRunnable = new Runnable()
    {
      public void run()
      {
        if (GuoheAdLayout.this.nextView == null) {
          return;
        }
        if (GuoheAdLayout.this.guoheAdListener != null) {
          GuoheAdLayout.this.guoheAdListener.onReceiveAd();
        }
        GuoheAdLayout.this.pushSubView(GuoheAdLayout.this.nextView);
      }
    };
    new Thread("Guohead SDK")
    {
      public void run()
      {
        GuoheAdLayout.this.guoheAdManager = new GuoheAdManager(paramActivity, GuoheAdLayout.this.keyGuoheAd);
        GuoheAdLayout.this.extra = GuoheAdLayout.this.guoheAdManager.getExtra();
        if (GuoheAdLayout.this.extra == null)
        {
          Logger.e("Unable to get configuration info or bad info, exiting GuoheAd");
          return;
        }
        if (GuoheAdLayout.this.fgColor != 0)
        {
          GuoheAdLayout.this.extra.fgRed = Color.red(GuoheAdLayout.this.fgColor);
          GuoheAdLayout.this.extra.fgBlue = Color.blue(GuoheAdLayout.this.fgColor);
          GuoheAdLayout.this.extra.fgGreen = Color.green(GuoheAdLayout.this.fgColor);
        }
        if (GuoheAdLayout.this.bgColor != 0)
        {
          GuoheAdLayout.this.extra.bgRed = Color.red(GuoheAdLayout.this.bgColor);
          GuoheAdLayout.this.extra.bgBlue = Color.blue(GuoheAdLayout.this.bgColor);
          GuoheAdLayout.this.extra.bgGreen = Color.green(GuoheAdLayout.this.bgColor);
        }
        GuoheAdLayout.this.rotateAd();
      }
    }.start();
    setHorizontalScrollBarEnabled(false);
    setVerticalScrollBarEnabled(false);
  }
  
  public void onClick() {}
  
  public void onFail() {}
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return false;
      if (this.activeRation != null)
      {
        Intent localIntent;
        if (this.activeRation.type == 9)
        {
          if (this.custom == null) {
            break label197;
          }
          if ((this.custom.type == 1) || (this.custom.type == 2))
          {
            localIntent = new Intent("android.intent.action.VIEW", Uri.parse(this.custom.link));
            localIntent.addFlags(268435456);
          }
        }
        for (;;)
        {
          try
          {
            this.activity.startActivity(localIntent);
            if (TextUtils.isEmpty(this.activeRation.key2)) {
              break label228;
            }
            if (this.activeRation.type != 94) {
              break label206;
            }
            if (Boolean.getBoolean(this.activeRation.key3) == true) {
              break;
            }
            countClickThreaded(null);
          }
          catch (Exception localException)
          {
            Logger.w("Could not handle click to " + this.custom.link + localException);
            continue;
          }
          label197:
          Logger.w("In onInterceptTouchEvent(), but custom or custom.link is null");
        }
        label206:
        if (Boolean.getBoolean(this.activeRation.key2) != true)
        {
          countClickThreaded(null);
          continue;
          label228:
          if (this.activeRation.type == 93)
          {
            if (System.currentTimeMillis() - 2000L > this.showTime) {
              countClickThreaded(null);
            }
          }
          else if (this.activeRation.type == 9) {
            countClickThreaded(this.custom.nid);
          } else {
            countClickThreaded(null);
          }
        }
      }
    }
  }
  
  public void onReceiveAd() {}
  
  public void onRefreshAd() {}
  
  protected void onWindowVisibilityChanged(int paramInt)
  {
    if (paramInt == 0)
    {
      if (!this.isRotating)
      {
        this.isRotating = true;
        rotateThreadedNow();
      }
      this.isVisible = true;
      return;
    }
    this.isVisible = false;
  }
  
  public void pushSubView(ViewGroup paramViewGroup)
  {
    try
    {
      this.superView.removeAllViews();
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      this.superView.addView(paramViewGroup, localLayoutParams);
      this.activeRation = this.nextRation;
      if (this.activeRation != null) {
        countImpressionThreaded();
      }
      this.showTime = System.currentTimeMillis();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public void rollover()
  {
    this.nextRation = this.guoheAdManager.getRollover();
    this.handler.post(this.adRunnable);
    Logger.i("layout rollover");
  }
  
  public void rolloverThreaded()
  {
    new Thread("Guohead SDK")
    {
      public void run()
      {
        GuoheAdLayout.this.nextRation = GuoheAdLayout.this.guoheAdManager.getRollover();
        GuoheAdLayout.this.handler.post(GuoheAdLayout.this.adRunnable);
      }
    }.start();
  }
  
  public void rotateAd()
  {
    if (!this.isVisible) {}
    for (;;)
    {
      return;
      Logger.i("Rotating Ad");
      try
      {
        this.nextRation = this.guoheAdManager.getRation();
        this.handler.post(this.adRunnable);
        if (this.guoheAdListener == null) {
          continue;
        }
        this.guoheAdListener.onRefreshAd();
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Logger.v("Rotating Ad Exception");
        }
      }
    }
  }
  
  public void rotateThreadedDelayed()
  {
    Logger.d("rotateThreadedDelayed()");
    new Thread("Guohead SDK")
    {
      public void run()
      {
        try
        {
          Logger.d("Will call rotateAd() in " + GuoheAdLayout.this.extra.cycleTime + " seconds");
          int i = GuoheAdLayout.this.extra.cycleTime;
          if (i < 30) {
            i = 30;
          }
          Thread.sleep(i * 1000);
        }
        catch (InterruptedException localInterruptedException)
        {
          for (;;)
          {
            Logger.e("Caught InterruptedException in rotateThreadedDelayed()" + localInterruptedException);
          }
        }
        GuoheAdLayout.this.rotateAd();
      }
    }.start();
  }
  
  public void rotateThreadedNow()
  {
    Logger.d("ratateThreadedNow()");
    new Thread("Guohead SDK")
    {
      public void run()
      {
        GuoheAdLayout.this.rotateAd();
      }
    }.start();
  }
  
  public void setGuoheAdInterface(GuoheAdInterface paramGuoheAdInterface)
  {
    this.guoheAdInterface = paramGuoheAdInterface;
  }
  
  public void setListener(GuoheAdStateListener paramGuoheAdStateListener)
  {
    this.guoheAdListener = paramGuoheAdStateListener;
  }
  
  public void setTextColor(int paramInt)
  {
    if (paramInt != 0) {}
    try
    {
      this.fgColor = paramInt;
      return;
    }
    catch (Exception localException)
    {
      Logger.e("Color format is wrong");
    }
  }
  
  public void setbackgroundColor(int paramInt)
  {
    if (paramInt != 0) {}
    try
    {
      this.bgColor = paramInt;
      return;
    }
    catch (Exception localException)
    {
      Logger.e("backgroundColor format is wrong");
    }
  }
  
  public static abstract interface GuoheAdInterface
  {
    public abstract void guoheAdGeneric();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.GuoheAdLayout
 * JD-Core Version:    0.7.0.1
 */