package com.caneroksuz;

public class SinirlandirilmisTipOrnek<GelenTip1 extends Number>{


    GelenTip1 bilgi;

    public SinirlandirilmisTipOrnek(GelenTip1 bilgi) {
        this.bilgi = bilgi;
    }

    void yazdir(){
        System.out.println(bilgi.getClass().getName());
    }
}
