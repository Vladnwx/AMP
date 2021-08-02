package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Method_of_laying;

import java.util.List;

@Dao
public interface Method_of_laying_Dao {
  @Query("SELECT * FROM Method_of_laying")
  List<String> getAll();

  @Query("SELECT * FROM Method_of_laying")
    LiveData<List<Method_of_laying>> getAllLiveData();

   @Query("SELECT * FROM Method_of_laying ORDER BY method_of_laying ASC")
    LiveData<List<Method_of_laying>> getAlphabetizedShort_current();

    @Query("DELETE FROM Method_of_laying")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Method_of_laying methodoflaying);

    @Query("INSERT INTO method_of_laying (\n" +
            "                                 method_of_laying\n" +
            "                             )\n" +
            "                             VALUES (\n" +
            "                                 'single laying'\n" +
            "                             ),\n" +
            "                             (\n" +
            "                                 'bundle laying'\n" +
            "                             );\n")
    void defaultgreate();

    @Update
    void update(Method_of_laying methodoflaying);

    @Delete
    void delete(Method_of_laying methodoflaying);

}
