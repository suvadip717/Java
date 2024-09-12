package com.springcore.SpringCore.ref;

public class A {
	private int x;
	private B ob;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A[x="+x+", ob="+ ob +"]";
	}
}
