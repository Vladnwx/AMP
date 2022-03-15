package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.amp.amp.data.entity.Material_type;

import java.util.List;

@Dao
public interface Material_type_Dao extends BaseDao<Material_type> {
  @Query("SELECT * FROM material_type")
  List<String> getAll();

    @Query("SELECT * FROM material_type")
    LiveData<List<Material_type>> getAllLiveData();

    @Query("SELECT * FROM material_type ORDER BY material_type ASC")
    LiveData<List<Material_type>> getAlphabetizedMaterial_type();

    @Query("DELETE FROM material_type")
    void deleteAll();

  @Query("INSERT INTO material_type (\n" +
          "                              material_type\n" +
          "                          )\n" +
          "                          VALUES (\n" +
          "                              'Cu'\n" +
          "                          ),\n" +
          "                          (\n" +
          "                              'Al'\n" +
          "                          );")
  void defaultgreate();


}
