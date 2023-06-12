package com.caneroksuz.ornek4;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppMainThrow {

    public static void main(String[] args) {

        System.out.println("Kümesteki yumurta sayisi");

        int kumesId = 10;
/*
        if (kumesId < 0 || kumesId > 100){
            System.out.println("Geçersiz Id girildi.");
        }else {
            System.out.println("Girilen Id : " + kumesId + "     Yumurta Sayisi : " + yumurtalariSay(kumesId));
        }
*/

        System.out.println("---------Unchecked----------------------------");
        try {
            System.out.println("Girilen Id : " + kumesId + "     Yumurta Sayisi : " + yumurtalariSay(kumesId));
        }catch (Exception e){
            System.err.println("Istisna... : " + e);
        }

        System.out.println("---------Checked----------------------------");

        try {
            System.out.println("Girilen Id : " + kumesId + "     Yumurta Sayisi : " + yumurtalariSay2(kumesId));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static int yumurtalariSay(int kumesId) {
        if (kumesId < 0 || kumesId > 100){

            throw new ArithmeticException( "Geçersiz ıd değeri girildi!!");
        }else {
            return 50;
        }

    }

    private static int yumurtalariSay2(int kumesId) throws Exception{
        if (kumesId < 0 || kumesId > 100){

            throw new ArithmeticException( "Geçersiz ıd değeri girildi!!");
        }else {
            return 50;
        }

    }
}
