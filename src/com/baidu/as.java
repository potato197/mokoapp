package com.baidu;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;

class as
{
  private static as b = new as();
  private static boolean c;
  ActivityManager a;
  private Timer d;
  private List<bl> e = new ArrayList();
  private List<bl> f = new ArrayList();
  private WeakReference<Context> g;
  private PackageManager h;
  
  public static as a()
  {
    return b;
  }
  
  private boolean a(List<PackageInfo> paramList, bl parambl)
  {
    if (parambl.n() == null) {
      return false;
    }
    Iterator localIterator = paramList.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (!((PackageInfo)localIterator.next()).packageName.equals(parambl.n()));
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void b()
  {
    this.d = new Timer();
    this.d.schedule(new at(this), 5000L, 5000L);
  }
  
  private String g(bl parambl)
  {
    File localFile = Environment.getExternalStorageDirectory();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = localFile;
    arrayOfObject[1] = parambl.f();
    return String.format("%s/download/%s", arrayOfObject);
  }
  
  public void a(Context paramContext)
  {
    this.g = new WeakReference(paramContext);
    this.h = paramContext.getPackageManager();
    this.a = ((ActivityManager)paramContext.getSystemService("activity"));
    if (!c)
    {
      c = true;
      b.b();
    }
  }
  
  public void a(bl parambl)
  {
    if (!this.e.contains(parambl))
    {
      bk.b("append to downloadings" + parambl);
      this.e.add(parambl);
    }
  }
  
  public boolean b(bl parambl)
  {
    return this.e.contains(parambl);
  }
  
  public boolean c(bl parambl)
  {
    return (!"".equals(parambl.f())) && (w.a(g(parambl), true));
  }
  
  public boolean d(bl parambl)
  {
    return a(this.h.getInstalledPackages(0), parambl);
  }
  
  public void e(bl parambl)
  {
    if (d(parambl))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = parambl.n();
      bk.b(String.format("[%s] previously installed", arrayOfObject2));
    }
    do
    {
      return;
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setDataAndType(Uri.parse("file://" + g(parambl)), "application/vnd.android.package-archive");
      ((Context)this.g.get()).startActivity(localIntent);
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = parambl.n();
      bk.b(String.format("[%s] to install", arrayOfObject1));
    } while (this.f.contains(parambl));
    this.f.add(parambl);
  }
  
  public String f(bl parambl)
  {
    try
    {
      String str = this.h.getPackageArchiveInfo(g(parambl), 0).packageName;
      return str;
    }
    catch (Exception localException)
    {
      bk.a(localException);
    }
    return null;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.as
 * JD-Core Version:    0.7.0.1
 */