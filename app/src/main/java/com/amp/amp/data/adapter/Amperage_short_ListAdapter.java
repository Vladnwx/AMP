package com.amp.amp.data.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.amp.amp.data.entity.Amperage_short;
import com.amp.amp.data.viewHolder.Amperage_short_ViewHolder;

public class Amperage_short_ListAdapter extends ListAdapter<Amperage_short, Amperage_short_ViewHolder> {
    public Amperage_short_ListAdapter(@NonNull DiffUtil.ItemCallback<Amperage_short> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Amperage_short_ViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        return Amperage_short_ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(Amperage_short_ViewHolder holder, int position) {
        Amperage_short current = getItem(position);
        holder.bind(current.getValue());
    }

    static class Amperage_shortDiff extends DiffUtil.ItemCallback<Amperage_short> {

        @Override
        public boolean areItemsTheSame(@NonNull Amperage_short oldItem, @NonNull Amperage_short newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Amperage_short oldItem, @NonNull Amperage_short newItem) {
            return oldItem.getValue().equals(newItem.getValue());
        }
    }
}
