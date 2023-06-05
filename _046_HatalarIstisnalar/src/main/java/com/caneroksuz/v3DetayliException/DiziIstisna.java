package com.caneroksuz.v3DetayliException;

public class DiziIstisna {

    public static void main(String[] args) {
        int myArray [] = new int[5];


        myArray[2] =27;
        myArray[4] =11;

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);


        try {
            myArray[125] =88;
            System.out.println(myArray[125]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            myArray[0] = 18;
            System.out.println(myArray[0]);
        }finally {
            myArray[1] = 95;
            System.out.println(myArray[1]);
        }

    }
}
