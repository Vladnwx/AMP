package com.amp.amp.data.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.R;

public class Type_of_environment_RecyclerView extends RecyclerView.ViewHolder {
    private final TextView Type_of_environmentItemView;
    private final Spinner Type_of_environmentItemView1;
    private  ArrayAdapter<String> adapter;

    private Type_of_environment_RecyclerView(View itemView) {
        super(itemView);
        Type_of_environmentItemView = itemView.findViewById(R.id.textView);
        Type_of_environmentItemView1 = itemView.findViewById(R.id.spinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Type_of_environmentItemView1.setAdapter(adapter);
    }

    public void bind(String text) {
        Type_of_environmentItemView.setText(text);





    }

    public static Type_of_environment_RecyclerView create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_main, parent, false);
        return new Type_of_environment_RecyclerView(view);
    }
}
