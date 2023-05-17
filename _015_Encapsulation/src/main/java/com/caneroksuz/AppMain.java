package com.caneroksuz;

public class AppMain {

    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen(10,3);
        dikdortgen.getHesaplaAlan();
        dikdortgen.getHesaplaCevre();
        System.out.println(dikdortgen.getHesaplaAlan());
        System.out.println(dikdortgen.getHesaplaCevre());
    }
}
