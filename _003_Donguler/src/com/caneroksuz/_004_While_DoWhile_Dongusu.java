package com.caneroksuz;

public class _004_While_DoWhile_Dongusu {
	
	public static void main(String[] args) {
		
		for(int j=0; j<10 ; j++) {
			System.out.println(j);
		}
		
		System.out.println("---------");
		
		int i = 0;
		
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("---------");
		
//		int a = 0;
//		while (true) {           // şart konulmadığı için sonsuz döngü
//			a++;
//			System.out.println(a);
//		}
		
		System.out.println("-------WHİLE DÖNGÜSÜ--------");
		int a =0;
		while (a<0) {
			System.out.println(a);
			a++;
		}
		
		System.out.println("-------DO WHİLE DÖNGÜSÜ--------");
		
		int b = 0;
		do {
			System.out.println(b);
			b++;
		}while(b<0);
		
	}

}
