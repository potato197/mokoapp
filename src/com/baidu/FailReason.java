package com.baidu;

public enum FailReason
{
  private String a;
  
  static
  {
    FailReason[] arrayOfFailReason = new FailReason[2];
    arrayOfFailReason[0] = NO_AD;
    arrayOfFailReason[1] = OTHER_EXCEPTION;
    b = arrayOfFailReason;
  }
  
  private FailReason(String paramString)
  {
    this.a = paramString;
  }
  
  public String getValue()
  {
    return this.a;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.FailReason
 * JD-Core Version:    0.7.0.1
 */