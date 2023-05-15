/**
 *  Lisanslar buraya yazılıyor..
 */
package com.caneroksuz;

/**
 * @author Mimar Aslan
 * @author Mehmet Caner Öksüz
 * @since 2006
 * @version 1.0.0
 *
 */
public class _00_HelloMethods {

	/**
	 * 
	 */
	public _00_HelloMethods() {
		System.out.println("Hazırlayıcı - Yapıcı");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Ana merkex - main");
		_00_HelloMethods obj = new _00_HelloMethods();
		
		selamVer();
		obj.selamAl();
		
		cizgiCiz();
		//obj.toplamaYap();
		System.out.println(obj.toplamaYap()*2);
		
		cizgiCiz();
		
		int sonuc = obj.toplamaYapModern(5, 6);
		System.out.println(sonuc);
		cizgiCiz();
		System.out.println(obj.toplamaYapModern(45, 2));

	}
	
	

	private static void cizgiCiz() {
		System.out.println("------------------------");
		
	}

	private  int toplamaYap() {   // sonuc int olduğu için void yerine tip olarak int yazmamız gerekiyor.
		
		int sayi1 =10;
		int sayi2 =5;
		int sonuc = sayi1 + sayi2;
		return sonuc;
		
	}
	
	private  int toplamaYapModern(int sayi1, int sayi2) {   // sonuc int olduğu için void yerine tip olarak int yazmamız gerekiyor.
		
		return sayi1+sayi2;
		
	}
	

	public static void selamVer() {  // static ise doğrudan çağrılabilir.  (public => herkes kullanabilir..)
		System.out.println("Selamlar");
		
	}
	private void selamAl() {  // static olmadığı için obj. dan gittik..  (private => özel sadece o class kullanabilir.)
		System.out.println("Selamını aldım.");
		
	}

}
