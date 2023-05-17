package com.caneroksuz.tekrar;

public class _02_Operatörler {

    public static void main(String[] args) {
        /*
        int s1;
        s1=10;

        int s2;
        s2=4;
         */

        int s1 = 10, s2 = 4;
        float sonuc;
        sonuc = s1 + s2;
        System.out.println(sonuc);

        sonuc = s1 - s2;
        System.out.println(sonuc);

        sonuc = s1 * s2;
        System.out.println(sonuc);

        sonuc = (float)s1 / s2;
        System.out.println(sonuc);

        sonuc = sonuc +s1;
        System.out.println(sonuc);

        sonuc++;
        System.out.println(sonuc);

        ++sonuc;
        System.out.println(sonuc);

        String kullanici = "Mehmet";
        String parola = "123";
        boolean onay = kullanici == "Mehmet";
        System.out.println(onay);

        boolean onay2 = (kullanici == "Mehmet")&&(parola =="123");
        System.out.println(onay2);


    }
}
