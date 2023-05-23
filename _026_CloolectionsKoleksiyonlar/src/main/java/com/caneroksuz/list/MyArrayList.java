package com.caneroksuz.list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<String>  list2 = new ArrayList<>();

        list1.add(10);
        list1.add(25);

        list2.add("Ahmet");
        list2.add("Osman");
        list2.add("Gizem");

        System.out.println("Elemanları liste 1 : " + list1);
        System.out.println("Elemanları liste 2 : " + list2);

        System.out.println("Arama 1: " + list2.contains("Osman"));   //true
        System.out.println("Arama 2: " + list2.contains("osman"));   //false
        System.out.println("Arama 3: " + list1.contains(55));        //false

        List<String>  list3 = new ArrayList<>();
        list3.add("Ahmet");
        list3.add("Osman");
        list3.add("Gizem");
        list3.add("Caner");

        //  list3.add(list2.toString());
        //  System.out.println(list3);

        System.out.println("Eşitlik liste durumu : " + list2.equals(list3));
        System.out.println("Arama 3 : " + list3.containsAll(list2));   // içeriğinde var mı

        System.out.println("Liste boyutu : " + list3.size());

        System.out.println("Liste boş mu ?? Durumu : " + list3.isEmpty());

        // list3.clear(); // Listeyi sınırlama/boşaltma
        // System.out.println("Liste sıfırlama/boşaltma sonrası boyut : " + list3.size() );

        System.out.println(list3.get(0));
        list3.remove(0);
        System.out.println(list3.get(0));

        list3.add("Orhun");
        list3.add("Aysu");
        list3.add("Ünal");
        list3.add("Serkan");

        System.out.println(list3);

        System.out.println("Liste 2 : " + list2);
        System.out.println("Liste 3 : " + list3);

        list2.removeAll(list3);
        System.out.println(list2);

        System.out.println("Hash code : " + list3.hashCode());




    }
}
