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


    private Type_of_environment_Dao type_of_environment_Dao;
    private List<String> AllType_of_environments;
    private LiveData<List<Type_of_environment>> AllLiveDataType_of_environments;

    private Type_amperage_Dao type_amperage_Dao;
    private List<String> AllType_amperages;
    private LiveData<List<Type_amperage>> AllLiveDataType_amperages;

    private Method_of_laying_Dao method_of_laying_Dao;
    private List<String> AllMethod_of_layings;
    private LiveData<List<Method_of_laying>> AllLiveDataMethod_of_layings;

    private Number_of_core_Dao number_of_cores_Dao;
    private List<String> AllNumber_of_cores;
    private LiveData<List<Number_of_core>> AllLiveDataNumber_of_cores;

    private Nominal_size_Dao nominal_size_Dao;
    private List<Double> AllNominal_sizes;
    private LiveData<List<Nominal_size>> AllLiveDataNominal_sizes;

    private Material_type_Dao material_type_Dao;
    private List<String> AllMaterial_types;
    private LiveData<List<Material_type>> AllLiveDataMaterial_types;

    private Insulation_type_Dao insulation_type_Dao;
    private List<String> AllInsulation_types;
    private LiveData<List<Insulation_type>> AllLiveDataInsulation_types;

    private Resistivity_Dao resistivity_Dao;
    private List<String> AllResistivitys;
    private LiveData<List<Resistivity>> AllLiveDataResistivitys;

    private Amperage_short_Dao amperage_short_Dao;
    private List<String> AllAmperage_shorts;
    private LiveData<List<Amperage_short>> AllLiveDataAmperage_shorts;

    private Amperage_Dao amperage_Dao;
    private List<String> AllAmperages;
    private LiveData<List<Amperage>> AllLiveDataAmperages;


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = App_Database.getDatabase(instance);

        type_of_environment_Dao = database.type_of_environment_Dao();
        AllType_of_environments = type_of_environment_Dao.getAll();

        type_amperage_Dao = database.type_amperage_Dao();
        AllType_amperages = type_amperage_Dao.getAll();

        method_of_laying_Dao = database.method_of_laying_Dao();
        AllMethod_of_layings = method_of_laying_Dao.getAll();

        number_of_cores_Dao = database.number_of_core_Dao();
        AllNumber_of_cores = number_of_cores_Dao.getAll();

        nominal_size_Dao = database.nominal_size_Dao();
        AllNominal_sizes = nominal_size_Dao.getAll();

        material_type_Dao = database.material_type_Dao();
        AllMaterial_types = material_type_Dao.getAll();

        insulation_type_Dao = database.insulation_type_Dao();
        AllInsulation_types = insulation_type_Dao.getAll();

        resistivity_Dao = database.resistivity_Dao();

        amperage_short_Dao = database.amperage_short_Dao();

        amperage_Dao = database.amperage_Dao();

    }

   /*

    public App (Application application) {

        App_Database db = App_Database.getDatabase(application);

        mtype_of_environment_Dao = db.type_of_environment_Dao();
        mAllType_of_environments = mtype_of_environment_Dao.getAllLiveData();

       /* mtype_amperage_dao = db.type_amperage_Dao();
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

        mresistivity_dao = db.resistivity_Dao();
        mAllResistivitys = mresistivity_dao.getAllLiveData();*/

    //  }







 /*  public void insert(Type_of_environment type_of_environment) {
        App_Database.databaseWriteExecutor.execute(() -> {
            mtype_of_environment_dao.insert(type_of_environment);
        });
    }*/


}
