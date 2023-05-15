package com.caneroksuz.ders2;

import java.util.Random;
import java.util.Scanner;

public class _01_DenemeOdev {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random randomNumber = new Random();
		System.out.println("Lütfen dizi için tablo sayısını giriniz");
		int tablo =scanner.nextInt();
		System.out.println("Lütfen dizi için satır sayısını giriniz");
		int satir =scanner.nextInt();
		System.out.println("Lütfen dizi için kolon sayısını giriniz");
		int kolon =scanner.nextInt();
		
		int [] [] [] yourArray3d = new int [tablo][satir][kolon];
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
