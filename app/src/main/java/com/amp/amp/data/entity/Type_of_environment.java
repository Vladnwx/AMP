package com.amp.amp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Type_of_environment {
    @PrimaryKey
    @NonNull
    private String value;
    public Type_of_environment(@NonNull String value) {
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
