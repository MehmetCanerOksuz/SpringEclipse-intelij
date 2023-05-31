package com.caneroksuz;

public class JenerikMetot {

    public <K,V> void ekrandaYaz(K plaka, V sehir){
        System.out.println(plaka.getClass().getName());
        System.out.println(sehir.getClass().getName());
        System.out.println("----------------------------");
    }

}
