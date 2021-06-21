package com.amp.amp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Amperage_short {
    @PrimaryKey
    @NonNull
    public int nominal_size;
    public String material_type;
    public String insulation_type;
    public int amperage_short;
}
