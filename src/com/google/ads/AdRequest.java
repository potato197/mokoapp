package com.google.ads;

import android.content.Context;
import android.location.Location;
import com.google.ads.util.AdUtil;
import com.google.ads.util.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AdRequest
{
  public static final String LOGTAG = "Ads";
  public static final String TEST_EMULATOR = AdUtil.a("emulator");
  public static final String VERSION = "4.1.0";
  private Gender a = null;
  private String b = null;
  private Set<String> c = null;
  private Map<String, Object> d = null;
  private Location e = null;
  private boolean f = false;
  private boolean g = false;
  private Set<String> h = null;
  
  public void addExtra(String paramString, Object paramObject)
  {
    if (this.d == null) {
      this.d = new HashMap();
    }
    this.d.put(paramString, paramObject);
  }
  
  public void addKeyword(String paramString)
  {
    if (this.c == null) {
      this.c = new HashSet();
    }
    this.c.add(paramString);
  }
  
  public void addTestDevice(String paramString)
  {
    if (this.h == null) {
      this.h = new HashSet();
    }
    this.h.add(paramString);
  }
  
  public Map<String, Object> getRequestMap(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    if (this.c != null) {
      localHashMap.put("kw", this.c);
    }
    if (this.a != null) {
      localHashMap.put("cust_gender", this.a.toString());
    }
    if (this.b != null) {
      localHashMap.put("cust_age", this.b);
    }
    if (this.e != null) {
      localHashMap.put("uule", AdUtil.a(this.e));
    }
    if (this.f) {
      localHashMap.put("testing", Integer.valueOf(1));
    }
    if (isTestDevice(paramContext)) {
      localHashMap.put("adtest", "on");
    }
    while (this.g)
    {
      if (this.d != null) {
        localHashMap.put("extras", this.d);
      }
      return localHashMap;
    }
    if (AdUtil.a()) {}
    for (String str = "AdRequest.TEST_EMULATOR";; str = "\"" + AdUtil.a(paramContext) + "\"")
    {
      a.c("To get test ads on this device, call adRequest.addTestDevice(" + str + ");");
      this.g = true;
      break;
    }
  }
  
  public boolean isTestDevice(Context paramContext)
  {
    String str;
    if (this.h != null)
    {
      str = AdUtil.a(paramContext);
      if (str != null) {
        break label18;
      }
    }
    label18:
    while (!this.h.contains(str)) {
      return false;
    }
    return true;
  }
  
  public void setBirthday(String paramString)
  {
    this.b = paramString;
  }
  
  public void setExtras(Map<String, Object> paramMap)
  {
    this.d = paramMap;
  }
  
  public void setGender(Gender paramGender)
  {
    this.a = paramGender;
  }
  
  public void setKeywords(Set<String> paramSet)
  {
    this.c = paramSet;
  }
  
  public void setLocation(Location paramLocation)
  {
    this.e = paramLocation;
  }
  
  public void setTestDevices(Set<String> paramSet)
  {
    this.h = paramSet;
  }
  
  public void setTesting(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public static enum ErrorCode
  {
    private String a;
    
    static
    {
      NETWORK_ERROR = new ErrorCode("NETWORK_ERROR", 2, "A network error occurred.");
      INTERNAL_ERROR = new ErrorCode("INTERNAL_ERROR", 3, "There was an internal error.");
      ErrorCode[] arrayOfErrorCode = new ErrorCode[4];
      arrayOfErrorCode[0] = INVALID_REQUEST;
      arrayOfErrorCode[1] = NO_FILL;
      arrayOfErrorCode[2] = NETWORK_ERROR;
      arrayOfErrorCode[3] = INTERNAL_ERROR;
      b = arrayOfErrorCode;
    }
    
    private ErrorCode(String paramString)
    {
      this.a = paramString;
    }
    
    public final String toString()
    {
      return this.a;
    }
  }
  
  public static enum Gender
  {
    private String a;
    
    static
    {
      FEMALE = new Gender("FEMALE", 1, "f");
      Gender[] arrayOfGender = new Gender[2];
      arrayOfGender[0] = MALE;
      arrayOfGender[1] = FEMALE;
      b = arrayOfGender;
    }
    
    private Gender(String paramString)
    {
      this.a = paramString;
    }
    
    public final String toString()
    {
      return this.a;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.AdRequest
 * JD-Core Version:    0.7.0.1
 */