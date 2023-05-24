package com.caneroksuz;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        List<String> listeOgreci = new ArrayList<>();

        listeOgreci.add("Ahmet");
        listeOgreci.add("Gizem");
        listeOgreci.add("Ali");
        listeOgreci.add("Salih");
        listeOgreci.add("Burak");

        System.out.println(listeOgreci);

        for (String ogrenci : listeOgreci) {
            System.out.println(ogrenci);
        }

        System.out.println("---------------------------------");

        for (int i = 0; i < listeOgreci.size(); i++) {
            System.out.println(listeOgreci.get(i) + " ");
        }

        System.out.println("---------------------------------");

        listeOgreci.forEach(ogrenci-> System.out.println(ogrenci + " "));

    }
}
