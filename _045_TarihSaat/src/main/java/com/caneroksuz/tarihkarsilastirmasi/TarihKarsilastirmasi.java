package com.caneroksuz.tarihkarsilastirmasi;

import java.util.Date;

public class TarihKarsilastirmasi {

    public static void main(String[] args) {

        Date date1 = new Date(2000,1,1);
        Date date2 = new Date(2000,1,1);
        System.out.println(date1.compareTo(date2));
    }
}
