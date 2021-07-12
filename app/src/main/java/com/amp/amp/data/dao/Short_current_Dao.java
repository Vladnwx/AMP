package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Short_current;

import java.util.List;

@Dao
public interface Short_current_Dao {
  @Query("SELECT * FROM short_current")
  List<String> getAll();

  @Query("SELECT * FROM short_current")
    LiveData<List<Short_current>> getAllLiveData();

   @Query("SELECT * FROM short_current ORDER BY short_current ASC")
    LiveData<List<Short_current>> getAlphabetizedShort_current();

    @Query("DELETE FROM short_current")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Short_current short_current);

    @Update
    void update(Short_current short_current);

    @Delete
    void delete(Short_current short_current);

}
