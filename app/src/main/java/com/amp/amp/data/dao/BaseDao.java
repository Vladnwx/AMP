package com.amp.amp.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SimpleSQLiteQuery;

import java.util.List;

@Dao
public interface BaseDao<T> {

    String d_const = "DELETE FROM ";
    //String D = d_const + T.;
    String s1_const = "SELECT * FROM ";
    String s2_const = "ORDER BY ";
    String i1_const = "INSERT INTO ";
    String i2_const = "VALUES ";

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(T entity);
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(List<T> entity);
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Iterable<T> entitys);
    @Update
    void update(T entity);
    @Update
    void update(List<T> entity);
    @Delete
    void delete(T entity);
    @Delete
    void delete(List<T> entity);
    @Delete
    void delete(T... entitys);



    @RawQuery
    T deleteAll1(SimpleSQLiteQuery query);
    @RawQuery
    List<String> getAll(SimpleSQLiteQuery query);
   // @RawQuery (observedEntities = )
   // LiveData<List<T>> getAllLiveData(SimpleSQLiteQuery query);
  //  @RawQuery
   // LiveData<List<T>> getAllAlphabetized(SimpleSQLiteQuery query);

}