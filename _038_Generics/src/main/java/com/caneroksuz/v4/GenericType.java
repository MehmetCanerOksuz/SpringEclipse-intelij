package com.caneroksuz.v4;

public class GenericType <T>{

    private T benimNesnem;

    public GenericType(T benimNesnem) {
        this.benimNesnem = benimNesnem;
    }

    public void setBenimNesnem(T benimNesnem) {
        this.benimNesnem = benimNesnem;
    }

    public T getBenimNesnem() {
        return benimNesnem;
    }

    public void sinifinTipiniyazdir(){
        System.out.println("Sınıfın Tipi : " + benimNesnem.getClass().getName());
    }
}
