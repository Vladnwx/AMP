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
    List<Double> getAll();

    @Query("SELECT * FROM nominal_size")
    LiveData<List<Nominal_size>> getAllLiveData();

    @Query("SELECT * FROM nominal_size ORDER BY nominal_size ASC")
    LiveData<List<Nominal_size>> getAlphabetizedNominal_size();

    @Query("DELETE FROM nominal_size")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Nominal_size nominal_size);

    @Query("INSERT INTO nominal_size (\n" +
            "                             nominal_size\n" +
            "                         )\n" +
            "                         VALUES (\n" +
            "                             1000\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             800\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             630\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             500\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             400\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             300\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             240\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             185\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             150\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             120\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             95\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             70\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             50\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             35\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             25\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             16\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             10\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             6\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             4\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             2.5\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             1.5\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             0.75\n" +
            "                         ),\n" +
            "                         (\n" +
            "                             0.5\n" +
            "                         );\n")
    void defaultgreate();

    @Update
    void update(Nominal_size nominal_size);

    @Delete
    void delete(Nominal_size nominal_size);

}
