package net.youmi.android;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RectShape;

class by
{
  static Drawable a(ca paramca)
  {
    try
    {
      ShapeDrawable localShapeDrawable = new ShapeDrawable(new RectShape());
      localShapeDrawable.getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, paramca.b().a(), Color.rgb(60, 60, 60), Color.rgb(0, 0, 0), Shader.TileMode.CLAMP));
      return localShapeDrawable;
    }
    catch (Exception localException) {}
    return new ColorDrawable(Color.argb(160, 0, 0, 0));
  }
  
  static Drawable a(ca paramca, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    try
    {
      float f1 = paramca.b().b();
      float f2 = paramca.b().b();
      float f3 = paramca.b().c();
      float f4 = paramca.b().c();
      (f3 + paramca.b().b());
      (f4 + paramca.b().b());
      float f5 = f2 / 6.0F;
      float f6 = f2 / 5.0F;
      float f7 = f1 / 5.0F;
      float f8 = f1 / 6.0F;
      Path localPath = new Path();
      localPath.moveTo(f3 + f7, f4);
      localPath.lineTo(f3 + f1, f4);
      localPath.lineTo(f3 + f1, f4 + f2);
      localPath.lineTo(f3 + f7, f4 + f2);
      localPath.lineTo(f3 + f7, f4 + f2 - f5);
      localPath.lineTo(f3 + f1 - f8, f4 + f2 - f5);
      localPath.lineTo(f3 + f1 - f8, f4 + f5);
      localPath.lineTo(f3 + f7, f4 + f5);
      localPath.lineTo(f7 + f3, f4);
      localPath.close();
      localPath.moveTo(f3, f4 + f6 * 2.0F);
      localPath.lineTo(f3, f4 + f6 * 3.0F);
      localPath.lineTo(f3 + f8 * 2.0F, f4 + f6 * 3.0F);
      localPath.lineTo(f3 + f8 * 2.0F, f4 + f2 - f5);
      localPath.lineTo(f1 + f3 - f8, f4 + f2 / 2.0F);
      localPath.lineTo(f3 + f8 * 2.0F, f4 + f5);
      localPath.lineTo(f3 + f8 * 2.0F, f4 + f6 * 2.0F);
      localPath.lineTo(f3, f4 + f6 * 2.0F);
      localPath.close();
      PathShape localPathShape = new PathShape(localPath, paramca.b().a(), paramca.b().a());
      ShapeDrawable localShapeDrawable1 = new ShapeDrawable(localPathShape);
      localShapeDrawable1.getPaint().setColor(Color.rgb(245, 245, 245));
      ShapeDrawable localShapeDrawable2 = new ShapeDrawable(localPathShape);
      localShapeDrawable2.getPaint().setColor(Color.argb(200, 0, 191, 255));
      Drawable localDrawable = a(paramArrayOfInt1, localShapeDrawable1, paramArrayOfInt2, localShapeDrawable2);
      return localDrawable;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static Drawable a(ca paramca, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3)
  {
    try
    {
      paramca.b().b();
      float f1 = paramca.b().b();
      float f2 = paramca.b().c();
      float f3 = paramca.b().c();
      float f4 = f2 + paramca.b().b();
      float f5 = f3 + paramca.b().b();
      Path localPath = new Path();
      localPath.moveTo(f2, f3 + f1 / 2.0F);
      localPath.lineTo(f4, f3);
      localPath.lineTo(f4, f5);
      localPath.lineTo(f2, f3 + f1 / 2.0F);
      localPath.close();
      PathShape localPathShape = new PathShape(localPath, paramca.b().a(), paramca.b().a());
      ShapeDrawable localShapeDrawable1 = new ShapeDrawable(localPathShape);
      localShapeDrawable1.getPaint().setColor(-12303292);
      ShapeDrawable localShapeDrawable2 = new ShapeDrawable(localPathShape);
      localShapeDrawable2.getPaint().setColor(Color.rgb(245, 245, 245));
      ShapeDrawable localShapeDrawable3 = new ShapeDrawable(localPathShape);
      localShapeDrawable3.getPaint().setColor(Color.argb(200, 0, 191, 255));
      Drawable localDrawable = a(paramArrayOfInt1, localShapeDrawable1, paramArrayOfInt2, localShapeDrawable2, paramArrayOfInt3, localShapeDrawable3);
      return localDrawable;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static Drawable a(int[] paramArrayOfInt1, Drawable paramDrawable1, int[] paramArrayOfInt2, Drawable paramDrawable2)
  {
    try
    {
      StateListDrawable localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(paramArrayOfInt2, paramDrawable2);
      localStateListDrawable.addState(paramArrayOfInt1, paramDrawable1);
      return localStateListDrawable;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static Drawable a(int[] paramArrayOfInt1, Drawable paramDrawable1, int[] paramArrayOfInt2, Drawable paramDrawable2, int[] paramArrayOfInt3, Drawable paramDrawable3)
  {
    try
    {
      StateListDrawable localStateListDrawable = new StateListDrawable();
      localStateListDrawable.addState(paramArrayOfInt3, paramDrawable3);
      localStateListDrawable.addState(paramArrayOfInt2, paramDrawable2);
      localStateListDrawable.addState(paramArrayOfInt1, paramDrawable1);
      return localStateListDrawable;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static Drawable b(ca paramca, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    try
    {
      float f1 = paramca.b().b();
      float f2 = paramca.b().b();
      float f3 = paramca.b().c();
      float f4 = paramca.b().c();
      float f5 = f3 + paramca.b().b();
      float f6 = f4 + paramca.b().b();
      Path localPath = new Path();
      localPath.moveTo(f3, f6);
      localPath.lineTo(f5, f6);
      localPath.lineTo(f5, f4 + 0.75F * f2);
      localPath.lineTo(f3, f4 + 0.75F * f2);
      localPath.lineTo(f3, f6);
      localPath.close();
      localPath.moveTo(f3 + f1 / 2.0F, f4 + f2 * 0.7F);
      localPath.lineTo(f3 + 0.9F * f1, f4 + f2 * 0.35F);
      localPath.lineTo(f3 + f1 * 0.6F, f4 + f2 * 0.35F);
      localPath.lineTo(f3 + f1 * 0.6F, f4);
      localPath.lineTo(f3 + f1 * 0.4F, f4);
      localPath.lineTo(f3 + f1 * 0.4F, f4 + f2 * 0.35F);
      localPath.lineTo(f3 + 0.1F * f1, f4 + f2 * 0.35F);
      localPath.lineTo(f3 + f1 / 2.0F, f4 + f2 * 0.7F);
      localPath.close();
      PathShape localPathShape = new PathShape(localPath, paramca.b().a(), paramca.b().a());
      ShapeDrawable localShapeDrawable1 = new ShapeDrawable(localPathShape);
      localShapeDrawable1.getPaint().setColor(Color.rgb(245, 245, 245));
      ShapeDrawable localShapeDrawable2 = new ShapeDrawable(localPathShape);
      localShapeDrawable2.getPaint().setColor(Color.argb(200, 0, 191, 255));
      Drawable localDrawable = a(paramArrayOfInt1, localShapeDrawable1, paramArrayOfInt2, localShapeDrawable2);
      return localDrawable;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static Drawable b(ca paramca, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3)
  {
    try
    {
      paramca.b().b();
      int i = paramca.b().b();
      int j = paramca.b().c();
      int k = paramca.b().c();
      int m = j + paramca.b().b();
      int n = k + paramca.b().b();
      Path localPath = new Path();
      localPath.moveTo(j, k);
      localPath.lineTo(m, k + i / 2);
      localPath.lineTo(j, n);
      localPath.lineTo(j, k);
      localPath.close();
      PathShape localPathShape = new PathShape(localPath, paramca.b().a(), paramca.b().a());
      ShapeDrawable localShapeDrawable1 = new ShapeDrawable(localPathShape);
      localShapeDrawable1.getPaint().setColor(-12303292);
      ShapeDrawable localShapeDrawable2 = new ShapeDrawable(localPathShape);
      localShapeDrawable2.getPaint().setColor(Color.rgb(245, 245, 245));
      ShapeDrawable localShapeDrawable3 = new ShapeDrawable(localPathShape);
      localShapeDrawable3.getPaint().setColor(Color.argb(200, 0, 191, 255));
      Drawable localDrawable = a(paramArrayOfInt1, localShapeDrawable1, paramArrayOfInt2, localShapeDrawable2, paramArrayOfInt3, localShapeDrawable3);
      return localDrawable;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static Drawable c(ca paramca, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3)
  {
    try
    {
      float f1 = paramca.b().b();
      float f2 = paramca.b().b();
      float f3 = paramca.b().c();
      float f4 = paramca.b().c();
      float f5 = f3 + paramca.b().b();
      float f6 = f4 + paramca.b().b();
      float f7 = 0.16F * f2;
      Path localPath = new Path();
      RectF localRectF1 = new RectF(f3, f4, f5, f6);
      RectF localRectF2 = new RectF(f3 + f7, f4 + f7, f3 + f1 - f7, f4 + f2 - f7);
      localPath.moveTo(f3 + f1, f4 + 0.5F * f2);
      localPath.arcTo(localRectF1, 0.0F, -150.0F);
      localPath.lineTo(f3, f4 + 0.15F * f2);
      localPath.lineTo(f3, f4 + 0.5F * f2);
      localPath.lineTo(f3 + 0.4F * f1, f4 + 0.5F * f2);
      localPath.lineTo(f3 + 0.2F * f1, f4 + 0.4F * f2);
      localPath.arcTo(localRectF2, 190.0F, 160.0F);
      localPath.lineTo(f3 + f1, f4 + 0.5F * f2);
      localPath.close();
      localPath.moveTo(f3, f4 + 0.5F * f2);
      localPath.arcTo(localRectF1, 180.0F, -150.0F);
      localPath.lineTo(f3 + f1, f4 + 0.85F * f2);
      localPath.lineTo(f3 + f1, f4 + 0.5F * f2);
      localPath.lineTo(f3 + 0.6F * f1, f4 + 0.5F * f2);
      localPath.lineTo(f3 + f1 * 0.8F, f4 + 0.6F * f2);
      localPath.arcTo(localRectF2, 10.0F, 160.0F);
      localPath.lineTo(f3, f4 + 0.5F * f2);
      localPath.close();
      PathShape localPathShape = new PathShape(localPath, paramca.b().a(), paramca.b().a());
      ShapeDrawable localShapeDrawable1 = new ShapeDrawable(localPathShape);
      localShapeDrawable1.getPaint().setColor(-12303292);
      ShapeDrawable localShapeDrawable2 = new ShapeDrawable(localPathShape);
      localShapeDrawable2.getPaint().setColor(Color.rgb(245, 245, 245));
      localShapeDrawable2.getPaint().setAntiAlias(true);
      ShapeDrawable localShapeDrawable3 = new ShapeDrawable(localPathShape);
      localShapeDrawable3.getPaint().setColor(Color.argb(200, 0, 191, 255));
      Drawable localDrawable = a(paramArrayOfInt1, localShapeDrawable1, paramArrayOfInt2, localShapeDrawable2, paramArrayOfInt3, localShapeDrawable3);
      return localDrawable;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.by
 * JD-Core Version:    0.7.0.1
 */