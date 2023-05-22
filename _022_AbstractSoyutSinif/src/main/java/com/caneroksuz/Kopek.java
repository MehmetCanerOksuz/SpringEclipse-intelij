package com.caneroksuz;

public class Kopek extends Hayvan{

    @Override
    public void yemekYe(){
        System.out.println("Kopek sınıfındaki yemek yeme normal metodudur.");
    }

    @Override
    public void sesVer() {
        System.out.println("Hav hav - Abstract metod");
    }

    @Override
    public void hareketEt() {

    }


    @Override
    public void bilgisiniGetir() {

    }
}
