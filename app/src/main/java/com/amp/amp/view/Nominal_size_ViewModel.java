package com.amp.amp.view;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.amp.amp.data.App_Repository;
import com.amp.amp.data.entity.Nominal_size;

import java.util.List;

public class Nominal_size_ViewModel extends AndroidViewModel {

        private App_Repository mRepository;

        private final LiveData<List<Nominal_size>> mAllNominal_size;

        public Nominal_size_ViewModel(Application application) {
            super(application);
            mRepository = new App_Repository(application);
            mAllNominal_size = mRepository.getAllNominal_sizes();
        }

        LiveData<List<Nominal_size>> getAll() { return mAllNominal_size; }

        public void insert(Nominal_size nominal_size) { mRepository.insert(nominal_size); }
    }