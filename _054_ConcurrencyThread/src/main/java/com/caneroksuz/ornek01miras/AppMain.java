package com.caneroksuz.ornek01miras;

class BasitSinif extends Thread{

    @Override
    public void run() {
        System.out.println("Thread çalışıyor");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}

public class AppMain{



    public static void main(String[] args) {

        BasitSinif basitSinif = new BasitSinif();
        System.out.println("Thread başlıyor");

        basitSinif.start();


    }
}