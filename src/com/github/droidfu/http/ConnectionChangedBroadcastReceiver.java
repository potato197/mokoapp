package com.github.droidfu.http;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.io.PrintStream;

public class ConnectionChangedBroadcastReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    System.out.println("CONN CHANGE");
    BetterHttpRequest.updateProxySettings(paramContext);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.http.ConnectionChangedBroadcastReceiver
 * JD-Core Version:    0.7.0.1
 */