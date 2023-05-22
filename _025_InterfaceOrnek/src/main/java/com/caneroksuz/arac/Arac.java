package com.caneroksuz.arac;

import com.caneroksuz.personel.Surucu;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Arac {

    private String plakaNo;
    private int model;
    private int tekerSayisi;
    private int koltukSayisi;
    private Surucu surucu;

    void hareketEt(){
        System.out.println("Araç. hareketEt");
    }

    @Override
    public String toString() {
        return "Arac{" +
                "plakaNo='" + plakaNo + '\'' +
                ", model=" + model +
                ", tekerSayisi=" + tekerSayisi +
                ", koltukSayisi=" + koltukSayisi +
                ", surucu=" + surucu +
                '}';
    }
}
