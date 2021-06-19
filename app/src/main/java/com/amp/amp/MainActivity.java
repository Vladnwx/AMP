package com.amp.amp;


import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    double phase;
    double power;
    double voltage;
    double current;
    double cos;
    Button button_naytipomochnosti;
    EditText EditText_power;
    EditText EditText_voltage;
    EditText EditText_cos;
    TextView TextView_current;
    Spinner spinner_phase_count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* App_Database db =  Room.databaseBuilder(getApplicationContext(),
                App_Database.class, "amperage.db")
                .allowMainThreadQueries()
                .build();
        Type_of_environment_Dao type_of_environment_Dao =db.type_of_environment_Dao();
        Type_of_environment type_of_environment1= new Type_of_environment();
        type_of_environment1.value = "Air";
        type_of_environment_Dao.insert(type_of_environment1);
        Type_of_environment type_of_environment2= new Type_of_environment();
        type_of_environment2.value = "Earth";
        type_of_environment_Dao.insert(type_of_environment2);
        LiveData<List<Type_of_environment>> type_of_environments = type_of_environment_Dao.getAll();*/

        ArrayAdapter<String> adapter_phase_count = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, new String[]{"1", "2", "3"});
        adapter_phase_count.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_phase_count = (Spinner) findViewById(R.id.phase_count);
        spinner_phase_count.setAdapter(adapter_phase_count);
        spinner_phase_count.setSelection(0);
        EditText_power = (EditText) findViewById(R.id.EditText_power);
        EditText_voltage = (EditText) findViewById(R.id.EditText_voltage);
        EditText_cos = (EditText) findViewById(R.id.EditText_cos);
        TextView_current = (TextView) findViewById(R.id.TextView_currentCount);
        button_naytipomochnosti = (Button) findViewById(R.id.button_naytipomochnosti);
        button_naytipomochnosti.setOnClickListener(this);
        voltage = 220;
        EditText_voltage.setText(String.valueOf(voltage));
        cos = 1;
        EditText_cos.setText(String.valueOf(cos));
        EditText_power.requestFocus();

        //TextView_current.setText((int) current);


        /* Cable cable1 = new Cable();
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
        spinner_sposob_prokladki.setSelection(0);*/
    }

    @Override
    public void onClick(View v) {
        // Проверяем поля на пустоту


        if (TextUtils.isEmpty(EditText_power.getText().toString())
                || Double.parseDouble(EditText_voltage.getText().toString())<=0)  {
            return;
        }
        phase = Double.parseDouble(spinner_phase_count.getSelectedItem().toString());
        voltage = Double.parseDouble(EditText_voltage.getText().toString());
        if (phase !=1 ) {
            phase = 1.73d;
            if (TextUtils.isEmpty(EditText_voltage.getText().toString()) || voltage == 220d) {
                voltage = 380;
                EditText_voltage.setText(String.valueOf(voltage));
            }
            }
        else {
            if (TextUtils.isEmpty(EditText_voltage.getText().toString()) || voltage == 380d) {
                voltage = 220;
                EditText_voltage.setText(String.valueOf(voltage));
            }
        }

        power = Double.parseDouble(EditText_power.getText().toString());


           if (TextUtils.isEmpty(EditText_cos.getText().toString())) {
            cos = 1;
            EditText_cos.setText(String.valueOf(cos));
        }
        cos = Double.parseDouble(EditText_cos.getText().toString());
        if (cos<=0 || cos>1){
            cos =1d;
            EditText_cos.setText(String.valueOf(cos));
        }
        current = (power*1000) / (phase * voltage*cos);
        String currentformat = String.format("%.2f", current);
        TextView_current.setText(String.valueOf(currentformat));

        //phase = Integer.parseInt(spinner_phase_count.getSelectedItem().toString());
        // power = Integer.parseInt(EditText_power.getText().toString());
        //    voltage = Integer.parseInt(EditText_voltage.getText().toString());

        // String[] currentstring;

        //current =power/(phase*voltage*1000);

    }
}
/*
            phase = Integer.parseInt(spinner_phase_count.getSelectedItem().toString());
            power = Integer.parseInt(EditText_power.getText().toString());
            voltage = Integer.parseInt(EditText_voltage.getText().toString());
            current = power /(phase * voltage *1000);
            currentstring[0] = String.valueOf(current[0]);
            TextView_current.setText(currentstring[0]);
            */