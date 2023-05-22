package com.caneroksuz;

public class AppMain {

    public static void main(String[] args) {

        // Hayvan hayvan = new Hayvan();
        // Soyut sınıftan asla nesne oluşturulmaz...

        //Abstract sınıfı miras alabiliriz..

        Kedi kedi = new Kedi();
        kedi.yemekYe();

        kedi.sesVer();

        Kopek kopek = new Kopek();
        kopek.yemekYe();
        kopek.sesVer();

        Hayvan hayvan1 = new Kedi();
        hayvan1.sesVer();

        Hayvan hayvan2 = new Kopek();
        hayvan2.sesVer();


    }
}
