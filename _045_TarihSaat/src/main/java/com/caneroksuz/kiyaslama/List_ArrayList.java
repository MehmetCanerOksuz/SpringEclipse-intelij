package com.caneroksuz.kiyaslama;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class List_ArrayList {

    public static void main(String[] args) {
        long start_time1 = System.currentTimeMillis();


        List<String> myRecord = new ArrayList<>();
        ArrayList<String> asd = new ArrayList<>();
        asd.trimToSize();

        for (int i = 0; i < 10_000_000; i++) {
            myRecord.add(""+i);
        }
/*
        for (String str : myRecord) {
            // System.out.println(str);
        }
*/
        long end_time1 = System.currentTimeMillis();
        System.out.println(end_time1 - start_time1);
    }
}
