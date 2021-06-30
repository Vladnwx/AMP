package com.amp.amp.data.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Material_type_RecyclerView extends RecyclerView.ViewHolder {
    private final TextView material_typeItemView;

    private Material_type_RecyclerView(View itemView) {
        super(itemView);
        material_typeItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        material_typeItemView.setText(text);
    }

    public static Material_type_RecyclerView create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Material_type_RecyclerView(view);
    }
}
