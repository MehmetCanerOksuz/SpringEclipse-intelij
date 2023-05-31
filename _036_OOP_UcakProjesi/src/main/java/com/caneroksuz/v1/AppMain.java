package com.caneroksuz.v1;

public class AppMain {
    public static void main(String[] args){

        Ucak ucak1 = new Ucak();
        System.out.println(ucak1);

        Ucak ucak2 = new Ucak(35.2f,4.3f,20000,27000.1f);
        System.out.println(ucak2);

        Ucak ucak3 = new Ucak(35f,4.3f,20000,27000.1f,true);
        System.out.println(ucak3);


        System.out.println("Toplam ucak sayısı : " + Ucak.toplamUcakSayisi);
        System.out.println("Pilot sayısı : " + ucak3.pilot);
    }
}