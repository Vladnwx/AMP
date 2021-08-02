package com.amp.amp.data;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.amp.amp.data.dao.Amperage_Dao;
import com.amp.amp.data.dao.Amperage_short_Dao;
import com.amp.amp.data.dao.Insulation_type_Dao;
import com.amp.amp.data.dao.Material_type_Dao;
import com.amp.amp.data.dao.Method_of_laying_Dao;
import com.amp.amp.data.dao.Nominal_size_Dao;
import com.amp.amp.data.dao.Number_of_core_Dao;
import com.amp.amp.data.dao.Resistivity_Dao;
import com.amp.amp.data.dao.Type_amperage_Dao;
import com.amp.amp.data.dao.Type_of_environment_Dao;
import com.amp.amp.data.entity.Amperage;
import com.amp.amp.data.entity.Amperage_short;
import com.amp.amp.data.entity.Insulation_type;
import com.amp.amp.data.entity.Material_type;
import com.amp.amp.data.entity.Method_of_laying;
import com.amp.amp.data.entity.Nominal_size;
import com.amp.amp.data.entity.Number_of_core;
import com.amp.amp.data.entity.Resistivity;
import com.amp.amp.data.entity.Type_amperage;
import com.amp.amp.data.entity.Type_of_environment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {
        Type_of_environment.class,
        Type_amperage.class,
        Method_of_laying.class,
        Number_of_core.class,
        Nominal_size.class,
        Material_type.class,
        Insulation_type.class,
        Amperage_short.class,
        Amperage.class,
        Resistivity.class},
        version = 1,
        exportSchema = false)

public abstract class App_Database extends RoomDatabase {
    public abstract Type_of_environment_Dao type_of_environment_Dao();
    public abstract Type_amperage_Dao type_amperage_Dao();
    public abstract Method_of_laying_Dao method_of_laying_Dao();
    public abstract Number_of_core_Dao number_of_core_Dao();
    public abstract Nominal_size_Dao nominal_size_Dao();
    public abstract Material_type_Dao material_type_Dao();
    public abstract Insulation_type_Dao insulation_type_Dao();
    public abstract Amperage_short_Dao amperage_short_Dao();
    public abstract Amperage_Dao amperage_Dao();
    private static final RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                Type_of_environment_Dao type_of_environment_dao = INSTANCE.type_of_environment_Dao();
                Type_amperage_Dao type_amperage_Dao = INSTANCE.type_amperage_Dao();
                Method_of_laying_Dao method_of_laying_Dao = INSTANCE.method_of_laying_Dao();
                Number_of_core_Dao number_of_core_Dao = INSTANCE.number_of_core_Dao();
                Nominal_size_Dao nominal_size_Dao = INSTANCE.nominal_size_Dao();
                Material_type_Dao material_type_Dao = INSTANCE.material_type_Dao();
                Insulation_type_Dao insulation_type_Dao = INSTANCE.insulation_type_Dao();
                Amperage_short_Dao amperage_short_Dao = INSTANCE.amperage_short_Dao();
                Amperage_Dao amperage_Dao = INSTANCE.amperage_Dao();
                Resistivity_Dao resistivity_dao = INSTANCE.resistivity_Dao();

                type_of_environment_dao.deleteAll();
                type_amperage_Dao.deleteAll();
                method_of_laying_Dao.deleteAll();
                number_of_core_Dao.deleteAll();
                nominal_size_Dao.deleteAll();
                material_type_Dao.deleteAll();
                insulation_type_Dao.deleteAll();
                amperage_short_Dao.deleteAll();
                amperage_Dao.deleteAll();
                resistivity_dao.deleteAll();

                type_of_environment_dao.defaultgreate();
                type_amperage_Dao.defaultgreate();
                method_of_laying_Dao.defaultgreate();
                number_of_core_Dao.defaultgreate();
                nominal_size_Dao.defaultgreate();
                material_type_Dao.defaultgreate();
                insulation_type_Dao.defaultgreate();
                resistivity_dao.defaultgreate();
                amperage_short_Dao.defaultgreate();
                //amperage_Dao.defaultgreate();



               /* Type_of_environment type_of_environment = new Type_of_environment("Air");

                type_of_environment_dao.insert(type_of_environment);

                type_of_environment = new Type_of_environment("Eart");

                type_of_environment_dao.insert(type_of_environment);*/
            });
        }
    };


    private static volatile App_Database INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static App_Database getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (App_Database.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            App_Database.class, "amperage")
                            .allowMainThreadQueries()
                            .addCallback(sRoomDatabaseCallback)
                            //  .createFromAsset("amperage.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    public abstract Resistivity_Dao resistivity_Dao();
}
