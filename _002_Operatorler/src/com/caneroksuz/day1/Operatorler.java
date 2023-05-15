package com.caneroksuz.day1;

public class Operatorler {
	
	/*
	 aritmetik opr.
	 ilişkisel opr.
	 bitwise opr.
	 logic (mantıksal) opr.
	 atama opr.
	 
	  
	 */
	
	public static void main(String[] args) {
		
		/*
		int sayi1 = 10;
		int sayi2 = 3;
		*/
		
		int sayi1 = 10 , sayi2 = 3;
		
		System.out.println(sayi1 + sayi2);
		System.out.println(sayi1 - sayi2);
		System.out.println(sayi1 * sayi2);
		System.out.println(sayi1 / sayi2);
		System.out.println(sayi1 % sayi2);
		System.out.println(sayi1++);
		System.out.println(sayi1--);
		
		System.out.println(++sayi2);
		System.out.println(--sayi2);
		
		
		System.out.println("-----------------------------------------");
		
		System.out.println("İlişkisel operatorler");
		
		System.out.println(sayi1 == sayi2);
		System.out.println(sayi2 == 3);
		System.out.println(sayi2 > sayi1);
		System.out.println(sayi2 >= 25);
		System.out.println(sayi2 < sayi1);
		System.out.println(sayi2 <= 25);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("bitwise opr.");
		
		System.out.println(sayi1 & sayi2);
		System.out.println(sayi1 | sayi2);
		System.out.println(sayi1 ^ sayi2);
		System.out.println(sayi1 >> sayi2);
		System.out.println(sayi1 << sayi2);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("logic (mantıksal) opr.");
		
		//System.out.println(sayi1==2 && sayi2==3);
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a && b);  // çarpma 0
		System.out.println(a || b);  // toplama 1 
		
		System.out.println("-----------------------------------------");
		
		System.out.println("atama opr");
		
		sayi1 = 20;
		// int sonuc =0;
		// sonuc = sayi1 + 5;
		
		//sayi1 = sayi1 + 5;
		//System.out.println(sayi1);
		
		sayi1 += 5;
		System.out.println(sayi1);
		
		System.out.println(sayi1-=3);
		System.out.println(sayi1/=2);
		System.out.println(sayi1*=5);
		
	}

}
