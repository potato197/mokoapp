package com.github.droidfu.adapters;

import android.app.ListActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import java.util.LinkedList;
import java.util.List;

public abstract class ListAdapterWithProgress<T>
  extends BaseAdapter
{
  protected ListActivity context;
  protected List<T> data = new LinkedList();
  protected LayoutInflater inflater;
  private boolean isLoadingData;
  protected ListView listView;
  private View progressView;
  
  public ListAdapterWithProgress(ListActivity paramListActivity, int paramInt)
  {
    this.context = paramListActivity;
    this.listView = paramListActivity.getListView();
    this.progressView = paramListActivity.getLayoutInflater().inflate(paramInt, this.listView, false);
    this.inflater = LayoutInflater.from(paramListActivity);
  }
  
  private boolean isPositionOfProgressElement(int paramInt)
  {
    return (this.isLoadingData) && (paramInt == this.data.size());
  }
  
  public void addAll(List<T> paramList)
  {
    this.data.addAll(paramList);
    notifyDataSetChanged();
  }
  
  public boolean areAllItemsEnabled()
  {
    return false;
  }
  
  public void clear()
  {
    this.data.clear();
    notifyDataSetChanged();
  }
  
  protected abstract View doGetView(int paramInt, View paramView, ViewGroup paramViewGroup);
  
  public int getCount()
  {
    List localList = this.data;
    int i = 0;
    if (localList != null) {
      i = 0 + this.data.size();
    }
    if (this.isLoadingData) {
      i++;
    }
    return i;
  }
  
  public List<T> getData()
  {
    return this.data;
  }
  
  public Object getItem(int paramInt)
  {
    if (this.data == null) {
      return null;
    }
    return this.data.get(paramInt);
  }
  
  public int getItemCount()
  {
    if (this.data != null) {
      return this.data.size();
    }
    return 0;
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (isPositionOfProgressElement(paramInt)) {
      return this.progressView;
    }
    if (paramView == this.progressView) {
      paramView = null;
    }
    return doGetView(paramInt, paramView, paramViewGroup);
  }
  
  public boolean hasItems()
  {
    return getItemCount() != 0;
  }
  
  public boolean isEmpty()
  {
    return (getCount() == 0) && (!this.isLoadingData);
  }
  
  public boolean isEnabled(int paramInt)
  {
    return !isPositionOfProgressElement(paramInt);
  }
  
  public boolean isLoadingData()
  {
    return this.isLoadingData;
  }
  
  public void remove(int paramInt)
  {
    this.data.remove(paramInt);
    notifyDataSetChanged();
  }
  
  public void setIsLoadingData(boolean paramBoolean)
  {
    this.isLoadingData = paramBoolean;
    notifyDataSetChanged();
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.github.droidfu.adapters.ListAdapterWithProgress
 * JD-Core Version:    0.7.0.1
 */