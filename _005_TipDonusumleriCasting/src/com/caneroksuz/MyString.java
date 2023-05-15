package com.caneroksuz;

public class MyString {
	
	public static void main(String[] args) {
		
		for (char i = 'a' ; i <= 'z' ; i++) {
			System.out.print(i);
		}
		
		System.out.println("\n-------------------");
		
		String alfabe ="abcdefghijklmnopqrstuvwxyz";
		System.out.println(alfabe.toUpperCase());
		System.out.println(alfabe.length());
		
		
		String duzYazi = """ 
				afasgsdagdsagsad
				sagdsdagsdgfdhgfh
				fhdfghfdhfghfghtwetwerwer
				yreyryrhfhhfhfdhfdghsldkjjfdsflsdjlkajdslkfja """;
		
		System.out.println(duzYazi);
		
		System.out.println("-------------------");
		
		System.out.println(alfabe.charAt(2));
				
		
	}

}
