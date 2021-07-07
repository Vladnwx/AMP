package com.amp.amp.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.amp.amp.data.App;
import com.amp.amp.data.entity.Type_of_environment;

import java.util.List;

public class Type_of_environment_ViewModel extends ViewModel {

private LiveData<List<Type_of_environment>> type_of_environment_LiveData = App.getInstance().getType_of_environment_Dao().getAllLiveData();

    public LiveData<List<Type_of_environment>> getType_of_environment_LiveData() {
        return type_of_environment_LiveData;
    }
}