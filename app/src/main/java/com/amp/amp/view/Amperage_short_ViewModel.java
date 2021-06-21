package com.amp.amp.view;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.amp.amp.data.App_Repository;
import com.amp.amp.data.entity.Amperage_short;

import java.util.List;

public class Amperage_short_ViewModel extends AndroidViewModel {

        private App_Repository mRepository;

        private final LiveData<List<Amperage_short>> mAllAmperage_short;

        public Amperage_short_ViewModel(Application application) {
            super(application);
            mRepository = new App_Repository(application);
            mAllAmperage_short = mRepository.getAllAmperage_shorts();
        }

        LiveData<List<Amperage_short>> getAll() { return mAllAmperage_short; }

        public void insert(Amperage_short amperage_short) { mRepository.insert(amperage_short); }
    }