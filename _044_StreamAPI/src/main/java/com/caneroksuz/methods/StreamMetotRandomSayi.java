package com.caneroksuz.methods;

import java.util.Arrays;
import java.util.Random;

public class StreamMetotRandomSayi {

    public static void main(String[] args) {

        int [] myArray = new int[5];
       // Arrays.fill(myArray,2,4,25);
      //  System.out.println(Arrays.toString(myArray));

        Random random = new Random();
        int toplam = Arrays.stream(myArray).map(i ->(int) (random.nextInt(150))).sum();

        System.out.println(toplam);

        int[] dizi = {5,28,12,857,84,16};

        Arrays.parallelSort(dizi);  // küçükten büyüğe sıraladı..
        Arrays.stream(dizi).forEach(eleman -> System.out.print(eleman + " "));
    }
}
