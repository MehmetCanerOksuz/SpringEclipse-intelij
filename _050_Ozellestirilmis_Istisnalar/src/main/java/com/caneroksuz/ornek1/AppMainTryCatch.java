package com.caneroksuz.ornek1;

import java.util.Scanner;

public class AppMainTryCatch {

    public static void main(String[] args) {

        int sayi1 = 0, sayi2 =0;
        int toplam = 0;
        int bolme =0;

        Scanner scanner = new Scanner(System.in);

        boolean exceptionFlag = false;
        do{
            try {
                System.out.println("1.sayıyı giriniz");
                sayi1 = scanner.nextInt();

                System.out.println("2.sayıyı giriniz");
                sayi2 = scanner.nextInt();

                toplam = sayi1+sayi2;
                System.out.println("TOPLAM -->>" + toplam);

                bolme = sayi1/sayi2;
                System.out.println("BÖLME -->>" + bolme);

                exceptionFlag = false;
            }catch (Exception e){
                System.out.println("Istisna : " + e.toString());
                exceptionFlag=true;
            }finally {
                System.out.println("---------------------------");
            }
        }while (exceptionFlag);




    }
}
