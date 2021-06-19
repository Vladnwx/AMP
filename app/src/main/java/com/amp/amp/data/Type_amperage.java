package com.amp.amp.data;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Type_amperage {
    @PrimaryKey
    @NonNull
    public String value;
}
