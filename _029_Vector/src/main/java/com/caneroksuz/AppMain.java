package com.caneroksuz;

import java.util.ArrayList;
import java.util.Vector;

public class AppMain {

    public static void main(String[] args) {

        Vector vektorList = new Vector(2,50);

        vektorList.add(10);
        vektorList.add("Caner");
        vektorList.add(12.4);
        System.out.println(vektorList);
        System.out.println(vektorList.capacity());

        ArrayList asd = new ArrayList(100);
    }
}
