package net.youmi.android;

import java.util.Random;

class bn
{
  private static final Random a = new Random(System.currentTimeMillis());
  
  static final int a()
  {
    return a.nextInt();
  }
  
  static final int a(int paramInt)
  {
    return a.nextInt(paramInt);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.bn
 * JD-Core Version:    0.7.0.1
 */