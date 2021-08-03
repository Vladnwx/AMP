package com.amp.amp.ui.main;

import android.content.Context;

import androidx.lifecycle.ViewModel;

import com.amp.amp.data.App;

import java.util.List;

public class MainViewModel extends ViewModel {

    private Context instance;

    private List<String> type_of_environments = App.getInstance().getType_of_environment_Dao().getAll();
    //  private List<String> type_of_environments = App.getInstance().getAllType_of_environments();
    private List<String> type_amperages = App.getInstance().getType_amperage_Dao().getAll();
    private List<String> number_of_cores = App.getInstance().getNumber_of_cores_Dao().getAll();
    private List<String> material_types = App.getInstance().getMaterial_type_Dao().getAll();
    private List<String> insulation_types = App.getInstance().getInsulation_type_Dao().getAll();
    private List<String> method_of_layings = App.getInstance().getMethod_of_laying_Dao().getAll();
    private List<Double> nominal_sizes = App.getInstance().getNominal_size_Dao().getAll();
    private Double R;
    private Double X;
    private int amperage_short;
    private int amperage;


    public List<String> getType_of_environments() {
        return type_of_environments;
    }

    public List<String> getType_amperages() {
        return type_amperages;
    }

    public List<String> getNumber_of_cores() {
        return number_of_cores;
    }

    public List<String> getMaterial_types() {
        return material_types;
    }

    public List<String> getInsulation_types() {
        return insulation_types;
    }

    public List<String> getMethod_of_layings() {
        return method_of_layings;
    }

    public List<Double> getNominal_sizes() {
        return nominal_sizes;
    }

    public Double getR() {
        return R;
    }

    public void setR(Double r) {
        R = r;
    }

    public Double getX() {
        return X;
    }

    public void setX(Double x) {
        X = x;
    }

    public int getAmperage_short() {
        return amperage_short;
    }

    public void setAmperage_short(int amperage_short) {
        this.amperage_short = amperage_short;
    }

    public int getAmperage() {
        return amperage;
    }

    public void setAmperage(int amperage) {
        this.amperage = amperage;
    }
}