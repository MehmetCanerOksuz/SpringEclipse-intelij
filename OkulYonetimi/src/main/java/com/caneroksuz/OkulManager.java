package com.caneroksuz;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class OkulManager {

    public static <T> void kayitEt(List<T> list,T t ){

        if (list.contains(t)){
            System.out.println("Kişi zaten listede kayıtlı");
        }else {
            list.add(t);
            System.out.println(t + "başarılı bir şekilde kaydedilmiştir.");
        }

    }

    public static <T> void KayitSil(List<T> list, T t){
        if (list.contains(t)){
            list.remove(t);
            System.out.println("Kişi başarılı bir şekilde silinmiştir..");
        }else {
            System.out.println("Kişi listede bulunamamıştır.");
        }
    }

    public static <T> void verileriGetir(T t){
        if (t ==null){
            System.out.println("Böyle bir bilgi bulunamamıştır");
        }else {
            System.out.println(t);
        }
    }

    public static void ogretmenOlustur(Okul okul){
        Ogretmen ogretmen1 = new Ogretmen("Caner","Oksuz",25000, LocalDate.of(2021,10,15),ESinif.SINIF1);
        Ogretmen ogretmen2 = new Ogretmen("Asli","Oksuz",25000, LocalDate.of(2022,12,15),ESinif.SINIF2);
        Ogretmen ogretmen3 = new Ogretmen("Omer","Oksuz",25000, LocalDate.of(2021,10,15),ESinif.SINIF3);

        kayitEt(okul.getOgretmenList(),ogretmen1);
        kayitEt(okul.getOgretmenList(),ogretmen2);
        kayitEt(okul.getOgretmenList(),ogretmen3);
    }

    public static void ogrenciOlustur(Okul okul){
        Ogrenci ogrenci1 = new Ogrenci("Caner","Oksuz",ESinif.SINIF1);
        Ogrenci ogrenci2 = new Ogrenci("Caner","Oksuz",ESinif.SINIF1);
        Ogrenci ogrenci3 = new Ogrenci("Caner","Oksuz",ESinif.SINIF1);
        Ogrenci ogrenci4 = new Ogrenci("Caner","Oksuz",ESinif.SINIF2);
        Ogrenci ogrenci5 = new Ogrenci("Caner","Oksuz",ESinif.SINIF2);
        Ogrenci ogrenci6 = new Ogrenci("Caner","Oksuz",ESinif.SINIF2);
        Ogrenci ogrenci7 = new Ogrenci("Caner","Oksuz",ESinif.SINIF3);
        Ogrenci ogrenci8 = new Ogrenci("Caner","Oksuz",ESinif.SINIF3);
        Ogrenci ogrenci9 = new Ogrenci("Caner","Oksuz",ESinif.SINIF3);
        Ogrenci ogrenci10 = new Ogrenci("Caner","Oksuz",ESinif.SINIF3);

        kayitEt(okul.getOgrenciList(),ogrenci1);
        kayitEt(okul.getOgrenciList(),ogrenci2);
        kayitEt(okul.getOgrenciList(),ogrenci3);
        kayitEt(okul.getOgrenciList(),ogrenci4);
        kayitEt(okul.getOgrenciList(),ogrenci5);
        kayitEt(okul.getOgrenciList(),ogrenci6);
        kayitEt(okul.getOgrenciList(),ogrenci7);
        kayitEt(okul.getOgrenciList(),ogrenci8);
        kayitEt(okul.getOgrenciList(),ogrenci9);
        kayitEt(okul.getOgrenciList(),ogrenci10);
    }

    public static void sinifOlustur(Okul okul){
        Sinif sinif1 = new Sinif(ESinif.SINIF1,okul.getOgretmenList().get(0));
        Sinif sinif2 = new Sinif(ESinif.SINIF1,okul.getOgretmenList().get(1));
        Sinif sinif3 = new Sinif(ESinif.SINIF1,okul.getOgretmenList().get(2));

        kayitEt(okul.getSinifList(),sinif1);
        kayitEt(okul.getSinifList(),sinif2);
        kayitEt(okul.getSinifList(),sinif3);
    }

    public static void memurOlustur(Okul okul){
        Memur memur1 = new Memur("Caner","Oksuz",25000, LocalDate.of(2021,10,15));
        Memur memur2 = new Memur("Mehmet","Oksuz",25000, LocalDate.of(2021,10,15));
    }

    public static double ortalamaHesapla(Ogrenci ogrenci){
        return ogrenci.getNotes().stream().collect(Collectors.averagingDouble(x->x) );
    }
    public static void RandomOgrenci(Okul okul){
        Random random = new Random();
        int index = random.nextInt(okul.getOgrenciList().size());
        ortalamaHesapla(okul.getOgrenciList().get(index));
    }

}
