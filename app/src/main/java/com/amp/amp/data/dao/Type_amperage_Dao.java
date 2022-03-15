package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.amp.amp.data.entity.Type_amperage;

import java.util.List;

@Dao
public interface Type_amperage_Dao extends BaseDao<Type_amperage> {
    @Query("SELECT * FROM type_amperage")
    List<String> getAll();

    @Query("SELECT * FROM type_amperage")
    LiveData<List<Type_amperage>> getAllLiveData();

    @Query("SELECT * FROM type_amperage ORDER BY type_amperage ASC")
    LiveData<List<Type_amperage>> getAlphabetized_Type_amperage();

    @Query("DELETE FROM type_amperage")
    void deleteAll();


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


}
