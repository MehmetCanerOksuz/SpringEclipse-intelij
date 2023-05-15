package com.caneroksuz.day1;

public class OperatorOrnekler {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a * b);
		
		System.out.println(a % b);
		int c = 4;
		
		System.out.println( a<b && c>a );
		
		// Ternary - Uclu Operator
		
		System.out.println((a<b) ? "EVET" : "HAYIR");
		
	}

}
