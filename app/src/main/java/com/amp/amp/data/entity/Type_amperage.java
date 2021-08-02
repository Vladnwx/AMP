package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"Type_amperage"},unique = true)})
public class Type_amperage implements Parcelable {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Type_amperage")
    private String mType_amperage;

    public Type_amperage(@NonNull String mType_amperage) {
        this.mType_amperage = mType_amperage;
    }
    @NonNull
    public String getType_amperage() {
        return mType_amperage;
    }

    public void setType_amperage(@NonNull String mType_amperage) {
        this.mType_amperage = mType_amperage;
    }

    protected Type_amperage(Parcel in) {
        mType_amperage = in.readString();
    }

    public static final Creator<Type_amperage> CREATOR = new Creator<Type_amperage>() {
        @Override
        public Type_amperage createFromParcel(Parcel in) {
            return new Type_amperage(in);
        }

        @Override
        public Type_amperage[] newArray(int size) {
            return new Type_amperage[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mType_amperage);
    }

    @Override
    public String toString() {
        return mType_amperage;
    }
}
