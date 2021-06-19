package com.amp.amp.data;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Number_of_cores {
    @PrimaryKey
    @NonNull
    public String value;
}
