package com.amp.amp.data.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.amp.amp.data.entity.Short_current;
import com.amp.amp.data.viewHolder.Short_current_ViewHolder;

public class Short_current_ListAdapter extends ListAdapter<Short_current, Short_current_ViewHolder> {
    public Short_current_ListAdapter(@NonNull DiffUtil.ItemCallback<Short_current> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Short_current_ViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        return Short_current_ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(Short_current_ViewHolder holder, int position) {
        Short_current current = getItem(position);
        holder.bind(current.getValue());
    }

    static class Short_currentDiff extends DiffUtil.ItemCallback<Short_current> {

        @Override
        public boolean areItemsTheSame(@NonNull Short_current oldItem, @NonNull Short_current newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Short_current oldItem, @NonNull Short_current newItem) {
            return oldItem.getValue().equals(newItem.getValue());
        }
    }
}
