package com.mchenxin.moko.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.mchenxin.moko.adapter.GridImageAdapter;
import com.mchenxin.moko.api.Album;
import com.mchenxin.moko.api.Artist;
import com.mchenxin.moko.api.WSError;
import com.mchenxin.moko.api.util.MokoGet2Api;
import com.mchenxin.moko.widget.ArtistBar;
import com.mchenxin.moko.widget.FailureBar;
import com.mchenxin.moko.widget.ProgressBar;
import java.util.ArrayList;

public class SiteActivity
  extends Activity
{
  private Artist mArtist;
  private ArtistBar mArtistBar;
  private FailureBar mFailureBar;
  private GridView mGridView;
  private ProgressBar mProgressBar;
  private ViewFlipper mViewFlipper;
  private int page = 1;
  MokoGet2Api server = new MokoGet2Api();
  private String url;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903047);
    this.url = getIntent().getExtras().getString("url");
    this.mViewFlipper = ((ViewFlipper)findViewById(2131099682));
    this.mProgressBar = ((ProgressBar)findViewById(2131099683));
    this.mFailureBar = ((FailureBar)findViewById(2131099685));
    this.mGridView = ((GridView)findViewById(2131099684));
    this.mArtistBar = ((ArtistBar)findViewById(2131099680));
    new NewsTask(null).execute(new Void[] { null });
  }
  
  private class NewsTask
    extends AsyncTask<Void, WSError, Artist>
  {
    private NewsTask() {}
    
    public Artist doInBackground(Void... paramVarArgs)
    {
      try
      {
        SiteActivity.this.mArtist = SiteActivity.this.server.getArtist(SiteActivity.this.url);
        return SiteActivity.this.mArtist;
      }
      catch (WSError localWSError)
      {
        for (;;)
        {
          publishProgress(new WSError[] { localWSError });
        }
      }
    }
    
    public void onPostExecute(final Artist paramArtist)
    {
      if (paramArtist != null)
      {
        SiteActivity.this.mViewFlipper.setDisplayedChild(1);
        SiteActivity.this.mArtistBar.setArtist(paramArtist);
        final GridImageAdapter localGridImageAdapter = new GridImageAdapter(SiteActivity.this);
        localGridImageAdapter.setList(paramArtist.getAblums());
        SiteActivity.this.mGridView.setAdapter(localGridImageAdapter);
        SiteActivity.this.mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
          public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            Intent localIntent = new Intent();
            localIntent.setClass(SiteActivity.this, PhotoActivity.class);
            Bundle localBundle = new Bundle();
            localBundle.putString("url", ((Album)paramArtist.getAblums().get(paramAnonymousInt)).getUrl());
            localIntent.putExtras(localBundle);
            SiteActivity.this.startActivity(localIntent);
          }
        });
        SiteActivity.this.mGridView.setOnScrollListener(new AbsListView.OnScrollListener()
        {
          public void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            int i = -1 + (paramAnonymousInt1 + paramAnonymousInt2);
            if ((paramAnonymousInt1 + paramAnonymousInt2 == paramAnonymousInt3) && (paramAnonymousInt3 < paramArtist.getAblumsSum()))
            {
              SiteActivity localSiteActivity = SiteActivity.this;
              localSiteActivity.page = (1 + localSiteActivity.page);
            }
            try
            {
              SiteActivity.this.server.updateAritstAlbums(SiteActivity.this.url, SiteActivity.this.page, paramArtist.getAblums());
              localGridImageAdapter.setList(paramArtist.getAblums());
              localGridImageAdapter.notifyDataSetChanged();
              SiteActivity.this.mGridView.setSelection(i);
              return;
            }
            catch (WSError localWSError)
            {
              for (;;)
              {
                localWSError.printStackTrace();
              }
            }
          }
          
          public void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt) {}
        });
      }
      for (;;)
      {
        super.onPostExecute(paramArtist);
        return;
        SiteActivity.this.mViewFlipper.setDisplayedChild(2);
        SiteActivity.this.mFailureBar.setOnRetryListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            new SiteActivity.NewsTask(SiteActivity.this, null).execute(new Void[] { null });
          }
        });
        SiteActivity.this.mFailureBar.setText(2130968593);
      }
    }
    
    public void onPreExecute()
    {
      SiteActivity.this.mViewFlipper.setDisplayedChild(0);
      SiteActivity.this.mProgressBar.setText(2130968592);
      super.onPreExecute();
    }
    
    protected void onProgressUpdate(WSError... paramVarArgs)
    {
      Toast.makeText(SiteActivity.this, paramVarArgs[0].getMessage(), 1).show();
      super.onProgressUpdate(paramVarArgs);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mchenxin.moko.activity.SiteActivity
 * JD-Core Version:    0.7.0.1
 */