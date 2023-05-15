package com.caneroksuz.day1;

public class Ev {
	
	static String sifre ="123";
	
	public Ev() {
		
		sifre = "456";
		System.out.println("HAZIRLAYICI - YAPICI : " + sifre);
	}
	
	public static void main(String[] args) {
		
		
		Ev anahtarNesnesi = new Ev();
		
		System.out.println("main scope : " + anahtarNesnesi.sifre);
		
		sifre = "44";
		
		System.out.println("main scope : " + anahtarNesnesi.sifre);
	}

}
