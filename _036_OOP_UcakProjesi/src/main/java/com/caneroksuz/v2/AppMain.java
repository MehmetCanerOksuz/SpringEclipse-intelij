package com.caneroksuz.v2;

public class AppMain {
    public static void main(String[] args){

        HavaAraci havaAraci1 = new HavaAraci();
        System.out.println(havaAraci1);

        HavaAraci havaAraci2 = new HavaAraci(35.2f,4.3f,20000,27000.1f);
        System.out.println(havaAraci2);

        HavaAraci havaAraci3 = new HavaAraci(35f,4.3f,20000,27000.1f,true);
        System.out.println(havaAraci3);

        Ucak ucak = new Ucak(35f,4.3f,20000,27000.1f,true,5f);
        System.out.println(ucak);

        System.out.println("Toplam ucak sayısı : " + HavaAraci.toplamUcakSayisi);
        System.out.println("Pilot sayısı : " + havaAraci3.pilot);


    }
}