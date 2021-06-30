package com.amp.amp.data.viewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Amperage_ViewHolder extends RecyclerView.ViewHolder {
    public final TextView amperageItemView;

    public Amperage_ViewHolder(View itemView) {
        super(itemView);
        amperageItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        amperageItemView.setText(text);
    }

    public static Amperage_ViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Amperage_ViewHolder(view);
    }

}
