package com.caneroksuz.solidprensipleri;

import java.util.ArrayList;
import java.util.List;

public class Musteri {

    private String adi;
    private String soyadi;
    private List<Adres> adresList;

    public Musteri() {
    }

    public Musteri(String adi, String soyadi, List<Adres> adresList) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.adresList = new ArrayList<>();
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public List<Adres> getAdresList() {
        return adresList;
    }

    public void setAdresList(List<Adres> adresList) {
        this.adresList = adresList;
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", adresList=" + adresList +
                '}';
    }
}
