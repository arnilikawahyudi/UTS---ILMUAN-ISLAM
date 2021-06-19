package com.example.ilmuanislam;

import android.os.Parcel;
import android.os.Parcelable;

public class Ilmuan implements Parcelable {

    private String nama_ilmuan;
    private String detail_ilmuan;
    private int photo;
    private String harga;
    private String karya;


    public Ilmuan() {

    }

    public String getNama_ilmuan() {
        return nama_ilmuan;
    }

    public void setNama_ilmuan(String nama_ilmuan) {
        this.nama_ilmuan = nama_ilmuan;
    }

    public String getDetail_ilmuan() {
        return detail_ilmuan;
    }

    public void setDetail_ilmuan(String detail_ilmuan) {
        this.detail_ilmuan = detail_ilmuan;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getHarga() {
        return harga;
    }

    public String getKarya() {
        return karya;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setKarya(String karya) {
        this.karya = karya;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama_ilmuan);
        parcel.writeString(detail_ilmuan);
        parcel.writeInt(photo);
        parcel.writeString(harga);
        parcel.writeString(karya);
    }

    protected Ilmuan(Parcel in) {
        nama_ilmuan = in.readString();
        detail_ilmuan = in.readString();
        photo = in.readInt();
        harga = in.readString();
        karya = in.readString();
    }

    public static final Creator<Ilmuan> CREATOR = new Creator<Ilmuan>() {
        @Override
        public Ilmuan createFromParcel(Parcel in) {
            return new Ilmuan(in);
        }

        @Override
        public Ilmuan[] newArray(int size) {
            return new Ilmuan[size];
        }
    };

}
