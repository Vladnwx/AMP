package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"Nominal_size"},unique = true)})
public class Nominal_size implements Parcelable {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Nominal_size")
    private int mNominal_size;

    public Nominal_size(int mNominal_size) {
        this.mNominal_size = mNominal_size;
    }

    protected Nominal_size(Parcel in) {
        mNominal_size = in.readInt();
    }

    public static final Creator<Nominal_size> CREATOR = new Creator<Nominal_size>() {
        @Override
        public Nominal_size createFromParcel(Parcel in) {
            return new Nominal_size(in);
        }

        @Override
        public Nominal_size[] newArray(int size) {
            return new Nominal_size[size];
        }
    };

    public int getNominal_size() {
        return mNominal_size;
    }

    public void setNominal_size(int mNominal_size) {
        this.mNominal_size = mNominal_size;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mNominal_size);
    }
}
