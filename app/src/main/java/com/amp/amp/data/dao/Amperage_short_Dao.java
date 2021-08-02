package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Amperage_short;

import java.util.List;

@Dao
public interface Amperage_short_Dao {

    // @Query("SELECT * FROM amperage_short")
    // List<String> getAll();

    @Query("SELECT * FROM amperage_short")
    LiveData<List<Amperage_short>> getAllLiveData();

    @Query("SELECT * FROM amperage_short ORDER BY amperage_short ASC")
    LiveData<List<Amperage_short>> getAlphabetizedAmperage_short();

    @Query("DELETE FROM amperage_short")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Amperage_short amperage_short);

    @Query("INSERT INTO amperage_short (\n" +
            "                               amperage_short,\n" +
            "                               insulation_type,\n" +
            "                               material_type,\n" +
            "                               nominal_size\n" +
            "                           )\n" +
            "                           VALUES (\n" +
            "                               0.17,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               1.5\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.27,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               2.5\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.43,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               4\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.65,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               6\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               1.09,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               10\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               1.74,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               16\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               2.78,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               25\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               3.86,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               35\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               5.23,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               50\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               7.54,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               70\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               10.48,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               95\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               13.21,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               120\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               16.3,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               150\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               20.39,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               185\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               26.8,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               240\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               33.49,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               300\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               39.6,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               400\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               49.5,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               500\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               62.37,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               630\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               7920,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               800\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               99,\n" +
            "                               'pvc',\n" +
            "                               'Cu',\n" +
            "                               1000\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               1.5\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.18,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               2.5\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.29,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               4\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.42,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               6\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.7,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               10\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               1.13,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               16\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               1.81,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               25\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               2.5,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               35\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               3.38,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               50\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               4.95,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               70\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               6.86,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               95\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               8.66,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               120\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               10.64,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               150\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               13.37,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               185\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               17.54,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               240\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               21.9,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               300\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               26,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               400\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               32.5,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               500\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               40.95,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               630\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               52,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               800\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               65,\n" +
            "                               'pvc',\n" +
            "                               'Al',\n" +
            "                               1000\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.21,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               1.5\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.34,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               2.5\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.54,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               4\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.81,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               6\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               1.36,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               10\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               2.16,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               16\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               3.46,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               25\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               4.8,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               35\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               6.5,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               50\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               9.38,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               70\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               13.03,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               95\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               16.43,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               120\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               20.26,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               150\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               25.35,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               185\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               33.32,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               240\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               41.64,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               300\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               55.2,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               400\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               69,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               500\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               86.95,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               630\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               110.4,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               800\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               138,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Cu',\n" +
            "                               1000\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               1.5\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.22,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               2.5\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.36,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               4\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.52,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               6\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               0.87,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               10\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               1.4,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               16\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               2.24,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               25\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               3.09,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               35\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               4.18,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               50\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               6.12,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               70\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               8.48,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               95\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               10.71,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               120\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               13.16,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               150\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               16.53,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               185\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               21.7,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               240\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               27.12,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               300\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               36.16,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               400\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               45.2,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               500\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               56.95,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               630\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               72.33,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               800\n" +
            "                           ),\n" +
            "                           (\n" +
            "                               90.4,\n" +
            "                               'cross-linked polyethylene',\n" +
            "                               'Al',\n" +
            "                               1000\n" +
            "                           );")
    void defaultgreate();

    @Update
    void update(Amperage_short amperage_short);

    @Delete
    void delete(Amperage_short amperage_short);

}
