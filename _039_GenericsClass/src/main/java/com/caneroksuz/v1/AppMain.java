package com.caneroksuz.v1;

public class AppMain {
    public static void main(String[] args) {

        JenericSinifOrnegi<Integer>   obj1 = new JenericSinifOrnegi<>(25);
        JenericSinifOrnegi<Double>    obj2 = new JenericSinifOrnegi<>(34.2);
        JenericSinifOrnegi<Character> obj3 = new JenericSinifOrnegi<>('A');
        JenericSinifOrnegi<String>    obj4 = new JenericSinifOrnegi<>("Caner");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

    }
}