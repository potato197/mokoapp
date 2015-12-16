package com.guohead.sdk.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.guohead.sdk.GuoheAdActivity;
import com.guohead.sdk.GuoheAdHttpClient;
import com.guohead.sdk.GuoheAdLayout;
import com.guohead.sdk.GuoheAdManager;
import com.guohead.sdk.obj.Custom;
import com.guohead.sdk.obj.Extra;
import com.guohead.sdk.obj.Ration;
import com.guohead.sdk.util.Logger;
import java.io.InputStream;

public class CustomAdapter
  extends GuoheAdAdapter
{
  private Runnable displayCustomRunnable;
  public GuoheAdManager guoheAdManager;
  private GuoheAdHttpClient httpClient = new GuoheAdHttpClient();
  private boolean isClicked = false;
  
  public CustomAdapter(GuoheAdLayout paramGuoheAdLayout, Ration paramRation)
  {
    super(paramGuoheAdLayout, paramRation);
  }
  
  public void displayCustom()
  {
    switch (this.guoheAdLayout.custom.type)
    {
    default: 
      Logger.w("Unknown custom type!");
      this.guoheAdLayout.rotateThreadedNow();
      return;
    case 1: 
      Logger.d("Serving custom type: banner");
      RelativeLayout localRelativeLayout5 = new RelativeLayout(this.guoheAdLayout.activity);
      if (this.guoheAdLayout.custom.image == null)
      {
        this.guoheAdLayout.rotateThreadedNow();
        return;
      }
      ImageView localImageView9 = new ImageView(this.guoheAdLayout.activity);
      localImageView9.setImageDrawable(this.guoheAdLayout.custom.image);
      localImageView9.setScaleType(ImageView.ScaleType.FIT_CENTER);
      localRelativeLayout5.addView(localImageView9, new RelativeLayout.LayoutParams(320, 48));
      this.guoheAdLayout.pushSubView(localRelativeLayout5);
    }
    for (;;)
    {
      Logger.addStatus("custom receive ad suc++++(not sure,need test)");
      this.guoheAdLayout.rotateThreadedDelayed();
      return;
      Logger.d("Serving custom type: icon");
      RelativeLayout localRelativeLayout4 = new RelativeLayout(this.guoheAdLayout.activity);
      if (this.guoheAdLayout.custom.image == null)
      {
        this.guoheAdLayout.rotateThreadedNow();
        return;
      }
      localRelativeLayout4.setLayoutParams(new FrameLayout.LayoutParams(320, 48));
      ImageView localImageView7 = new ImageView(this.guoheAdLayout.activity);
      int i = Color.rgb(this.guoheAdLayout.extra.bgRed, this.guoheAdLayout.extra.bgGreen, this.guoheAdLayout.extra.bgBlue);
      GradientDrawable localGradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] { -1, i, i, i });
      localImageView7.setBackgroundDrawable(localGradientDrawable);
      RelativeLayout.LayoutParams localLayoutParams10 = new RelativeLayout.LayoutParams(320, 48);
      localRelativeLayout4.addView(localImageView7, localLayoutParams10);
      ImageView localImageView8 = new ImageView(this.guoheAdLayout.activity);
      localImageView8.setImageDrawable(this.guoheAdLayout.custom.image);
      localImageView8.setId(10);
      localImageView8.setPadding(4, 0, 7, 0);
      localImageView8.setScaleType(ImageView.ScaleType.CENTER);
      RelativeLayout.LayoutParams localLayoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
      localRelativeLayout4.addView(localImageView8, localLayoutParams11);
      TextView localTextView3 = new TextView(this.guoheAdLayout.activity);
      localTextView3.setMaxLines(2);
      localTextView3.setPadding(0, 0, 4, 0);
      localTextView3.setText(this.guoheAdLayout.custom.description.replace("\\n", "\n"));
      localTextView3.setTypeface(Typeface.DEFAULT_BOLD, 1);
      localTextView3.setTextColor(Color.rgb(this.guoheAdLayout.extra.fgRed, this.guoheAdLayout.extra.fgGreen, this.guoheAdLayout.extra.fgBlue));
      RelativeLayout.LayoutParams localLayoutParams12 = new RelativeLayout.LayoutParams(320, 48);
      localLayoutParams12.addRule(1, localImageView8.getId());
      localLayoutParams12.addRule(15);
      localLayoutParams12.setMargins(0, 0, 5, 0);
      localTextView3.setGravity(16);
      localRelativeLayout4.addView(localTextView3, localLayoutParams12);
      this.guoheAdLayout.pushSubView(localRelativeLayout4);
      continue;
      Logger.d("Serving custom type: banner");
      RelativeLayout localRelativeLayout3 = new RelativeLayout(this.guoheAdLayout.activity);
      if (this.guoheAdLayout.custom.image == null)
      {
        this.guoheAdLayout.rotateThreadedNow();
        return;
      }
      ImageView localImageView6 = new ImageView(this.guoheAdLayout.activity);
      localImageView6.setImageDrawable(this.guoheAdLayout.custom.image);
      localImageView6.setScaleType(ImageView.ScaleType.FIT_CENTER);
      RelativeLayout.LayoutParams localLayoutParams9 = new RelativeLayout.LayoutParams(320, 48);
      final Intent localIntent2 = new Intent();
      localIntent2.setClass(this.guoheAdLayout.activity, GuoheAdActivity.class);
      Bundle localBundle2 = new Bundle();
      localBundle2.putString("link", this.guoheAdLayout.custom.link);
      localIntent2.putExtras(localBundle2);
      final Activity localActivity2 = this.guoheAdLayout.activity;
      View.OnClickListener local3 = new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          localActivity2.startActivity(localIntent2);
        }
      };
      localImageView6.setOnClickListener(local3);
      localRelativeLayout3.addView(localImageView6, localLayoutParams9);
      this.guoheAdLayout.pushSubView(localRelativeLayout3);
      continue;
      Logger.d("Serving custom type: icon");
      RelativeLayout localRelativeLayout2 = new RelativeLayout(this.guoheAdLayout.activity);
      if (this.guoheAdLayout.custom.image == null)
      {
        this.guoheAdLayout.rotateThreadedNow();
        return;
      }
      localRelativeLayout2.setLayoutParams(new FrameLayout.LayoutParams(320, 48));
      ImageView localImageView4 = new ImageView(this.guoheAdLayout.activity);
      localImageView4.setBackgroundColor(Color.rgb(this.guoheAdLayout.extra.bgRed, this.guoheAdLayout.extra.bgGreen, this.guoheAdLayout.extra.bgBlue));
      RelativeLayout.LayoutParams localLayoutParams6 = new RelativeLayout.LayoutParams(320, 48);
      localRelativeLayout2.addView(localImageView4, localLayoutParams6);
      ImageView localImageView5 = new ImageView(this.guoheAdLayout.activity);
      localImageView5.setImageDrawable(this.guoheAdLayout.custom.image);
      localImageView5.setId(10);
      localImageView5.setPadding(4, 0, 7, 0);
      localImageView5.setScaleType(ImageView.ScaleType.CENTER);
      RelativeLayout.LayoutParams localLayoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
      localRelativeLayout2.addView(localImageView5, localLayoutParams7);
      TextView localTextView2 = new TextView(this.guoheAdLayout.activity);
      localTextView2.setMaxLines(2);
      localTextView2.setPadding(0, 0, 4, 0);
      localTextView2.setText(this.guoheAdLayout.custom.description.replace("\\n", "\n"));
      localTextView2.setTypeface(Typeface.DEFAULT_BOLD, 1);
      localTextView2.setTextColor(Color.rgb(this.guoheAdLayout.extra.fgRed, this.guoheAdLayout.extra.fgGreen, this.guoheAdLayout.extra.fgBlue));
      RelativeLayout.LayoutParams localLayoutParams8 = new RelativeLayout.LayoutParams(-1, 48);
      localLayoutParams8.addRule(1, localImageView5.getId());
      localLayoutParams8.addRule(15);
      localLayoutParams8.setMargins(0, 0, 5, 0);
      localTextView2.setGravity(17);
      localRelativeLayout2.addView(localTextView2, localLayoutParams8);
      final Intent localIntent1 = new Intent();
      localIntent1.setClass(this.guoheAdLayout.activity, GuoheAdActivity.class);
      Bundle localBundle1 = new Bundle();
      localBundle1.putString("link", this.guoheAdLayout.custom.link);
      localIntent1.putExtras(localBundle1);
      final Activity localActivity1 = this.guoheAdLayout.activity;
      View.OnClickListener local4 = new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          localActivity1.startActivity(localIntent1);
        }
      };
      localRelativeLayout2.setOnClickListener(local4);
      this.guoheAdLayout.pushSubView(localRelativeLayout2);
      continue;
      Logger.d("Serving custom type: choice");
      RelativeLayout localRelativeLayout1 = new RelativeLayout(this.guoheAdLayout.activity);
      RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(320, 50);
      localRelativeLayout1.setLayoutParams(localLayoutParams1);
      ImageView localImageView1 = new ImageView(this.guoheAdLayout.activity);
      localImageView1.setBackgroundColor(Color.rgb(this.guoheAdLayout.custom.bgRed, this.guoheAdLayout.custom.bgGreen, this.guoheAdLayout.custom.bgBlue));
      RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(320, 48);
      localRelativeLayout1.addView(localImageView1, localLayoutParams2);
      InputStream localInputStream1 = getClass().getResourceAsStream("/com/guohead/sdk/assets/yes.png");
      InputStream localInputStream2 = getClass().getResourceAsStream("/com/guohead/sdk/assets/yes_clicked.png");
      InputStream localInputStream3 = getClass().getResourceAsStream("/com/guohead/sdk/assets/no.png");
      InputStream localInputStream4 = getClass().getResourceAsStream("/com/guohead/sdk/assets/no_clicked.png");
      BitmapDrawable localBitmapDrawable1 = new BitmapDrawable(localInputStream1);
      final BitmapDrawable localBitmapDrawable2 = new BitmapDrawable(localInputStream2);
      BitmapDrawable localBitmapDrawable3 = new BitmapDrawable(localInputStream3);
      final BitmapDrawable localBitmapDrawable4 = new BitmapDrawable(localInputStream4);
      final ImageView localImageView2 = new ImageView(this.guoheAdLayout.activity);
      localImageView2.setImageDrawable(localBitmapDrawable1);
      localImageView2.setId(10);
      localImageView2.setPadding(4, 0, 8, 0);
      localImageView2.setScaleType(ImageView.ScaleType.CENTER);
      RelativeLayout.LayoutParams localLayoutParams3 = new RelativeLayout.LayoutParams(50, 50);
      localRelativeLayout1.addView(localImageView2, localLayoutParams3);
      View.OnClickListener local5 = new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (!CustomAdapter.this.isClicked)
          {
            CustomAdapter.this.makeChoice(Boolean.valueOf(true));
            CustomAdapter.access$102(CustomAdapter.this, true);
            localImageView2.setImageDrawable(localBitmapDrawable2);
          }
        }
      };
      localImageView2.setOnClickListener(local5);
      final ImageView localImageView3 = new ImageView(this.guoheAdLayout.activity);
      localImageView3.setImageDrawable(localBitmapDrawable3);
      localImageView3.setId(12);
      localImageView3.setPadding(0, 0, 4, 0);
      localImageView3.setScaleType(ImageView.ScaleType.CENTER);
      RelativeLayout.LayoutParams localLayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams4.addRule(15);
      localLayoutParams4.addRule(11);
      localRelativeLayout1.addView(localImageView3, localLayoutParams4);
      View.OnClickListener local6 = new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          if (!CustomAdapter.this.isClicked)
          {
            CustomAdapter.this.makeChoice(Boolean.valueOf(false));
            CustomAdapter.access$102(CustomAdapter.this, true);
            localImageView3.setImageDrawable(localBitmapDrawable4);
          }
        }
      };
      localImageView3.setOnClickListener(local6);
      TextView localTextView1 = new TextView(this.guoheAdLayout.activity);
      localTextView1.setMaxLines(2);
      localTextView1.setId(11);
      localTextView1.setText(this.guoheAdLayout.custom.description.replace("\\n", "\n"));
      localTextView1.setTypeface(Typeface.DEFAULT_BOLD, 1);
      localTextView1.setTextColor(Color.rgb(this.guoheAdLayout.custom.fgRed, this.guoheAdLayout.custom.fgGreen, this.guoheAdLayout.custom.fgBlue));
      RelativeLayout.LayoutParams localLayoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
      localLayoutParams5.addRule(1, localImageView2.getId());
      localLayoutParams5.addRule(0, localImageView3.getId());
      localLayoutParams5.addRule(14);
      localLayoutParams5.addRule(15);
      localLayoutParams5.addRule(13);
      localTextView1.setGravity(17);
      localRelativeLayout1.addView(localTextView1, localLayoutParams5);
      this.guoheAdLayout.pushSubView(localRelativeLayout1);
    }
  }
  
  public void finish()
  {
    Logger.addStatus("custom finish");
  }
  
  public void handle()
  {
    this.displayCustomRunnable = new Runnable()
    {
      public void run()
      {
        CustomAdapter.this.displayCustom();
      }
    };
    new Thread()
    {
      public void run()
      {
        CustomAdapter.this.guoheAdLayout.custom = CustomAdapter.this.guoheAdLayout.guoheAdManager.getCustom(CustomAdapter.this.ration);
        if (CustomAdapter.this.guoheAdLayout.custom == null)
        {
          CustomAdapter.this.guoheAdLayout.rotateThreadedNow();
          Logger.e("Custom Object is null");
          return;
        }
        CustomAdapter.this.guoheAdLayout.handler.post(CustomAdapter.this.displayCustomRunnable);
      }
    }.start();
  }
  
  public void makeChoice(final Boolean paramBoolean)
  {
    new Thread("Guohead SDK")
    {
      public void run()
      {
        if (paramBoolean.booleanValue())
        {
          CustomAdapter.this.httpClient.httpGet(CustomAdapter.this.ration, 6, Boolean.valueOf(false));
          Logger.e("You said yes !");
          return;
        }
        CustomAdapter.this.httpClient.httpGet(CustomAdapter.this.ration, 7, Boolean.valueOf(false));
        Logger.e("You said no !");
      }
    }.start();
  }
  
  public void refreshAd()
  {
    this.guoheAdLayout.handler.post(this.guoheAdLayout.viewRunnable);
    Logger.addStatus("custom refresh");
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.guohead.sdk.adapters.CustomAdapter
 * JD-Core Version:    0.7.0.1
 */