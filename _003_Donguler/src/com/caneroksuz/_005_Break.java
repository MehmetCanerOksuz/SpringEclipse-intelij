package com.caneroksuz;

public class _005_Break {
	
	public static void main(String[] args) {
		
		System.out.println("-------------FOR BREAK------------");
		for (int i = 0; i < 25; i++) {
			
			
			//20 sayısını bul ve çık
			if(i==20) {
				System.out.println("20 Sayısını buldum.");
				break;
			}else {
				System.out.println("DEGİL: " + i);
			}
			
		}
		
		System.out.println("-------------WHİLE BREAK------------");
		int j= 0;
		while (j<25) {
			
			
			if(j==20) {
				System.out.println("20 Sayısını buldum.");
				break;
			}else {
				System.out.println("DEGİL: " +j);
				
			}
			j++;
		}
	}

}
