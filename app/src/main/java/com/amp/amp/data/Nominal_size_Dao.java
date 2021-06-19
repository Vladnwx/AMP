package com.amp.amp.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Nominal_size_Dao {
    @Query("SELECT * FROM nominal_size")
    LiveData<List<Nominal_size>> getAll();

    @Insert
    void insert(Nominal_size nominal_size);

    @Update
    void update(Nominal_size nominal_size);

    @Delete
    void delete(Nominal_size nominal_size);

}
