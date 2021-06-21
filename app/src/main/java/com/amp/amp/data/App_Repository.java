package com.amp.amp.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class App_Repository {
    private Type_of_environment_Dao mType_of_environment_Dao;
    private Type_amperage_Dao mType_amperage_Dao;
    private Short_current_Dao mShort_current_Dao;
    private Number_of_cores_Dao mNumber_of_cores_Dao;
    private Nominal_size_Dao mNominal_size_Dao;
    private Material_type_Dao mMaterial_type_Dao;
    private Insulation_type_Dao mInsulation_type_Dao;
    private Amperage_short_Dao mAmperage_short_Dao;
    private Amperage_Dao mAmperage_Dao;

    private LiveData<List<Type_of_environment>> mAllType_of_environment;
    private LiveData<List<Type_amperage>> mAllType_amperage;
    private LiveData<List<Short_current>> mAllShort_current;
    private LiveData<List<Number_of_cores>> mAllNumber_of_cores;
    private LiveData<List<Nominal_size>> mAllNominal_size;
    private LiveData<List<Material_type>> mAllMaterial_type;
    private LiveData<List<Insulation_type>> mAllInsulation_type;
    private LiveData<List<Amperage_short>> mAllAmperage_short;
    private LiveData<List<Amperage>> mAllAmperage;


    // Note that in order to unit test the WordRepository, you have to remove the Application
    // dependency. This adds complexity and much more code, and this sample is not about testing.
    // See the BasicSample in the android-architecture-components repository at
    // https://github.com/googlesamples

    App_Repository(Application application) {
        App_Database db = App_Database.getDatabase(application);

        mType_of_environment_Dao = db.type_of_environment_Dao();
        mType_amperage_Dao = db.type_amperage_Dao();
        mShort_current_Dao = db.short_current_Dao();
        mNumber_of_cores_Dao = db.number_of_cores_Dao();
        mNominal_size_Dao = db.nominal_size_Dao();
        mMaterial_type_Dao = db.material_type_Dao();
        mInsulation_type_Dao = db.insulation_type_Dao();
        mAmperage_short_Dao = db.amperage_short_Dao();
        mAmperage_Dao = db.amperage_Dao();

        mAllType_of_environment = mType_of_environment_Dao.getAll();
        mAllType_amperage = mType_amperage_Dao.getAll();
        mAllShort_current = mShort_current_Dao.getAll();
        mAllNumber_of_cores = mNumber_of_cores_Dao.getAll();
        mAllNominal_size = mNominal_size_Dao.getAll();
        mAllMaterial_type = mMaterial_type_Dao.getAll();
        mAllInsulation_type = mInsulation_type_Dao.getAll();
        mAllAmperage_short = mAmperage_short_Dao.getAll();
        mAllAmperage = mAmperage_Dao.getAll();


    }

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    LiveData<List<Type_of_environment>> getAllType_of_environments() {
        return mAllType_of_environment;
    }
    LiveData<List<Type_amperage>> getAllType_amperages() {
        return mAllType_amperage;
    }
    LiveData<List<Short_current>> getAllShort_currents() {
        return mAllShort_current;
    }
    LiveData<List<Number_of_cores>> getAllNumber_of_coress() {
        return mAllNumber_of_cores;
    }
    LiveData<List<Nominal_size>> getAllNominal_sizes() {
        return mAllNominal_size;
    }
    LiveData<List<Material_type>> getAllMaterial_types() {
        return mAllMaterial_type;
    }
    LiveData<List<Insulation_type>> getAllInsulation_types() {
        return mAllInsulation_type;
    }
    LiveData<List<Amperage_short>> getAllAmperage_shorts() {
        return mAllAmperage_short;
    }
    LiveData<List<Amperage>> getAllAmperages() {
        return mAllAmperage;
    }

    // You must call this on a non-UI thread or your app will throw an exception. Room ensures
    // that you're not doing any long running operations on the main thread, blocking the UI.

    void insert(Type_of_environment type_of_environment) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mType_of_environment_Dao.insert(type_of_environment);
        });
    }
    void insert(Type_amperage type_amperage) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mType_amperage_Dao.insert(type_amperage);
        });
    }
    void insert(Short_current short_current) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mShort_current_Dao.insert(short_current);
        });
    }
    void insert(Number_of_cores number_of_cores) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mNumber_of_cores_Dao.insert(number_of_cores);
        });
    }
    void insert(Nominal_size nominal_size) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mNominal_size_Dao.insert(nominal_size);
        });
    }
    void insert(Material_type material_type) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mMaterial_type_Dao.insert(material_type);
        });
    }
    void insert(Insulation_type insulation_type) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mInsulation_type_Dao.insert(insulation_type);
        });
    }
    void insert(Amperage_short amperage_short) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mAmperage_short_Dao.insert(amperage_short);
        });
    }
    void insert(Amperage amperage) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mAmperage_Dao.insert(amperage);
        });
    }

}
