package com.amp.amp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cable cable1 = new Cable();
        // адаптеры
        ArrayAdapter<String> adapter_type_amperage = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cable1.type_amperage);
        adapter_type_amperage.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter_material_type = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cable1.material_type);
        adapter_material_type.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter_insulation_type = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cable1.insulation_type);
        adapter_insulation_type.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter_type_of_environment = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cable1.type_of_environment);
        adapter_type_of_environment.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter_number_of_cores = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cable1.number_of_cores);
        adapter_number_of_cores.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapter_sposob_prokladki = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, cable1.sposob_prokladki);
        adapter_sposob_prokladki.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner_type_amperage = (Spinner) findViewById(R.id.spinner_type_amperage);
        Spinner spinner_material_type = (Spinner) findViewById(R.id.spinner_material_type);
        Spinner spinner_insulation_type = (Spinner) findViewById(R.id.spinner_insulation_type);
        Spinner spinner_type_of_environment = (Spinner) findViewById(R.id.spinner_type_of_environment);
        Spinner spinner_number_of_cores = (Spinner) findViewById(R.id.spinner_number_of_cores);
        Spinner spinner_sposob_prokladki = (Spinner) findViewById(R.id.spinner_sposob_prokladki);

        spinner_type_amperage.setAdapter(adapter_type_amperage);
        spinner_material_type.setAdapter(adapter_material_type);
        spinner_insulation_type.setAdapter(adapter_insulation_type);
        spinner_type_of_environment.setAdapter(adapter_type_of_environment);
        spinner_number_of_cores.setAdapter(adapter_number_of_cores);
        spinner_sposob_prokladki.setAdapter(adapter_sposob_prokladki);

        // выделяем элемент
        spinner_type_amperage.setSelection(0);
        spinner_material_type.setSelection(0);
        spinner_insulation_type.setSelection(0);
        spinner_type_of_environment.setSelection(0);
        spinner_number_of_cores.setSelection(0);
        spinner_sposob_prokladki.setSelection(0);
    }
}