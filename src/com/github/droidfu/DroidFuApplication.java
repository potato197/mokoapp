package com.github.droidfu;

import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public class DroidFuApplication
  extends Application
{
  private HashMap<String, WeakReference<Context>> contextObjects = new HashMap();
  
  /* Error */
  public Context getActiveContext(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 16	com/github/droidfu/DroidFuApplication:contextObjects	Ljava/util/HashMap;
    //   6: aload_1
    //   7: invokevirtual 22	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   10: checkcast 24	java/lang/ref/WeakReference
    //   13: astore_3
    //   14: aload_3
    //   15: ifnonnull +11 -> 26
    //   18: aconst_null
    //   19: astore 4
    //   21: aload_0
    //   22: monitorexit
    //   23: aload 4
    //   25: areturn
    //   26: aload_3
    //   27: invokevirtual 27	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   30: checkcast 29	android/content/Context
    //   33: astore 4
    //   35: goto -14 -> 21
    //   38: astore_2
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_2
    //   42: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	43	0	this	DroidFuApplication
    //   0	43	1	paramString	String
    //   38	4	2	localObject	Object
    //   13	14	3	localWeakReference	WeakReference
    //   19	15	4	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   2	14	38	finally
    //   26	35	38	finally
  }
  
  public void resetActiveContext(String paramString)
  {
    try
    {
      this.contextObjects.remove(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public void setActiveContext(String paramString, Context paramContext)
  {
    try
    {
      WeakReference localWeakReference = new WeakReference(paramContext);
      this.contextObjects.put(paramString, localWeakReference);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.DroidFuApplication
 * JD-Core Version:    0.7.0.1
 */