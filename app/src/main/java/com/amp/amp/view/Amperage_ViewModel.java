package com.amp.amp.view;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.amp.amp.data.App_Repository;
import com.amp.amp.data.entity.Amperage;

import java.util.List;

public class Amperage_ViewModel extends AndroidViewModel {

        private App_Repository mRepository;

        private final LiveData<List<Amperage>> mAllAmperage;

        public Amperage_ViewModel(Application application) {
            super(application);
            mRepository = new App_Repository(application);
            mAllAmperage = mRepository.getAllAmperages();
        }

        LiveData<List<Amperage>> getAll() { return mAllAmperage; }

        public void insert(Amperage amperage) { mRepository.insert(amperage); }
    }