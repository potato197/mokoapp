package net.youmi.android;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import java.util.ArrayList;

class do
  extends BaseExpandableListAdapter
{
  Activity a;
  ca b;
  int c = 36;
  int d = 50;
  co e;
  ExpandableListView f;
  
  do(co paramco1, Activity paramActivity, co paramco2, ca paramca, ExpandableListView paramExpandableListView, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    this.a = paramActivity;
    this.f = paramExpandableListView;
    this.e = paramco2;
    this.b = paramca;
    this.c = this.b.a(this.c);
    this.d = this.b.a(this.d);
  }
  
  void a()
  {
    notifyDataSetChanged();
  }
  
  public Object getChild(int paramInt1, int paramInt2)
  {
    switch (paramInt1)
    {
    }
    return null;
  }
  
  public long getChildId(int paramInt1, int paramInt2)
  {
    return paramInt2;
  }
  
  public View getChildView(int paramInt1, int paramInt2, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    dt localdt2;
    if (paramView == null)
    {
      dt localdt1 = new dt(this.a, this.e, this.b);
      localdt1.setPadding(10, 10, 10, 10);
      localdt2 = localdt1;
      paramView = localdt1;
      localdt2.a(paramInt2);
      if (paramInt1 != 0) {
        break label118;
      }
      if ((this.e.g != null) && (this.e.g.size() > paramInt2) && (paramInt2 > -1)) {
        localdt2.a((ci)this.e.g.get(paramInt2));
      }
    }
    label118:
    while ((paramInt1 != 1) || (this.e.h == null) || (this.e.h.size() <= paramInt2) || (paramInt2 <= -1))
    {
      return paramView;
      localdt2 = (dt)paramView;
      break;
    }
    localdt2.a((m)this.e.h.get(paramInt2));
    return paramView;
  }
  
  public int getChildrenCount(int paramInt)
  {
    if (paramInt == 0) {
      if (this.e.g != null) {}
    }
    while ((paramInt != 1) || (this.e.h == null))
    {
      return 0;
      return this.e.g.size();
    }
    return this.e.h.size();
  }
  
  public Object getGroup(int paramInt)
  {
    return null;
  }
  
  public int getGroupCount()
  {
    return 2;
  }
  
  public long getGroupId(int paramInt)
  {
    return paramInt;
  }
  
  public View getGroupView(int paramInt, boolean paramBoolean, View paramView, ViewGroup paramViewGroup)
  {
    TextView localTextView;
    if (paramView != null)
    {
      localTextView = (TextView)paramView;
      if (paramInt == 0)
      {
        if (this.e.g != null) {
          break label125;
        }
        localTextView.setText("正在下载(0)");
      }
    }
    for (;;)
    {
      if (paramInt == 1)
      {
        if (this.e.h != null) {
          break label163;
        }
        localTextView.setText("已下载(0)");
      }
      return paramView;
      AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, this.d);
      localTextView = new TextView(this.a);
      localTextView.setTextColor(-1);
      localTextView.setPadding(this.b.a(40), 0, 0, 0);
      localTextView.setLayoutParams(localLayoutParams);
      localTextView.setGravity(19);
      paramView = localTextView;
      break;
      label125:
      localTextView.setText("正在下载(" + this.e.g.size() + ")");
    }
    label163:
    localTextView.setText("已下载(" + this.e.h.size() + ")");
    return paramView;
  }
  
  public boolean hasStableIds()
  {
    return false;
  }
  
  public boolean isChildSelectable(int paramInt1, int paramInt2)
  {
    return false;
  }
}


/* Location:           J:\android\tools\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     net.youmi.android.do
 * JD-Core Version:    0.7.0.1
 */