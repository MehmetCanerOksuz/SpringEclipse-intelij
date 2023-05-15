package com.caneroksuz.ders1;

import java.util.Scanner;

public class _02_CalismaZamaniDiziBoyutu {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int size, sum =0;
		System.out.print("Lütfen dizinin boyutunu belirleyiniz : ");
		size = scanner.nextInt();
		
		short myArray [] = new short [size];
		
		System.out.println("Dizinin boyutu " + size + " olarak girildi.");
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(i+". index için değer giriniz : ");
			myArray[i] = scanner.nextShort();
		}
		
		System.out.println("----------------------");
		for (int i = 0; i < myArray.length; i++) {
			//sum+= myArray[i];
			System.out.println(myArray[i]);
		}
		
		for(short item : myArray) {
			sum = sum + item;
		}
		System.out.println("toplam : " +  sum);
		
		
		
	}

}
