package com.amp.amp.data.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Insulation_type_RecyclerView extends RecyclerView.ViewHolder {
    private final TextView insulation_typeItemView;

    private Insulation_type_RecyclerView(View itemView) {
        super(itemView);
        insulation_typeItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        insulation_typeItemView.setText(text);
    }

    public static Insulation_type_RecyclerView create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Insulation_type_RecyclerView(view);
    }
}
