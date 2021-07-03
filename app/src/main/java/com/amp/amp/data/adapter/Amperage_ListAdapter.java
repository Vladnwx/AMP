package com.amp.amp.data.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.amp.amp.data.entity.Amperage;
import com.amp.amp.data.viewHolder.Amperage_ViewHolder;

public class Amperage_ListAdapter extends ListAdapter<Amperage, Amperage_ViewHolder> {
    public Amperage_ListAdapter(@NonNull DiffUtil.ItemCallback<Amperage> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Amperage_ViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        return Amperage_ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(Amperage_ViewHolder holder, int position) {
        Amperage current = getItem(position);
        holder.bind(current.getValue());
    }

    static class AmperageDiff extends DiffUtil.ItemCallback<Amperage> {

        @Override
        public boolean areItemsTheSame(@NonNull Amperage oldItem, @NonNull Amperage newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Amperage oldItem, @NonNull Amperage newItem) {
            return oldItem.getValue().equals(newItem.getValue());
        }
    }
}
