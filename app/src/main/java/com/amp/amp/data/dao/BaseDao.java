package com.amp.amp.data.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

public interface BaseDao<T> {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(T entity);
    @Update
    void update(T entity);
    @Delete
    void delete(T entity);






}
