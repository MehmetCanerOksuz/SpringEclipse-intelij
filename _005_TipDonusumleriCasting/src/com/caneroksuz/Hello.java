package com.caneroksuz;

public class Hello implements IHello, IDeneme{
	
	public static void main(String[] args) {
		
		Hello obj = new Hello();
		obj.selamVer();
		
		obj.kural3("Caner Oksuz");
		
	}

	@Override
	public void selamVer() {
		System.out.println("SELAMLAR GÜZEL İNSANLAR");
		
	}

	@Override
	public void kural3(String mesaj) {
		System.out.println("Kural 3: " + mesaj);
		
	}

	@Override
	public void adiniziYaz() {
		// TODO Auto-generated method stub
		
	}

}
