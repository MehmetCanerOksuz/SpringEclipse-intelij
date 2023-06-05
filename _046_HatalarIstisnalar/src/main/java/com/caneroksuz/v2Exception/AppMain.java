package com.caneroksuz.v2Exception;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
   /*     int a =read.nextInt();
        int b =read.nextInt();
        float sonuc = a/b;

       System.out.println(a + " / " + b + " = " + sonuc);
     */
        try{
            System.out.println("HATAYA AÇIK KODLAR..");
            int a =read.nextInt();
            int b =read.nextInt();
            System.out.println("HATAYA AÇIK KODLAR..");
            int sonuc = a/b;
            System.out.println("HATAYA AÇIK KODLAR..");
            System.out.println(a + " / " + b + " = " + sonuc);
        }catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Hata varsa yapılacak şeyler..");
        }
        finally {
            System.out.println("Sonda ne yapılmasını istiyorsak onlar yapılır...");
        }

        System.out.println("--------------------");
    }
}