package net.youmi.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.ArrayList;

class cs
  extends BaseAdapter
{
  Context a;
  private ArrayList b;
  private int c;
  
  private cs(Context paramContext)
  {
    this.a = paramContext;
  }
  
  /* Error */
  static cs a(Context paramContext, java.lang.String[] paramArrayOfString, int paramInt)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: aload_1
    //   7: arraylength
    //   8: iconst_1
    //   9: if_icmplt -5 -> 4
    //   12: new 2	net/youmi/android/cs
    //   15: dup
    //   16: aload_0
    //   17: invokespecial 22	net/youmi/android/cs:<init>	(Landroid/content/Context;)V
    //   20: astore 4
    //   22: iload_2
    //   23: ifgt +6 -> 29
    //   26: bipush 100
    //   28: istore_2
    //   29: aload 4
    //   31: iload_2
    //   32: putfield 24	net/youmi/android/cs:c	I
    //   35: iconst_0
    //   36: istore 5
    //   38: iload 5
    //   40: aload_1
    //   41: arraylength
    //   42: if_icmplt +14 -> 56
    //   45: aload 4
    //   47: invokevirtual 28	net/youmi/android/cs:getCount	()I
    //   50: ifle -46 -> 4
    //   53: aload 4
    //   55: areturn
    //   56: aload_1
    //   57: iload 5
    //   59: aaload
    //   60: astore 6
    //   62: new 30	java/io/File
    //   65: dup
    //   66: aload 6
    //   68: invokespecial 33	java/io/File:<init>	(Ljava/lang/String;)V
    //   71: invokevirtual 37	java/io/File:exists	()Z
    //   74: istore 7
    //   76: iload 7
    //   78: ifne +9 -> 87
    //   81: iinc 5 1
    //   84: goto -46 -> 38
    //   87: iconst_2
    //   88: istore 8
    //   90: new 39	android/graphics/BitmapFactory$Options
    //   93: dup
    //   94: invokespecial 40	android/graphics/BitmapFactory$Options:<init>	()V
    //   97: astore 9
    //   99: aload 9
    //   101: iconst_1
    //   102: putfield 44	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   105: aload 6
    //   107: aload 9
    //   109: invokestatic 50	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   112: pop
    //   113: aload 9
    //   115: getfield 53	android/graphics/BitmapFactory$Options:outWidth	I
    //   118: istore 12
    //   120: aload 9
    //   122: getfield 56	android/graphics/BitmapFactory$Options:outHeight	I
    //   125: istore 13
    //   127: iload 12
    //   129: ifle +21 -> 150
    //   132: iload 13
    //   134: ifle +16 -> 150
    //   137: iload 12
    //   139: iload 13
    //   141: if_icmplt +104 -> 245
    //   144: iload 12
    //   146: iload_2
    //   147: idiv
    //   148: istore 8
    //   150: aload 9
    //   152: iconst_0
    //   153: putfield 44	android/graphics/BitmapFactory$Options:inJustDecodeBounds	Z
    //   156: aload 9
    //   158: iload 8
    //   160: putfield 59	android/graphics/BitmapFactory$Options:inSampleSize	I
    //   163: aload 6
    //   165: aload 9
    //   167: invokestatic 50	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   170: astore 14
    //   172: aload 14
    //   174: ifnull -93 -> 81
    //   177: new 61	net/youmi/android/as
    //   180: dup
    //   181: invokespecial 62	net/youmi/android/as:<init>	()V
    //   184: astore 15
    //   186: aload 15
    //   188: aload 6
    //   190: putfield 65	net/youmi/android/as:a	Ljava/lang/String;
    //   193: aload 15
    //   195: new 67	java/lang/StringBuilder
    //   198: dup
    //   199: ldc 69
    //   201: invokespecial 70	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   204: aload 6
    //   206: invokevirtual 74	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: invokevirtual 78	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   212: invokestatic 84	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   215: putfield 87	net/youmi/android/as:b	Landroid/net/Uri;
    //   218: aload 15
    //   220: aload 9
    //   222: getfield 90	android/graphics/BitmapFactory$Options:outMimeType	Ljava/lang/String;
    //   225: putfield 93	net/youmi/android/as:d	Ljava/lang/String;
    //   228: aload 15
    //   230: aload 14
    //   232: putfield 96	net/youmi/android/as:c	Landroid/graphics/Bitmap;
    //   235: aload 4
    //   237: aload 15
    //   239: invokespecial 99	net/youmi/android/cs:a	(Lnet/youmi/android/as;)V
    //   242: goto -161 -> 81
    //   245: iload 13
    //   247: iload_2
    //   248: idiv
    //   249: istore 8
    //   251: goto -101 -> 150
    //   254: astore_3
    //   255: aconst_null
    //   256: areturn
    //   257: astore 10
    //   259: goto -178 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	262	0	paramContext	Context
    //   0	262	1	paramArrayOfString	java.lang.String[]
    //   0	262	2	paramInt	int
    //   254	1	3	localException1	Exception
    //   20	216	4	localcs	cs
    //   36	46	5	i	int
    //   60	145	6	str	java.lang.String
    //   74	3	7	bool	boolean
    //   88	162	8	j	int
    //   97	124	9	localOptions	android.graphics.BitmapFactory.Options
    //   257	1	10	localException2	Exception
    //   118	30	12	k	int
    //   125	124	13	m	int
    //   170	61	14	localBitmap	Bitmap
    //   184	54	15	localas	as
    // Exception table:
    //   from	to	target	type
    //   6	22	254	java/lang/Exception
    //   29	35	254	java/lang/Exception
    //   38	53	254	java/lang/Exception
    //   56	76	254	java/lang/Exception
    //   90	127	257	java/lang/Exception
    //   144	150	257	java/lang/Exception
    //   150	172	257	java/lang/Exception
    //   177	242	257	java/lang/Exception
    //   245	251	257	java/lang/Exception
  }
  
  private void a(as paramas)
  {
    if (this.b == null) {
      this.b = new ArrayList(10);
    }
    this.b.add(paramas);
  }
  
  as a(int paramInt)
  {
    try
    {
      if ((this.b != null) && (paramInt > -1) && (paramInt < this.b.size()))
      {
        as localas = (as)this.b.get(paramInt);
        return localas;
      }
    }
    catch (Exception localException) {}
    return null;
  }
  
  public int getCount()
  {
    if (this.b != null) {
      return this.b.size();
    }
    return 0;
  }
  
  public Object getItem(int paramInt)
  {
    return a(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    try
    {
      as localas = a(paramInt);
      if (localas == null) {
        return null;
      }
      Bitmap localBitmap = localas.c;
      if (paramView != null)
      {
        ImageView localImageView1 = (ImageView)paramView;
        if (localBitmap != null)
        {
          localImageView1.setImageBitmap(localBitmap);
          return paramView;
        }
      }
      else
      {
        ImageView localImageView2 = new ImageView(this.a);
        if (localBitmap != null) {
          localImageView2.setImageBitmap(localBitmap);
        }
        localImageView2.setLayoutParams(new Gallery.LayoutParams(this.c, this.c));
        localImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        localImageView2.setPadding(10, 0, 10, 0);
        localImageView2.setBackgroundResource(17301606);
        paramView = localImageView2;
      }
      return paramView;
    }
    catch (Exception localException) {}
    return paramView;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cs
 * JD-Core Version:    0.7.0.1
 */