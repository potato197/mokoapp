package com.mchenxin.moko.activity;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.guohead.sdk.GuoheAdManager;
import com.mchenxin.moko.MokoApplication;
import com.mchenxin.moko.adapter.GalleryImageAdapter;
import com.mchenxin.moko.api.Album;
import com.mchenxin.moko.api.WSError;
import com.mchenxin.moko.api.util.MokoGet2Api;
import com.mchenxin.moko.widget.FailureBar;
import com.mchenxin.moko.widget.PhotoGallery;
import com.mchenxin.moko.widget.ProgressBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeActivity
  extends Activity
{
  private Button mButton;
  private ListView mChannelsListView;
  private FailureBar mFailureBar;
  private PhotoGallery mGallery;
  private ProgressBar mProgressBar;
  private ViewFlipper mViewFlipper;
  
  private List<HashMap<String, Object>> getListData()
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 1;; i++)
    {
      if (i >= MokoApplication.channelsTitle.length) {
        return localArrayList;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("channelTitle", getString(MokoApplication.channelsTitle[i]));
      localArrayList.add(localHashMap);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903044);
    this.mChannelsListView = ((ListView)findViewById(2131099672));
    this.mGallery = ((PhotoGallery)findViewById(2131099669));
    this.mProgressBar = ((ProgressBar)findViewById(2131099668));
    this.mFailureBar = ((FailureBar)findViewById(2131099670));
    this.mViewFlipper = ((ViewFlipper)findViewById(2131099667));
    this.mButton = ((Button)findViewById(2131099666));
    ListAdapter localListAdapter = new ListAdapter(this, getListData(), 2130903042, new String[] { "channelTitle" }, new int[] { 2131099663 });
    this.mChannelsListView.setAdapter(localListAdapter);
    this.mChannelsListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        Intent localIntent = new Intent();
        localIntent.setClass(HomeActivity.this, ChannelActivity.class);
        Bundle localBundle = new Bundle();
        localBundle.putInt("channel", paramAnonymousInt + 1);
        localIntent.putExtras(localBundle);
        HomeActivity.this.startActivity(localIntent);
      }
    });
    this.mButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent();
        localIntent.setClass(HomeActivity.this, ChannelActivity.class);
        Bundle localBundle = new Bundle();
        localBundle.putInt("channel", 0);
        localIntent.putExtras(localBundle);
        HomeActivity.this.startActivity(localIntent);
      }
    });
    if (MokoApplication.isWiFiActive(this))
    {
      new NewsTask(null).execute(new Void[] { null });
      return;
    }
    new AlertDialog.Builder(this).setMessage(2130968596).setNegativeButton(2130968597, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        new HomeActivity.NewsTask(HomeActivity.this, null).execute(new Void[] { null });
      }
    }).setPositiveButton(2130968598, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        HomeActivity.this.finish();
      }
    }).show();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    GuoheAdManager.finish(this);
    System.exit(0);
  }
  
  public class ListAdapter
    extends SimpleAdapter
  {
    public ListAdapter(List<HashMap<String, Object>> paramList, int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
    {
      super(paramInt, paramArrayOfString, paramArrayOfInt, arrayOfInt);
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView = super.getView(paramInt, paramView, paramViewGroup);
      localView.setBackgroundColor(MokoApplication.channelsColor[(paramInt + 1)]);
      return localView;
    }
  }
  
  private class NewsTask
    extends AsyncTask<Void, WSError, ArrayList<Album>>
  {
    private NewsTask() {}
    
    public ArrayList<Album> doInBackground(Void... paramVarArgs)
    {
      MokoGet2Api localMokoGet2Api = new MokoGet2Api();
      try
      {
        ArrayList localArrayList = localMokoGet2Api.getClassAblums(MokoApplication.channelsURL[0], 1, "big");
        return localArrayList;
      }
      catch (WSError localWSError)
      {
        publishProgress(new WSError[] { localWSError });
      }
      return null;
    }
    
    public void onPostExecute(final ArrayList<Album> paramArrayList)
    {
      ArrayList localArrayList;
      int i;
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
      {
        localArrayList = new ArrayList();
        i = 0;
        if (i >= paramArrayList.size())
        {
          HomeActivity.this.mViewFlipper.setDisplayedChild(1);
          GalleryImageAdapter localGalleryImageAdapter = new GalleryImageAdapter(HomeActivity.this);
          localGalleryImageAdapter.setImageUrls(localArrayList);
          HomeActivity.this.mGallery.setAdapter(localGalleryImageAdapter);
          HomeActivity.this.mGallery.setSelection(1, true);
          HomeActivity.this.mGallery.setOnItemClickListener(new AdapterView.OnItemClickListener()
          {
            public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
              Intent localIntent = new Intent();
              localIntent.setClass(HomeActivity.this, PhotoActivity.class);
              Bundle localBundle = new Bundle();
              localBundle.putString("url", ((Album)paramArrayList.get(paramAnonymousInt)).getUrl());
              localIntent.putExtras(localBundle);
              HomeActivity.this.startActivity(localIntent);
            }
          });
        }
      }
      for (;;)
      {
        super.onPostExecute(paramArrayList);
        return;
        localArrayList.add(((Album)paramArrayList.get(i)).getCover());
        i++;
        break;
        HomeActivity.this.mViewFlipper.setDisplayedChild(2);
        HomeActivity.this.mFailureBar.setOnRetryListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            new HomeActivity.NewsTask(HomeActivity.this, null).execute(new Void[] { null });
          }
        });
        HomeActivity.this.mFailureBar.setText(2130968593);
      }
    }
    
    public void onPreExecute()
    {
      HomeActivity.this.mViewFlipper.setDisplayedChild(0);
      HomeActivity.this.mProgressBar.setText(2130968592);
      super.onPreExecute();
    }
    
    protected void onProgressUpdate(WSError... paramVarArgs)
    {
      Toast.makeText(HomeActivity.this, paramVarArgs[0].getMessage(), 1).show();
      super.onProgressUpdate(paramVarArgs);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mchenxin.moko.activity.HomeActivity
 * JD-Core Version:    0.7.0.1
 */