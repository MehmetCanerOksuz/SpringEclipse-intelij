package com.caneroksuz;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {

        /*
        SET lerde tekrarlı kayıt yok..!!!
        ASLA null DEĞERİ KABUL ETMİYOR....
         */

        TreeSet<String> ogrenciList = new TreeSet<String>();
        ogrenciList.add("Abdullah");
        ogrenciList.add("Gizem");
        ogrenciList.add("Ali");
        ogrenciList.add("Burak");
        ogrenciList.add("Aysu");
        ogrenciList.add("Aminenur");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
        ogrenciList.add("Ali");
        //ogrenciList.add(null);

        System.out.println("HashSet : " + ogrenciList);
        ogrenciList.remove("3");

        System.out.println("HashSet : " + ogrenciList);

        //ogrenciList.clear();

        ogrenciList.remove("3");
        System.out.println("HashSet : " + ogrenciList);

    }
}
