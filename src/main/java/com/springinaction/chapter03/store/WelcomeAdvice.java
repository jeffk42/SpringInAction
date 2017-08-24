package com.springinaction.chapter03.store;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class WelcomeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		Customer customer = (Customer) args[0];
		
		System.out.println("Hello " + customer.getName() + ", how are you doing?");

	}

}
