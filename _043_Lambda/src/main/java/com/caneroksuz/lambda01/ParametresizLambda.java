package com.caneroksuz.lambda01;

interface Sekil{

    public void dikdortgen();

}


public class ParametresizLambda{
    public static void main(String[] args) {

        int sayi = 50;


        Sekil sekil = new Sekil() {
            @Override
            public void dikdortgen() {
                System.out.println("Parametresiz Lambda Ornegi");
            }

        };
        sekil.dikdortgen();

        System.out.println("=======================================");

        Sekil sekil2 = () ->    System.out.println("Parametresiz Lambda Ornegi2");

        sekil2.dikdortgen();
    }
}