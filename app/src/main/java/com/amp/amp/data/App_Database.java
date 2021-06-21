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
import com.amp.amp.data.dao.Nominal_size_Dao;
import com.amp.amp.data.dao.Number_of_cores_Dao;
import com.amp.amp.data.dao.Short_current_Dao;
import com.amp.amp.data.dao.Type_amperage_Dao;
import com.amp.amp.data.dao.Type_of_environment_Dao;
import com.amp.amp.data.entity.Amperage;
import com.amp.amp.data.entity.Amperage_short;
import com.amp.amp.data.entity.Insulation_type;
import com.amp.amp.data.entity.Material_type;
import com.amp.amp.data.entity.Nominal_size;
import com.amp.amp.data.entity.Number_of_core;
import com.amp.amp.data.entity.Short_current;
import com.amp.amp.data.entity.Type_amperage;
import com.amp.amp.data.entity.Type_of_environment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {
        Type_of_environment.class,
        Type_amperage.class,
        Short_current.class,
        Number_of_core.class,
        Nominal_size.class,
        Material_type.class,
        Insulation_type.class,
        Amperage_short.class,
        Amperage.class
}, version = 1, exportSchema = false)
public abstract class App_Database extends RoomDatabase {
    abstract Type_of_environment_Dao type_of_environment_Dao();
    abstract Type_amperage_Dao type_amperage_Dao();
    abstract Short_current_Dao short_current_Dao();
    abstract Number_of_cores_Dao number_of_cores_Dao();
    abstract Nominal_size_Dao nominal_size_Dao();
    abstract Material_type_Dao material_type_Dao();
    abstract Insulation_type_Dao insulation_type_Dao();
    abstract Amperage_short_Dao amperage_short_Dao();
    abstract Amperage_Dao amperage_Dao();

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
                            .createFromAsset("amperage.db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
    /**
     * Override the onCreate method to populate the database.
     * For this sample, we clear the database every time it is created.
     */
    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more words, just add them.
                Type_of_environment_Dao dao1 = INSTANCE.type_of_environment_Dao();
                dao1.deleteAll();
                Type_amperage_Dao dao2 = INSTANCE.type_amperage_Dao();
                dao2.deleteAll();
                Short_current_Dao dao3 = INSTANCE.short_current_Dao();
                dao3.deleteAll();
                Number_of_cores_Dao dao4 = INSTANCE.number_of_cores_Dao();
                dao4.deleteAll();
                Nominal_size_Dao dao5 = INSTANCE.nominal_size_Dao();
                dao5.deleteAll();
                Material_type_Dao dao6 = INSTANCE.material_type_Dao();
                dao6.deleteAll();
                Insulation_type_Dao dao7 = INSTANCE.insulation_type_Dao();
                dao7.deleteAll();
                Amperage_short_Dao dao8 = INSTANCE.amperage_short_Dao();
                dao8.deleteAll();
                Amperage_Dao dao9 = INSTANCE.amperage_Dao();
                dao9.deleteAll();

                Type_of_environment type_of_environment = new Type_of_environment("Air");
                dao1.insert(type_of_environment);
                type_of_environment = new Type_of_environment("Earth");
                dao1.insert(type_of_environment);

            });
        }
    };
}
