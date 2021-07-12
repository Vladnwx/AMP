package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Nominal_size;

import java.util.List;

@Dao
public interface Nominal_size_Dao {

    @Query("SELECT * FROM nominal_size")
    List<Integer> getAll();

    @Query("SELECT * FROM nominal_size")
    LiveData<List<Nominal_size>> getAllLiveData();

    @Query("SELECT * FROM nominal_size ORDER BY nominal_size ASC")
    LiveData<List<Nominal_size>> getAlphabetizedNominal_size();

    @Query("DELETE FROM nominal_size")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Nominal_size nominal_size);

    @Update
    void update(Nominal_size nominal_size);

    @Delete
    void delete(Nominal_size nominal_size);

}
