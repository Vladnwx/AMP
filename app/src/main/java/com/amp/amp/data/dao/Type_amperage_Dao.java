package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Type_amperage;

import java.util.List;

@Dao
public interface Type_amperage_Dao {
    @Query("SELECT * FROM type_amperage")
    List<String> getAll();

    @Query("SELECT * FROM type_amperage")
    LiveData<List<Type_amperage>> getAllLiveData();

    @Query("SELECT * FROM type_amperage ORDER BY type_amperage ASC")
    LiveData<List<Type_amperage>> getAlphabetized_Type_amperage();

    @Query("DELETE FROM type_amperage")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Type_amperage type_amperage);

    @Query("INSERT INTO type_amperage (\n" +
            "                              type_amperage\n" +
            "                          )\n" +
            "                          VALUES (\n" +
            "                              'AC'\n" +
            "                          ),\n" +
            "                          (\n" +
            "                              'DC'\n" +
            "                          );")
    void defaultgreate();

    @Update
    void update(Type_amperage type_amperage);

    @Delete
    void delete(Type_amperage type_amperage);

}
