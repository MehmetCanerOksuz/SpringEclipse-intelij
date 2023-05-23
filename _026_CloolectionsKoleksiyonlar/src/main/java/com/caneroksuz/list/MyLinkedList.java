package com.caneroksuz.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Mehmet");
        list1.add("Aysun");
        list1.add("Osman");
        list1.set(1,"Aysu");

        LinkedList<String> list2 = new LinkedList<>();

        list2.add("Mehmet");
        list2.add("Aysun");
        list2.add("Osman");
        list2.set(1,"Aysu");
        System.out.println(list2);

        list2.addFirst("Orhun");
        list2.addLast("Serkan");
        list2.add("Ahmet");

        Collections.sort(list2);  // Alfabetik sıralama
        System.out.println(list2);


    }
}
