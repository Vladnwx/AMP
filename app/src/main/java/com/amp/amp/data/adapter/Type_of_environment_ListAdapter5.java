package com.amp.amp.data.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.amp.amp.data.entity.Type_of_environment;
import com.amp.amp.data.viewHolder.Type_of_environment_ViewHolder;

public class Type_of_environment_ListAdapter5 extends ListAdapter<Type_of_environment, Type_of_environment_ViewHolder> {
    public Type_of_environment_ListAdapter5(@NonNull DiffUtil.ItemCallback<Type_of_environment> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Type_of_environment_ViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        return Type_of_environment_ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(Type_of_environment_ViewHolder holder, int position) {
        Type_of_environment current = getItem(position);
        holder.bind(current.getValue());
    }

    static class Type_of_environmentDiff extends DiffUtil.ItemCallback<Type_of_environment> {

        @Override
        public boolean areItemsTheSame(@NonNull Type_of_environment oldItem, @NonNull Type_of_environment newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Type_of_environment oldItem, @NonNull Type_of_environment newItem) {
            return oldItem.getValue().equals(newItem.getValue());
        }
    }
}
