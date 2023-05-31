package com.caneroksuz.lambda04;

public class CokluParametreli {

    public static void main(String[] args) {

        Bolme bolme = new Bolme() {
            @Override
            public int getBolmeYap(int a, int b) {
                if (b==0) return 0;
                return a/b;
            }
        };

        System.out.println(bolme.getBolmeYap(10,5));

        Bolme bolme2 = (a, b) -> {

            if (b==0) return 0;
            return a/b;
        };
    }
}
