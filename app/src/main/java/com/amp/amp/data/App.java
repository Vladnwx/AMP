package com.amp.amp.data;

import android.app.Application;

import androidx.room.Room;

import com.amp.amp.data.dao.Type_of_environment_Dao;

public class App  extends Application {

    private App_Database database;
    private Type_of_environment_Dao type_of_environment_Dao;

    private static App instanse;

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
                .build();

        type_of_environment_Dao = database.type_of_environment_Dao();
            }

    public Type_of_environment_Dao getType_of_environment_Dao() {
        return type_of_environment_Dao;
    }

    public void setType_of_environment_Dao(Type_of_environment_Dao type_of_environment_Dao) {
        this.type_of_environment_Dao = type_of_environment_Dao;
    }
}
