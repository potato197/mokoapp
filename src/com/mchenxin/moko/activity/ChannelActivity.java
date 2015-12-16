package com.mchenxin.moko.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.mchenxin.moko.MokoApplication;
import com.mchenxin.moko.adapter.GridImageAdapter;
import com.mchenxin.moko.api.Album;
import com.mchenxin.moko.api.WSError;
import com.mchenxin.moko.api.util.MokoGet2Api;
import com.mchenxin.moko.widget.FailureBar;
import com.mchenxin.moko.widget.ProgressBar;
import java.util.ArrayList;

public class ChannelActivity
  extends Activity
{
  private ArrayList<Album> albums = null;
  private GridView gridView;
  private int id = 0;
  private FailureBar mFailureBar;
  private ProgressBar mProgressBar;
  private ViewFlipper mViewFlipper;
  private Button nextButton;
  private int page = 1;
  private TextView pageTextView;
  private Button preButton;
  private RelativeLayout relativeLayout;
  private Spinner spinner;
  private ArrayAdapter<String> spinnerAdapter;
  private String[] spinnerData = new String[MokoApplication.channelsTitle.length];
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramMenuItem.getMenuInfo();
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      return super.onContextItemSelected(paramMenuItem);
      if (localAdapterContextMenuInfo == null) {
        return super.onContextItemSelected(paramMenuItem);
      }
      String str = "http://www.moko.cc/post/" + ((Album)this.albums.get(localAdapterContextMenuInfo.position)).getAuthor() + "/new/1.html";
      Intent localIntent = new Intent();
      localIntent.setClass(this, SiteActivity.class);
      Bundle localBundle = new Bundle();
      localBundle.putString("url", str);
      localIntent.putExtras(localBundle);
      startActivity(localIntent);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903041);
    this.id = getIntent().getExtras().getInt("channel");
    this.spinner = ((Spinner)findViewById(2131099653));
    this.mViewFlipper = ((ViewFlipper)findViewById(2131099655));
    this.mProgressBar = ((ProgressBar)findViewById(2131099656));
    this.mFailureBar = ((FailureBar)findViewById(2131099658));
    this.gridView = ((GridView)findViewById(2131099657));
    this.relativeLayout = ((RelativeLayout)findViewById(2131099652));
    this.relativeLayout.setBackgroundColor(MokoApplication.channelsColor[this.id]);
    this.preButton = ((Button)findViewById(2131099660));
    this.nextButton = ((Button)findViewById(2131099662));
    this.pageTextView = ((TextView)findViewById(2131099661));
    registerForContextMenu(this.gridView);
    for (int i = 0;; i++)
    {
      if (i >= MokoApplication.channelsTitle.length)
      {
        this.spinnerAdapter = new ArrayAdapter(this, 17367048, this.spinnerData);
        this.spinnerAdapter.setDropDownViewResource(17367049);
        this.spinner.setAdapter(this.spinnerAdapter);
        this.spinner.setSelection(this.id);
        new NewsTask(null).execute(new Void[] { null });
        this.pageTextView.setText(this.page + "/10");
        this.preButton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            if (ChannelActivity.this.page == 1)
            {
              Toast.makeText(ChannelActivity.this, ChannelActivity.this.getString(2130968594), 1).show();
              return;
            }
            ChannelActivity localChannelActivity = ChannelActivity.this;
            localChannelActivity.page = (-1 + localChannelActivity.page);
            new ChannelActivity.NewsTask(ChannelActivity.this, null).execute(new Void[] { null });
            ChannelActivity.this.pageTextView.setText(ChannelActivity.this.page + "/10");
          }
        });
        this.nextButton.setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            if (ChannelActivity.this.page == 10)
            {
              Toast.makeText(ChannelActivity.this, ChannelActivity.this.getString(2130968595), 1).show();
              return;
            }
            ChannelActivity localChannelActivity = ChannelActivity.this;
            localChannelActivity.page = (1 + localChannelActivity.page);
            new ChannelActivity.NewsTask(ChannelActivity.this, null).execute(new Void[] { null });
            ChannelActivity.this.pageTextView.setText(ChannelActivity.this.page + "/10");
          }
        });
        this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            ChannelActivity.this.id = paramAnonymousInt;
            ChannelActivity.this.relativeLayout.setBackgroundColor(MokoApplication.channelsColor[ChannelActivity.this.id]);
            ChannelActivity.this.page = 1;
            ChannelActivity.this.pageTextView.setText(ChannelActivity.this.page + "/10");
            new ChannelActivity.NewsTask(ChannelActivity.this, null).execute(new Void[] { null });
          }
          
          public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
        });
        return;
      }
      this.spinnerData[i] = getString(MokoApplication.channelsTitle[i]);
    }
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    if (((Album)this.albums.get(localAdapterContextMenuInfo.position)).getAuthor() != null)
    {
      paramContextMenu.setHeaderIcon(2130837509);
      paramContextMenu.setHeaderTitle(2130968589);
      paramContextMenu.add(0, 0, 0, ((Album)this.albums.get(localAdapterContextMenuInfo.position)).getAuthor());
    }
  }
  
  private class NewsTask
    extends AsyncTask<Void, WSError, ArrayList<Album>>
  {
    private NewsTask() {}
    
    public ArrayList<Album> doInBackground(Void... paramVarArgs)
    {
      MokoGet2Api localMokoGet2Api = new MokoGet2Api();
      ChannelActivity.this.albums = null;
      try
      {
        ChannelActivity.this.albums = localMokoGet2Api.getClassAblums(MokoApplication.channelsURL[ChannelActivity.this.id], ChannelActivity.this.page, "small");
        return ChannelActivity.this.albums;
      }
      catch (WSError localWSError)
      {
        for (;;)
        {
          publishProgress(new WSError[] { localWSError });
        }
      }
    }
    
    public void onPostExecute(final ArrayList<Album> paramArrayList)
    {
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
      {
        ChannelActivity.this.mViewFlipper.setDisplayedChild(1);
        GridImageAdapter localGridImageAdapter = new GridImageAdapter(ChannelActivity.this);
        localGridImageAdapter.setList(paramArrayList);
        ChannelActivity.this.gridView.setAdapter(localGridImageAdapter);
        ChannelActivity.this.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            Intent localIntent = new Intent();
            localIntent.setClass(ChannelActivity.this, PhotoActivity.class);
            Bundle localBundle = new Bundle();
            localBundle.putString("url", ((Album)paramArrayList.get(paramAnonymousInt)).getUrl());
            localIntent.putExtras(localBundle);
            ChannelActivity.this.startActivity(localIntent);
          }
        });
      }
      for (;;)
      {
        super.onPostExecute(paramArrayList);
        return;
        ChannelActivity.this.mViewFlipper.setDisplayedChild(2);
        ChannelActivity.this.mFailureBar.setOnRetryListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            new ChannelActivity.NewsTask(ChannelActivity.this, null).execute(new Void[] { null });
          }
        });
        ChannelActivity.this.mFailureBar.setText(2130968593);
      }
    }
    
    public void onPreExecute()
    {
      ChannelActivity.this.mViewFlipper.setDisplayedChild(0);
      ChannelActivity.this.mProgressBar.setText(2130968592);
      super.onPreExecute();
    }
    
    protected void onProgressUpdate(WSError... paramVarArgs)
    {
      Toast.makeText(ChannelActivity.this, paramVarArgs[0].getMessage(), 1).show();
      super.onProgressUpdate(paramVarArgs);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mchenxin.moko.activity.ChannelActivity
 * JD-Core Version:    0.7.0.1
 */