package com.amp.amp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Type_amperage {
    @PrimaryKey
    @NonNull
    private String value;

    public Type_amperage(@NonNull String value) {
        this.value = value;
    }
    @NonNull
    public String getValue() {
        return value;
    }
    public void setValue(@NonNull String value) {
        this.value = value;
    }
}
