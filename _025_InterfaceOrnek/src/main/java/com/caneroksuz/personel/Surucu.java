package com.caneroksuz.personel;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Surucu extends Personel{

    private int ehliyetYili;

    @Override
    public String toString() {
        return "Personel{" +
                "adi='" + getAdi() + '\'' +
                ", soyadi='" + getSoyadi() + '\'' +
                ", kimlikNo='" + getKimlikNo() + '\'' +
                ", maas=" + getMaas() + '\'' +
                ", ehliyetYılı=" + ehliyetYili +
                '}';
    }
}
