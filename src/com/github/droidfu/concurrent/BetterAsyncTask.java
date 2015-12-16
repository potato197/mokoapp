package com.github.droidfu.concurrent;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.github.droidfu.DroidFuApplication;
import com.github.droidfu.activities.BetterActivity;

public abstract class BetterAsyncTask<ParameterT, ProgressT, ReturnT>
  extends AsyncTask<ParameterT, ProgressT, ReturnT>
{
  private DroidFuApplication appContext;
  private BetterAsyncTaskCallable<ParameterT, ProgressT, ReturnT> callable;
  private String callerId;
  private boolean contextIsDroidFuActivity;
  private int dialogId = 0;
  private Exception error;
  private boolean isTitleProgressEnabled;
  private boolean isTitleProgressIndeterminateEnabled = true;
  
  public BetterAsyncTask(Context paramContext)
  {
    if (!(paramContext.getApplicationContext() instanceof DroidFuApplication)) {
      throw new IllegalArgumentException("context bound to this task must be a DroidFu context (DroidFuApplication)");
    }
    this.appContext = ((DroidFuApplication)paramContext.getApplicationContext());
    this.callerId = paramContext.getClass().getCanonicalName();
    this.contextIsDroidFuActivity = (paramContext instanceof BetterActivity);
    this.appContext.setActiveContext(this.callerId, paramContext);
    int i;
    if (this.contextIsDroidFuActivity)
    {
      i = ((BetterActivity)paramContext).getWindowFeatures();
      if (2 != (i & 0x2)) {
        break label106;
      }
      this.isTitleProgressEnabled = true;
    }
    label106:
    while (5 != (i & 0x5)) {
      return;
    }
    this.isTitleProgressIndeterminateEnabled = true;
  }
  
  protected abstract void after(Context paramContext, ReturnT paramReturnT);
  
  protected void before(Context paramContext) {}
  
  public void disableDialog()
  {
    this.dialogId = -1;
  }
  
  protected ReturnT doCheckedInBackground(Context paramContext, ParameterT... paramVarArgs)
    throws Exception
  {
    if (this.callable != null) {
      return this.callable.call(this);
    }
    return null;
  }
  
  protected final ReturnT doInBackground(ParameterT... paramVarArgs)
  {
    Context localContext = getCallingContext();
    try
    {
      Object localObject = doCheckedInBackground(localContext, paramVarArgs);
      return localObject;
    }
    catch (Exception localException)
    {
      this.error = localException;
    }
    return null;
  }
  
  public boolean failed()
  {
    return this.error != null;
  }
  
  protected Context getCallingContext()
  {
    try
    {
      Context localContext = this.appContext.getActiveContext(this.callerId);
      if ((localContext != null) && (this.callerId.equals(localContext.getClass().getCanonicalName())))
      {
        if ((localContext instanceof Activity))
        {
          boolean bool = ((Activity)localContext).isFinishing();
          if (!bool) {}
        }
      }
      else {
        localContext = null;
      }
      return localContext;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  protected abstract void handleError(Context paramContext, Exception paramException);
  
  protected final void onPostExecute(ReturnT paramReturnT)
  {
    Context localContext = getCallingContext();
    if (localContext == null)
    {
      Log.d(BetterAsyncTask.class.getSimpleName(), "skipping post-exec handler for task " + hashCode() + " (context is null)");
      return;
    }
    Activity localActivity;
    if (this.contextIsDroidFuActivity)
    {
      localActivity = (Activity)localContext;
      if (this.dialogId > -1) {
        localActivity.removeDialog(this.dialogId);
      }
      if (!this.isTitleProgressEnabled) {
        break label103;
      }
      localActivity.setProgressBarVisibility(false);
    }
    while (failed())
    {
      handleError(localContext, this.error);
      return;
      label103:
      if (this.isTitleProgressIndeterminateEnabled) {
        localActivity.setProgressBarIndeterminateVisibility(false);
      }
    }
    after(localContext, paramReturnT);
  }
  
  protected final void onPreExecute()
  {
    Context localContext = getCallingContext();
    if (localContext == null)
    {
      Log.d(BetterAsyncTask.class.getSimpleName(), "skipping pre-exec handler for task " + hashCode() + " (context is null)");
      cancel(true);
      return;
    }
    Activity localActivity;
    if (this.contextIsDroidFuActivity)
    {
      localActivity = (Activity)localContext;
      if (this.dialogId > -1) {
        localActivity.showDialog(this.dialogId);
      }
      if (!this.isTitleProgressEnabled) {
        break label98;
      }
      localActivity.setProgressBarVisibility(true);
    }
    for (;;)
    {
      before(localContext);
      return;
      label98:
      if (this.isTitleProgressIndeterminateEnabled) {
        localActivity.setProgressBarIndeterminateVisibility(true);
      }
    }
  }
  
  public void setCallable(BetterAsyncTaskCallable<ParameterT, ProgressT, ReturnT> paramBetterAsyncTaskCallable)
  {
    this.callable = paramBetterAsyncTaskCallable;
  }
  
  public void useCustomDialog(int paramInt)
  {
    this.dialogId = paramInt;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.concurrent.BetterAsyncTask
 * JD-Core Version:    0.7.0.1
 */