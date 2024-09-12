package com.springcore.javaconfig;


//@Component
public class Student {
	private Somosha somosa;
	
	public Somosha getSomosa() {
		return somosa;
	}

	public void setSomosa(Somosha somosa) {
		this.somosa = somosa;
	}
	

	public Student(Somosha somosa) {
		super();
		this.somosa = somosa;
	}

	public void study() {
		this.somosa.display();
		System.out.println("Student reading book");
	}
}
