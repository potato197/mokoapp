package net.youmi.android;

import java.util.Stack;

class d
{
  private o b;
  private Stack c = new Stack();
  private em d;
  private Stack e = new Stack();
  
  d(aw paramaw, o paramo)
  {
    this.b = paramo;
  }
  
  em a()
  {
    return this.d;
  }
  
  em a(em paramem)
  {
    if ((this.d != null) && (this.d != paramem)) {
      this.c.push(this.d);
    }
    this.e.clear();
    this.d = paramem;
    if (this.b != null) {
      this.b.a(this);
    }
    return this.d;
  }
  
  em b()
  {
    if (this.e.size() > 0)
    {
      em localem = (em)this.e.pop();
      if (localem != null)
      {
        if (this.d != null) {
          this.c.push(this.d);
        }
        this.d = localem;
        if (this.b != null) {
          this.b.a(this);
        }
        return this.d;
      }
    }
    return null;
  }
  
  em c()
  {
    if (this.c.size() > 0)
    {
      em localem = (em)this.c.pop();
      if (localem != null)
      {
        if (this.d != null) {
          this.e.push(this.d);
        }
        this.d = localem;
        if (this.b != null) {
          this.b.a(this);
        }
        return this.d;
      }
    }
    return null;
  }
  
  boolean d()
  {
    return this.d != null;
  }
  
  boolean e()
  {
    return this.e.size() > 0;
  }
  
  boolean f()
  {
    return this.c.size() > 0;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.d
 * JD-Core Version:    0.7.0.1
 */