package com.github.droidfu.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import com.github.droidfu.DroidFuApplication;
import com.github.droidfu.dialogs.DialogClickListener;
import java.util.List;

public class BetterDefaultActivity
  extends Activity
  implements BetterActivity
{
  private Intent currentIntent;
  private int progressDialogMsgId;
  private int progressDialogTitleId;
  private boolean wasCreated;
  private boolean wasInterrupted;
  
  public Intent getCurrentIntent()
  {
    return this.currentIntent;
  }
  
  public int getWindowFeatures()
  {
    return BetterActivityHelper.getWindowFeatures(this);
  }
  
  public boolean isApplicationBroughtToBackground()
  {
    return BetterActivityHelper.isApplicationBroughtToBackground(this);
  }
  
  public boolean isLandscapeMode()
  {
    return getWindowManager().getDefaultDisplay().getOrientation() == 1;
  }
  
  public boolean isLaunching()
  {
    return (!this.wasInterrupted) && (this.wasCreated);
  }
  
  public boolean isPortraitMode()
  {
    return !isLandscapeMode();
  }
  
  public boolean isRestoring()
  {
    return this.wasInterrupted;
  }
  
  public boolean isResuming()
  {
    return !this.wasCreated;
  }
  
  public AlertDialog newAlertDialog(int paramInt1, int paramInt2)
  {
    return BetterActivityHelper.newMessageDialog(this, getString(paramInt1), getString(paramInt2), 17301543);
  }
  
  public AlertDialog newErrorHandlerDialog(int paramInt, Exception paramException)
  {
    return BetterActivityHelper.newErrorHandlerDialog(this, getString(paramInt), paramException);
  }
  
  public AlertDialog newErrorHandlerDialog(Exception paramException)
  {
    return newErrorHandlerDialog(getResources().getIdentifier("droidfu_error_dialog_title", "string", getPackageName()), paramException);
  }
  
  public AlertDialog newInfoDialog(int paramInt1, int paramInt2)
  {
    return BetterActivityHelper.newMessageDialog(this, getString(paramInt1), getString(paramInt2), 17301659);
  }
  
  public <T> Dialog newListDialog(List<T> paramList, DialogClickListener<T> paramDialogClickListener, boolean paramBoolean)
  {
    return BetterActivityHelper.newListDialog(this, paramList, paramDialogClickListener, paramBoolean);
  }
  
  public AlertDialog newYesNoDialog(int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener)
  {
    return BetterActivityHelper.newYesNoDialog(this, getString(paramInt1), getString(paramInt2), 17301659, paramOnClickListener);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.wasCreated = true;
    this.currentIntent = getIntent();
    ((DroidFuApplication)getApplication()).setActiveContext(getClass().getCanonicalName(), this);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    return BetterActivityHelper.createProgressDialog(this, this.progressDialogTitleId, this.progressDialogMsgId);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.currentIntent = paramIntent;
  }
  
  protected void onPause()
  {
    super.onPause();
    this.wasInterrupted = false;
    this.wasCreated = false;
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
    this.wasInterrupted = true;
  }
  
  public void setProgressDialogMsgId(int paramInt)
  {
    this.progressDialogMsgId = paramInt;
  }
  
  public void setProgressDialogTitleId(int paramInt)
  {
    this.progressDialogTitleId = paramInt;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.activities.BetterDefaultActivity
 * JD-Core Version:    0.7.0.1
 */