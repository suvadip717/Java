package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student stu = cont.getBean("ob",Student.class);
		System.out.println(stu);
		System.out.println(stu.getAddress());
		System.out.println("-----------------------");
		System.out.println(stu.hashCode());
	
		Student stu2 = cont.getBean("ob",Student.class);
		System.out.println(stu2.hashCode());
		
		System.out.println("-----------------------");
		
		Teacher t1 = cont.getBean("teacher",Teacher.class);
		Teacher t2 = cont.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
