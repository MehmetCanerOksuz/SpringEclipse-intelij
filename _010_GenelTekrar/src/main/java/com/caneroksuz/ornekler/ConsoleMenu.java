package com.caneroksuz.ornekler;

import java.util.Scanner;

public class ConsoleMenu {

    public static void main(String[] args) {

        menuyuGetir();
    }

    private static void akisGetir() {

        Scanner scanner = new Scanner(System.in);
        String secim = scanner.nextLine();

        switch (secim){
            case "1" :
                System.out.println("Girilen değer 1'dir");
                selamVer("Selamlar",-55);
                break;
            case "2" :
                System.out.println("Girilen değer 2'dir");
                break;
            case "3" :
                System.out.println("Girilen değer 3'dir");
                break;
            case "9" :
                System.out.println("Girilen değer 9 ve ÇIKIŞ");
                break;

            default:
                System.out.println("Olumsuz.");
                break;
        }

    }

    private static void selamVer(String selamlar, int i) {

        if (i>0){
            System.out.println(selamlar + " " + i + " sayısı Büyüktür");
        }else {
            System.out.println(selamlar + " " + i + " sayısı Küçüktür");
        }
    }

    private static void menuyuGetir() {
        System.out.println("Bir seçim yapınız.");
        System.out.println("Secim 1");
        System.out.println("Secim 2");
        System.out.println("Secim 3");
        System.out.println("Çıkış için 9");

        akisGetir();
    }
}
