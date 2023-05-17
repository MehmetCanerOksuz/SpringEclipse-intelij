package com.caneroksuz;

public class Dikdortgen {

    private int uzunKenar;
    private int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    public int getHesaplaAlan(){
        return uzunKenar*this.kisaKenar;
    }

    public int getHesaplaCevre(){
        return 2*(uzunKenar+kisaKenar);
    }
}
