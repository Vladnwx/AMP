package com.amp.amp.data;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App extends Application {

    private App_Database database;
    private Type_of_environment_Dao type_of_environment_dao;


    private Type_amperage_Dao type_amperage_dao;
    private Method_of_laying_Dao method_of_laying_dao;
    private Number_of_cores_Dao number_of_cores_dao;
    private Nominal_size_Dao nominal_size_dao;
    private Material_type_Dao material_type_dao;
    private Insulation_type_Dao insulation_type_dao;
    private Amperage_short_Dao amperage_short_dao;
    private Amperage_Dao amperage_dao;
    private Resistivity_Dao resistivity_dao;

    private static App instanse;

    private static volatile App_Database INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    @Override
    public void onCreate() {
        super.onCreate();

        instanse = this;

        database = Room.databaseBuilder(getApplicationContext(),
                App_Database.class, "amperage")
                .allowMainThreadQueries()
               // .addCallback(sRoomDatabaseCallback)
               //.createFromAsset("amperage.db")
                .build();

        type_of_environment_dao = database.type_of_environment_Dao();
        type_amperage_dao = database.type_amperage_Dao();
        method_of_laying_dao = database.method_of_laying_Dao();
        number_of_cores_dao = database.number_of_core_Dao();
        nominal_size_dao = database.nominal_size_Dao();
        material_type_dao = database.material_type_Dao();
        insulation_type_dao = database.insulation_type_Dao();
        amperage_short_dao = database.amperage_short_Dao();
        amperage_dao = database.amperage_Dao();
        resistivity_dao = database.resistivity_dao();

            }



    public Type_of_environment_Dao getType_of_environment_dao() {
        return type_of_environment_dao;
    }

    public void setType_of_environment_dao(Type_of_environment_Dao type_of_environment_dao) {
        this.type_of_environment_dao = type_of_environment_dao;
    }
    public Type_amperage_Dao getType_amperage_dao() {
        return type_amperage_dao;
    }

    public void setType_amperage_dao(Type_amperage_Dao type_amperage_dao) {
        this.type_amperage_dao = type_amperage_dao;
    }

    public Method_of_laying_Dao getMethod_of_laying_dao() {
        return method_of_laying_dao;
    }

    public void setMethod_of_laying_dao(Method_of_laying_Dao methodoflaying_dao) {
        this.method_of_laying_dao = methodoflaying_dao;
    }

    public Number_of_cores_Dao getNumber_of_cores_dao() {
        return number_of_cores_dao;
    }

    public void setNumber_of_cores_dao(Number_of_cores_Dao number_of_cores_dao) {
        this.number_of_cores_dao = number_of_cores_dao;
    }

    public Nominal_size_Dao getNominal_size_dao() {
        return nominal_size_dao;
    }

    public void setNominal_size_dao(Nominal_size_Dao nominal_size_dao) {
        this.nominal_size_dao = nominal_size_dao;
    }

    public Material_type_Dao getMaterial_type_dao() {
        return material_type_dao;
    }

    public void setMaterial_type_dao(Material_type_Dao material_type_dao) {
        this.material_type_dao = material_type_dao;
    }

    public Insulation_type_Dao getInsulation_type_dao() {
        return insulation_type_dao;
    }

    public void setInsulation_type_dao(Insulation_type_Dao insulation_type_dao) {
        this.insulation_type_dao = insulation_type_dao;
    }

    public Amperage_short_Dao getAmperage_short_dao() {
        return amperage_short_dao;
    }

    public void setAmperage_short_dao(Amperage_short_Dao amperage_short_dao) {
        this.amperage_short_dao = amperage_short_dao;
    }

    public Amperage_Dao getAmperage_dao() {
        return amperage_dao;
    }

    public void setAmperage_dao(Amperage_Dao amperage_dao) {
        this.amperage_dao = amperage_dao;
    }

    public static App getInstance() {
        return instanse;
    }

    public Resistivity_Dao getResistivity_dao() {
        return resistivity_dao;
    }

    public void setResistivity_dao(Resistivity_Dao resistivity_dao) {
        this.resistivity_dao = resistivity_dao;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            databaseWriteExecutor.execute(() -> {
                Type_of_environment_Dao type_of_environment_dao = INSTANCE.type_of_environment_Dao();
                type_of_environment_dao.deleteAll();
                type_of_environment_dao.defaultgreate();

                //type_of_environment_dao.notifyAll();



            });
        }
    };

}
