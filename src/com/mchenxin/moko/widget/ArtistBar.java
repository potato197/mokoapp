package com.mchenxin.moko.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.droidfu.widgets.WebImageView;
import com.mchenxin.moko.api.Artist;

public class ArtistBar
  extends LinearLayout
{
  private TextView mAlbumSumTextView;
  private TextView mArtistDutyTextView;
  private WebImageView mArtistImageView;
  private TextView mArtistTextView;
  private Context mContext;
  
  public ArtistBar(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    init();
  }
  
  public ArtistBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
    init();
  }
  
  public void init()
  {
    LayoutInflater.from(getContext()).inflate(2130903040, this);
    this.mArtistTextView = ((TextView)findViewById(2131099649));
    this.mAlbumSumTextView = ((TextView)findViewById(2131099651));
    this.mArtistImageView = ((WebImageView)findViewById(2131099648));
    this.mArtistDutyTextView = ((TextView)findViewById(2131099650));
  }
  
  public void setArtist(Artist paramArtist)
  {
    this.mArtistTextView.setText(paramArtist.getName() + "  (" + paramArtist.getRank() + ")");
    this.mAlbumSumTextView.setText(this.mContext.getString(2130968590) + "(" + paramArtist.getAblumsSum() + ")");
    this.mArtistImageView.reset();
    this.mArtistImageView.setImageUrl(paramArtist.getLogo());
    this.mArtistImageView.loadImage();
    for (int i = 0;; i++)
    {
      if (i >= paramArtist.getDuty().length) {
        return;
      }
      this.mArtistDutyTextView.setText(this.mArtistDutyTextView.getText() + " " + paramArtist.getDuty()[i]);
    }
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mchenxin.moko.widget.ArtistBar
 * JD-Core Version:    0.7.0.1
 */