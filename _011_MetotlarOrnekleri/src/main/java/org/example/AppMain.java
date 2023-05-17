package org.example;

import java.util.Scanner;

public class AppMain {

    Scanner scanner = new Scanner(System.in);
    int a = 5;

    public static void main(String[] args) {

        AppMain obj = new AppMain();
        int b = 8;
        b = obj.scanner.nextInt();
        System.out.println(b+obj.a);

    }
}