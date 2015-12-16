import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View.MeasureSpec;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.ads.AdActivity;
import com.google.ads.AdSize;
import com.google.ads.util.AdUtil;
import com.google.ads.util.a;

public final class g
  extends WebView
{
  private AdActivity a;
  private AdSize b;
  
  public g(Context paramContext, AdSize paramAdSize)
  {
    super(paramContext);
    this.b = paramAdSize;
    setBackgroundColor(0);
    AdUtil.a(this);
    getSettings().setJavaScriptEnabled(true);
    setScrollBarStyle(0);
  }
  
  public final void a()
  {
    if (this.a != null) {
      this.a.finish();
    }
  }
  
  public final void a(AdActivity paramAdActivity)
  {
    this.a = paramAdActivity;
  }
  
  public final AdActivity b()
  {
    return this.a;
  }
  
  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    if (isInEditMode())
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    if (this.b == null)
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt2);
    float f = getContext().getResources().getDisplayMetrics().density;
    int n = (int)(f * this.b.getWidth());
    int i1 = (int)(f * this.b.getHeight());
    if ((i == 0) || (k == 0))
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    if ((n - 6.0F * f > j) || (i1 > m))
    {
      a.e("Not enough space to show ad! Wants: <" + n + ", " + i1 + ">, Has: <" + j + ", " + m + ">");
      setVisibility(8);
      setMeasuredDimension(0, 0);
      return;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     g
 * JD-Core Version:    0.7.0.1
 */