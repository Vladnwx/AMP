package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Insulation_type;

import java.util.List;

@Dao
public interface Insulation_type_Dao {
    @Query("SELECT * FROM insulation_type")
    List<String> getAll();

    @Query("SELECT * FROM insulation_type")
    LiveData<List<Insulation_type>> getAllLiveData();

    @Query("SELECT * FROM insulation_type ORDER BY insulation_type ASC")
    LiveData<List<Insulation_type>> getAlphabetizedInsulation_type();

    @Query("DELETE FROM insulation_type")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Insulation_type insulation_type);

    @Query("INSERT INTO insulation_type (\n" +
            "                                insulation_type\n" +
            "                            )\n" +
            "                            VALUES (\n" +
            "                                'cross-linked polyethylene'\n" +
            "                            ),\n" +
            "                            (\n" +
            "                                'pvc'\n" +
            "                            );")
    void defaultgreate();

    @Update
    void update(Insulation_type insulation_type);

    @Delete
    void delete(Insulation_type insulation_type);

}
