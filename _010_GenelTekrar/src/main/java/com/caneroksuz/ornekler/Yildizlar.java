package com.caneroksuz.ornekler;

public class Yildizlar {

    public static void main(String[] args) {

        for (int i = 0; i < 4 ; i++) {       //satir
            for (int j = 0; j < 5; j++) {    //sütun
                System.out.print("* ");
            }
            System.out.println();
        }

        cizgiCek();


        for (int i = 0; i < 4 ; i++) {       //satir
            for (int j = 0; j < i+1; j++) {    //sütun
                System.out.print("* ");
            }
            System.out.println();
        }

        cizgiCek();

        for (int i = 4; i > 0 ; i--) {       //satir
            for (int j = 0; j < i; j++) {    //sütun
                System.out.print("* ");
            }
            System.out.println();
        }

        cizgiCek();

        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * *");
        }

        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }

    }

    private static void cizgiCek() {
        System.out.println("------------------------");
    }
}
