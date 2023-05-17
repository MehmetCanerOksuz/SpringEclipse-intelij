package com.caneroksuz.ornekler;

public class MetotAsiriYuklenmesiOverloading {
    // bir metodun aşırı yüklenmesidir. Aynı isimli fakat parametreleri farklı olan metotların olmasıdır.

    public static void main(String[] args) {
        ciz();
        ciz("Ali");
        ciz("Mehmet","Öksüz");

    }

    private static void ciz() {
        System.out.println("----------------------");
    }

    private static void ciz(String adi) {
        System.out.println("---------------------- : "+adi);
    }

    private static void ciz(String adi, String soyadi) {
        System.out.println("---------------------- : "+adi+" "+soyadi);
    }
}
