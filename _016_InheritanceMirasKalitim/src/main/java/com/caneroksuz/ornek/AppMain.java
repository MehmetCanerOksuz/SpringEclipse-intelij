package com.caneroksuz.ornek;

public class AppMain {

    public static void main(String[] args) {

        Mudur mudur = new Mudur();
        mudur.setAdi("Mehmet Caner");
        mudur.setSoyadi("Öksüz");
        mudur.setAdres("Berlin");
        mudur.setMudurDerecesi("Genel Müdür");
        mudur.setMaasKatSayi(50);
        mudur.setTahsisliPersonel("Lisans");
        mudur.setYoneticiDepartman("Büyükelçi");
        mudur.setGorevTazminati(1_000_000);
        mudur.setTc("12345678900");

        System.out.println(mudur);

        System.out.println("================");
        Hizmetli hizmetli = new Hizmetli();
        int[] sorumlulukKatlari = new int [] {2,5,6,10};
        hizmetli.setKatGorevAlani(sorumlulukKatlari);
        for (int kat : hizmetli.getKatGorevAlani()){
            System.out.println(kat);
        }
        System.out.println(hizmetli.getKatGorevAlani()[1]);

        System.out.println(hizmetli);
    }
}
