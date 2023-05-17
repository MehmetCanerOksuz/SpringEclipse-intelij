import java.lang.reflect.Array;
import java.time.*;
import java.util.Arrays;

public class AppMain {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("--------------------");

        String str1 = "abc";
        System.out.println(str1.startsWith("a"));   // a ile mi başlıyor ?
        System.out.println(str1.endsWith("c"));     // c ile mi bitiyor ?

        System.out.println(str1.contains("b"));     // b içeriyor mu ??

        String personelAdi = " Mehmet Caner ";
        System.out.println(personelAdi);
        personelAdi =personelAdi.trim();
        System.out.println(personelAdi);

        var adi = "Ahmet Akkoyun";
        System.out.println(adi.toUpperCase());      // Bütün harfleri büyük yapma..

        var yasi = 25;
        System.out.println(yasi);

        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println("".isBlank());

        var piSayisi = 41243.142363737;
        System.out.format("%.2f",piSayisi);   //formatlayarak yazma..
        System.out.println("----------------");

        var x = "Ali";
        var y = "Ali";
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println("----------------");

        String z = "Ali";
        System.out.println(x == z);
        System.out.println(x.equals(z));
        System.out.println("----------------");

        String n = new String("Ali");
        System.out.println(x == n);      // referans a bakar,  (adreslere) bakar..
        System.out.println(x.equals(n)); // İçteki değere bakar..
        System.out.println("----------------");

        System.out.println(" " + 1 + 2);
        System.out.println(1 + " " + 2 + 3);
        System.out.println(1 + 2 + " " + 8);
        System.out.println("----------------");

        String [] hayvanlar = {"Deve", "Maymun", "Aslan", "Kaplan"};
        System.out.println(hayvanlar.length);
        System.out.println(hayvanlar[0]);    // Deve
        hayvanlar[0]="Kedi";
        System.out.println(hayvanlar[0]);    // Kedi

        System.out.println("----------------");

        for (int i = 0; i < hayvanlar.length; i++) {
            System.out.println(hayvanlar[i]);
        }
        System.out.println("----------------");

        Arrays.sort(hayvanlar);         // Alfabetik sıralama..
        for (int i = 0; i < hayvanlar.length; i++) {
            System.out.println(hayvanlar[i]);
        }

        var simdi = Instant.now();
        System.out.println(simdi);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        var tarih = LocalDate.of(2023,Month.MAY,10);
        System.out.println(tarih);

        System.out.println(tarih.plusDays(29));    // 29 gün ekleyince tarih ne olur??
        System.out.println(tarih.minusMonths(6).minusDays(12));  // 6 ay , 12 gün  çıkarınca ??
    }

 }