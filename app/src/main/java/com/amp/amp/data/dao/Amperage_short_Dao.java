package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Amperage_short;

import java.util.List;

@Dao
public interface Amperage_short_Dao {
    @Query("SELECT * FROM amperage_short")
    LiveData<List<Amperage_short>> getAll();

    @Query("SELECT * FROM amperage_short ORDER BY amperage_short ASC")
    LiveData<List<Amperage_short>> getAlphabetizedAmperage_short();

    @Query("DELETE FROM amperage_short")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Amperage_short amperage_short);

    @Update
    void update(Amperage_short amperage_short);

    @Delete
    void delete(Amperage_short amperage_short);

}
