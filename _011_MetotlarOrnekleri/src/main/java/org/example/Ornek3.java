package org.example;

public class Ornek3 {

    public Ornek3(){
        System.out.println("Hazırlayıcı");
    }
    public static void selamVer(){
        System.out.println("Selam ver");
    }

    public static void main(String[] args) {
        System.out.println("Main deneme 1");


        System.out.println();
        selamVer();
        Ornek3 obj = new Ornek3();
        System.out.println("Main deneme 2");

        String str1 = new String();

    }
}
