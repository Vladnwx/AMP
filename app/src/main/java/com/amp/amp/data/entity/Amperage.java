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
        @ForeignKey(entity = Insulation_type.class, parentColumns = "Insulation_type", childColumns = "insulation_type"),
        @ForeignKey(entity = Type_amperage.class, parentColumns = "Type_amperage", childColumns = "type_amperage"),
        @ForeignKey(entity = Number_of_core.class, parentColumns = "Number_of_core", childColumns = "number_of_core"),
        @ForeignKey(entity = Type_of_environment.class, parentColumns = "Type_of_environment", childColumns = "type_of_environment"),
})
public class Amperage implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    public int id;
    @NonNull
    @ColumnInfo(name = "nominal_size")
    public int nominal_size;
    @NonNull
    @ColumnInfo(name = "material_type")
    public String material_type;
    @NonNull
    @ColumnInfo(name = "insulation_type")
    public String insulation_type;
    @NonNull
    @ColumnInfo(name = "type_amperage")
    public String type_amperage;
    @NonNull
    @ColumnInfo(name = "number_of_core")
    public String number_of_core;
    @NonNull
    @ColumnInfo(name = "type_of_environment")
    public String type_of_environment;
    @NonNull
    @ColumnInfo(name = "amperage")
    public int amperage;


    public Amperage(int id, int nominal_size, @NonNull String material_type, @NonNull String insulation_type, @NonNull String type_amperage, @NonNull String number_of_core, @NonNull String type_of_environment, int amperage) {
        this.id = id;
        this.nominal_size = nominal_size;
        this.material_type = material_type;
        this.insulation_type = insulation_type;
        this.type_amperage = type_amperage;
        this.number_of_core = number_of_core;
        this.type_of_environment = type_of_environment;
        this.amperage = amperage;
    }

    protected Amperage(Parcel in) {
        id = in.readInt();
        nominal_size = in.readInt();
        material_type = in.readString();
        insulation_type = in.readString();
        type_amperage = in.readString();
        number_of_core = in.readString();
        type_of_environment = in.readString();
        amperage = in.readInt();
    }

    public static final Creator<Amperage> CREATOR = new Creator<Amperage>() {
        @Override
        public Amperage createFromParcel(Parcel in) {
            return new Amperage(in);
        }

        @Override
        public Amperage[] newArray(int size) {
            return new Amperage[size];
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

    @NonNull
    public String getType_amperage() {
        return type_amperage;
    }

    public void setType_amperage(@NonNull String type_amperage) {
        this.type_amperage = type_amperage;
    }

    @NonNull
    public String getNumber_of_core() {
        return number_of_core;
    }

    public void setNumber_of_core(@NonNull String number_of_core) {
        this.number_of_core = number_of_core;
    }

    @NonNull
    public String getType_of_environment() {
        return type_of_environment;
    }

    public void setType_of_environment(@NonNull String type_of_environment) {
        this.type_of_environment = type_of_environment;
    }

    public int getAmperage() {
        return amperage;
    }

    public void setAmperage(int amperage) {
        this.amperage = amperage;
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
        dest.writeString(type_amperage);
        dest.writeString(number_of_core);
        dest.writeString(type_of_environment);
        dest.writeInt(amperage);
    }
}
