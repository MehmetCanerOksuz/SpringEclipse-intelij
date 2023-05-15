package com.caneroksuz.day1;

import java.util.Iterator;

public class OperatorlerVeDonguler {
	
	public static void main(String[] args) {
	
		/*
		int i = 0;
		System.out.println(i);
		
		i = i+1;
		System.out.println(i);
		
		i += 1;
		System.out.println(i);
		
		i++;
		System.out.println(i);
		
		// DÖNGÜ ->  BAŞLANGIC / ARTIŞ MİKTARI / BİTİŞ SINIRI
		
		 */
		
		for(int i = 0 ; i<10 ; i++) {
			
			System.out.println(i);
		}
		
		System.out.println("----------------------------");
		
		for (int i = 0; i < 10; i += 2) {
			
			System.out.println(i);
		}
		
		int i = 20;

		for (i = 0; i < 11; i += 2) {
			
			System.out.println(i);
		}
		
		System.out.println(i);
	}

}
