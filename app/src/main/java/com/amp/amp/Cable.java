package com.amp.amp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Cable {
    @PrimaryKey
    public int id;
    public String [] insulation_type;
    public String [] material_type;
    public String [] nominal_size;
    public String [] number_of_cores;
    public String [] short_current;
    public String [] type_amperage;
    public String [] type_of_environment;
    public String [] sposob_prokladki;
}
