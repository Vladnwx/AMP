package com.amp.amp;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class AmperageViewHolder extends RecyclerView.ViewHolder {
    private final Spinner spinner_type_of_environment;
    private final Spinner spinner_type_amperage;
    private final Spinner spinner_number_of_core;
    private final Spinner spinner_material_type;
    private final Spinner spinner_insulation_type;
    private final Spinner spinner_method_of_laying;
    private final Spinner spinner_nominal_size;

    TextView textView_type_of_environment;


    public AmperageViewHolder(View itemView) {
        super(itemView);
        spinner_type_of_environment = itemView.findViewById(R.id.spinner_type_of_environment);
        spinner_type_amperage = itemView.findViewById(R.id.spinner_type_amperage);
        spinner_number_of_core = itemView.findViewById(R.id.spinner_number_of_cores);
        spinner_material_type = itemView.findViewById(R.id.spinner_material_type);
        spinner_insulation_type = itemView.findViewById(R.id.spinner_insulation_type);
        spinner_method_of_laying = itemView.findViewById(R.id.spinner_method_of_laying);
        spinner_nominal_size = itemView.findViewById(R.id.spinner_nominal_size);
    }


}
