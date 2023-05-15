package com.caneroksuz.ders1;

public class _01_DizilerVeriTipleri {
	
	public static void main(String[] args) {
		
		System.out.println("v1.0--------------------------");
		//short myArray[] = null;
		short myArray[] = new short[4];
		
		myArray [0] = 10;
		myArray [1] = 20;
		myArray [2] = 25;
		myArray [3] = 30;
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		
		System.out.println("v2.0--------------------------");
		
		short myArray2[] = {10, 20, 25, 30};
		
		
		for (int i =0; i< myArray2.length; i++) {
			System.out.println(myArray2[i]);
			
		}
	}

}
