package com.caneroksuz;

import com.caneroksuz.arac.Motor;
import com.caneroksuz.arac.Otobus;
import com.caneroksuz.personel.Surucu;

public class AppMain {

    public static void main(String[] args) {

        Otobus otobus = new Otobus();
        otobus.setPlakaNo("34ABCDEF1453");
        otobus.setModel(2021);
        otobus.setTekerSayisi(16);
        otobus.setKoltukSayisi(54);

        Surucu surucu = new Surucu();
        surucu.setAdi("Burak");
        surucu.setSoyadi("Delice");
        surucu.setKimlikNo("12345679865");
        surucu.setMaas(50000.0);
        surucu.setEhliyetYili(2000);
        otobus.setSurucu(surucu);

        System.out.println(otobus);
        System.out.println(otobus.getPlakaNo());
        System.out.println(otobus.getKoltukSayisi());
        System.out.println(otobus.getSurucu().getAdi());
        System.out.println(otobus.getSurucu().getSoyadi());
        System.out.println(otobus.getSurucu().getKimlikNo());
        System.out.println(otobus.getSurucu().getMaas());
        System.out.println(otobus.getSurucu().getEhliyetYili());

        otobus = new Otobus();
        otobus.setPlakaNo("06ABCDEF1402");
        otobus.setModel(2023);
        otobus.setTekerSayisi(14);
        otobus.setKoltukSayisi(46);

        System.out.println(otobus.getPlakaNo());
        System.out.println(otobus.getKoltukSayisi());


        Motor motor = new Motor();
        motor.setPlakaNo("17ABCDEF2402");
        motor.setModel(2021);
        motor.setTekerSayisi(2);
        motor.setKoltukSayisi(1);

    }
}
