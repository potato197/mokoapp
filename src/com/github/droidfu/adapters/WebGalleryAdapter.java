package com.github.droidfu.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Gallery.LayoutParams;
import com.github.droidfu.widgets.WebImageView;
import java.util.List;

public class WebGalleryAdapter
  extends BaseAdapter
{
  private Context context;
  private List<String> imageUrls;
  private Drawable progressDrawable;
  
  public WebGalleryAdapter(Context paramContext)
  {
    initialize(paramContext, null, null);
  }
  
  public WebGalleryAdapter(Context paramContext, List<String> paramList)
  {
    initialize(paramContext, paramList, null);
  }
  
  public WebGalleryAdapter(Context paramContext, List<String> paramList, int paramInt)
  {
    initialize(paramContext, paramList, paramContext.getResources().getDrawable(paramInt));
  }
  
  private void initialize(Context paramContext, List<String> paramList, Drawable paramDrawable)
  {
    this.imageUrls = paramList;
    this.context = paramContext;
    this.progressDrawable = paramDrawable;
  }
  
  public int getCount()
  {
    return this.imageUrls.size();
  }
  
  public List<String> getImageUrls()
  {
    return this.imageUrls;
  }
  
  public Object getItem(int paramInt)
  {
    return this.imageUrls.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public Drawable getProgressDrawable()
  {
    return this.progressDrawable;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    String str = (String)getItem(paramInt);
    FrameLayout localFrameLayout = new FrameLayout(this.context);
    localFrameLayout.setLayoutParams(new Gallery.LayoutParams(-1, -1));
    WebImageView localWebImageView = new WebImageView(this.context, str, this.progressDrawable, false);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 17;
    localWebImageView.setLayoutParams(localLayoutParams);
    localFrameLayout.addView(localWebImageView);
    localWebImageView.loadImage();
    onGetView(paramInt, paramView, paramViewGroup);
    return localFrameLayout;
  }
  
  protected void onGetView(int paramInt, View paramView, ViewGroup paramViewGroup) {}
  
  public void setImageUrls(List<String> paramList)
  {
    this.imageUrls = paramList;
  }
  
  public void setProgressDrawable(Drawable paramDrawable)
  {
    this.progressDrawable = paramDrawable;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.adapters.WebGalleryAdapter
 * JD-Core Version:    0.7.0.1
 */