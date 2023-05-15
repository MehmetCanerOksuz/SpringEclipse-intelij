package com.caneroksuz.ders1;

public class _00_MerhabaDiziler {

	public static void main(String[] args) {
	
		int sayi1 = 10;
		int sayi2 = 14;
		int sayi3 = 15;
		int sayi4 = 22;
		
		System.out.println(sayi1 + " " + sayi2 + " " + sayi3 + " " + sayi4);
		
		//Array
		//int sayi[] = null; //NullPointerException
		int sayi[] = new int [4];
		sayi[0] = 10;
		sayi[1] = 14;
		sayi[2] = 15;
		sayi[3] = 22;
		//System.out.println(sayi[4]);  //ArrayIndexOutOfBoundsException 
		
		System.out.println(sayi[0] + " " +sayi[1]
					+ " "+ sayi[2] + " " +sayi[3]);
		
		System.out.println("---------------------FOR-------------");
		System.out.println("Dizinin sınırı : " + sayi.length);
		for (int i = 0; i < sayi.length; i++) {
			System.out.println(sayi[i]);
		}
//		DENEME..
//		int sayi10[]=sayi;
//		sayi10[0] =4;
//		System.out.println(sayi[0]);
		
		
	}

}
