package com.caneroksuz;

public class AppMain {

    public static void main(String[] args) {

        Kedi kedi = new Kedi();
        Kopek kopek = new Kopek();
        Kus kus = new Kus();

        kedi.ses();
        kopek.ses();
        kus.ses();

        if (kedi instanceof Hayvan){
            System.out.println(kedi);
        }

        if (kopek instanceof Hayvan){
            System.out.println(kopek);
        }

        if (kus instanceof Hayvan){
            System.out.println(kus);
        }

        if (kus instanceof Kus){
            System.out.println(kus);
        }

        Veteriner veteriner = new Veteriner();
        String gelenCevap = veteriner.hayvanBilgisiAl(kedi);
        System.out.println(gelenCevap);

        gelenCevap = veteriner.hayvanBilgisiAl(kopek);
        System.out.println(gelenCevap);

        gelenCevap = veteriner.hayvanBilgisiAl(kus);
        System.out.println(gelenCevap);
    }
}
