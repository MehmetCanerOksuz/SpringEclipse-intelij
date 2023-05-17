package com.caneroksuz.ornekler;

public class SwitchCaseDurum {

    public static void main(String[] args) {
        int sayi1 = 5;

        switch (sayi1){
            case 1:
                System.out.println( "Pazarkesi");
                break;
            case 2:
                System.out.println( "Salı");
                break;
            case 3:
                System.out.println( "Çarşamba");
                break;
            case 4:
                System.out.println( "Perşembe");
                break;
            case 5:
                System.out.println( "Cuma");
                break;
            case 6:
                System.out.println( "Cumartesi");
                break;
            case 7:
                System.out.println( "Pazar");
                break;
            default:
                System.out.println("OLMAZ");

        }
    }
}
