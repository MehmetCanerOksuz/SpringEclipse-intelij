package com.caneroksuz.okul;

import com.caneroksuz.utils.Dersler;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ders {

    //field
    Dersler ad;
    Ogretmen ogretmen;

    private int not1;
    private int not2;

    //TODO Notlar listeye çevrilecek.
    // List<Integer> notlar;

    public int ortalama(){
        return (not1+not2)/2;
    }
}
