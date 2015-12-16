package net.youmi.android;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.ArcShape;

class dr
{
  private Drawable b;
  private Drawable c;
  private Drawable d;
  private Drawable e;
  private Drawable f;
  
  dr(cd paramcd) {}
  
  Drawable a()
  {
    if (this.b == null) {
      this.b = a(a("last.png"), a("last-enable.png"));
    }
    return this.b;
  }
  
  Drawable a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    StateListDrawable localStateListDrawable = new StateListDrawable();
    ShapeDrawable localShapeDrawable = new ShapeDrawable();
    localShapeDrawable.setShape(new ArcShape(0.0F, 360.0F));
    localShapeDrawable.getPaint().setShader(new RadialGradient(35.0F, 25.0F, 25.0F, Color.argb(80, 255, 255, 255), Color.argb(0, 255, 255, 255), Shader.TileMode.CLAMP));
    LayerDrawable localLayerDrawable = new LayerDrawable(new Drawable[] { localShapeDrawable, paramDrawable1 });
    localStateListDrawable.addState(cd.a(), localLayerDrawable);
    if (paramDrawable1 != null) {
      localStateListDrawable.addState(cd.b(), paramDrawable1);
    }
    if (paramDrawable2 != null) {
      localStateListDrawable.addState(cd.c(), paramDrawable2);
    }
    return localStateListDrawable;
  }
  
  Drawable a(String paramString)
  {
    try
    {
      BitmapDrawable localBitmapDrawable = new BitmapDrawable(BitmapFactory.decodeStream(getClass().getResourceAsStream(paramString)));
      return localBitmapDrawable;
    }
    catch (Exception localException) {}
    return null;
  }
  
  Drawable b()
  {
    if (this.c == null) {
      this.c = a(a("next.png"), a("next-enable.png"));
    }
    return this.c;
  }
  
  Drawable c()
  {
    if (this.f == null) {
      this.f = a(a("download.png"), null);
    }
    return this.f;
  }
  
  Drawable d()
  {
    if (this.e == null) {
      this.e = a(a("quit.png"), null);
    }
    return this.e;
  }
  
  Drawable e()
  {
    if (this.d == null) {
      this.d = a(a("reflesh.png"), a("reflesh.png"));
    }
    return this.d;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dr
 * JD-Core Version:    0.7.0.1
 */