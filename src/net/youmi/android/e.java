package net.youmi.android;

import android.view.animation.Animation;

class e
  implements Runnable
{
  e(cx paramcx) {}
  
  public void run()
  {
    for (;;)
    {
      try
      {
        this.a.setVisibility(0);
        switch (cx.c(this.a).b())
        {
        case 0: 
          if (localObject == null) {
            return;
          }
          if (cx.d(this.a).getVisibility() != 0) {
            cx.d(this.a).setVisibility(0);
          }
          if (localObject != cx.e(this.a))
          {
            ((bb)localObject).b();
            if (cx.e(this.a) != null)
            {
              if (cx.c(this.a).b() == 3) {
                cx.e(this.a).a();
              }
            }
            else
            {
              Animation localAnimation1 = aj.a(cx.f(this.a));
              ((bb)localObject).c();
              ((bb)localObject).a(localAnimation1);
              cx.a(this.a, (bb)localObject);
              return;
              localObject = this.a.c();
              if (!((at)localObject).a(cx.c(this.a))) {
                break label351;
              }
            }
          }
          break;
        case 2: 
          localObject = this.a.b();
          if (!((ea)localObject).a(cx.c(this.a))) {
            break label351;
          }
          break;
        case 1: 
          localObject = this.a.a();
          if (!((ag)localObject).a(cx.c(this.a))) {
            break label351;
          }
          break;
        case 3: 
          localObject = this.a.d();
          if (!((l)localObject).a(cx.c(this.a))) {
            break label351;
          }
          break;
        case 4: 
          localObject = this.a.e();
          if (!((bm)localObject).a(cx.c(this.a))) {
            break label351;
          }
          continue;
          Animation localAnimation2 = aj.b(cx.f(this.a));
          cx.e(this.a).a(localAnimation2);
          cx.e(this.a).a();
          continue;
          cx.e(this.a).d();
        }
      }
      catch (Exception localException)
      {
        f.a(localException);
        return;
      }
      return;
      label351:
      Object localObject = null;
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.e
 * JD-Core Version:    0.7.0.1
 */