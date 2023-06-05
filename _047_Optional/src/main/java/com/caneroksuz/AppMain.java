package com.caneroksuz;

import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {

        Ogrenci ogrenci= new Ogrenci("Ali");
        System.out.println("id ..... :" + ogrenci.getId());
        System.out.println("id ..... :" + ogrenci.getName());

        Ogrenci ogrenci2= new Ogrenci("Yiğitcan");
        System.out.println("id ..... :" + ogrenci2.getId());
        System.out.println("id ..... :" + ogrenci2.getName());

        Ogrenci ogrenci3= new Ogrenci("Aysu");
        System.out.println("id ..... :" + ogrenci3.getId());
        System.out.println("id ..... :" + ogrenci3.getName());

        Optional<Double> ortalama = ortalamaHesapla();

        if (ortalama.isPresent()){
            System.out.println("Ogrenci ortalaması : " + ortalama);
        }else {
            System.out.println("Henüz sınav yapılmadı");
        }
        System.out.println(ortalama);
    }

    private static Optional<Double> ortalamaHesapla(double... notlar) {


        return Optional.of(null);
    }
}