package com.baidu;

public enum ClickType
{
  private String a;
  
  static
  {
    DOWNLOAD = new ClickType("DOWNLOAD", 2, "下载资源");
    ClickType[] arrayOfClickType = new ClickType[3];
    arrayOfClickType[0] = BROWSE;
    arrayOfClickType[1] = PHONE;
    arrayOfClickType[2] = DOWNLOAD;
    b = arrayOfClickType;
  }
  
  private ClickType(String paramString)
  {
    this.a = paramString;
  }
  
  public String getValue()
  {
    return this.a;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.ClickType
 * JD-Core Version:    0.7.0.1
 */