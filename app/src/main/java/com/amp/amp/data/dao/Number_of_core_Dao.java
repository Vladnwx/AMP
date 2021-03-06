package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.amp.amp.data.entity.Number_of_core;

import java.util.List;

@Dao
public interface Number_of_core_Dao extends BaseDao<Number_of_core> {
  @Query("SELECT * FROM Number_of_core")
  List<String> getAll();

  @Query("SELECT * FROM Number_of_core")
    LiveData<List<Number_of_core>> getAllLiveData();

    @Query("SELECT * FROM Number_of_core ORDER BY Number_of_core ASC")
    LiveData<List<Number_of_core>> getAlphabetizedNumber_of_core();

    @Query("DELETE FROM Number_of_core")
    void deleteAll();

  @Query("INSERT INTO number_of_core (\n" +
          "                                number_of_core\n" +
          "                            )\n" +
          "                            VALUES (\n" +
          "                                'single'\n" +
          "                            ),\n" +
          "                            (\n" +
          "                                'multicore5'\n" +
          "                            ),\n" +
          "                            (\n" +
          "                                'multicore3'\n" +
          "                            );")
  void defaultgreate();


}
