package com.springcore.lifecycle;

public class Samosha {
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting property");
		this.price = price;
	}

	public Samosha() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Somosha = "+this.price+" ]";
	}
	
	public void hey() {
		System.out.println("Inside init method");
	}
	
	public void bye() {
		System.out.println("Inside destroy method");
	}
}
