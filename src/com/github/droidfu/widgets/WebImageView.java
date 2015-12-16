package com.github.droidfu.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import android.widget.ViewSwitcher;
import com.github.droidfu.imageloader.ImageLoader;
import com.github.droidfu.imageloader.ImageLoaderHandler;

public class WebImageView
  extends ViewSwitcher
{
  private String imageUrl;
  private ImageView imageView;
  private boolean isLoaded;
  private ProgressBar loadingSpinner;
  private Drawable progressDrawable;
  private ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
  
  public WebImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = paramAttributeSet.getAttributeResourceValue("http://github.com/droidfu/schema", "progressDrawable", 0);
    Drawable localDrawable = null;
    if (i > 0) {
      localDrawable = paramContext.getResources().getDrawable(i);
    }
    initialize(paramContext, paramAttributeSet.getAttributeValue("http://github.com/droidfu/schema", "imageUrl"), localDrawable, paramAttributeSet.getAttributeBooleanValue("http://github.com/droidfu/schema", "autoLoad", true));
  }
  
  public WebImageView(Context paramContext, String paramString, Drawable paramDrawable, boolean paramBoolean)
  {
    super(paramContext);
    initialize(paramContext, paramString, paramDrawable, paramBoolean);
  }
  
  public WebImageView(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext);
    initialize(paramContext, paramString, null, paramBoolean);
  }
  
  private void addImageView(Context paramContext)
  {
    this.imageView = new ImageView(paramContext);
    this.imageView.setScaleType(this.scaleType);
    FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
    localLayoutParams.gravity = 17;
    addView(this.imageView, 1, localLayoutParams);
  }
  
  private void addLoadingSpinnerView(Context paramContext)
  {
    this.loadingSpinner = new ProgressBar(paramContext);
    this.loadingSpinner.setIndeterminate(true);
    if (this.progressDrawable == null) {
      this.progressDrawable = this.loadingSpinner.getIndeterminateDrawable();
    }
    for (;;)
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(this.progressDrawable.getIntrinsicWidth(), this.progressDrawable.getIntrinsicHeight());
      localLayoutParams.gravity = 17;
      addView(this.loadingSpinner, 0, localLayoutParams);
      return;
      this.loadingSpinner.setIndeterminateDrawable(this.progressDrawable);
      if ((this.progressDrawable instanceof AnimationDrawable)) {
        ((AnimationDrawable)this.progressDrawable).start();
      }
    }
  }
  
  private void initialize(Context paramContext, String paramString, Drawable paramDrawable, boolean paramBoolean)
  {
    this.imageUrl = paramString;
    this.progressDrawable = paramDrawable;
    ImageLoader.initialize(paramContext);
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(500L);
    setInAnimation(localAlphaAnimation);
    addLoadingSpinnerView(paramContext);
    addImageView(paramContext);
    if ((paramBoolean) && (paramString != null)) {
      loadImage();
    }
  }
  
  public boolean isLoaded()
  {
    return this.isLoaded;
  }
  
  public void loadImage()
  {
    if (this.imageUrl == null) {
      throw new IllegalStateException("image URL is null; did you forget to set it for this view?");
    }
    ImageLoader.start(this.imageUrl, new DefaultImageLoaderHandler());
  }
  
  public void reset()
  {
    super.reset();
    setDisplayedChild(0);
  }
  
  public void setImageUrl(String paramString)
  {
    this.imageUrl = paramString;
  }
  
  public void setNoImageDrawable(int paramInt)
  {
    this.imageView.setImageDrawable(getContext().getResources().getDrawable(paramInt));
    setDisplayedChild(1);
  }
  
  public void setProgressDrawable(Drawable paramDrawable)
  {
    this.progressDrawable = paramDrawable;
  }
  
  private class DefaultImageLoaderHandler
    extends ImageLoaderHandler
  {
    public DefaultImageLoaderHandler()
    {
      super();
    }
    
    public void handleMessage(Message paramMessage)
    {
      super.handleMessage(paramMessage);
      WebImageView.access$102(WebImageView.this, true);
      WebImageView.this.setDisplayedChild(1);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.widgets.WebImageView
 * JD-Core Version:    0.7.0.1
 */