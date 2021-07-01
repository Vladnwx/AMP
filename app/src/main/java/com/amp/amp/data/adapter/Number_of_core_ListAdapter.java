package com.amp.amp.data.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.amp.amp.data.entity.Number_of_core;
import com.amp.amp.data.viewHolder.Number_of_core_ViewHolder;

public class Number_of_core_ListAdapter extends ListAdapter<Number_of_core, Number_of_core_ViewHolder> {
    public Number_of_core_ListAdapter(@NonNull DiffUtil.ItemCallback<Number_of_core> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Number_of_core_ViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        return Number_of_core_ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(Number_of_core_ViewHolder holder, int position) {
        Number_of_core current = getItem(position);
        holder.bind(current.getValue());
    }

    static class Number_of_coretDiff extends DiffUtil.ItemCallback<Number_of_core> {

        @Override
        public boolean areItemsTheSame(@NonNull Number_of_core oldItem, @NonNull Number_of_core newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Number_of_core oldItem, @NonNull Number_of_core newItem) {
            return oldItem.getValue().equals(newItem.getValue());
        }
    }
}
