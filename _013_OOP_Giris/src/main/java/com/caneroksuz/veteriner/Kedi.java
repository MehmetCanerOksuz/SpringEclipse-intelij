package com.caneroksuz.veteriner;

public class Kedi extends EvcilHayvan{
    @Override
    void hayvanSesVer() {
        System.out.println("Miyav miyav");
    }

    @Override
    void yazdir() {
        System.out.println("Kedi sınıfı");

    }

    @Override
    boolean chipiKontrolEt(String chipDurumu) {
        return false;
    }

}
