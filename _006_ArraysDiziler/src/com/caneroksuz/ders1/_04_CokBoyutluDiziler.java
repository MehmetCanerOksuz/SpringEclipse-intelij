package com.caneroksuz.ders1;

public class _04_CokBoyutluDiziler {
	
	public static void main(String[] args) {
		
		//int [] myArrays = new int [3];
		//int [] myArrays = {8, 44, 55};
		
//		myArrays[0] = 10; 
//		myArrays[1] = 11; 
//		myArrays[2] = 14; 
		
		
		int [][] myNumbers = new int [3] [5];
		
		myNumbers[0][0] = 10;
		myNumbers[0][1] = 15;
		myNumbers[0][2] = 10;
		myNumbers[0][3] = 10;
		myNumbers[0][4] = 10;
		
		myNumbers[1][0] = 10;
		myNumbers[1][1] = 10;
		myNumbers[1][2] = 10;
		myNumbers[1][3] = 10;
		myNumbers[1][4] = 10;
		
		myNumbers[2][0] = 10;
		myNumbers[2][1] = 10;
		myNumbers[2][2] = 10;
		myNumbers[2][3] = 10;
		myNumbers[2][4] = 10;
		
		int [][] myArray2 = {{10,20,30},{40,50,60},{70,80,90}};
		for (int i = 0; i < myArray2.length; i++) {
			for (int j = 0; j < myArray2[i].length; j++) {
				System.out.print((myArray2[i][j]) + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------Array3----------------------");
		
		int [][] myArray3 = {
				{10,20,30,55},
				{40,50,60,65},
				{70,80,90,75}
				};
		
		for (int i = 0; i < myArray3.length; i++) {
			for (int j = 0; j < myArray3[i].length; j++) {
				System.out.print((myArray3[i][j]) + " ");
			}
			System.out.println();
			
			
		}
		

		System.out.println("-----------Array4----------------------");
		
		int [][] myArray4 = {
				{10,20,30,55},
				{},
				{70,80,90,75,65},
				{50,70,90},
				};
		
		for (int i = 0; i < myArray4.length; i++) {
			for (int j = 0; j < myArray4[i].length; j++) {
				System.out.print((myArray4[i][j]) + " ");
			}
			System.out.println();
			
			
		}
		
		
	}

}
