package com.caneroksuz;

public class Kedi extends Hayvan{

    @Override
    public void yemekYe(){
        System.out.println("Kedi sınıfındaki yemek yeme normal metodu.");
    }

    @Override
    public void sesVer() {
        System.out.println("Miyav miyav - Abstract metod");
    }

    @Override
    public void hareketEt() {

    }


    @Override
    public void bilgisiniGetir() {

    }
}
