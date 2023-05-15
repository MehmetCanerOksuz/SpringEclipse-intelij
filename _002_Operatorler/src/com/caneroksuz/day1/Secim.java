package com.caneroksuz.day1;

public class Secim {
	
	public static void main(String[] args) {
		
		int secmenYasi = 15;
		int yasSiniri = 18;
		
		System.out.println(secmenYasi >= yasSiniri);
		
		
		// Karar kontrol mekanizması
		
		if(secmenYasi >= yasSiniri) {
			
			System.out.println("EVET oy kullanabilirsiniz.");
			
		}else {
			
			System.out.println("HAYIR oy kullanamazsınız!");
			System.out.println(yasSiniri - secmenYasi +" yıl sonra kullanabilirsiniz.");
			
			System.out.println((secmenYasi >= yasSiniri) ? "EVET" : "HAYIR");
			
			System.out.println((secmenYasi >= yasSiniri)
					? 
							"EVET oy kullanabilirsiniz." 
							: 
								"HAYIR oy kullanamazsınız! \n"+
								(yasSiniri - secmenYasi) +" yıl sonra kullanabilirsiniz.");
			
		}
		
	}

}
