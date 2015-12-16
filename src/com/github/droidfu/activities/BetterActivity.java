package com.github.droidfu.activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.github.droidfu.dialogs.DialogClickListener;
import java.util.List;

public abstract interface BetterActivity
{
  public abstract Intent getCurrentIntent();
  
  public abstract int getWindowFeatures();
  
  public abstract boolean isApplicationBroughtToBackground();
  
  public abstract boolean isLandscapeMode();
  
  public abstract boolean isLaunching();
  
  public abstract boolean isPortraitMode();
  
  public abstract boolean isRestoring();
  
  public abstract boolean isResuming();
  
  public abstract AlertDialog newAlertDialog(int paramInt1, int paramInt2);
  
  public abstract AlertDialog newErrorHandlerDialog(int paramInt, Exception paramException);
  
  public abstract AlertDialog newErrorHandlerDialog(Exception paramException);
  
  public abstract AlertDialog newInfoDialog(int paramInt1, int paramInt2);
  
  public abstract <T> Dialog newListDialog(List<T> paramList, DialogClickListener<T> paramDialogClickListener, boolean paramBoolean);
  
  public abstract AlertDialog newYesNoDialog(int paramInt1, int paramInt2, DialogInterface.OnClickListener paramOnClickListener);
  
  public abstract void setProgressDialogMsgId(int paramInt);
  
  public abstract void setProgressDialogTitleId(int paramInt);
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.activities.BetterActivity
 * JD-Core Version:    0.7.0.1
 */