package com.amp.amp.data;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Nominal_size {
    @PrimaryKey
    @NonNull
    public int value;
}
