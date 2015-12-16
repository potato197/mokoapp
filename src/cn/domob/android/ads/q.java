package cn.domob.android.ads;

import android.content.Context;
import android.util.Log;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class q
{
  private Context a;
  
  public q(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "";
    case 0: 
      return "download_start";
    case 1: 
      return "download_finish";
    case 2: 
      return "download_failed";
    case 3: 
      return "download_cancel";
    case 4: 
      return "load_success";
    case 5: 
      return "load_failed";
    case 6: 
      return "close_lp";
    case 7: 
      return "install_success";
    case 8: 
      return "run";
    case 9: 
      return "confirm_download";
    case 10: 
      return "load_cancel";
    }
    return "show_more";
  }
  
  private static String a(HashMap<String, String> paramHashMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramHashMap.entrySet().iterator();
    int j;
    for (int i = 1;; i = j)
    {
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str2 = (String)localEntry.getKey();
        String str3 = (String)localEntry.getValue();
        if ((str2 != null) && (str2.length() > 0) && (str3 != null))
        {
          if (i != 0) {}
          try
          {
            localStringBuilder.append(URLEncoder.encode(str2, "UTF-8")).append("=").append(URLEncoder.encode(str3, "UTF-8"));
          }
          catch (Exception localException)
          {
            localException.printStackTrace();
          }
          localStringBuilder.append("&").append(URLEncoder.encode(str2, "UTF-8")).append("=").append(URLEncoder.encode(str3, "UTF-8"));
        }
      }
      else
      {
        str1 = localStringBuilder.toString();
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "post params string:" + str1);
        }
      }
      while (i == 0)
      {
        String str1;
        j = i;
        break;
      }
      j = 0;
    }
  }
  
  private HashMap<String, String> b(a parama)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("rt", "1");
    String str1 = t.a(this.a);
    if (str1 == null) {
      str1 = "Android,,,,,,,,";
    }
    localHashMap.put("ua", str1);
    String str2 = DomobAdManager.j(this.a);
    if (str2 != null)
    {
      if (Log.isLoggable("DomobSDK", 3)) {
        Log.d("DomobSDK", "CID:" + str2);
      }
      localHashMap.put("cid", str2);
    }
    String str3 = DomobAdManager.getPublisherId(this.a);
    if ((str3 != null) && (str3.length() > 0))
    {
      localHashMap.put("ipb", str3);
      String str4 = parama.d;
      if (str4 != null) {
        localHashMap.put("rp_md5", str4);
      }
      String str5 = parama.e;
      if ((str5 != null) && (str5.length() > 0))
      {
        if (str5.length() > 256) {
          str5 = str5.substring(0, 256);
        }
        localHashMap.put("spot", str5);
      }
      if (parama.c == null) {
        break label400;
      }
    }
    for (;;)
    {
      try
      {
        JSONArray localJSONArray1 = new JSONArray();
        int i = 0;
        if (i < parama.c.size())
        {
          localJSONArray1.put(parama.c.get(i));
          i++;
          continue;
          Log.e("DomobSDK", "publisher id is null or empty!");
          break;
        }
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("type", a(parama.a));
        localJSONObject.put("ts", System.currentTimeMillis());
        int j = parama.b;
        str6 = "";
        switch (j)
        {
        default: 
          localJSONObject.put("idtype", str6);
          localJSONObject.put("id", localJSONArray1);
          JSONArray localJSONArray2 = new JSONArray();
          localJSONArray2.put(localJSONObject);
          localHashMap.put("jstr", localJSONArray2.toString());
          return localHashMap;
        }
      }
      catch (JSONException localJSONException) {}
      String str6 = "pkg";
      continue;
      label400:
      return localHashMap;
      str6 = "ad";
      continue;
      str6 = "app";
    }
  }
  
  public final void a(final a parama)
  {
    new Thread()
    {
      public final void run()
      {
        HashMap localHashMap = q.a(q.this, parama);
        i locali = a.a("http://e.domob.cn/report", q.a(q.this, localHashMap));
        locali.a(q.a(q.this));
        if (locali.a()) {
          if (Log.isLoggable("DomobSDK", 3)) {
            Log.d("DomobSDK", "send report:" + q.a(q.this, parama.a) + " success");
          }
        }
        while (!Log.isLoggable("DomobSDK", 3)) {
          return;
        }
        Log.d("DomobSDK", "send report:" + q.a(q.this, parama.a) + " failed");
      }
    }.start();
  }
  
  public final class a
  {
    int a;
    int b;
    ArrayList<String> c;
    String d;
    String e;
    
    public a() {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.q
 * JD-Core Version:    0.7.0.1
 */