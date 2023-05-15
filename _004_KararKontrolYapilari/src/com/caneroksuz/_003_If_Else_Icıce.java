package com.caneroksuz;


public class _003_If_Else_Icıce {
	
	public static void main(String[] args) {
		
		//Ehliyet alma -- sağlıklı olacak ve 18 den büyük olacak.
		
		boolean saglikRaporu = true;
		int yasi = 25;
		
		if(saglikRaporu ==true && yasi >= 18) {
			System.out.println("EVET uygundur");
		}else {
			System.out.println("Hayır uygun değildir.");
		}
		
		System.out.println("--------------");
		
		saglikRaporu = false;
		yasi = 25;
		
		if(saglikRaporu == true && yasi >=18) {
			System.out.println("EVET uygundur");
		}else {
			
			if(saglikRaporu == false) {
				System.out.println("Sağlık raporunuz geçersiz");
			}
			
			if( yasi<18) {
				System.out.println("Yaşınız henüz 18 değil");
			}
			System.out.println("HAYIR ehliyet almaya uygun değilsiniz");
		}
		
		System.out.println("-----------------");
		
		saglikRaporu = true;
		yasi = 16;
		
		if(saglikRaporu ==true && yasi>=18) {
			System.out.println("EVET ehliyet alabilirsiniz.");
		}else {
			if(saglikRaporu==false) {
				System.out.println("Sağlık raporunuz geçersizdir.");
			}else {
				System.out.println("Sağlık raporunuz geçerlidir.");
			}
			
			if(yasi<18) {
				System.out.println("Yasınız 18 den küçüktür.");
			}else {
				System.out.println("Yaşınız ehliyet almaya uygundur.");
			}
			
			System.out.println("HAYIR  ehliyet almaya uygun değilsiniz.");
		}
		
	}
	

}
