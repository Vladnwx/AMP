package com.amp.amp.data.viewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Material_type_ViewHolder extends RecyclerView.ViewHolder {
    public final TextView material_typeItemView;

    public Material_type_ViewHolder(View itemView) {
        super(itemView);
        material_typeItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        material_typeItemView.setText(text);
    }

    public static Material_type_ViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Material_type_ViewHolder(view);
    }

}