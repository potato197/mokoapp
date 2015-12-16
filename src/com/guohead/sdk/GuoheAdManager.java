package com.guohead.sdk;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import com.guohead.sdk.adapters.GuoheAdAdapter;
import com.guohead.sdk.obj.Custom;
import com.guohead.sdk.obj.Extra;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.GuoheAdUtil;
import com.guohead.sdk.util.Logger;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GuoheAdManager
{
  public static String keyGuoheAd;
  private static Context mContext;
  public static int totalAdNum;
  private Context context;
  public SharedPreferences data;
  private Extra extra;
  private GuoheAdHttpClient httpClient = new GuoheAdHttpClient();
  public String localeString;
  private List<Ration> rationsList;
  Iterator<Ration> rollovers;
  private int totalWeight = 0;
  
  public GuoheAdManager(Context paramContext, String paramString)
  {
    Logger.i("Creating guoheAdManager...");
    Logger.addStatus("Creating GuoheAdManager");
    mContext = paramContext;
    keyGuoheAd = paramString;
    GuoheAdUtil.init(mContext);
    this.data = mContext.getSharedPreferences("GHData", 0);
    HttpfetchConfig();
    while (this.extra == null)
    {
      fetchConfig();
      if (this.extra == null) {
        try
        {
          Logger.d("Sleeping for 30 seconds");
          Thread.sleep(30000L);
        }
        catch (InterruptedException localInterruptedException)
        {
          Logger.e("Thread unable to sleep" + localInterruptedException);
        }
      }
    }
    Logger.i("Finished creating guoheAdManager");
    Logger.addStatus("Created GuoheAdManager=>OK");
  }
  
  private Drawable fetchImage(String paramString)
  {
    try
    {
      Drawable localDrawable = Drawable.createFromStream((InputStream)new URL(paramString).getContent(), "src");
      return localDrawable;
    }
    catch (Exception localException)
    {
      Logger.e("Unable to fetchImage(): " + localException);
    }
    return null;
  }
  
  public static void finish(Context paramContext)
  {
    try
    {
      GuoheAdAdapter.finish(paramContext);
      return;
    }
    catch (Exception localException)
    {
      Logger.v("Finish Exception: " + localException.toString());
    }
  }
  
  public static String getRunningServicesInfo(Context paramContext)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningServices(100).iterator();
    while (localIterator.hasNext())
    {
      ActivityManager.RunningServiceInfo localRunningServiceInfo = (ActivityManager.RunningServiceInfo)localIterator.next();
      localStringBuffer.append("pid: ").append(localRunningServiceInfo.pid);
      localStringBuffer.append("\nprocess: " + localRunningServiceInfo.process);
      localStringBuffer.append("\nservice: ").append(localRunningServiceInfo.service);
      localStringBuffer.append("\ncrashCount: ").append(localRunningServiceInfo.crashCount);
      localStringBuffer.append("\nclientCount: ").append(localRunningServiceInfo.clientCount);
      localStringBuffer.append(";");
    }
    return localStringBuffer.toString();
  }
  
  public static void init(String paramString)
  {
    GuoheAdUtil.setAppKey(paramString);
  }
  
  private void parseConfigurationString(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      parseExtraJson(localJSONObject.getJSONObject("extra"));
      parseRationsJson(localJSONObject.getJSONArray("rations"));
      return;
    }
    catch (JSONException localJSONException)
    {
      Logger.e("Unable to parse response from JSON. This may or may not be fatal." + localJSONException);
      this.extra = new Extra();
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
      Logger.e("Unable to parse response from JSON. This may or may not be fatal." + localNullPointerException);
      this.extra = new Extra();
    }
  }
  
  private Custom parseCustomJsonString(String paramString)
  {
    Logger.d("Received custom jsonString: " + paramString);
    Custom localCustom = new Custom();
    if (paramString != "{}") {
      try
      {
        JSONObject localJSONObject1 = new JSONObject(paramString);
        localCustom.type = localJSONObject1.getInt("ad_type");
        if ((localCustom.type != 1) && (localCustom.type != 3))
        {
          JSONObject localJSONObject2 = localJSONObject1.getJSONObject("bgcolor");
          localCustom.bgRed = localJSONObject2.getInt("red");
          localCustom.bgGreen = localJSONObject2.getInt("green");
          localCustom.bgBlue = localJSONObject2.getInt("blue");
          localCustom.bgAlpha = (255 * localJSONObject2.getInt("alpha"));
          JSONObject localJSONObject3 = localJSONObject1.getJSONObject("textcolor");
          localCustom.fgRed = localJSONObject3.getInt("red");
          localCustom.fgGreen = localJSONObject3.getInt("green");
          localCustom.fgBlue = localJSONObject3.getInt("blue");
          localCustom.fgAlpha = (255 * localJSONObject3.getInt("alpha"));
          localCustom.description = localJSONObject1.getString("ad_text");
        }
        while (localCustom.type != 5)
        {
          localCustom.link = localJSONObject1.getString("redirect_url");
          localCustom.imageLink = localJSONObject1.getString("img_url");
          localCustom.image = fetchImage(localCustom.imageLink);
          break;
          localCustom.description = localJSONObject1.getString("ad_text");
          continue;
          localCustom = null;
        }
      }
      catch (JSONException localJSONException)
      {
        Logger.e("Caught JSONException in parseCustomJsonString()" + localJSONException);
        return null;
      }
    }
    return localCustom;
  }
  
  private void parseExtraJson(JSONObject paramJSONObject)
  {
    Extra localExtra = new Extra();
    try
    {
      localExtra.cycleTime = paramJSONObject.getInt("cycle_time");
      localExtra.locationOn = paramJSONObject.getInt("location_on");
      localExtra.transition = paramJSONObject.getInt("transition");
      JSONObject localJSONObject1 = paramJSONObject.getJSONObject("background_color_rgb");
      localExtra.bgRed = localJSONObject1.getInt("red");
      localExtra.bgGreen = localJSONObject1.getInt("green");
      localExtra.bgBlue = localJSONObject1.getInt("blue");
      localExtra.bgAlpha = (255 * localJSONObject1.getInt("alpha"));
      JSONObject localJSONObject2 = paramJSONObject.getJSONObject("text_color_rgb");
      localExtra.fgRed = localJSONObject2.getInt("red");
      localExtra.fgGreen = localJSONObject2.getInt("green");
      localExtra.fgBlue = localJSONObject2.getInt("blue");
      localExtra.fgAlpha = (255 * localJSONObject2.getInt("alpha"));
      this.extra = localExtra;
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Logger.e("Exception in parsing config.extra JSON. This may or may not be fatal." + localJSONException);
      }
    }
  }
  
  private void parseRationsJson(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    this.totalWeight = 0;
    for (int i = 0;; i++)
    {
      JSONObject localJSONObject;
      Ration localRation;
      try
      {
        if (i < paramJSONArray.length())
        {
          localJSONObject = paramJSONArray.getJSONObject(i);
          if (localJSONObject == null) {
            continue;
          }
          localRation = new Ration();
          localRation.appid = localJSONObject.getString("appid");
          localRation.nid = localJSONObject.getString("nid");
          localRation.type = localJSONObject.getInt("type");
          localRation.name = localJSONObject.getString("nname");
          localRation.weight = localJSONObject.getInt("weight");
          localRation.priority = localJSONObject.getInt("priority");
          switch (localRation.type)
          {
          default: 
            Logger.w("Don't know how to fetch key for unexpected ration type: " + localRation.type);
          }
        }
      }
      catch (JSONException localJSONException)
      {
        Logger.e("JSONException in parsing config.rations JSON. This may or may not be fatal." + localJSONException);
        Collections.sort(localArrayList);
        this.rationsList = localArrayList;
        this.rollovers = this.rationsList.iterator();
        return;
      }
      String str3 = localJSONObject.getString("key");
      if (str3.contains("|;|"))
      {
        String[] arrayOfString10 = str3.split("\\|;\\|");
        localRation.key = arrayOfString10[0];
        if (arrayOfString10.length > 1) {
          localRation.key2 = arrayOfString10[1];
        }
      }
      for (;;)
      {
        this.totalWeight += localRation.weight;
        localArrayList.add(localRation);
        totalAdNum = localArrayList.size();
        break;
        localRation.key = localJSONObject.getString("key");
        continue;
        String str2 = localJSONObject.getString("key");
        if (str2.contains("|;|"))
        {
          String[] arrayOfString9 = str2.split("\\|;\\|");
          localRation.key = arrayOfString9[0];
          if (arrayOfString9.length > 1) {
            localRation.key2 = arrayOfString9[1];
          }
        }
        else
        {
          localRation.key = localJSONObject.getString("key");
          continue;
          String[] arrayOfString8 = localJSONObject.getString("key").split("\\|;\\|");
          localRation.key = arrayOfString8[0];
          localRation.key2 = arrayOfString8[1];
          continue;
          String[] arrayOfString7 = localJSONObject.getString("key").split("\\|;\\|");
          localRation.key = arrayOfString7[0];
          localRation.key2 = arrayOfString7[1];
          localRation.key3 = arrayOfString7[2];
          continue;
          String[] arrayOfString6 = localJSONObject.getString("key").split("\\|;\\|");
          localRation.key = arrayOfString6[0];
          localRation.key2 = arrayOfString6[1];
          continue;
          String[] arrayOfString5 = localJSONObject.getString("key").split("\\|;\\|");
          localRation.key = arrayOfString5[0];
          localRation.key2 = arrayOfString5[1];
          continue;
          String str1 = localJSONObject.getString("key");
          if (str1.contains("|;|"))
          {
            String[] arrayOfString4 = str1.split("\\|;\\|");
            localRation.key = arrayOfString4[0];
            localRation.key2 = arrayOfString4[1];
          }
          else
          {
            localRation.key = localJSONObject.getString("key");
            continue;
            String[] arrayOfString3 = localJSONObject.getString("key").split("\\|;\\|");
            if (arrayOfString3.length == 2)
            {
              localRation.key = arrayOfString3[0];
              localRation.key2 = arrayOfString3[1];
            }
            else
            {
              localRation.key = arrayOfString3[0];
              continue;
              String[] arrayOfString2 = localJSONObject.getString("key").split("\\|;\\|");
              if (arrayOfString2.length == 3)
              {
                localRation.key = arrayOfString2[0];
                localRation.key2 = arrayOfString2[1];
                localRation.key3 = arrayOfString2[2];
              }
              else
              {
                localRation.key = arrayOfString2[0];
                localRation.key2 = arrayOfString2[1];
                continue;
                localRation.key = localJSONObject.getString("key").split("\\|;\\|")[0];
                continue;
                String[] arrayOfString1 = localJSONObject.getString("key").split("\\|;\\|");
                localRation.key = arrayOfString1[0];
                localRation.key2 = arrayOfString1[1];
                continue;
                localRation.key = localJSONObject.getString("key");
              }
            }
          }
        }
      }
    }
  }
  
  public static void refreshAd(Context paramContext)
  {
    try
    {
      GuoheAdAdapter.refreshAd(paramContext);
      return;
    }
    catch (Exception localException)
    {
      Logger.v("Finish Exception: " + localException.toString());
    }
  }
  
  public static void setGender(String paramString)
  {
    GuoheAdUtil.Gender = paramString;
  }
  
  public void HttpfetchConfig()
  {
    String str = this.httpClient.httpGet(null, 1, Boolean.valueOf(true));
    Logger.d("Received jsonString: " + str);
    parseConfigurationString(str);
    this.data.edit().putString("GHConfig", str).commit();
  }
  
  public void fetchConfig()
  {
    String str = "{}";
    try
    {
      this.data = mContext.getSharedPreferences("GHData", 0);
      if (this.data != null) {
        str = this.data.getString("GHConfig", "{}");
      }
      if ((str != null) && (str.length() > 2))
      {
        parseConfigurationString(str);
        Logger.d("Readed jsonString: " + str);
      }
      HttpfetchConfig();
      return;
    }
    catch (Exception localException)
    {
      Logger.e("Caught Exception in fetchConfig()" + localException);
    }
  }
  
  public Custom getCustom(Ration paramRation)
  {
    return parseCustomJsonString(this.httpClient.httpGet(paramRation, 5, Boolean.valueOf(true)));
  }
  
  public Extra getExtra()
  {
    if (this.totalWeight <= 0)
    {
      Logger.i("Sum of ration weights is 0 - no ads to be shown");
      return null;
    }
    return this.extra;
  }
  
  public ArrayList<PInfo> getInstalledApps(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    List localList = this.context.getPackageManager().getInstalledPackages(0);
    int i = 0;
    if (i < localList.size())
    {
      PackageInfo localPackageInfo = (PackageInfo)localList.get(i);
      if (!paramBoolean) {}
      for (;;)
      {
        i++;
        break;
        PInfo localPInfo = new PInfo();
        PInfo.access$002(localPInfo, localPackageInfo.applicationInfo.loadLabel(this.context.getPackageManager()).toString());
        PInfo.access$102(localPInfo, localPackageInfo.packageName);
        localArrayList.add(localPInfo);
        localPInfo.infoPrint();
      }
    }
    return localArrayList;
  }
  
  public Location getLocation()
  {
    if (this.context == null) {}
    do
    {
      return null;
      if (this.context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0) {
        return ((LocationManager)this.context.getSystemService("location")).getLastKnownLocation("gps");
      }
    } while (this.context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0);
    return ((LocationManager)this.context.getSystemService("location")).getLastKnownLocation("network");
  }
  
  public Ration getRation()
  {
    Logger.i("getRation()");
    int i = 1 + new Random().nextInt(this.totalWeight);
    int j = 0;
    Iterator localIterator = this.rationsList.iterator();
    Ration localRation = null;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localRation = (Ration)localIterator.next();
      j += localRation.weight;
    } while (j < i);
    return localRation;
  }
  
  public Ration getRollover()
  {
    if (this.rollovers == null) {}
    while (!this.rollovers.hasNext()) {
      return null;
    }
    return (Ration)this.rollovers.next();
  }
  
  public void resetRollover()
  {
    this.rollovers = this.rationsList.iterator();
  }
  
  class PInfo
  {
    private String appname = "";
    private String pname = "";
    
    PInfo() {}
    
    private void infoPrint()
    {
      Logger.v(this.appname + "/" + this.pname);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.GuoheAdManager
 * JD-Core Version:    0.7.0.1
 */