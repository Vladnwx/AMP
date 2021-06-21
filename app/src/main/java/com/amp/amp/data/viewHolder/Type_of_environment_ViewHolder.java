package com.amp.amp.data.viewHolder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Type_of_environment_ViewHolder extends RecyclerView.ViewHolder {
    public final TextView type_of_environmentItemView;

    public Type_of_environment_ViewHolder(View itemView) {
        super(itemView);
        type_of_environmentItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        type_of_environmentItemView.setText(text);
    }

    public static Type_of_environment_ViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new Type_of_environment_ViewHolder(view);
    }

}
