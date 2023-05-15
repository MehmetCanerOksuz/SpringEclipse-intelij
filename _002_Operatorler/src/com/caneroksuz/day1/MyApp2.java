package com.caneroksuz.day1;

public class MyApp2 {
	
	static int sayi;
	
	public MyApp2() {
		sayi = 25;
		System.out.println("HAZIRLAYICI : " + sayi);
		
	}
	
	public static void main(String[] args) { //scope (kapsam)
		
		System.out.println("Main Metodu 1. DURUM : " + sayi);     // mainde olsaydı ilk değer vermek zorunlu. statiklerde kendisi veriyor..
		
		MyApp2 myObj = new MyApp2();
		
		System.out.println("Main Metodu 2. DURUM : " + sayi);
		
	}

}
