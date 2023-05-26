package com.caneroksuz;

import java.util.*;

public class AppMain {

    public static void main(String[] args) {

        List <Integer>   myArrayList = new ArrayList<>();
        myArrayList.add(100);

        ArrayList myArraylist2 = new ArrayList();

        myArraylist2.add("Caner");
        myArraylist2.add(20);
        myArraylist2.add(true);
        myArraylist2.add('a');


        List <String>   myArrayList3 = new ArrayList<>();
        myArrayList3.add("Aysu");
        myArrayList3.add("Serkan");
        myArrayList3.add("gizem");
        myArrayList3.add("Ali");

        System.out.println(myArrayList3);
        System.out.println(myArrayList3.get(0));
        myArrayList3.set(0, myArrayList3.get(0).toUpperCase());
        System.out.println(myArrayList3.get(0));

        ArrayList <String> myArraylist4 = new ArrayList();
        myArraylist4.add("Aysu");
        myArraylist4.add("Serkan");
        myArraylist4.add("gizem");
        myArraylist4.add("Ali");

        System.out.println(myArraylist4);

        myArraylist4.remove("Aysu");
        System.out.println();

        ArrayList <Integer> myArraylist5 = new ArrayList();
        myArraylist5.add(1);
        myArraylist5.add(2);
        myArraylist5.add(3);
        myArraylist5.add(55);
        myArraylist5.add(null);
        myArraylist5.add(null);
        myArraylist5.add(null);

        System.out.println(myArraylist5);

        List <String> mylinkedList1 = new LinkedList<>();
        mylinkedList1.add("Aysu");
        mylinkedList1.add("Serkan");
        mylinkedList1.add("gizem");
        mylinkedList1.add("Ali");
        mylinkedList1.add("Ali");
        mylinkedList1.add(null);
        mylinkedList1.add(null);
        mylinkedList1.add(null);
        System.out.println(mylinkedList1);

        System.out.println("-----------------------------------");

        List <String> myVektorList1 = new Vector<>();
        myVektorList1.add("Aysu");
        myVektorList1.add("Serkan");
        myVektorList1.add("gizem");
        myVektorList1.add("Ali");
        myVektorList1.add("Ali");
        myVektorList1.add(null);
        myVektorList1.add(null);
        myVektorList1.add(null);
        System.out.println(myVektorList1);

        System.out.println("-----------------------------------");

        Stack <String> myStackList = new Stack<>();
        myStackList.add("Aysu");
        myStackList.push("Serkan");
        myStackList.add("gizem");
        myStackList.add("Ali");
        myStackList.add("Ali");
        myStackList.add(null);
        myStackList.add(null);
        myStackList.add(null);
        System.out.println(myStackList);

        myStackList.pop();
        System.out.println(myStackList);

        myStackList.remove(0);
        System.out.println(myStackList);
        myStackList.set(5,"Burak");
        System.out.println(myStackList);

    }
}
