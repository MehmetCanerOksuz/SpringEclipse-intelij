package org.example.ders1;

import com.sun.tools.javac.Main;

public class Ornek3 {

    enum Meslek {
        MUHENDIS, DOKTOR, OGRETMEN
    }

    public static void main(String[] args) {

        String unvan ="Dr.";
        System.out.println(unvan);

        Meslek meslek = Meslek.DOKTOR;
        System.out.println(meslek);

        unvan = Meslek.OGRETMEN.toString();    // String e çevirebiliriz..
        System.out.println(unvan);

    }
}
