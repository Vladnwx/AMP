package com.amp.amp.view;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.amp.amp.data.App_Repository;
import com.amp.amp.data.entity.Number_of_core;

import java.util.List;

public class Number_of_cores_ViewModel extends AndroidViewModel {

        private App_Repository mRepository;

        private final LiveData<List<Number_of_core>> mAllNumber_of_cores;

        public Number_of_cores_ViewModel(Application application) {
            super(application);
            mRepository = new App_Repository(application);
            mAllNumber_of_cores = mRepository.getAllNumber_of_coress();
        }

        LiveData<List<Number_of_core>> getAll() { return mAllNumber_of_cores; }

        public void insert(Number_of_core number_of_core) { mRepository.insert(number_of_core); }
    }