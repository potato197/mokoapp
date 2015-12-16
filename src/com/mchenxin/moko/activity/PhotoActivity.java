package com.mchenxin.moko.activity;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.github.droidfu.adapters.WebGalleryAdapter;
import com.mchenxin.moko.MokoApplication;
import com.mchenxin.moko.api.WSError;
import com.mchenxin.moko.api.util.MokoGet2Api;
import com.mchenxin.moko.widget.FailureBar;
import com.mchenxin.moko.widget.PhotoGallery;
import java.io.IOException;
import java.util.ArrayList;

public class PhotoActivity
  extends Activity
{
  private FailureBar mFailureBar;
  private PhotoGallery mGallery;
  int mPosition;
  private ViewFlipper mViewFlipper;
  private ArrayList<String> photos = null;
  private String url = null;
  
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
      try
      {
        WallpaperManager localWallpaperManager = WallpaperManager.getInstance(this);
        int i = localWallpaperManager.getDesiredMinimumWidth();
        int j = localWallpaperManager.getDesiredMinimumHeight();
        localWallpaperManager.clear();
        localWallpaperManager.setBitmap(MokoApplication.resizeBmp((String)this.photos.get(localAdapterContextMenuInfo.position % this.photos.size()), i, j));
        Toast.makeText(this, getString(2130968603), 0).show();
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        Toast.makeText(this, getString(2130968604), 0).show();
      }
      continue;
      if (localAdapterContextMenuInfo == null) {
        return super.onContextItemSelected(paramMenuItem);
      }
      if (MokoApplication.saveToFile(getString(2130968577), (String)this.photos.get(localAdapterContextMenuInfo.position % this.photos.size()))) {
        Toast.makeText(this, getString(2130968600), 0).show();
      } else {
        Toast.makeText(this, getString(2130968601), 0).show();
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903045);
    this.url = getIntent().getExtras().getString("url");
    this.mViewFlipper = ((ViewFlipper)findViewById(2131099673));
    this.mFailureBar = ((FailureBar)findViewById(2131099676));
    this.mGallery = ((PhotoGallery)findViewById(2131099675));
    registerForContextMenu(this.mGallery);
    new NewsTask(null).execute(new Void[] { null });
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    if (Environment.getExternalStorageState().equals("mounted"))
    {
      paramContextMenu.setHeaderTitle("");
      paramContextMenu.add(0, 0, 0, 2130968602);
      paramContextMenu.add(0, 1, 1, 2130968599);
      return;
    }
    paramContextMenu.setHeaderTitle("");
    paramContextMenu.add(0, 0, 0, 2130968602);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131034112, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      return true;
      if (this.mPosition == 0)
      {
        Toast.makeText(this, getString(2130968594), 0).show();
      }
      else
      {
        PhotoGallery localPhotoGallery2 = this.mGallery;
        int m = -1 + this.mPosition;
        this.mPosition = m;
        localPhotoGallery2.setSelection(m);
        continue;
        if (MokoApplication.saveToFile(getString(2130968577), (String)this.photos.get(this.mPosition % this.photos.size())))
        {
          Toast.makeText(this, getString(2130968600), 0).show();
        }
        else
        {
          Toast.makeText(this, getString(2130968601), 0).show();
          continue;
          try
          {
            WallpaperManager localWallpaperManager = WallpaperManager.getInstance(this);
            int j = localWallpaperManager.getDesiredMinimumWidth();
            int k = localWallpaperManager.getDesiredMinimumHeight();
            localWallpaperManager.clear();
            localWallpaperManager.setBitmap(MokoApplication.resizeBmp((String)this.photos.get(this.mPosition % this.photos.size()), j, k));
            Toast.makeText(this, getString(2130968603), 0).show();
          }
          catch (IOException localIOException)
          {
            localIOException.printStackTrace();
            Toast.makeText(this, getString(2130968604), 0).show();
          }
          continue;
          if (this.mPosition == -1 + this.photos.size())
          {
            Toast.makeText(this, getString(2130968595), 0).show();
          }
          else
          {
            PhotoGallery localPhotoGallery1 = this.mGallery;
            int i = 1 + this.mPosition;
            this.mPosition = i;
            localPhotoGallery1.setSelection(i);
          }
        }
      }
    }
  }
  
  private class NewsTask
    extends AsyncTask<Void, WSError, ArrayList<String>>
  {
    private NewsTask() {}
    
    public ArrayList<String> doInBackground(Void... paramVarArgs)
    {
      MokoGet2Api localMokoGet2Api = new MokoGet2Api();
      try
      {
        PhotoActivity.this.photos = localMokoGet2Api.getPhotos(PhotoActivity.this.url);
        return PhotoActivity.this.photos;
      }
      catch (WSError localWSError)
      {
        for (;;)
        {
          publishProgress(new WSError[] { localWSError });
        }
      }
    }
    
    public void onPostExecute(final ArrayList<String> paramArrayList)
    {
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
      {
        PhotoActivity.this.mViewFlipper.setDisplayedChild(1);
        WebGalleryAdapter localWebGalleryAdapter = new WebGalleryAdapter(PhotoActivity.this);
        localWebGalleryAdapter.setImageUrls(paramArrayList);
        PhotoActivity.this.mGallery.setAdapter(localWebGalleryAdapter);
        PhotoActivity.this.mGallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
          public void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            PhotoActivity.this.mPosition = paramAnonymousInt;
            PhotoActivity.this.setTitle(PhotoActivity.this.getString(2130968576) + "(" + (1 + paramAnonymousInt % paramArrayList.size()) + "/" + paramArrayList.size() + ")");
          }
          
          public void onNothingSelected(AdapterView<?> paramAnonymousAdapterView) {}
        });
      }
      for (;;)
      {
        super.onPostExecute(paramArrayList);
        return;
        PhotoActivity.this.mViewFlipper.setDisplayedChild(2);
        PhotoActivity.this.mFailureBar.setOnRetryListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            new PhotoActivity.NewsTask(PhotoActivity.this, null).execute(new Void[] { null });
          }
        });
        PhotoActivity.this.mFailureBar.setText(2130968593);
      }
    }
    
    public void onPreExecute()
    {
      PhotoActivity.this.mViewFlipper.setDisplayedChild(0);
      super.onPreExecute();
    }
    
    protected void onProgressUpdate(WSError... paramVarArgs)
    {
      Toast.makeText(PhotoActivity.this, paramVarArgs[0].getMessage(), 1).show();
      super.onProgressUpdate(paramVarArgs);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mchenxin.moko.activity.PhotoActivity
 * JD-Core Version:    0.7.0.1
 */