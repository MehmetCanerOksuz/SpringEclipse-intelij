package com.caneroksuz.v3;

public class AppMain {
    public static void main(String[] args) {

        CalisanManager<Integer> calisan1 = new CalisanManager<>();
        calisan1.adi = "Ali";
        calisan1.soyadi = "Güneş";
        calisan1.maas = 40000;
        calisan1.setKayitNumarasi("12345");

        CalisanManager<String> calisan2 = new CalisanManager<>();
        calisan2.adi = "Mehmet";
        calisan2.soyadi = "Caner";
        calisan2.maas = "40000";
        calisan2.setKayitNumarasi("12345");

        System.out.println(calisan1.getBilgiAl());
        System.out.println(calisan2.getBilgiAl());
    }
}
