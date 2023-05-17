package com.caneroksuz.veteriner;

public abstract class EvcilHayvan {

    abstract void hayvanSesVer();       //abstract ==>> gövdeye yani " {  } " gerek kalmıyor..
                                        // abstract metot olması için class ın abstract olması gerekir..

    abstract void yazdir();

    void raporAl(){
        System.out.println("RAPOR METODU");     //abstract olmadığı için diğerleri zorunlu değil.
                                                // gövdesi olduğu için abstract yapamıyoruz..
    }

    boolean chipiKontrolEt (String chipDurumu){
        return true;
    }




}
