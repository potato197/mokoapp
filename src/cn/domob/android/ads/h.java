package cn.domob.android.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.CycleInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ViewFlipper;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
  extends RelativeLayout
  implements Animation.AnimationListener, b, g.c, u
{
  private static final int A = Color.rgb(102, 102, 102);
  private static float c = -1.0F;
  private static Drawable i = null;
  private float B = -1.0F;
  protected g a;
  final f b;
  private View d;
  private long e = -1L;
  private boolean f;
  private Vector<String> g;
  private View h;
  private int j;
  private int k;
  private Rect l = null;
  private JSONObject m;
  private String n = "fr2l";
  private v o = null;
  private Hashtable<String, String> p = new Hashtable();
  private HashSet<i> q = new HashSet();
  private Hashtable<String, byte[]> r = new Hashtable();
  private Hashtable<String, String> s = new Hashtable();
  private d t = new d();
  private Vector<View> u = new Vector();
  private Vector<Bitmap> v = new Vector();
  private long w = -1L;
  private long x = -8682592L;
  private boolean y;
  private boolean z;
  
  protected h(g paramg, Context paramContext, f paramf, JSONObject paramJSONObject)
  {
    super(paramContext);
    this.b = paramf;
    this.j = -1;
    this.k = -1;
    this.w = paramf.o().a();
    this.x = paramf.o().b();
    this.y = paramf.o().c();
    this.z = paramf.o().d();
    if (c == -1.0F)
    {
      c = DomobAdManager.f(paramContext);
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "sDensity=" + c);
      }
    }
    this.d = new View(paramContext);
    this.d.setVisibility(4);
    addView(this.d);
    this.o = this.b.m();
    a(paramg);
    if (b(paramJSONObject)) {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "success to parse ad response.");
      }
    }
    while (!Log.isLoggable("DomobSDK", 3)) {
      return;
    }
    Log.e("DomobSDK", "checkMarkupResp error.");
  }
  
  private static float a(JSONObject paramJSONObject, String paramString, float paramFloat)
  {
    return (float)paramJSONObject.optDouble(paramString, paramFloat);
  }
  
  private static PointF a(JSONObject paramJSONObject, String paramString, PointF paramPointF)
  {
    if ((paramJSONObject != null) && (paramJSONObject.has(paramString))) {}
    try
    {
      JSONArray localJSONArray = paramJSONObject.getJSONArray(paramString);
      PointF localPointF = new PointF((float)localJSONArray.getDouble(0), (float)localJSONArray.getDouble(1));
      paramPointF = localPointF;
      return paramPointF;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
    return paramPointF;
  }
  
  /* Error */
  private Rect a(JSONObject paramJSONObject, String paramString, Rect paramRect)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +177 -> 178
    //   4: aload_1
    //   5: aload_2
    //   6: invokevirtual 230	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   9: ifeq +169 -> 178
    //   12: aload_1
    //   13: aload_2
    //   14: invokevirtual 234	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   17: astore 5
    //   19: aload 5
    //   21: iconst_0
    //   22: invokevirtual 242	org/json/JSONArray:getDouble	(I)D
    //   25: d2i
    //   26: istore 6
    //   28: aload 5
    //   30: iconst_1
    //   31: invokevirtual 242	org/json/JSONArray:getDouble	(I)D
    //   34: d2i
    //   35: istore 7
    //   37: iload 6
    //   39: aload 5
    //   41: iconst_2
    //   42: invokevirtual 242	org/json/JSONArray:getDouble	(I)D
    //   45: d2i
    //   46: iadd
    //   47: istore 8
    //   49: iload 7
    //   51: aload 5
    //   53: iconst_3
    //   54: invokevirtual 242	org/json/JSONArray:getDouble	(I)D
    //   57: d2i
    //   58: iadd
    //   59: istore 9
    //   61: new 251	android/graphics/Rect
    //   64: dup
    //   65: aload_0
    //   66: iload 6
    //   68: invokevirtual 254	cn/domob/android/ads/h:a	(I)I
    //   71: aload_0
    //   72: iload 7
    //   74: invokevirtual 254	cn/domob/android/ads/h:a	(I)I
    //   77: aload_0
    //   78: iload 8
    //   80: invokevirtual 254	cn/domob/android/ads/h:a	(I)I
    //   83: aload_0
    //   84: iload 9
    //   86: invokevirtual 254	cn/domob/android/ads/h:a	(I)I
    //   89: invokespecial 257	android/graphics/Rect:<init>	(IIII)V
    //   92: astore 10
    //   94: ldc 163
    //   96: iconst_3
    //   97: invokestatic 169	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   100: ifeq +75 -> 175
    //   103: ldc 163
    //   105: new 171	java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial 172	java/lang/StringBuilder:<init>	()V
    //   112: ldc_w 259
    //   115: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   118: aload 10
    //   120: getfield 262	android/graphics/Rect:left	I
    //   123: invokevirtual 265	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   126: ldc_w 267
    //   129: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: aload 10
    //   134: getfield 270	android/graphics/Rect:top	I
    //   137: invokevirtual 265	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   140: ldc_w 267
    //   143: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   146: aload 10
    //   148: getfield 273	android/graphics/Rect:right	I
    //   151: invokevirtual 265	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   154: ldc_w 267
    //   157: invokevirtual 178	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: aload 10
    //   162: getfield 276	android/graphics/Rect:bottom	I
    //   165: invokevirtual 265	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   168: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 188	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   174: pop
    //   175: aload 10
    //   177: astore_3
    //   178: aload_3
    //   179: areturn
    //   180: astore 4
    //   182: aload 4
    //   184: invokevirtual 248	org/json/JSONException:printStackTrace	()V
    //   187: aload_3
    //   188: areturn
    //   189: astore 11
    //   191: aload 10
    //   193: astore_3
    //   194: aload 11
    //   196: astore 4
    //   198: goto -16 -> 182
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	201	0	this	h
    //   0	201	1	paramJSONObject	JSONObject
    //   0	201	2	paramString	String
    //   0	201	3	paramRect	Rect
    //   180	3	4	localJSONException1	JSONException
    //   196	1	4	localObject	Object
    //   17	35	5	localJSONArray	JSONArray
    //   26	41	6	i1	int
    //   35	38	7	i2	int
    //   47	32	8	i3	int
    //   59	26	9	i4	int
    //   92	100	10	localRect	Rect
    //   189	6	11	localJSONException2	JSONException
    // Exception table:
    //   from	to	target	type
    //   12	94	180	org/json/JSONException
    //   94	175	189	org/json/JSONException
  }
  
  private View a(JSONObject paramJSONObject)
    throws JSONException
  {
    c localc = c.a(getContext());
    String str1 = paramJSONObject.getString("$");
    byte[] arrayOfByte;
    Bitmap localBitmap;
    Object localObject2;
    Object localObject1;
    label264:
    label270:
    int i1;
    if (str1 != null)
    {
      if (str1.startsWith("def_"))
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "load " + str1 + " from resources.");
        }
        String str2 = str1 + ".png";
        if (!d.b(localc, str1, str2, this.r))
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "failed to load image from resources, try the backup.");
          }
          String str3 = paramJSONObject.optString("def", null);
          if (str3 == null)
          {
            Log.e("DomobSDK", "no defined backup default resources!");
            return null;
          }
          if (!d.b(localc, str1, str3 + ".png", this.r))
          {
            Log.e("DomobSDK", "failed to load backup default resources!");
            return null;
          }
        }
      }
      arrayOfByte = (byte[])this.r.get(str1);
      if (arrayOfByte != null)
      {
        try
        {
          localBitmap = BitmapFactory.decodeByteArray(arrayOfByte, 0, arrayOfByte.length);
          if (localBitmap != null) {
            break label270;
          }
          Log.e("DomobSDK", "failed to decode Bitmap!");
          return null;
        }
        catch (Throwable localThrowable1)
        {
          localObject2 = localThrowable1;
          localObject1 = null;
        }
        ((Throwable)localObject2).printStackTrace();
        return localObject1.a();
        boolean bool = ((String)this.p.get(str1)).endsWith("gif");
        i1 = 0;
        if (bool)
        {
          if (!Log.isLoggable("DomobSDK", 3)) {
            break label421;
          }
          Log.d("DomobSDK", str1 + " is gif");
          break label421;
        }
      }
    }
    for (;;)
    {
      for (;;)
      {
        n localn = new n(getContext(), i1);
        try
        {
          localn.a(ImageView.ScaleType.FIT_XY);
          paramJSONObject.optBoolean("b", false);
          this.v.add(localBitmap);
          localn.a(localBitmap, arrayOfByte);
          localObject1 = localn;
        }
        catch (Throwable localThrowable2)
        {
          localObject1 = localn;
          localObject2 = localThrowable2;
        }
      }
      Log.e("DomobSDK", "can not create an imageView without $");
      localObject1 = null;
      break label264;
      break;
      label421:
      i1 = 1;
    }
  }
  
  private View a(JSONObject paramJSONObject, Rect paramRect)
    throws JSONException
  {
    try
    {
      float f1 = a(paramJSONObject, "ia", 1.0F);
      float f2 = a(paramJSONObject, "epy", 1.0F);
      int i1 = (int)this.x;
      String str = paramJSONObject.optString("bc", null);
      if ((str != null) && (!str.equals("")) && (!this.y))
      {
        i1 = (int)Long.parseLong(str, 16);
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "bgcolor is:" + i1);
        }
      }
      int i2 = i1;
      Bitmap localBitmap = Bitmap.createBitmap(paramRect.width(), paramRect.height(), Bitmap.Config.ARGB_8888);
      this.v.add(localBitmap);
      Canvas localCanvas = new Canvas(localBitmap);
      int i3 = (int)(255.0F * f1);
      int i4 = (int)(f2 * paramRect.height()) + paramRect.top;
      Rect localRect1 = new Rect(paramRect.left, paramRect.top, paramRect.right, i4);
      Paint localPaint1 = new Paint();
      localPaint1.setColor(-1);
      localPaint1.setStyle(Paint.Style.FILL);
      localCanvas.drawRect(localRect1, localPaint1);
      int[] arrayOfInt = { Color.argb(i3, Color.red(i2), Color.green(i2), Color.blue(i2)), i2 };
      GradientDrawable localGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, arrayOfInt);
      ((GradientDrawable)localGradientDrawable).setBounds(localRect1);
      ((GradientDrawable)localGradientDrawable).draw(localCanvas);
      Rect localRect2 = new Rect(paramRect.left, i4, paramRect.right, paramRect.bottom);
      Paint localPaint2 = new Paint();
      localPaint2.setColor(i2);
      localPaint2.setStyle(Paint.Style.FILL);
      localCanvas.drawRect(localRect2, localPaint2);
      View localView = new View(getContext());
      if (!this.y)
      {
        localView.setBackgroundDrawable(new BitmapDrawable(localBitmap));
        return localView;
      }
      localView.setBackgroundColor(i2);
      return localView;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return null;
  }
  
  private static b a(View paramView, RelativeLayout.LayoutParams paramLayoutParams, String paramString)
  {
    b localb = new b();
    localb.a = paramView;
    localb.b = paramLayoutParams;
    localb.c = paramString;
    return localb;
  }
  
  private static Vector<String> a(int paramInt1, int paramInt2, int paramInt3, long paramLong, Vector<String> paramVector)
  {
    if (paramVector == null) {
      paramVector = new Vector();
    }
    float f1 = (float)paramLong / 1000.0F;
    Object[] arrayOfObject2;
    if ((paramInt2 != -1) && (paramInt3 != -1))
    {
      arrayOfObject2 = new Object[4];
      arrayOfObject2[0] = Integer.valueOf(paramInt1);
      arrayOfObject2[1] = Integer.valueOf(paramInt2);
      arrayOfObject2[2] = Integer.valueOf(paramInt3);
      arrayOfObject2[3] = Float.valueOf(f1);
    }
    Object[] arrayOfObject1;
    for (String str = String.format("{%d, %d, %d, %f}", arrayOfObject2);; str = String.format("{%d, %f}", arrayOfObject1))
    {
      paramVector.add(str);
      return paramVector;
      arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt1);
      arrayOfObject1[1] = Float.valueOf(f1);
    }
  }
  
  private Vector<String> a(KeyEvent paramKeyEvent, Vector<String> paramVector)
  {
    int i1 = paramKeyEvent.getAction();
    long l1 = paramKeyEvent.getEventTime() - this.e;
    if ((i1 == 0) || (1 == i1)) {
      paramVector = a(i1, -1, -1, l1, paramVector);
    }
    return paramVector;
  }
  
  private Vector<String> a(MotionEvent paramMotionEvent, Vector<String> paramVector)
  {
    int i1 = paramMotionEvent.getAction();
    long l1 = paramMotionEvent.getEventTime() - this.e;
    return a(i1, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY(), l1, paramVector);
  }
  
  private static void a(View paramView, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject;
    String str;
    if ((paramView instanceof u))
    {
      u localu = (u)paramView;
      localJSONObject = localu.g();
      str = localu.f();
      if ((localJSONObject == null) || (str == null)) {}
    }
    try
    {
      paramJSONObject.put(str, localJSONObject);
      if ((paramView instanceof ViewGroup))
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "build tracker for view group!");
        }
        ViewGroup localViewGroup = (ViewGroup)paramView;
        for (int i1 = 0; i1 < localViewGroup.getChildCount(); i1++) {
          a(localViewGroup.getChildAt(i1), paramJSONObject);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.e("DomobSDK", "failed to build tracker!");
        localException.printStackTrace();
      }
    }
  }
  
  private boolean b(JSONObject paramJSONObject)
  {
    this.B = c;
    PointF localPointF = a(paramJSONObject, "d", null);
    if (localPointF == null) {
      localPointF = new PointF(320.0F, 48.0F);
    }
    if ((localPointF.x < 0.0F) || (localPointF.y < 0.0F)) {
      return false;
    }
    this.j = ((int)localPointF.x);
    this.k = ((int)localPointF.y);
    JSONObject localJSONObject = paramJSONObject.optJSONObject("markup");
    if (localJSONObject == null)
    {
      Log.e("DomobSDK", "there is no markup which is required!");
      return false;
    }
    this.m = localJSONObject;
    try
    {
      q();
      s();
      if (r()) {
        o();
      }
      return true;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  private Drawable c(g paramg)
  {
    if (paramg == null)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "failed to getBackground, engine is null!");
      }
      return null;
    }
    if (i != null)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "already has background bitmap!");
      }
      return i;
    }
    try
    {
      Rect localRect = p();
      Bitmap localBitmap = Bitmap.createBitmap(localRect.width(), localRect.height(), Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap);
      Paint localPaint = new Paint();
      localPaint.setColor(-1147097);
      localPaint.setStyle(Paint.Style.FILL);
      localCanvas.drawRect(localRect, localPaint);
      int[] arrayOfInt = { Color.argb(Color.alpha(-1147097), Color.red(-1147097), Color.green(-1147097), Color.blue(-1147097)), -1147097 };
      GradientDrawable localGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, arrayOfInt);
      int i1 = (int)(0.4375D * localRect.height()) + localRect.top;
      ((GradientDrawable)localGradientDrawable).setBounds(localRect.left, localRect.top, localRect.right, i1);
      ((GradientDrawable)localGradientDrawable).draw(localCanvas);
      localCanvas.drawRect(new Rect(localRect.left, i1, localRect.right, localRect.bottom), localPaint);
      BitmapDrawable localBitmapDrawable = new BitmapDrawable(localBitmap);
      localBitmapDrawable.setAlpha(128);
      return localBitmapDrawable;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  protected static float d()
  {
    return c;
  }
  
  private boolean k()
  {
    return (this.a != null) && (SystemClock.uptimeMillis() - this.e > 0L);
  }
  
  private void l()
  {
    JSONObject localJSONObject;
    if ((this.a != null) && (isPressed()))
    {
      setPressed(false);
      if (!this.f)
      {
        this.f = true;
        localJSONObject = m();
        if (this.h == null) {
          break label187;
        }
        AnimationSet localAnimationSet = new AnimationSet(true);
        float f1 = this.h.getWidth() / 2.0F;
        float f2 = this.h.getHeight() / 2.0F;
        ScaleAnimation localScaleAnimation1 = new ScaleAnimation(1.0F, 1.2F, 1.0F, 1.2F, f1, f2);
        localScaleAnimation1.setDuration(200L);
        localAnimationSet.addAnimation(localScaleAnimation1);
        ScaleAnimation localScaleAnimation2 = new ScaleAnimation(1.2F, 0.001F, 1.2F, 0.001F, f1, f2);
        localScaleAnimation2.setDuration(299L);
        localScaleAnimation2.setStartOffset(200L);
        localScaleAnimation2.setAnimationListener(this);
        localAnimationSet.addAnimation(localScaleAnimation2);
        postDelayed(new c(localJSONObject, this), 500L);
        this.h.startAnimation(localAnimationSet);
      }
    }
    return;
    label187:
    post(new c(localJSONObject, this));
  }
  
  private JSONObject m()
  {
    try
    {
      JSONObject localJSONObject1 = new JSONObject();
      a(this, localJSONObject1);
      localJSONObject1.put("screen", "unknown");
      int[] arrayOfInt = new int[2];
      getLocationOnScreen(arrayOfInt);
      String[] arrayOfString1 = new String[4];
      arrayOfString1[0] = Integer.toString(arrayOfInt[0]);
      arrayOfString1[1] = Integer.toString(arrayOfInt[1]);
      arrayOfString1[2] = Integer.toString(getWidth());
      arrayOfString1[3] = Integer.toString(getHeight());
      localJSONObject1.put("rect", new JSONArray(Arrays.asList(arrayOfString1)));
      String[] arrayOfString2 = new String[2];
      arrayOfString2[0] = Integer.toString(DomobAdManager.g(getContext()));
      arrayOfString2[1] = Integer.toString(DomobAdManager.h(getContext()));
      localJSONObject1.put("screen_size", new JSONArray(Arrays.asList(arrayOfString2)));
      localJSONObject2 = new JSONObject();
      Log.e("DomobSDK", "failed to get interactions!");
    }
    catch (Exception localException1)
    {
      try
      {
        localJSONObject2.put("interactions", localJSONObject1);
        return localJSONObject2;
      }
      catch (Exception localException3)
      {
        JSONObject localJSONObject2;
        Exception localException2;
        break label184;
      }
      localException1 = localException1;
      localJSONObject2 = null;
      localException2 = localException1;
    }
    label184:
    localException2.printStackTrace();
    return localJSONObject2;
  }
  
  private JSONObject n()
  {
    Vector localVector = this.g;
    JSONObject localJSONObject = null;
    if (localVector != null) {
      localJSONObject = new JSONObject();
    }
    try
    {
      localJSONObject.put("touches", new JSONArray(this.g));
      return localJSONObject;
    }
    catch (Exception localException)
    {
      Log.e("DomobSDK", "failed to get touch events!");
      localException.printStackTrace();
    }
    return localJSONObject;
  }
  
  private void o()
  {
    if (this.b.j()) {
      return;
    }
    if (this.m == null)
    {
      Log.e("DomobSDK", "can not build view without markup!");
      return;
    }
    i1 = 1;
    try
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "build view with markup.");
      }
      localJSONArray1 = this.m.getJSONArray("v");
      if (localJSONArray1 == null) {
        break label1102;
      }
      locala = new a(this, this.a);
      i2 = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        JSONArray localJSONArray1;
        a locala;
        int i2;
        JSONObject localJSONObject;
        String str2;
        Rect localRect;
        float f1;
        JSONArray localJSONArray2;
        JSONArray localJSONArray3;
        Typeface localTypeface1;
        int i6;
        int i7;
        String str7;
        Typeface localTypeface2;
        String str4;
        int i3;
        int i4;
        boolean bool1;
        float f2;
        boolean bool2;
        String str5;
        Vector localVector2;
        int i5;
        String str6;
        s locals2;
        Object localObject;
        Vector localVector1;
        String str3;
        RelativeLayout.LayoutParams localLayoutParams;
        Iterator localIterator;
        localException.printStackTrace();
        i1 = 0;
        continue;
        if (localObject != null)
        {
          b localb2 = a((View)localObject, localLayoutParams, str3);
          locala.a.add(localb2);
          if ((localJSONObject.optBoolean("cav")) && (localObject != null) && (localObject != this.h))
          {
            this.h = ((View)localObject);
            break label1203;
            if (this.o == null) {
              continue;
            }
            Log.e("DomobSDK", "can not build view because jason array of views is null!");
            this.o.a();
            continue;
            localObject = null;
            str3 = null;
            localVector1 = null;
            continue;
            localVector2 = null;
            break label1166;
            i4 = i3;
            continue;
            localTypeface2 = localTypeface1;
            continue;
            i7++;
            continue;
            s locals1 = null;
            i5 = 0;
            continue;
            for (;;)
            {
              i5++;
              break;
              locals1 = locals2;
            }
            localVector1 = localVector2;
            localObject = locals1;
            str3 = str5;
            continue;
          }
        }
        i1 = 1;
        continue;
        i2++;
      }
    }
    if (i2 < localJSONArray1.length())
    {
      localJSONObject = localJSONArray1.getJSONObject(i2);
      str2 = localJSONObject.getString("t");
      localRect = a(localJSONObject, "f", this.l);
      if (!"l".equals(str2)) {
        break label818;
      }
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "build text view.");
      }
      f1 = a(localJSONObject, "fs", 14.0F);
      localJSONArray2 = localJSONObject.optJSONArray("fa");
      localJSONArray3 = localJSONObject.optJSONArray("x");
      localTypeface1 = Typeface.DEFAULT;
      if (localJSONArray2 == null) {
        break label1153;
      }
      i6 = 0;
      i7 = 0;
      if (i7 < localJSONArray2.length())
      {
        str7 = localJSONArray2.getString(i7);
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "fa:[" + i7 + "] = " + str7);
        }
        if ("b".equals(str7))
        {
          i6 |= 0x1;
          break label1160;
        }
        if ("i".equals(str7))
        {
          i6 |= 0x2;
          break label1160;
        }
        if ("m".equals(str7))
        {
          localTypeface1 = Typeface.MONOSPACE;
          break label1160;
        }
        if ("s".equals(str7))
        {
          localTypeface1 = Typeface.SERIF;
          break label1160;
        }
        if (!"ss".equals(str7)) {
          break label1160;
        }
        localTypeface1 = Typeface.SANS_SERIF;
        break label1160;
      }
      localTypeface2 = Typeface.create(localTypeface1, i6);
      str4 = localJSONObject.optString("fc", null);
      i3 = (int)this.w;
      if ((str4 == null) || (this.z)) {
        break label1146;
      }
      i4 = (int)Long.parseLong(str4, 16);
      bool1 = localJSONObject.optBoolean("dnv", true);
      f2 = a(localJSONObject, "mfs", 12.0F);
      bool2 = localJSONObject.has("at");
      str5 = null;
      if (bool2) {
        str5 = localJSONObject.getString("at");
      }
      if (localJSONArray3 == null) {
        break label805;
      }
      if (localJSONArray3.length() <= 1) {
        break label1140;
      }
      localVector2 = new Vector();
      break label1166;
      if (i5 >= localJSONArray3.length()) {
        break label1188;
      }
      str6 = localJSONArray3.getString(i5);
      locals2 = new s(getContext(), c);
      locals2.b = bool1;
      locals2.a = (f2 * locals2.c);
      locals2.setText(str6);
      locals2.setTextColor(i4);
      locals2.setTextSize(1, f1);
      locals2.setTypeface(localTypeface2);
      locals2.setSingleLine();
      locals2.setEllipsize(TextUtils.TruncateAt.END);
      if (localVector2 == null) {
        break label1181;
      }
      localVector2.add(locals2);
      break label1175;
    }
    for (;;)
    {
      if ((localObject != null) || (localVector1 != null)) {
        break label926;
      }
      Log.d("DomobSDK", "failed to build view");
      i1 = 0;
      if (i1 != 0) {
        break label1208;
      }
      Log.e("DomobSDK", "failed to build view, callback!");
      if (this.o != null) {
        this.o.a();
      }
      if (i1 == 1)
      {
        String str1 = this.m.optString("tat", null);
        if (str1 != null)
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "setTransAnimType:" + str1);
          }
          this.n = str1;
        }
        DomobAdView.b.post(locala);
      }
      if (i1 == 0)
      {
        Log.d("DomobSDK", "failed to build view, clear all bmps and views!");
        j();
      }
      if (this.q != null)
      {
        this.q.clear();
        this.q = null;
      }
      if (this.r != null)
      {
        this.r.clear();
        this.r = null;
      }
      if (this.s == null) {
        break;
      }
      this.s.clear();
      this.s = null;
      return;
      label805:
      str3 = str5;
      localObject = null;
      localVector1 = null;
      continue;
      label818:
      if ("bg".equals(str2))
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "build background view.");
        }
        localObject = a(localJSONObject, localRect);
        str3 = null;
        localVector1 = null;
      }
      else
      {
        if (!"i".equals(str2)) {
          break label1128;
        }
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "build image view.");
        }
        View localView = a(localJSONObject);
        this.u.add(localView);
        localObject = localView;
        str3 = null;
        localVector1 = null;
      }
    }
    label926:
    localLayoutParams = new RelativeLayout.LayoutParams(localRect.width(), localRect.height());
    localLayoutParams.addRule(9);
    localLayoutParams.addRule(10);
    localLayoutParams.setMargins(localRect.left, localRect.top, 0, 0);
    if (localVector1 != null)
    {
      localIterator = localVector1.iterator();
      while (localIterator.hasNext())
      {
        b localb1 = a((View)localIterator.next(), localLayoutParams, str3);
        locala.a.add(localb1);
      }
    }
  }
  
  private Rect p()
  {
    if (this.l == null) {
      this.l = new Rect(0, 0, a(this.j), a(this.k));
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "getRect :" + this.l.left + "," + this.l.top + "," + this.l.right + "," + this.l.bottom);
    }
    return this.l;
  }
  
  private void q()
    throws JSONException
  {
    JSONObject localJSONObject = this.m.optJSONObject("$");
    if (localJSONObject != null)
    {
      Iterator localIterator = localJSONObject.keys();
      if (this.q != null) {
        for (;;)
        {
          Context localContext;
          c localc;
          String str1;
          String str2;
          String str3;
          synchronized (this.q)
          {
            localContext = getContext();
            localc = c.a(localContext);
            if (!localIterator.hasNext()) {
              break;
            }
            str1 = (String)localIterator.next();
            str2 = localJSONObject.getJSONObject(str1).optString("u", null);
            if ((str1 == null) || (str2 == null)) {
              continue;
            }
            int i1 = str2.lastIndexOf('/');
            if ((i1 <= 0) || (i1 + 1 >= str2.length())) {
              break label361;
            }
            str3 = str2.substring(i1 + 1);
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "image name:" + str3);
            }
            this.s.put(str1, str3);
            String str4 = str2.substring(1 + str2.lastIndexOf("."), str2.length());
            this.p.put(str1, str4);
            if (str1.startsWith("def_"))
            {
              if (!d.b(localc, str1, str3, this.r)) {
                break label361;
              }
              if (!Log.isLoggable("DomobSDK", 3)) {
                continue;
              }
              Log.d("DomobSDK", "load " + str3 + " from resources.");
            }
          }
          if (d.a(localc, str1, str3, this.r))
          {
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "load " + str3 + " from cache.");
            }
          }
          else
          {
            label361:
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "need download " + str1 + " from server " + str2);
            }
            i locali = a.a(str2, str1, r.a(localContext), DomobAdManager.b(localContext), this);
            locali.a(localContext);
            this.q.add(locali);
          }
        }
      }
    }
  }
  
  private boolean r()
  {
    if ((this.q == null) || (this.q.size() == 0)) {}
    for (boolean bool = true;; bool = false)
    {
      if ((!bool) && (Log.isLoggable("DomobSDK", 3))) {
        Log.d("DomobSDK", "there are " + this.q.size() + " connection left.");
      }
      return bool;
    }
  }
  
  private void s()
  {
    if (this.q != null) {
      synchronized (this.q)
      {
        Iterator localIterator = this.q.iterator();
        if (localIterator.hasNext()) {
          ((i)localIterator.next()).b();
        }
      }
    }
  }
  
  protected final int a(int paramInt)
  {
    if (this.B <= 0.0D) {}
    for (float f1 = paramInt;; f1 = paramInt * this.B) {
      return (int)f1;
    }
  }
  
  public final void a()
  {
    post(new d(this));
  }
  
  protected final void a(g paramg)
  {
    this.a = paramg;
    if (this.a == null)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "engine is null, focusable & clickable is false.");
      }
      setFocusable(false);
      setClickable(false);
      return;
    }
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "focusable & clickable is true.");
    }
    this.a.a(this);
    setFocusable(true);
    setClickable(true);
  }
  
  public final void a(i parami)
  {
    String str1 = parami.c();
    byte[] arrayOfByte = parami.d();
    String str2;
    c localc;
    if (arrayOfByte != null)
    {
      this.r.put(str1, arrayOfByte);
      str2 = (String)this.s.get(str1);
      if (str2 != null)
      {
        localc = c.a(getContext());
        if (!str2.startsWith("def_")) {
          break label113;
        }
        c.a(localc, str2, arrayOfByte, System.currentTimeMillis());
      }
    }
    for (;;)
    {
      if (this.q != null) {}
      synchronized (this.q)
      {
        this.q.remove(parami);
        if (r()) {
          o();
        }
        return;
        label113:
        d.a(localc, str2, arrayOfByte);
        continue;
        if (!Log.isLoggable("DomobSDK", 3)) {
          continue;
        }
        Log.d("DomobSDK", "Failed reading asset(" + str1 + ") for ad");
      }
    }
  }
  
  protected final String b()
  {
    return this.n;
  }
  
  final void b(g paramg)
  {
    if (this.o != null) {
      this.o.a(paramg);
    }
  }
  
  protected final g c()
  {
    return this.a;
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "dispatchTouchEvent");
    }
    if (k())
    {
      if ((this.a == null) || (p().contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))) {
        break label168;
      }
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "dispatch touch event is out of ad rect!");
      }
    }
    label168:
    for (boolean bool = false;; bool = true)
    {
      int i1 = paramMotionEvent.getAction();
      if (bool)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "should record dispatch touch event!");
        }
        this.g = a(paramMotionEvent, this.g);
      }
      if (i1 == 0) {
        setPressed(bool);
      }
      for (;;)
      {
        return super.onTouchEvent(paramMotionEvent);
        if (2 == i1)
        {
          setPressed(bool);
        }
        else if (1 == i1)
        {
          if ((isPressed()) && (bool)) {
            l();
          }
          setPressed(false);
        }
      }
    }
  }
  
  public final boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "dispatchTrackballEvent");
    }
    int i1;
    if (k())
    {
      this.g = a(paramMotionEvent, this.g);
      i1 = paramMotionEvent.getAction();
      if (i1 != 0) {
        break label58;
      }
      setPressed(true);
    }
    for (;;)
    {
      return super.onTrackballEvent(paramMotionEvent);
      label58:
      if (1 == i1)
      {
        if (hasFocus()) {
          l();
        }
        setPressed(false);
      }
    }
  }
  
  protected final void e()
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "show click anim view of builder");
    }
    this.f = false;
    if (this.h != null) {
      this.h.setVisibility(0);
    }
  }
  
  public final String f()
  {
    return "container";
  }
  
  public final JSONObject g()
  {
    return n();
  }
  
  protected final int h()
  {
    return this.j;
  }
  
  protected final int i()
  {
    return this.k;
  }
  
  public final void j()
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "clear engine resources.");
    }
    if (this.a != null)
    {
      this.a.e();
      this.a = null;
    }
    if (this.v != null)
    {
      Iterator localIterator2 = this.v.iterator();
      while (localIterator2.hasNext())
      {
        Bitmap localBitmap = (Bitmap)localIterator2.next();
        if (localBitmap != null) {
          localBitmap.recycle();
        }
      }
      this.v.clear();
      this.v = null;
    }
    if (this.u != null)
    {
      Iterator localIterator1 = this.u.iterator();
      while (localIterator1.hasNext())
      {
        View localView = (View)localIterator1.next();
        if (localView != null) {
          if ((localView instanceof cn.domob.android.ads.b.d)) {
            ((cn.domob.android.ads.b.d)localView).a();
          } else if ((localView instanceof ImageView)) {
            ((ImageView)localView).setImageBitmap(null);
          }
        }
      }
      this.u.clear();
      this.u = null;
    }
  }
  
  public final void onAnimationEnd(Animation paramAnimation) {}
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
  
  protected final void onDraw(Canvas paramCanvas)
  {
    if ((isPressed()) || (isFocused())) {
      paramCanvas.clipRect(3, 3, -3 + getWidth(), -3 + getHeight());
    }
    super.onDraw(paramCanvas);
    if (this.e == -1L) {
      this.e = SystemClock.uptimeMillis();
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "onKeyDown:" + paramInt + "|" + paramKeyEvent);
    }
    if ((66 == paramInt) || (23 == paramInt))
    {
      this.g = a(paramKeyEvent, this.g);
      setPressed(true);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "onKeyUp:" + paramInt + "|" + paramKeyEvent);
    }
    if ((k()) && ((66 == paramInt) || (23 == paramInt)))
    {
      this.g = a(paramKeyEvent, this.g);
      l();
    }
    setPressed(false);
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final void setPressed(boolean paramBoolean)
  {
    if ((this.f) && (paramBoolean)) {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "already pressed and clicked!");
      }
    }
    while (isPressed() == paramBoolean) {
      return;
    }
    if (paramBoolean)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "press down, show hightlight");
      }
      if (this.d != null)
      {
        Drawable localDrawable = c(this.a);
        i = localDrawable;
        if (localDrawable != null) {
          this.d.setBackgroundDrawable(i);
        }
        this.d.bringToFront();
      }
      this.d.setVisibility(0);
    }
    for (;;)
    {
      super.setPressed(paramBoolean);
      invalidate();
      return;
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "press up, hide highlight");
      }
      this.d.setVisibility(4);
    }
  }
  
  final class a
    implements Runnable
  {
    Vector<h.b> a;
    private h b;
    private g c;
    
    public a(h paramh, g paramg)
    {
      this.b = paramh;
      this.c = paramg;
      this.a = new Vector();
    }
    
    public final void run()
    {
      ViewFlipper localViewFlipper;
      RelativeLayout.LayoutParams localLayoutParams;
      for (;;)
      {
        h.b localb;
        try
        {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "AddViewThread run");
          }
          localViewFlipper = null;
          if (this.b == null) {
            break label1045;
          }
          this.b.setPadding(0, 0, 0, 0);
          Iterator localIterator = this.a.iterator();
          localLayoutParams = null;
          if (!localIterator.hasNext()) {
            break;
          }
          localb = (h.b)localIterator.next();
          if ((localb.a != null) && (localb.b != null)) {
            break label142;
          }
          if (!Log.isLoggable("DomobSDK", 3)) {
            continue;
          }
          Log.d("DomobSDK", "Basic View element is null, continue.");
          continue;
          if (this.a == null) {
            break label141;
          }
        }
        catch (Exception localException)
        {
          Log.e("DomobSDK", "failed to add view into builder!");
          localException.printStackTrace();
          h.this.j();
        }
        this.a.clear();
        label141:
        return;
        label142:
        if (localb.c != null)
        {
          AnimationSet localAnimationSet;
          if (localViewFlipper == null)
          {
            localViewFlipper = new ViewFlipper(this.b.getContext());
            if (!"l2r".equals(localb.c)) {
              break label307;
            }
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "set text anim:" + localb.c);
            }
            TranslateAnimation localTranslateAnimation6 = new TranslateAnimation(-100.0F, 0.0F, 0.0F, 0.0F);
            localTranslateAnimation6.setDuration(3000L);
            localTranslateAnimation6.setInterpolator(new AccelerateInterpolator());
            localTranslateAnimation6.setFillAfter(true);
            localAnimationSet = new AnimationSet(true);
            localAnimationSet.addAnimation(localTranslateAnimation6);
          }
          for (;;)
          {
            localViewFlipper.setInAnimation(localAnimationSet);
            localViewFlipper.addView(localb.a, localb.b);
            localLayoutParams = localb.b;
            break;
            label307:
            if ("r2l".equals(localb.c))
            {
              if (Log.isLoggable("DomobSDK", 3)) {
                Log.d("DomobSDK", "set text anim:" + localb.c);
              }
              TranslateAnimation localTranslateAnimation5 = new TranslateAnimation(100.0F, 0.0F, 0.0F, 0.0F);
              localTranslateAnimation5.setDuration(3000L);
              localTranslateAnimation5.setInterpolator(new AccelerateInterpolator());
              localTranslateAnimation5.setFillAfter(true);
              localAnimationSet = new AnimationSet(true);
              localAnimationSet.addAnimation(localTranslateAnimation5);
            }
            else if ("t2b".equals(localb.c))
            {
              if (Log.isLoggable("DomobSDK", 3)) {
                Log.d("DomobSDK", "set text anim:" + localb.c);
              }
              TranslateAnimation localTranslateAnimation4 = new TranslateAnimation(0.0F, 0.0F, -50.0F, 0.0F);
              localTranslateAnimation4.setDuration(2500L);
              localTranslateAnimation4.setInterpolator(new AccelerateInterpolator());
              localTranslateAnimation4.setFillAfter(true);
              AlphaAnimation localAlphaAnimation2 = new AlphaAnimation(0.0F, 1.0F);
              localAlphaAnimation2.setDuration(500L);
              localAlphaAnimation2.setInterpolator(new AccelerateInterpolator());
              localAlphaAnimation2.setFillAfter(true);
              localAnimationSet = new AnimationSet(true);
              localAnimationSet.addAnimation(localTranslateAnimation4);
              localAnimationSet.addAnimation(localAlphaAnimation2);
            }
            else if ("b2t".equals(localb.c))
            {
              if (Log.isLoggable("DomobSDK", 3)) {
                Log.d("DomobSDK", "set text anim:" + localb.c);
              }
              TranslateAnimation localTranslateAnimation3 = new TranslateAnimation(0.0F, 0.0F, 50.0F, 0.0F);
              localTranslateAnimation3.setDuration(2500L);
              localTranslateAnimation3.setInterpolator(new AccelerateInterpolator());
              localTranslateAnimation3.setFillAfter(true);
              AlphaAnimation localAlphaAnimation1 = new AlphaAnimation(0.0F, 1.0F);
              localAlphaAnimation1.setDuration(500L);
              localAlphaAnimation1.setInterpolator(new AccelerateInterpolator());
              localAlphaAnimation1.setFillAfter(true);
              localAnimationSet = new AnimationSet(true);
              localAnimationSet.addAnimation(localTranslateAnimation3);
              localAnimationSet.addAnimation(localAlphaAnimation1);
            }
            else if ("shx".equals(localb.c))
            {
              if (Log.isLoggable("DomobSDK", 3)) {
                Log.d("DomobSDK", "set text anim:" + localb.c);
              }
              TranslateAnimation localTranslateAnimation2 = new TranslateAnimation(30.0F, 50.0F, 0.0F, 0.0F);
              localTranslateAnimation2.setDuration(3000L);
              localTranslateAnimation2.setInterpolator(new CycleInterpolator(2.0F));
              localTranslateAnimation2.setFillAfter(true);
              localAnimationSet = new AnimationSet(false);
              localAnimationSet.addAnimation(localTranslateAnimation2);
            }
            else
            {
              boolean bool = "shy".equals(localb.c);
              localAnimationSet = null;
              if (bool)
              {
                if (Log.isLoggable("DomobSDK", 3)) {
                  Log.d("DomobSDK", "set text anim:" + localb.c);
                }
                TranslateAnimation localTranslateAnimation1 = new TranslateAnimation(0.0F, 0.0F, -3.0F, 10.0F);
                localTranslateAnimation1.setDuration(3000L);
                localTranslateAnimation1.setInterpolator(new CycleInterpolator(2.0F));
                localTranslateAnimation1.setFillAfter(true);
                localAnimationSet = new AnimationSet(false);
                localAnimationSet.addAnimation(localTranslateAnimation1);
              }
            }
          }
        }
        this.b.addView(localb.a, localb.b);
      }
      if (localViewFlipper != null)
      {
        if (localViewFlipper.getChildCount() <= 1) {
          break label1066;
        }
        localViewFlipper.setFlipInterval(10000);
      }
      for (;;)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "add flipper.");
        }
        localViewFlipper.startFlipping();
        this.b.addView(localViewFlipper, localLayoutParams);
        this.b.invalidate();
        this.b.requestLayout();
        label1045:
        if (this.c == null) {
          break;
        }
        h.this.b(this.c);
        break;
        label1066:
        localViewFlipper.setFlipInterval(600000);
      }
    }
  }
  
  static final class b
  {
    public View a;
    public RelativeLayout.LayoutParams b;
    public String c;
  }
  
  public static final class c
    extends Thread
  {
    private JSONObject a;
    private h b;
    
    public c(JSONObject paramJSONObject, h paramh)
    {
      t.a("ClickThread created.");
      this.a = paramJSONObject;
      this.b = paramh;
    }
    
    public final void run()
    {
      try
      {
        if ((this.b != null) && (this.b.a != null))
        {
          if (this.b.b != null)
          {
            if (Log.isLoggable("DomobSDK", 3)) {
              Log.d("DomobSDK", "performClick");
            }
            this.b.a.a();
          }
          this.b.a.a(this.a);
        }
        return;
      }
      catch (Exception localException)
      {
        Log.e("DomobSDK", "failed to report click!");
        localException.printStackTrace();
      }
    }
  }
  
  public static final class d
    implements Runnable
  {
    private h a = null;
    
    public d(h paramh)
    {
      this.a = paramh;
    }
    
    public final void run()
    {
      if (this.a != null) {
        this.a.e();
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.h
 * JD-Core Version:    0.7.0.1
 */