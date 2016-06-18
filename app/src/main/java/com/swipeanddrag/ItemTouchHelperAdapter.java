package com.swipeanddrag;

import android.support.v7.widget.RecyclerView;

/**
 * Created by Shahbaz on 6/18/2016.
 */
public interface ItemTouchHelperAdapter {
    void getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);
    void onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder1, RecyclerView.ViewHolder viewHolder2);
    void onSwiped(RecyclerView.ViewHolder viewHolder1, int i);
    void onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);

}
