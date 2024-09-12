package com.springcore.SpringCore.ci;

public class Adition {
	private int a;
	private int b;
	
	public Adition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor : double, double");
	}
	
	public Adition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int, int");
	}
	
	public Adition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String, String");
	}
	
	public void doSum() {
		System.out.println("Value of A is: "+this.a);
		System.out.println("Value of B is: "+this.b);
		System.out.println("The sum is = "+(this.a+this.b));
	}
}
