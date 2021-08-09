package com.amp.amp.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.amp.amp.R;
import com.amp.amp.data.App;

import java.util.List;

public class Fragment_tableAmperage extends Fragment {

    private ViewModel_tableAmperage mViewModel;
    private List<String> type_of_environments = App.getInstance().getType_of_environment_Dao().getAll();
    private List<String> type_amperages = App.getInstance().getType_amperage_Dao().getAll();
    private List<String> number_of_cores = App.getInstance().getNumber_of_cores_Dao().getAll();
    private List<String> material_types = App.getInstance().getMaterial_type_Dao().getAll();
    private List<String> insulation_types = App.getInstance().getInsulation_type_Dao().getAll();
    private List<String> method_of_layings = App.getInstance().getMethod_of_laying_Dao().getAll();
    private List<Double> nominal_sizes = App.getInstance().getNominal_size_Dao().getAll();

    public static Fragment_tableAmperage newInstance() {
        return new Fragment_tableAmperage();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.main_fragment, container, false);

        Spinner spinner_type_of_environment = (Spinner) view.findViewById(R.id.spinner_type_of_environment);
        Spinner spinner_type_amperage = (Spinner) view.findViewById(R.id.spinner_type_amperage);
        Spinner spinner_number_of_core = (Spinner) view.findViewById(R.id.spinner_number_of_core);
        Spinner spinner_material_type = (Spinner) view.findViewById(R.id.spinner_material_type);
        Spinner spinner_insulation_type = (Spinner) view.findViewById(R.id.spinner_insulation_type);
        Spinner spinner_method_of_laying = (Spinner) view.findViewById(R.id.spinner_method_of_laying);
        Spinner spinner_nominal_size = (Spinner) view.findViewById(R.id.spinner_nominal_size);

        TextView TextView_type_of_environment = (TextView) view.findViewById(R.id.TextView_type_of_environment);
        TextView TextView_type_amperage = (TextView) view.findViewById(R.id.TextView_type_amperage);
        TextView TextView_number_of_core = (TextView) view.findViewById(R.id.TextView_number_of_core);
        TextView TextView_material_type = (TextView) view.findViewById(R.id.TextView_material_type);
        TextView TextView_insulation_type = (TextView) view.findViewById(R.id.TextView_insulation_type);
        TextView TextView_method_of_laying = (TextView) view.findViewById(R.id.TextView_method_of_laying);
        TextView TextView_equivalent_section = (TextView) view.findViewById(R.id.TextView_equivalent_section);
        TextView TextView_equivalent_section_value = (TextView) view.findViewById(R.id.TextView_equivalent_section_value);
        TextView TextView_Resistance_R = (TextView) view.findViewById(R.id.TextView_Resistance_R);
        TextView TextView_Resistance_R_value = (TextView) view.findViewById(R.id.TextView_Resistance_R_value);
        TextView TextView_Resistance_X = (TextView) view.findViewById(R.id.TextView_Resistance_X);
        TextView TextView_Resistance_X_value = (TextView) view.findViewById(R.id.TextView_Resistance_X_value);
        TextView TextView_nominal_size = (TextView) view.findViewById(R.id.TextView_nominal_size);

        ArrayAdapter<String> adapter_type_of_environment = new ArrayAdapter<String>(App.getInstance(),
                android.R.layout.simple_spinner_item, type_of_environments);

        ArrayAdapter<String> adapter_type_amperage = new ArrayAdapter<String>(App.getInstance(),
                android.R.layout.simple_spinner_item, type_amperages);

        ArrayAdapter<String> adapter_number_of_core = new ArrayAdapter<String>(App.getInstance(),
                android.R.layout.simple_spinner_item, number_of_cores);

        ArrayAdapter<String> adapter_material_type = new ArrayAdapter<String>(App.getInstance(),
                android.R.layout.simple_spinner_item, material_types);

        ArrayAdapter<String> adapter_insulation_type = new ArrayAdapter<String>(App.getInstance(),
                android.R.layout.simple_spinner_item, insulation_types);

        ArrayAdapter<String> adapter_method_of_laying = new ArrayAdapter<String>(App.getInstance(),
                android.R.layout.simple_spinner_item, method_of_layings);

        ArrayAdapter<Double> adapter_nominal_size = new ArrayAdapter<Double>(App.getInstance(),
                android.R.layout.simple_spinner_item, nominal_sizes);

        adapter_type_of_environment.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_type_amperage.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_number_of_core.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_material_type.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_insulation_type.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_method_of_laying.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_nominal_size.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_type_of_environment.setAdapter(adapter_type_of_environment);
        spinner_type_amperage.setAdapter(adapter_type_amperage);
        spinner_number_of_core.setAdapter(adapter_number_of_core);
        spinner_material_type.setAdapter(adapter_material_type);
        spinner_insulation_type.setAdapter(adapter_insulation_type);
        spinner_method_of_laying.setAdapter(adapter_method_of_laying);
        spinner_nominal_size.setAdapter(adapter_nominal_size);

        TextView_Resistance_R_value.setText(String.valueOf(App.getInstance().getResistivity_Dao().getR(spinner_material_type.getSelectedItem().toString(), Double.parseDouble(spinner_nominal_size.getSelectedItem().toString()))));
        TextView_Resistance_X_value.setText(String.valueOf(App.getInstance().getResistivity_Dao().getX(spinner_material_type.getSelectedItem().toString(), Double.parseDouble(spinner_nominal_size.getSelectedItem().toString()))));


        TextView_type_of_environment.setText("Окружающая среда");

        return view;


    }


}