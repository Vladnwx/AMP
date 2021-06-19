package com.amp.amp.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Material_type_Dao {
    @Query("SELECT * FROM material_type")
    LiveData<List<Material_type>> getAll();

    @Insert
    void insert(Material_type material_type);

    @Update
    void update(Material_type material_type);

    @Delete
    void delete(Material_type material_type);

}
