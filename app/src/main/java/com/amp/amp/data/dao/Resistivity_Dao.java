package com.amp.amp.data.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.amp.amp.data.entity.Resistivity;

import java.util.List;

@Dao
public interface Resistivity_Dao {

    // @Query("SELECT * FROM resistivity")
    // List<String> getAll();

    @Query("SELECT R  FROM resistivity WHERE material_type = :tmaterial_type AND nominal_size = :tnominal_size")
    Double getR(String tmaterial_type, Double tnominal_size);

    @Query("SELECT R  FROM resistivity WHERE material_type = :tmaterial_type AND nominal_size = :tnominal_size")
    LiveData<Double> getLiveDataR(String tmaterial_type, Double tnominal_size);

    @Query("SELECT X  FROM resistivity WHERE material_type = :tmaterial_type AND nominal_size = :tnominal_size")
    Double getX(String tmaterial_type, Double tnominal_size);

    @Query("SELECT X  FROM resistivity WHERE material_type = :tmaterial_type AND nominal_size = :tnominal_size")
    LiveData<Double> getLiveDataX(String tmaterial_type, Double tnominal_size);

    @Query("SELECT * FROM resistivity")
    LiveData<List<Resistivity>> getAllLiveData();

    @Query("SELECT * FROM resistivity ORDER BY id ASC")
    LiveData<List<Resistivity>> getAlphabetizedAmperage_short();

    @Query("DELETE FROM resistivity")
    void deleteAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Resistivity resistivity);


    @Update
    void update(Resistivity resistivity);

    @Delete
    void delete(Resistivity resistivity);

    @Query("INSERT INTO resistivity (\n" +
            "                            p,\n" +
            "                            X,\n" +
            "                            R,\n" +
            "                            nominal_size,\n" +
            "                            material_type,\n" +
            "                            id\n" +
            "                        )\n" +
            "                        VALUES (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.0189,\n" +
            "                            1000,\n" +
            "                            'Cu',\n" +
            "                            1\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.023625,\n" +
            "                            800,\n" +
            "                            'Cu',\n" +
            "                            2\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.03,\n" +
            "                            630,\n" +
            "                            'Cu',\n" +
            "                            3\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.0378,\n" +
            "                            500,\n" +
            "                            'Cu',\n" +
            "                            4\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.04725,\n" +
            "                            400,\n" +
            "                            'Cu',\n" +
            "                            5\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.063,\n" +
            "                            300,\n" +
            "                            'Cu',\n" +
            "                            6\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.07875,\n" +
            "                            240,\n" +
            "                            'Cu',\n" +
            "                            7\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.10216216216216,\n" +
            "                            185,\n" +
            "                            'Cu',\n" +
            "                            8\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.126,\n" +
            "                            150,\n" +
            "                            'Cu',\n" +
            "                            9\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.1575,\n" +
            "                            120,\n" +
            "                            'Cu',\n" +
            "                            10\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.19894736842105,\n" +
            "                            95,\n" +
            "                            'Cu',\n" +
            "                            11\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.27,\n" +
            "                            70,\n" +
            "                            'Cu',\n" +
            "                            12\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.378,\n" +
            "                            50,\n" +
            "                            'Cu',\n" +
            "                            13\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.54,\n" +
            "                            35,\n" +
            "                            'Cu',\n" +
            "                            14\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            0.756,\n" +
            "                            25,\n" +
            "                            'Cu',\n" +
            "                            15\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            1.18125,\n" +
            "                            16,\n" +
            "                            'Cu',\n" +
            "                            16\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            1.89,\n" +
            "                            10,\n" +
            "                            'Cu',\n" +
            "                            17\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            3.15,\n" +
            "                            6,\n" +
            "                            'Cu',\n" +
            "                            18\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            4.725,\n" +
            "                            4,\n" +
            "                            'Cu',\n" +
            "                            19\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            7.56,\n" +
            "                            2.5,\n" +
            "                            'Cu',\n" +
            "                            20\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            12.6,\n" +
            "                            1.5,\n" +
            "                            'Cu',\n" +
            "                            21\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            25.2,\n" +
            "                            0.75,\n" +
            "                            'Cu',\n" +
            "                            22\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0189,\n" +
            "                            0.06,\n" +
            "                            37.8,\n" +
            "                            0.5,\n" +
            "                            'Cu',\n" +
            "                            23\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.0315,\n" +
            "                            1000,\n" +
            "                            'Al',\n" +
            "                            24\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.039375,\n" +
            "                            800,\n" +
            "                            'Al',\n" +
            "                            25\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.05,\n" +
            "                            630,\n" +
            "                            'Al',\n" +
            "                            26\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.063,\n" +
            "                            500,\n" +
            "                            'Al',\n" +
            "                            27\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.07875,\n" +
            "                            400,\n" +
            "                            'Al',\n" +
            "                            28\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.105,\n" +
            "                            300,\n" +
            "                            'Al',\n" +
            "                            29\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.13125,\n" +
            "                            240,\n" +
            "                            'Al',\n" +
            "                            30\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.17027027027027,\n" +
            "                            185,\n" +
            "                            'Al',\n" +
            "                            31\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.21,\n" +
            "                            150,\n" +
            "                            'Al',\n" +
            "                            32\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.2625,\n" +
            "                            120,\n" +
            "                            'Al',\n" +
            "                            33\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.33157894736842,\n" +
            "                            95,\n" +
            "                            'Al',\n" +
            "                            34\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.45,\n" +
            "                            70,\n" +
            "                            'Al',\n" +
            "                            35\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.63,\n" +
            "                            50,\n" +
            "                            'Al',\n" +
            "                            36\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            0.9,\n" +
            "                            35,\n" +
            "                            'Al',\n" +
            "                            37\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            1.26,\n" +
            "                            25,\n" +
            "                            'Al',\n" +
            "                            38\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            1.96875,\n" +
            "                            16,\n" +
            "                            'Al',\n" +
            "                            39\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            3.15,\n" +
            "                            10,\n" +
            "                            'Al',\n" +
            "                            40\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            5.25,\n" +
            "                            6,\n" +
            "                            'Al',\n" +
            "                            41\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            7.875,\n" +
            "                            4,\n" +
            "                            'Al',\n" +
            "                            42\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            12.6,\n" +
            "                            2.5,\n" +
            "                            'Al',\n" +
            "                            43\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            21,\n" +
            "                            1.5,\n" +
            "                            'Al',\n" +
            "                            44\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            42,\n" +
            "                            0.75,\n" +
            "                            'Al',\n" +
            "                            45\n" +
            "                        ),\n" +
            "                        (\n" +
            "                            0.0315,\n" +
            "                            0.06,\n" +
            "                            63,\n" +
            "                            0.5,\n" +
            "                            'Al',\n" +
            "                            46\n" +
            "                        );\n")
    void defaultgreate();

}
