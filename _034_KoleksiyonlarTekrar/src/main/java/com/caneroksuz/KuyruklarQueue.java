package com.caneroksuz;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class KuyruklarQueue {

    public static void main(String[] args) {

        Queue myPriorityQueueList1 = new PriorityQueue();
        myPriorityQueueList1.add("Aysu");
        myPriorityQueueList1.add("Serkan");
        myPriorityQueueList1.add("gizem");
        myPriorityQueueList1.add("Ali");
        myPriorityQueueList1.add("Ali");
        myPriorityQueueList1.offer("Engin");
        //myPriorityQueueList1.add(null); null girilmiyor
        //myPriorityQueueList1.add(null); null girilmiyor
        //myPriorityQueueList1.add(null); null girilmiyor
        System.out.println(myPriorityQueueList1);

        System.out.println(myPriorityQueueList1.peek());
        myPriorityQueueList1.clear();
       // myPriorityQueueList1.remove();   // boş kuyrukta hata veriyor.. poll() hata vermiyor..
        myPriorityQueueList1.poll();
        System.out.println(myPriorityQueueList1);


        Queue myArrayDequeList1 = new ArrayDeque();
        myArrayDequeList1.add("Aysu");
        myArrayDequeList1.add("Serkan");
        myArrayDequeList1.add("gizem");
        myArrayDequeList1.add("Ali");
        myArrayDequeList1.add("Ali");
        myArrayDequeList1.offer("Engin");
        //myArrayDequeList1.add(null); null girilmiyor
        //myArrayDequeList1.add(null); null girilmiyor
        //myArrayDequeList1.add(null); null girilmiyor
        System.out.println(myArrayDequeList1);

        System.out.println(myArrayDequeList1.peek());
        myArrayDequeList1.clear();
        // myArrayDequeList1.remove();   // boş kuyrukta hata veriyor.. poll() hata vermiyor..
        myArrayDequeList1.poll();
        System.out.println(myArrayDequeList1);
    }
}
