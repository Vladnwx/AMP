package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Type_of_environment;

import java.util.List;

@Dao
public interface Type_of_environment_Dao {
    @Query("SELECT * FROM type_of_environment")
    List<String> getAll();

    @Query("SELECT * FROM type_of_environment")
    LiveData<List<Type_of_environment>> getAllLiveData();

    @Query("SELECT * FROM type_of_environment ORDER BY type_of_environment ASC")
    LiveData<List<Type_of_environment>> getAlphabetized_Type_of_environment();

    @Query("DELETE FROM type_of_environment")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Type_of_environment type_of_environment);

    @Update
    void update(Type_of_environment type_of_environment);

    @Delete
    void delete(Type_of_environment type_of_environment);
}
