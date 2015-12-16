package com.github.droidfu.concurrent;

public abstract interface BetterAsyncTaskCallable<ParameterT, ProgressT, ReturnT>
{
  public abstract ReturnT call(BetterAsyncTask<ParameterT, ProgressT, ReturnT> paramBetterAsyncTask)
    throws Exception;
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.concurrent.BetterAsyncTaskCallable
 * JD-Core Version:    0.7.0.1
 */