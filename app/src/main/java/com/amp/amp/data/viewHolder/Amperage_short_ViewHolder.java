package com.amp.amp.data.viewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Amperage_short_ViewHolder extends RecyclerView.ViewHolder {
    public final TextView amperage_shortItemView;

    public Amperage_short_ViewHolder(View itemView) {
        super(itemView);
        amperage_shortItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        amperage_shortItemView.setText(text);
    }

    public static Amperage_short_ViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Amperage_short_ViewHolder(view);
    }

}
