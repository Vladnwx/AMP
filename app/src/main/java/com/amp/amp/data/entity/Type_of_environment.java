package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(indices = {@Index(value = {"Type_of_environment"},unique = true)})
public class Type_of_environment implements Parcelable {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Type_of_environment")
    private String mType_of_environment;

    public Type_of_environment(@NonNull String mType_of_environment) {
        this.mType_of_environment = mType_of_environment;
    }

    protected Type_of_environment(Parcel in) {
        mType_of_environment = in.readString();
    }

    public static final Creator<Type_of_environment> CREATOR = new Creator<Type_of_environment>() {
        @Override
        public Type_of_environment createFromParcel(Parcel in) {
            return new Type_of_environment(in);
        }

        @Override
        public Type_of_environment[] newArray(int size) {
            return new Type_of_environment[size];
        }
    };

    @NonNull
    public String getType_of_environment() {
        return mType_of_environment;
    }

    public void setType_of_environment(@NonNull String mType_of_environment) {
        this.mType_of_environment = mType_of_environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type_of_environment that = (Type_of_environment) o;
        return mType_of_environment.equals(that.mType_of_environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mType_of_environment);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mType_of_environment);
    }
}
