package com.amp.amp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Amperage {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    public int id;
    public int nominal_size;
    public String material_type;
    public String insulation_type;
    public String type_amperage;
    public String number_of_cores;
    public String type_of_environment;
    public int amperage;

    public Amperage(int id, int nominal_size, String material_type, String insulation_type, String type_amperage, String number_of_cores, String type_of_environment, int amperage) {
        this.id = id;
        this.nominal_size = nominal_size;
        this.material_type = material_type;
        this.insulation_type = insulation_type;
        this.type_amperage = type_amperage;
        this.number_of_cores = number_of_cores;
        this.type_of_environment = type_of_environment;
        this.amperage = amperage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNominal_size() {
        return nominal_size;
    }

    public void setNominal_size(int nominal_size) {
        this.nominal_size = nominal_size;
    }

    public String getMaterial_type() {
        return material_type;
    }

    public void setMaterial_type(String material_type) {
        this.material_type = material_type;
    }

    public String getInsulation_type() {
        return insulation_type;
    }

    public void setInsulation_type(String insulation_type) {
        this.insulation_type = insulation_type;
    }

    public String getType_amperage() {
        return type_amperage;
    }

    public void setType_amperage(String type_amperage) {
        this.type_amperage = type_amperage;
    }

    public String getNumber_of_cores() {
        return number_of_cores;
    }

    public void setNumber_of_cores(String number_of_cores) {
        this.number_of_cores = number_of_cores;
    }

    public String getType_of_environment() {
        return type_of_environment;
    }

    public void setType_of_environment(String type_of_environment) {
        this.type_of_environment = type_of_environment;
    }

    public int getAmperage() {
        return amperage;
    }

    public void setAmperage(int amperage) {
        this.amperage = amperage;
    }

    @NonNull
    public String getValue() {
        return String.valueOf(amperage);
    }
}
