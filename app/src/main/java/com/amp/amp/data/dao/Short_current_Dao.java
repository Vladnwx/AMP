package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Short_current;

import java.util.List;

@Dao
public interface Short_current_Dao {
    @Query("SELECT * FROM short_current")
    LiveData<List<Short_current>> getAll();

    @Insert
    void insert(Short_current short_current);

    @Update
    void update(Short_current short_current);

    @Delete
    void delete(Short_current short_current);

}
