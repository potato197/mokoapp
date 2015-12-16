package net.youmi.android;

class bo
{
  private int b = 48;
  private int c = 11;
  private int d = 26;
  
  bo(ca paramca1, ca paramca2)
  {
    this.b = paramca2.a(this.b);
    this.d = paramca2.a(this.d);
    this.c = ((this.b - this.d) / 2);
  }
  
  int a()
  {
    return this.b;
  }
  
  int b()
  {
    return this.d;
  }
  
  int c()
  {
    return this.c;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.bo
 * JD-Core Version:    0.7.0.1
 */