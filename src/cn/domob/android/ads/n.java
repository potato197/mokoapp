package cn.domob.android.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import cn.domob.android.ads.b.d;
import cn.domob.android.ads.b.d.b;

public class n
{
  private ImageView a;
  private d b;
  private int c;
  private Context d;
  
  public n() {}
  
  public n(Context paramContext, int paramInt)
  {
    this.a = null;
    this.b = null;
    this.c = 0;
    this.d = null;
    this.d = paramContext;
    this.c = paramInt;
    switch (this.c)
    {
    default: 
      return;
    case 0: 
    case 2: 
      this.a = new ImageView(this.d);
      return;
    }
    Looper.prepare();
    this.b = new d(this.d);
    this.b.a(d.b.a);
  }
  
  public final View a()
  {
    switch (this.c)
    {
    default: 
      return null;
    case 0: 
    case 2: 
      return this.a;
    }
    return this.b;
  }
  
  public final void a(Bitmap paramBitmap, byte[] paramArrayOfByte)
  {
    switch (this.c)
    {
    }
    do
    {
      return;
      this.a.setImageBitmap(paramBitmap);
      return;
    } while (paramArrayOfByte == null);
    this.b.a(paramArrayOfByte);
  }
  
  public final void a(ImageView.ScaleType paramScaleType)
  {
    if (this.a != null) {
      this.a.setScaleType(paramScaleType);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.n
 * JD-Core Version:    0.7.0.1
 */