package net.youmi.android;

import org.json.JSONArray;
import org.json.JSONObject;

class cy
{
  static int a(JSONObject paramJSONObject, String paramString, int paramInt)
  {
    if (paramJSONObject != null) {}
    try
    {
      if (!paramJSONObject.isNull(paramString))
      {
        int i = paramJSONObject.getInt(paramString);
        paramInt = i;
      }
      return paramInt;
    }
    catch (Exception localException) {}
    return paramInt;
  }
  
  static String a(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    if (paramJSONObject != null) {}
    try
    {
      if (!paramJSONObject.isNull(paramString1))
      {
        String str1 = paramJSONObject.getString(paramString1);
        if (str1 != null)
        {
          String str2 = str1.trim();
          paramString2 = str2;
        }
      }
      return paramString2;
    }
    catch (Exception localException) {}
    return paramString2;
  }
  
  static JSONArray a(JSONObject paramJSONObject, String paramString, JSONArray paramJSONArray)
  {
    if (paramJSONObject != null) {}
    try
    {
      if (!paramJSONObject.isNull(paramString))
      {
        JSONArray localJSONArray = paramJSONObject.getJSONArray(paramString);
        paramJSONArray = localJSONArray;
      }
      return paramJSONArray;
    }
    catch (Exception localException) {}
    return paramJSONArray;
  }
  
  static JSONObject a(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      return localJSONObject;
    }
    catch (Exception localException) {}
    return null;
  }
  
  static JSONObject a(JSONArray paramJSONArray, int paramInt, JSONObject paramJSONObject)
  {
    if (paramJSONArray != null) {}
    try
    {
      if ((paramJSONArray.length() > paramInt) && (paramInt > -1))
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(paramInt);
        paramJSONObject = localJSONObject;
      }
      return paramJSONObject;
    }
    catch (Exception localException) {}
    return paramJSONObject;
  }
  
  static JSONObject a(JSONObject paramJSONObject1, String paramString, JSONObject paramJSONObject2)
  {
    if (paramJSONObject1 != null) {}
    try
    {
      if (!paramJSONObject1.isNull(paramString))
      {
        JSONObject localJSONObject = paramJSONObject1.getJSONObject(paramString);
        paramJSONObject2 = localJSONObject;
      }
      return paramJSONObject2;
    }
    catch (Exception localException) {}
    return paramJSONObject2;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.cy
 * JD-Core Version:    0.7.0.1
 */