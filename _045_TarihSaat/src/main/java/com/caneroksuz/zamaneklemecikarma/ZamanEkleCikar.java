package com.caneroksuz.zamaneklemecikarma;

import java.time.LocalDate;

public class ZamanEkleCikar {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2024,1, 8);

        System.out.println(localDate);
        System.out.println("10 gün ekleme yapıldı : " + localDate.plusDays(15));
        System.out.println("10 gün ekleme yapıldı : " + localDate.plusMonths(18));

        System.out.println("2 hafta ekleme yapıldı : " + localDate.plusWeeks(2));

        System.out.println("4 hafta çıkarma yapıldı : " + localDate.minusWeeks(4));

    }
}
