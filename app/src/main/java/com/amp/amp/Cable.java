package com.amp.amp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Cable {
    @PrimaryKey
    protected int id;
    protected String insulation_type;
    protected String material_type;
    protected String nominal_size;
    protected String number_of_cores;
    protected String short_current;
    protected String type_amperage;
    protected String type_of_environment;
}
