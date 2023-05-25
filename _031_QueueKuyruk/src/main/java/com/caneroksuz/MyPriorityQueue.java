package com.caneroksuz;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MyPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue <Integer> sayilarKuyrugu = new PriorityQueue<>();
        System.out.println(sayilarKuyrugu);
        sayilarKuyrugu.add(Integer.valueOf(10));
        sayilarKuyrugu.add(25);

        sayilarKuyrugu.add(Integer.valueOf("2400"));

        Integer okunanSayi = sayilarKuyrugu.remove();
        System.out.println("\n1.Durum OKUNAN SAYI : " + okunanSayi);
        System.out.println(sayilarKuyrugu);

        okunanSayi = sayilarKuyrugu.remove();
        System.out.println("\n2.Durum OKUNAN SAYI : " + okunanSayi);
        System.out.println(sayilarKuyrugu);

        okunanSayi = sayilarKuyrugu.remove();
        System.out.println("\n3.Durum OKUNAN SAYI : " + okunanSayi);
        System.out.println(sayilarKuyrugu);

    }
}
