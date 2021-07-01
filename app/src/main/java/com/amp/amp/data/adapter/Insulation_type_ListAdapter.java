package com.amp.amp.data.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.amp.amp.data.entity.Insulation_type;
import com.amp.amp.data.viewHolder.Insulation_type_ViewHolder;

public class Insulation_type_ListAdapter extends ListAdapter<Insulation_type, Insulation_type_ViewHolder> {
    public Insulation_type_ListAdapter(@NonNull DiffUtil.ItemCallback<Insulation_type> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Insulation_type_ViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        return Insulation_type_ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(Insulation_type_ViewHolder holder, int position) {
        Insulation_type current = getItem(position);
        holder.bind(current.getValue());
    }

    static class Insulation_typetDiff extends DiffUtil.ItemCallback<Insulation_type> {

        @Override
        public boolean areItemsTheSame(@NonNull Insulation_type oldItem, @NonNull Insulation_type newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Insulation_type oldItem, @NonNull Insulation_type newItem) {
            return oldItem.getValue().equals(newItem.getValue());
        }
    }
}
