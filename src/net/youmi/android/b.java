package net.youmi.android;

class b
{
  Object[] a;
  
  b(Object[] paramArrayOfObject)
  {
    this.a = paramArrayOfObject;
  }
  
  Object a(int paramInt, Object paramObject)
  {
    try
    {
      if ((this.a != null) && (paramInt > -1) && (paramInt < this.a.length)) {
        paramObject = this.a[paramInt];
      }
      return paramObject;
    }
    catch (Exception localException) {}
    return paramObject;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.b
 * JD-Core Version:    0.7.0.1
 */