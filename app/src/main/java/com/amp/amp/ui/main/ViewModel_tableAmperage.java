package com.amp.amp.ui.main;

import android.content.Context;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.amp.amp.data.entity.Amperage;
import com.amp.amp.data.entity.Amperage_short;
import com.amp.amp.data.entity.Insulation_type;
import com.amp.amp.data.entity.Material_type;
import com.amp.amp.data.entity.Method_of_laying;
import com.amp.amp.data.entity.Nominal_size;
import com.amp.amp.data.entity.Number_of_core;
import com.amp.amp.data.entity.Resistivity;
import com.amp.amp.data.entity.Type_amperage;
import com.amp.amp.data.entity.Type_of_environment;

import java.util.List;

public class ViewModel_tableAmperage extends ViewModel {

    private Context instance;

    private LiveData<List<Type_of_environment>> AllLiveDataType_of_environments;
    private LiveData<List<Type_amperage>> AllLiveDataType_amperages;
    private LiveData<List<Method_of_laying>> AllLiveDataMethod_of_layings;
    private LiveData<List<Number_of_core>> AllLiveDataNumber_of_cores;
    private LiveData<List<Nominal_size>> AllLiveDataNominal_sizes;
    private LiveData<List<Material_type>> AllLiveDataMaterial_types;
    private LiveData<List<Insulation_type>> AllLiveDataInsulation_types;
    private LiveData<Double> LiveDataR;
    private LiveData<Double> LiveDataX;
    private LiveData<List<Resistivity>> AllLiveDataResistivitys;
    private LiveData<List<Amperage_short>> AllLiveDataAmperage_shorts;
    private LiveData<List<Amperage>> AllLiveDataAmperages;

    public TextView TextView_type_of_environment;

    public ViewModel_tableAmperage() {
       // TextView_type_of_environment.findViewById(R.id.TextView_type_of_environment);
       // TextView_type_of_environment.setText("ЭТО ВСЕ VIEW");

    }
}