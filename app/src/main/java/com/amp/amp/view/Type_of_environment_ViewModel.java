package com.amp.amp.view;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.amp.amp.data.App_Repository;
import com.amp.amp.data.Type_of_environment;

import java.util.List;

public class Type_of_environment_ViewModel extends AndroidViewModel {

        private App_Repository mRepository;

        private final LiveData<List<Type_of_environment>> mAllType_of_environment;

        public Type_of_environment_ViewModel (Application application) {
            super(application);
            mRepository = new App_Repository(application);
            mAllType_of_environment = mRepository.getAllType_of_environments();
        }

        LiveData<List<Type_of_environment>> getAllWords() { return mAllType_of_environment; }

        public void insert(Type_of_environment type_of_environment) { mRepository.insert(type_of_environment); }
    }