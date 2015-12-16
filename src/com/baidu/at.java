package com.baidu;

import android.content.pm.PackageManager;
import android.os.Environment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;

class at
  extends TimerTask
{
  at(as paramas) {}
  
  public void run()
  {
    for (;;)
    {
      bl localbl2;
      try
      {
        String str1 = Environment.getExternalStorageState();
        Object[] arrayOfObject1 = new Object[4];
        arrayOfObject1[0] = Integer.valueOf(as.a(this.a).size());
        arrayOfObject1[1] = Integer.valueOf(as.b(this.a).size());
        arrayOfObject1[2] = str1;
        arrayOfObject1[3] = as.c(this.a).get();
        bk.b(String.format("AppMonitor(%s, %s) SDCARD: %s, context: %s", arrayOfObject1));
        if ((!"mounted".equals(str1)) || (as.c(this.a).get() == null)) {
          return;
        }
        if ((as.a(this.a).size() == 0) && (as.b(this.a).size() == 0)) {
          return;
        }
        Iterator localIterator1 = as.a(this.a).iterator();
        if (!localIterator1.hasNext()) {
          break;
        }
        localbl2 = (bl)localIterator1.next();
        if (this.a.c(localbl2))
        {
          Object[] arrayOfObject5 = new Object[1];
          arrayOfObject5[0] = localbl2.f();
          bk.b(String.format("[%s] downloaded\n", arrayOfObject5));
          String str2 = this.a.f(localbl2);
          if (str2 == null) {
            continue;
          }
          as.a(this.a).remove(localbl2);
          localbl2.a(str2);
          new au(this, localbl2).start();
          this.a.e(localbl2);
          continue;
        }
        arrayOfObject4 = new Object[1];
      }
      catch (Exception localException)
      {
        bk.a(localException);
        return;
      }
      Object[] arrayOfObject4;
      arrayOfObject4[0] = localbl2.f();
      bk.b(String.format("[%s] downloading\n", arrayOfObject4));
    }
    List localList = as.d(this.a).getInstalledPackages(0);
    Iterator localIterator2 = as.b(this.a).iterator();
    while (localIterator2.hasNext())
    {
      bl localbl1 = (bl)localIterator2.next();
      if (as.a(this.a, localList, localbl1))
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = localbl1.f();
        arrayOfObject3[1] = localbl1.n();
        bk.b(String.format("[%s %s] installed\n", arrayOfObject3));
        as.b(this.a).remove(localbl1);
        new av(this, localbl1).start();
      }
      else
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = localbl1.f();
        arrayOfObject2[1] = localbl1.n();
        bk.b(String.format("[%s %s] installing\n", arrayOfObject2));
      }
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.at
 * JD-Core Version:    0.7.0.1
 */