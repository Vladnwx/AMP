package com.amp.amp.view;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.amp.amp.data.App_Repository;
import com.amp.amp.data.entity.Material_type;

import java.util.List;

public class Material_type_ViewModel extends AndroidViewModel {

        private App_Repository mRepository;

        private final LiveData<List<Material_type>> mAllMaterial_type;

        public Material_type_ViewModel(Application application) {
            super(application);
            mRepository = new App_Repository(application);
            mAllMaterial_type = mRepository.getAllMaterial_types();
        }

        LiveData<List<Material_type>> getAll() { return mAllMaterial_type; }

        public void insert(Material_type material_type) { mRepository.insert(material_type); }
    }