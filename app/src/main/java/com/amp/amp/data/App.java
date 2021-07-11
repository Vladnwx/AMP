package com.amp.amp.data;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.amp.amp.data.dao.Type_of_environment_Dao;
import com.amp.amp.data.entity.Type_of_environment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App extends Application {

    private App_Database database;
    private Type_of_environment_Dao type_of_environment_Dao;

    private static App instanse;

    private static volatile App_Database INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);


    public static App getInstance() {
        return instanse;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instanse = this;

        database = Room.databaseBuilder(getApplicationContext(),
                App_Database.class, "amperage")
                .allowMainThreadQueries()
                .addCallback(sRoomDatabaseCallback)
               //.createFromAsset("amperage.db")
                .build();

        type_of_environment_Dao = database.type_of_environment_Dao();
       /* Type_of_environment type_of_environment = new Type_of_environment("Air");
        type_of_environment_Dao.insert(type_of_environment);
        type_of_environment = new Type_of_environment("Earth");
        type_of_environment_Dao.insert(type_of_environment);*/
            }

    public Type_of_environment_Dao getType_of_environment_Dao() {
        return type_of_environment_Dao;
    }

    public void setType_of_environment_Dao(Type_of_environment_Dao type_of_environment_Dao) {
        this.type_of_environment_Dao = type_of_environment_Dao;
    }
    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                Type_of_environment_Dao dao = INSTANCE.type_of_environment_Dao();
                dao.deleteAll();
                Type_of_environment type_of_environment = new Type_of_environment("Air");
                dao.insert(type_of_environment);
                type_of_environment = new Type_of_environment("Earth");
                dao.insert(type_of_environment);

            });
        }
    };

}
