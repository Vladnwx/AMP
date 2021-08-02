package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Amperage;

import java.util.List;

@Dao
public interface Amperage_Dao {

        /*@Query("SELECT * FROM amperage")
    List<String> getAll();*/

    @Query("SELECT * FROM amperage")
    LiveData<List<Amperage>> getAllLiveData();

    @Query("SELECT * FROM amperage ORDER BY amperage ASC")
    LiveData<List<Amperage>> getAlphabetizedAmperage();

    @Query("DELETE FROM amperage")
    void deleteAll();

    @Insert (onConflict = OnConflictStrategy.IGNORE)
    void insert(Amperage amperage);

    @Update
    void update(Amperage amperage);

    @Delete
    void delete(Amperage amperage);

   /* @Query("" )
    void defaultgreate();*/


}
