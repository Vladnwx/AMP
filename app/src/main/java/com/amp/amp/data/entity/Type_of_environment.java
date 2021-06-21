package com.amp.amp.data.entity;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Type_of_environment {
    @PrimaryKey
    @NonNull
    public String value;
}
