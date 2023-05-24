package com.caneroksuz.okul;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogrenci {

    String ad;
    String soyad;
    String adres;
    String okulNo;
    List<Ders> dersListesi;


}
