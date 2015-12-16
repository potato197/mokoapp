package com.baidu;

import java.io.File;
import java.util.Comparator;

class f
  implements Comparator<File>
{
  f(c paramc) {}
  
  public int a(File paramFile1, File paramFile2)
  {
    return (int)(paramFile1.lastModified() - paramFile2.lastModified());
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.f
 * JD-Core Version:    0.7.0.1
 */