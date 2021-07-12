package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(indices = {@Index(value = {"Insulation_type"},unique = true)})
public class Insulation_type implements Parcelable {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Insulation_type")
    private String mInsulation_type;

    public Insulation_type(@NonNull String mInsulation_type) {
        this.mInsulation_type = mInsulation_type;
    }

    protected Insulation_type(Parcel in) {
        mInsulation_type = in.readString();
    }

    public static final Creator<Insulation_type> CREATOR = new Creator<Insulation_type>() {
        @Override
        public Insulation_type createFromParcel(Parcel in) {
            return new Insulation_type(in);
        }

        @Override
        public Insulation_type[] newArray(int size) {
            return new Insulation_type[size];
        }
    };

    @NonNull
    public String getInsulation_type() {
        return mInsulation_type;
    }

    public void setInsulation_type(@NonNull String mInsulation_type) {
        this.mInsulation_type = mInsulation_type;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mInsulation_type);
    }
}
