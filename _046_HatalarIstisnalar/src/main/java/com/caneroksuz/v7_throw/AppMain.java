package com.caneroksuz.v7_throw;

public class AppMain {

    public static void main(String[] args) {

        try {
            sifiraBolmeHatasi();
            System.out.println("======try=======");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("======catch======");
        }finally {
            System.out.println("======finally======");
        }



        System.out.println("============");
    }

    private static void sifiraBolmeHatasi() {

        System.out.println("======================");
        throw new  ArithmeticException("Denedik sıfıra bolme olmadı bee ");
    }
}
