package com.springcore.SpringCore.ci;

public class Certificate {
	private String name;
	private String Duration;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public Certificate(String name, String dura) {
		super();
		this.name = name;
		this.Duration = dura;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " : "+this.Duration;
	}
}
