package com.caneroksuz;

public class JavaDataType {  // Scope 1
	
	static int i = 10;
	int k = 25;

	public static void main(String[] args) { // Scope 2
		
		System.out.println(i);
		
		JavaDataType obj = new JavaDataType();
		System.out.println(obj.k);
		obj.k =28;
		System.out.println(obj.k);
		int a=obj.k;
		obj.k = 50;
		int b = 62;
		obj.k= b;
		b=65;
		System.out.println(obj.k);
	}

}
