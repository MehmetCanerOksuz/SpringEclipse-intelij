package com.caneroksuz;

public class _02_MethodCagirma {

	/*
	 * void selamVer(String adi){
	 *
	 * System.out.println("SELAM VER METODU : Sayın " + adi + " merhaba");
	 *
	 * }
	 */
	String selamVer(String adi) {
		return "SELAM VER METODU : Sayın " + adi + " merhaba";

	}

	void selamAl() {
		System.out.println("SELAM AL METODU");
	}

	public static void main(String[] args) {

		_02_MethodCagirma obj = new _02_MethodCagirma();
		/*obj.selamVer("Mehmet");
		*obj.selamAl();
		*obj.selamVer("Caner");
		*obj.selamVer("Öksüz");
		*/
		
		System.out.println(obj.selamVer("Caner"));
		String sonuc = obj.selamVer("Öksüz");
		System.out.println(sonuc + " Hos geldiniz..");
	}

}
