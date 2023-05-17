package com.caneroksuz.ornekler;

public class MethodParametreleri {

    public static void main(String[] args) {

        int sonuc = kelimeUzunluguSay("Ahmet");
        System.out.println(sonuc);

        kelimeUzunluguSay("    Ahmet    ", 'A');
        System.out.println();
    }

    private static int kelimeUzunluguSay(String kelime, char durum) {

        if(durum =='A'){
            System.out.println(kelime.toUpperCase().trim());
            return kelime.toUpperCase().trim().length();
        }else {
            System.out.println(kelime);
            return kelime.length();
        }
    }

    private static int kelimeUzunluguSay(String kelime) {
        return kelime.length();
    }
}
