package com.caneroksuz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapOrnek3 {

    public static void main(String[] args) {

        Map<String, String > plakaListesi = new LinkedHashMap<>();
        plakaListesi.put("Ankara","06");
        plakaListesi.put("İzmir","35");
        plakaListesi.put("Nevşehir","50");
        plakaListesi.put("Yozgat","06");
        plakaListesi.put("Adana","01");
        plakaListesi.put("Konya","42");
        System.out.println(plakaListesi);

        for (String anahtar : plakaListesi.keySet() ) {
            System.out.println("Şehirlerin plakası : " + anahtar + " " + plakaListesi.get(anahtar));
        }

    }
}
