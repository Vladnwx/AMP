package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity (indices = {@Index(value = {"Number_of_core"},unique = true)})
public class Number_of_core implements Parcelable {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Number_of_core")
    private String mNumber_of_core;

    public Number_of_core(@NonNull String mNumber_of_core) {
        this.mNumber_of_core = mNumber_of_core;
    }

    protected Number_of_core(Parcel in) {
        mNumber_of_core = in.readString();
    }

    public static final Creator<Number_of_core> CREATOR = new Creator<Number_of_core>() {
        @Override
        public Number_of_core createFromParcel(Parcel in) {
            return new Number_of_core(in);
        }

        @Override
        public Number_of_core[] newArray(int size) {
            return new Number_of_core[size];
        }
    };

    @NonNull
    public String getNumber_of_core() {
        return mNumber_of_core;
    }

    public void setNumber_of_core(@NonNull String mNumber_of_core) {
        this.mNumber_of_core = mNumber_of_core;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mNumber_of_core);
    }


}
