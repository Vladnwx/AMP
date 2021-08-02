package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity (indices = {@Index(value = {"Material_type"},unique = true)})
public class Material_type implements Parcelable {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "Material_type")
    private String mMaterial_type;

    public Material_type(@NonNull String mMaterial_type) {
        this.mMaterial_type = mMaterial_type;
    }

    protected Material_type(Parcel in) {
        mMaterial_type = in.readString();
    }

    public static final Creator<Material_type> CREATOR = new Creator<Material_type>() {
        @Override
        public Material_type createFromParcel(Parcel in) {
            return new Material_type(in);
        }

        @Override
        public Material_type[] newArray(int size) {
            return new Material_type[size];
        }
    };

    @NonNull
    public String getMaterial_type() {
        return mMaterial_type;
    }
    public void setMaterial_type(@NonNull String mMaterial_type) {
        this.mMaterial_type = mMaterial_type;
    }
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mMaterial_type);
    }


}
