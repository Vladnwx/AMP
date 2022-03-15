package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.amp.amp.data.entity.Method_of_laying;

import java.util.List;

@Dao
public interface Method_of_laying_Dao extends BaseDao<Method_of_laying> {
  @Query("SELECT * FROM Method_of_laying")
  List<String> getAll();

  @Query("SELECT * FROM Method_of_laying")
    LiveData<List<Method_of_laying>> getAllLiveData();

   @Query("SELECT * FROM Method_of_laying ORDER BY method_of_laying ASC")
    LiveData<List<Method_of_laying>> getAlphabetizedShort_current();

    @Query("DELETE FROM Method_of_laying")
    void deleteAll();
    @Query("INSERT INTO method_of_laying (\n" +
            "                                 method_of_laying\n" +
            "                             )\n" +
            "                             VALUES (\n" +
            "                                 'single'\n" +
            "                             ),\n" +
            "                             (\n" +
            "                                 'bundle'\n" +
            "                             );\n")
    void defaultgreate();

}
