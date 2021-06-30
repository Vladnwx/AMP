package com.amp.amp.data.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Amperage_short_RecyclerView extends RecyclerView.ViewHolder {
    private final TextView amperage_shortItemView;

    private Amperage_short_RecyclerView(View itemView) {
        super(itemView);
        amperage_shortItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        amperage_shortItemView.setText(text);
    }

    public static Amperage_short_RecyclerView create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Amperage_short_RecyclerView(view);
    }
}
