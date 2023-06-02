package com.caneroksuz.javadate;

import java.util.Date;

public class JavaDateSinifi {

    public static void main(String[] args) {

        Date zaman = new Date();

        System.out.println("Zaman bilgisi : " + zaman);
        System.out.println("Milisaniye : " + zaman.getTime());
    }
}
