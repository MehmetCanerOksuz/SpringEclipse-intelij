package com.caneroksuz.muhasebe;

public class AppMuhasebe {

    public static void main(String[] args) {
        MusteriHesabı musteriHesabı = new MusteriHesabı();
        musteriHesabı.setMusteriNo(100);
        System.out.println(musteriHesabı.getMusteriNo());

        // musteriHesabı.maas =20000;  //==>> maas private olduğu için yapamıyoruz.. sadece set / get..
        musteriHesabı.setMaas(20_000);
        System.out.println(musteriHesabı.getMaas());

        musteriHesabı.setMusteriNo(25);
        System.out.println(musteriHesabı.getMusteriNo());
    }
}
