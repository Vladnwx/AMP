package com.amp.amp.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.amp.amp.data.dao.Amperage_Dao;
import com.amp.amp.data.dao.Amperage_short_Dao;
import com.amp.amp.data.dao.Insulation_type_Dao;
import com.amp.amp.data.dao.Material_type_Dao;
import com.amp.amp.data.dao.Method_of_laying_Dao;
import com.amp.amp.data.dao.Nominal_size_Dao;
import com.amp.amp.data.dao.Number_of_cores_Dao;
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
    public abstract Number_of_cores_Dao number_of_core_Dao();
    public abstract Nominal_size_Dao nominal_size_Dao();
    public abstract Material_type_Dao material_type_Dao();
    public abstract Insulation_type_Dao insulation_type_Dao();
    public abstract Amperage_short_Dao amperage_short_Dao();
    public abstract Amperage_Dao amperage_Dao();
    public abstract Resistivity_Dao resistivity_dao();



/*
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
                            .addCallback(sRoomDatabaseCallback)
                          //  .createFromAsset("amperage.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }*/


  /*  private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                Type_of_environment_Dao dao1 = INSTANCE.type_of_environment_Dao();
                dao1.deleteAll();
                Type_of_environment type_of_environment = new Type_of_environment("Air");
                dao1.insert(type_of_environment);
                type_of_environment = new Type_of_environment("Earth");
                dao1.insert(type_of_environment);

            });
        }
    };*/
}
