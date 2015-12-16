package net.youmi.android;

import java.io.File;
import java.io.FileInputStream;

class dd
  extends di
{
  private cr i;
  
  dd(ed paramed)
  {
    super(paramed);
  }
  
  protected boolean a(File paramFile)
  {
    try
    {
      this.i = new cr(new FileInputStream(paramFile));
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  protected boolean a(byte[] paramArrayOfByte)
  {
    try
    {
      this.i = new cr(paramArrayOfByte);
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  cr c()
  {
    return this.i;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.dd
 * JD-Core Version:    0.7.0.1
 */