package com.modularization.common.base.adapter;

import android.widget.AdapterView;

import androidx.recyclerview.widget.RecyclerView;

/**
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         16/4/15
 */
public abstract class BaseRecyclerViewAdapter<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T>{

    protected AdapterView.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {

        this.onItemClickListener = onItemClickListener;
    }

    protected void onItemHolderClick(RecyclerView.ViewHolder itemHolder) {
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(null, itemHolder.itemView,
                    itemHolder.getAdapterPosition(), itemHolder.getItemId());
        } else {
            throw new IllegalStateException("Please call setOnItemClickListener method set the click event listeners");
        }
    }

}
