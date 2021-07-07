package com.amp.amp.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.amp.amp.data.dao.Type_of_environment_Dao;
import com.amp.amp.data.entity.Type_of_environment;

@Database(entities = {
        Type_of_environment.class},
        version = 1,
        exportSchema = false)

public abstract class App_Database extends RoomDatabase {
    public abstract Type_of_environment_Dao type_of_environment_Dao();
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
