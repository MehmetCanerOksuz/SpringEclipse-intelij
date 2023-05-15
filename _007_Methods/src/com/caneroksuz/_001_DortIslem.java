package com.caneroksuz;

public class _001_DortIslem {
	
	public static void main(String[] args) {
		
		_001_DortIslem obj = new _001_DortIslem();
		
		obj.toplama(10, 5);
		System.out.println(obj.toplama(10, 5));
		
		obj.cizgiCiz();
		
		int sonuc2 =obj.cikarma(25,8);
		System.out.println(sonuc2);
		obj.cizgiCiz();
		double sonuc3 = obj.bolme(5,2);
		System.out.println(sonuc3);
		obj.cizgiCiz();
		int sonuc4 = obj.carpma(8,3);
		System.out.println(sonuc4);
	}

	private int carpma(int i, int j) {
		return i*j;
	}

	private double bolme(int i, int j) {
		return (double) i/j;
	}

	private int cikarma(int i, int j) {
		return i-j;
	}

	private void cizgiCiz() {
		System.out.println("---------------------------");
		
	}

	private int toplama(int i, int j) {
		return i + j;
		
	}

}
