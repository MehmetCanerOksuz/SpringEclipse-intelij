package com.caneroksuz;

public class _006_Continue {
	
	public static void main(String[] args) {
		
		
		//continue DONGUNUN BASINA GİT  (Döngüyü devam ettir.)
		for(int i = 0; i < 25; i++) {
			// 20'yi bul ve dongunun basına git.
			
			if(i==20) {
				System.out.println("20yi buldum");
				continue;
			}else{
				System.out.println("DEĞİL : " + i);
			}
			
		}
		//break DONGUNUN SONUNA GİDER
	}

}
