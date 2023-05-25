package com.caneroksuz;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class KisitliKuyruk {

    public static void main(String[] args) {

        Queue <String> kisitliKuyruk = new ArrayBlockingQueue<>(3);
        kisitliKuyruk.add("Ali");
        kisitliKuyruk.add("Aysu");
        kisitliKuyruk.add("Aminenur");
        kisitliKuyruk.offer("Serkan");
        kisitliKuyruk.offer("Orhun");

        System.out.println(kisitliKuyruk);

        System.out.println(kisitliKuyruk.poll());   // poll() en baştakini hem buluyor hem çıkarıyor
        System.out.println(kisitliKuyruk);


    }
}
