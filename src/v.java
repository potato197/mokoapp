import android.app.Activity;
import android.webkit.WebView;
import android.widget.VideoView;
import com.google.ads.AdActivity;
import com.google.ads.util.a;
import java.util.HashMap;

public final class v
  implements i
{
  public final void a(d paramd, HashMap<String, String> paramHashMap, WebView paramWebView)
  {
    String str1 = (String)paramHashMap.get("action");
    AdActivity localAdActivity;
    if ((paramWebView instanceof g))
    {
      localAdActivity = ((g)paramWebView).b();
      if (localAdActivity != null) {
        break label44;
      }
      a.a("Could not get adActivity to create the video.");
    }
    label44:
    do
    {
      return;
      a.a("Could not get adWebView to create the video.");
      return;
      if (str1.equals("load"))
      {
        String str3 = (String)paramHashMap.get("url");
        Activity localActivity = paramd.e();
        if (localActivity == null)
        {
          a.e("activity was null while loading a video.");
          return;
        }
        VideoView localVideoView2 = new VideoView(localActivity);
        localVideoView2.setVideoPath(str3);
        localAdActivity.showVideo(localVideoView2);
        return;
      }
      VideoView localVideoView1 = localAdActivity.getVideoView();
      if (localVideoView1 == null)
      {
        a.e("Could not get the VideoView for a video GMSG.");
        return;
      }
      if (str1.equals("play"))
      {
        localVideoView1.setVisibility(0);
        localVideoView1.start();
        a.d("Video is now playing.");
        paramWebView.loadUrl("javascript:AFMA_ReceiveMessage('onVideoEvent', {'event': 'playing'});");
        return;
      }
      if (str1.equals("pause"))
      {
        localVideoView1.pause();
        return;
      }
      if (str1.equals("stop"))
      {
        localVideoView1.stopPlayback();
        return;
      }
      if (str1.equals("remove"))
      {
        localVideoView1.setVisibility(8);
        return;
      }
      if (str1.equals("replay"))
      {
        localVideoView1.setVisibility(0);
        localVideoView1.seekTo(0);
        localVideoView1.start();
        return;
      }
      if (str1.equals("currentTime"))
      {
        String str2 = (String)paramHashMap.get("time");
        if (str2 == null)
        {
          a.e("No \"time\" parameter!");
          return;
        }
        localVideoView1.seekTo((int)(1000.0F * Float.valueOf(str2).floatValue()));
        return;
      }
    } while (str1.equals("position"));
    a.e("Unknown movie action: " + str1);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     v
 * JD-Core Version:    0.7.0.1
 */