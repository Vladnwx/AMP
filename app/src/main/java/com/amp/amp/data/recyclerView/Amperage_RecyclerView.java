package com.amp.amp.data.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Amperage_RecyclerView extends RecyclerView.ViewHolder {
    private final TextView amperageItemView;

    private Amperage_RecyclerView(View itemView) {
        super(itemView);
        amperageItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        amperageItemView.setText(text);
    }

    public static Amperage_RecyclerView create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Amperage_RecyclerView(view);
    }
}
