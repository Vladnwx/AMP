package com.amp.amp.data.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Short_current_RecyclerView extends RecyclerView.ViewHolder {
    private final TextView short_currentItemView;

    private Short_current_RecyclerView(View itemView) {
        super(itemView);
        short_currentItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        short_currentItemView.setText(text);
    }

    public static Short_current_RecyclerView create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Short_current_RecyclerView(view);
    }
}
