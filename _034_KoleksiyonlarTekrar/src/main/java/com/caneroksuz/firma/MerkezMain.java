package com.caneroksuz.firma;

import java.util.ArrayList;

public class MerkezMain {

    public static void main(String[] args) {

        Calisan calisan1 = new Calisan();
        calisan1.setAdi("Caner");
        calisan1.setSoyadi("Öksüz");
        calisan1.setId(1);;
        calisan1.setYasi(22);
        calisan1.setAdres("Ankara Aşağı Ayrancı");

        Calisan calisan2 = new Calisan(2,33,"Serkan","Zorlu","Ankara Yukarı Ayrancı");

        ArrayList<Calisan> calisanlarinListesi = new ArrayList<>();
        calisanlarinListesi.add(calisan1);
        calisanlarinListesi.add(calisan2);
        System.out.println(calisanlarinListesi);
        System.out.println(calisanlarinListesi.get(0));
        System.out.println(calisanlarinListesi.get(1));
    }
}
