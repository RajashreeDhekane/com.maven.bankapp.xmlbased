package com.maven.bankapp.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApplication {

	public static void main(String[] args) {
		
		// xml based configuration
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("manager");
		System.out.println(emp.work());

		
	}
		
}
