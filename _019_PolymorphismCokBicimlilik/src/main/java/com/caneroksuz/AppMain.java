package com.caneroksuz;

public class AppMain {

    public static void main(String[] args) {

        Muhasebe muhasebe = new Muhasebe();
      //  muhasebe.isMaliYetki(); //booleansa get yok , is var..
        muhasebe.setAdi("Burak");
        muhasebe.setSoyadi("Delice");
        muhasebe.setMaliYetki(Boolean.TRUE);
        muhasebe.setKidemYili((short) 3);
        muhasebe.setUnvani("Mali Müşavir");

        System.out.println("ADI : " + muhasebe.getAdi());
        System.out.println("SOYADI : " + muhasebe.getSoyadi());
        System.out.println("Yetki : " +muhasebe.getMaliYetki());
        System.out.println("Kıdem Yılı : " + muhasebe.getKidemYili());
        System.out.println("Ünvanı : " + muhasebe.getUnvani());

        muhasebe.hesapla();
        muhasebe.hesapla(20000,3);

    }
}
