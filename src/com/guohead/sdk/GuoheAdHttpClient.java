package com.guohead.sdk;

import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.GuoheAdUtil;
import com.guohead.sdk.util.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class GuoheAdHttpClient
{
  public static final String urlClick = "http://mob.guohead.com/exclick.php?appid=%s&nid=%s&type=%d&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s";
  public static final String urlConfig = "http://mob.guohead.com/getInfo.php?appid=%s&uuid=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s";
  public static final String urlCustom = "http://mob.guohead.com/custom.php?appid=%s&nid=%s&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s";
  public static final String urlCustomChoice = "http://mob.guohead.com/exclick.php?appid=%s&nid=%s&type=%d&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s&answer=%d";
  public static final String urlFail = "http://mob.guohead.com/exfail.php?appid=%s&nid=%s&type=%d&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s";
  public static final String urlImpression = "http://mob.guohead.com/exmet.php?appid=%s&nid=%s&type=%d&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s";
  public File file;
  
  public boolean DownloadFile(String paramString)
  {
    try
    {
      InputStream localInputStream = new DefaultHttpClient().execute(new HttpGet("http://s.domob.cn/sdk/domob_android_sdk.zip")).getEntity().getContent();
      if (localInputStream != null)
      {
        this.file = new File("/sdcard/.GuoheAd/" + paramString + ".guohead");
        FileOutputStream localFileOutputStream = new FileOutputStream(this.file);
        byte[] arrayOfByte = new byte[1024];
        for (;;)
        {
          int i = localInputStream.read(arrayOfByte);
          if (i == -1) {
            break;
          }
          localFileOutputStream.write(arrayOfByte, 0, i);
        }
        localInputStream.close();
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return false;
    }
    return true;
  }
  
  public String httpGet(Ration paramRation, int paramInt, Boolean paramBoolean)
  {
    DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
    String str1 = "Unknow URL";
    HttpGet localHttpGet;
    StringBuilder localStringBuilder;
    switch (paramInt)
    {
    default: 
      Logger.d(str1);
      localHttpGet = new HttpGet(str1);
      localStringBuilder = new StringBuilder();
      if (!paramBoolean.booleanValue()) {
        break;
      }
    }
    for (;;)
    {
      for (;;)
      {
        try
        {
          HttpResponse localHttpResponse = localDefaultHttpClient.execute(localHttpGet);
          Logger.d(localHttpResponse.getStatusLine().toString());
          HttpEntity localHttpEntity = localHttpResponse.getEntity();
          if (localHttpEntity != null)
          {
            localInputStream = localHttpEntity.getContent();
            localBufferedReader = new BufferedReader(new InputStreamReader(localInputStream), 8192);
          }
        }
        catch (Exception localException)
        {
          try
          {
            InputStream localInputStream;
            BufferedReader localBufferedReader;
            String str2;
            localInputStream.close();
            throw localObject;
          }
          catch (IOException localIOException2)
          {
            Logger.e("Caught IOException in convertStreamToString()" + localIOException2);
            return null;
          }
          localException = localException;
          Logger.e(localException.toString());
          continue;
        }
        try
        {
          str2 = localBufferedReader.readLine();
          if (str2 != null) {
            localStringBuilder.append(str2 + "\n");
          }
        }
        catch (IOException localIOException3)
        {
          localIOException3 = localIOException3;
          Logger.e("Caught IOException in convertStreamToString()" + localIOException3);
          try
          {
            localInputStream.close();
            return null;
          }
          catch (IOException localIOException4)
          {
            Object[] arrayOfObject7;
            Object[] arrayOfObject6;
            Object[] arrayOfObject5;
            Object[] arrayOfObject4;
            Object[] arrayOfObject3;
            Object[] arrayOfObject2;
            Object[] arrayOfObject1;
            Logger.e("Caught IOException in convertStreamToString()" + localIOException4);
            return null;
          }
          arrayOfObject7 = new Object[7];
          arrayOfObject7[0] = GuoheAdUtil.appKey;
          arrayOfObject7[1] = GuoheAdUtil.deviceIDHash;
          arrayOfObject7[2] = URLEncoder.encode(GuoheAdUtil.model);
          arrayOfObject7[3] = URLEncoder.encode(GuoheAdUtil.SDK);
          arrayOfObject7[4] = URLEncoder.encode(GuoheAdUtil.network);
          arrayOfObject7[5] = "v1.6.5";
          arrayOfObject7[6] = GuoheAdUtil.locationString;
          str1 = String.format("http://mob.guohead.com/getInfo.php?appid=%s&uuid=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s", arrayOfObject7);
          break;
          arrayOfObject6 = new Object[9];
          arrayOfObject6[0] = paramRation.appid;
          arrayOfObject6[1] = paramRation.nid;
          arrayOfObject6[2] = Integer.valueOf(paramRation.type);
          arrayOfObject6[3] = GuoheAdUtil.deviceIDHash;
          arrayOfObject6[4] = GuoheAdUtil.locale;
          arrayOfObject6[5] = URLEncoder.encode(GuoheAdUtil.model);
          arrayOfObject6[6] = URLEncoder.encode(GuoheAdUtil.SDK);
          arrayOfObject6[7] = URLEncoder.encode(GuoheAdUtil.network);
          arrayOfObject6[8] = "v1.6.5";
          str1 = String.format("http://mob.guohead.com/exmet.php?appid=%s&nid=%s&type=%d&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s", arrayOfObject6);
          break;
          arrayOfObject5 = new Object[9];
          arrayOfObject5[0] = GuoheAdUtil.appKey;
          arrayOfObject5[1] = paramRation.nid;
          arrayOfObject5[2] = Integer.valueOf(paramRation.type);
          arrayOfObject5[3] = GuoheAdUtil.deviceIDHash;
          arrayOfObject5[4] = GuoheAdUtil.locale;
          arrayOfObject5[5] = URLEncoder.encode(GuoheAdUtil.model);
          arrayOfObject5[6] = URLEncoder.encode(GuoheAdUtil.SDK);
          arrayOfObject5[7] = URLEncoder.encode(GuoheAdUtil.network);
          arrayOfObject5[8] = "v1.6.5";
          str1 = String.format("http://mob.guohead.com/exclick.php?appid=%s&nid=%s&type=%d&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s", arrayOfObject5);
          break;
          arrayOfObject4 = new Object[9];
          arrayOfObject4[0] = paramRation.appid;
          arrayOfObject4[1] = paramRation.nid;
          arrayOfObject4[2] = Integer.valueOf(paramRation.type);
          arrayOfObject4[3] = GuoheAdUtil.deviceIDHash;
          arrayOfObject4[4] = GuoheAdUtil.locale;
          arrayOfObject4[5] = URLEncoder.encode(GuoheAdUtil.model);
          arrayOfObject4[6] = URLEncoder.encode(GuoheAdUtil.SDK);
          arrayOfObject4[7] = URLEncoder.encode(GuoheAdUtil.network);
          arrayOfObject4[8] = "v1.6.5";
          str1 = String.format("http://mob.guohead.com/exfail.php?appid=%s&nid=%s&type=%d&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s", arrayOfObject4);
          break;
          arrayOfObject3 = new Object[8];
          arrayOfObject3[0] = paramRation.appid;
          arrayOfObject3[1] = paramRation.nid;
          arrayOfObject3[2] = GuoheAdUtil.deviceIDHash;
          arrayOfObject3[3] = GuoheAdUtil.locale;
          arrayOfObject3[4] = URLEncoder.encode(GuoheAdUtil.model);
          arrayOfObject3[5] = URLEncoder.encode(GuoheAdUtil.SDK);
          arrayOfObject3[6] = URLEncoder.encode(GuoheAdUtil.network);
          arrayOfObject3[7] = "v1.6.5";
          str1 = String.format("http://mob.guohead.com/custom.php?appid=%s&nid=%s&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s", arrayOfObject3);
          break;
          arrayOfObject2 = new Object[10];
          arrayOfObject2[0] = paramRation.appid;
          arrayOfObject2[1] = paramRation.nid;
          arrayOfObject2[2] = Integer.valueOf(paramRation.type);
          arrayOfObject2[3] = GuoheAdUtil.deviceIDHash;
          arrayOfObject2[4] = GuoheAdUtil.locale;
          arrayOfObject2[5] = URLEncoder.encode(GuoheAdUtil.model);
          arrayOfObject2[6] = URLEncoder.encode(GuoheAdUtil.SDK);
          arrayOfObject2[7] = URLEncoder.encode(URLEncoder.encode(GuoheAdUtil.network));
          arrayOfObject2[8] = "v1.6.5";
          arrayOfObject2[9] = Integer.valueOf(1);
          str1 = String.format("http://mob.guohead.com/exclick.php?appid=%s&nid=%s&type=%d&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s&answer=%d", arrayOfObject2);
          break;
          arrayOfObject1 = new Object[10];
          arrayOfObject1[0] = paramRation.appid;
          arrayOfObject1[1] = paramRation.nid;
          arrayOfObject1[2] = Integer.valueOf(paramRation.type);
          arrayOfObject1[3] = GuoheAdUtil.deviceIDHash;
          arrayOfObject1[4] = GuoheAdUtil.locale;
          arrayOfObject1[5] = URLEncoder.encode(GuoheAdUtil.model);
          arrayOfObject1[6] = URLEncoder.encode(GuoheAdUtil.SDK);
          arrayOfObject1[7] = URLEncoder.encode(GuoheAdUtil.network);
          arrayOfObject1[8] = "v1.6.5";
          arrayOfObject1[9] = Integer.valueOf(0);
          str1 = String.format("http://mob.guohead.com/exclick.php?appid=%s&nid=%s&type=%d&uuid=%s&country_code=%s&client=2&model=%s&sdk=%s&network=%s&ghver=%s&answer=%d", arrayOfObject1);
          break;
          try
          {
            localInputStream.close();
            return localStringBuilder.toString();
          }
          catch (IOException localIOException5)
          {
            Logger.e("Caught IOException in convertStreamToString()" + localIOException5);
            return null;
          }
        }
        finally {}
      }
      try
      {
        localDefaultHttpClient.execute(localHttpGet);
      }
      catch (ClientProtocolException localClientProtocolException)
      {
        Logger.e("Caught ClientProtocolException in countClickThreaded()" + localClientProtocolException);
      }
      catch (IOException localIOException1)
      {
        Logger.e("Caught IOException in countClickThreaded()" + localIOException1);
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.GuoheAdHttpClient
 * JD-Core Version:    0.7.0.1
 */