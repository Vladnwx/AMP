package com.amp.amp.data.viewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Short_current_ViewHolder extends RecyclerView.ViewHolder {
    public final TextView short_currentItemView;

    public Short_current_ViewHolder(View itemView) {
        super(itemView);
        short_currentItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        short_currentItemView.setText(text);
    }

    public static Short_current_ViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Short_current_ViewHolder(view);
    }

}
