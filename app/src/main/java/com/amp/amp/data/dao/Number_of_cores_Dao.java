package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Number_of_core;

import java.util.List;

@Dao
public interface Number_of_cores_Dao {
    @Query("SELECT * FROM Number_of_core")
    LiveData<List<Number_of_core>> getAll();

    @Insert
    void insert(Number_of_core number_of_core);

    @Update
    void update(Number_of_core number_of_core);

    @Delete
    void delete(Number_of_core number_of_core);

}
