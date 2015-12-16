package cn.domob.android.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import org.json.JSONObject;

final class k
{
  private Context a;
  private String b;
  private String c;
  private int d;
  private boolean e = false;
  private long f;
  private long g;
  private String h;
  private boolean i = true;
  
  private k(Context paramContext)
  {
    this.a = paramContext;
    this.g = 0L;
  }
  
  protected static k a(Context paramContext, JSONObject paramJSONObject)
  {
    k localk = new k(paramContext);
    if (localk.a(paramJSONObject)) {
      return localk;
    }
    return null;
  }
  
  private boolean a(JSONObject paramJSONObject)
  {
    if (!paramJSONObject.optBoolean("detection"))
    {
      Log.e("DomobSDK", "invalide detector response");
      return false;
    }
    this.c = paramJSONObject.optString("lm[config]", null);
    if ((this.c != null) && (Log.isLoggable("DomobSDK", 3))) {
      Log.d("DomobSDK", "lm[config]:" + this.c);
    }
    this.b = paramJSONObject.optString("lm[res]", null);
    if ((this.b != null) && (Log.isLoggable("DomobSDK", 3))) {
      Log.d("DomobSDK", "lm[res]:" + this.b);
    }
    this.d = paramJSONObject.optInt("refresh_interval", -1);
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "interval:" + this.d);
    }
    this.e = paramJSONObject.optBoolean("disabled", false);
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "disabled:" + this.e);
    }
    this.f = paramJSONObject.optLong("dis_time", 0L);
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "disabled time:" + this.f);
    }
    this.i = paramJSONObject.optBoolean("allow_tm", true);
    if (Log.isLoggable("DomobSDK", 3)) {
      Log.d("DomobSDK", "allow test:" + this.i);
    }
    this.h = paramJSONObject.optString("cid", null);
    if ((this.h != null) && (Log.isLoggable("DomobSDK", 3))) {
      Log.d("DomobSDK", "CID:" + this.h);
    }
    JSONObject localJSONObject1 = paramJSONObject.optJSONObject("markup");
    if (localJSONObject1 != null) {}
    for (;;)
    {
      try
      {
        JSONObject localJSONObject2 = localJSONObject1.optJSONObject("$");
        if (localJSONObject2 != null)
        {
          c localc2 = c.a(this.a);
          Iterator localIterator = localJSONObject2.keys();
          if (localIterator.hasNext())
          {
            String str1 = (String)localIterator.next();
            String str2 = localJSONObject2.getJSONObject(str1).getString("u");
            if ((str1 == null) || (str2 == null)) {
              continue;
            }
            int j = str2.lastIndexOf('/');
            if ((j <= 0) || (j + 1 >= str2.length())) {
              continue;
            }
            String str3 = str2.substring(j + 1);
            Cursor localCursor = localc2.b(c.a, str3);
            if ((localCursor == null) || (localCursor.getCount() <= 0)) {
              break label888;
            }
            localCursor.moveToFirst();
            int m = localCursor.getColumnIndexOrThrow("_name");
            String str4 = "_name=\"" + localCursor.getString(m) + "\"";
            localc2.a(c.a, str4);
            k = 0;
            if (localCursor != null) {
              localCursor.close();
            }
            if ((k != 0) || (!Log.isLoggable("DomobSDK", 3))) {
              continue;
            }
            Log.d("DomobSDK", str3 + ":old version existed, delete it.");
            continue;
          }
        }
        if (!Log.isLoggable("DomobSDK", 3)) {
          break label674;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return false;
      }
      Log.d("DomobSDK", "update config");
      label674:
      c localc1 = c.a(this.a);
      ContentValues localContentValues = new ContentValues();
      if (this.c != null) {
        localContentValues.put("_conf_ver", this.c);
      }
      if (this.b != null) {
        localContentValues.put("_res_ver", this.b);
      }
      if (this.d != -1) {
        localContentValues.put("_interval", Integer.valueOf(this.d));
      }
      localContentValues.put("_dis_flag", Boolean.valueOf(this.e));
      localContentValues.put("_dis_time", Long.valueOf(this.f));
      if (this.e)
      {
        this.g = SystemClock.uptimeMillis();
        localContentValues.put("_dis_timestamp", Long.valueOf(this.g));
      }
      localContentValues.put("_test_flag", Boolean.valueOf(this.i));
      if (this.h != null)
      {
        if (Log.isLoggable("DomobSDK", 3)) {
          Log.d("DomobSDK", "update cid:" + this.h);
        }
        localContentValues.put("_cid", this.h);
      }
      localc1.a(localContentValues);
      return true;
      label888:
      int k = 1;
    }
  }
  
  protected final int a()
  {
    return this.d;
  }
  
  protected final boolean b()
  {
    return this.e;
  }
  
  protected final long c()
  {
    return this.f;
  }
  
  protected final long d()
  {
    return this.g;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     cn.domob.android.ads.k
 * JD-Core Version:    0.7.0.1
 */