package com.caneroksuz.v2;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {

        ArrayList<String> javaListesi = new ArrayList<>();

        ListManager listebanaOzel= new ListManager();

        listebanaOzel.listeyeEkle("Aminenur");
        listebanaOzel.listeyeEkle("Aysu");
        listebanaOzel.listeyeEkle("Gizem");
        listebanaOzel.listeyeEkle(4);

        System.out.println(listebanaOzel.ListeyiGetir());

        ListManager<String> listebanaOzel2= new ListManager();

        listebanaOzel2.listeyeEkle("Aminenur");
        listebanaOzel2.listeyeEkle("Aysu");
        listebanaOzel2.listeyeEkle("Gizem");

        System.out.println(listebanaOzel2.ListeyiGetir());

        ListManager<Integer> listebanaOzel3= new ListManager();

        listebanaOzel3.listeyeEkle(111);
        listebanaOzel3.listeyeEkle(222);
        listebanaOzel3.listeyeEkle(333);

        System.out.println(listebanaOzel3.ListeyiGetir());

        for (String a : listebanaOzel2.ListeyiGetir() ) {
            System.out.println(a);
        }
    }
}
