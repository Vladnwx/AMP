package com.amp.amp.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.amp.amp.R;
import com.amp.amp.data.App;


public class Fragment_easyAmperage extends Fragment {

    Double phase;
    Double power;
    Double voltage;
    Double current;
    Double cos;
    Button button_naytipomochnosti;
    EditText EditText_power;
    EditText EditText_voltage;
    EditText EditText_cos;
    TextView TextView_current;
    Spinner spinner_phase_count;
    public static Fragment_easyAmperage newInstance() {
        return new Fragment_easyAmperage();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.main_fragment, container, false);
        ArrayAdapter<String> adapter_phase_count = new ArrayAdapter<String>(App.getInstance(), android.R.layout.simple_spinner_item, new String[]{"1", "2", "3"});
        adapter_phase_count.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_phase_count = (Spinner) view.findViewById(R.id.phase_count);
        spinner_phase_count.setAdapter(adapter_phase_count);
        spinner_phase_count.setSelection(0);
        EditText_power = (EditText) view.findViewById(R.id.EditText_power);
        EditText_voltage = (EditText) view.findViewById(R.id.EditText_voltage);
        EditText_cos = (EditText) view.findViewById(R.id.EditText_cos);
        TextView_current = (TextView) view.findViewById(R.id.TextView_currentCount);
        button_naytipomochnosti = (Button) view.findViewById(R.id.button_naytipomochnosti);
        voltage = 220D;
        EditText_voltage.setText(String.valueOf(voltage));
        cos = 1D;
        EditText_cos.setText(String.valueOf(cos));
        EditText_power.requestFocus();
        return view;
    }

}