package com.amp.amp.data;

import static android.content.ContentValues.TAG;

import android.util.Log;

import androidx.lifecycle.LifecycleObserver;

public class GetData implements LifecycleObserver {

    public void getData () {
        Log.d(TAG, "getData");
    }
    public void setData () {
        Log.d(TAG, "setData");
    };

}
