package com.guohead.sdk.obj;

public class Ration
  implements Comparable<Ration>
{
  public String appVersion = "v1.0";
  public String appid = "";
  public String key = "";
  public String key2 = "";
  public String key3 = "";
  public String name = "";
  public String nid = "";
  public int priority = 0;
  public String sdkVersion = "";
  public int type = 0;
  public int weight = 0;
  
  public int compareTo(Ration paramRation)
  {
    int i = paramRation.priority;
    if (this.priority < i) {
      return -1;
    }
    if (this.priority > i) {
      return 1;
    }
    return 0;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.obj.Ration
 * JD-Core Version:    0.7.0.1
 */