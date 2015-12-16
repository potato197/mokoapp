package com.github.droidfu.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.github.droidfu.DroidFuApplication;

public class BetterService
  extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    ((DroidFuApplication)getApplication()).setActiveContext(getClass().getCanonicalName(), this);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.services.BetterService
 * JD-Core Version:    0.7.0.1
 */