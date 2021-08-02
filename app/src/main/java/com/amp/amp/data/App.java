package com.amp.amp.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

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

import java.util.List;

public class App extends Application {
    private App_Database database;

    private static App instance;

    public static App getInstance() {
        return instance;
    }


    private Type_of_environment_Dao mtype_of_environment_dao;
    private final LiveData<List<Type_of_environment>> mAllType_of_environments;

    private Type_amperage_Dao mtype_amperage_dao;
    private final LiveData<List<Type_amperage>> mAllType_amperages;

    private Method_of_laying_Dao mmethod_of_laying_dao;
    private final LiveData<List<Method_of_laying>> mAllMethod_of_layings;

    private Number_of_core_Dao mnumber_of_cores_dao;
    private final LiveData<List<Number_of_core>> mAllNumber_of_cores;

    private Nominal_size_Dao mnominal_size_dao;
    private final LiveData<List<Nominal_size>> mAllNominal_sizes;

    private Material_type_Dao mmaterial_type_dao;
    private final LiveData<List<Material_type>> mAllMaterial_types;

    private Insulation_type_Dao minsulation_type_dao;
    private final LiveData<List<Insulation_type>> mAllInsulation_types;

    private Amperage_short_Dao mamperage_short_dao;
    private final LiveData<List<Amperage_short>> mAllAmperage_shorts;

    private Amperage_Dao mamperage_dao;
    private final LiveData<List<Amperage>> mAllAmperages;

    private Resistivity_Dao mresistivity_dao;
    private final LiveData<List<Resistivity>> mAllResistivitys;


    public App (Application application) {

        App_Database db = App_Database.getDatabase(application);

        mtype_of_environment_dao = db.type_of_environment_Dao();
        mAllType_of_environments = mtype_of_environment_dao.getAllLiveData();

        mtype_amperage_dao = db.type_amperage_Dao();
        mAllType_amperages = mtype_amperage_dao.getAllLiveData();

        mmethod_of_laying_dao =  db.method_of_laying_Dao();
        mAllMethod_of_layings = mmethod_of_laying_dao.getAllLiveData();

        mnumber_of_cores_dao = db.number_of_core_Dao();
        mAllNumber_of_cores = mnumber_of_cores_dao.getAllLiveData();

        mnominal_size_dao = db.nominal_size_Dao();
        mAllNominal_sizes = mnominal_size_dao.getAllLiveData();

        mmaterial_type_dao = db.material_type_Dao();
        mAllMaterial_types = mmaterial_type_dao.getAllLiveData();

        minsulation_type_dao = db.insulation_type_Dao();
        mAllInsulation_types = minsulation_type_dao.getAllLiveData();

        mamperage_short_dao = db.amperage_short_Dao();
        mAllAmperage_shorts = mamperage_short_dao.getAllLiveData();

        mamperage_dao = db.amperage_Dao();
        mAllAmperages = mamperage_dao.getAllLiveData();

        mresistivity_dao = db.resistivity_dao();
        mAllResistivitys = mresistivity_dao.getAllLiveData();

    }
    public App_Database getDatabase() {
        return database;
    }

    public void setDatabase(App_Database database) {
        this.database = database;
    }


    public Type_of_environment_Dao gettype_of_environment_dao() {
        return mtype_of_environment_dao;
    }

    public void settype_of_environment_dao(Type_of_environment_Dao mtype_of_environment_dao) {
        this.mtype_of_environment_dao = mtype_of_environment_dao;
    }

    public Type_amperage_Dao gettype_amperage_dao() {
        return mtype_amperage_dao;
    }

    public void settype_amperage_dao(Type_amperage_Dao mtype_amperage_dao) {
        this.mtype_amperage_dao = mtype_amperage_dao;
    }

    public Method_of_laying_Dao getmethod_of_laying_dao() {
        return mmethod_of_laying_dao;
    }

    public void setmethod_of_laying_dao(Method_of_laying_Dao mmethod_of_laying_dao) {
        this.mmethod_of_laying_dao = mmethod_of_laying_dao;
    }

    public Number_of_core_Dao getnumber_of_cores_dao() {
        return mnumber_of_cores_dao;
    }

    public void setnumber_of_cores_dao(Number_of_core_Dao mnumber_of_cores_dao) {
        this.mnumber_of_cores_dao = mnumber_of_cores_dao;
    }

    public Nominal_size_Dao getnominal_size_dao() {
        return mnominal_size_dao;
    }

    public void setnominal_size_dao(Nominal_size_Dao mnominal_size_dao) {
        this.mnominal_size_dao = mnominal_size_dao;
    }

    public Material_type_Dao getmaterial_type_dao() {
        return mmaterial_type_dao;
    }

    public void setmaterial_type_dao(Material_type_Dao mmaterial_type_dao) {
        this.mmaterial_type_dao = mmaterial_type_dao;
    }

    public Insulation_type_Dao getinsulation_type_dao() {
        return minsulation_type_dao;
    }

    public void setinsulation_type_dao(Insulation_type_Dao minsulation_type_dao) {
        this.minsulation_type_dao = minsulation_type_dao;
    }

    public Amperage_short_Dao getamperage_short_dao() {
        return mamperage_short_dao;
    }

    public void setamperage_short_dao(Amperage_short_Dao mamperage_short_dao) {
        this.mamperage_short_dao = mamperage_short_dao;
    }

    public Amperage_Dao getamperage_dao() {
        return mamperage_dao;
    }

    public void setamperage_dao(Amperage_Dao mamperage_dao) {
        this.mamperage_dao = mamperage_dao;
    }

    public Resistivity_Dao getresistivity_dao() {
        return mresistivity_dao;
    }

    public void setresistivity_dao(Resistivity_Dao mresistivity_dao) {
        this.mresistivity_dao = mresistivity_dao;
    }

    public LiveData<List<Type_of_environment>> getAllLiveData_Type_of_environment() {
        return mAllType_of_environments;
    }

   public LiveData<List<Type_amperage>> getAllLiveData_Type_amperage() {
        return mAllType_amperages;
    }

    public LiveData<List<Method_of_laying>> getAllLiveData_Method_of_laying() {
        return mAllMethod_of_layings;
    }

    public LiveData<List<Number_of_core>> getAllLiveData_Number_of_core() {
        return mAllNumber_of_cores;
    }

    public LiveData<List<Nominal_size>> getAllLiveData_Nominal_size() {
        return mAllNominal_sizes;
    }

    public LiveData<List<Material_type>> getAllLiveData_Material_type() {
        return mAllMaterial_types;
    }

    public LiveData<List<Insulation_type>> getAllLiveData_Insulation_type() {
        return mAllInsulation_types;
    }

    public LiveData<List<Amperage_short>> getAllLiveData_Amperage_short() {
        return mAllAmperage_shorts;
    }

    public LiveData<List<Amperage>> getAllLiveData_Amperage() {
        return mAllAmperages;
    }

    public LiveData<List<Resistivity>> getAllLiveData_Resistivitye() {
        return mAllResistivitys;
    }


 /*  public void insert(Type_of_environment type_of_environment) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mtype_of_environment_dao.insert(type_of_environment);
        });
    }*/


}
