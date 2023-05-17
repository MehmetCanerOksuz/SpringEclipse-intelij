package com.caneroksuz;

public class Araba {

    private Yakit yakit;
    private Ayna ayna;
    private Far far;
    public Araba() {
        yakit = new Yakit();
        ayna = new Ayna();
        far = new Far();
        System.out.println("Araba");
    }

    public void hareketeGec(){
        yakit.depo();
        System.out.println("Harekete geç");
    }



}
