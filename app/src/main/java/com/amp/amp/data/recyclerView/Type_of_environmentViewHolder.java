package com.amp.amp.data.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Type_of_environmentViewHolder extends RecyclerView.ViewHolder {
    private final TextView Type_of_environmentItemView;

    private Type_of_environmentViewHolder(View itemView) {
        super(itemView);
        Type_of_environmentItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        Type_of_environmentItemView.setText(text);
    }

    public static Type_of_environmentViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Type_of_environmentViewHolder(view);
    }
}
