package com.caneroksuz;

public class _002_ForEach {
	
	public static void main(String[] args) {
		
		//Array dizi
		
		String [] ogrenciler = {"Ahmet", "Mehmet", "Ali", "Veli", "Zeynep", "Ayşe"};
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		System.out.println("-----------------");
		
		int numbers [] = {1,2,3,4,5};
		
		
		for(int number : numbers) {
			
			System.out.print(number*3 + " ");
		}
		
	}
	
	

}
