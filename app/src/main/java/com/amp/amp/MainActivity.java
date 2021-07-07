package com.amp.amp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amp.amp.data.adapter.Type_of_environment_Adapter;
import com.amp.amp.data.entity.Type_of_environment;
import com.amp.amp.viewModel.Type_of_environment_ViewModel;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        Type_of_environment_Adapter adapter = new Type_of_environment_Adapter();
        recyclerView.setAdapter(adapter);
        Type_of_environment_ViewModel type_of_environment_viewModel =
                ViewModelProviders.of(this).get(Type_of_environment_ViewModel.class);
        type_of_environment_viewModel.
                getType_of_environment_LiveData().
                observe(this, new Observer<List<Type_of_environment>>() {
                    @Override
                    public void onChanged(List<Type_of_environment> type_of_environments) {
                        adapter.setItems(type_of_environments);
                    }
                });
    }

}