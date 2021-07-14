package com.amp.amp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.amp.amp.data.App;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView_type_of_environment = findViewById(R.id.TextView_type_of_environment);
        TextView textView_type_amperage = findViewById(R.id.TextView_type_amperage);
        TextView textView_number_of_core = findViewById(R.id.TextView_number_of_cores);
        TextView textView_material_type = findViewById(R.id.TextView_material_type);
        TextView textView_insulation_type = findViewById(R.id.TextView_insulation_type);
        TextView textView_method_of_laying = findViewById(R.id.TextView_method_of_laying);
        TextView textView_nominal_size = findViewById(R.id.TextView_nominal_size);

        Spinner spinner_type_of_environment = (Spinner) findViewById(R.id.spinner_type_of_environment);
        Spinner spinner_type_amperage = (Spinner) findViewById(R.id.spinner_type_amperage);
        Spinner spinner_number_of_core = (Spinner) findViewById(R.id.spinner_number_of_cores);
        Spinner spinner_material_type = (Spinner) findViewById(R.id.spinner_material_type);
        Spinner spinner_insulation_type = (Spinner) findViewById(R.id.spinner_insulation_type);
        Spinner spinner_method_of_laying = (Spinner) findViewById(R.id.spinner_method_of_laying);
        Spinner spinner_nominal_size = (Spinner) findViewById(R.id.spinner_nominal_size);

        List<String> type_of_environments = new ArrayList<String>();
        List<String> type_amperages = new ArrayList<String>();
        List<String> number_of_cores = new ArrayList<String>();
        List<String> material_types = new ArrayList<String>();
        List<String> insulation_types = new ArrayList<String>();
        List<String> method_of_layings = new ArrayList<String>();
        List<Double> nominal_sizes = new ArrayList<>();
        List<String> amperage_shorts = new ArrayList<String>();
        List<String> amperages = new ArrayList<String>();


        App.getInstance().getType_of_environment_dao().defaultgreate();
        type_of_environments = App.getInstance().getType_of_environment_dao().getAll();

        App.getInstance().getType_amperage_dao().defaultgreate();
        type_amperages = App.getInstance().getType_amperage_dao().getAll();

        App.getInstance().getNumber_of_cores_dao().defaultgreate();
        number_of_cores = App.getInstance().getNumber_of_cores_dao().getAll();

        App.getInstance().getMaterial_type_dao().defaultgreate();
        material_types = App.getInstance().getMaterial_type_dao().getAll();

        App.getInstance().getInsulation_type_dao().defaultgreate();
        insulation_types = App.getInstance().getInsulation_type_dao().getAll();

        App.getInstance().getMethod_of_laying_dao().defaultgreate();
        method_of_layings  = App.getInstance().getMethod_of_laying_dao().getAll();

        App.getInstance().getNominal_size_dao().defaultgreate();
        nominal_sizes = App.getInstance().getNominal_size_dao().getAll();

        App.getInstance().getAmperage_short_dao().defaultgreate();

        App.getInstance().getResistivity_dao().defaultgreate();

        ArrayAdapter<String> adapter_type_of_environments = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, type_of_environments);
        ArrayAdapter<String> adapter_type_amperages = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, type_amperages);
        ArrayAdapter<String> adapter_number_of_cores = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, number_of_cores);
        ArrayAdapter<String> adapter_material_types = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, material_types);
        ArrayAdapter<String> adapter_insulation_types = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, insulation_types);
        ArrayAdapter<String> adapter_method_of_layings = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, method_of_layings);
       ArrayAdapter<Double> adapter_nominal_sizes = new ArrayAdapter<Double>(this,
                android.R.layout.simple_spinner_item, nominal_sizes);


        adapter_type_of_environments.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_type_amperages.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_number_of_cores.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_material_types.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_insulation_types.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_method_of_layings.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter_nominal_sizes.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_type_of_environment.setAdapter(adapter_type_of_environments);
        spinner_type_amperage.setAdapter(adapter_type_amperages);
        spinner_number_of_core.setAdapter(adapter_number_of_cores);
        spinner_material_type.setAdapter(adapter_material_types);
        spinner_insulation_type.setAdapter(adapter_insulation_types);
        spinner_method_of_laying.setAdapter(adapter_method_of_layings);
        spinner_nominal_size.setAdapter(adapter_nominal_sizes);

        spinner_type_of_environment.setSelection(0);

    }

}