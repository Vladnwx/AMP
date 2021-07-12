package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"Short_current"},unique = true)})
public class Short_current implements Parcelable {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Short_current")
    private String mShort_current;

    public Short_current(@NonNull String mShort_current) {
        this.mShort_current = mShort_current;
    }

    protected Short_current(Parcel in) {
        mShort_current = in.readString();
    }

    public static final Creator<Short_current> CREATOR = new Creator<Short_current>() {
        @Override
        public Short_current createFromParcel(Parcel in) {
            return new Short_current(in);
        }

        @Override
        public Short_current[] newArray(int size) {
            return new Short_current[size];
        }
    };

    @NonNull
    public String getShort_current() {
        return mShort_current;
    }

    public void setShort_current(@NonNull String mShort_current) {
        this.mShort_current = mShort_current;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mShort_current);
    }


}
