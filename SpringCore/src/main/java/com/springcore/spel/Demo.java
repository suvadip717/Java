package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{10>2?150:90}")
	private int x;
	@Value("#{23+5}")
	private int y;
	@Value("#{25>4}")
	private boolean z;
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double a;
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public boolean isZ() {
		return z;
	}
	public void setZ(boolean z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", e=" + e + "]";
	}
	
	
}
