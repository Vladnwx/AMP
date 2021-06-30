package com.amp.amp.data.viewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Number_of_core_ViewHolder extends RecyclerView.ViewHolder {
    public final TextView Number_of_coreItemView;

    public Number_of_core_ViewHolder(View itemView) {
        super(itemView);
        Number_of_coreItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        Number_of_coreItemView.setText(text);
    }

    public static Number_of_core_ViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Number_of_core_ViewHolder(view);
    }

}
