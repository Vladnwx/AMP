package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.amp.amp.data.entity.Amperage;

import java.util.List;

@Dao
public interface Amperage_Dao extends BaseDao<Amperage> {

    // @Query("SELECT * FROM amperage")
    // List<String> getAll();

    @Query("SELECT * FROM amperage")
    LiveData<List<Amperage>> getAllLiveData();

    @Query("SELECT * FROM amperage ORDER BY amperage ASC")
    LiveData<List<Amperage>> getAlphabetizedAmperage();

    @Query("DELETE FROM amperage")
    void deleteAll();

   /* @Query("" )
    void defaultgreate();*/


}
