package com.caneroksuz;

import java.util.ArrayList;

public class Ornek1 {

    public static void main(String[] args) {

        ArrayList<Integer> canerListesi1 = new ArrayList<>();

        canerListesi1.add(12);
        canerListesi1.add(24);

        ArrayList<Integer> canerListesi2 = new ArrayList<>();

        canerListesi2.add(19);
        canerListesi2.add(2);

        ArrayList<Integer> canerListesi3 = new ArrayList<>();
        canerListesi3.addAll(canerListesi1);
        canerListesi3.addAll(canerListesi2);
        System.out.println(canerListesi3);

        System.out.println(canerListesi3.get(2));
        canerListesi3.set(2,99);
        System.out.println(canerListesi3.get(2));
    }
}
