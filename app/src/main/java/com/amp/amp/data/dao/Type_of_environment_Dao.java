package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.amp.amp.data.entity.Type_of_environment;

import java.util.List;

@Dao
public interface Type_of_environment_Dao extends BaseDao<Type_of_environment> {
    @Query("SELECT * FROM type_of_environment")
    List<String> getAll();

    @Query("SELECT * FROM type_of_environment")
    LiveData<List<Type_of_environment>> getAllLiveData();

    @Query("SELECT * FROM type_of_environment ORDER BY type_of_environment ASC")
    LiveData<List<Type_of_environment>> getAlphabetized_Type_of_environment();

    @Query("DELETE FROM type_of_environment")
    void deleteAll();

    // @Query("DELETE FROM Type_of_environment.class.")
   //  void deleteAll4(Type_of_environment type_of_environment);

   // @Insert(onConflict = OnConflictStrategy.IGNORE)
   // void insert(Type_of_environment type_of_environment);

    @Query("INSERT INTO type_of_environment (\n" +
            "                                    type_of_environment\n" +
            "                                )\n" +
            "                                VALUES (\n" +
            "                                    'earth'\n" +
            "                                ),\n" +
            "                                (\n" +
            "                                    'air'\n" +
            "                                );")
    void defaultgreate();

  /*  @Query("INSERT INTO type_of_environment (\n" +
            "                                    type_of_environment\n" +
            "                                )\n" +
            "                                VALUES (\n" +
            "                                    'earth'\n" +
            "                                ),\n" +
            "                                (\n" +
            "                                    'air'\n" +
            "                                );")
    void defaultgreate();*/

  //  @Update
  //  void update(Type_of_environment type_of_environment);

  //  @Delete
  //  void delete(Type_of_environment type_of_environment);


}

