package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.amp.amp.data.entity.Insulation_type;

import java.util.List;

@Dao
public interface Insulation_type_Dao extends BaseDao<Insulation_type> {
    @Query("SELECT * FROM insulation_type")
    List<String> getAll();

    @Query("SELECT * FROM insulation_type")
    LiveData<List<Insulation_type>> getAllLiveData();

    @Query("SELECT * FROM insulation_type ORDER BY insulation_type ASC")
    LiveData<List<Insulation_type>> getAlphabetizedInsulation_type();

    @Query("DELETE FROM insulation_type")
    void deleteAll();

    @Query("INSERT INTO insulation_type (\n" +
            "                                insulation_type\n" +
            "                            )\n" +
            "                            VALUES (\n" +
            "                                'PEX'\n" +
            "                            ),\n" +
            "                            (\n" +
            "                                'PVC'\n" +
            "                            );")
    void defaultgreate();


}
