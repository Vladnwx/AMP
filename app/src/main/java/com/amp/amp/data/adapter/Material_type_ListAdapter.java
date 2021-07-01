package com.amp.amp.data.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.amp.amp.data.entity.Material_type;
import com.amp.amp.data.viewHolder.Material_type_ViewHolder;

public class Material_type_ListAdapter extends ListAdapter<Material_type, Material_type_ViewHolder> {
    public Material_type_ListAdapter(@NonNull DiffUtil.ItemCallback<Material_type> diffCallback) {
        super(diffCallback);
    }

    @Override
    public Material_type_ViewHolder onCreateViewHolder(ViewGroup  parent, int viewType) {
        return Material_type_ViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(Material_type_ViewHolder holder, int position) {
        Material_type current = getItem(position);
        holder.bind(current.getValue());
    }

    static class Material_typeDiff extends DiffUtil.ItemCallback<Material_type> {

        @Override
        public boolean areItemsTheSame(@NonNull Material_type oldItem, @NonNull Material_type newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Material_type oldItem, @NonNull Material_type newItem) {
            return oldItem.getValue().equals(newItem.getValue());
        }
    }
}
