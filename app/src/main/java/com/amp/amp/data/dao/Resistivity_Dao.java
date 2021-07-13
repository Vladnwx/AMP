package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Resistivity;

import java.util.List;

@Dao
public interface Resistivity_Dao {

    /*@Query("SELECT * FROM resistivity")
    List<String> getAll();*/

    @Query("SELECT * FROM resistivity")
    LiveData<List<Resistivity>> getAllLiveData();

    @Query("SELECT * FROM resistivity ORDER BY id ASC")
    LiveData<List<Resistivity>> getAlphabetizedAmperage_short();

    @Query("DELETE FROM resistivity")
   void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Resistivity resistivity);


    @Update
    void update(Resistivity resistivity);

    @Delete
    void delete(Resistivity resistivity);

}
