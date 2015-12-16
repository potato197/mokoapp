package com.google.common.base;

public abstract interface Function<F, T>
{
  public abstract T apply(F paramF);
  
  public abstract boolean equals(Object paramObject);
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.common.base.Function
 * JD-Core Version:    0.7.0.1
 */