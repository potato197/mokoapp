package com.baidu;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Collection;

class d
  implements FilenameFilter
{
  d(c paramc, Collection paramCollection) {}
  
  public boolean accept(File paramFile, String paramString)
  {
    return (paramString.startsWith("__sdk_")) && (!this.a.contains(paramString));
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.d
 * JD-Core Version:    0.7.0.1
 */