package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"Method_of_laying"},unique = true)})
public class Method_of_laying implements Parcelable {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Method_of_laying")
    private String mMethod_of_laying;

    public Method_of_laying(@NonNull String mMethod_of_laying) {
        this.mMethod_of_laying = mMethod_of_laying;
    }

    protected Method_of_laying(Parcel in) {
        mMethod_of_laying = in.readString();
    }

    public static final Creator<Method_of_laying> CREATOR = new Creator<Method_of_laying>() {
        @Override
        public Method_of_laying createFromParcel(Parcel in) {
            return new Method_of_laying(in);
        }

        @Override
        public Method_of_laying[] newArray(int size) {
            return new Method_of_laying[size];
        }
    };

    @NonNull
    public String getMethod_of_laying() {
        return mMethod_of_laying;
    }

    public void setMethod_of_laying(@NonNull String mShort_current) {
        this.mMethod_of_laying = mShort_current;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mMethod_of_laying);
    }


}
