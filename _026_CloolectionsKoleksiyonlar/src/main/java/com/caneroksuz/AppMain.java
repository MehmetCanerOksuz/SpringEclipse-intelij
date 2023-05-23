package com.caneroksuz;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        short sayi = 5;

        List liste1 = new ArrayList();
        liste1.add(10);
        liste1.add("Serkan");
        liste1.add(30.0f);
        liste1.add("Caner");
        System.out.println(liste1);
        liste1.add(2,32);
        System.out.println(liste1);


        List<String> liste2 = new ArrayList<>();
        liste2.add("Aysu");
        liste2.add("Osman");
        liste2.add("Abdullah");
        liste2.add("Gizem");
        System.out.println(liste2);

        System.out.println(liste2.size());

        System.out.println(liste2.get(0));
        System.out.println(liste2.get(1));
        System.out.println(liste2.get(2));
        System.out.println(liste2.get(3));


        List<Integer> liste3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            liste3.add(0,10*i);
        }

        System.out.println(liste3);
    }
}
