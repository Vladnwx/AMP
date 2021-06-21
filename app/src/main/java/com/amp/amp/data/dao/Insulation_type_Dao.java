package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Insulation_type;

import java.util.List;

@Dao
public interface Insulation_type_Dao {
    @Query("SELECT * FROM insulation_type")
    LiveData<List<Insulation_type>> getAll();

    @Insert
    void insert(Insulation_type insulation_type);

    @Update
    void update(Insulation_type insulation_type);

    @Delete
    void delete(Insulation_type insulation_type);

}
