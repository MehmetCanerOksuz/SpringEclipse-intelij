package com.caneroksuz.ders1;

public class _03_DiziVirgulluSayilar {
	
	public static void main(String[] args) {
		
		double [] myCarPrices = {1.9, 2.4, 6.8 };
		double myCarPricesTotal=0;
		
		for (int i = 0; i < myCarPrices.length; i++) {
			System.out.println(myCarPrices[i]);
			myCarPricesTotal+=myCarPrices[i];
		}
		System.out.println("Toplam : " + myCarPricesTotal);
		
		System.out.println("-----------------");
		
		myCarPrices[0] = 100.3;
		
		for (int i = 0; i < myCarPrices.length; i++) {
			System.out.println(myCarPrices[i]);
			myCarPricesTotal+=myCarPrices[i];
		}
		System.out.println("Toplam : " + myCarPricesTotal);
		
		System.out.println("-------ForEach----------");
		
		for (double myCarPrice : myCarPrices) {
			System.out.println(myCarPrice);
			
		}
	}

}
