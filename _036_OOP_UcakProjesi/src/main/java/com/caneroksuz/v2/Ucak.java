package com.caneroksuz.v2;

public class Ucak extends HavaAraci{

    float kanatUzunlugu;

    public boolean suyaInis(){

        return true;
    }

    public Ucak() {
    }

    public Ucak(float uzunluk, float yukseklik, int hiz, float agirlik, boolean havadaMi) {
        super(uzunluk, yukseklik, hiz, agirlik, havadaMi);
    }

    public Ucak(float uzunluk, float yukseklik, int hiz, float agirlik, boolean havadaMi, float kanatUzunlugu) {
        super(uzunluk, yukseklik, hiz, agirlik, havadaMi);
        this.kanatUzunlugu = kanatUzunlugu;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "kanatUzunlugu=" + kanatUzunlugu +
                ", uzunluk=" + uzunluk +
                ", yukseklik=" + yukseklik +
                ", hiz=" + hiz +
                ", agirlik=" + agirlik +
                ", havadaMi=" + havadaMi +
                '}';
    }
}
