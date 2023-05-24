package com.caneroksuz.okul;

import com.caneroksuz.utils.Branslar;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ogretmen {

    Branslar brans;

    String ad;
    String soyad;
    String telefon;
    String adres;
}
