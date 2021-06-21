package com.amp.amp.view;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.amp.amp.data.App_Repository;
import com.amp.amp.data.entity.Type_amperage;

import java.util.List;

public class Type_amperage_ViewModel extends AndroidViewModel {

        private App_Repository mRepository;

        private final LiveData<List<Type_amperage>> mType_amperage;

        public Type_amperage_ViewModel(Application application) {
            super(application);
            mRepository = new App_Repository(application);
            mType_amperage = mRepository.getAllType_amperages();
        }

        LiveData<List<Type_amperage>> getAll() { return mType_amperage; }

        public void insert(Type_amperage type_amperage) { mRepository.insert(type_amperage); }
    }