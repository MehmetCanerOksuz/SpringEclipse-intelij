package com.caneroksuz;

import java.util.List;
import java.util.stream.Stream;

public class _00_AppMain {
    public static void main(String[] args) {

        Stream<String> bosKayit = Stream.empty();
        Stream<String> tekKayit = Stream.of("Setkan");
        Stream<String> cokluKayit = Stream.of("Aysu", "Gizem", "Aminenur");

        List<String> ogrencilerListesei = List.of("Burak", "Yüğütcan", "Abdullah", "Ahmet");
        Stream<String> ogrencilerStreami = ogrencilerListesei.stream();

        ogrencilerStreami.forEach(System.out::println);

        System.out.println("-------------------------------------------");

        Stream<String> ogrencilerStreami2 = ogrencilerListesei.stream();
        ogrencilerStreami2.forEach(x-> System.out.println(x));

        adiYaz("Osman");
        System.out.println("-------------------------------------------");

        Stream<String> ogrencilerStreami3 = ogrencilerListesei.stream();
        ogrencilerStreami3.forEach(ogrenci  ->{
            System.out.println("Ogrencilerin Bilgisi");
            System.out.println(ogrenci);
            System.out.println("Teşekkürler");
        });


    }

    private static void adiYaz(String ogrenci) {
        System.out.println(ogrenci);
    }
}