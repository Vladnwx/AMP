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
    private Double R;
    private Double X;
    private LiveData<Double> LiveDataR;
    private LiveData<Double> LiveDataX;
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
        AllLiveDataType_of_environments = type_of_environment_Dao.getAllLiveData();

        type_amperage_Dao = database.type_amperage_Dao();
        AllType_amperages = type_amperage_Dao.getAll();
        AllLiveDataType_amperages = type_amperage_Dao.getAllLiveData();

        method_of_laying_Dao = database.method_of_laying_Dao();
        AllMethod_of_layings = method_of_laying_Dao.getAll();
        AllLiveDataMethod_of_layings = method_of_laying_Dao.getAllLiveData();

        number_of_cores_Dao = database.number_of_core_Dao();
        AllNumber_of_cores = number_of_cores_Dao.getAll();
        AllLiveDataNumber_of_cores = number_of_cores_Dao.getAllLiveData();

        nominal_size_Dao = database.nominal_size_Dao();
        AllNominal_sizes = nominal_size_Dao.getAll();
        AllLiveDataNominal_sizes = nominal_size_Dao.getAllLiveData();

        material_type_Dao = database.material_type_Dao();
        AllMaterial_types = material_type_Dao.getAll();
        AllLiveDataMaterial_types = material_type_Dao.getAllLiveData();

        insulation_type_Dao = database.insulation_type_Dao();
        AllInsulation_types = insulation_type_Dao.getAll();
        AllLiveDataInsulation_types = insulation_type_Dao.getAllLiveData();

        resistivity_Dao = database.resistivity_Dao();


        amperage_short_Dao = database.amperage_short_Dao();

        amperage_Dao = database.amperage_Dao();

    }

    public Type_of_environment_Dao getType_of_environment_Dao() {
        return type_of_environment_Dao;
    }

    public void setType_of_environment_Dao(Type_of_environment_Dao type_of_environment_Dao) {
        this.type_of_environment_Dao = type_of_environment_Dao;
    }

    public List<String> getAllType_of_environments() {
        return AllType_of_environments;
    }

    public void setAllType_of_environments(List<String> allType_of_environments) {
        AllType_of_environments = allType_of_environments;
    }

    public LiveData<List<Type_of_environment>> getAllLiveDataType_of_environments() {
        return AllLiveDataType_of_environments;
    }

    public void setAllLiveDataType_of_environments(LiveData<List<Type_of_environment>> allLiveDataType_of_environments) {
        AllLiveDataType_of_environments = allLiveDataType_of_environments;
    }

    public Type_amperage_Dao getType_amperage_Dao() {
        return type_amperage_Dao;
    }

    public void setType_amperage_Dao(Type_amperage_Dao type_amperage_Dao) {
        this.type_amperage_Dao = type_amperage_Dao;
    }

    public List<String> getAllType_amperages() {
        return AllType_amperages;
    }

    public void setAllType_amperages(List<String> allType_amperages) {
        AllType_amperages = allType_amperages;
    }

    public LiveData<List<Type_amperage>> getAllLiveDataType_amperages() {
        return AllLiveDataType_amperages;
    }

    public void setAllLiveDataType_amperages(LiveData<List<Type_amperage>> allLiveDataType_amperages) {
        AllLiveDataType_amperages = allLiveDataType_amperages;
    }

    public Method_of_laying_Dao getMethod_of_laying_Dao() {
        return method_of_laying_Dao;
    }

    public void setMethod_of_laying_Dao(Method_of_laying_Dao method_of_laying_Dao) {
        this.method_of_laying_Dao = method_of_laying_Dao;
    }

    public List<String> getAllMethod_of_layings() {
        return AllMethod_of_layings;
    }

    public void setAllMethod_of_layings(List<String> allMethod_of_layings) {
        AllMethod_of_layings = allMethod_of_layings;
    }

    public LiveData<List<Method_of_laying>> getAllLiveDataMethod_of_layings() {
        return AllLiveDataMethod_of_layings;
    }

    public void setAllLiveDataMethod_of_layings(LiveData<List<Method_of_laying>> allLiveDataMethod_of_layings) {
        AllLiveDataMethod_of_layings = allLiveDataMethod_of_layings;
    }

    public Number_of_core_Dao getNumber_of_cores_Dao() {
        return number_of_cores_Dao;
    }

    public void setNumber_of_cores_Dao(Number_of_core_Dao number_of_cores_Dao) {
        this.number_of_cores_Dao = number_of_cores_Dao;
    }

    public List<String> getAllNumber_of_cores() {
        return AllNumber_of_cores;
    }

    public void setAllNumber_of_cores(List<String> allNumber_of_cores) {
        AllNumber_of_cores = allNumber_of_cores;
    }

    public LiveData<List<Number_of_core>> getAllLiveDataNumber_of_cores() {
        return AllLiveDataNumber_of_cores;
    }

    public void setAllLiveDataNumber_of_cores(LiveData<List<Number_of_core>> allLiveDataNumber_of_cores) {
        AllLiveDataNumber_of_cores = allLiveDataNumber_of_cores;
    }

    public Nominal_size_Dao getNominal_size_Dao() {
        return nominal_size_Dao;
    }

    public void setNominal_size_Dao(Nominal_size_Dao nominal_size_Dao) {
        this.nominal_size_Dao = nominal_size_Dao;
    }

    public List<Double> getAllNominal_sizes() {
        return AllNominal_sizes;
    }

    public void setAllNominal_sizes(List<Double> allNominal_sizes) {
        AllNominal_sizes = allNominal_sizes;
    }

    public LiveData<List<Nominal_size>> getAllLiveDataNominal_sizes() {
        return AllLiveDataNominal_sizes;
    }

    public void setAllLiveDataNominal_sizes(LiveData<List<Nominal_size>> allLiveDataNominal_sizes) {
        AllLiveDataNominal_sizes = allLiveDataNominal_sizes;
    }

    public Material_type_Dao getMaterial_type_Dao() {
        return material_type_Dao;
    }

    public void setMaterial_type_Dao(Material_type_Dao material_type_Dao) {
        this.material_type_Dao = material_type_Dao;
    }

    public List<String> getAllMaterial_types() {
        return AllMaterial_types;
    }

    public void setAllMaterial_types(List<String> allMaterial_types) {
        AllMaterial_types = allMaterial_types;
    }

    public LiveData<List<Material_type>> getAllLiveDataMaterial_types() {
        return AllLiveDataMaterial_types;
    }

    public void setAllLiveDataMaterial_types(LiveData<List<Material_type>> allLiveDataMaterial_types) {
        AllLiveDataMaterial_types = allLiveDataMaterial_types;
    }

    public Insulation_type_Dao getInsulation_type_Dao() {
        return insulation_type_Dao;
    }

    public void setInsulation_type_Dao(Insulation_type_Dao insulation_type_Dao) {
        this.insulation_type_Dao = insulation_type_Dao;
    }

    public List<String> getAllInsulation_types() {
        return AllInsulation_types;
    }

    public void setAllInsulation_types(List<String> allInsulation_types) {
        AllInsulation_types = allInsulation_types;
    }

    public LiveData<List<Insulation_type>> getAllLiveDataInsulation_types() {
        return AllLiveDataInsulation_types;
    }

    public void setAllLiveDataInsulation_types(LiveData<List<Insulation_type>> allLiveDataInsulation_types) {
        AllLiveDataInsulation_types = allLiveDataInsulation_types;
    }

    public Resistivity_Dao getResistivity_Dao() {
        return resistivity_Dao;
    }

    public void setResistivity_Dao(Resistivity_Dao resistivity_Dao) {
        this.resistivity_Dao = resistivity_Dao;
    }

    public Double getR(String tmaterial_type, Double tnominal_size) {
        return R = resistivity_Dao.getR(tmaterial_type, tnominal_size);
    }

    public void setR(String tmaterial_type, Double tnominal_size, Double r) {
        R = r;
    }

    public Double getX(String tmaterial_type, Double tnominal_size) {
        return X = resistivity_Dao.getX(tmaterial_type, tnominal_size);
    }

    public void setX(Double x) {
        X = x;
    }

    public LiveData<Double> getLiveDataR(String tmaterial_type, Double tnominal_size) {
        return LiveDataR = resistivity_Dao.getLiveDataR(tmaterial_type, tnominal_size);
    }

    public void setLiveDataR(LiveData<Double> liveDataR) {
        LiveDataR = liveDataR;
    }

    public LiveData<Double> getLiveDataX(String tmaterial_type, Double tnominal_size) {
        return LiveDataX = resistivity_Dao.getLiveDataX(tmaterial_type, tnominal_size);
    }

    public void setLiveDataX(LiveData<Double> liveDataX) {
        LiveDataX = liveDataX;
    }

    public List<String> getAllResistivitys() {
        return AllResistivitys;
    }

    public void setAllResistivitys(List<String> allResistivitys) {
        AllResistivitys = allResistivitys;
    }

    public LiveData<List<Resistivity>> getAllLiveDataResistivitys() {
        return AllLiveDataResistivitys;
    }

    public void setAllLiveDataResistivitys(LiveData<List<Resistivity>> allLiveDataResistivitys) {
        AllLiveDataResistivitys = allLiveDataResistivitys;
    }

    public Amperage_short_Dao getAmperage_short_Dao() {
        return amperage_short_Dao;
    }

    public void setAmperage_short_Dao(Amperage_short_Dao amperage_short_Dao) {
        this.amperage_short_Dao = amperage_short_Dao;
    }

    public List<String> getAllAmperage_shorts() {
        return AllAmperage_shorts;
    }

    public void setAllAmperage_shorts(List<String> allAmperage_shorts) {
        AllAmperage_shorts = allAmperage_shorts;
    }

    public LiveData<List<Amperage_short>> getAllLiveDataAmperage_shorts() {
        return AllLiveDataAmperage_shorts;
    }

    public void setAllLiveDataAmperage_shorts(LiveData<List<Amperage_short>> allLiveDataAmperage_shorts) {
        AllLiveDataAmperage_shorts = allLiveDataAmperage_shorts;
    }

    public Amperage_Dao getAmperage_Dao() {
        return amperage_Dao;
    }

    public void setAmperage_Dao(Amperage_Dao amperage_Dao) {
        this.amperage_Dao = amperage_Dao;
    }

    public List<String> getAllAmperages() {
        return AllAmperages;
    }

    public void setAllAmperages(List<String> allAmperages) {
        AllAmperages = allAmperages;
    }

    public LiveData<List<Amperage>> getAllLiveDataAmperages() {
        return AllLiveDataAmperages;
    }

    public void setAllLiveDataAmperages(LiveData<List<Amperage>> allLiveDataAmperages) {
        AllLiveDataAmperages = allLiveDataAmperages;
    }
}
