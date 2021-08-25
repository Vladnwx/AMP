package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = Material_type.class, parentColumns = "Material_type", childColumns = "material_type"),
        @ForeignKey(entity = Nominal_size.class, parentColumns = "Nominal_size", childColumns = "nominal_size")  })

public class Resistivity implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;

    @NonNull
    @ColumnInfo(name = "material_type", index = true)
    private String material_type;

    @NonNull
    @ColumnInfo(name = "nominal_size", index = true)
    private Double nominal_size;

    @NonNull
    @ColumnInfo(name = "R")
    private Double R;
    @NonNull
    @ColumnInfo(name = "X")
    private Double X;
    @NonNull
    @ColumnInfo(name = "p")
    private Double p;

    public Resistivity(int id, @NonNull String material_type, Double nominal_size, Double r, Double x, Double p) {
        this.id = id;
        this.material_type = material_type;
        this.nominal_size = nominal_size;
        R = r;
        X = x;
        this.p = p;
    }

    public Double getP() {
        return p;
    }

    public void setP(Double p) {
        this.p = p;
    }

    public Resistivity() {
    }

    protected Resistivity(Parcel in) {
        id = in.readInt();
        material_type = in.readString();
        nominal_size = in.readDouble();
        R = in.readDouble();
        X = in.readDouble();
    }

    public static final Creator<Resistivity> CREATOR = new Creator<Resistivity>() {
        @Override
        public Resistivity createFromParcel(Parcel in) {
            return new Resistivity(in);
        }

        @Override
        public Resistivity[] newArray(int size) {
            return new Resistivity[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getMaterial_type() {
        return material_type;
    }

    public void setMaterial_type(@NonNull String material_type) {
        this.material_type = material_type;
    }

    public Double getNominal_size() {
        return nominal_size;
    }

    public void setNominal_size(Double nominal_size) {
        this.nominal_size = nominal_size;
    }

    public Double getR() {
        return R;
    }

    public void setR(Double r) {
        R = r;
    }

    public Double getX() {
        return X;
    }

    public void setX(Double x) {
        X = x;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(material_type);
        dest.writeDouble(nominal_size);
        dest.writeDouble(R);
        dest.writeDouble(X);
    }
}
