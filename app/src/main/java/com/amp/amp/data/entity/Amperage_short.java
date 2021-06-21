package com.amp.amp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Amperage_short {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int id;
    private int nominal_size;
    private String material_type;
    private String insulation_type;
    private int amperage_short;

    public Amperage_short(int id, int nominal_size, String material_type, String insulation_type, int amperage_short) {
        this.id = id;
        this.nominal_size = nominal_size;
        this.material_type = material_type;
        this.insulation_type = insulation_type;
        this.amperage_short = amperage_short;
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

    public int getAmperage_short() {
        return amperage_short;
    }

    public void setAmperage_short(int amperage_short) {
        this.amperage_short = amperage_short;
    }
}
