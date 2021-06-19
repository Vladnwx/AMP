package com.amp.amp.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Number_of_cores_Dao {
    @Query("SELECT * FROM number_of_cores")
    LiveData<List<Number_of_cores>> getAll();

    @Insert
    void insert(Number_of_cores number_of_cores);

    @Update
    void update(Number_of_cores number_of_cores);

    @Delete
    void delete(Number_of_cores number_of_cores);

}
