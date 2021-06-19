package com.amp.amp.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {
        Type_of_environment.class,
        Type_amperage.class,
        Short_current.class,
        Number_of_cores.class,
        Nominal_size.class,
        Material_type.class,
        Insulation_type.class,
        Amperage_short.class,
        Amperage.class
}, version = 1, exportSchema = false)
public abstract class App_Database extends RoomDatabase {
    public abstract Type_of_environment_Dao type_of_environment_Dao();
    public abstract Type_amperage_Dao type_amperage_Dao();
    public abstract Short_current_Dao short_current_Dao();
    public abstract Number_of_cores_Dao number_of_cores_Dao();
    public abstract Nominal_size_Dao nominal_size_Dao();
    public abstract Material_type_Dao material_type_Dao();
    public abstract Insulation_type_Dao insulation_type_Dao();
    public abstract Amperage_short_Dao amperage_short_Dao();
    public abstract Amperage_Dao amperage_Dao();

    private static volatile App_Database INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static App_Database getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (App_Database.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            App_Database.class, "amperage.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
