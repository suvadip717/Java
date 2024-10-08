package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		Samosha samosha = (Samosha)context.getBean("s1");
		System.out.println(samosha);
		
		context.registerShutdownHook();
		
		Pepsi pepsi = (Pepsi)context.getBean("p1");
		System.out.println(pepsi);
	}

}
