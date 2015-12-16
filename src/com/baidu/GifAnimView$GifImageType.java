package com.baidu;

public enum GifAnimView$GifImageType
{
  final int a;
  
  static
  {
    SYNC_DECODER = new GifImageType("SYNC_DECODER", 1, 1);
    COVER = new GifImageType("COVER", 2, 2);
    GifImageType[] arrayOfGifImageType = new GifImageType[3];
    arrayOfGifImageType[0] = WAIT_FINISH;
    arrayOfGifImageType[1] = SYNC_DECODER;
    arrayOfGifImageType[2] = COVER;
    b = arrayOfGifImageType;
  }
  
  private GifAnimView$GifImageType(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.baidu.GifAnimView.GifImageType
 * JD-Core Version:    0.7.0.1
 */