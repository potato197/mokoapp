package cn.domob.android.ads.a;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

final class b
  extends Animation
{
  private final float a;
  private final float b;
  private final float c;
  private final float d;
  private final float e;
  private final boolean f;
  private Camera g;
  
  public b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, boolean paramBoolean)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    this.d = paramFloat4;
    this.e = 0.0F;
    this.f = paramBoolean;
  }
  
  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.a;
    float f2 = f1 + paramFloat * (this.b - f1);
    float f3 = this.c;
    float f4 = this.d;
    Camera localCamera = this.g;
    Matrix localMatrix = paramTransformation.getMatrix();
    localCamera.save();
    if (this.f) {
      localCamera.translate(0.0F, 0.0F, paramFloat * this.e);
    }
    for (;;)
    {
      localCamera.rotateY(f2);
      localCamera.getMatrix(localMatrix);
      localCamera.restore();
      localMatrix.preTranslate(-f3, -f4);
      localMatrix.postTranslate(f3, f4);
      return;
      localCamera.translate(0.0F, 0.0F, this.e * (1.0F - paramFloat));
    }
  }
  
  public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    this.g = new Camera();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.a.b
 * JD-Core Version:    0.7.0.1
 */