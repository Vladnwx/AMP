package com.amp.amp.data.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Type_amperage_RecyclerView extends RecyclerView.ViewHolder {
    private final TextView type_amperageItemView;

    private Type_amperage_RecyclerView(View itemView) {
        super(itemView);
        type_amperageItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        type_amperageItemView.setText(text);
    }

    public static Type_amperage_RecyclerView create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Type_amperage_RecyclerView(view);
    }
}
