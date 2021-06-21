package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Type_amperage;

import java.util.List;

@Dao
public interface Type_amperage_Dao {
    @Query("SELECT * FROM type_amperage")
    LiveData<List<Type_amperage>> getAll();

    @Insert
    void insert(Type_amperage type_amperage);

    @Update
    void update(Type_amperage type_amperage);

    @Delete
    void delete(Type_amperage type_amperage);

}
