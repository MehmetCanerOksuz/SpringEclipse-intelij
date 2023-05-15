package com.caneroksuz;

public class _004_Switch {
	
	public static void main(String[] args) {
		
		//SINAVLARDA A B C D E
		
		char harf = 'A';
		
		switch (harf) {
		case 'A','a':  //DURUM
			System.out.println("Seçilen : " + harf);
			break;
		case 'B':  //DURUM
			System.out.println("Seçilen : " + harf);
			break;
		case 'C':  //DURUM
			System.out.println("Seçilen : " + harf);
			break;
		case 'D':  //DURUM
			System.out.println("Seçilen : " + harf);
			break;
		case 'E':  //DURUM
			System.out.println("Seçilen : " + harf);
			break;
			
		default:
			System.out.println("Seçiminiz " +harf+ " uygun değil.");
			break;
		}
		
		System.out.println("--------------------");
//
//		int haftaninGunu = 7;
//
//		if (haftaninGunu == 1) {
//			System.out.println("Pazartesi");
//
//		} else if (haftaninGunu == 2) {
//			System.out.println("Salı");
//
//		} else if (haftaninGunu == 3) {
//			System.out.println("Çarşamba");
//
//		} else if (haftaninGunu == 4) {
//			System.out.println("Perşembe");
//
//		} else if (haftaninGunu == 5) {
//			System.out.println("Cuma");
//
//		} else if (haftaninGunu == 6) {
//			System.out.println("Cumartesi");
//
//		} else if (haftaninGunu == 7) {
//			System.out.println("Pazar");
//
//		}
		int haftaninGunu = 5;
		
		switch (haftaninGunu) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salı");
			break;
		case 3:
			System.out.println("Çarşamba");
			break;
		case 4:
			System.out.println("Perşembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;

			
		default:
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz.");
			break;
		}
		
		System.out.println("--------------------");
		
		String haftaninGunuDegeri = null;
		haftaninGunu =4;
		switch (haftaninGunu) {
		case 1:
			haftaninGunuDegeri = "Pazartesi";
			break;
		case 2:
			haftaninGunuDegeri = "Salı";
			break;
		case 3:
			haftaninGunuDegeri = "Çarşamba";
			break;
		case 4:
			haftaninGunuDegeri = "Perşembe";
			break;
		case 5:
			haftaninGunuDegeri = "Cuma";
			break;
		case 6:
			haftaninGunuDegeri = "Cumartesi";
			break;
		case 7:
			haftaninGunuDegeri = "Pazar";
			break;

			
		default:
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz.");
		
			break;
		}
		
		
		if(haftaninGunuDegeri !=null) {
			System.out.println(haftaninGunuDegeri);
		}
		
		System.out.println("--------------------");
		
		int gunSirasi = 3;
		switch (gunSirasi) {
		case 1: System.out.println("Pazartesi");
		case 2: System.out.println("Salı");
		case 3: System.out.println("Çarşamba");
		case 4: System.out.println("Perşembe");
		case 5: System.out.println("Cuma");
			System.out.println("Hafta içi");
		
			break;
		case 6:
		case 7:
			System.out.println("Hafta sonu");
			break;
			
		default:
			System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz.");
			break;
		}
	}

}
