package com.caneroksuz;

public class AppMain {

    public static void main(String[] args) {
        System.out.println("Ana merkez sınıf");

        Araba araba = new Araba();
        //Yakit yakit = new Yakit(); // Yakit i araba içinde çağırdık...

        araba.hareketeGec();
    }
}
