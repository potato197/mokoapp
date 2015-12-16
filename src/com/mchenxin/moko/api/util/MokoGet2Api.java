package com.mchenxin.moko.api.util;

import com.mchenxin.moko.MokoApplication;
import com.mchenxin.moko.api.Album;
import com.mchenxin.moko.api.Artist;
import com.mchenxin.moko.api.WSError;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MokoGet2Api
{
  public ArrayList<Album> getAritstAlbums(String paramString)
    throws WSError
  {
    ArrayList localArrayList = new ArrayList();
    Matcher localMatcher1 = Pattern.compile("<div class=\"coverBox bd\">.*?</div>", 32).matcher(paramString);
    for (;;)
    {
      if (!localMatcher1.find()) {
        return localArrayList;
      }
      String str = localMatcher1.group();
      Album localAlbum = new Album();
      Matcher localMatcher2 = Pattern.compile("/post/.*?.html", 32).matcher(str);
      if (localMatcher2.find()) {
        localAlbum.setUrl("http://www.moko.cc" + localMatcher2.group());
      }
      Matcher localMatcher3 = Pattern.compile("http://img.*?.jpg", 32).matcher(str);
      if (localMatcher3.find()) {
        localAlbum.setCover(localMatcher3.group());
      }
      localArrayList.add(localAlbum);
    }
  }
  
  public Artist getArtist(String paramString)
    throws WSError
  {
    Artist localArtist = new Artist();
    String str1 = Caller.doGet(paramString);
    Matcher localMatcher1 = Pattern.compile("http://img.*?.jpg", 32).matcher(str1);
    label34:
    Matcher localMatcher2;
    label47:
    Matcher localMatcher3;
    if (!localMatcher1.find())
    {
      localMatcher2 = Pattern.compile("<h1 class=\"name\">.*?</h1>", 32).matcher(str1);
      if (localMatcher2.find()) {
        break label171;
      }
      localMatcher3 = Pattern.compile("<h2 class=\"duty\">.*?</h2>", 32).matcher(str1);
    }
    for (;;)
    {
      if (!localMatcher3.find())
      {
        Matcher localMatcher4 = Pattern.compile("<a id=\"a_post\".*?</a>", 32).matcher(str1);
        if (localMatcher4.find()) {
          localArtist.setAblumsSum(Integer.parseInt(localMatcher4.group().substring(1 + localMatcher4.group().indexOf("("), localMatcher4.group().indexOf(")"))));
        }
        localArtist.setAblums(getAritstAlbums(str1));
        return localArtist;
        String str2 = localMatcher1.group();
        if (!str2.contains("des")) {
          break;
        }
        localArtist.setLogo(str2);
        break label34;
        label171:
        String[] arrayOfString = localMatcher2.group().replaceAll("\\n|\\t", "").replaceAll("<.*?>", " ").trim().split("  ");
        localArtist.setName(arrayOfString[0]);
        localArtist.setRank(arrayOfString[1]);
        break label47;
      }
      localArtist.setDuty(localMatcher3.group().replaceAll("\\n|\\t", "").replaceAll("<div.*?div>", "").replaceAll("<.*?>", " ").trim().split(" "));
    }
  }
  
  public ArrayList<Album> getClassAblums(String paramString1, int paramInt, String paramString2)
    throws WSError
  {
    if (paramInt != 1) {
      paramString1 = paramString1.replaceAll("1.html", paramInt + ".html");
    }
    String str1 = Caller.doGet(paramString1);
    ArrayList localArrayList = new ArrayList();
    String str2 = null;
    if (paramString2 == "big") {
      str2 = "<ul class=\"post big-post\">.*?</ul>";
    }
    if (paramString2 == "small") {
      str2 = "<ul class=\"post small-post\">.*?</ul>";
    }
    Matcher localMatcher1 = Pattern.compile(str2, 32).matcher(str1);
    for (;;)
    {
      if (!localMatcher1.find()) {
        return localArrayList;
      }
      String str3 = localMatcher1.group();
      Album localAlbum = new Album();
      Matcher localMatcher2 = Pattern.compile("/post/.*?.html", 32).matcher(str3);
      if (localMatcher2.find()) {
        localAlbum.setUrl("http://www.moko.cc" + localMatcher2.group());
      }
      Matcher localMatcher3 = Pattern.compile("http://img.*?.jpg", 32).matcher(str3);
      if (localMatcher3.find()) {
        localAlbum.setCover(localMatcher3.group());
      }
      Matcher localMatcher4 = Pattern.compile("</label><a href=\"/.*?/\"", 32).matcher(str3);
      if (localMatcher4.find()) {
        localAlbum.setAuthor(localMatcher4.group().split("/")[2]);
      }
      localArrayList.add(localAlbum);
    }
  }
  
  public ArrayList<String> getPhotos(String paramString)
    throws WSError
  {
    String str1 = Caller.doGet(MokoApplication.login + paramString);
    ArrayList localArrayList = new ArrayList();
    Matcher localMatcher = Pattern.compile("http://img.*?.jpg", 32).matcher(str1);
    for (;;)
    {
      if (!localMatcher.find()) {
        return localArrayList;
      }
      String str2 = localMatcher.group();
      if ((str2.contains("src")) && (str2.contains("post"))) {
        localArrayList.add(str2);
      }
    }
  }
  
  public void updateAritstAlbums(String paramString, int paramInt, ArrayList<Album> paramArrayList)
    throws WSError
  {
    if (paramInt != 1) {
      paramString = paramString.replace("1/postsortid.html", paramInt + "/postsortid.html");
    }
    paramArrayList.addAll(getAritstAlbums(Caller.doGet(paramString)));
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mchenxin.moko.api.util.MokoGet2Api
 * JD-Core Version:    0.7.0.1
 */