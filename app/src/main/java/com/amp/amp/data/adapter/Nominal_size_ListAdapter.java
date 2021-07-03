package com.amp.amp.data.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.amp.amp.data.entity.Nominal_size;
import com.amp.amp.data.viewHolder.Nominal_size_ViewHolder;

public class Nominal_size_ListAdapter extends ListAdapter<Nominal_size, Nominal_size_ViewHolder> {
    public Nominal_size_ListAdapter(@NonNull DiffUtil.ItemCallback<Nominal_size> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Nominal_size_ViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        return Nominal_size_ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(Nominal_size_ViewHolder holder, int position) {
        Nominal_size current = getItem(position);
        holder.bind(current.getValueString());
    }

    static class Nominal_sizeDiff extends DiffUtil.ItemCallback<Nominal_size> {

        @Override
        public boolean areItemsTheSame(@NonNull Nominal_size oldItem, @NonNull Nominal_size newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Nominal_size oldItem, @NonNull Nominal_size newItem) {
            return oldItem.getValueString().equals(newItem.getValue());
        }
    }
}
