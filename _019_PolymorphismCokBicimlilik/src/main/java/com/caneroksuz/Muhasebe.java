package com.caneroksuz;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Muhasebe extends Memur{

   // private boolean maliYetki;  boolean olunca get değil is oluyor..
    private Boolean maliYetki;

    @Override
    public void hesapla(){
        System.out.println("Muhasebe hesapla metodu");
    }

    public void hesapla(int maas){
        System.out.println("Muhasabe maas : " + maas);
    }
    public void hesapla(int maas, int katSayi) {
        System.out.println("Muhasabe maas : " + (maas * katSayi));
    }

}
