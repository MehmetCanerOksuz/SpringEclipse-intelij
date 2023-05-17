package org.example.erisimler;

class A {
    public void goster(){
        System.out.println("Ben A sınıfındaki (public) göster metoduyum.");
    }

}
class B {
    void goster(){
        System.out.println("Ben B sınıfındaki (default) göster metoduyum.");
    }
}

class C {
    private void goster(){
        System.out.println("Ben B sınıfındaki (default) göster metoduyum.");
    }
}

public class Temel {

    //Erişim Belirteçleri
    // public   ==> farketmez her yerden alıyor
    //               (default)   ==> aynı pakette
    // protected   ==> miras
    // private   ==> sadece o sınıfa özel


    public static void main(String[] args) {

        A obj = new A();
        obj.goster();

        B obj2 = new B();
        obj2.goster();

        C obj3 = new C();
        // private olduğu için kullanamadık..
    }
}
