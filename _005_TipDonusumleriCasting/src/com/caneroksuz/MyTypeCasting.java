package com.caneroksuz;

public class MyTypeCasting {
	
	public static void main(String[] args) {
		
		int intYasi = 18;
		
		double doubleYasi = intYasi;
		
		System.out.println(intYasi);
		System.out.println(doubleYasi);
		
		float floatYasi = intYasi;
		System.out.println(intYasi);
		System.out.println(floatYasi);
		
		byte byteYasi = (byte) intYasi;
		System.out.println(intYasi);
		System.out.println(byteYasi);
		
		System.out.println("-------------------");
		
		int a = 2_147_483_647;
		int b = 2;
		int c = a + b;
		System.out.println(c);
		
		System.out.println("-------------------");
		
		byte x = 1;
		byte y = 2;
		byte z = (byte) (x+y);
		System.out.println(z);
		
		System.out.println("-------------------");
		
		short x1 = 1;
		short y1 = 2;
		short z1 = (short) (x1+y1);
		int   z2 = x1 + y1;
		System.out.println(z);
		
		System.out.println("-------------------");
		
	}

}
