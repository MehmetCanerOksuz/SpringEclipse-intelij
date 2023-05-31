package com.caneroksuz.v4;

public class AppMain {

    public static void main(String[] args) {

        GenericType<Integer> deneme = new GenericType<>(42);
        deneme.sinifinTipiniyazdir();

        GenericType<String> deneme2 = new GenericType<>("Orhun");
        deneme2.sinifinTipiniyazdir();
    }
}
