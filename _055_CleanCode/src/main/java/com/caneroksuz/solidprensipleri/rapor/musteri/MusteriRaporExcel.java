package com.caneroksuz.solidprensipleri.rapor.musteri;

import com.caneroksuz.solidprensipleri.Musteri;
import com.caneroksuz.solidprensipleri.Rapor;
import com.caneroksuz.solidprensipleri.rapor.IExcel;


public class MusteriRaporExcel extends Rapor implements IExcel {

    @Override
    public void musteriRaporBilgisiniNotEt(Musteri musteri) {

        System.out.println("musteriRaporBilgisiniNotEt : " + musteri.getAdi() + " " + musteri.getSoyadi());
    }

    @Override
    public void musteriRaporExcel(Musteri musteri) {

        System.out.println("musteriRaporExcel : " + musteri.getAdi() + " " + musteri.getSoyadi());
    }
}
