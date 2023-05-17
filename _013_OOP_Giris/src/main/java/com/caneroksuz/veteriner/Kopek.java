package com.caneroksuz.veteriner;

public class Kopek extends EvcilHayvan{
    @Override
    void hayvanSesVer() {
        System.out.println("Hav hav");
    }

    @Override
    void yazdir() {
        System.out.println("Köpek sınıfı");

    }

    @Override
    boolean chipiKontrolEt(String chipDurumu) {
        return false;
    }

}
