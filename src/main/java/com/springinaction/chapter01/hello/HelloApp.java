package com.springinaction.chapter01.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
//		BeanFactory factory = new XmlBeanFactory(new FileInputStream("hello.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");
		GreetingService greetingService = (GreetingService) context.getBean("greetingService");
		
		greetingService.sayGreeting();
		
	}

}
