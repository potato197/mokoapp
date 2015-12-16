package net.youmi.android;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;

class bz
  extends di
{
  private Bitmap i;
  
  bz(ed paramed)
  {
    super(paramed);
  }
  
  protected boolean a(File paramFile)
  {
    try
    {
      this.i = BitmapFactory.decodeFile(paramFile.getPath());
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  protected boolean a(byte[] paramArrayOfByte)
  {
    try
    {
      this.i = BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length);
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  Bitmap c()
  {
    return this.i;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.bz
 * JD-Core Version:    0.7.0.1
 */