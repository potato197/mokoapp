package net.youmi.android;

import android.graphics.Color;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ViewSwitcher.ViewFactory;

class cf
  extends RelativeLayout
  implements GestureDetector.OnGestureListener, ViewSwitcher.ViewFactory, ff
{
  AdActivity a;
  GestureDetector b;
  int c = 350;
  long d = 0L;
  private String[] e;
  private String f;
  private String g;
  private ca h;
  private int i = 60;
  private Gallery j;
  private ImageSwitcher k;
  private ImageView l;
  private ImageView m;
  private cs n;
  private as o;
  private Animation p;
  private Animation q;
  private Animation r;
  private Animation s;
  private Animation t;
  private Animation u;
  
  cf(AdActivity paramAdActivity, ca paramca, String[] paramArrayOfString, String paramString1, String paramString2)
  {
    super(paramAdActivity);
    if (paramArrayOfString == null) {
      paramAdActivity.finish();
    }
    if (paramArrayOfString.length == 0) {
      paramAdActivity.finish();
    }
    this.a = paramAdActivity;
    this.e = paramArrayOfString;
    this.f = paramString1;
    this.g = paramString2;
    this.h = paramca;
    this.i = this.h.a(60);
    if (c())
    {
      d();
      e();
      return;
    }
    this.a.finish();
  }
  
  private boolean c()
  {
    this.n = cs.a(this.a, this.e, this.h.a(80));
    return this.n != null;
  }
  
  private void d()
  {
    setBackgroundColor(-1);
    this.k = new ImageSwitcher(this.a);
    this.k.setFactory(this);
    this.k.setBackgroundColor(Color.rgb(245, 245, 245));
    this.o = this.n.a(0);
    this.k.setImageURI(this.o.b);
    if (this.n.getCount() > 1)
    {
      this.j = new Gallery(this.a);
      this.j.setAdapter(this.n);
      this.j.setOnItemClickListener(new ah(this));
      this.b = new GestureDetector(this);
      this.k.setOnTouchListener(new v(this));
      this.k.setOnClickListener(new u(this));
    }
    this.l = new ImageView(this.a);
    this.l.setImageResource(17301586);
    this.l.setOnClickListener(new t(this));
    if (az.a(this.a))
    {
      this.m = new ImageView(this.a);
      this.m.setImageResource(17301582);
      this.m.setOnClickListener(new q(this));
    }
  }
  
  private void e()
  {
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams1.addRule(13);
    addView(this.k, localLayoutParams1);
    if (this.j != null)
    {
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams2.addRule(12);
      addView(this.j, localLayoutParams2);
    }
    RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams3.addRule(9);
    localLayoutParams3.addRule(10);
    addView(this.l, localLayoutParams3);
    if (this.m != null)
    {
      RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams4.addRule(10);
      localLayoutParams4.addRule(11);
      addView(this.m, localLayoutParams4);
    }
  }
  
  private void f()
  {
    try
    {
      if (this.k != null)
      {
        if (this.t == null) {
          this.t = AnimationUtils.loadAnimation(this.a, 17432576);
        }
        this.k.setInAnimation(this.t);
        if (this.u == null) {
          this.u = AnimationUtils.loadAnimation(this.a, 17432577);
        }
        this.k.setOutAnimation(this.u);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void g()
  {
    try
    {
      if (this.k != null)
      {
        if (this.p == null)
        {
          this.p = new TranslateAnimation(this.h.d(), 0.0F, 0.0F, 0.0F);
          this.p.setDuration(this.c);
        }
        this.k.setInAnimation(this.p);
        if (this.q == null)
        {
          this.q = new TranslateAnimation(0.0F, -this.h.d(), 0.0F, 0.0F);
          this.q.setDuration(this.c);
        }
        this.k.setOutAnimation(this.q);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void h()
  {
    try
    {
      if (this.k != null)
      {
        if (this.r == null)
        {
          this.r = new TranslateAnimation(-this.h.d(), 0.0F, 0.0F, 0.0F);
          this.r.setDuration(this.c);
        }
        this.k.setInAnimation(this.r);
        if (this.s == null)
        {
          this.s = new TranslateAnimation(0.0F, this.h.d(), 0.0F, 0.0F);
          this.s.setDuration(this.c);
        }
        this.k.setOutAnimation(this.s);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  public View b()
  {
    return this;
  }
  
  public void b_()
  {
    long l1 = System.currentTimeMillis();
    if (l1 - this.d > 5000L)
    {
      this.d = l1;
      ay.a(this.a, "再次按后退键返回");
      return;
    }
    this.a.a();
  }
  
  public View makeView()
  {
    ImageView localImageView = new ImageView(this.a);
    localImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    return localImageView;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  /* Error */
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 140	net/youmi/android/cf:j	Landroid/widget/Gallery;
    //   4: ifnull +272 -> 276
    //   7: aload_0
    //   8: getfield 86	net/youmi/android/cf:n	Lnet/youmi/android/cs;
    //   11: ifnull +265 -> 276
    //   14: aload_0
    //   15: getfield 140	net/youmi/android/cf:j	Landroid/widget/Gallery;
    //   18: invokevirtual 290	android/widget/Gallery:getSelectedItemPosition	()I
    //   21: istore 6
    //   23: aload_1
    //   24: invokevirtual 296	android/view/MotionEvent:getX	()F
    //   27: aload_2
    //   28: invokevirtual 296	android/view/MotionEvent:getX	()F
    //   31: fsub
    //   32: aload_0
    //   33: getfield 51	net/youmi/android/cf:i	I
    //   36: i2f
    //   37: fcmpl
    //   38: ifle +108 -> 146
    //   41: iload 6
    //   43: iconst_1
    //   44: iadd
    //   45: istore 7
    //   47: iload 7
    //   49: aload_0
    //   50: getfield 86	net/youmi/android/cf:n	Lnet/youmi/android/cs;
    //   53: invokevirtual 135	net/youmi/android/cs:getCount	()I
    //   56: if_icmplt +6 -> 62
    //   59: iconst_0
    //   60: istore 7
    //   62: iload 7
    //   64: iconst_m1
    //   65: if_icmple +211 -> 276
    //   68: iload 7
    //   70: aload_0
    //   71: getfield 86	net/youmi/android/cf:n	Lnet/youmi/android/cs;
    //   74: invokevirtual 135	net/youmi/android/cs:getCount	()I
    //   77: if_icmpge +199 -> 276
    //   80: aload_0
    //   81: getfield 140	net/youmi/android/cf:j	Landroid/widget/Gallery;
    //   84: iconst_0
    //   85: invokevirtual 299	android/widget/Gallery:setVisibility	(I)V
    //   88: aload_0
    //   89: getfield 140	net/youmi/android/cf:j	Landroid/widget/Gallery;
    //   92: iload 7
    //   94: invokevirtual 302	android/widget/Gallery:setSelection	(I)V
    //   97: aload_0
    //   98: invokespecial 304	net/youmi/android/cf:g	()V
    //   101: aload_0
    //   102: getfield 86	net/youmi/android/cf:n	Lnet/youmi/android/cs;
    //   105: iload 7
    //   107: invokevirtual 122	net/youmi/android/cs:a	(I)Lnet/youmi/android/as;
    //   110: astore 9
    //   112: aload 9
    //   114: ifnull +30 -> 144
    //   117: aload_0
    //   118: getfield 89	net/youmi/android/cf:o	Lnet/youmi/android/as;
    //   121: aload 9
    //   123: if_acmpeq +21 -> 144
    //   126: aload_0
    //   127: getfield 101	net/youmi/android/cf:k	Landroid/widget/ImageSwitcher;
    //   130: aload 9
    //   132: getfield 127	net/youmi/android/as:b	Landroid/net/Uri;
    //   135: invokevirtual 131	android/widget/ImageSwitcher:setImageURI	(Landroid/net/Uri;)V
    //   138: aload_0
    //   139: aload 9
    //   141: putfield 89	net/youmi/android/cf:o	Lnet/youmi/android/as;
    //   144: iconst_1
    //   145: ireturn
    //   146: aload_2
    //   147: invokevirtual 296	android/view/MotionEvent:getX	()F
    //   150: aload_1
    //   151: invokevirtual 296	android/view/MotionEvent:getX	()F
    //   154: fsub
    //   155: aload_0
    //   156: getfield 51	net/youmi/android/cf:i	I
    //   159: i2f
    //   160: fcmpl
    //   161: ifle +115 -> 276
    //   164: iload 6
    //   166: iconst_1
    //   167: isub
    //   168: istore 10
    //   170: iload 10
    //   172: ifge +14 -> 186
    //   175: iconst_m1
    //   176: aload_0
    //   177: getfield 86	net/youmi/android/cf:n	Lnet/youmi/android/cs;
    //   180: invokevirtual 135	net/youmi/android/cs:getCount	()I
    //   183: iadd
    //   184: istore 10
    //   186: iload 10
    //   188: iconst_m1
    //   189: if_icmple +87 -> 276
    //   192: iload 10
    //   194: aload_0
    //   195: getfield 86	net/youmi/android/cf:n	Lnet/youmi/android/cs;
    //   198: invokevirtual 135	net/youmi/android/cs:getCount	()I
    //   201: if_icmpge +75 -> 276
    //   204: aload_0
    //   205: getfield 140	net/youmi/android/cf:j	Landroid/widget/Gallery;
    //   208: iconst_0
    //   209: invokevirtual 299	android/widget/Gallery:setVisibility	(I)V
    //   212: aload_0
    //   213: getfield 140	net/youmi/android/cf:j	Landroid/widget/Gallery;
    //   216: iload 10
    //   218: invokevirtual 302	android/widget/Gallery:setSelection	(I)V
    //   221: aload_0
    //   222: invokespecial 306	net/youmi/android/cf:h	()V
    //   225: aload_0
    //   226: getfield 86	net/youmi/android/cf:n	Lnet/youmi/android/cs;
    //   229: iload 10
    //   231: invokevirtual 122	net/youmi/android/cs:a	(I)Lnet/youmi/android/as;
    //   234: astore 12
    //   236: aload 12
    //   238: ifnull -94 -> 144
    //   241: aload_0
    //   242: getfield 89	net/youmi/android/cf:o	Lnet/youmi/android/as;
    //   245: aload 12
    //   247: if_acmpeq -103 -> 144
    //   250: aload_0
    //   251: getfield 101	net/youmi/android/cf:k	Landroid/widget/ImageSwitcher;
    //   254: aload 12
    //   256: getfield 127	net/youmi/android/as:b	Landroid/net/Uri;
    //   259: invokevirtual 131	android/widget/ImageSwitcher:setImageURI	(Landroid/net/Uri;)V
    //   262: aload_0
    //   263: aload 12
    //   265: putfield 89	net/youmi/android/cf:o	Lnet/youmi/android/as;
    //   268: iconst_1
    //   269: ireturn
    //   270: astore 11
    //   272: iconst_1
    //   273: ireturn
    //   274: astore 5
    //   276: iconst_0
    //   277: ireturn
    //   278: astore 8
    //   280: iconst_1
    //   281: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	282	0	this	cf
    //   0	282	1	paramMotionEvent1	MotionEvent
    //   0	282	2	paramMotionEvent2	MotionEvent
    //   0	282	3	paramFloat1	float
    //   0	282	4	paramFloat2	float
    //   274	1	5	localException1	Exception
    //   21	147	6	i1	int
    //   45	61	7	i2	int
    //   278	1	8	localException2	Exception
    //   110	30	9	localas1	as
    //   168	62	10	i3	int
    //   270	1	11	localException3	Exception
    //   234	30	12	localas2	as
    // Exception table:
    //   from	to	target	type
    //   225	236	270	java/lang/Exception
    //   241	268	270	java/lang/Exception
    //   0	41	274	java/lang/Exception
    //   47	59	274	java/lang/Exception
    //   68	101	274	java/lang/Exception
    //   146	164	274	java/lang/Exception
    //   175	186	274	java/lang/Exception
    //   192	225	274	java/lang/Exception
    //   101	112	278	java/lang/Exception
    //   117	144	278	java/lang/Exception
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cf
 * JD-Core Version:    0.7.0.1
 */