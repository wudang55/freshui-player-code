package com.yingyonghui.market;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class CommonAppListActivity$1 extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (CommonAppListActivity.access$0(this.this$0) != null)
      CommonAppListActivity.access$0(this.this$0).notifyDataSetChanged();
  }
}

/* Location:           D:\android_tools\dex2jar-0.0.7.4-SNAPSHOT\classes.dex.dex2jar.jar
 * Qualified Name:     com.yingyonghui.market.CommonAppListActivity.1
 * JD-Core Version:    0.6.0
 */