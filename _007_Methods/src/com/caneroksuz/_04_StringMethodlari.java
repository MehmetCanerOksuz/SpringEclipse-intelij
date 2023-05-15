package com.caneroksuz;

public class _04_StringMethodlari {

	public static void main(String[] args) {
		
		String adi1 = "Mehmet Caner";
		
		System.out.println(adi1.length());
		
		String adi2 = "Burak Delice";
		
		if(adi1 == adi2) {
			System.out.println("Aynı");
		}else {
			System.out.println("Değil");
		}
		
		if(adi1.equals(adi2)) {
			System.out.println("Aynı");
		}else {
			System.out.println("Değil");
		}
		
		String str1 = "Adana";
		String str2 = "Merkez";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		
		String ogrenci = "Serkan";
		char [] karakterler =ogrenci.toCharArray();
		System.out.println(karakterler);
		
		System.out.println(karakterler[1]);
		
		for (int i = 0; i < karakterler.length; i++) {
			System.out.println(karakterler[i]);
		}
		
		System.out.println("-----------------------");
		
		String personel = "Aysu Çağışlar";
		System.out.print(personel.charAt(0));
		System.out.print(personel.charAt(1));
		System.out.print("*");
		System.out.print("*");
		
		System.out.println("\n-----------------------");
		
		System.out.println(personel.contains("su"));   // içinde su var mı??
		
		System.out.println("-----------------");
		
		String [] sonDurum = personel.split("su ");    // su dan sonrayı ayrıştırmak için aşağıda for kullandık.
		
		for(String item : sonDurum) {
			System.out.println(item);
		}
		
		System.out.println("-----------------");
		
		System.out.println(personel.replace('u','T')); 	
		
	}

}
