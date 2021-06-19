package com.amp.amp.data;

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


}
