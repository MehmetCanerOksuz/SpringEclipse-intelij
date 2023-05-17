package com.caneroksuz.ornekler;

public class IfSartDurumu {
    public static void main(String[] args) {

        int yasi = 18;
        boolean rapor = true;

        if (yasi>= 18 && rapor == true){
            System.out.println("Uygundur.");
        }else {
            System.out.println("Olmaz");
        }
    }
}
