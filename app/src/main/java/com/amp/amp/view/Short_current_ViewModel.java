package com.amp.amp.view;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.amp.amp.data.App_Repository;
import com.amp.amp.data.entity.Short_current;

import java.util.List;

public class Short_current_ViewModel extends AndroidViewModel {

        private App_Repository mRepository;

        private final LiveData<List<Short_current>> mAllShort_current;

        public Short_current_ViewModel(Application application) {
            super(application);
            mRepository = new App_Repository(application);
            mAllShort_current = mRepository.getAllShort_currents();
        }

        LiveData<List<Short_current>> getAll() { return mAllShort_current; }

        public void insert(Short_current sort_current) { mRepository.insert(sort_current); }
    }