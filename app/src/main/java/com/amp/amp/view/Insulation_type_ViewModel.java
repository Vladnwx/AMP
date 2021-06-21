package com.amp.amp.view;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.amp.amp.data.App_Repository;
import com.amp.amp.data.entity.Insulation_type;

import java.util.List;

public class Insulation_type_ViewModel extends AndroidViewModel {

        private App_Repository mRepository;

        private final LiveData<List<Insulation_type>> mAllInsulation_type;

        public Insulation_type_ViewModel(Application application) {
            super(application);
            mRepository = new App_Repository(application);
            mAllInsulation_type = mRepository.getAllInsulation_types();
        }

        LiveData<List<Insulation_type>> getAll() { return mAllInsulation_type; }

        public void insert(Insulation_type insulation_type) { mRepository.insert(insulation_type); }
    }