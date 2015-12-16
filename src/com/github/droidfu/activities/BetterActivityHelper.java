package com.github.droidfu.activities;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.content.res.Resources;
import android.view.KeyEvent;
import com.github.droidfu.dialogs.DialogClickListener;
import com.github.droidfu.exception.ResourceMessageException;
import com.github.droidfu.support.DiagnosticSupport;
import com.github.droidfu.support.IntentSupport;
import java.util.List;

public class BetterActivityHelper
{
  public static final String ERROR_DIALOG_TITLE_RESOURCE = "droidfu_error_dialog_title";
  private static final String PROGRESS_DIALOG_MESSAGE_RESOURCE = "droidfu_progress_dialog_message";
  private static final String PROGRESS_DIALOG_TITLE_RESOURCE = "droidfu_progress_dialog_title";
  
  public static ProgressDialog createProgressDialog(Activity paramActivity, int paramInt1, int paramInt2)
  {
    ProgressDialog localProgressDialog = new ProgressDialog(paramActivity);
    if (paramInt1 > 0)
    {
      localProgressDialog.setTitle(paramInt1);
      if (paramInt2 <= 0) {
        break label72;
      }
      localProgressDialog.setMessage(paramActivity.getString(paramInt2));
    }
    for (;;)
    {
      localProgressDialog.setIndeterminate(true);
      localProgressDialog.setOnKeyListener(new DialogInterface.OnKeyListener()
      {
        public boolean onKey(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          this.val$activity.onKeyDown(paramAnonymousInt, paramAnonymousKeyEvent);
          return false;
        }
      });
      return localProgressDialog;
      localProgressDialog.setTitle(paramActivity.getResources().getIdentifier("droidfu_progress_dialog_title", "string", paramActivity.getPackageName()));
      break;
      label72:
      localProgressDialog.setMessage(paramActivity.getString(paramActivity.getResources().getIdentifier("droidfu_progress_dialog_message", "string", paramActivity.getPackageName())));
    }
  }
  
  public static int getWindowFeatures(Activity paramActivity)
  {
    if (paramActivity.getWindow() == null) {}
    return 0;
  }
  
  public static boolean isApplicationBroughtToBackground(Context paramContext)
  {
    List localList = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    return (!localList.isEmpty()) && (!((ActivityManager.RunningTaskInfo)localList.get(0)).topActivity.getPackageName().equals(paramContext.getPackageName()));
  }
  
  public static AlertDialog newErrorHandlerDialog(Activity paramActivity, String paramString, Exception paramException)
  {
    if ((paramException instanceof ResourceMessageException)) {}
    for (String str = paramActivity.getString(((ResourceMessageException)paramException).getClientMessageResourceId());; str = paramException.getLocalizedMessage())
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
      localBuilder.setTitle(paramString);
      localBuilder.setMessage(str);
      localBuilder.setIcon(17301543);
      localBuilder.setCancelable(false);
      localBuilder.setPositiveButton(paramActivity.getString(17039370), new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface.dismiss();
        }
      });
      if (IntentSupport.isIntentAvailable(paramActivity, "android.intent.action.SEND", "message/rfc822")) {
        localBuilder.setNegativeButton(paramActivity.getString(paramActivity.getResources().getIdentifier("droidfu_dialog_button_send_error_report", "string", paramActivity.getPackageName())), new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            paramAnonymousDialogInterface.dismiss();
            this.val$a.startActivity(this.val$intent);
          }
        });
      }
      return localBuilder.create();
    }
  }
  
  public static <T> Dialog newListDialog(Context paramContext, final List<T> paramList, final DialogClickListener<T> paramDialogClickListener, boolean paramBoolean)
  {
    String[] arrayOfString = new String[paramList.size()];
    for (int i = 0; i < paramList.size(); i++) {
      arrayOfString[i] = paramList.get(i).toString();
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramContext);
    localBuilder.setSingleChoiceItems(arrayOfString, 0, new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (this.val$closeOnSelect) {
          paramAnonymousDialogInterface.dismiss();
        }
        paramDialogClickListener.onClick(paramAnonymousInt, paramList.get(paramAnonymousInt));
      }
    });
    return localBuilder.create();
  }
  
  public static AlertDialog newMessageDialog(Activity paramActivity, String paramString1, String paramString2, int paramInt)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setCancelable(false);
    localBuilder.setPositiveButton("Okay", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.dismiss();
      }
    });
    localBuilder.setTitle(paramString1);
    localBuilder.setMessage(paramString2);
    localBuilder.setIcon(paramInt);
    return localBuilder.create();
  }
  
  public static AlertDialog newYesNoDialog(Activity paramActivity, String paramString1, String paramString2, int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(paramActivity);
    localBuilder.setCancelable(false);
    localBuilder.setPositiveButton(17039379, paramOnClickListener);
    localBuilder.setNegativeButton(17039369, paramOnClickListener);
    localBuilder.setTitle(paramString1);
    localBuilder.setMessage(paramString2);
    localBuilder.setIcon(paramInt);
    return localBuilder.create();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.activities.BetterActivityHelper
 * JD-Core Version:    0.7.0.1
 */