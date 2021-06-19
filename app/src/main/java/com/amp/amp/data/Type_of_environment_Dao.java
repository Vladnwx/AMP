package com.amp.amp.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface Type_of_environment_Dao {
    @Query("SELECT * FROM type_of_environment")
    LiveData<List<Type_of_environment>> getAll();

    @Insert
    void insert(Type_of_environment type_of_environment);

    @Update
    void update(Type_of_environment type_of_environment);

    @Delete
    void delete(Type_of_environment type_of_environment);

}
