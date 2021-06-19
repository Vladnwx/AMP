package com.amp.amp.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Amperage_Dao {
    @Query("SELECT * FROM amperage")
    LiveData<List<Amperage>> getAll();

    @Insert
    void insert(Amperage amperage);

    @Update
    void update(Amperage amperage);

    @Delete
    void delete(Amperage amperage);

}
