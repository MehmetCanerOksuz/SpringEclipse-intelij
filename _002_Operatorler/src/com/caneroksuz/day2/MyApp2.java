package com.caneroksuz.day2;

import java.util.Scanner;

public class MyApp2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lütfen bir sayı giriniz : ");
		int i = sc.nextInt();
		System.out.println("SONUC = " +i*5);
		
		System.out.print("Lütfen yaşınızı giriniz : ");
		int secmenYasi = sc.nextInt() , yasSiniri = 18;
		
		System.out.println(secmenYasi>= yasSiniri ? "EVET oy kullanabilirsiniz." : "Hayır oy kullanamazsınız.");
		
		System.out.println("-------------------");		
		
		System.out.print("Lütfen virgüllü bir sayı giriniz : ");
		float myValue = sc.nextFloat();
		System.out.println("SONUC = " +myValue*5);
		
	}

}
