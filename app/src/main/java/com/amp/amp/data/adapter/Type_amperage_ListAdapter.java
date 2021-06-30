package com.amp.amp.data.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.amp.amp.data.entity.Type_amperage;
import com.amp.amp.data.viewHolder.Type_amperage_ViewHolder;

public class Type_amperage_ListAdapter extends ListAdapter<Type_amperage, Type_amperage_ViewHolder> {
    public Type_amperage_ListAdapter(@NonNull DiffUtil.ItemCallback<Type_amperage> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Type_amperage_ViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        return Type_amperage_ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(Type_amperage_ViewHolder holder, int position) {
        Type_amperage current = getItem(position);
        holder.bind(current.getValue());
    }

    static class Type_amperageDiff extends DiffUtil.ItemCallback<Type_amperage> {

        @Override
        public boolean areItemsTheSame(@NonNull Type_amperage oldItem, @NonNull Type_amperage newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Type_amperage oldItem, @NonNull Type_amperage newItem) {
            return oldItem.getValue().equals(newItem.getValue());
        }
    }
}
