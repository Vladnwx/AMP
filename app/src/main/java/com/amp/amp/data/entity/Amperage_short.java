package com.amp.amp.data.entity;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = Nominal_size.class, parentColumns = "Nominal_size", childColumns = "nominal_size"),
        @ForeignKey(entity = Material_type.class, parentColumns = "Material_type", childColumns = "material_type"),
        @ForeignKey(entity = Insulation_type.class, parentColumns = "Insulation_type", childColumns = "insulation_type") })
public class Amperage_short implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;
    @NonNull
    @ColumnInfo(name = "nominal_size", index = true)
    private int nominal_size;
    @NonNull
    @ColumnInfo(name = "material_type", index = true)
    private String material_type;
    @NonNull
    @ColumnInfo(name = "insulation_type", index = true)
    private String insulation_type;
    @NonNull
    @ColumnInfo(name = "amperage_short")
    private int amperage_short;

    public Amperage_short(int id, int nominal_size, @NonNull String material_type, @NonNull String insulation_type, int amperage_short) {
        this.id = id;
        this.nominal_size = nominal_size;
        this.material_type = material_type;
        this.insulation_type = insulation_type;
        this.amperage_short = amperage_short;
    }

    protected Amperage_short(Parcel in) {
        id = in.readInt();
        nominal_size = in.readInt();
        material_type = in.readString();
        insulation_type = in.readString();
        amperage_short = in.readInt();
    }

    public static final Creator<Amperage_short> CREATOR = new Creator<Amperage_short>() {
        @Override
        public Amperage_short createFromParcel(Parcel in) {
            return new Amperage_short(in);
        }

        @Override
        public Amperage_short[] newArray(int size) {
            return new Amperage_short[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNominal_size() {
        return nominal_size;
    }

    public void setNominal_size(int nominal_size) {
        this.nominal_size = nominal_size;
    }

    @NonNull
    public String getMaterial_type() {
        return material_type;
    }

    public void setMaterial_type(@NonNull String material_type) {
        this.material_type = material_type;
    }

    @NonNull
    public String getInsulation_type() {
        return insulation_type;
    }

    public void setInsulation_type(@NonNull String insulation_type) {
        this.insulation_type = insulation_type;
    }

    public int getAmperage_short() {
        return amperage_short;
    }

    public void setAmperage_short(int amperage_short) {
        this.amperage_short = amperage_short;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(nominal_size);
        dest.writeString(material_type);
        dest.writeString(insulation_type);
        dest.writeInt(amperage_short);
    }
}
