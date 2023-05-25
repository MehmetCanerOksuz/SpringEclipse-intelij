package com.caneroksuz;

import java.util.ArrayList;
import java.util.Iterator;

public class AppMain {

    public static void main(String[] args) {

        ArrayList<String> personList = new ArrayList<>();
        personList.add("Gizem");
        personList.add("Amine");
        personList.add("Engin");
        personList.add("Ali");
        personList.add("Serkan");
        personList.add("Caner");
        personList.add("Aysu");

        System.out.println(personList);

        Iterator<String> iterator = personList.iterator();
        //System.out.println(iterator.next());

        String aranan;
        while (iterator.hasNext()){
            aranan = iterator.next();
            System.out.println(aranan);
            //System.out.print(iterator.next() + " ");
            if ((aranan == "Ali") || (aranan == "Caner")){
                System.out.println("Bulundu");
                iterator.remove();
            }
        }
        System.out.println(personList);
    }
}
