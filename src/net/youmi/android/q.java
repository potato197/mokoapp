package net.youmi.android;

import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import java.io.File;

class q
  implements View.OnClickListener
{
  q(cf paramcf) {}
  
  public void onClick(View paramView)
  {
    try
    {
      if (cf.b(this.a) == null) {
        return;
      }
      if (!az.a(this.a.a))
      {
        ay.a(this.a.a, "存储卡不可用,无法保存图片");
        return;
      }
      File localFile1 = new File(cf.b(this.a).a);
      if (localFile1.exists())
      {
        String str1 = localFile1.getName();
        Object localObject = str1;
        for (;;)
        {
          try
          {
            if (cf.b(this.a).d != null)
            {
              str4 = cf.b(this.a).d.toLowerCase();
              if (!str4.equals("image/jpeg")) {
                continue;
              }
              String str6 = localObject + ".jpg";
              localObject = str6;
            }
          }
          catch (Exception localException2)
          {
            String str4;
            String str2;
            File localFile2;
            String str3;
            String str5;
            continue;
          }
          str2 = Environment.getExternalStorageDirectory() + "/Pictures/";
          localFile2 = new File(str2);
          if (!localFile2.exists()) {
            localFile2.mkdirs();
          }
          str3 = str2 + (String)localObject;
          if (!ej.a(localFile1, new File(str3))) {
            break label354;
          }
          ay.b(this.a.a, "图片已经保存到" + str3);
          return;
          if (str4.equals("image/png"))
          {
            localObject = localObject + ".png";
          }
          else if (str4.equals("image/gif"))
          {
            localObject = localObject + ".gif";
          }
          else
          {
            str5 = localObject + ".jpg";
            localObject = str5;
          }
        }
      }
      label354:
      return;
    }
    catch (Exception localException1) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.q
 * JD-Core Version:    0.7.0.1
 */