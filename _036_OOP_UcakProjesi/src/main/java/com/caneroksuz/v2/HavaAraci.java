package com.caneroksuz.v2;

public class HavaAraci {

    float uzunluk;
    float yukseklik;
    int hiz;
    float agirlik;
    boolean havadaMi;
   static int toplamUcakSayisi;
   static int pilot;

    {
        System.out.println("Static block - Uçak oluşturuldu..");    // static block her şeyden önce çalışır...
        toplamUcakSayisi++;
        pilot+=2;
    }
    static {
        System.out.println("Static block 1 kere çağırılır.");
    }

    public HavaAraci() {
        System.out.println("Parametresiz hazırlayıcı");
        //toplamUcakSayisi++;
    }

    public boolean inisKontrol(){
        if (havadaMi){
            System.out.println("Ucak hava da iniş yapabilir..");
            return true;
        }else {
            System.out.println("Ucak zaten hava yerde..");
            return false;
        }

    }

    public boolean kalkisKontrol(){
        if (havadaMi){
            System.out.println("Ucak zaten havada...");
            return false;
        }else {
            System.out.println("Ucak kalkis yapabilir..");
            return true;
        }
    }

    public HavaAraci(float uzunluk, float yukseklik, int hiz, float agirlik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;

        //toplamUcakSayisi++;
        System.out.println("4 parametreli hazırlayıcı");
    }

    public HavaAraci(float uzunluk, float yukseklik, int hiz, float agirlik, boolean havadaMi) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        this.hiz = hiz;
        this.agirlik = agirlik;
        this.havadaMi = havadaMi;

        //toplamUcakSayisi++;
        System.out.println("5 parametreli hazırlayıcı");
    }

    @Override
    public String toString() {
        return "HavaAraci{" +
                "uzunluk=" + uzunluk +
                ", yukseklik=" + yukseklik +
                ", hiz=" + hiz +
                ", agirlik=" + agirlik +
                ", havadaMi=" + havadaMi +
                '}';
    }
}
