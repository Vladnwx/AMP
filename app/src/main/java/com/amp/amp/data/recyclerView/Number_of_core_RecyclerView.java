package com.amp.amp.data.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Number_of_core_RecyclerView extends RecyclerView.ViewHolder {
    private final TextView number_of_coreItemView;

    private Number_of_core_RecyclerView(View itemView) {
        super(itemView);
        number_of_coreItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        number_of_coreItemView.setText(text);
    }

    public static Number_of_core_RecyclerView create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Number_of_core_RecyclerView(view);
    }
}
