package com.caneroksuz.okul;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sinif {

    int siraSayi;
    boolean prjeksiyon;
    boolean akilliTahta;
    String subeNo;
    List<Ogrenci> ogrenciListesi;
    //List<Ogretmen> ogretmenListesi;

}
