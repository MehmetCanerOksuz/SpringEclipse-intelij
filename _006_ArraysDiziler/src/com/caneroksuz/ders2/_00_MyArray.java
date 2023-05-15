package com.caneroksuz.ders2;

import java.util.Iterator;
import java.util.Random;

public class _00_MyArray {
	
	public static void main(String[] args) {
		
		int [] [] myArr = new int [3] [3];
		myArr [0] [0] = 123;
		myArr [2] [1] = 33;
		// myArr [4] [4] = 55; // ArrayIndexOutOfBoundsException:
		
		System.out.println("---------------------");
		
		int satir = 4;
		int kolon = 4;
		
		int[] [] yourArray = new int [satir] [kolon] ;
		
		Random randomNumber = new Random();
		
		for (int i = 0; i < satir; i++) {
			
			for (int j = 0; j < kolon; j++) {
				yourArray[i][j]= randomNumber.nextInt(50);
			}
			
		}
		
		for (int i = 0; i < satir; i++) {
			
			for (int j = 0; j < kolon; j++) {
				System.out.print(yourArray[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("---------- 3D Array -----------");
		
		int [] [] [] yourArray3d = new int [6][3][3];
		yourArray3d[0][0][0] = 88;		
		yourArray3d[0][0][1] = 88;		
		yourArray3d[0][0][2] = 88;		

		for (int i = 0; i < yourArray3d.length; i++) {
			for (int j = 0; j < yourArray3d[i].length; j++) {
				for (int k = 0; k < yourArray3d[i][j].length; k++) {
					yourArray3d[i][j][k]= randomNumber.nextInt(2000);
				}
			}
		}
		
		for (int i = 0; i < yourArray3d.length; i++) {
			System.out.println("\nTablo : " + (i+1));
			for (int j = 0; j < yourArray3d[i].length; j++) {
				for (int k = 0; k < yourArray3d[i][j].length; k++) {
					System.out.print(yourArray3d[i][j][k] + "\t");
				}
				System.out.println();
			}
			
		}
		
		
	}

}
