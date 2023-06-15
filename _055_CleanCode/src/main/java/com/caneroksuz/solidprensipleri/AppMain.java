package com.caneroksuz.solidprensipleri;

import com.caneroksuz.solidprensipleri.rapor.musteri.MusteriRaporExcel;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        Musteri musteri = new Musteri();
        musteri.setAdi("Caner");
        musteri.setSoyadi("Oksuz");

        Adres adres = new Adres();
        adres.setSehir("Adana");
        adres.setCadde("Seyhan");
        adres.setSokak("Ceyhan");

        Adres adres2 = new Adres();
        adres.setSehir("Ankara");
        adres.setCadde("Seyhan");
        adres.setSokak("Ceyhan");

        List<Adres> adresler = new ArrayList<>();
        adresler.add(adres);
        adresler.add(adres2);

        musteri.setAdresList(adresler);

        System.out.println(musteri);


        MusteriRaporExcel musteriRaporExcel = new MusteriRaporExcel();
        musteriRaporExcel.musteriRaporBilgisiniNotEt(musteri);
        musteriRaporExcel.musteriRaporExcel(musteri);

    }
}