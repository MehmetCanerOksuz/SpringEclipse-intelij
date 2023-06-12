package com.caneroksuz.ornek3;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppMainMultiCatch {

    public static void main(String[] args) {

        int sayi1 = 0, sayi2 =0;
        int toplam = 0;
        int bolme =0;



        boolean exceptionFlag = false;
        do{
            Scanner scanner = new Scanner(System.in);
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
            }catch (InputMismatchException e){
                System.out.println("Istisna : " + e.toString());
                exceptionFlag=true;
            }catch (NoSuchElementException e){
                System.out.println("Istisna : " + e.toString());
                exceptionFlag=true;
            }catch (ArithmeticException e){
                System.out.println("Istisna : " + e.toString());
                exceptionFlag=true;
            }catch (RuntimeException e){
                System.out.println("Istisna : " + e.toString());
                exceptionFlag=true;
            }catch (Exception e){
                System.out.println("Istisna : " + e.toString());
                exceptionFlag=true;
            }finally {
                System.out.println("---------------------------");
                scanner.nextLine();
            }
        }while (exceptionFlag);




    }
}
