package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Material_type;

import java.util.List;

@Dao
public interface Material_type_Dao {
    @Query("SELECT * FROM material_type")
    LiveData<List<Material_type>> getAll();

  /*  @Query("SELECT * FROM material_type ORDER BY material_type ASC")
    LiveData<List<Material_type>> getAlphabetizedMaterial_type();
*/
    @Query("DELETE FROM material_type")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Material_type material_type);

    @Update
    void update(Material_type material_type);

    @Delete
    void delete(Material_type material_type);

}
