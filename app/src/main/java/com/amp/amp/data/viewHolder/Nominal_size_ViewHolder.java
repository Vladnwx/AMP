package com.amp.amp.data.viewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Nominal_size_ViewHolder extends RecyclerView.ViewHolder {
    public final TextView nominal_sizeItemView;

    public Nominal_size_ViewHolder(View itemView) {
        super(itemView);
        nominal_sizeItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        nominal_sizeItemView.setText(text);
    }

    public static Nominal_size_ViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Nominal_size_ViewHolder(view);
    }

}
