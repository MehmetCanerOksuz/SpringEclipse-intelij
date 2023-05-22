package com.caneroksuz;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personel {

    private String adi;
    private String soyadi;
    private String unvani;

    public void hesapla(){
        System.out.println("Personel hesapla metodu");
    }

}
