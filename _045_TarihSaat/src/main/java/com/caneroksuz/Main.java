package com.caneroksuz;

import java.time.*;
import java.util.Date;

public class Main {

    /*
    Dogum tarihleri
    İslem tarhileri
    Kaydın sisteme eklenme zamanı
    Kaydın sistemde en son değiştirilme zamanı
    Lokasyon yerel konuma göre zaman

     */
    public static void main(String[] args) {

        System.out.println(new Date());
        System.out.println(new Date().getTime());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        System.out.println("-------------------------------");

        LocalDate localDate = LocalDate.of(2024,1,8);
        System.out.println(localDate);

        localDate = LocalDate.of(2024, Month.JANUARY,8);
        System.out.println(localDate);

        localDate = LocalDate.of(-500000,Month.FEBRUARY,8);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(22,50,18 );
        System.out.println(localTime);

        localTime = LocalTime.of(22,50,18, 1852);
        System.out.println(localTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(2028,8,25,14,53,10,1,ZoneId.of("Europe/Istanbul"));
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.toString());

        System.out.println("-----------------------");

        Long start1 = System.currentTimeMillis();
        System.out.println(start1);

        System.out.println("-----------------------");

        Long start2 = System.nanoTime();
        System.out.println(start2);

        Instant instantStart = Instant.now();
        System.out.println("Start : " + instantStart);

        Long baslangic = System.currentTimeMillis();

        long toplam=0;
        for (int i = 0; i < 2_000_000_000; i++) {
            toplam+=i;
        }
        Long stop = System.currentTimeMillis();

        Instant instantStop = Instant.now();
        System.out.println("Stop : " + instantStop);

        System.out.println("Toplam : " + toplam);
        System.out.println("Start : " + baslangic);
        System.out.println("Stop : " + stop);
        System.out.println("Fark : " + (stop-baslangic));
    }
}