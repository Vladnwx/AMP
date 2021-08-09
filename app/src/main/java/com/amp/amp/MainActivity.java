package com.amp.amp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.amp.amp.ui.main.Fragment_tableAmperage;
import com.amp.amp.ui.main.ViewModel_tableAmperage;

public class MainActivity extends AppCompatActivity {

    ViewModel_tableAmperage viewModel_tableAmperage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment_tableAmperage.newInstance())
                    .commitNow();
                                        }

                                                        }

}