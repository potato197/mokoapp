package net.youmi.android;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

class an
  implements Runnable
{
  an(ed paramed) {}
  
  public void run()
  {
    try
    {
      File localFile1 = new File(ed.a(this.a));
      if ((!localFile1.exists()) && (!localFile1.mkdirs())) {
        return;
      }
      File[] arrayOfFile = localFile1.listFiles();
      if (arrayOfFile != null)
      {
        LinkedList localLinkedList = new LinkedList();
        int i = 0;
        long l1 = 0L;
        if (i >= arrayOfFile.length)
        {
          long l2 = l1;
          while (l2 > ed.b(this.a)) {
            if (localLinkedList.size() > 0)
            {
              File localFile2 = (File)localLinkedList.get(0);
              l2 -= localFile2.length();
              localLinkedList.remove(0);
              try
              {
                localFile2.delete();
              }
              catch (Exception localException2) {}
            }
          }
        }
        File localFile3 = arrayOfFile[i];
        boolean bool1 = ed.a(this.a, localFile3);
        if (bool1) {}
        while ((ed.b(this.a) == -1L) || (ed.b(this.a) <= 0L)) {
          try
          {
            boolean bool2 = localFile3.delete();
            if (bool2) {
              i++;
            }
          }
          catch (Exception localException3) {}
        }
        long l3 = l1 + localFile3.length();
        for (int j = 0;; j++)
        {
          if (j >= localLinkedList.size())
          {
            l1 = l3;
            break;
          }
          File localFile4 = (File)localLinkedList.get(j);
          if (localFile3.lastModified() <= localFile4.lastModified())
          {
            localLinkedList.add(j, localFile3);
            l1 = l3;
            break;
          }
        }
      }
      return;
    }
    catch (Exception localException1) {}
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.an
 * JD-Core Version:    0.7.0.1
 */