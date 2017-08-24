package com.springinaction.chapter03.store;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("kwikemart.xml");
		
		KwikEMart km = (KwikEMart) context.getBean("kwikEMart");
		Customer c = new Customer();
		c.setName("Jeff");
		c.setBroke(false);
		
		try {
			
			Squishee s = km.buySquishee(c);
			
		} catch (KwikEMartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
