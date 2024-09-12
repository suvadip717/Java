package com.springcore.SpringCore.ci;

public class Person {
	private int personId;
	private String name;
	private Certificate certi;
	
	public Person(int personId, String name, Certificate certif) {
		this.personId = personId;
		this.name = name;
		this.certi = certif;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.personId +" : "+this.name+" : "+ certi.getName()+" : "+certi.getDuration();
	}
}
