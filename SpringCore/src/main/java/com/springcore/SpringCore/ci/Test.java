package com.springcore.SpringCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/SpringCore/ci/config.xml");
		Person p = (Person)context.getBean("person");
		System.out.println(p);
		
		Adition ad = (Adition)context.getBean("add");
		ad.doSum();
	}

}
