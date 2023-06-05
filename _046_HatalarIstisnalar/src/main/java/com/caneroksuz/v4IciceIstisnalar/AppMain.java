package com.caneroksuz.v4IciceIstisnalar;

public class AppMain {

    public static void main(String[] args) {

        int myArray [] = new int[6];

        try {

            myArray[2] =10;
            myArray[4] =5;
            myArray[0] =myArray[2] / myArray[4];


            try {

                myArray[13] = 200;

            }catch (Exception e){
                System.out.println("İçteki catch : " + e);
            }finally {
                System.out.println("İçteki finally");
            }

        }catch (Exception e){
            System.out.println("Dıştaki catch : " + e);
        }finally {
            System.out.println("Dıştaki finally");
        }
    }
}
