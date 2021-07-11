package com.amp.amp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Insulation_type {
    @PrimaryKey
    @NonNull
    private String value;
    public Insulation_type(@NonNull String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public void setValue(@NonNull String value) {
        this.value = value;
    }
}
