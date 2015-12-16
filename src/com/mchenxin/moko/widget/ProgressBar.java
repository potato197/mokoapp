package com.mchenxin.moko.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProgressBar
  extends LinearLayout
{
  protected TextView mTextView;
  
  public ProgressBar(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public ProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    LayoutInflater.from(getContext()).inflate(2130903046, this);
    this.mTextView = ((TextView)findViewById(2131099679));
  }
  
  public void setText(int paramInt)
  {
    this.mTextView.setText(paramInt);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mchenxin.moko.widget.ProgressBar
 * JD-Core Version:    0.7.0.1
 */