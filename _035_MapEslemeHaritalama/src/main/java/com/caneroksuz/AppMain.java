package com.caneroksuz;

import java.util.HashMap;
import java.util.Map;

public class AppMain {
    public static void main(String[] args) {

        Map mapListesi = new HashMap();
                        //key       //value
        mapListesi.put("Ankara","Türkiye");      //anahtar 1 tane olabilir...
        mapListesi.put( "Ottowa","Kanada" );
        mapListesi.put( "Londra","İngiltere");
        mapListesi.put("Berlin","Almanya");
        mapListesi.put("İstanbul","Türkiye");


        System.out.println(mapListesi);

        System.out.println(mapListesi.get("Ankara"));
        System.out.println(mapListesi.get("İstanbul"));

        mapListesi.remove("Londra");
        System.out.println(mapListesi);

        System.out.println(mapListesi.size());

        //mapListesi.clear();

        System.out.println(mapListesi.size());
        System.out.println(mapListesi);

        for ( Object ulke : mapListesi.values()) {
            System.out.println(ulke);
        }

        System.out.println("---------------");

        for ( Object sehir : mapListesi.keySet()) {
            System.out.println(sehir);
        }



    }
}