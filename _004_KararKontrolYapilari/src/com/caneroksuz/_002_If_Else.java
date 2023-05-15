package com.caneroksuz;

public class _002_If_Else {

	public static void main(String[] args) {

//		if (1<25) {
//			System.out.println("EVET");
//			
//		} else {
//			System.out.println("HAYIR");
//
//		}
		int a = 5;

		if (a < 25) {
			System.out.println("EVET");

		} else {
			System.out.println("HAYIR");

		}

		System.out.println("--------------------");

		int x = 25;

		if (x == 10) {

			System.out.println("Evet 10'a eşit");

		} else if (x == 20) {
			System.out.println("Evet 20'e eşit");

		} else {
			System.out.println("10'a ve 20'e eşit değil.");
		}

		System.out.println("--------------------");

		int haftaninGunu = 7;

		if (haftaninGunu == 1) {
			System.out.println("Pazartesi");

		} else if (haftaninGunu == 2) {
			System.out.println("Salı");

		} else if (haftaninGunu == 3) {
			System.out.println("Çarşamba");

		} else if (haftaninGunu == 4) {
			System.out.println("Perşembe");

		} else if (haftaninGunu == 5) {
			System.out.println("Cuma");

		} else if (haftaninGunu == 6) {
			System.out.println("Cumartesi");

		} else if (haftaninGunu == 7) {
			System.out.println("Pazar");

		}
		
		

	}

}
