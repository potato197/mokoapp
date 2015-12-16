package com.mchenxin.moko.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FailureBar
  extends LinearLayout
{
  protected Button mRetryButton;
  protected TextView mTextView;
  
  public FailureBar(Context paramContext)
  {
    super(paramContext);
    init();
  }
  
  public FailureBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    LayoutInflater.from(getContext()).inflate(2130903043, this);
    this.mTextView = ((TextView)findViewById(2131099665));
    this.mRetryButton = ((Button)findViewById(2131099664));
  }
  
  public void setOnRetryListener(View.OnClickListener paramOnClickListener)
  {
    this.mRetryButton.setOnClickListener(paramOnClickListener);
  }
  
  public void setText(int paramInt)
  {
    this.mTextView.setText(paramInt);
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mchenxin.moko.widget.FailureBar
 * JD-Core Version:    0.7.0.1
 */