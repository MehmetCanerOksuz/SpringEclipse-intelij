package com.caneroksuz.ornekler;

public class ArttirimAzaltim {
    public static void main(String[] args) {

        int a = 5;
        int b = 9;

     /*   int sonuc = a++;
        System.out.println(sonuc);

        System.out.println(a);

        sonuc = ++a;
        System.out.println(sonuc);
*/
        int sonuc = a++ + ++a  -  b-- - --b;
        System.out.println(sonuc);
    }
}
