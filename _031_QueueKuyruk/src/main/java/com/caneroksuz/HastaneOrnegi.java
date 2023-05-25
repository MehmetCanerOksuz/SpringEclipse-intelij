package com.caneroksuz;

import java.util.LinkedList;
import java.util.Queue;

public class HastaneOrnegi {

    public static void main(String[] args) {


        Queue<String> hastaKuyrugu = new LinkedList<>();
        hastaKuyrugu.add("Ali");
        hastaKuyrugu.add("Burak");
        hastaKuyrugu.add("Orhun");
        hastaKuyrugu.add("Engin");
        hastaKuyrugu.offer("Serkan");
        System.out.println(hastaKuyrugu);
        hastaKuyrugu.forEach(System.out::println);
        hastaKuyrugu.forEach(hasta-> System.out.print(hasta + " "));

        System.out.println("\n -------------------------------------");

        String hastaBilgisi = hastaKuyrugu.peek();
        System.out.println("Tabelada Okunan Hasta Bilgisi :  " + hastaBilgisi);
        hastaBilgisi = hastaKuyrugu.remove();
        System.out.println("Odadaki Hasta Bilgisi : " + hastaBilgisi);

        System.out.println(" -------------------------------------");

        hastaBilgisi = hastaKuyrugu.peek();
        System.out.println("Tabelada Okunan Hasta Bilgisi :  " + hastaBilgisi);
        hastaBilgisi = hastaKuyrugu.remove();
        System.out.println("Odadaki Hasta Bilgisi : " + hastaBilgisi);


    }
}
