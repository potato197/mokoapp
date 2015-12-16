package com.baidu;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

class e
  implements FilenameFilter
{
  e(c paramc) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    if (!paramString.startsWith("__sdk_")) {
      return false;
    }
    try
    {
      ArrayList localArrayList = new ArrayList();
      for (t localt1 : t.a()) {
        localArrayList.add(c.a(this.a).getJSONObject(localt1.toString()));
      }
      for (t localt2 : t.a()) {
        localArrayList.add(c.b(this.a).getJSONObject(localt2.toString()));
      }
      Iterator localIterator1 = localArrayList.iterator();
      boolean bool;
      do
      {
        JSONObject localJSONObject;
        Iterator localIterator2;
        while (!localIterator2.hasNext())
        {
          if (!localIterator1.hasNext()) {
            break;
          }
          localJSONObject = (JSONObject)localIterator1.next();
          localIterator2 = localJSONObject.keys();
        }
        bool = paramString.equals(w.e(localJSONObject.getJSONObject(localIterator2.next().toString()).getJSONObject("content").getString("w_picurl")));
      } while (!bool);
      return false;
    }
    catch (JSONException localJSONException) {}
    return true;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.e
 * JD-Core Version:    0.7.0.1
 */